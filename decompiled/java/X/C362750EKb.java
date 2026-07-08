package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.template.logic.CaptionTemplateCoordinator$autoSelectCaptionSlot$1", f = "CaptionTemplateCoordinator.kt", l = {510}, m = "invokeSuspend")
public final class C362750EKb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C362780EKe LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C362750EKb(C362780EKe c362780EKe, InterfaceC1364105Vn<? super C362750EKb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c362780EKe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C362750EKb c362750EKb = new C362750EKb(this.LLILZ, interfaceC1364105Vn);
        c362750EKb.LLILLL = obj;
        return c362750EKb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:13:0x0037, B:24:0x0090], limit reached: 79 */
    /* JADX WARN: Path cross not found for [B:8:0x0025, B:25:0x0092], limit reached: 79 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Type inference failed for: r0v47, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x015d -> B:6:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362750EKb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
