package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.common.EPAICreateResourceUtils$ensureModelIconDownloaded$2", f = "EPAICreateResourceUtils.kt", l = {542, 159}, m = "invokeSuspend")
public final class C2212508lf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends File>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C0VSJ LLILZ;
    public InterfaceC383701eN LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2212508lf(String str, InterfaceC1364105Vn<? super C2212508lf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2212508lf(this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0149, code lost:
    
        if (r1 > 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130 A[Catch: all -> 0x017a, TryCatch #1 {all -> 0x017a, blocks: (B:44:0x0121, B:45:0x012a, B:47:0x0130, B:49:0x013d, B:51:0x0143, B:58:0x015b, B:59:0x0174, B:53:0x014b, B:61:0x0176), top: B:68:0x0121 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212508lf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends File>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
