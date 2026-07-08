package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NHC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$triggerFetchCache$3", f = "GoldenHouse.kt", l = {548}, m = "invokeSuspend")
public final class C0NHC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0NH6 LLILZ;
    public final /* synthetic */ C0NHJ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NHC(C0NH6 c0nh6, C0NHJ c0nhj, InterfaceC1364105Vn<? super C0NHC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0nh6;
        this.LLILZIL = c0nhj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NHC(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4 A[Catch: Exception -> 0x015b, TryCatch #3 {Exception -> 0x015b, blocks: (B:31:0x00c1, B:35:0x00ce, B:36:0x00d0, B:38:0x00d4, B:40:0x00db, B:43:0x00e1, B:44:0x00e3, B:46:0x00f2, B:48:0x0123, B:49:0x0132, B:50:0x014a, B:52:0x0157), top: B:67:0x00c1, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2 A[Catch: Exception -> 0x015b, TryCatch #3 {Exception -> 0x015b, blocks: (B:31:0x00c1, B:35:0x00ce, B:36:0x00d0, B:38:0x00d4, B:40:0x00db, B:43:0x00e1, B:44:0x00e3, B:46:0x00f2, B:48:0x0123, B:49:0x0132, B:50:0x014a, B:52:0x0157), top: B:67:0x00c1, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.util.ArrayList] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NHC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
