package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC645300PSu {
    public static final /* synthetic */ EnumC645300PSu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC645300PSu TOP_TAB;
    public static final EnumC645300PSu VIDEO_TAB;

    public static InterfaceC2044707zh<EnumC645300PSu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC645300PSu enumC645300PSu = new EnumC645300PSu("TOP_TAB", 0);
        TOP_TAB = enumC645300PSu;
        EnumC645300PSu enumC645300PSu2 = new EnumC645300PSu("VIDEO_TAB", 1);
        VIDEO_TAB = enumC645300PSu2;
        EnumC645300PSu[] enumC645300PSuArr = {enumC645300PSu, enumC645300PSu2};
        LL = enumC645300PSuArr;
        LLILLJJLI = new C2254308sP(enumC645300PSuArr);
    }

    public static EnumC645300PSu[] values() {
        return (EnumC645300PSu[]) LL.clone();
    }

    public static EnumC645300PSu valueOf(String str) {
        return (EnumC645300PSu) C08FF.LIZ(EnumC645300PSu.class, str);
    }

    public EnumC645300PSu(String str, int i) {
    }
}
