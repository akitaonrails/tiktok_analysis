package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1984907q3 {
    public static final /* synthetic */ EnumC1984907q3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1984907q3 TEXT;
    public static final EnumC1984907q3 TEXT_BOX;
    public static final EnumC1984907q3 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1984907q3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1984907q3 enumC1984907q3 = new EnumC1984907q3("UNKNOWN", 0, 0);
        UNKNOWN = enumC1984907q3;
        EnumC1984907q3 enumC1984907q32 = new EnumC1984907q3("TEXT_BOX", 1, 1);
        TEXT_BOX = enumC1984907q32;
        EnumC1984907q3 enumC1984907q33 = new EnumC1984907q3("TEXT", 2, 2);
        TEXT = enumC1984907q33;
        EnumC1984907q3[] enumC1984907q3Arr = {enumC1984907q3, enumC1984907q32, enumC1984907q33};
        LLILLJJLI = enumC1984907q3Arr;
        LLILLL = new C2254308sP(enumC1984907q3Arr);
    }

    public static EnumC1984907q3[] values() {
        return (EnumC1984907q3[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1984907q3 valueOf(String str) {
        return (EnumC1984907q3) C08FF.LIZ(EnumC1984907q3.class, str);
    }

    public EnumC1984907q3(String str, int i, int i2) {
        this.LL = i2;
    }
}
