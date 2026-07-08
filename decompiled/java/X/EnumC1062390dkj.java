package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0dkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1062390dkj {
    PUBLIC,
    PROTECTED,
    PRIVATE,
    SECURE;

    @Override // java.lang.Enum
    public String toString() {
        return this == PRIVATE ? "private" : this == PROTECTED ? "protected" : this == SECURE ? "secure" : "public";
    }

    public static EnumC1062390dkj from(String str) {
        if (TextUtils.isEmpty(str)) {
            return PUBLIC;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals("protected", lowerCase)) {
            return PROTECTED;
        }
        if (TextUtils.equals("private", lowerCase)) {
            return PRIVATE;
        }
        if (TextUtils.equals("secure", lowerCase)) {
            return SECURE;
        }
        return PUBLIC;
    }

    public static EnumC1062390dkj valueOf(String str) {
        return (EnumC1062390dkj) C08FF.LIZ(EnumC1062390dkj.class, str);
    }
}
