package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15VF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.image.ImagePreloadService$triggerPreloadVideo$1", f = "ImagePreloadService.kt", l = {255, 262}, m = "invokeSuspend")
public final class C15VF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C15VE LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15VF(C15VE c15ve, InterfaceC1364105Vn<? super C15VF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c15ve;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15VF(this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: Exception -> 0x01db, TRY_ENTER, TryCatch #1 {Exception -> 0x01db, blocks: (B:64:0x00ef, B:65:0x00f3, B:67:0x00fa, B:68:0x00fb, B:69:0x0104, B:71:0x010a, B:73:0x0115, B:79:0x0121, B:80:0x0125, B:83:0x012e, B:84:0x013b, B:86:0x0141, B:88:0x014b, B:89:0x014f, B:91:0x0155, B:93:0x015d, B:96:0x0166, B:97:0x0176, B:99:0x017c, B:101:0x018d, B:102:0x0191, B:103:0x0197, B:105:0x019d, B:113:0x01b6, B:116:0x01d7, B:117:0x01d8, B:43:0x0098, B:20:0x0052, B:21:0x0056, B:37:0x0082, B:40:0x0087, B:46:0x009e, B:47:0x009f, B:48:0x00a0, B:63:0x00d5, B:66:0x00f4, B:22:0x0057, B:24:0x005d, B:27:0x0064, B:28:0x0068, B:30:0x006e, B:106:0x01a3, B:108:0x01a9, B:111:0x01b1), top: B:126:0x0098, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0095 -> B:126:0x0098). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15VF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
