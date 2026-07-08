package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.network.NetworkHandler$exchangeSession$2", f = "NetworkHandler.kt", l = {105}, m = "invokeSuspend")
public final class C1706930uWJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Throwable>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1713530ugx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706930uWJ(C1713530ugx c1713530ugx, InterfaceC1364105Vn<? super C1706930uWJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1713530ugx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706930uWJ(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:27:0x0067, B:28:0x006a, B:30:0x006e, B:32:0x0089, B:33:0x008f, B:35:0x0095, B:37:0x00a3, B:39:0x00af, B:40:0x00b1, B:41:0x00b4), top: B:55:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706930uWJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Throwable> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
