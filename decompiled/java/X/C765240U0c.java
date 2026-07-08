package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeQueueMessageActionHandler$handle$1", f = "KaraokeQueueMessageActionHandler.kt", l = {44, 53, 61, 71, 82, 84}, m = "invokeSuspend")
public final class C765240U0c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ C765420U0u LLILLL;
    public final /* synthetic */ C765260U0e LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765240U0c(C765420U0u c765420U0u, C765260U0e c765260U0e, long j, InterfaceC1364105Vn<? super C765240U0c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c765420U0u;
        this.LLILZ = c765260U0e;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C765240U0c(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0126, code lost:
    
        if (r2.LIZ(r1, r11) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a1, code lost:
    
        if (r3.LIZ(r2, r11) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c7, code lost:
    
        if (r5.LIZ(r3, r11) == r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165 A[PHI: r3
      0x0165: PHI (r3v3 boolean) = (r3v1 boolean), (r3v0 boolean), (r3v6 boolean), (r3v10 boolean), (r3v11 boolean), (r3v12 boolean), (r3v0 boolean) binds: [B:48:0x0162, B:36:0x012c, B:39:0x0146, B:42:0x015b, B:23:0x00ee, B:18:0x00af, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C765240U0c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
