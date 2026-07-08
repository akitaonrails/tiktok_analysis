package Y;

import X.AbstractC848400XPy;
import X.AnonymousClass0208;
import X.C05L5;
import X.C09JN;
import X.C0PEM;
import X.C0XQ7;
import X.C0XWJ;
import X.C0XZJ;
import X.C1247370iZ5;
import X.C1247390iZ7;
import X.C1247400iZ8;
import X.C1247420iZA;
import X.C1247430iZB;
import X.C1247440iZC;
import X.C1247460iZE;
import X.C1247470iZF;
import X.C1255120ila;
import X.C1C7U;
import X.C2296808zG;
import X.C23250099c;
import X.C588270N5l;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM;
import com.ss.android.ugc.profile.business.ur.following.vm.RelationSearchVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes20.dex */
public class AfS51S1100000_19 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS51S1100000_19 afS51S1100000_19, Object obj) {
        C1C7U.LIZ("RelationSearchVM@d9b7.removeFollower$1");
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        AnonymousClass0208 anonymousClass0208 = AnonymousClass0208.get$arr$(37);
        if (C588270N5l.LIZ(curUser)) {
            anonymousClass0208.invoke(new C1247460iZE(curUser), new C1247370iZ5(curUser));
        } else {
            anonymousClass0208.invoke(new C1247430iZB(curUser), new C1247400iZ8(curUser));
        }
        ((RelationSearchVM) afS51S1100000_19.l1).setState(new AwS70S1000000_19(afS51S1100000_19.s0, 26));
        C1C7U.LIZIZ("RelationSearchVM@d9b7.removeFollower$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS51S1100000_19 r12, java.lang.Object r13) {
        /*
            java.lang.String r5 = "SMSInputViewHolderV2@22b.sendCode$1"
            X.C1C7U.LIZ(r5)
            X.0XT7 r13 = (X.C0XT7) r13
            java.lang.Object r0 = r12.l1
            X.0iLQ r0 = (X.C1238900iLQ) r0
            com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r2 = r0.LLILLJJLI
            X.0Xbr r1 = X.C852170Xbr.LIZ
            T extends X.0XTe r0 = r13.LJIIIZ
            r1.getClass()
            android.os.Bundle r0 = X.C852170Xbr.LJ(r0)
            r2.LLLFZ = r0
            int r0 = X.C1238900iLQ.LLJILJILJ
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r12.l1
            X.0iLQ r0 = (X.C1238900iLQ) r0
            com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r0.LLILLJJLI
            java.lang.String r7 = r0.getEnterFrom()
            java.lang.Object r0 = r12.l1
            X.0iLQ r0 = (X.C1238900iLQ) r0
            com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r0.LLILLJJLI
            java.lang.String r8 = r0.getEnterMethod()
            java.lang.Object r0 = r12.l1
            X.0iLQ r0 = (X.C1238900iLQ) r0
            com.ss.android.ugc.aweme.account.login.auth.SignupViewModel r0 = r0.LLILLJJLI
            java.lang.String r9 = r0.yQ2()
            T extends X.0XTe r0 = r13.LJIIIZ
            java.lang.Boolean r10 = r0.LJFF
            r11 = 64
            X.C1238920iLS.LIZ(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp r0 = com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp.INSTANCE
            boolean r0 = r0.showCheckbox()
            if (r0 == 0) goto La2
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = "SMSInputViewHolderV2.sendCode("
            r3.append(r0)     // Catch: java.lang.Exception -> L9e
            r3.append(r13)     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = ")@@@["
            r3.append(r0)     // Catch: java.lang.Exception -> L9e
            T extends X.0XTe r0 = r13.LJIIIZ     // Catch: java.lang.Exception -> L9e
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L9e
            java.lang.String r2 = "has_sms_permission"
            java.lang.String r1 = "data"
            if (r0 == 0) goto L6c
            goto L6e
        L6c:
            r0 = 0
            goto L7c
        L6e:
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L6c
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L6c
            java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Exception -> L9e
        L7c:
            r3.append(r0)     // Catch: java.lang.Exception -> L9e
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Exception -> L9e
            X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Exception -> L9e
            T extends X.0XTe r0 = r13.LJIIIZ     // Catch: java.lang.Exception -> L9e
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto La2
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto La2
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto La2
            java.lang.String r4 = r0.optString(r2)     // Catch: java.lang.Exception -> L9e
            if (r4 != 0) goto La4
            goto La2
        L9e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La2:
            java.lang.String r4 = ""
        La4:
            X.0XeG r0 = X.C853660XeG.LIZ
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            X.C853660XeG.LIZIZ = r0
            java.lang.Object r3 = r12.l1
            X.0iLQ r3 = (X.C1238900iLQ) r3
            T extends X.0XTe r0 = r13.LJIIIZ
            java.lang.Boolean r2 = r0.LJFF
            java.lang.String r1 = r12.s0
            r0 = 1
            r3.I5(r2, r0, r4, r1)
            X.C1C7U.LIZIZ(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS51S1100000_19.accept$1(Y.AfS51S1100000_19, java.lang.Object):void");
    }

    public static final void accept$2(AfS51S1100000_19 afS51S1100000_19, Object obj) {
        C0XZJ c0xzj;
        C1C7U.LIZ("SaveInfoDialogHelper@9dc6.tryShowOclDialogWithSafetyCheck$4");
        Throwable th = (Throwable) obj;
        if (th instanceof C0XZJ) {
            c0xzj = (C0XZJ) th;
        } else {
            c0xzj = null;
        }
        if (c0xzj != null) {
            String str = afS51S1100000_19.s0;
            C0XWJ c0xwj = C0XWJ.LIZ;
            Integer numValueOf = Integer.valueOf(c0xzj.getErrorCode());
            c0xwj.getClass();
            C0XWJ.LIZIZ(numValueOf, str, false);
        }
        ((Function0) afS51S1100000_19.l1).invoke();
        C1255120ila.LIZIZ = false;
        C1C7U.LIZIZ("SaveInfoDialogHelper@9dc6.tryShowOclDialogWithSafetyCheck$4");
    }

    public static final void accept$3(AfS51S1100000_19 afS51S1100000_19, Object obj) {
        C1C7U.LIZ("UserProfileFollowVM@2122.remove$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        AnonymousClass0208 anonymousClass0208 = AnonymousClass0208.get$arr$(67);
        if (C588270N5l.LIZ(curUser)) {
            anonymousClass0208.invoke(new C1247470iZF(curUser), new C1247390iZ7(curUser));
        } else {
            anonymousClass0208.invoke(new C1247440iZC(curUser), new C1247420iZA(curUser));
        }
        ((UserProfileFollowVM) afS51S1100000_19.l1).setState(new AwS598S0100000_19(baseResponse, 863));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05L5(curUser, afS51S1100000_19.s0, null), 3);
        C1C7U.LIZIZ("UserProfileFollowVM@2122.remove$1");
    }

    public AfS51S1100000_19(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
