package X;

/* JADX INFO: renamed from: X.1AIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177211AIt {
    public static final /* synthetic */ C2177211AIt LIZ = new C2177211AIt();

    public static String LIZ(String str, C10LT c10lt) {
        StringBuilder sb = new StringBuilder("Relation_");
        if (str != null) {
            sb.append(str);
            sb.append("_");
        }
        sb.append(c10lt.getTypeName());
        return sb.toString();
    }
}
