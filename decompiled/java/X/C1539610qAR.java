package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539610qAR extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C1539580qAO LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function2<byte[], String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1539610qAR(C1539580qAO c1539580qAO, long j, Function2<? super byte[], ? super String, Unit> function2) {
        super(1);
        this.LL = c1539580qAO;
        this.LLILLJJLI = j;
        this.LLILLL = function2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        Object obj;
        C1075770e6J c1075770e6J;
        C1537910q7h c1537910q7h;
        C1533790q13 c1533790q132 = c1533790q13;
        InterfaceC1531560pxS interfaceC1531560pxS = this.LL.LIZ.hybridParams;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            obj = c1537910q7h.LJJIII;
        } else {
            obj = null;
        }
        if (obj instanceof C1075770e6J) {
            c1075770e6J = (C1075770e6J) obj;
        } else {
            c1075770e6J = null;
        }
        if (c1075770e6J != null) {
            Intrinsics.LJFF(c1533790q132.LJ, "cdn");
            C1533490q0Z c1533490q0Z = c1533790q132.LIZ;
            String str = c1533490q0Z.LJJJJIZL;
            C1533510q0b c1533510q0b = c1533490q0Z.LJJJJLI;
            c1075770e6J.LJIIL(new C1543110qG5(str, c1533510q0b.LIZIZ, c1533510q0b.LIZJ));
        }
        this.LL.LJIIIIZZ.put("fetch_template_cost", Long.valueOf(System.currentTimeMillis() - this.LLILLJJLI));
        if (c1533790q132.LIZIZ) {
            this.LL.LJI = EnumC1539690qAZ.FETCH_RESPONSE_SUCCESS;
            String str2 = c1533790q132.LJ;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1077756671:
                        if (str2.equals("memory")) {
                            this.LL.LJII = EnumC1539740qAe.MEMORY;
                        }
                        break;
                    case 98349:
                        if (str2.equals("cdn")) {
                            this.LL.LJII = EnumC1539740qAe.CDN;
                        }
                        break;
                    case 98230121:
                        if (str2.equals("gecko")) {
                            this.LL.LJII = EnumC1539740qAe.GECKO;
                        }
                        break;
                    case 230960163:
                        if (str2.equals("builtin")) {
                            this.LL.LJII = EnumC1539740qAe.BUILTIN;
                        }
                        break;
                }
            }
            C1539580qAO c1539580qAO = this.LL;
            C1537480q70 c1537480q70 = c1539580qAO.LIZ;
            if (c1537480q70 != null) {
                C1530570pvr.LJFF(c1537480q70, EnumC1537150q6T.SLSR_HYDRATE_FROM, c1539580qAO.LJII.toString());
            }
            byte[] bArrLJIIIZ = c1533790q132.LJIIIZ();
            if (bArrLJIIIZ != null) {
                Function2<byte[], String, Unit> function2 = this.LLILLL;
                C1539580qAO c1539580qAO2 = this.LL;
                if (function2 != null) {
                    function2.invoke(bArrLJIIIZ, null);
                } else {
                    c1539580qAO2.LJIILJJIL = true;
                    c1539580qAO2.LJIILL = bArrLJIIIZ;
                }
            } else {
                C1539580qAO c1539580qAO3 = this.LL;
                Function2<byte[], String, Unit> function22 = this.LLILLL;
                c1539580qAO3.LJI(EnumC1539690qAZ.HYDRATION_FAILED, 225, "Response is exceptional when load template content, ");
                if (function22 != null) {
                    function22.invoke(null, "response success, but bytes is null");
                }
            }
        } else {
            this.LL.LJI = EnumC1539690qAZ.FETCH_RESPONSE_FAILED;
            C1533810q15 c1533810q15 = c1533790q132.LIZLLL;
            int i = c1533810q15.LIZJ;
            if (i != 0 && i != 200) {
                Function2<byte[], String, Unit> function23 = this.LLILLL;
                if (function23 != null) {
                    function23.invoke(null, String.valueOf(i));
                }
            } else {
                Function2<byte[], String, Unit> function24 = this.LLILLL;
                if (function24 != null) {
                    function24.invoke(null, c1533810q15.toString());
                }
            }
        }
        return Unit.LIZ;
    }
}
