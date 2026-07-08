package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import njp.a;

/* JADX INFO: renamed from: X.0z0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.SetLiveEffectMethod$handle$1", f = "SetLiveEffectMethod.kt", l = {32}, m = "invokeSuspend")
public final class C1879620z0q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1879100z00 LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC1879120z02> LLILLL;
    public final /* synthetic */ C1879630z0r LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879620z0q(InterfaceC1879100z00 interfaceC1879100z00, CompletionBlock<InterfaceC1879120z02> completionBlock, C1879630z0r c1879630z0r, InterfaceC1364105Vn<? super C1879620z0q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1879100z00;
        this.LLILLL = completionBlock;
        this.LLILZ = c1879630z0r;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1879620z0q(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = obj;
        C1C7U.LIZ("SetLiveEffectMethod@fa63.handle$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJFF);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJFF);
            C0UEA liveEffectController = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController();
            String resourceId = this.LLILLJJLI.getResourceId();
            String panelName = this.LLILLJJLI.getPanelName();
            String tabKey = this.LLILLJJLI.getTabKey();
            AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(481);
            this.LL = 1;
            objLJFF = liveEffectController.LJFF(resourceId, panelName, tabKey, this, aFwS217S0000000_28, null, null, true, false);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("SetLiveEffectMethod@fa63.handle$1");
                return objLJFF2;
            }
        }
        if (((Boolean) objLJFF).booleanValue()) {
            CompletionBlock<InterfaceC1879120z02> completionBlock = this.LLILLL;
            this.LLILZ.getClass();
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1879120z02.class, null);
            InterfaceC1879120z02 interfaceC1879120z02 = (InterfaceC1879120z02) xBaseModelLIZJ;
            interfaceC1879120z02.setCode(C2286608xc.LJ(1));
            interfaceC1879120z02.setMsg("");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else {
            C2382909Vj.LIZ(this.LLILLL, 0, "download fail", null, 4);
        }
        this.LLILZ.LLILLL.remove(this.LLILLJJLI.getResourceId());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SetLiveEffectMethod@fa63.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
