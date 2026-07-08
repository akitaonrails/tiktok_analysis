package X;

import android.graphics.Color;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0JS0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JS0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        C19EG activity = subscriptionPrivilegeDetailFragment.getActivity();
        if (activity != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(activity, UriProtector.parse(LiveSubscriptionFAQSetting.INSTANCE.getValue().getUserFaqPopup("privilege_page")).buildUpon().appendQueryParameter("height", String.valueOf(C497740JfY.LJJI((int) (C497740JfY.LJIILLIIL() * 0.7f)))).build().toString());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_faq_entrance_click");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII("privilege_page", "show_entrance");
            c474500IjALIZ.LIZ();
        }
    }

    public static int LIZJ(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static String LIZLLL(String str) {
        if (str.length() != 9) {
            return str;
        }
        try {
            String strSubstring = str.substring(7, 9);
            String strSubstring2 = str.substring(1, 7);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(strSubstring);
            sbLIZ.append(strSubstring2);
            str = C2188811AlT.LIZIZ(sbLIZ);
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(androidx.fragment.app.FragmentManager r17, X.C0JS1 r18, com.bytedance.android.live.base.model.user.User r19, int r20, kotlin.jvm.functions.Function0 r21) {
        /*
            r4 = r18
            java.lang.Object r1 = r4.LIZLLL
            boolean r0 = r1 instanceof com.bytedance.android.live.base.model.user.User
            if (r0 == 0) goto L76
            com.bytedance.android.live.base.model.user.User r1 = (com.bytedance.android.live.base.model.user.User) r1
            if (r1 == 0) goto L77
            long r8 = r1.getId()
        L10:
            if (r1 == 0) goto L18
            java.lang.String r10 = r1.getSecUid()
            if (r10 != 0) goto L1c
        L18:
            java.lang.String r10 = r19.getSecUid()
        L1c:
            long r1 = r19.getId()
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L74
            r6 = 1
        L27:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostSubscription> r0 = com.bytedance.android.livesdkapi.host.IHostSubscription.class
            X.006A r5 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostSubscription r5 = (com.bytedance.android.livesdkapi.host.IHostSubscription) r5
            r7 = 0
            java.lang.String r11 = r4.LIZJ
            com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams r15 = r4.LJII
            if (r15 == 0) goto L3a
            java.lang.String r12 = r15.enterMethod
            if (r12 != 0) goto L3c
        L3a:
            java.lang.String r12 = ""
        L3c:
            java.lang.Boolean r13 = r4.LJ
            X.0JS2 r14 = new X.0JS2
            r14.<init>()
            r16 = r21
            androidx.fragment.app.Fragment r1 = r5.wt1(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16)
            r5 = r17
            if (r5 == 0) goto L73
            X.0mIc r4 = new X.0mIc
            r4.<init>(r3, r3)
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r4.LIZ
            r0.LLJJIJI = r1
            r0.LLJJIJIIJIL = r2
            r4.LJIIIIZZ(r2)
            r0 = r20
            float r1 = (float) r0
            r0 = 1060823368(0x3f3ae148, float:0.73)
            float r1 = r1 * r0
            int r0 = X.C814420VxA.LIZIZ(r1)
            com.bytedance.tux.sheet.sheet.TuxSheet r1 = r4.LIZ
            r1.LLJJL = r0
            r1.LLJLL = r2
            r1.LLJLILLLLZIIL = r3
            java.lang.String r0 = "SUB_VIDEO_CONTENT_LIST_TAG"
            r1.show(r5, r0)
        L73:
            return
        L74:
            r6 = 0
            goto L27
        L76:
            r1 = 0
        L77:
            long r8 = r19.getId()
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JS0.LIZ(androidx.fragment.app.FragmentManager, X.0JS1, com.bytedance.android.live.base.model.user.User, int, kotlin.jvm.functions.Function0):void");
    }
}
