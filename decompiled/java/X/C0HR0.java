package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS215S0300000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HR0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageAssem$onCreateView$3$1$1", f = "MixStudioGeneratingPageAssem.kt", l = {185}, m = "invokeSuspend")
public final class C0HR0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioGeneratingPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HR0(MixStudioGeneratingPageAssem mixStudioGeneratingPageAssem, InterfaceC1364105Vn<? super C0HR0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioGeneratingPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HR0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object objLIZ = obj;
        C1C7U.LIZ("MixStudioGeneratingPageAssem@b2f1.onCreateView$3$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            MixStudioGeneratingPageAssem mixStudioGeneratingPageAssem = this.LLILLJJLI;
            this.LL = 1;
            mixStudioGeneratingPageAssem.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            Fragment fragmentLJI = C724240Sb0.LJI(mixStudioGeneratingPageAssem);
            Fragment fragmentLJI2 = C724240Sb0.LJI(mixStudioGeneratingPageAssem);
            if (fragmentLJI2 != null) {
                context = fragmentLJI2.getContext();
            } else {
                context = null;
            }
            if (fragmentLJI != null && context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJI(context.getString(2131835855));
                c1397580mTM.LIZIZ(context.getString(2131835854));
                C985403tE.LIZ(c1397580mTM, new AwS215S0300000_6(context, mixStudioGeneratingPageAssem, c23260099m, 14));
                new C1397510mTF(c1397580mTM).LIZLLL();
                C440370HOp c440370HOp = C440370HOp.LIZ;
                EnumC441640HTm enumC441640HTmVQ2 = mixStudioGeneratingPageAssem.hp().vQ2();
                C0HR1 c0hr1 = C0HR1.SHOW;
                EnumC440360HOo enumC440360HOo = mixStudioGeneratingPageAssem.hp().getState().LLILLJJLI;
                boolean zIsNewUser = mixStudioGeneratingPageAssem.hp().isNewUser();
                InterfaceC440090HNn interfaceC440090HNn = mixStudioGeneratingPageAssem.lp().getState().LLILLJJLI;
                c440370HOp.getClass();
                C440370HOp.LJIIJJI(enumC441640HTmVQ2, c0hr1, enumC440360HOo, zIsNewUser, C440370HOp.LJIILIIL(interfaceC440090HNn), C440370HOp.LJIIL(mixStudioGeneratingPageAssem.lp().getState().LLILLJJLI));
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("MixStudioGeneratingPageAssem@b2f1.onCreateView$3$1$1");
                return objLJFF;
            }
        }
        if (((Boolean) objLIZ).booleanValue()) {
            MixStudioGeneratingPageViewModel mixStudioGeneratingPageViewModelLp = this.LLILLJJLI.lp();
            C23250099c.LIZLLL(mixStudioGeneratingPageViewModelLp.getAssemVMScope(), C0PEM.LIZJ, null, new C0HR2(mixStudioGeneratingPageViewModelLp, null), 2);
            this.LLILLJJLI.hp().xQ2(EnumC440890HQp.HOME);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioGeneratingPageAssem@b2f1.onCreateView$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
