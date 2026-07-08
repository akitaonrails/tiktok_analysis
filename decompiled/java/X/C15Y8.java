package X;

import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Y8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15Y8 implements C15YI {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(377));

    public final C15Z2 LJ() {
        return (C15Z2) this.LIZ.getValue();
    }

    @Override // X.C15YI
    public final void LIZ(Class<? extends Enum<?>> cls) {
        Iterable<C15YM> entries;
        if (Intrinsics.LJFF(cls, EnumC20536615Xo.class)) {
            entries = EnumC20536615Xo.getEntries();
        } else if (Intrinsics.LJFF(cls, C15Y5.class)) {
            entries = C15Y5.getEntries();
        } else if (Intrinsics.LJFF(cls, EnumC20536815Xq.class)) {
            entries = EnumC20536815Xq.getEntries();
        } else {
            return;
        }
        for (C15YM c15ym : entries) {
            C15Z2 c15z2LJ = LJ();
            String key = c15ym.getKey();
            c15z2LJ.getClass();
            C15Z2.LIZIZ().erase(key);
        }
        LJFF(cls);
    }

    public final void LJFF(Class<? extends Enum<?>> cls) {
        EnumC20536915Xr enumC20536915Xr;
        if (Intrinsics.LJFF(cls, EnumC20536615Xo.class)) {
            enumC20536915Xr = EnumC20536915Xr.FAMILY_PARING_CHANGED;
        } else if (Intrinsics.LJFF(cls, C15Y5.class)) {
            enumC20536915Xr = EnumC20536915Xr.DIGITAL_WELLBEING_CHANGED;
        } else if (!Intrinsics.LJFF(cls, EnumC20536815Xq.class)) {
            return;
        } else {
            enumC20536915Xr = EnumC20536915Xr.USER_DETAIL_INFO_CHANGED;
        }
        C15Z2 c15z2LJ = LJ();
        String key = enumC20536915Xr.getKey();
        c15z2LJ.getClass();
        C15Z2.LIZIZ().storeBoolean(key, true);
    }

    public final void LJI(C15YM c15ym) {
        Class<? extends Enum<?>> cls;
        if (c15ym instanceof EnumC20536615Xo) {
            cls = EnumC20536615Xo.class;
        } else if (c15ym instanceof C15Y5) {
            cls = C15Y5.class;
        } else if (!(c15ym instanceof EnumC20536815Xq)) {
            return;
        } else {
            cls = EnumC20536815Xq.class;
        }
        LJFF(cls);
    }

    @Override // X.C15YI
    public final void LIZIZ(C15Y5 c15y5, Boolean bool) {
        c15y5.getType();
        if (bool == null) {
            C15Z2 c15z2LJ = LJ();
            String key = c15y5.getKey();
            c15z2LJ.getClass();
            C15Z2.LIZIZ().erase(key);
        } else {
            C15Z2 c15z2LJ2 = LJ();
            String key2 = c15y5.getKey();
            boolean zBooleanValue = bool.booleanValue();
            c15z2LJ2.getClass();
            C15Z2.LIZIZ().storeBoolean(key2, zBooleanValue);
        }
        LJI(c15y5);
    }

    @Override // X.C15YI
    public final void LIZJ(C15Y5 c15y5, Object obj) {
        c15y5.getType();
        if (obj == null) {
            C15Z2 c15z2LJ = LJ();
            String key = c15y5.getKey();
            c15z2LJ.getClass();
            C15Z2.LIZIZ().erase(key);
        } else {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(obj);
            if (strLJI != null) {
                C15Z2 c15z2LJ2 = LJ();
                String key2 = c15y5.getKey();
                c15z2LJ2.getClass();
                C15Z2.LIZIZ().storeString(key2, strLJI);
            }
        }
        LJI(c15y5);
    }

    @Override // X.C15YI
    public final void LIZLLL(C15YM c15ym, Integer num) {
        c15ym.getType();
        if (num == null) {
            C15Z2 c15z2LJ = LJ();
            String key = c15ym.getKey();
            c15z2LJ.getClass();
            C15Z2.LIZIZ().erase(key);
        } else {
            C15Z2 c15z2LJ2 = LJ();
            String key2 = c15ym.getKey();
            int iIntValue = num.intValue();
            c15z2LJ2.getClass();
            C15Z2.LIZIZ().storeInt(key2, iIntValue);
        }
        LJI(c15ym);
    }
}
