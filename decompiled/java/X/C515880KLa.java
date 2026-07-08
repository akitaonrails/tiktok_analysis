package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.productfetch.ResubscribeStrategy$resubscribe$2$2", f = "ResubscribeStrategy.kt", l = {157}, m = "invokeSuspend")
public final class C515880KLa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C0KMZ LLILLJJLI;
    public final /* synthetic */ C517630KRt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515880KLa(C0KMZ c0kmz, C517630KRt c517630KRt, InterfaceC1364105Vn<? super C515880KLa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kmz;
        this.LLILLL = c517630KRt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C515880KLa(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ResubscribeStrategy@155b.resubscribe$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C0KMZ c0kmz = this.LLILLJJLI;
            C517630KRt c517630KRt = this.LLILLL;
            final String str = c517630KRt.LIZLLL;
            final String str2 = c517630KRt.LJ;
            this.LL = 1;
            c0kmz.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            final long jCurrentTimeMillis = System.currentTimeMillis();
            c0kmz.LIZJ.LIZ(new C1617170sBX("80UJVV6Y1101", (List<String>) Collections.singletonList(str), "subs"), new InterfaceC1791300wiO() { // from class: X.0KLk
                public final /* synthetic */ String LIZLLL = "recover_sub";

                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                @Override // X.InterfaceC1791300wiO
                public final void LIZLLL(C518150KTt c518150KTt) {
                    EnumC1792020wjY enumC1792020wjY;
                    EnumC1792020wjY enumC1792020wjY2;
                    IapProductDetail iapProductDetail;
                    String strLIZ;
                    int value = 0;
                    if (c518150KTt.LIZ) {
                        Map<String, IapProductDetail> map = c518150KTt.LIZIZ;
                        if (map != null && (iapProductDetail = map.get(str)) != null && (strLIZ = iapProductDetail.LIZ(str2, "")) != null) {
                            InterfaceC1364105Vn<String> interfaceC1364105Vn = c23260099m;
                            C189200o6.m2constructorimpl(strLIZ);
                            interfaceC1364105Vn.resumeWith(strLIZ);
                            return;
                        }
                        C516000KLm c516000KLm = C516000KLm.LIZ;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C0KQW c0kqw = c518150KTt.LIZJ;
                        if (c0kqw != null && (enumC1792020wjY2 = c0kqw.LIZ) != null) {
                            value = enumC1792020wjY2.getValue();
                        }
                        Integer numValueOf = Integer.valueOf(value);
                        String str3 = this.LIZLLL;
                        String str4 = c0kmz.LIZ;
                        c516000KLm.getClass();
                        C516000KLm.LJIJ(jCurrentTimeMillis2, numValueOf, str3, str4, true);
                        InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                        C189200o6.m2constructorimpl(null);
                        interfaceC1364105Vn2.resumeWith(null);
                        return;
                    }
                    InterfaceC1364105Vn<String> interfaceC1364105Vn3 = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn3.resumeWith(null);
                    C516000KLm c516000KLm2 = C516000KLm.LIZ;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C0KQW c0kqw2 = c518150KTt.LIZJ;
                    if (c0kqw2 != null && (enumC1792020wjY = c0kqw2.LIZ) != null) {
                        value = enumC1792020wjY.getValue();
                    }
                    Integer numValueOf2 = Integer.valueOf(value);
                    String str5 = this.LIZLLL;
                    String str6 = c0kmz.LIZ;
                    c516000KLm2.getClass();
                    C516000KLm.LJIJ(jCurrentTimeMillis3, numValueOf2, str5, str6, true);
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ResubscribeStrategy@155b.resubscribe$2$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ResubscribeStrategy@155b.resubscribe$2$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
