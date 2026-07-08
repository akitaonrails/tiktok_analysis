package X;

import com.ss.android.ugc.aweme.nxet.ITracingService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848510yCf {
    public final Object LIZ;

    public final void LIZIZ() {
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJIILL(this.LIZ);
        }
    }

    public final void LIZJ() {
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJFF(this.LIZ);
        }
    }

    public C1848510yCf(Object obj) {
        this.LIZ = obj;
    }

    public final void LIZ(Function1<? super C892070Yz7, Unit> function1) {
        Object obj = this.LIZ;
        C892070Yz7 c892070Yz7 = new C892070Yz7(obj);
        function1.invoke(c892070Yz7);
        if (obj != null) {
            for (Map.Entry entry : ((LinkedHashMap) c892070Yz7.LIZIZ).entrySet()) {
                EnumC1847910yBh enumC1847910yBh = (EnumC1847910yBh) entry.getKey();
                String str = (String) entry.getValue();
                if (str == null) {
                    ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
                    if (iTracingServiceLIZ != null) {
                        iTracingServiceLIZ.LJ(c892070Yz7.LIZ, enumC1847910yBh);
                    }
                } else if (str.length() == 0) {
                    ITracingService iTracingServiceLIZ2 = C1845210y7L.LIZ();
                    if (iTracingServiceLIZ2 != null) {
                        iTracingServiceLIZ2.LJIIL(c892070Yz7.LIZ, enumC1847910yBh, null);
                    }
                } else {
                    ITracingService iTracingServiceLIZ3 = C1845210y7L.LIZ();
                    if (iTracingServiceLIZ3 != null) {
                        iTracingServiceLIZ3.LJIIL(c892070Yz7.LIZ, enumC1847910yBh, str);
                    }
                }
            }
        }
    }

    public final void LIZLLL(int i) {
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJIILIIL(i, this.LIZ);
        }
    }

    public final void LJ(String str) {
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJIIIZ(this.LIZ, str);
        }
    }

    public final void LJFF(Function1<? super C0Q2K, Unit> function1) {
        ITracingService iTracingServiceLIZ;
        Object obj = this.LIZ;
        C0Q2K c0q2k = new C0Q2K(obj);
        function1.invoke(c0q2k);
        if (obj != null && (iTracingServiceLIZ = C1845210y7L.LIZ()) != null) {
            iTracingServiceLIZ.LJIILJJIL(obj, c0q2k.LIZIZ);
        }
    }

    public final void LJI(Object obj) {
        String strValueOf;
        if (!(obj instanceof String) || (strValueOf = (String) obj) == null) {
            strValueOf = String.valueOf(obj.hashCode());
        }
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJIIJ(this.LIZ, strValueOf);
        }
    }
}
