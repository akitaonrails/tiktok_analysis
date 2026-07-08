package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13Ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {142, 146, 169}, m = "invokeSuspend")
public final class C20029413Ym extends C09AX implements Function2<InterfaceC346701Wf<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C19994113Kx LL;
    public Function1 LLILLJJLI;
    public C095E LLILLL;
    public C13Y9 LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ Function0<Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20029413Ym(Function0<Object> function0, InterfaceC1364105Vn<? super C20029413Ym> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20029413Ym c20029413Ym = new C20029413Ym(this.LLIZLLLIL, interfaceC1364105Vn);
        c20029413Ym.LLIZ = obj;
        return c20029413Ym;
    }

    /* JADX WARN: Path cross not found for [B:28:0x00c2, B:52:0x011f], limit reached: 105 */
    /* JADX WARN: Path cross not found for [B:30:0x00d1, B:48:0x0118], limit reached: 105 */
    /* JADX WARN: Path cross not found for [B:33:0x00e3, B:46:0x0113], limit reached: 105 */
    /* JADX WARN: Path cross not found for [B:52:0x011f, B:28:0x00c2], limit reached: 105 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2 A[Catch: all -> 0x018b, TryCatch #4 {all -> 0x018b, blocks: (B:8:0x0023, B:22:0x00a4, B:26:0x00bd, B:28:0x00c2, B:31:0x00d2, B:33:0x00e3, B:35:0x00ed, B:39:0x00fa, B:53:0x0120, B:56:0x012e, B:60:0x0146, B:62:0x014f, B:75:0x0177, B:76:0x017a, B:42:0x0107, B:47:0x0115, B:25:0x00ba, B:21:0x00a1, B:14:0x0074, B:18:0x0089, B:83:0x0187, B:84:0x018a, B:15:0x007e, B:17:0x0086, B:79:0x017f, B:80:0x0182, B:16:0x0082, B:57:0x013b, B:59:0x0143, B:71:0x016f, B:72:0x0172, B:58:0x013f), top: B:96:0x000d, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #4 {all -> 0x018b, blocks: (B:8:0x0023, B:22:0x00a4, B:26:0x00bd, B:28:0x00c2, B:31:0x00d2, B:33:0x00e3, B:35:0x00ed, B:39:0x00fa, B:53:0x0120, B:56:0x012e, B:60:0x0146, B:62:0x014f, B:75:0x0177, B:76:0x017a, B:42:0x0107, B:47:0x0115, B:25:0x00ba, B:21:0x00a1, B:14:0x0074, B:18:0x0089, B:83:0x0187, B:84:0x018a, B:15:0x007e, B:17:0x0086, B:79:0x017f, B:80:0x0182, B:16:0x0082, B:57:0x013b, B:59:0x0143, B:71:0x016f, B:72:0x0172, B:58:0x013f), top: B:96:0x000d, inners: #0, #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x012c -> B:66:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x014d -> B:66:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0165 -> B:66:0x0166). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029413Ym.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
