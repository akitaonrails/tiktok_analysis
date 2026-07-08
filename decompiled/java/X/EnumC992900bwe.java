package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992900bwe {
    public static final /* synthetic */ EnumC992900bwe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992900bwe NOT_FOUND;
    public static final EnumC992900bwe OFFLINED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992900bwe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992900bwe enumC992900bwe = new EnumC992900bwe("NOT_FOUND", 0, 0);
        NOT_FOUND = enumC992900bwe;
        EnumC992900bwe enumC992900bwe2 = new EnumC992900bwe("OFFLINED", 1, 1);
        OFFLINED = enumC992900bwe2;
        EnumC992900bwe[] enumC992900bweArr = {enumC992900bwe, enumC992900bwe2};
        LLILLJJLI = enumC992900bweArr;
        LLILLL = new C2254308sP(enumC992900bweArr);
    }

    public static EnumC992900bwe[] values() {
        return (EnumC992900bwe[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992900bwe valueOf(String str) {
        return (EnumC992900bwe) C08FF.LIZ(EnumC992900bwe.class, str);
    }

    public EnumC992900bwe(String str, int i, int i2) {
        this.LL = i2;
    }
}
