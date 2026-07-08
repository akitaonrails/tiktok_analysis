package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$getTotalPage$2", f = "DraftLoader.kt", l = {}, m = "invokeSuspend")
public final class C561300Lzs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0M03 LL;
    public final /* synthetic */ EnumC562200M3e LLILLJJLI;
    public final /* synthetic */ C562260M3k LLILLL;
    public final /* synthetic */ C0M0Z LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561300Lzs(C0M03 c0m03, EnumC562200M3e enumC562200M3e, C562260M3k c562260M3k, C0M0Z c0m0z, boolean z, InterfaceC1364105Vn<? super C561300Lzs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m03;
        this.LLILLJJLI = enumC562200M3e;
        this.LLILLL = c562260M3k;
        this.LLILZ = c0m0z;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561300Lzs(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftLoader@8d42.getTotalPage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0M03 c0m03 = this.LL;
        EnumC562200M3e enumC562200M3e = this.LLILLJJLI;
        c0m03.getClass();
        int iLIZLLL = C0M4A.LIZLLL(new C0M4E(enumC562200M3e, null, null, false, EnumC562220M3g.NORMAL, null, this.LLILLL, this.LLILZ, false, null, 814));
        C0M03 c0m032 = this.LL;
        boolean z = this.LLILZIL;
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTotalCount: ");
        sbLIZ.append(iLIZLLL);
        C201955140j.LJIJJ(c0may, "DraftLoader", C2188811AlT.LIZIZ(sbLIZ));
        c0m032.LJII = iLIZLLL;
        int i = 1;
        if (!z) {
            int i2 = iLIZLLL / 48;
            if (iLIZLLL % 48 == 0) {
                i = 0;
            }
            i += i2;
        }
        c0m03.LJI = i;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftLoader@8d42.getTotalPage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
