package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.common.EPAICreateResourceUtils$ensureResourceDownloaded$2", f = "EPAICreateResourceUtils.kt", l = {542, 478}, m = "invokeSuspend")
public final class C2212408le extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends File>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C0VSJ LLILZ;
    public InterfaceC383701eN LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2212408le(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C2212408le> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2212408le(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
    
        if (r1 > 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134 A[Catch: all -> 0x017e, TryCatch #1 {all -> 0x017e, blocks: (B:44:0x0125, B:45:0x012e, B:47:0x0134, B:49:0x0141, B:51:0x0147, B:58:0x015f, B:59:0x0178, B:53:0x014f, B:61:0x017a), top: B:68:0x0125 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212408le.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends File>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
