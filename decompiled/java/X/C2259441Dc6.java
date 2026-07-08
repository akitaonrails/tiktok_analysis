package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.1Dc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259441Dc6 {
    public final InterfaceC2259461Dc8 LIZ;

    public C2259441Dc6(C2259481DcA c2259481DcA) {
        this.LIZ = c2259481DcA;
    }

    public static C2259381Dc0 LIZLLL(Pattern pattern) {
        return new C2259381Dc0(pattern, false, false, null, null);
    }

    public static C2259381Dc0 LJII(Pattern pattern) {
        return new C2259381Dc0(pattern, true, false, null, null);
    }

    public final InterfaceC2259401Dc2 LIZIZ(String str) {
        return this.LIZ.LIZ(this, str);
    }

    public static C2259371Dbz LIZ(String str, InterfaceC2259411Dc3... interfaceC2259411Dc3Arr) {
        int length = interfaceC2259411Dc3Arr.length;
        ArrayList arrayList = new ArrayList(length);
        if (length > 0) {
            Collections.addAll(arrayList, interfaceC2259411Dc3Arr);
        }
        return new C2259371Dbz(str, arrayList);
    }

    public static C2259381Dc0 LJ(Pattern pattern, boolean z) {
        return new C2259381Dc0(pattern, z, true, null, null);
    }

    public static C2259341Dbw LJIIIIZZ(String str, InterfaceC2259391Dc1... interfaceC2259391Dc1Arr) {
        int length = interfaceC2259391Dc1Arr.length;
        ArrayList arrayList = new ArrayList(length);
        if (length > 0) {
            Collections.addAll(arrayList, interfaceC2259391Dc1Arr);
        }
        return new C2259341Dbw(str, arrayList);
    }

    public static List LJIIIZ(InterfaceC2259401Dc2 interfaceC2259401Dc2, String str) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new C07W9(str));
        LIZJ(str, arrayList, interfaceC2259401Dc2, 0, 0, false, null);
        return arrayList;
    }

    public static C2259381Dc0 LJFF(Pattern pattern, boolean z, boolean z2, String str) {
        return new C2259381Dc0(pattern, z, z2, str, null);
    }

    public static C2259381Dc0 LJI(Pattern pattern, boolean z, boolean z2, String str, InterfaceC2259401Dc2 interfaceC2259401Dc2) {
        return new C2259381Dc0(pattern, z, z2, str, interfaceC2259401Dc2);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b A[LOOP:4: B:60:0x0139->B:61:0x013b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r31, java.util.List r32, X.InterfaceC2259401Dc2 r33, int r34, int r35, boolean r36, X.InterfaceC2259411Dc3 r37) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259441Dc6.LIZJ(java.lang.String, java.util.List, X.1Dc2, int, int, boolean, X.1Dc3):void");
    }
}
