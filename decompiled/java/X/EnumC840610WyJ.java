package X;

/* JADX INFO: renamed from: X.0WyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC840610WyJ {
    BOOLEAN("Boolean"),
    STRING("String"),
    ARRAY("Array"),
    DICTIONARY("Dictionary"),
    UNKNOWN("Object");

    public final String LL;

    public static EnumC840610WyJ valueOf(String str) {
        return (EnumC840610WyJ) C08FF.LIZ(EnumC840610WyJ.class, str);
    }

    public final String getDesc() {
        return this.LL;
    }

    EnumC840610WyJ(String str) {
        this.LL = str;
    }
}
