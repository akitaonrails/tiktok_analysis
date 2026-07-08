package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982970bgd {
    public static final /* synthetic */ EnumC982970bgd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC982970bgd SCENE_INFO;
    public static final EnumC982970bgd SCENE_MSG;
    public static final EnumC982970bgd SCENE_SEI;

    public static InterfaceC2044707zh<EnumC982970bgd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC982970bgd enumC982970bgd = new EnumC982970bgd("SCENE_INFO", 0);
        SCENE_INFO = enumC982970bgd;
        EnumC982970bgd enumC982970bgd2 = new EnumC982970bgd("SCENE_MSG", 1);
        SCENE_MSG = enumC982970bgd2;
        EnumC982970bgd enumC982970bgd3 = new EnumC982970bgd("SCENE_SEI", 2);
        SCENE_SEI = enumC982970bgd3;
        EnumC982970bgd[] enumC982970bgdArr = {enumC982970bgd, enumC982970bgd2, enumC982970bgd3};
        LL = enumC982970bgdArr;
        LLILLJJLI = new C2254308sP(enumC982970bgdArr);
    }

    public static EnumC982970bgd[] values() {
        return (EnumC982970bgd[]) LL.clone();
    }

    public final boolean isSEI() {
        return this == SCENE_SEI;
    }

    public static EnumC982970bgd valueOf(String str) {
        return (EnumC982970bgd) C08FF.LIZ(EnumC982970bgd.class, str);
    }

    public EnumC982970bgd(String str, int i) {
    }
}
