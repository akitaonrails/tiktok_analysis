package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.10ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19348810ms {
    public static String LIZ(long j) {
        String string;
        Locale locale = Locale.getDefault();
        C19348710mr c19348710mr = new C19348710mr(null, null, null, 15);
        c19348710mr.LIZIZ = EnumC19356310o5.COMPACT;
        c19348710mr.LIZLLL = EnumC19354810nq.ROUND_HALF_UP;
        CharSequence charSequenceLIZ = C19374310qz.LIZ(Long.valueOf(j), c19348710mr, locale.toLanguageTag(), 0, 24);
        if (charSequenceLIZ != null && (string = charSequenceLIZ.toString()) != null) {
            return string;
        }
        return "";
    }
}
