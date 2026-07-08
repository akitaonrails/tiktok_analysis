package X;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.effectcreatormobile.infrastructure.ui.base.BindingBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.ui.base.BindingBaseFragment$onViewCreated$1", f = "BindingBaseFragment.kt", l = {67}, m = "invokeSuspend")
public final class C428301lZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BindingBaseFragment<B> LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ Bundle LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C428301lZ(BindingBaseFragment<B> bindingBaseFragment, View view, Bundle bundle, InterfaceC1364105Vn<? super C428301lZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bindingBaseFragment;
        this.LLILLL = view;
        this.LLILZ = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C428301lZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BindingBaseFragment@d867.onViewCreated$1");
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
            InterfaceC241700wZ interfaceC241700wZLIZ = C0XSN.LIZ();
            if (interfaceC241700wZLIZ != null) {
                LifecycleOwner viewLifecycleOwner = this.LLILLJJLI.getViewLifecycleOwner();
                this.LL = 1;
                if (interfaceC241700wZLIZ.LIZJ(viewLifecycleOwner, this) == objLJFF) {
                    C1C7U.LIZIZ("BindingBaseFragment@d867.onViewCreated$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLJJLI.OR(this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BindingBaseFragment@d867.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
