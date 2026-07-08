package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YUV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.data.repository.CreatorRankingPageRepositoryImpl$fetch$2", f = "CreatorRankingPageRepositoryImpl.kt", l = {220, 77, 230, 85, 240, 240, 240}, m = "invokeSuspend")
public final class C0YUV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0YT0>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C861890XrX LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ C861890XrX LLJ;
    public final /* synthetic */ C0YUW LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YUV(long j, long j2, C0YUW c0yuw, C861890XrX c861890XrX, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = j;
        this.LLIZLLLIL = j2;
        this.LLJ = c861890XrX;
        this.LLJI = c0yuw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YUV(this.LLIZ, this.LLIZLLLIL, this.LLJI, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:44:0x014c, B:46:0x0152, B:48:0x0165, B:49:0x0184, B:50:0x0188, B:52:0x018c, B:60:0x01d5, B:61:0x01da, B:53:0x01a1, B:55:0x01a5, B:62:0x01db, B:63:0x01e0), top: B:102:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:44:0x014c, B:46:0x0152, B:48:0x0165, B:49:0x0184, B:50:0x0188, B:52:0x018c, B:60:0x01d5, B:61:0x01da, B:53:0x01a1, B:55:0x01a5, B:62:0x01db, B:63:0x01e0), top: B:102:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021c  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YUV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0YT0> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
