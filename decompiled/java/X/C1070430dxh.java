package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0dxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070430dxh {
    public final String LIZ;
    public final EnumC1005390cGn LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Bundle LJI;

    public /* synthetic */ C1070430dxh(String str, boolean z) {
        this(str, EnumC1005390cGn.INITIAL, false, z, "", "", null);
    }

    public static C1070430dxh LIZ(C1070430dxh c1070430dxh, EnumC1005390cGn enumC1005390cGn, boolean z, String str, String str2, int i) {
        String str3;
        boolean z2;
        String str4 = str2;
        String str5 = str;
        boolean z3 = z;
        EnumC1005390cGn enumC1005390cGn2 = enumC1005390cGn;
        Bundle bundle = null;
        if ((i & 1) != 0) {
            str3 = c1070430dxh.LIZ;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            enumC1005390cGn2 = c1070430dxh.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c1070430dxh.LIZJ;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = c1070430dxh.LIZLLL;
        }
        if ((i & 16) != 0) {
            str5 = c1070430dxh.LJ;
        }
        if ((i & 32) != 0) {
            str4 = c1070430dxh.LJFF;
        }
        if ((i & 64) != 0) {
            bundle = c1070430dxh.LJI;
        }
        c1070430dxh.getClass();
        return new C1070430dxh(str3, enumC1005390cGn2, z2, z3, str5, str4, bundle);
    }

    public C1070430dxh(String str, EnumC1005390cGn enumC1005390cGn, boolean z, boolean z2, String str2, String str3, Bundle bundle) {
        this.LIZ = str;
        this.LIZIZ = enumC1005390cGn;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = bundle;
    }
}
