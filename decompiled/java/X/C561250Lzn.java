package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Lzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$queryDraftMemorySize$2", f = "DraftLoader.kt", l = {}, m = "invokeSuspend")
public final class C561250Lzn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public final /* synthetic */ C0M03 LL;
    public final /* synthetic */ C562260M3k LLILLJJLI;
    public final /* synthetic */ C0M0Z LLILLL;
    public final /* synthetic */ C561130Lzb LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561250Lzn(C0M03 c0m03, C562260M3k c562260M3k, C0M0Z c0m0z, C561130Lzb c561130Lzb, InterfaceC1364105Vn<? super C561250Lzn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m03;
        this.LLILLJJLI = c562260M3k;
        this.LLILLL = c0m0z;
        this.LLILZ = c561130Lzb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561250Lzn(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftLoader@8d42.queryDraftMemorySize$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC562200M3e enumC562200M3eLJ = C0M4D.LJ();
        this.LL.getClass();
        Long second = C0M4A.LJFF(new C0M4E(enumC562200M3eLJ, null, null, true, EnumC562220M3g.NORMAL, null, this.LLILLJJLI, this.LLILLL, true, null, 550), new AwS587S0100000_8(this.LLILZ, 5)).getSecond();
        C1C7U.LIZIZ("DraftLoader@8d42.queryDraftMemorySize$2");
        return second;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
