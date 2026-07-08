package X;

/* JADX INFO: renamed from: X.0jKZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1276810jKZ {
    VERTICAL("vertical"),
    HORIZONTAL("horizontal");

    public final String LL;

    public String getValue() {
        return this.LL;
    }

    public static EnumC1276810jKZ valueOf(String str) {
        return (EnumC1276810jKZ) C08FF.LIZ(EnumC1276810jKZ.class, str);
    }

    EnumC1276810jKZ(String str) {
        this.LL = str;
    }
}
