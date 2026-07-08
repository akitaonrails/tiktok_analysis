package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBaseAccountInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSettingUpdate;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import java.util.Collections;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0Nnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604750Nnl {
    public static final C604750Nnl LIZ;
    public static C11PQ<Boolean> LIZIZ;
    public static BulletinBaseAccountInfo LIZJ;
    public static Boolean LIZLLL;
    public static AnonymousClass0956 LJ;

    static {
        C604750Nnl c604750Nnl = new C604750Nnl();
        LIZ = c604750Nnl;
        EventBus.LIZLLL().LJIJJ(c604750Nnl);
    }

    public static boolean LIZ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAutoShareIsChecked currentIsChecked = ");
        sbLIZ.append(LIZLLL);
        C1720106oR.LJI("BulletinBoardAutoShareDataManager", C2188811AlT.LIZIZ(sbLIZ));
        Boolean bool = LIZLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("auto_share_is_checked");
        sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        boolean z = Keva.getRepo("bulletin_board_auto_share_data_cache_repo").getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false);
        LIZLLL = Boolean.valueOf(z);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getAutoShareIsChecked cacheValue = ");
        sbLIZ3.append(z);
        C1720106oR.LJI("BulletinBoardAutoShareDataManager", C2188811AlT.LIZIZ(sbLIZ3));
        return z;
    }

    public static void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auto_share_is_clicked");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        Keva.getRepo("bulletin_board_auto_share_data_cache_repo").storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static void LIZLLL(boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performStore isChecked = ");
        sbLIZ.append(z);
        C1720106oR.LJI("BulletinBoardAutoShareDataManager", C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL = Boolean.valueOf(z);
        C11PQ<Boolean> c11pq = LIZIZ;
        if (c11pq != null) {
            c11pq.onNext(Boolean.valueOf(z));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("auto_share_is_checked");
        sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        Keva.getRepo("bulletin_board_auto_share_data_cache_repo").storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), z);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onLoginStateChangeEvent(C486550J6f c486550J6f) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoginStateChangeEvent ");
        sbLIZ.append(c486550J6f);
        C1720106oR.LJI("BulletinBoardAutoShareDataManager", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJ = null;
        LIZIZ = null;
        LIZJ = null;
        LIZLLL = null;
    }

    public static Object LJ(boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        return NotificationApi.LIZ().LJIILLIIL(new BulletinFunctionSettingUpdate(Collections.singletonList(new BulletinFunctionSetting(EnumC617170OIp.AUTO_SHARE_POSTS_TO_BULLETIN_BOARD.getType(), null, z ? 1 : 0))), interfaceC1364105Vn);
    }

    public static void LJI(boolean z, boolean z2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeAutoShareIsChecked isChecked = ");
        sbLIZ.append(z);
        sbLIZ.append(", needSyncServer = ");
        sbLIZ.append(z2);
        C1720106oR.LJI("BulletinBoardAutoShareDataManager", C2188811AlT.LIZIZ(sbLIZ));
        if (z2) {
            LJFF();
            AnonymousClass0956 anonymousClass0956 = LJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LJ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C596350NaD(z, null), 3);
            return;
        }
        LIZLLL(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(boolean r6, X.InterfaceC1364105Vn<? super X.AbstractC1623806Xk<kotlin.Unit>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C596390NaH
            if (r0 == 0) goto L22
            r4 = r7
            X.0NaH r4 = (X.C596390NaH) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            boolean r6 = r4.LL
            goto L46
        L22:
            X.0NaH r4 = new X.0NaH
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            LJFF()     // Catch: java.lang.Exception -> L74
            if (r6 == 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            r4.LL = r6     // Catch: java.lang.Exception -> L74
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L74
            java.lang.Object r3 = LJ(r0, r4)     // Catch: java.lang.Exception -> L74
            if (r3 != r2) goto L49
            return r2
        L46:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L74
        L49:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r3     // Catch: java.lang.Exception -> L74
            int r0 = r3.status_code     // Catch: java.lang.Exception -> L74
            if (r0 != 0) goto L69
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> L74
            X.08pq r0 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> L74
            X.054G r3 = X.C2296808zG.LIZ(r0)     // Catch: java.lang.Exception -> L74
            X.0NaG r2 = new X.0NaG     // Catch: java.lang.Exception -> L74
            r1 = 0
            r2.<init>(r6, r1)     // Catch: java.lang.Exception -> L74
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)     // Catch: java.lang.Exception -> L74
            X.06Xi r1 = new X.06Xi     // Catch: java.lang.Exception -> L74
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L74
            r1.<init>(r0)     // Catch: java.lang.Exception -> L74
            return r1
        L69:
            X.01vg r1 = new X.01vg     // Catch: java.lang.Exception -> L74
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: java.lang.Exception -> L74
            r0.<init>()     // Catch: java.lang.Exception -> L74
            r1.<init>(r0)     // Catch: java.lang.Exception -> L74
            return r1
        L74:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "setAutoShareLiveRoomToBulletinBoard() error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            X.01vg r1 = new X.01vg
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C604750Nnl.LJII(boolean, X.05Vn):java.lang.Object");
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        String str4;
        if (z) {
            str4 = "on";
        } else {
            str4 = "off";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("content_type", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("action_type", str4);
        C20684815ws.LJIILLIIL("bb_share_switch_click", c2344009Gk.LIZ);
    }

    public static void LIZJ(Boolean bool, String str, String str2, String str3, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("channel_id", str);
        c2344009Gk.LJIIIIZZ("content_type", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LIZJ(C214824195i.LIZIZ.isPrivateAccount() ? 1 : 0, "is_private_account");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_bb_share_allowed");
        if (bool != null) {
            c2344009Gk.LIZJ(bool.booleanValue() ? 1 : 0, "is_private_post");
        }
        C20684815ws.LJIILLIIL("bb_share_switch_show", c2344009Gk.LIZ);
    }
}
