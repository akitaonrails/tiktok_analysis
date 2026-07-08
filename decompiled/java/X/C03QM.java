package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03QM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.jsb.impl.EcGetSoftInterceptInfoMethod$handle$1", f = "EcGetSoftInterceptInfoMethod.kt", l = {42}, m = "invokeSuspend")
public final class C03QM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC841403Qm LLILLJJLI;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLL;
    public final /* synthetic */ CompletionBlock<InterfaceC840203Qa> LLILZ;
    public final /* synthetic */ C842203Qu LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03QM(InterfaceC841403Qm interfaceC841403Qm, OrderSubmitAssemViewModel orderSubmitAssemViewModel, CompletionBlock<InterfaceC840203Qa> completionBlock, C842203Qu c842203Qu, InterfaceC1364105Vn<? super C03QM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC841403Qm;
        this.LLILLL = orderSubmitAssemViewModel;
        this.LLILZ = completionBlock;
        this.LLILZIL = c842203Qu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03QM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0471 A[LOOP:1: B:225:0x046b->B:227:0x0471, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b2  */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r79) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
