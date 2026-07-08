package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782600wUM {
    public static final EnumC1782600wUM ALIENATION;
    public static final /* synthetic */ EnumC1782600wUM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782600wUM RED_DOT;
    public static final EnumC1782600wUM TEXT_RED_DOT;
    public static final EnumC1782600wUM UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1782600wUM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782600wUM enumC1782600wUM = new EnumC1782600wUM("UNKNOWN", 0, 0);
        UNKNOWN = enumC1782600wUM;
        EnumC1782600wUM enumC1782600wUM2 = new EnumC1782600wUM("RED_DOT", 1, 1);
        RED_DOT = enumC1782600wUM2;
        EnumC1782600wUM enumC1782600wUM3 = new EnumC1782600wUM("TEXT_RED_DOT", 2, 2);
        TEXT_RED_DOT = enumC1782600wUM3;
        EnumC1782600wUM enumC1782600wUM4 = new EnumC1782600wUM("ALIENATION", 3, 3);
        ALIENATION = enumC1782600wUM4;
        EnumC1782600wUM[] enumC1782600wUMArr = {enumC1782600wUM, enumC1782600wUM2, enumC1782600wUM3, enumC1782600wUM4};
        LLILLJJLI = enumC1782600wUMArr;
        LLILLL = new C2254308sP(enumC1782600wUMArr);
    }

    public static EnumC1782600wUM[] values() {
        return (EnumC1782600wUM[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1782600wUM valueOf(String str) {
        return (EnumC1782600wUM) C08FF.LIZ(EnumC1782600wUM.class, str);
    }

    public EnumC1782600wUM(String str, int i, int i2) {
        this.LL = i2;
    }
}
