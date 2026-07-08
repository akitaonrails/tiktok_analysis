package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.ReturnPoliciesFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.returnpolicy.UsReturnPolicyVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS367S0200000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.returnpolicy.UsReturnPolicyVH$onBind$1$1$2", f = "UsReturnPolicyVH.kt", l = {105}, m = "invokeSuspend")
public final class C825103Kf extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UsReturnPolicyVH LLILLJJLI;
    public final /* synthetic */ C03KE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825103Kf(UsReturnPolicyVH usReturnPolicyVH, C03KE c03ke, InterfaceC1364105Vn<? super C825103Kf> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = usReturnPolicyVH;
        this.LLILLL = c03ke;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C825103Kf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("UsReturnPolicyVH@91d7.onBind$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            UsReturnPolicyVH usReturnPolicyVH = this.LLILLJJLI;
            ECBaseFragment eCBaseFragment = usReturnPolicyVH.LLJJIJIL;
            UserRight userRight = this.LLILLL.LL;
            IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) usReturnPolicyVH.LLJJJJLIIL.getValue()).LLJI;
            this.LL = 1;
            if (eCBaseFragment != null && eCBaseFragment.getFragmentManager() != null) {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                ReturnPoliciesFragment.LLIZLLLIL = c23260099m;
                FragmentManager fragmentManager = eCBaseFragment.getFragmentManager();
                if (fragmentManager != null) {
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LIZ.LLJLL = true;
                    c1390920mIc.LJIIIIZZ(1);
                    c1390920mIc.LIZ.LLJJL = (int) C958103op.LIZIZ();
                    ReturnPoliciesFragment returnPoliciesFragment = new ReturnPoliciesFragment();
                    returnPoliciesFragment.LLIZ = pdpEnterParam;
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("title", userRight.name, bundle);
                    C960603pE.LJI(bundle, eCBaseFragment, new AwS367S0200000_1(userRight, returnPoliciesFragment, 119));
                    returnPoliciesFragment.setArguments(bundle);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = returnPoliciesFragment;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.show(fragmentManager, "CommerceReturnPoliciesFragment");
                }
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLIZ != C099R.LJFF()) {
                    objLIZ = Unit.LIZ;
                }
            } else {
                objLIZ = Unit.LIZ;
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("UsReturnPolicyVH@91d7.onBind$1$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsReturnPolicyVH@91d7.onBind$1$1$2");
        return unit;
    }
}
