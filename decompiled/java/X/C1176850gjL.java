package X;

/* JADX INFO: renamed from: X.0gjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176850gjL {
    public static final CharSequence LIZ(int i, Number number, String str) {
        C19348710mr c19348710mr;
        if (number != null && number.longValue() >= 0) {
            if (number.longValue() < 10000) {
                c19348710mr = new C19348710mr(null, null, null, 15);
            } else {
                c19348710mr = new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13);
            }
            CharSequence charSequenceLIZ = C19374310qz.LIZ(number, c19348710mr, null, i, 20);
            if (charSequenceLIZ == null) {
                return "";
            }
            return charSequenceLIZ;
        }
        return str;
    }
}
