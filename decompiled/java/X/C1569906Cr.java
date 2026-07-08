package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.acb.StreakPetAcbButtonExposeRepository$clearRecord$1", f = "StreakPetAcbButtonExposeRepository.kt", l = {}, m = "invokeSuspend")
public final class C1569906Cr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1570106Ct LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569906Cr(C1570106Ct c1570106Ct, String str, InterfaceC1364105Vn<? super C1569906Cr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1570106Ct;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1569906Cr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetAcbButtonExposeRepository@8e69.clearRecord$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1570106Ct c1570106Ct = this.LL;
        String str = this.LLILLJJLI;
        c1570106Ct.getClass();
        if (C1570106Ct.LJ(str)) {
            boolean z = C1590806Ks.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakPetAcbButtonExposeRepository clearRecord [SDK] ");
            sbLIZ.append(this.LLILLJJLI);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC12999056v interfaceC12999056vLIZIZ = this.LL.LIZIZ(this.LLILLJJLI);
            if (interfaceC12999056vLIZIZ != null) {
                interfaceC12999056vLIZIZ.LIZLLL(EnumC12995056r.SHOW, this.LLILLJJLI);
            }
        } else {
            C1570106Ct c1570106Ct2 = this.LL;
            String str2 = this.LLILLJJLI;
            c1570106Ct2.getClass();
            String strLIZ = C1570106Ct.LIZ(str2);
            boolean z2 = C1590806Ks.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("StreakPetAcbButtonExposeRepository clearRecord ");
            sbLIZ2.append(strLIZ);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            this.LL.LIZ.invoke().storeInt(strLIZ, 0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetAcbButtonExposeRepository@8e69.clearRecord$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
