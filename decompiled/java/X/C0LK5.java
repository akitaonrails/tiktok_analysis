package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LK5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.TemplateFL2VTask$loopRefreshProgress$1", f = "TemplateFL2VTask.kt", l = {284, 287}, m = "invokeSuspend")
public final class C0LK5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C543190LSb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LK5(C543190LSb c543190LSb, InterfaceC1364105Vn<? super C0LK5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c543190LSb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LK5(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:20:0x0054, B:24:0x005e], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:24:0x005e, B:20:0x0054], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:33:0x0076, B:41:0x008c], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:41:0x008c, B:33:0x0076], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:48:0x00de, B:27:0x0064], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:48:0x00de, B:29:0x006a], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:49:0x00e3, B:14:0x0043], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:58:0x0104, B:12:0x003d], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x012b -> B:8:0x001e). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LK5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
