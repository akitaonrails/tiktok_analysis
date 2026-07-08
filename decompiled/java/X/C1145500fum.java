package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145500fum {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final Function0<Long> LJ;
    public final Function1<C1145820fvI, Unit> LJFF;
    public final long LJIIIIZZ;
    public Long LJIIJ;
    public Long LJIIJJI;
    public boolean LJIIL;
    public String LJIILIIL;
    public Integer LJIILJJIL;
    public String LJIILL;
    public final Object LJI = new Object();
    public final AtomicBoolean LJII = new AtomicBoolean(false);
    public String LJIIIZ = "liveroom";
    public final LinkedHashMap<Long, C1145510fun> LJIILLIIL = new LinkedHashMap<>();

    public final boolean LIZ() {
        Collection<C1145510fun> collectionValues = this.LJIILLIIL.values();
        if (collectionValues.isEmpty()) {
            return true;
        }
        for (C1145510fun c1145510fun : collectionValues) {
            if (c1145510fun.LIZLLL == null && c1145510fun.LJ == null) {
                return false;
            }
        }
        return true;
    }

    public final EnumC1145490ful LIZJ() {
        int i;
        if (this.LJIIL) {
            return EnumC1145490ful.ERROR;
        }
        Collection<C1145510fun> collectionValues = this.LJIILLIIL.values();
        int i2 = 0;
        if (collectionValues.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (C1145510fun c1145510fun : collectionValues) {
                if (c1145510fun.LIZLLL != null && c1145510fun.LIZJ == 1 && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        Collection<C1145510fun> collectionValues2 = this.LJIILLIIL.values();
        if (!collectionValues2.isEmpty()) {
            Iterator<T> it2 = collectionValues2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (((C1145510fun) it2.next()).LIZLLL != null && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i == this.LJIILLIIL.size() ? EnumC1145490ful.SUCCESS : i2 > 0 ? EnumC1145490ful.PARTIAL_SUCCESS : EnumC1145490ful.ERROR;
    }

    public final void LJIIIIZZ() {
        synchronized (this.LJI) {
            try {
                if (this.LJII.get()) {
                    return;
                }
                if (this.LJIILLIIL.isEmpty()) {
                    LJFF(LIZIZ(EnumC1145490ful.ERROR, "render_timeout", -55));
                    return;
                }
                for (C1145510fun c1145510fun : this.LJIILLIIL.values()) {
                    if (c1145510fun.LIZLLL == null && c1145510fun.LJ == null) {
                        c1145510fun.LJ = -55;
                        c1145510fun.LIZJ = -55;
                        c1145510fun.LIZJ(this.LJ.invoke().longValue());
                        LJIJ(-55, "render_timeout");
                    }
                }
                LJFF(LIZIZ(LIZJ(), null, null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIZ() {
        if (!this.LJIILLIIL.isEmpty() && this.LJIIJ == null && LIZ()) {
            Collection<C1145510fun> collectionValues = this.LJIILLIIL.values();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                Long l = ((C1145510fun) it2.next()).LIZLLL;
                if (l != null) {
                    arrayList.add(l);
                }
            }
            Long lInvoke = (Long) C13LP.LJJLIIIJLJLI(arrayList);
            if (lInvoke == null) {
                lInvoke = this.LJ.invoke();
            }
            this.LJIIJ = lInvoke;
        }
    }

    public final void LJIIJ() {
        if (this.LJIILLIIL.isEmpty() || this.LJII.get() || !LIZ()) {
            return;
        }
        Collection<C1145510fun> collectionValues = this.LJIILLIIL.values();
        if (!collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (!((C1145510fun) it2.next()).LIZ()) {
                    return;
                }
            }
        }
        this.LJIIJJI = this.LJ.invoke();
        LJFF(LIZIZ(LIZJ(), null, null));
    }

    public final void LJ(long j) {
        synchronized (this.LJI) {
            try {
                if (this.LJII.get()) {
                    return;
                }
                if (this.LJIILLIIL.remove(Long.valueOf(j)) == null) {
                    return;
                }
                if (this.LJIILLIIL.isEmpty()) {
                    LJFF(LIZIZ(EnumC1145490ful.NO_ITEMS_TO_RENDER, null, null));
                } else {
                    LJIIIZ();
                    LJIIJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF(C1145820fvI c1145820fvI) {
        if (!this.LJII.compareAndSet(false, true)) {
            return;
        }
        this.LJFF.invoke(c1145820fvI);
    }

    public final void LJI(String str) {
        synchronized (this.LJI) {
            try {
                if (this.LJII.get()) {
                    return;
                }
                EnumC1145490ful enumC1145490ful = EnumC1145490ful.ERROR;
                if (str == null) {
                    str = "dsl_version_incompatible";
                }
                LJFF(LIZIZ(enumC1145490ful, str, -56));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJII(long j) {
        synchronized (this.LJI) {
            try {
                C1145510fun c1145510fun = this.LJIILLIIL.get(Long.valueOf(j));
                if (c1145510fun == null) {
                    return;
                }
                c1145510fun.LIZJ(this.LJ.invoke().longValue());
                LJIIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJJI(long j) {
        int iIntValue;
        synchronized (this.LJI) {
            try {
                C1145510fun c1145510fun = this.LJIILLIIL.get(Long.valueOf(j));
                if (c1145510fun == null) {
                    return;
                }
                if (c1145510fun.LIZLLL != null) {
                    return;
                }
                c1145510fun.LIZLLL = this.LJ.invoke();
                Integer num = c1145510fun.LJ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = c1145510fun.LIZJ;
                    if (iIntValue == 0) {
                        iIntValue = 1;
                    }
                }
                c1145510fun.LIZJ = iIntValue;
                if (!c1145510fun.LIZ() && c1145510fun.LJI == null) {
                    c1145510fun.LIZJ(this.LJ.invoke().longValue());
                }
                LJIIIZ();
                LJIIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJI(List<Pair<Long, String>> list) {
        synchronized (this.LJI) {
            try {
                if (this.LJII.get()) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Pair pair : (ArrayList) list) {
                    long jLongValue = ((Number) pair.getFirst()).longValue();
                    String str = (String) pair.getSecond();
                    Long lValueOf = Long.valueOf(jLongValue);
                    C1145510fun c1145510fun = this.LJIILLIIL.get(Long.valueOf(jLongValue));
                    if (c1145510fun == null) {
                        c1145510fun = new C1145510fun(jLongValue, str);
                    }
                    linkedHashMap.put(lValueOf, c1145510fun);
                }
                this.LJIILLIIL.clear();
                this.LJIILLIIL.putAll(linkedHashMap);
                if (this.LJIILLIIL.isEmpty()) {
                    LJFF(LIZIZ(EnumC1145490ful.NO_ITEMS_TO_RENDER, null, null));
                } else {
                    LJIIIZ();
                    LJIIJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LIZLLL(EnumC1145540fuq enumC1145540fuq, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1145540fuq.name());
        sbLIZ.append(':');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIJ(int i, String str) {
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = Integer.valueOf(i);
            this.LJIILL = str;
        }
    }

    public final C1145820fvI LIZIZ(EnumC1145490ful enumC1145490ful, String str, Integer num) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        double d;
        double d2;
        int i;
        String strLIZIZ = str;
        Integer num2 = num;
        long jLongValue = this.LJ.invoke().longValue();
        Long l = this.LJIIJ;
        if (l != null) {
            long jLongValue2 = l.longValue() - this.LJIIIIZZ;
            if (jLongValue2 < 0) {
                jLongValue2 = 0;
            }
            lValueOf = Long.valueOf(jLongValue2);
        } else {
            lValueOf = null;
        }
        Long l2 = this.LJIIJJI;
        if (l2 != null) {
            long jLongValue3 = l2.longValue() - this.LJIIIIZZ;
            if (jLongValue3 < 0) {
                jLongValue3 = 0;
            }
            lValueOf2 = Long.valueOf(jLongValue3);
        } else {
            lValueOf2 = null;
        }
        if (enumC1145490ful == EnumC1145490ful.EXIT_ROOM_BEFORE_COMPLETION) {
            long j = jLongValue - this.LJIIIIZZ;
            if (j < 0) {
                j = 0;
            }
            lValueOf3 = Long.valueOf(j);
        } else {
            lValueOf3 = null;
        }
        Iterator<T> it2 = this.LJIILLIIL.values().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            i2 += ((C1145510fun) it2.next()).LJIIIIZZ;
        }
        Iterator<T> it3 = this.LJIILLIIL.values().iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            i3 += ((C1145510fun) it3.next()).LJIIIZ;
        }
        Iterator<T> it4 = this.LJIILLIIL.values().iterator();
        int i4 = 0;
        while (it4.hasNext()) {
            i4 += ((C1145510fun) it4.next()).LJIIJ;
        }
        Iterator<T> it5 = this.LJIILLIIL.values().iterator();
        int i5 = 0;
        while (it5.hasNext()) {
            i5 += ((C1145510fun) it5.next()).LJIIJJI;
        }
        Iterator<T> it6 = this.LJIILLIIL.values().iterator();
        int i6 = 0;
        while (it6.hasNext()) {
            i6 += ((C1145510fun) it6.next()).LJIIL;
        }
        Iterator<T> it7 = this.LJIILLIIL.values().iterator();
        int i7 = 0;
        while (it7.hasNext()) {
            i7 += ((C1145510fun) it7.next()).LJIILIIL;
        }
        long j2 = this.LIZIZ;
        int i8 = this.LIZJ;
        long j3 = this.LIZLLL;
        long j4 = this.LIZ;
        String str2 = this.LJIIIZ;
        int code = enumC1145490ful.getCode();
        if (num2 == null) {
            num2 = this.LJIILJJIL;
        }
        if (strLIZIZ == null && (strLIZIZ = this.LJIILL) == null) {
            String str3 = this.LJIILIIL;
            if (str3 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("room_exit:");
                sbLIZ.append(str3);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = null;
            }
        }
        Collection<C1145510fun> collectionValues = this.LJIILLIIL.values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        for (C1145510fun c1145510fun : collectionValues) {
            long j5 = c1145510fun.LIZ;
            String str4 = c1145510fun.LIZIZ;
            int i9 = c1145510fun.LIZJ;
            if (c1145510fun.LJFF != 0) {
                i = -1;
            } else {
                Long l3 = c1145510fun.LJI;
                Long l4 = c1145510fun.LJII;
                if (l3 == null || l4 == null || (Intrinsics.LJFF(l3, l4) && c1145510fun.LJIIIIZZ == 0 && c1145510fun.LJIIJ == 0)) {
                    i = 0;
                } else {
                    long jLongValue4 = l4.longValue() - l3.longValue();
                    long j6 = 0;
                    if (jLongValue4 >= 0) {
                        j6 = jLongValue4;
                    }
                    i = (int) j6;
                }
            }
            Integer numValueOf = Integer.valueOf(c1145510fun.LJFF);
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            arrayList.add(new C1145800fvG(j5, str4, i9, i, numValueOf, c1145510fun.LJIILL));
        }
        double d3 = -1.0d;
        if (i2 == 0) {
            d = -1.0d;
        } else {
            d = ((double) i3) / ((double) i2);
        }
        if (i4 == 0) {
            d2 = -1.0d;
        } else {
            d2 = ((double) i5) / ((double) i4);
        }
        if (i6 != 0) {
            d3 = ((double) i7) / ((double) i6);
        }
        return new C1145820fvI(j2, i8, j3, j4, str2, code, lValueOf, lValueOf2, num2, strLIZIZ, arrayList, d, d2, d3, lValueOf3);
    }

    public final void LJIIL(int i, long j, String str) {
        synchronized (this.LJI) {
            try {
                C1145510fun c1145510fun = this.LJIILLIIL.get(Long.valueOf(j));
                if (c1145510fun == null) {
                    return;
                }
                c1145510fun.LJ = Integer.valueOf(i);
                c1145510fun.LIZJ = i;
                LJIJ(i, str);
                c1145510fun.LIZJ(this.LJ.invoke().longValue());
                LJIIIZ();
                LJIIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILIIL(long j, EnumC1145540fuq enumC1145540fuq, String str) {
        synchronized (this.LJI) {
            try {
                C1145510fun c1145510fun = this.LJIILLIIL.get(Long.valueOf(j));
                if (c1145510fun == null) {
                    return;
                }
                long jLongValue = this.LJ.invoke().longValue();
                String strLIZLLL = LIZLLL(enumC1145540fuq, str);
                c1145510fun.LJIILLIIL.add(strLIZLLL);
                boolean zAdd = c1145510fun.LJIIZILJ.add(strLIZLLL);
                if (c1145510fun.LJI == null) {
                    c1145510fun.LJI = Long.valueOf(jLongValue);
                }
                c1145510fun.LJII = Long.valueOf(jLongValue);
                if (!zAdd) {
                    return;
                }
                if (enumC1145540fuq == EnumC1145540fuq.IMAGE) {
                    c1145510fun.LJIILL = -1;
                }
                LJIIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILL(long j, EnumC1145540fuq enumC1145540fuq, String str) {
        synchronized (this.LJI) {
            try {
                C1145510fun c1145510fun = this.LJIILLIIL.get(Long.valueOf(j));
                if (c1145510fun == null) {
                    return;
                }
                long jLongValue = this.LJ.invoke().longValue();
                if (!c1145510fun.LJIILLIIL.add(LIZLLL(enumC1145540fuq, str))) {
                    return;
                }
                if (c1145510fun.LJI == null) {
                    c1145510fun.LJI = Long.valueOf(jLongValue);
                }
                int i = C1145520fuo.LIZ[enumC1145540fuq.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c1145510fun.LJIIJ++;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1145510fun.LJIIIIZZ++;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIZILJ(long j, String str, String str2) {
        synchronized (this.LJI) {
            try {
                C1145510fun c1145510fun = this.LJIILLIIL.get(Long.valueOf(j));
                if (c1145510fun == null) {
                    return;
                }
                c1145510fun.LJIIL++;
                String strLJIIJ = C1839560xyE.LJIIJ(str);
                String strLJIIJ2 = C1839560xyE.LJIIJ(str2);
                if (!Intrinsics.LJFF(strLJIIJ, LivePreviewCTASmartDisplayManager.DEFAULT) && !Intrinsics.LJFF(strLJIIJ2, strLJIIJ)) {
                    c1145510fun.LJIILJJIL = false;
                    c1145510fun.LIZJ = -52;
                    LJIJ(-52, "text_fallback_font");
                } else {
                    c1145510fun.LJIILIIL++;
                }
                LJIIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILLIIL(long j, EnumC1145540fuq enumC1145540fuq, String str, Integer num) {
        synchronized (this.LJI) {
            try {
                C1145510fun c1145510fun = this.LJIILLIIL.get(Long.valueOf(j));
                if (c1145510fun == null) {
                    return;
                }
                if (!c1145510fun.LIZIZ(this.LJ.invoke().longValue(), LIZLLL(enumC1145540fuq, str))) {
                    return;
                }
                int i = C1145520fuo.LIZ[enumC1145540fuq.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c1145510fun.LJIIJJI++;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1145510fun.LJIIIZ++;
                    if (num != null) {
                        c1145510fun.LJIILL = num;
                    }
                }
                LJIIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILJJIL(long j, EnumC1145540fuq enumC1145540fuq, String str, int i, String str2) {
        synchronized (this.LJI) {
            try {
                C1145510fun c1145510fun = this.LJIILLIIL.get(Long.valueOf(j));
                if (c1145510fun == null) {
                    return;
                }
                if (!c1145510fun.LIZIZ(this.LJ.invoke().longValue(), LIZLLL(enumC1145540fuq, str))) {
                    return;
                }
                c1145510fun.LJFF = i;
                int i2 = C1145520fuo.LIZ[enumC1145540fuq.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new C1954807lC();
                    }
                } else {
                    LJIJ(i, str2);
                    if (c1145510fun.LIZJ == 0) {
                        c1145510fun.LIZJ = i;
                        c1145510fun.LJ = Integer.valueOf(i);
                    }
                }
                LJIIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1145500fum(long j, long j2, int i, long j3, C1091960eWQ c1091960eWQ, C1145810fvH c1145810fvH) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = j3;
        this.LJ = c1091960eWQ;
        this.LJFF = c1145810fvH;
        this.LJIIIIZZ = ((Number) c1091960eWQ.invoke()).longValue();
    }
}
