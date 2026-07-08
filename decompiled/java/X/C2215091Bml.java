package X;

import com.bytedance.bddatefmt.BDDateFormat;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: X.1Bml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215091Bml {
    public static String LIZ(int i, EnumC21173917tZ enumC21173917tZ) {
        return new BDDateFormat().LIZLLL(i, enumC21173917tZ, Locale.getDefault());
    }

    public static String LIZIZ(int i, EnumC21173917tZ enumC21173917tZ) {
        return new BDDateFormat().LJ(i, enumC21173917tZ, Locale.getDefault());
    }

    public static String LIZJ(int i, EnumC21173917tZ enumC21173917tZ) {
        return new BDDateFormat().LJFF(i, enumC21173917tZ, Locale.getDefault());
    }

    public static String LIZLLL(long j, Locale locale, Set set, EnumC2207011BZj enumC2207011BZj, boolean z, boolean z2, boolean z3, int i) {
        EnumC1283470jVJ enumC1283470jVJ;
        long j2;
        boolean z4 = z3;
        boolean z5 = z2;
        EnumC2207011BZj enumC2207011BZj2 = enumC2207011BZj;
        boolean z6 = z;
        Locale locale2 = locale;
        if ((i & 2) != 0) {
            locale2 = Locale.getDefault();
        }
        if ((i & 8) != 0) {
            enumC2207011BZj2 = EnumC2207011BZj.Mid;
        }
        if ((i & 16) != 0) {
            enumC1283470jVJ = EnumC1283470jVJ.Normal;
        } else {
            enumC1283470jVJ = null;
        }
        if ((i & 32) != 0) {
            z6 = true;
        }
        if ((i & 64) != 0) {
            z5 = true;
        }
        if ((i & 256) != 0) {
            z4 = true;
        }
        if ((i & 1024) != 0) {
            j2 = 60000;
        } else {
            j2 = 0;
        }
        return new BDDateFormat().LJII(j, locale2, set, enumC2207011BZj2, enumC1283470jVJ, z6, z5, false, z4, false, j2);
    }
}
