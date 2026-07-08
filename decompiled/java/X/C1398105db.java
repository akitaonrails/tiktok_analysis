package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1398105db {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, EnumC2479809ng enumC2479809ng, Function1 function1, int i) {
        int i2;
        EnumC2479809ng enumC2479809ng2 = enumC2479809ng;
        boolean z2 = z;
        int i3 = 0;
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            enumC2479809ng2 = EnumC2479809ng.AUTO;
        }
        if ((i & 8) != 0) {
            i2 = 1280;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            i3 = 80;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1398005da(str, enumC2479809ng2, z2, i2, i3, function1, null), 3);
    }
}
