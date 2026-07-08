package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683790Qrx {
    public static EnumC683800Qry LIZ(String str) {
        for (EnumC683800Qry enumC683800Qry : EnumC683800Qry.values()) {
            String key = enumC683800Qry.getKey();
            Locale locale = Locale.ROOT;
            if (Intrinsics.LJFF(key.toLowerCase(locale), str.toLowerCase(locale))) {
                return enumC683800Qry;
            }
        }
        return null;
    }
}
