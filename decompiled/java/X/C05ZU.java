package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ZU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {386, 409}, m = "invokeSuspend")
public final class C05ZU extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ EnumC20065813fE LLILZ;
    public final /* synthetic */ C259800zU<AbstractC1376805aA> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ZU(EnumC20065813fE enumC20065813fE, C259800zU<AbstractC1376805aA> c259800zU, InterfaceC1364105Vn<? super C05ZU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = enumC20065813fE;
        this.LLILZIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05ZU c05zu = new C05ZU(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c05zu.LLILLL = obj;
        return c05zu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r13.LLILZIL.element = X.C1376905aB.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        return kotlin.Unit.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (X.C05ZR.LIZ(r14) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        r13.LLILZIL.element = X.C1377005aC.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r12 = r14.LIZ;
        r11 = r12.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r5 >= r11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        r4 = (X.C20066813fO) com.bytedance.mt.protector.impl.collections.ListProtector.get(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r4.LIZIZ() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (X.C05ZS.LIZLLL(r4, r6.LIZ(), r6.LJJLL()) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        r13.LLILZIL.element = X.C1376905aB.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        r0 = X.EnumC20065813fE.Final;
        r13.LLILLL = r6;
        r13.LLILLJJLI = 2;
        r14 = r6.LJJIJIL(r0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if (r14 != r10) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, X.05aB] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, X.05aC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, X.05aB] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.05a9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b2 -> B:7:0x0016). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05ZU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
