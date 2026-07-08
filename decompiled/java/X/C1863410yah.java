package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.channel.TakoWsClient$handleNewMessageSync$1", f = "TakoWsClient.kt", l = {162, 163, 164}, m = "invokeSuspend")
public final class C1863410yah extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public C1863380yae LLILLL;
    public int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863410yah(long j, long j2, InterfaceC1364105Vn<? super C1863410yah> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = j;
        this.LLILZLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863410yah(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863410yah.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
