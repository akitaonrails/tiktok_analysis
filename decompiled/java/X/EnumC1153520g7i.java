package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153520g7i {
    public static final EnumC1153520g7i FULL_SCREEN;
    public static final /* synthetic */ EnumC1153520g7i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153520g7i PREVIEW;

    public static InterfaceC2044707zh<EnumC1153520g7i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153520g7i enumC1153520g7i = new EnumC1153520g7i("PREVIEW", 0);
        PREVIEW = enumC1153520g7i;
        EnumC1153520g7i enumC1153520g7i2 = new EnumC1153520g7i("FULL_SCREEN", 1);
        FULL_SCREEN = enumC1153520g7i2;
        EnumC1153520g7i[] enumC1153520g7iArr = {enumC1153520g7i, enumC1153520g7i2};
        LL = enumC1153520g7iArr;
        LLILLJJLI = new C2254308sP(enumC1153520g7iArr);
    }

    public static EnumC1153520g7i[] values() {
        return (EnumC1153520g7i[]) LL.clone();
    }

    public static EnumC1153520g7i valueOf(String str) {
        return (EnumC1153520g7i) C08FF.LIZ(EnumC1153520g7i.class, str);
    }

    public EnumC1153520g7i(String str, int i) {
    }
}
