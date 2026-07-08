package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.mob.SearchMusicMiddlePerfMobHelper$processTrendingData$2$result$1", f = "SearchMusicMiddlePerfMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C673100Qai extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Long>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673100Qai(String str, boolean z, InterfaceC1364105Vn<? super C673100Qai> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C673100Qai c673100Qai = new C673100Qai(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c673100Qai.LL = obj;
        return c673100Qai;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[PHI: r7
      0x00cc: PHI (r7v1 int) = (r7v0 int), (r7v3 int), (r7v3 int), (r7v3 int), (r7v3 int) binds: [B:30:0x0099, B:46:0x00c9, B:39:0x00b1, B:41:0x00b7, B:43:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C673100Qai.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
