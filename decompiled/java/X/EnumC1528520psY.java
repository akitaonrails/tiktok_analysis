package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0psY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1528520psY {
    public static final /* synthetic */ EnumC1528520psY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1528520psY NO_REUSE;
    public static final EnumC1528520psY REGISTER_CALLBACK;
    public static final EnumC1528520psY WAIT_FOR_RESULT;

    public static InterfaceC2044707zh<EnumC1528520psY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1528520psY enumC1528520psY = new EnumC1528520psY("NO_REUSE", 0);
        NO_REUSE = enumC1528520psY;
        EnumC1528520psY enumC1528520psY2 = new EnumC1528520psY("WAIT_FOR_RESULT", 1);
        WAIT_FOR_RESULT = enumC1528520psY2;
        EnumC1528520psY enumC1528520psY3 = new EnumC1528520psY("REGISTER_CALLBACK", 2);
        REGISTER_CALLBACK = enumC1528520psY3;
        EnumC1528520psY[] enumC1528520psYArr = {enumC1528520psY, enumC1528520psY2, enumC1528520psY3};
        LL = enumC1528520psYArr;
        LLILLJJLI = new C2254308sP(enumC1528520psYArr);
    }

    public static EnumC1528520psY[] values() {
        return (EnumC1528520psY[]) LL.clone();
    }

    public static EnumC1528520psY valueOf(String str) {
        return (EnumC1528520psY) C08FF.LIZ(EnumC1528520psY.class, str);
    }

    public EnumC1528520psY(String str, int i) {
    }
}
