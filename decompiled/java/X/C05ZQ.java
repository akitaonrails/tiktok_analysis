package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {971, 993}, m = "invokeSuspend")
public final class C05ZQ extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public C20067313fT LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ C259800zU<C20066813fO> LLIZ;
    public final /* synthetic */ C259800zU<C20066813fO> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ZQ(C013C c013c, C259800zU<C20066813fO> c259800zU, C259800zU<C20066813fO> c259800zU2, InterfaceC1364105Vn<? super C05ZQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c013c;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05ZQ c05zq = new C05ZQ(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c05zq.LLILZIL = obj;
        return c05zq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r1 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r14.LLIZ.element = r1;
        r14.LLIZLLLIL.element = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r6 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0032 A[EDGE_INSN: B:60:0x0032->B:12:0x0032 BREAK  A[LOOP:0: B:8:0x0023->B:33:0x00a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0108 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05ZQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
