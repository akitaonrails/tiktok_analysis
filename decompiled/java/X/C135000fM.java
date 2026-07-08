package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00fM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C135000fM {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(388));

    public static boolean LIZ(String str, EnumC1609700rzU enumC1609700rzU, String str2, EnumC1609700rzU enumC1609700rzU2) {
        if (str == null || str2 == null || enumC1609700rzU != enumC1609700rzU2 || !((Boolean) LIZ.getValue()).booleanValue()) {
            return false;
        }
        return Intrinsics.LJFF(a0.LJJLJLI(str, "/", str), a0.LJJLJLI(str2, "/", str2));
    }
}
