package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.live.uikit.setting.LiveTooltipTouchOutsideDismissSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785290UrH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC785300UrI enumC785300UrI) {
        C1119760fFG c1119760fFG;
        C785330UrL c785330UrL;
        if (Intrinsics.LJFF(C785350UrN.LIZIZ, enumC785300UrI.getKey()) && (c1119760fFG = C785350UrN.LIZ) != null) {
            long j = c1119760fFG.LIZ;
            if (j == j && (c785330UrL = c1119760fFG.LJFF) != null) {
                c785330UrL.LL = 4;
                c785330UrL.dismiss();
                C785350UrN.LIZ = null;
                C785350UrN.LIZIZ = null;
            }
        }
    }

    public static void LIZIZ(final C785260UrE c785260UrE, final EnumC785300UrI enumC785300UrI, DataChannel dataChannel) {
        final C0IR5 c0ir5;
        View view;
        Activity activityLIZ;
        Window window;
        View decorView;
        C785330UrL c785330UrLLIZIZ;
        String string;
        C19EG c19egLJ;
        Context context = c785260UrE.LIZ;
        if ((context == null || (c19egLJ = C500260Jjc.LJ(context)) == null || !c19egLJ.isFinishing()) && C500260Jjc.LJJJJIZL(c785260UrE.LIZIZ)) {
            if (dataChannel != null) {
                c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class);
            } else {
                c0ir5 = null;
            }
            c785260UrE.LJIIJJI = LiveTooltipTouchOutsideDismissSetting.INSTANCE.enable();
            c785260UrE.LJIIL = true;
            final InterfaceC254900yh interfaceC254900yh = c785260UrE.LJIIZILJ;
            c785260UrE.LJIIZILJ = new InterfaceC254900yh() { // from class: X.0UrG
                @Override // X.InterfaceC254900yh
                public final void x1(int i) {
                    String str;
                    String string2;
                    String str2 = "";
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 8) {
                                    str = "";
                                } else {
                                    str = "click_guidetip";
                                }
                            } else {
                                str = "click_icon";
                            }
                        } else {
                            str = "click_blankarea";
                        }
                    } else {
                        str = "countdown_end";
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_enhance_guidetip_duration");
                    CharSequence charSequence = c785260UrE.LJIILJJIL;
                    if (charSequence != null && (string2 = charSequence.toString()) != null) {
                        str2 = string2;
                    }
                    c474500IjALIZ.LJJII(str2, "content");
                    c474500IjALIZ.LJIJJ(c0ir5);
                    c474500IjALIZ.LJJII(C0UX8.EVENT_PAGE_TRY_MODE_BROADCAST.page, "event_page");
                    c474500IjALIZ.LJJII(enumC785300UrI.getPosition(), "position");
                    c474500IjALIZ.LJJII(String.valueOf(SystemClock.elapsedRealtime() - c785260UrE.LJJIJ), "duration");
                    c474500IjALIZ.LJJII(str, "click_type");
                    c474500IjALIZ.LJJIJL();
                    InterfaceC254900yh interfaceC254900yh2 = interfaceC254900yh;
                    if (interfaceC254900yh2 != null) {
                        interfaceC254900yh2.x1(i);
                    }
                }
            };
            String key = enumC785300UrI.getKey();
            if (c785260UrE.LIZ != null && (view = c785260UrE.LIZIZ) != null && c785260UrE.LIZJ != null) {
                View rootView = view.getRootView();
                ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
                if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
                    Context context2 = view.getContext();
                    if ((context2 instanceof ContextWrapper) && (activityLIZ = C1388190mED.LIZ(context2)) != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        rootView = decorView;
                    }
                }
                boolean zLIZ = C454590Hs9.LIZ(c785260UrE.LIZ);
                Rect rect = new Rect();
                rootView.getWindowVisibleDisplayFrame(rect);
                int[] iArr = new int[2];
                c785260UrE.LIZIZ.getLocationOnScreen(iArr);
                int i = iArr[0];
                Rect rect2 = new Rect(i, iArr[1], c785260UrE.LIZIZ.getWidth() + i, c785260UrE.LIZIZ.getHeight() + iArr[1]);
                if (c785260UrE.LJJIIZ) {
                    C0GU6 c0gu6 = new C0GU6(c785260UrE.LIZ);
                    c0gu6.setAnchorBounds(rect2);
                    c0gu6.setWindowVisibleRect(rect);
                    Rect rect3 = new Rect();
                    rect3.set(rect);
                    ViewParent parent = c0gu6.LLJIJIL.getParent();
                    if (parent instanceof ViewGroup) {
                        C786410Ut5.LJJJLZIJ(c0gu6.LLJIJIL, (ViewGroup) parent);
                    }
                    c0gu6.addView(c0gu6.LLJIJIL);
                    c0gu6.requestLayout();
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(rect3.width(), Integer.MIN_VALUE);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(rect3.height(), Integer.MIN_VALUE);
                    c0gu6.setLayoutDirection(zLIZ ? 1 : 0);
                    c0gu6.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    c0gu6.requestLayout();
                    C785330UrL c785330UrL = new C785330UrL(c0gu6);
                    c785330UrL.setWidth(-1);
                    c785330UrL.setHeight(-1);
                    c785330UrL.setClippingEnabled(false);
                    c785330UrL.setOutsideTouchable(true);
                    c785330UrL.setFocusable(false);
                    c785330UrL.showAtLocation(rootView, 80, 0, 0);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJI(c785330UrL);
                    C787990Uvd.LIZ.getClass();
                    C994003uc.LIZ();
                    c785260UrE.LIZIZ = c0gu6.getAnchorView();
                    c785330UrLLIZIZ = C785350UrN.LIZIZ(c785260UrE, rect, zLIZ, c0gu6.getAnchorRect(), c0gu6.getAnchorPos(), c785330UrL);
                } else {
                    c785330UrLLIZIZ = C785350UrN.LIZIZ(c785260UrE, rect, zLIZ, rect2, iArr, null);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                C1119760fFG c1119760fFG = new C1119760fFG();
                c1119760fFG.LIZ = jUptimeMillis;
                c1119760fFG.LIZLLL = c785260UrE;
                c1119760fFG.LJFF = c785330UrLLIZIZ;
                C785350UrN.LIZ = c1119760fFG;
                C785350UrN.LIZIZ = key;
                if (jUptimeMillis > 0) {
                    c785260UrE.LJJIJ = SystemClock.elapsedRealtime();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_enhance_guidetip_show");
                    CharSequence charSequence = c785260UrE.LJIILJJIL;
                    if (charSequence == null || (string = charSequence.toString()) == null) {
                        string = "";
                    }
                    c474500IjALIZ.LJJII(string, "content");
                    c474500IjALIZ.LJIJJ(c0ir5);
                    c474500IjALIZ.LJJII(C0UX8.EVENT_PAGE_TRY_MODE_BROADCAST.page, "event_page");
                    c474500IjALIZ.LJJII(enumC785300UrI.getPosition(), "position");
                    c474500IjALIZ.LIZ();
                }
            }
        }
    }
}
