package X;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516160pYc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1516150pYb LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C0POE<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516160pYc(C1516150pYb c1516150pYb, long j, long j2, C0POE<Object> c0poe) {
        super(0);
        this.LL = c1516150pYb;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = c0poe;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Long l;
        String str;
        C1516150pYb c1516150pYb = this.LL;
        long j = this.LLILLJJLI;
        long j2 = this.LLILLL;
        C0POE<Object> c0poe = this.LLILZ;
        if (!c1516150pYb.LJ.get() && j == c1516150pYb.LJIIL && (l = c1516150pYb.LJIIJJI) != null && l.longValue() == j2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            new C1516090pYV(c1516150pYb.LJIJ, j, j2, jCurrentTimeMillis);
            C034X.LIZIZ();
            Collection<C1516130pYZ<Object>> collectionValues = c1516150pYb.LJFF.values();
            C1515820pY4<byte[]> c1515820pY4 = c1516150pYb.LJIJ;
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                C1516130pYZ c1516130pYZ = (C1516130pYZ) it2.next();
                if (!c1516130pYZ.LJ && c1516130pYZ.LJFF == EnumC1516190pYf.LLILLJJLI) {
                    C1516060pYS c1516060pYS = c1516130pYZ.LIZLLL;
                    if (c1516060pYS != null && (str = c1516060pYS.LIZJ) != null && Intrinsics.LJFF(c1516150pYb.LJI.get(str), Boolean.TRUE)) {
                        c1516130pYZ.LJFF = EnumC1516190pYf.LLILLL;
                        c1516150pYb.LJIILIIL++;
                        new AwS424S0200000_23(c1515820pY4, (C1515820pY4<byte[]>) c1516130pYZ, (C1516130pYZ<Object>) 31);
                        C034X.LIZIZ();
                    } else if (c1516130pYZ.LJI <= jCurrentTimeMillis) {
                        c1516130pYZ.LJFF = EnumC1516190pYf.LLILZ;
                        c1516150pYb.LJIILJJIL++;
                        new AwS424S0200000_23(c1515820pY4, (C1515820pY4<byte[]>) c1516130pYZ, (C1516130pYZ<Object>) 32);
                        C034X.LIZIZ();
                    }
                }
            }
            c1516150pYb.LJIIJJI = null;
            c1516150pYb.LJI(c0poe);
            c1516150pYb.LIZLLL(c0poe);
            c1516150pYb.LJIIIIZZ(c0poe);
        }
        return Unit.LIZ;
    }
}
