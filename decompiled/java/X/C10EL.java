package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.10EL, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10EL implements C10E1 {
    public static final C10EL LIZ = C10EM.LIZ;

    @Override // X.C10E1
    public final boolean LIZJ() {
        C10EK.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push_post_friends_");
        sbLIZ.append(C10EK.LJ());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getBoolean("key_post_push_switch", true);
    }

    @Override // X.C10E1
    public final boolean LJIIIZ() {
        C10EK.LIZ.getClass();
        return C10EK.LJII("live_push");
    }

    @Override // X.C10E1
    public final boolean LJIIL() {
        C10EK.LIZ.getClass();
        return C10EK.LJII("follow_new_video_push");
    }

    @Override // X.C10E1
    public final boolean LJIILIIL() {
        C10EK.LIZ.getClass();
        return C10EK.LJI();
    }

    @Override // X.C10E1
    public final boolean getPushLiveState() {
        C10EK.LIZ.getClass();
        return C10EK.LJFF();
    }

    @Override // X.C10E1
    public final void LIZ(boolean z) {
        C10EK.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push_live_");
        sbLIZ.append(C10EK.LJ());
        KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 0).storeBoolean("key_mt_live_push_switch", z);
    }

    @Override // X.C10E1
    public final void LIZLLL(Context context) {
        C10EK.LIZ.getClass();
        C10EK.LJIIIIZZ(context, "follow_new_video_push");
    }

    @Override // X.C10E1
    public final void LJFF(Context context) {
        C10EK.LIZ.getClass();
        C10EK.LJIIIIZZ(context, "live_push");
    }

    @Override // X.C10E1
    public final void LJI(Context context) {
        C10EK.LIZ.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131845684);
        c1397580mTM.LIZIZ(context.getString(2131845682));
        C985403tE.LIZ(c1397580mTM, AFwS271S0000000_28.get$arr$(268));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // X.C10E1
    public final void LJII(boolean z) {
        C10EK.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push_post_");
        sbLIZ.append(C10EK.LJ());
        Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).storeBoolean("key_post_push_switch", z);
    }

    @Override // X.C10E1
    public final void LJIIJ(Context context) {
        C10EK.LIZ.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131845684);
        c1397580mTM.LIZIZ(context.getString(2131845683));
        C985403tE.LIZ(c1397580mTM, AFwS271S0000000_28.get$arr$(269));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // X.C10E1
    public final C11NZ<C1641660sp2<NotificationLiveStatus>> LJIIJJI(String str) {
        C1643800ssU.LIZJ.getClass();
        return C11T2.LIZ(C1643800ssU.LJ).LIZ(str, new InterfaceC19505211Sw[0]);
    }

    @Override // X.C10E1
    public final void LJIILJJIL(String str) {
        NotificationLiveStatus notificationLiveStatus = new NotificationLiveStatus(new NotificationLiveStatus.DataBean(2), 0);
        C1643800ssU.LIZJ.getClass();
        C1643800ssU.LJ.put(str, notificationLiveStatus);
    }

    @Override // X.C10E1
    public final void LJIILL(C10ET c10et) {
        C10EK.LIZ.getClass();
        if (C10EK.LIZJ == null) {
            C11RK<C10ET> c11rk = new C11RK<>();
            C10EK.LIZJ = c11rk;
            c11rk.LJLIL(400L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.10ES
                /* JADX WARN: Removed duplicated region for block: B:103:0x01b6 A[PHI: r2 r3 r4 r5 r8
                  0x01b6: PHI (r2v13 java.lang.String) = (r2v16 java.lang.String), (r2v17 java.lang.String) binds: [B:99:0x0196, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]
                  0x01b6: PHI (r3v8 java.lang.String) = (r3v11 java.lang.String), (r3v12 java.lang.String) binds: [B:99:0x0196, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]
                  0x01b6: PHI (r4v18 X.10Jj) = (r4v21 X.10Jj), (r4v22 X.10Jj) binds: [B:99:0x0196, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]
                  0x01b6: PHI (r5v6 com.ss.android.ugc.aweme.profile.model.User) = (r5v9 com.ss.android.ugc.aweme.profile.model.User), (r5v10 com.ss.android.ugc.aweme.profile.model.User) binds: [B:99:0x0196, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]
                  0x01b6: PHI (r8v7 android.app.Activity) = (r8v10 android.app.Activity), (r8v11 android.app.Activity) binds: [B:99:0x0196, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:115:0x01d5 A[PHI: r4
                  0x01d5: PHI (r4v11 java.lang.String) = (r4v10 java.lang.String), (r4v15 java.lang.String) binds: [B:112:0x01d0, B:114:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:127:0x01fb  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x023d A[PHI: r4
                  0x023d: PHI (r4v14 java.lang.String) = (r4v11 java.lang.String), (r4v15 java.lang.String) binds: [B:116:0x01d7, B:114:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[PHI: r4
                  0x0027: PHI (r4v33 java.lang.String) = (r4v0 java.lang.String), (r4v34 java.lang.String) binds: [B:12:0x0025, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:150:0x02db A[PHI: r4 r5
                  0x02db: PHI (r4v3 java.lang.String) = (r4v29 java.lang.String), (r4v30 java.lang.String) binds: [B:31:0x0083, B:29:0x0080] A[DONT_GENERATE, DONT_INLINE]
                  0x02db: PHI (r5v1 android.app.Activity) = (r5v19 android.app.Activity), (r5v20 android.app.Activity) binds: [B:31:0x0083, B:29:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[PHI: r4
                  0x0031: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v33 java.lang.String), (r4v33 java.lang.String) binds: [B:12:0x0025, B:14:0x0029, B:16:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0034 A[PHI: r3 r4
                  0x0034: PHI (r3v18 java.lang.String) = (r3v0 java.lang.String), (r3v19 java.lang.String) binds: [B:18:0x0032, B:16:0x002f] A[DONT_GENERATE, DONT_INLINE]
                  0x0034: PHI (r4v32 java.lang.String) = (r4v1 java.lang.String), (r4v33 java.lang.String) binds: [B:18:0x0032, B:16:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[PHI: r3 r4
                  0x0038: PHI (r3v17 java.lang.String) = (r3v0 java.lang.String), (r3v18 java.lang.String) binds: [B:18:0x0032, B:20:0x0036] A[DONT_GENERATE, DONT_INLINE]
                  0x0038: PHI (r4v31 java.lang.String) = (r4v1 java.lang.String), (r4v32 java.lang.String) binds: [B:18:0x0032, B:20:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00c9 A[PHI: r2 r4
                  0x00c9: PHI (r2v4 java.lang.String) = (r2v6 java.lang.String), (r2v7 java.lang.String) binds: [B:48:0x00be, B:46:0x00bb] A[DONT_GENERATE, DONT_INLINE]
                  0x00c9: PHI (r4v6 android.app.Activity) = (r4v8 android.app.Activity), (r4v9 android.app.Activity) binds: [B:48:0x00be, B:46:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00e1 A[PHI: r8
                  0x00e1: PHI (r8v15 java.lang.String) = (r8v14 java.lang.String), (r8v21 java.lang.String) binds: [B:58:0x00dc, B:60:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:63:0x00e5 A[PHI: r8
                  0x00e5: PHI (r8v20 java.lang.String) = (r8v15 java.lang.String), (r8v21 java.lang.String) binds: [B:62:0x00e3, B:60:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00e8 A[PHI: r5 r8
                  0x00e8: PHI (r5v17 java.lang.String) = (r5v13 java.lang.String), (r5v18 java.lang.String) binds: [B:62:0x00e3, B:64:0x00e6] A[DONT_GENERATE, DONT_INLINE]
                  0x00e8: PHI (r8v19 java.lang.String) = (r8v15 java.lang.String), (r8v20 java.lang.String) binds: [B:62:0x00e3, B:64:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00ec A[PHI: r5 r8
                  0x00ec: PHI (r5v14 java.lang.String) = (r5v17 java.lang.String), (r5v18 java.lang.String) binds: [B:66:0x00ea, B:64:0x00e6] A[DONT_GENERATE, DONT_INLINE]
                  0x00ec: PHI (r8v16 java.lang.String) = (r8v19 java.lang.String), (r8v20 java.lang.String) binds: [B:66:0x00ea, B:64:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0136 A[PHI: r4 r5 r8
                  0x0136: PHI (r4v27 java.lang.String) = (r4v25 java.lang.String), (r4v28 java.lang.String) binds: [B:68:0x00ed, B:66:0x00ea] A[DONT_GENERATE, DONT_INLINE]
                  0x0136: PHI (r5v16 java.lang.String) = (r5v14 java.lang.String), (r5v17 java.lang.String) binds: [B:68:0x00ed, B:66:0x00ea] A[DONT_GENERATE, DONT_INLINE]
                  0x0136: PHI (r8v18 java.lang.String) = (r8v16 java.lang.String), (r8v19 java.lang.String) binds: [B:68:0x00ed, B:66:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0170  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x018d A[PHI: r3 r4 r5 r8
                  0x018d: PHI (r3v7 java.lang.String) = (r3v13 java.lang.String), (r3v14 java.lang.String) binds: [B:93:0x018b, B:91:0x0188] A[DONT_GENERATE, DONT_INLINE]
                  0x018d: PHI (r4v17 X.10Jj) = (r4v23 X.10Jj), (r4v24 X.10Jj) binds: [B:93:0x018b, B:91:0x0188] A[DONT_GENERATE, DONT_INLINE]
                  0x018d: PHI (r5v5 com.ss.android.ugc.aweme.profile.model.User) = (r5v11 com.ss.android.ugc.aweme.profile.model.User), (r5v12 com.ss.android.ugc.aweme.profile.model.User) binds: [B:93:0x018b, B:91:0x0188] A[DONT_GENERATE, DONT_INLINE]
                  0x018d: PHI (r8v6 android.app.Activity) = (r8v12 android.app.Activity), (r8v13 android.app.Activity) binds: [B:93:0x018b, B:91:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:96:0x0191 A[PHI: r3 r4 r5 r8
                  0x0191: PHI (r3v12 java.lang.String) = (r3v7 java.lang.String), (r3v13 java.lang.String) binds: [B:95:0x018f, B:93:0x018b] A[DONT_GENERATE, DONT_INLINE]
                  0x0191: PHI (r4v22 X.10Jj) = (r4v17 X.10Jj), (r4v23 X.10Jj) binds: [B:95:0x018f, B:93:0x018b] A[DONT_GENERATE, DONT_INLINE]
                  0x0191: PHI (r5v10 com.ss.android.ugc.aweme.profile.model.User) = (r5v5 com.ss.android.ugc.aweme.profile.model.User), (r5v11 com.ss.android.ugc.aweme.profile.model.User) binds: [B:95:0x018f, B:93:0x018b] A[DONT_GENERATE, DONT_INLINE]
                  0x0191: PHI (r8v11 android.app.Activity) = (r8v6 android.app.Activity), (r8v12 android.app.Activity) binds: [B:95:0x018f, B:93:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0194 A[PHI: r2 r3 r4 r5 r8
                  0x0194: PHI (r2v16 java.lang.String) = (r2v12 java.lang.String), (r2v17 java.lang.String) binds: [B:95:0x018f, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]
                  0x0194: PHI (r3v11 java.lang.String) = (r3v7 java.lang.String), (r3v12 java.lang.String) binds: [B:95:0x018f, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]
                  0x0194: PHI (r4v21 X.10Jj) = (r4v17 X.10Jj), (r4v22 X.10Jj) binds: [B:95:0x018f, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]
                  0x0194: PHI (r5v9 com.ss.android.ugc.aweme.profile.model.User) = (r5v5 com.ss.android.ugc.aweme.profile.model.User), (r5v10 com.ss.android.ugc.aweme.profile.model.User) binds: [B:95:0x018f, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]
                  0x0194: PHI (r8v10 android.app.Activity) = (r8v6 android.app.Activity), (r8v11 android.app.Activity) binds: [B:95:0x018f, B:97:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r28) {
                    /*
                        Method dump skipped, instruction units count: 747
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C10ES.accept(java.lang.Object):void");
                }
            });
        }
        C11RK<C10ET> c11rk2 = C10EK.LIZJ;
        if (c11rk2 != null) {
            c11rk2.onNext(c10et);
        }
    }

    @Override // X.C10E1
    public final void LJIILLIIL(boolean z) {
        C10EK.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push_post_friends_");
        sbLIZ.append(C10EK.LJ());
        Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).storeBoolean("key_post_push_switch", z);
    }

    @Override // X.C10E1
    public final void hideNotificationTipDialog(Context context) {
        C10EK.LIZ.getClass();
        if (context instanceof C19EG) {
            Fragment fragmentLJJJJZI = ((C19EG) context).getSupportFragmentManager().LJJJJZI("NotificationLiveDialog");
            if (fragmentLJJJJZI instanceof DialogFragment) {
                ((DialogFragment) fragmentLJJJJZI).dismiss();
            }
        }
    }

    @Override // X.C10E1
    public final void LIZIZ(Context context, User user) {
        C10EK.LIZ.getClass();
        C10EK.LJIIJ(context, user);
    }

    @Override // X.C10E1
    public final C11NZ LJ(int i, String str) {
        C1643800ssU.LIZJ.getClass();
        return C1643800ssU.LIZLLL.request(new C10EO(str, i));
    }

    @Override // X.C10E1
    public final void LJIIIIZZ(Context context, User user) {
        C10EK.LIZ.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131849298);
        c1397580mTM.LIZIZ(C786410Ut5.j4(context.getString(2131849301), Arrays.copyOf(new Object[]{user.getNickname()}, 1)));
        C985403tE.LIZ(c1397580mTM, AFwS271S0000000_28.get$arr$(270));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static C11NZ LJIIZILJ(int i, long j, long j2) {
        return ((C0OB5) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(C0OB5.class)).LIZ(j, j2, 2, String.valueOf(i));
    }
}
