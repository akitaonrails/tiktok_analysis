package X;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12aX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19781912aX {
    public static final C19781912aX LIZJ = new C19781912aX(100, null, null);
    public final EnumMap<EnumC19776112Zb, EnumC19782112aZ> LIZ;
    public final int LIZIZ;

    public static String LIZIZ(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static boolean LJIIIIZZ(int i, int i2) {
        if (i != -20 ? i != -30 || i2 != -20 : i2 != -30) {
            if (i != i2 && i >= i2) {
                return false;
            }
        }
        return true;
    }

    public final Boolean LJIILJJIL() {
        EnumC19782112aZ enumC19782112aZ = this.LIZ.get(EnumC19776112Zb.AD_STORAGE);
        if (enumC19782112aZ == null) {
            return null;
        }
        int iOrdinal = enumC19782112aZ.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final Boolean LJIILL() {
        EnumC19782112aZ enumC19782112aZ = this.LIZ.get(EnumC19776112Zb.ANALYTICS_STORAGE);
        if (enumC19782112aZ == null) {
            return null;
        }
        int iOrdinal = enumC19782112aZ.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIILLIIL() {
        /*
            r7 = this;
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "G1"
            r6.<init>(r0)
            X.12aY r0 = X.EnumC19782012aY.STORAGE
            X.12Zb[] r5 = r0.zza()
            int r4 = r5.length
            r3 = 0
        Lf:
            if (r3 >= r4) goto L3a
            r1 = r5[r3]
            java.util.EnumMap<X.12Zb, X.12aZ> r0 = r7.LIZ
            java.lang.Object r0 = r0.get(r1)
            X.12aZ r0 = (X.EnumC19782112aZ) r0
            r2 = 45
            if (r0 == 0) goto L2e
            int r1 = r0.ordinal()
            if (r1 == 0) goto L2e
            r0 = 1
            if (r1 == r0) goto L37
            r0 = 2
            if (r1 == r0) goto L34
            r0 = 3
            if (r1 == r0) goto L37
        L2e:
            r6.append(r2)
            int r3 = r3 + 1
            goto Lf
        L34:
            r2 = 48
            goto L2e
        L37:
            r2 = 49
            goto L2e
        L3a:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19781912aX.LJIILLIIL():java.lang.String");
    }

    public final String LJIIZILJ() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC19776112Zb enumC19776112Zb : EnumC19782012aY.STORAGE.zza()) {
            sb.append(LIZ(this.LIZ.get(enumC19776112Zb)));
        }
        return sb.toString();
    }

    public final boolean LJIJ() {
        return LJIIIZ(EnumC19776112Zb.AD_STORAGE);
    }

    public final boolean LJIJI() {
        return LJIIIZ(EnumC19776112Zb.ANALYTICS_STORAGE);
    }

    public final boolean LJIJJ() {
        Iterator<EnumC19782112aZ> it2 = this.LIZ.values().iterator();
        while (it2.hasNext()) {
            if (it2.next() != EnumC19782112aZ.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ * 17;
        Iterator<EnumC19782112aZ> it2 = this.LIZ.values().iterator();
        while (it2.hasNext()) {
            iHashCode = (iHashCode * 31) + it2.next().hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(LIZIZ(this.LIZIZ));
        for (EnumC19776112Zb enumC19776112Zb : EnumC19782012aY.STORAGE.LL) {
            sb.append(",");
            sb.append(enumC19776112Zb.zze);
            sb.append("=");
            EnumC19782112aZ enumC19782112aZ = this.LIZ.get(enumC19776112Zb);
            if (enumC19782112aZ == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = enumC19782112aZ.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("default");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        return sb.toString();
    }

    public static char LIZ(EnumC19782112aZ enumC19782112aZ) {
        if (enumC19782112aZ != null) {
            int iOrdinal = enumC19782112aZ.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static EnumC19782112aZ LJFF(char c) {
        if (c != '+') {
            if (c != '0') {
                if (c != '1') {
                    return EnumC19782112aZ.UNINITIALIZED;
                }
                return EnumC19782112aZ.GRANTED;
            }
            return EnumC19782112aZ.DENIED;
        }
        return EnumC19782112aZ.DEFAULT;
    }

    public static EnumC19782112aZ LJI(Boolean bool) {
        if (bool == null) {
            return EnumC19782112aZ.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return EnumC19782112aZ.GRANTED;
        }
        return EnumC19782112aZ.DENIED;
    }

    public static EnumC19782112aZ LJII(String str) {
        if (str == null) {
            return EnumC19782112aZ.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return EnumC19782112aZ.GRANTED;
        }
        if (str.equals("denied")) {
            return EnumC19782112aZ.DENIED;
        }
        return EnumC19782112aZ.UNINITIALIZED;
    }

    public static C19781912aX LJIIJ(String str) {
        return LIZLLL(100, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19781912aX LJ(X.C19781912aX r9) {
        /*
            r8 = this;
            java.util.EnumMap r7 = new java.util.EnumMap
            java.lang.Class<X.12Zb> r0 = X.EnumC19776112Zb.class
            r7.<init>(r0)
            X.12aY r0 = X.EnumC19782012aY.STORAGE
            X.12Zb[] r6 = r0.LL
            int r5 = r6.length
            r4 = 0
        Ld:
            if (r4 >= r5) goto L41
            r3 = r6[r4]
            java.util.EnumMap<X.12Zb, X.12aZ> r0 = r8.LIZ
            java.lang.Object r2 = r0.get(r3)
            java.util.EnumMap<X.12Zb, X.12aZ> r0 = r9.LIZ
            java.lang.Object r1 = r0.get(r3)
            if (r2 == 0) goto L3f
            if (r1 == 0) goto L37
            X.12aZ r0 = X.EnumC19782112aZ.UNINITIALIZED
            if (r2 == r0) goto L3f
            if (r1 == r0) goto L37
            X.12aZ r0 = X.EnumC19782112aZ.DEFAULT
            if (r2 == r0) goto L3f
            if (r1 == r0) goto L37
            X.12aZ r0 = X.EnumC19782112aZ.DENIED
            if (r2 == r0) goto L3d
            if (r1 == r0) goto L3d
            X.12aZ r2 = X.EnumC19782112aZ.GRANTED
        L35:
            if (r2 == 0) goto L3a
        L37:
            r7.put(r3, r2)
        L3a:
            int r4 = r4 + 1
            goto Ld
        L3d:
            r2 = r0
            goto L37
        L3f:
            r2 = r1
            goto L35
        L41:
            X.12aX r1 = new X.12aX
            r0 = 100
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19781912aX.LJ(X.12aX):X.12aX");
    }

    public final boolean LJIIIZ(EnumC19776112Zb enumC19776112Zb) {
        if (this.LIZ.get(enumC19776112Zb) == EnumC19782112aZ.DENIED) {
            return false;
        }
        return true;
    }

    public final C19781912aX LJIIJJI(C19781912aX c19781912aX) {
        EnumMap enumMap = new EnumMap(EnumC19776112Zb.class);
        for (EnumC19776112Zb enumC19776112Zb : EnumC19782012aY.STORAGE.LL) {
            EnumC19782112aZ enumC19782112aZ = this.LIZ.get(enumC19776112Zb);
            if (enumC19782112aZ == EnumC19782112aZ.UNINITIALIZED) {
                enumC19782112aZ = c19781912aX.LIZ.get(enumC19776112Zb);
            }
            if (enumC19782112aZ != null) {
                enumMap.put(enumC19776112Zb, enumC19782112aZ);
            }
        }
        return new C19781912aX(enumMap, this.LIZIZ);
    }

    public final boolean LJIILIIL(C19781912aX c19781912aX) {
        return LJIIL(c19781912aX, (EnumC19776112Zb[]) this.LIZ.keySet().toArray(new EnumC19776112Zb[0]));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19781912aX)) {
            return false;
        }
        C19781912aX c19781912aX = (C19781912aX) obj;
        for (EnumC19776112Zb enumC19776112Zb : EnumC19782012aY.STORAGE.LL) {
            if (this.LIZ.get(enumC19776112Zb) != c19781912aX.LIZ.get(enumC19776112Zb)) {
                return false;
            }
        }
        if (this.LIZIZ != c19781912aX.LIZIZ) {
            return false;
        }
        return true;
    }

    public C19781912aX(EnumMap<EnumC19776112Zb, EnumC19782112aZ> enumMap, int i) {
        EnumMap<EnumC19776112Zb, EnumC19782112aZ> enumMap2 = new EnumMap<>(EnumC19776112Zb.class);
        this.LIZ = enumMap2;
        enumMap2.putAll(enumMap);
        this.LIZIZ = i;
    }

    public static C19781912aX LIZJ(int i, Bundle bundle) {
        if (bundle == null) {
            return new C19781912aX(i, null, null);
        }
        EnumMap enumMap = new EnumMap(EnumC19776112Zb.class);
        for (EnumC19776112Zb enumC19776112Zb : EnumC19782012aY.STORAGE.LL) {
            enumMap.put(enumC19776112Zb, LJII(bundle.getString(enumC19776112Zb.zze)));
        }
        return new C19781912aX(enumMap, i);
    }

    public static C19781912aX LIZLLL(int i, String str) {
        EnumMap enumMap = new EnumMap(EnumC19776112Zb.class);
        if (str == null) {
            str = "";
        }
        EnumC19776112Zb[] enumC19776112ZbArrZza = EnumC19782012aY.STORAGE.zza();
        for (int i2 = 0; i2 < enumC19776112ZbArrZza.length; i2++) {
            EnumC19776112Zb enumC19776112Zb = enumC19776112ZbArrZza[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put(enumC19776112Zb, LJFF(str.charAt(i3)));
            } else {
                enumMap.put(enumC19776112Zb, EnumC19782112aZ.UNINITIALIZED);
            }
        }
        return new C19781912aX(enumMap, i);
    }

    public final boolean LJIIL(C19781912aX c19781912aX, EnumC19776112Zb... enumC19776112ZbArr) {
        for (EnumC19776112Zb enumC19776112Zb : enumC19776112ZbArr) {
            EnumC19782112aZ enumC19782112aZ = this.LIZ.get(enumC19776112Zb);
            EnumC19782112aZ enumC19782112aZ2 = c19781912aX.LIZ.get(enumC19776112Zb);
            EnumC19782112aZ enumC19782112aZ3 = EnumC19782112aZ.DENIED;
            if (enumC19782112aZ == enumC19782112aZ3 && enumC19782112aZ2 != enumC19782112aZ3) {
                return true;
            }
        }
        return false;
    }

    public C19781912aX(int i, Boolean bool, Boolean bool2) {
        EnumMap<EnumC19776112Zb, EnumC19782112aZ> enumMap = new EnumMap<>(EnumC19776112Zb.class);
        this.LIZ = enumMap;
        enumMap.put(EnumC19776112Zb.AD_STORAGE, LJI(bool));
        enumMap.put(EnumC19776112Zb.ANALYTICS_STORAGE, LJI(bool2));
        this.LIZIZ = i;
    }
}
