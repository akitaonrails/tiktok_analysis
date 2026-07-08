package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.tux.skeleton.text.config.PlaceholderConfigParser$readTextConfig$1", f = "PlaceholderConfigParser.kt", l = {91, 96}, m = "invokeSuspend")
public final class C08WO extends C09AW implements Function2<AbstractC1421005hI<? super String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C20626915nX LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WO(C20626915nX c20626915nX, InterfaceC1364105Vn<? super C08WO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c20626915nX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C08WO c08wo = new C08WO(this.LLILZIL, interfaceC1364105Vn);
        c08wo.LLILZ = obj;
        return c08wo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        r0 = r7.toString();
        r10.LLILZ = r2;
        r10.LLILLJJLI = r7;
        r10.LLILLL = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (r2.LIZ(r0, r10) != r3) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        X.C1C7U.LIZIZ("PlaceholderConfigParser@419f.readTextConfig$1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:7:0x0020). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08WO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super String> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
