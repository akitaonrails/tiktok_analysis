package X;

import android.content.SharedPreferences;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131920fYs {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS205S0000000_17.get$arr$(134));

    public static long LIZ(Long l) {
        return ((SharedPreferences) LIZ.getValue()).getLong(String.valueOf(l), -1L);
    }
}
