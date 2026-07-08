package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Grz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429010Grz {
    public static final /* synthetic */ EnumC429010Grz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429010Grz NONE;
    public static final EnumC429010Grz PEN;
    public static final EnumC429010Grz REPOST;

    public static InterfaceC2044707zh<EnumC429010Grz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429010Grz enumC429010Grz = new EnumC429010Grz("NONE", 0);
        NONE = enumC429010Grz;
        EnumC429010Grz enumC429010Grz2 = new EnumC429010Grz("REPOST", 1);
        REPOST = enumC429010Grz2;
        EnumC429010Grz enumC429010Grz3 = new EnumC429010Grz("PEN", 2);
        PEN = enumC429010Grz3;
        EnumC429010Grz[] enumC429010GrzArr = {enumC429010Grz, enumC429010Grz2, enumC429010Grz3};
        LL = enumC429010GrzArr;
        LLILLJJLI = new C2254308sP(enumC429010GrzArr);
    }

    public static EnumC429010Grz[] values() {
        return (EnumC429010Grz[]) LL.clone();
    }

    public static EnumC429010Grz valueOf(String str) {
        return (EnumC429010Grz) C08FF.LIZ(EnumC429010Grz.class, str);
    }

    public EnumC429010Grz(String str, int i) {
    }
}
