package X;

import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment$handleBuyWithAmazonUnlink$1", f = "AuthAppInfoFragment.kt", l = {573, 574}, m = "invokeSuspend")
public final class C1702870uPl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AuthAppInfoFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702870uPl(AuthAppInfoFragment authAppInfoFragment, InterfaceC1364105Vn<? super C1702870uPl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = authAppInfoFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702870uPl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthAppInfoFragment@ad3d.handleBuyWithAmazonUnlink$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AuthAppInfoFragment@ad3d.handleBuyWithAmazonUnlink$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AuthListViewModel authListViewModelOR = this.LLILLJJLI.OR();
            this.LL = 1;
            authListViewModelOR.getClass();
            int i2 = C2187451AjH.LIZ;
            obj = authListViewModelOR.LLILZIL.LJJIJIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AuthAppInfoFragment@ad3d.handleBuyWithAmazonUnlink$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1702880uPm c1702880uPm = new C1702880uPm(zBooleanValue, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1702880uPm) == objLJFF) {
            C1C7U.LIZIZ("AuthAppInfoFragment@ad3d.handleBuyWithAmazonUnlink$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AuthAppInfoFragment@ad3d.handleBuyWithAmazonUnlink$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
