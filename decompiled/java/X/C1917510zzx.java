package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.ban.IUserBanDepService;
import com.ss.android.ugc.tiktok.ban.UserBanAppealStatusResponse;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS123S0400000_28;

/* JADX INFO: renamed from: X.0zzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1917510zzx implements InterfaceC1917440zzq {
    public String LIZIZ() {
        return "ban_type_sessionless_ban";
    }

    public void LIZJ() {
        C1876900ywS.LIZIZ(C2097608Jq.LJIIIIZZ(new Pair("ban_type", LIZIZ()), new Pair("error_reason", "get_appeal_status_failed")));
    }

    @Override // X.InterfaceC1917440zzq
    public void onDismiss() {
    }

    @Override // X.InterfaceC1917440zzq
    public void LIZ(Map<String, ? extends Object> map, InterfaceC1631630sYr<? super UserBanAppealStatusResponse, ? super Map<String, ? extends Object>, ? super Map<String, String>, ? super Map<String, String>, Unit> interfaceC1631630sYr, Function1<? super String, Unit> function1, Function2<? super String, ? super Long, Unit> function2) {
        String str;
        Object obj = map.get("user_id_str");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        IUserBanDepService.LIZ.getClass();
        int iLJI = C1519390pdp.LIZ().LJI();
        AnonymousClass1003 anonymousClass1003 = AnonymousClass1003.LIZ;
        final String strLIZIZ = LIZIZ();
        final AwS123S0400000_28 awS123S0400000_28 = new AwS123S0400000_28(this, (C1917510zzx) map, (Map<String, ? extends Object>) interfaceC1631630sYr, (InterfaceC1631630sYr<? super UserBanAppealStatusResponse, ? super Map<String, ? extends Object>, ? super Map<String, String>, ? super Map<String, String>, Unit>) function1, (Function1<? super String, Unit>) 4);
        anonymousClass1003.getClass();
        try {
            AnonymousClass1004 anonymousClass1004 = (AnonymousClass1004) AnonymousClass1003.LIZIZ.getValue();
            if (anonymousClass1004 == null) {
                AnonymousClass1003.LIZIZ(strLIZIZ, "appeal_status_no_net_service", null);
                awS123S0400000_28.invoke(null);
            } else {
                anonymousClass1004.LIZ("6", str, iLJI).LJL(C11S5.LIZ()).LJJIIZ(new InterfaceC781210Ukh() { // from class: X.1008
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        AnonymousClass1003 anonymousClass10032 = AnonymousClass1003.LIZ;
                        String str2 = strLIZIZ;
                        anonymousClass10032.getClass();
                        AnonymousClass1003.LIZ(str2, "appeal_status_on_dispose");
                    }
                }).LIZIZ(new InterfaceC626120Oh8<UserBanAppealStatusResponse>() { // from class: X.1001
                    @Override // X.InterfaceC626120Oh8
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onComplete() {
                        AnonymousClass1003 anonymousClass10032 = AnonymousClass1003.LIZ;
                        String str2 = strLIZIZ;
                        anonymousClass10032.getClass();
                        AnonymousClass1003.LIZ(str2, "appeal_status_on_complete");
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onError(Throwable th) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(th.getClass().getSimpleName());
                        sbLIZ.append(':');
                        sbLIZ.append(th.getMessage());
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                        AnonymousClass1003 anonymousClass10032 = AnonymousClass1003.LIZ;
                        String str2 = strLIZIZ;
                        anonymousClass10032.getClass();
                        AnonymousClass1003.LIZIZ(str2, "appeal_status_on_error", strLIZIZ2);
                        awS123S0400000_28.invoke(null);
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(UserBanAppealStatusResponse userBanAppealStatusResponse) {
                        UserBanAppealStatusResponse userBanAppealStatusResponse2 = userBanAppealStatusResponse;
                        if (userBanAppealStatusResponse2.getStatusCode() == 0) {
                            awS123S0400000_28.invoke(userBanAppealStatusResponse2);
                            return;
                        }
                        AnonymousClass1003 anonymousClass10032 = AnonymousClass1003.LIZ;
                        String str2 = strLIZIZ;
                        anonymousClass10032.getClass();
                        AnonymousClass1003.LIZIZ(str2, "appeal_status_non_zero_code", null);
                        awS123S0400000_28.invoke(null);
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AnonymousClass1003.LIZIZ(strLIZIZ, "appeal_status_error_when_subscribe", th.getMessage());
            awS123S0400000_28.invoke(null);
        }
    }
}
