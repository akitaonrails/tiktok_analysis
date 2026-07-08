package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.data.repository.CreatorRankingPageRepositoryImpl$getOrFetch$1", f = "CreatorRankingPageRepositoryImpl.kt", l = {148, 159, 161, 162, 171}, m = "invokeSuspend")
public final class C862820Xt2 extends C09AX implements Function2<InterfaceC346701Wf<? super C0YT0>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1785380wYq LL;
    public C874670YSz LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0YUW LLILZIL;
    public final /* synthetic */ C861890XrX LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862820Xt2(long j, long j2, C0YUW c0yuw, C861890XrX c861890XrX, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c0yuw;
        this.LLILZLL = c861890XrX;
        this.LLIZ = j;
        this.LLIZLLLIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C862820Xt2 c862820Xt2 = new C862820Xt2(this.LLIZ, this.LLIZLLLIL, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c862820Xt2.LLILZ = obj;
        return c862820Xt2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C862820Xt2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0YT0> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
