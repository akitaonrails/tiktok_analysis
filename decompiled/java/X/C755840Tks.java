package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.DownloadLiveEffectMethod$handle$1", f = "DownloadLiveEffectMethod.kt", l = {31}, m = "invokeSuspend")
public final class C755840Tks extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC755880Tkw LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC755870Tkv> LLILLL;
    public final /* synthetic */ C755850Tkt LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C755840Tks(InterfaceC755880Tkw interfaceC755880Tkw, CompletionBlock<InterfaceC755870Tkv> completionBlock, C755850Tkt c755850Tkt, InterfaceC1364105Vn<? super C755840Tks> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC755880Tkw;
        this.LLILLL = completionBlock;
        this.LLILZ = c755850Tkt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C755840Tks(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadLiveEffectMethod@fd9a.handle$1");
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
            C0UEA liveEffectController = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController();
            String resourceId = this.LLILLJJLI.getResourceId();
            String panelName = this.LLILLJJLI.getPanelName();
            String tabKey = this.LLILLJJLI.getTabKey();
            this.LL = 1;
            obj = liveEffectController.LJI(resourceId, panelName, tabKey, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DownloadLiveEffectMethod@fd9a.handle$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            CompletionBlock<InterfaceC755870Tkv> completionBlock = this.LLILLL;
            this.LLILZ.getClass();
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC755870Tkv.class, null);
            InterfaceC755870Tkv interfaceC755870Tkv = (InterfaceC755870Tkv) xBaseModelLIZJ;
            interfaceC755870Tkv.setCode(C2286608xc.LJ(1));
            interfaceC755870Tkv.setMsg("");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else {
            C2382909Vj.LIZ(this.LLILLL, 0, "download fail", null, 4);
        }
        this.LLILZ.LLILLL.remove(this.LLILLJJLI.getResourceId());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadLiveEffectMethod@fd9a.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
