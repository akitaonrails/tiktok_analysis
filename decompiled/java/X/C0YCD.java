package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YCD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.commandmessage.StatusMessageCompletenessUseCase$handleExecutionCompletenessCheck$1", f = "StatusMessageCompletenessUseCase.kt", l = {116}, m = "invokeSuspend")
public final class C0YCD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0YCE LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C0YFV LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ C0YCE LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YCD(C0YCE c0yce, InterfaceC1364105Vn<? super C0YCD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = c0yce;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YCD(this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01e9 -> B:38:0x0206). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0222 -> B:54:0x02c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0226 -> B:54:0x02c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x026e -> B:53:0x02a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x02d6 -> B:6:0x0032). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YCD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
