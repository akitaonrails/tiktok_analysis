package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20645715qZ {
    public static final EnumC20645715qZ FETCH;
    public static final /* synthetic */ EnumC20645715qZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20645715qZ LOAD;
    public static final EnumC20645715qZ REQUEST;
    public static final EnumC20645715qZ SHOW;
    public static final EnumC20645715qZ TRIGGER;
    public static final EnumC20645715qZ UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20645715qZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20645715qZ enumC20645715qZ = new EnumC20645715qZ("UNKNOWN", 0, "");
        UNKNOWN = enumC20645715qZ;
        EnumC20645715qZ enumC20645715qZ2 = new EnumC20645715qZ("REQUEST", 1, "request");
        REQUEST = enumC20645715qZ2;
        EnumC20645715qZ enumC20645715qZ3 = new EnumC20645715qZ("FETCH", 2, "fetch");
        FETCH = enumC20645715qZ3;
        EnumC20645715qZ enumC20645715qZ4 = new EnumC20645715qZ("LOAD", 3, "load");
        LOAD = enumC20645715qZ4;
        EnumC20645715qZ enumC20645715qZ5 = new EnumC20645715qZ("TRIGGER", 4, "trigger");
        TRIGGER = enumC20645715qZ5;
        EnumC20645715qZ enumC20645715qZ6 = new EnumC20645715qZ("SHOW", 5, "show");
        SHOW = enumC20645715qZ6;
        EnumC20645715qZ[] enumC20645715qZArr = {enumC20645715qZ, enumC20645715qZ2, enumC20645715qZ3, enumC20645715qZ4, enumC20645715qZ5, enumC20645715qZ6};
        LLILLJJLI = enumC20645715qZArr;
        LLILLL = new C2254308sP(enumC20645715qZArr);
    }

    public static EnumC20645715qZ[] values() {
        return (EnumC20645715qZ[]) LLILLJJLI.clone();
    }

    public final String getStage() {
        return this.LL;
    }

    public static EnumC20645715qZ valueOf(String str) {
        return (EnumC20645715qZ) C08FF.LIZ(EnumC20645715qZ.class, str);
    }

    public EnumC20645715qZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
