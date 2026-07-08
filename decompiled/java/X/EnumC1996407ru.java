package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1996407ru {
    public static final /* synthetic */ EnumC1996407ru[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1996407ru RIGHT_OF_NAME;
    public static final EnumC1996407ru RIGHT_OF_TAG;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1996407ru> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1996407ru enumC1996407ru = new EnumC1996407ru("RIGHT_OF_NAME", 0, 1);
        RIGHT_OF_NAME = enumC1996407ru;
        EnumC1996407ru enumC1996407ru2 = new EnumC1996407ru("RIGHT_OF_TAG", 1, 2);
        RIGHT_OF_TAG = enumC1996407ru2;
        EnumC1996407ru[] enumC1996407ruArr = {enumC1996407ru, enumC1996407ru2};
        LLILLJJLI = enumC1996407ruArr;
        LLILLL = new C2254308sP(enumC1996407ruArr);
    }

    public static EnumC1996407ru[] values() {
        return (EnumC1996407ru[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1996407ru valueOf(String str) {
        return (EnumC1996407ru) C08FF.LIZ(EnumC1996407ru.class, str);
    }

    public EnumC1996407ru(String str, int i, int i2) {
        this.LL = i2;
    }
}
