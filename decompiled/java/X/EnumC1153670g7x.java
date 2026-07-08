package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153670g7x {
    public static final EnumC1153670g7x LEFT_TO_RIGHT;
    public static final /* synthetic */ EnumC1153670g7x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153670g7x RIGHT_TO_LEFT;

    public static InterfaceC2044707zh<EnumC1153670g7x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153670g7x enumC1153670g7x = new EnumC1153670g7x("LEFT_TO_RIGHT", 0);
        LEFT_TO_RIGHT = enumC1153670g7x;
        EnumC1153670g7x enumC1153670g7x2 = new EnumC1153670g7x("RIGHT_TO_LEFT", 1);
        RIGHT_TO_LEFT = enumC1153670g7x2;
        EnumC1153670g7x[] enumC1153670g7xArr = {enumC1153670g7x, enumC1153670g7x2};
        LL = enumC1153670g7xArr;
        LLILLJJLI = new C2254308sP(enumC1153670g7xArr);
    }

    public static EnumC1153670g7x[] values() {
        return (EnumC1153670g7x[]) LL.clone();
    }

    public static EnumC1153670g7x valueOf(String str) {
        return (EnumC1153670g7x) C08FF.LIZ(EnumC1153670g7x.class, str);
    }

    public EnumC1153670g7x(String str, int i) {
    }
}
