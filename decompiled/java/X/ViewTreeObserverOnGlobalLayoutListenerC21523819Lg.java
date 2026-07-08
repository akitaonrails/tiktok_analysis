package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.19Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC21523819Lg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC21523819Lg viewTreeObserverOnGlobalLayoutListenerC21523819Lg) {
        if (((C1118760fDe) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).getHeight() > ((int) C497740JfY.LIZIZ(42.0f))) {
            ((C1118760fDe) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).getLayoutParams().height = (int) C497740JfY.LIZIZ(42.0f);
            ((C1118760fDe) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).getLayoutParams().width = (int) C497740JfY.LIZIZ(42.0f);
            ((C1118760fDe) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).requestLayout();
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC21523819Lg viewTreeObserverOnGlobalLayoutListenerC21523819Lg) {
        int measuredHeight;
        int measuredHeight2;
        ExpandedTitleModule expandedTitleModule = (ExpandedTitleModule) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0;
        expandedTitleModule.LLLI = expandedTitleModule.LLILZ.getMeasuredHeight();
        ExpandedTitleModule expandedTitleModule2 = (ExpandedTitleModule) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0;
        expandedTitleModule2.LLILZ.getMeasuredWidth();
        expandedTitleModule2.getClass();
        View view = ((ExpandedTitleModule) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LLLJL;
        int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = 0;
        if (view != null) {
            measuredHeight = view.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        ExpandedTitleModule expandedTitleModule3 = (ExpandedTitleModule) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0;
        int i = expandedTitleModule3.LLLI;
        View view2 = expandedTitleModule3.LLLL;
        if (view2 != null) {
            measuredHeight2 = view2.getMeasuredHeight();
        } else {
            measuredHeight2 = 0;
        }
        int i2 = measuredHeight2 + measuredHeight;
        if (Build.VERSION.SDK_INT >= 35) {
            iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(((ExpandedTitleModule) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LLILZ.getContext());
        }
        expandedTitleModule3.LLLI = i - (i2 + iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight);
        ExpandedTitleModule expandedTitleModule4 = (ExpandedTitleModule) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0;
        expandedTitleModule4.LLLFF += measuredHeight;
        C786410Ut5.C3(expandedTitleModule4.LLILZ.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC21523819Lg);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC21523819Lg viewTreeObserverOnGlobalLayoutListenerC21523819Lg) {
        float textSize;
        ViewTreeObserver viewTreeObserver;
        C197039127h c197039127h = ((C21372018kQ) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LLILZIL;
        if (c197039127h != null) {
            textSize = c197039127h.getTextSize();
        } else {
            textSize = 0.0f;
        }
        C197039127h c197039127h2 = ((C21372018kQ) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LLILZLL;
        if (c197039127h2 != null) {
            c197039127h2.setTextSize(0, textSize);
        }
        C197039127h c197039127h3 = ((C21372018kQ) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LLILZIL;
        if (c197039127h3 != null && (viewTreeObserver = c197039127h3.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC21523819Lg);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC21523819Lg, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC21523819Lg viewTreeObserverOnGlobalLayoutListenerC21523819Lg) {
        boolean z;
        boolean z2;
        EnumC993320bxK enumC993320bxK;
        EnumC992690bwJ enumC992690bwJ;
        Rect rect = new Rect();
        ((C18W7) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LJIILIIL.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        C18W7 c18w7 = (C18W7) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0;
        int i = c18w7.LJIILJJIL - iHeight;
        if (c18w7.LIZIZ.invoke().booleanValue()) {
            C18W7 c18w72 = (C18W7) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0;
            if (c18w72.LJI) {
                boolean z3 = true;
                if (i > ((double) c18w72.LJIILJJIL) * 0.3d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != c18w72.LJIILL) {
                    c18w72.LJIILL = z;
                    if (z) {
                        if (SystemClock.uptimeMillis() < c18w72.LJ && c18w72.LIZLLL == EnumC994400bz4.LL) {
                            enumC992690bwJ = EnumC992690bwJ.PROGRAMMATIC;
                        } else {
                            enumC992690bwJ = EnumC992690bwJ.SYSTEM_OR_UNKNOWN;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("detect keyboard status: ");
                        sbLIZ.append(((C18W7) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LJIILL);
                        sbLIZ.append(", ");
                        sbLIZ.append(enumC992690bwJ);
                        C21290818Tq.LIZJ("KeyboardHelper", C2188811AlT.LIZIZ(sbLIZ));
                        ((C18W7) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LIZJ.LIZIZ();
                        return;
                    }
                    if (SystemClock.uptimeMillis() < c18w72.LJ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    View viewInvoke = c18w72.LIZ.invoke();
                    if (viewInvoke == null || !viewInvoke.hasFocus()) {
                        z3 = false;
                    }
                    if (z2 && c18w72.LIZLLL == EnumC994400bz4.LLILLJJLI) {
                        enumC993320bxK = EnumC993320bxK.PROGRAMMATIC;
                    } else if (!c18w72.LJI || !c18w72.LJII || (c18w72.LIZLLL == EnumC994400bz4.LL && z2)) {
                        enumC993320bxK = EnumC993320bxK.CONTEXT_LOST;
                    } else if (z3) {
                        enumC993320bxK = EnumC993320bxK.USER;
                    } else {
                        enumC993320bxK = EnumC993320bxK.UNKNOWN;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("detect keyboard status: ");
                    sbLIZ2.append(((C18W7) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LJIILL);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(enumC993320bxK);
                    C21290818Tq.LIZJ("KeyboardHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    ((C18W7) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LIZJ.LIZ(enumC993320bxK);
                    return;
                }
                return;
            }
        }
        C21290818Tq.LIZJ("KeyboardHelper", "detect keyboard disabled");
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC21523819Lg viewTreeObserverOnGlobalLayoutListenerC21523819Lg) {
        C786410Ut5.C3(((C21272418Mo) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LIZ().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC21523819Lg);
        C21272418Mo c21272418Mo = (C21272418Mo) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0;
        c21272418Mo.getClass();
        C1735020vFc c1735020vFc = C1735020vFc.LIZ;
        RecyclerView recyclerViewLIZ = c21272418Mo.LIZ();
        AwS681S0100000_32 awS681S0100000_32 = new AwS681S0100000_32(c21272418Mo, 37);
        c1735020vFc.getClass();
        C1735020vFc.LIZIZ(recyclerViewLIZ, awS681S0100000_32);
        ((C21272418Mo) viewTreeObserverOnGlobalLayoutListenerC21523819Lg.l0).LIZLLL();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC21523819Lg(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
