package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS256S0300000_12;

/* JADX INFO: renamed from: X.0av3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953470av3 {
    public static final C953470av3 LIZ = new C953470av3();

    public static void LIZ(View view) {
        View view2;
        LiveIconView liveIconView;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.neq);
        if (viewGroup2 != null && (view2 = (View) C09RB.LJIIL(new C09RD(viewGroup2))) != null) {
            View view3 = null;
            if ((view2 instanceof FrameLayout) && (viewGroup = (ViewGroup) view2) != null) {
                view3 = (View) C09RB.LJIIL(new C09RD(viewGroup));
            }
            if ((view3 instanceof LiveIconView) && (liveIconView = (LiveIconView) view3) != null) {
                liveIconView.setIconBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey_, liveIconView.getContext()));
                liveIconView.setIconBackgroundAppearance(R.style.j9);
                liveIconView.setIconWidthRatio(0.8f);
                liveIconView.setIconHeightRatio(0.8f);
            }
        }
    }

    public static n LJ(String str) {
        try {
            return (n) C19748512Ol.LIZIZ.LJII(str, n.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(webcast.data.multi_guest_play.NoticeboardTemplate r6, java.lang.String r7, java.lang.Long r8) {
        /*
            r5 = 0
            if (r8 == 0) goto L19
            long r3 = r8.longValue()
            if (r6 == 0) goto L18
            long r1 = r6.noticeboardTemplateId
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L18
        Lf:
            java.lang.String r0 = r6.mediaNodeId
        L11:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L18
            r5 = 1
        L18:
            return r5
        L19:
            if (r6 != 0) goto Lf
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C953470av3.LIZIZ(webcast.data.multi_guest_play.NoticeboardTemplate, java.lang.String, java.lang.Long):boolean");
    }

    public static long LIZJ(DataChannel dataChannel, LiveSheetFragment liveSheetFragment, String str) {
        if (dataChannel != null) {
            try {
                FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
                if (fragmentManager != null) {
                    return C19322110iZ.LJFF(fragmentManager, liveSheetFragment, str, null, 0);
                }
                return 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJ("MultiGuestDecorationUtils", th.getMessage());
                return 0L;
            }
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, android.widget.PopupWindow] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.view.View r20, X.C953550avB r21, X.InterfaceC953490av5 r22, X.EnumC952890au7 r23) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C953470av3.LIZLLL(android.view.View, X.0avB, X.0av5, X.0au7):void");
    }

    public static void LJFF(RecyclerView recyclerView, List list, Function1 function1, boolean z) {
        C951190arN c951190arN;
        if (recyclerView == null) {
            return;
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if ((adapter instanceof C951190arN) && (c951190arN = (C951190arN) adapter) != null) {
            if (z) {
                c951190arN.LLLIILIL(C13LP.LL(list, MultiGuestNoticeboardEditorSetting.INSTANCE.getTemplateQuickSelectMaxCount()), new AwS256S0300000_12(recyclerView, list, function1, 6), AFwS203S0000000_15.get$arr$(202));
            } else {
                c951190arN.LLLII(C13LP.LL(list, MultiGuestNoticeboardEditorSetting.INSTANCE.getTemplateQuickSelectMaxCount()));
            }
        }
    }
}
