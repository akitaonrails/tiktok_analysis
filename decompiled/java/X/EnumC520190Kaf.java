package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Kaf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC520190Kaf {
    public static final EnumC520190Kaf BLANK_SPACE;
    public static final EnumC520190Kaf BOTTOM_ICON;
    public static final /* synthetic */ EnumC520190Kaf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC520190Kaf OTHERS_SCENE;
    public static final EnumC520190Kaf TOP_ICON;

    public static InterfaceC2044707zh<EnumC520190Kaf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC520190Kaf enumC520190Kaf = new EnumC520190Kaf("TOP_ICON", 0);
        TOP_ICON = enumC520190Kaf;
        EnumC520190Kaf enumC520190Kaf2 = new EnumC520190Kaf("BOTTOM_ICON", 1);
        BOTTOM_ICON = enumC520190Kaf2;
        EnumC520190Kaf enumC520190Kaf3 = new EnumC520190Kaf("BLANK_SPACE", 2);
        BLANK_SPACE = enumC520190Kaf3;
        EnumC520190Kaf enumC520190Kaf4 = new EnumC520190Kaf("OTHERS_SCENE", 3);
        OTHERS_SCENE = enumC520190Kaf4;
        EnumC520190Kaf[] enumC520190KafArr = {enumC520190Kaf, enumC520190Kaf2, enumC520190Kaf3, enumC520190Kaf4};
        LL = enumC520190KafArr;
        LLILLJJLI = new C2254308sP(enumC520190KafArr);
    }

    public static EnumC520190Kaf[] values() {
        return (EnumC520190Kaf[]) LL.clone();
    }

    public static EnumC520190Kaf valueOf(String str) {
        return (EnumC520190Kaf) C08FF.LIZ(EnumC520190Kaf.class, str);
    }

    public EnumC520190Kaf(String str, int i) {
    }
}
