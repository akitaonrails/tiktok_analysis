package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1850560yFy {
    public static final EnumC1850560yFy DM;
    public static final EnumC1850560yFy GREEN_SCREEN;
    public static final /* synthetic */ EnumC1850560yFy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1850560yFy PHOTO;
    public static final EnumC1850560yFy VIDEO;

    public static InterfaceC2044707zh<EnumC1850560yFy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1850560yFy enumC1850560yFy = new EnumC1850560yFy("VIDEO", 0);
        VIDEO = enumC1850560yFy;
        EnumC1850560yFy enumC1850560yFy2 = new EnumC1850560yFy("GREEN_SCREEN", 1);
        GREEN_SCREEN = enumC1850560yFy2;
        EnumC1850560yFy enumC1850560yFy3 = new EnumC1850560yFy("PHOTO", 2);
        PHOTO = enumC1850560yFy3;
        EnumC1850560yFy enumC1850560yFy4 = new EnumC1850560yFy("DM", 3);
        DM = enumC1850560yFy4;
        EnumC1850560yFy[] enumC1850560yFyArr = {enumC1850560yFy, enumC1850560yFy2, enumC1850560yFy3, enumC1850560yFy4};
        LL = enumC1850560yFyArr;
        LLILLJJLI = new C2254308sP(enumC1850560yFyArr);
    }

    public static EnumC1850560yFy[] values() {
        return (EnumC1850560yFy[]) LL.clone();
    }

    public static EnumC1850560yFy valueOf(String str) {
        return (EnumC1850560yFy) C08FF.LIZ(EnumC1850560yFy.class, str);
    }

    public EnumC1850560yFy(String str, int i) {
    }
}
