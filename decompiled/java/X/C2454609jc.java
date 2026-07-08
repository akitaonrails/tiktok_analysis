package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.WalletVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2454609jc extends C2217421BqW implements Function1<C07W0, Unit> {
    public C2454609jc(Object obj) {
        super(1, obj, WalletVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/WalletCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07W0 c07w0) {
        String str;
        C07W0 c07w02 = c07w0;
        WalletVM walletVM = (WalletVM) this.receiver;
        walletVM.getClass();
        if (c07w02 instanceof C1874907Vz) {
            walletVM.vQ2(((C1874907Vz) c07w02).LIZ, "settings_page");
        } else if (Intrinsics.LJFF(c07w02, C07W1.LIZ)) {
            InterfaceC1253830ijV interfaceC1253830ijVLJJL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJL();
            if (interfaceC1253830ijVLJJL != null && interfaceC1253830ijVLJJL.LJIILJJIL()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("entrance", "settings_privacy");
            c2344009Gk.LJIIIIZZ("has_income_before", str);
            c2344009Gk.LJIIIIZZ("display_balance", null);
            C20684815ws.LJIILLIIL("livesdk_wallet_entrance_show", c2344009Gk.LIZ);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
