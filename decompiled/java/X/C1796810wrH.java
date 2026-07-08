package X;

import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.live.wallet.service.recharge.impl.logger.ChargeResultLogger;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.wallet.tiktok.UpdateRechargeResultResponse;

/* JADX INFO: renamed from: X.0wrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796810wrH implements InterfaceC1796820wrI {
    public static final C1796810wrH LIZ = new C1796810wrH();
    public static final Set<InterfaceC1796820wrI> LIZIZ = C13LQ.LJLIIL(new InterfaceC1796820wrI[]{ChargeResultLogger.LIZ, new InterfaceC1796820wrI() { // from class: X.11Sb
        @Override // X.InterfaceC1796820wrI
        public final void LIZIZ(String str) {
            if (Intrinsics.LJFF(str, "")) {
                return;
            }
            C480460Ism.LIZ().getClass();
            AbstractC19484711Kz<UpdateRechargeResultResponse> abstractC19484711KzUpdateRechargeResult = ((IWalletApi) C480460Ism.LIZLLL(IWalletApi.class)).updateRechargeResult(str, true, "", "", "");
            abstractC19484711KzUpdateRechargeResult.getClass();
            new C11QI(abstractC19484711KzUpdateRechargeResult).LJIJJLI(C11S5.LIZ()).LJIILJJIL(C11S5.LIZ()).LJIJI(new C09JN() { // from class: X.0N9V
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ChargeResultApiSender@c2e.onSuccessEvent$1");
                    C1AF0.LJ((Throwable) obj);
                    C1C7U.LIZIZ("ChargeResultApiSender@c2e.onSuccessEvent$1");
                }
            }, C19487811Me.LIZJ);
        }

        @Override // X.InterfaceC1796820wrI
        public final void LIZ(String str, int i, int i2, String str2, String str3, String str4, String str5) {
            String str6 = str5;
            String str7 = str2;
            if (Intrinsics.LJFF(str4, "")) {
                return;
            }
            String str8 = "empty";
            if (str7 == null) {
                str7 = "empty";
            }
            if (str3 != null) {
                str8 = str3;
            }
            if (str6 == null) {
                str6 = "";
            }
            C480460Ism.LIZ().getClass();
            AbstractC19484711Kz<UpdateRechargeResultResponse> abstractC19484711KzUpdateRechargeResult = ((IWalletApi) C480460Ism.LIZLLL(IWalletApi.class)).updateRechargeResult(str4, false, str7, str8, str6);
            abstractC19484711KzUpdateRechargeResult.getClass();
            new C11QI(abstractC19484711KzUpdateRechargeResult).LJIJJLI(C11S5.LIZ()).LJIILJJIL(C11S5.LIZ()).LJIJI(new C09JN() { // from class: X.00mR
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ChargeResultApiSender@c2e.onFailEvent$1");
                    C1AF0.LJ((Throwable) obj);
                    C1C7U.LIZIZ("ChargeResultApiSender@c2e.onFailEvent$1");
                }
            }, C19487811Me.LIZJ);
        }
    }});

    @Override // X.InterfaceC1796820wrI
    public final void LIZIZ(String str) {
        Iterator<T> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1796820wrI) it2.next()).LIZIZ(str);
        }
    }

    @Override // X.InterfaceC1796820wrI
    public final void LIZ(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        Iterator<T> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1796820wrI) it2.next()).LIZ(str, i, i2, str2, str3, str4, str5);
        }
    }
}
