package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {421, 423, 425, 432, 434, 437}, m = "invokeSuspend")
public final class C1394305cz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC20074613ge LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1394305cz(AbstractC20074613ge abstractC20074613ge, InterfaceC1364105Vn<? super C1394305cz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = abstractC20074613ge;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1394305cz c1394305cz = new C1394305cz(this.LLILZIL, interfaceC1364105Vn);
        c1394305cz.LLILZ = obj;
        return c1394305cz;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:27|(1:29)|56|30|(2:32|51)|62|33|(2:38|(2:40|(2:42|53)))(2:35|(2:37|52))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[Catch: CancellationException -> 0x00ce, TryCatch #3 {CancellationException -> 0x00ce, blocks: (B:33:0x00a2, B:35:0x00a8, B:38:0x00ba, B:40:0x00be), top: B:62:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: CancellationException -> 0x00ce, TryCatch #3 {CancellationException -> 0x00ce, blocks: (B:33:0x00a2, B:35:0x00a8, B:38:0x00ba, B:40:0x00be), top: B:62:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0077 -> B:15:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b7 -> B:15:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00bc -> B:15:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00cb -> B:15:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00e3 -> B:15:0x0040). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394305cz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
