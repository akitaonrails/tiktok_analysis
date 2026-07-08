package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ieY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1250760ieY {
    public static final EnumC1250760ieY EXPANDED;
    public static final EnumC1250760ieY EXPANDED_TO_HIDE;
    public static final EnumC1250760ieY HIDE;
    public static final EnumC1250760ieY HIDE_TO_EXPANDED;
    public static final /* synthetic */ EnumC1250760ieY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1250760ieY LOADING;

    public static InterfaceC2044707zh<EnumC1250760ieY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1250760ieY enumC1250760ieY = new EnumC1250760ieY("HIDE", 0);
        HIDE = enumC1250760ieY;
        EnumC1250760ieY enumC1250760ieY2 = new EnumC1250760ieY("LOADING", 1);
        LOADING = enumC1250760ieY2;
        EnumC1250760ieY enumC1250760ieY3 = new EnumC1250760ieY("EXPANDED", 2);
        EXPANDED = enumC1250760ieY3;
        EnumC1250760ieY enumC1250760ieY4 = new EnumC1250760ieY("HIDE_TO_EXPANDED", 3);
        HIDE_TO_EXPANDED = enumC1250760ieY4;
        EnumC1250760ieY enumC1250760ieY5 = new EnumC1250760ieY("EXPANDED_TO_HIDE", 4);
        EXPANDED_TO_HIDE = enumC1250760ieY5;
        EnumC1250760ieY[] enumC1250760ieYArr = {enumC1250760ieY, enumC1250760ieY2, enumC1250760ieY3, enumC1250760ieY4, enumC1250760ieY5};
        LL = enumC1250760ieYArr;
        LLILLJJLI = new C2254308sP(enumC1250760ieYArr);
    }

    public static EnumC1250760ieY[] values() {
        return (EnumC1250760ieY[]) LL.clone();
    }

    public static EnumC1250760ieY valueOf(String str) {
        return (EnumC1250760ieY) C08FF.LIZ(EnumC1250760ieY.class, str);
    }

    public EnumC1250760ieY(String str, int i) {
    }
}
