package X;

/* JADX INFO: renamed from: X.18vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21443718vz {
    public static final void LIZ(String str, StringBuilder sb) {
        if (str.charAt(0) == '\\') {
            sb.append((CharSequence) str, 1, str.length());
        } else {
            sb.append(C08ED.LIZ(str));
        }
    }
}
