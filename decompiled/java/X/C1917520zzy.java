package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.ban.Data;
import com.ss.android.ugc.tiktok.ban.IUserBanDepService;
import com.ss.android.ugc.tiktok.ban.UserBanAppealStatusResponse;
import com.ss.android.ugc.tiktok.ban.UserBanAppealTicketResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS61S0500000_28;

/* JADX INFO: renamed from: X.0zzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917520zzy extends C1917510zzx {
    @Override // X.C1917510zzx
    public final String LIZIZ() {
        return "ban_type_session_ban";
    }

    @Override // X.C1917510zzx
    public final void LIZJ() {
        C1876900ywS.LIZIZ(C2097608Jq.LJIIIIZZ(new Pair("ban_type", "ban_type_session_ban"), new Pair("error_reason", "get_appeal_status_failed")));
        IUserBanDepService.LIZ.getClass();
        AtomicBoolean atomicBooleanLIZJ = C1519390pdp.LIZ().LIZJ();
        if (atomicBooleanLIZJ != null) {
            atomicBooleanLIZJ.set(false);
        }
    }

    @Override // X.C1917510zzx, X.InterfaceC1917440zzq
    public final void onDismiss() {
    }

    @Override // X.C1917510zzx, X.InterfaceC1917440zzq
    public final void LIZ(Map<String, ? extends Object> map, InterfaceC1631630sYr<? super UserBanAppealStatusResponse, ? super Map<String, ? extends Object>, ? super Map<String, String>, ? super Map<String, String>, Unit> interfaceC1631630sYr, Function1<? super String, Unit> function1, Function2<? super String, ? super Long, Unit> function2) {
        String str;
        String path;
        IUserBanDepService.LIZ.getClass();
        AtomicBoolean atomicBooleanLIZJ = C1519390pdp.LIZ().LIZJ();
        if (atomicBooleanLIZJ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Trigger Not Set ");
            sbLIZ.append(map.get("enter_from_ban_url"));
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (!atomicBooleanLIZJ.compareAndSet(false, true)) {
            ((AFwS315S0000000_28) function2).invoke(String.valueOf(map.get("enter_from_ban_url")), -1L);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map.get("enter_from_ban_url");
        if ((obj instanceof String) && (str = (String) obj) != null && (path = UriProtector.parse(str).getPath()) != null) {
            linkedHashMap.put("url_path", path);
        }
        C100C.LIZ.LIZJ().LIZ("pns_ban_session_ban_trigger", linkedHashMap);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("UserBan Triggered. BanType: ");
        sbLIZ2.append("ban_type_session_ban");
        sbLIZ2.append(" enterFromUrl: ");
        sbLIZ2.append(map.get("enter_from_ban_url"));
        sbLIZ2.append(" currentThread ");
        sbLIZ2.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        AnonymousClass1003 anonymousClass1003 = AnonymousClass1003.LIZ;
        final AwS61S0500000_28 awS61S0500000_28 = new AwS61S0500000_28(this, linkedHashMap2, (C1917500zzw) interfaceC1631630sYr, (AwS607S0100000_28) function1, (AFwS315S0000000_28) function2, 8);
        anonymousClass1003.getClass();
        try {
            AnonymousClass1004 anonymousClass1004 = (AnonymousClass1004) AnonymousClass1003.LIZIZ.getValue();
            if (anonymousClass1004 == null) {
                AnonymousClass1003.LIZIZ("ban_type_session_ban", "appeal_ticket_no_net_service", null);
                awS61S0500000_28.invoke(null);
            } else {
                anonymousClass1004.LIZIZ().LJL(C11S5.LIZ()).LJJIIZ(new InterfaceC781210Ukh() { // from class: X.1007
                    public final /* synthetic */ String LIZ = "ban_type_session_ban";

                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        AnonymousClass1003 anonymousClass10032 = AnonymousClass1003.LIZ;
                        String str2 = this.LIZ;
                        anonymousClass10032.getClass();
                        AnonymousClass1003.LIZ(str2, "appeal_ticket_on_dispose");
                    }
                }).LIZIZ(new InterfaceC626120Oh8<UserBanAppealTicketResponse>() { // from class: X.1002
                    public final /* synthetic */ String LL = "ban_type_session_ban";

                    @Override // X.InterfaceC626120Oh8
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onComplete() {
                        AnonymousClass1003 anonymousClass10032 = AnonymousClass1003.LIZ;
                        String str2 = this.LL;
                        anonymousClass10032.getClass();
                        AnonymousClass1003.LIZ(str2, "appeal_ticket_on_complete");
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onError(Throwable th) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(th.getClass().getSimpleName());
                        sbLIZ3.append(':');
                        sbLIZ3.append(th.getMessage());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        AnonymousClass1003 anonymousClass10032 = AnonymousClass1003.LIZ;
                        String str2 = this.LL;
                        anonymousClass10032.getClass();
                        AnonymousClass1003.LIZIZ(str2, "appeal_ticket_on_error", strLIZIZ);
                        awS61S0500000_28.invoke(null);
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(UserBanAppealTicketResponse userBanAppealTicketResponse) {
                        String str2;
                        Function1<String, Unit> function12 = awS61S0500000_28;
                        Data data = userBanAppealTicketResponse.getData();
                        if (data != null) {
                            str2 = data.verifyTicket;
                        } else {
                            str2 = null;
                        }
                        function12.invoke(str2);
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AnonymousClass1003.LIZIZ("ban_type_session_ban", "appeal_ticket_error_when_subscribe", th.getMessage());
            awS61S0500000_28.invoke(null);
        }
    }
}
