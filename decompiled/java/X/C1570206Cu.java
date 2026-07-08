package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.acb.StreakPetAcbButtonExposeRepository$forceHitExposedLimit$1", f = "StreakPetAcbButtonExposeRepository.kt", l = {}, m = "invokeSuspend")
public final class C1570206Cu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1570106Ct LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570206Cu(C1570106Ct c1570106Ct, String str, InterfaceC1364105Vn<? super C1570206Cu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1570106Ct;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1570206Cu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        C1C7U.LIZ("StreakPetAcbButtonExposeRepository@8e69.forceHitExposedLimit$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1570106Ct c1570106Ct = this.LL;
        String str = this.LLILLJJLI;
        c1570106Ct.getClass();
        if (C1570106Ct.LJ(str)) {
            if (this.LL.LIZLLL(this.LLILLJJLI)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StreakPetAcbButtonExposeRepository@8e69.forceHitExposedLimit$1");
                return unit;
            }
            InterfaceC12999056v interfaceC12999056vLIZIZ = this.LL.LIZIZ(this.LLILLJJLI);
            int iIntValue = ((Number) this.LL.LIZJ.invoke(this.LLILLJJLI)).intValue();
            String str2 = this.LLILLJJLI;
            for (int i = 0; i < iIntValue; i++) {
                if (interfaceC12999056vLIZIZ != null) {
                    EnumC12995056r enumC12995056r = EnumC12995056r.SHOW;
                    IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                    if (iMHostApi != null) {
                        jCurrentTimeMillis = iMHostApi.LIZIZ();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                    if (iMHostApi2 != null) {
                        jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                    }
                    interfaceC12999056vLIZIZ.LJ(enumC12995056r, str2, jCurrentTimeMillis, jCurrentTimeMillis2);
                }
            }
            boolean z = C1590806Ks.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakPetAcbButtonExposeRepository fillExposed [SDK] ");
            sbLIZ.append(this.LLILLJJLI);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C1570106Ct c1570106Ct2 = this.LL;
            String str3 = this.LLILLJJLI;
            c1570106Ct2.getClass();
            String strLIZ = C1570106Ct.LIZ(str3);
            if (this.LL.LIZLLL(this.LLILLJJLI)) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("StreakPetAcbButtonExposeRepository@8e69.forceHitExposedLimit$1");
                return unit2;
            }
            int iIntValue2 = ((Number) this.LL.LIZJ.invoke(this.LLILLJJLI)).intValue();
            boolean z2 = C1590806Ks.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("StreakPetAcbButtonExposeRepository fillExposed ");
            sbLIZ2.append(strLIZ);
            sbLIZ2.append(" times");
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            this.LL.LIZ.invoke().storeInt(strLIZ, iIntValue2);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetAcbButtonExposeRepository@8e69.forceHitExposedLimit$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
