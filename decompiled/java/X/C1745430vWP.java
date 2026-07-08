package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import eha.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS28S1400000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vWP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper$autoFillLogNode$1$1", f = "TextInputHelper.kt", l = {600}, m = "invokeSuspend")
public final class C1745430vWP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ a0 LLILLJJLI;
    public final /* synthetic */ C1745680vWo LLILLL;
    public final /* synthetic */ C1745680vWo LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745430vWP(a0 a0Var, C1745680vWo c1745680vWo, C1745680vWo c1745680vWo2, String str, InterfaceC1364105Vn<? super C1745430vWP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = a0Var;
        this.LLILLL = c1745680vWo;
        this.LLILZ = c1745680vWo2;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1745430vWP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objYS2 = obj;
        C1C7U.LIZ("TextInputHelper@35d4.autoFillLogNode$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objYS2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objYS2);
            AddressEditViewModel addressEditViewModel = this.LLILLJJLI.LLILLL;
            C1745680vWo c1745680vWo = this.LLILLL;
            this.LL = 1;
            objYS2 = addressEditViewModel.yS2(c1745680vWo, null, this);
            if (objYS2 == objLJFF) {
                C1C7U.LIZIZ("TextInputHelper@35d4.autoFillLogNode$1$1");
                return objLJFF;
            }
        }
        a0 a0Var = this.LLILLJJLI;
        C1745340vWG c1745340vWG = (C1745340vWG) objYS2;
        a0Var.LLILLL.KR2(a0Var.LL, this.LLILLL, c1745340vWG);
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C10511049d(), new AwS28S1400000_26(this.LLILLL, this.LLILZ, this.LLILLJJLI, c1745340vWG, this.LLILZIL, 1));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextInputHelper@35d4.autoFillLogNode$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
