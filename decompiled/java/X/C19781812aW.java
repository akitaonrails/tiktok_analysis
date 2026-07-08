package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: X.12aW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19781812aW {
    public static final C19781812aW LJFF = new C19781812aW((Boolean) null, 100, (Boolean) null, (String) null);
    public final int LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;
    public final String LIZLLL;
    public final EnumMap<EnumC19776112Zb, EnumC19782112aZ> LJ;

    public C19781812aW() {
        throw null;
    }

    public final EnumC19782112aZ LIZLLL() {
        EnumC19782112aZ enumC19782112aZ = this.LJ.get(EnumC19776112Zb.AD_USER_DATA);
        return enumC19782112aZ == null ? EnumC19782112aZ.UNINITIALIZED : enumC19782112aZ;
    }

    public final boolean LJ() {
        Iterator<EnumC19782112aZ> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            if (it2.next() != EnumC19782112aZ.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String LJFF() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        for (EnumC19776112Zb enumC19776112Zb : EnumC19782012aY.DMA.zza()) {
            sb.append(":");
            sb.append(C19781912aX.LIZ(this.LJ.get(enumC19776112Zb)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Boolean bool = this.LIZJ;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.LIZLLL;
        return this.LIZIZ.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C19781912aX.LIZIZ(this.LIZ));
        for (EnumC19776112Zb enumC19776112Zb : EnumC19782012aY.DMA.zza()) {
            sb.append(",");
            sb.append(enumC19776112Zb.zze);
            sb.append("=");
            EnumC19782112aZ enumC19782112aZ = this.LJ.get(enumC19776112Zb);
            if (enumC19782112aZ == null) {
                sb.append("uninitialized");
            } else {
                int i = C19781712aV.LIZ[enumC19782112aZ.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("default");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.LIZJ != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.LIZJ);
        }
        if (this.LIZLLL != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.LIZLLL);
        }
        return sb.toString();
    }

    public static Boolean LIZ(Bundle bundle) {
        EnumC19782112aZ enumC19782112aZLJII;
        if (bundle == null || (enumC19782112aZLJII = C19781912aX.LJII(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = C19781712aV.LIZ[enumC19782112aZLJII.ordinal()];
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static C19781812aW LIZJ(String str) {
        if (str != null && str.length() > 0) {
            String[] strArrSplit = str.split(":");
            int i = CastIntegerProtector.parseInt(strArrSplit[0]);
            EnumMap enumMap = new EnumMap(EnumC19776112Zb.class);
            EnumC19776112Zb[] enumC19776112ZbArrZza = EnumC19782012aY.DMA.zza();
            int length = enumC19776112ZbArrZza.length;
            int i2 = 1;
            int i3 = 0;
            while (i3 < length) {
                enumMap.put(enumC19776112ZbArrZza[i3], C19781912aX.LJFF(strArrSplit[i2].charAt(0)));
                i3++;
                i2++;
            }
            return new C19781812aW((EnumMap<EnumC19776112Zb, EnumC19782112aZ>) enumMap, i, (Boolean) null, (String) null);
        }
        return LJFF;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19781812aW)) {
            return false;
        }
        C19781812aW c19781812aW = (C19781812aW) obj;
        if (!this.LIZIZ.equalsIgnoreCase(c19781812aW.LIZIZ) || !Objects.equals(this.LIZJ, c19781812aW.LIZJ)) {
            return false;
        }
        return Objects.equals(this.LIZLLL, c19781812aW.LIZLLL);
    }

    public static C19781812aW LIZIZ(int i, Bundle bundle) {
        Boolean boolValueOf = null;
        if (bundle == null) {
            return new C19781812aW((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC19776112Zb.class);
        for (EnumC19776112Zb enumC19776112Zb : EnumC19782012aY.DMA.zza()) {
            enumMap.put(enumC19776112Zb, C19781912aX.LJII(bundle.getString(enumC19776112Zb.zze)));
        }
        if (bundle.containsKey("is_dma_region")) {
            boolValueOf = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new C19781812aW((EnumMap<EnumC19776112Zb, EnumC19782112aZ>) enumMap, i, boolValueOf, bundle.getString("cps_display_str"));
    }

    public C19781812aW(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<EnumC19776112Zb, EnumC19782112aZ> enumMap = new EnumMap<>(EnumC19776112Zb.class);
        this.LJ = enumMap;
        enumMap.put(EnumC19776112Zb.AD_USER_DATA, C19781912aX.LJI(bool));
        this.LIZ = i;
        this.LIZIZ = LJFF();
        this.LIZJ = bool2;
        this.LIZLLL = str;
    }

    public C19781812aW(EnumMap<EnumC19776112Zb, EnumC19782112aZ> enumMap, int i, Boolean bool, String str) {
        EnumMap<EnumC19776112Zb, EnumC19782112aZ> enumMap2 = new EnumMap<>(EnumC19776112Zb.class);
        this.LJ = enumMap2;
        enumMap2.putAll(enumMap);
        this.LIZ = i;
        this.LIZIZ = LJFF();
        this.LIZJ = bool;
        this.LIZLLL = str;
    }
}
