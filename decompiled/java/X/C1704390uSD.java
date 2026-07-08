package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0uSD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.monitor.BigCardRefreshMonitor$onLoadComplete$1", f = "BigCardRefreshMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1704390uSD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC323330Clv<?> LL;
    public final /* synthetic */ C1704340uS8 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704390uSD(AbstractC323330Clv<?> abstractC323330Clv, C1704340uS8 c1704340uS8, long j, long j2, InterfaceC1364105Vn<? super C1704390uSD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC323330Clv;
        this.LLILLJJLI = c1704340uS8;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704390uSD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final int size;
        final int i;
        final Throwable th;
        final Integer numLJ;
        C1C7U.LIZ("BigCardRefreshMonitor@abfb.onLoadComplete$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC323330Clv<?> abstractC323330Clv = this.LL;
        if (abstractC323330Clv instanceof C323310Clt) {
            th = ((C323310Clt) abstractC323330Clv).LIZIZ;
            size = -1;
            i = -1;
        } else {
            if (!(abstractC323330Clv instanceof C323350Clx) && !(abstractC323330Clv instanceof C323320Clu)) {
                throw new C1954807lC();
            }
            List<?> listLIZ = abstractC323330Clv.LIZ();
            if (listLIZ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BigCardRefreshMonitor@abfb.onLoadComplete$1");
                return unit;
            }
            size = listLIZ.size();
            i = 0;
            if (!listLIZ.isEmpty()) {
                Iterator<?> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    if ((it2.next() instanceof C1261860iwS) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            th = null;
        }
        C1704340uS8 c1704340uS8 = this.LLILLJJLI;
        final String str = c1704340uS8.LIZIZ;
        final long j = this.LLILLL;
        final long j2 = this.LLILZ;
        EnumC325100Com enumC325100Com = c1704340uS8.LJ;
        if (enumC325100Com != null) {
            C0XHY.LIZ.getClass();
            numLJ = C2286608xc.LJ(C0XHY.LJ(enumC325100Com));
        } else {
            numLJ = null;
        }
        final float f = this.LLILLJJLI.LIZ;
        new AbstractC1223210hw7(str, size, i, j, j2, numLJ, th, f) { // from class: X.1BsH
            public final String LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public final long LJ;
            public final long LJFF;
            public final Integer LJI;
            public final Throwable LJII;
            public final float LJIIIIZZ;
            public final String LJIIIZ = "big_card_refresh_perf_track";
            public final Map<String, String> LJIIJ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C2218511BsH)) {
                    return false;
                }
                C2218511BsH c2218511BsH = (C2218511BsH) obj2;
                return Intrinsics.LJFF(this.LIZIZ, c2218511BsH.LIZIZ) && this.LIZJ == c2218511BsH.LIZJ && this.LIZLLL == c2218511BsH.LIZLLL && this.LJ == c2218511BsH.LJ && this.LJFF == c2218511BsH.LJFF && Intrinsics.LJFF(this.LJI, c2218511BsH.LJI) && Intrinsics.LJFF(this.LJII, c2218511BsH.LJII) && Float.compare(this.LJIIIIZZ, c2218511BsH.LJIIIIZZ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BigCardRefreshPerfTrack(enterFrom=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", loadSize=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", mafCount=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", totalCost=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", apiCost=");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(", netStatus=");
                sbLIZ.append(this.LJI);
                sbLIZ.append(", netError=");
                sbLIZ.append(this.LJII);
                sbLIZ.append(", deviceScore=");
                sbLIZ.append(this.LJIIIIZZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                int iHashCode = ((((((((this.LIZIZ.hashCode() * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31;
                Integer num = this.LJI;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Throwable th2 = this.LJII;
                return ((iHashCode2 + (th2 != null ? th2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LJIIIIZZ);
            }

            @Override // X.AbstractC1223210hw7
            public final String LIZ() {
                return this.LJIIIZ;
            }

            @Override // X.AbstractC1223210hw7
            public final Map<String, String> LIZIZ() {
                return this.LJIIJ;
            }

            {
                String strLIZIZ;
                long j3 = j;
                long j4 = j2;
                this.LIZIZ = str;
                this.LIZJ = size;
                this.LIZLLL = i;
                this.LJ = j3;
                this.LJFF = j4;
                this.LJI = numLJ;
                this.LJII = th;
                this.LJIIIIZZ = f;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJ(EnumC1260920iuw.CARD, "scene_type");
                c2344009Gk.LIZJ(size, "count");
                c2344009Gk.LIZJ(i, "maf_count");
                c2344009Gk.LIZLLL((0 > j3 || j3 >= 600001) ? -1L : j3, "cost");
                c2344009Gk.LIZLLL((0 > j4 || j4 >= 600001) ? -1L : j4, "api_cost");
                if (th != null) {
                    if (th instanceof C0XIR) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Server, code: ");
                        C0XIR c0xir = (C0XIR) th;
                        sbLIZ.append(c0xir.getErrorCode());
                        sbLIZ.append(", msg: ");
                        sbLIZ.append(c0xir.getErrorMsg());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else if (th instanceof C0XIP) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Local, code: ");
                        sbLIZ2.append(((C23112093u) th).getErrorCode());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    } else if (th instanceof C1494450ozb) {
                        strLIZIZ = "NetworkNotAvail";
                    } else if (th instanceof C1494430ozZ) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("HttpResponseException, code: ");
                        sbLIZ3.append(((C1494430ozZ) th).getStatusCode());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    } else if (th instanceof C1499040p70) {
                        strLIZIZ = "CdnCacheVerifyException";
                    } else if (th instanceof C1494440oza) {
                        strLIZIZ = "ClientProtocolException";
                    } else if (th instanceof C1494460ozc) {
                        strLIZIZ = "OtherTTNException";
                    } else if (th instanceof TimeoutException) {
                        strLIZIZ = "TimeoutException";
                    } else {
                        strLIZIZ = "unknown error";
                    }
                } else {
                    strLIZIZ = null;
                }
                c2344009Gk.LJIIIIZZ("net_error", strLIZIZ);
                c2344009Gk.LJIIIIZZ("is_valid", AbstractC1223210hw7.LIZJ(true));
                c2344009Gk.LJ(numLJ, "net_status");
                c2344009Gk.LIZIZ(f, "device_score");
                this.LJIIJ = c2344009Gk.LIZ;
            }
        }.LIZLLL(null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BigCardRefreshMonitor@abfb.onLoadComplete$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
