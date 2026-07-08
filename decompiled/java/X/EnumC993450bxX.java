package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993450bxX {
    public static final /* synthetic */ EnumC993450bxX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993450bxX TYPE_LARGE;
    public static final EnumC993450bxX TYPE_NORMAL;

    public static InterfaceC2044707zh<EnumC993450bxX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993450bxX enumC993450bxX = new EnumC993450bxX("TYPE_NORMAL", 0);
        TYPE_NORMAL = enumC993450bxX;
        EnumC993450bxX enumC993450bxX2 = new EnumC993450bxX("TYPE_LARGE", 1);
        TYPE_LARGE = enumC993450bxX2;
        EnumC993450bxX[] enumC993450bxXArr = {enumC993450bxX, enumC993450bxX2};
        LL = enumC993450bxXArr;
        LLILLJJLI = new C2254308sP(enumC993450bxXArr);
    }

    public static EnumC993450bxX[] values() {
        return (EnumC993450bxX[]) LL.clone();
    }

    public static EnumC993450bxX valueOf(String str) {
        return (EnumC993450bxX) C08FF.LIZ(EnumC993450bxX.class, str);
    }

    public EnumC993450bxX(String str, int i) {
    }
}
