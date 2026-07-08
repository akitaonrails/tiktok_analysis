package X;

import com.bytedance.android.livesdk.chatroom.model.UpdateStatusResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01QB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.utils.StatusReportRetryUtilsKt$sendStatusV3$1$1$1$job$1", f = "StatusReportRetryUtils.kt", l = {97, 102}, m = "invokeSuspend")
public final class C01QB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C01QC LLILZLL;
    public final /* synthetic */ C259800zU<C470590Icr<UpdateStatusResponse>> LLIZ;
    public final /* synthetic */ List<C09AE> LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ C259800zU<Throwable> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QB(int i, int i2, long j, C01QC c01qc, C259800zU<C470590Icr<UpdateStatusResponse>> c259800zU, List<C09AE> list, C118300cf c118300cf, C259800zU<Throwable> c259800zU2, InterfaceC1364105Vn<? super C01QB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = j;
        this.LLILZLL = c01qc;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = list;
        this.LLJ = c118300cf;
        this.LLJI = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01QB c01qb = new C01QB(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c01qb.LLILLJJLI = obj;
        return c01qb;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:57)|(1:(1:(6:6|7|28|(3:31|(2:34|32)|64)|51|52)(2:8|9))(2:10|11))(3:12|13|(2:15|16))|55|17|(3:58|19|20)(12:21|53|22|62|23|60|24|(2:26|27)|28|(3:31|(1:32)|64)|51|52)|46|(1:50)|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: all -> 0x00bd, LOOP:0: B:32:0x00ac->B:34:0x00b2, LOOP_END, TRY_LEAVE, TryCatch #4 {all -> 0x00bd, blocks: (B:28:0x0098, B:31:0x00a2, B:32:0x00ac, B:34:0x00b2, B:24:0x0084), top: B:60:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, X.0Icr] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Throwable] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01QB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
