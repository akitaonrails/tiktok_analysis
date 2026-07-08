package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelVM;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundleSkuDescriptorEvent;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.SkuDescriptor;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment$onCreate$2", f = "BundlePanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C1019803ym extends C09AX implements Function2<InterfaceC599270Nev, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BundlePanelFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019803ym(BundlePanelFragment bundlePanelFragment, InterfaceC1364105Vn<? super C1019803ym> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bundlePanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1019803ym c1019803ym = new C1019803ym(this.LLILLJJLI, interfaceC1364105Vn);
        c1019803ym.LL = obj;
        return c1019803ym;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BundlePanelFragment@e095.onCreate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, Object> data = ((InterfaceC599270Nev) this.LL).getData();
        if (data != null) {
            BundlePanelFragment bundlePanelFragment = this.LLILLJJLI;
            Gson gson = C051O.LIZ;
            BundleSkuDescriptorEvent bundleSkuDescriptorEvent = (BundleSkuDescriptorEvent) C051O.LIZLLL(BundleSkuDescriptorEvent.class, data);
            SkuDescriptor skuDescriptor = bundleSkuDescriptorEvent.getSkuDescriptor();
            if (skuDescriptor != null) {
                BundlePanelVM bundlePanelVMVR = bundlePanelFragment.VR();
                boolean zIsSkuAvailable = bundleSkuDescriptorEvent.isSkuAvailable();
                bundlePanelVMVR.LLILZLL = skuDescriptor;
                bundlePanelVMVR.LLIZ = zIsSkuAvailable;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BundlePanelFragment@e095.onCreate$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC599270Nev interfaceC599270Nev, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC599270Nev, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
