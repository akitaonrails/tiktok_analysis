package X;

import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS76S1000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0uPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment$handleBuyWithAmazonUnlink$1$1", f = "AuthAppInfoFragment.kt", l = {}, m = "invokeSuspend")
public final class C1702880uPm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AuthAppInfoFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702880uPm(boolean z, AuthAppInfoFragment authAppInfoFragment, InterfaceC1364105Vn<? super C1702880uPm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = authAppInfoFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702880uPm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthAppInfoFragment@ad3d.handleBuyWithAmazonUnlink$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            String str = AuthAppInfoFragment.LLJJJ;
            if (str != null) {
                AuthListViewModel authListViewModelOR = this.LLILLJJLI.OR();
                authListViewModelOR.getClass();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setPartnerStateAfterDelete, partnerIdentifier:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                authListViewModelOR.setState(new AwS76S1000000_26(str, 42));
            }
            this.LLILLJJLI.UR();
        } else {
            this.LLILLJJLI.SR();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthAppInfoFragment@ad3d.handleBuyWithAmazonUnlink$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
