package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Bck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingMonitor$startLoop$1", f = "PublishStuckEventTrackingMonitor.kt", l = {174}, m = "invokeSuspend")
public final class C2208881Bck extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2208891Bcl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2208881Bck(C2208891Bcl c2208891Bcl, InterfaceC1364105Vn<? super C2208881Bck> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2208891Bcl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2208881Bck c2208881Bck = new C2208881Bck(this.LLILLL, interfaceC1364105Vn);
        c2208881Bck.LLILLJJLI = obj;
        return c2208881Bck;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:5|6|(1:8)(1:77)|9|(21:11|(0)(1:15)|16|(18:18|(2:19|(2:91|75)(3:21|(2:23|93)(2:74|94)|(1:92)(1:95)))|(0)|31|(3:33|(2:34|(2:96|73)(3:36|(2:38|98)(2:72|99)|(1:97)(1:100)))|(1:45))|46|(3:50|(1:52)(1:71)|(1:54))|55|89|56|(1:61)(1:60)|(1:63)|64|67|(1:69)|70|79|(6:81|(2:83|84)|6|(0)(0)|9|(0))(2:87|88))|30|31|(0)|46|(4:48|50|(0)(0)|(0))|55|89|56|(1:58)|61|(0)|64|67|(0)|70|79|(0)(0))|76|16|(0)|30|31|(0)|46|(0)|55|89|56|(0)|61|(0)|64|67|(0)|70|79|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0143, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4);
        r1 = new X.C098200Yq(r4);
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Path cross not found for [B:11:0x0034, B:76:0x017b], limit reached: 101 */
    /* JADX WARN: Path cross not found for [B:18:0x007f, B:30:0x00a8], limit reached: 101 */
    /* JADX WARN: Path cross not found for [B:30:0x00a8, B:18:0x007f], limit reached: 101 */
    /* JADX WARN: Path cross not found for [B:58:0x0126, B:61:0x012f], limit reached: 101 */
    /* JADX WARN: Path cross not found for [B:61:0x012f, B:58:0x0126], limit reached: 101 */
    /* JADX WARN: Path cross not found for [B:76:0x017b, B:11:0x0034], limit reached: 101 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:56:0x011a, B:58:0x0126, B:60:0x012a, B:63:0x0132, B:64:0x013a), top: B:89:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:56:0x011a, B:58:0x0126, B:60:0x012a, B:63:0x0132, B:64:0x013a), top: B:89:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01de -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2208881Bck.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
