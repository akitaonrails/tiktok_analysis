package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0o3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.preload.PreEmbTaskManager$deselectMedia$1", f = "PreEmbTaskManager.kt", l = {1358, 1374}, m = "invokeSuspend")
public final class C1458380o3Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C1458730o3z LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1458730o3z LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ ShortVideoContext LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458380o3Q(C1458730o3z c1458730o3z, boolean z, ShortVideoContext shortVideoContext, boolean z2, InterfaceC1364105Vn<? super C1458380o3Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1458730o3z;
        this.LLILZIL = z;
        this.LLILZLL = shortVideoContext;
        this.LLIZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1458380o3Q(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e6 A[Catch: all -> 0x021e, TRY_LEAVE, TryCatch #1 {all -> 0x021e, blocks: (B:74:0x01d9, B:76:0x01e6, B:79:0x01ef, B:81:0x01f5, B:82:0x01f9, B:83:0x0202, B:85:0x0208, B:87:0x0213, B:89:0x0219), top: B:117:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ef A[Catch: all -> 0x021e, TRY_ENTER, TryCatch #1 {all -> 0x021e, blocks: (B:74:0x01d9, B:76:0x01e6, B:79:0x01ef, B:81:0x01f5, B:82:0x01f9, B:83:0x0202, B:85:0x0208, B:87:0x0213, B:89:0x0219), top: B:117:0x01d9 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458380o3Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
