package X;

import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutRequest;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.addon.api.AddOnApi$Companion$getAddonPanel$2", f = "AddOnApi.kt", l = {49}, m = "invokeSuspend")
public final class C859103Xh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GetAddonPanelResponse>, Object> {
    public int LL;
    public final /* synthetic */ GetAddonPanelLayoutRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859103Xh(GetAddonPanelLayoutRequest getAddonPanelLayoutRequest, InterfaceC1364105Vn<? super C859103Xh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = getAddonPanelLayoutRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859103Xh(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddOnApi$Companion@d2f.getAddonPanel$2");
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
            InterfaceC859003Xg interfaceC859003Xg = (InterfaceC859003Xg) C859303Xj.LIZIZ.create(InterfaceC859003Xg.class);
            GetAddonPanelLayoutRequest getAddonPanelLayoutRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC859003Xg.LIZIZ(getAddonPanelLayoutRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AddOnApi$Companion@d2f.getAddonPanel$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AddOnApi$Companion@d2f.getAddonPanel$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GetAddonPanelResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
