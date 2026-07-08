package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1346930l9f {
    public static final EnumC1346930l9f ADD;
    public static final EnumC1346930l9f DELETE;
    public static final /* synthetic */ EnumC1346930l9f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1346930l9f REPLACE;
    public static final EnumC1346930l9f REPLACED_BY_PHOTO;
    public static final EnumC1346930l9f REPLACE_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1346930l9f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1346930l9f enumC1346930l9f = new EnumC1346930l9f("ADD", 0, "add");
        ADD = enumC1346930l9f;
        EnumC1346930l9f enumC1346930l9f2 = new EnumC1346930l9f("DELETE", 1, "delete");
        DELETE = enumC1346930l9f2;
        EnumC1346930l9f enumC1346930l9f3 = new EnumC1346930l9f("REPLACE", 2, "replace");
        REPLACE = enumC1346930l9f3;
        EnumC1346930l9f enumC1346930l9f4 = new EnumC1346930l9f("REPLACE_PHOTO", 3, "replace_photo");
        REPLACE_PHOTO = enumC1346930l9f4;
        EnumC1346930l9f enumC1346930l9f5 = new EnumC1346930l9f("REPLACED_BY_PHOTO", 4, "replaced_by_photo");
        REPLACED_BY_PHOTO = enumC1346930l9f5;
        EnumC1346930l9f[] enumC1346930l9fArr = {enumC1346930l9f, enumC1346930l9f2, enumC1346930l9f3, enumC1346930l9f4, enumC1346930l9f5};
        LLILLJJLI = enumC1346930l9fArr;
        LLILLL = new C2254308sP(enumC1346930l9fArr);
    }

    public static EnumC1346930l9f[] values() {
        return (EnumC1346930l9f[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1346930l9f valueOf(String str) {
        return (EnumC1346930l9f) C08FF.LIZ(EnumC1346930l9f.class, str);
    }

    public EnumC1346930l9f(String str, int i, String str2) {
        this.LL = str2;
    }
}
