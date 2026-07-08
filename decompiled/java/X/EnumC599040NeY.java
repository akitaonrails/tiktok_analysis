package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599040NeY {
    public static final /* synthetic */ EnumC599040NeY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599040NeY PUBLISH;
    public static final EnumC599040NeY REGISTER;
    public static final EnumC599040NeY TRIGGER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC599040NeY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599040NeY enumC599040NeY = new EnumC599040NeY("REGISTER", 0, 1);
        REGISTER = enumC599040NeY;
        EnumC599040NeY enumC599040NeY2 = new EnumC599040NeY("TRIGGER", 1, 2);
        TRIGGER = enumC599040NeY2;
        EnumC599040NeY enumC599040NeY3 = new EnumC599040NeY("PUBLISH", 2, 3);
        PUBLISH = enumC599040NeY3;
        EnumC599040NeY[] enumC599040NeYArr = {enumC599040NeY, enumC599040NeY2, enumC599040NeY3};
        LLILLJJLI = enumC599040NeYArr;
        LLILLL = new C2254308sP(enumC599040NeYArr);
    }

    public static EnumC599040NeY[] values() {
        return (EnumC599040NeY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC599040NeY valueOf(String str) {
        return (EnumC599040NeY) C08FF.LIZ(EnumC599040NeY.class, str);
    }

    public EnumC599040NeY(String str, int i, int i2) {
        this.LL = i2;
    }
}
