package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2006507tX {
    public static final /* synthetic */ EnumC2006507tX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2006507tX MUSIC_CHANGE;
    public static final EnumC2006507tX VIDEO_COMPILE;

    public static InterfaceC2044707zh<EnumC2006507tX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2006507tX enumC2006507tX = new EnumC2006507tX("MUSIC_CHANGE", 0);
        MUSIC_CHANGE = enumC2006507tX;
        EnumC2006507tX enumC2006507tX2 = new EnumC2006507tX("VIDEO_COMPILE", 1);
        VIDEO_COMPILE = enumC2006507tX2;
        EnumC2006507tX[] enumC2006507tXArr = {enumC2006507tX, enumC2006507tX2};
        LL = enumC2006507tXArr;
        LLILLJJLI = new C2254308sP(enumC2006507tXArr);
    }

    public static EnumC2006507tX[] values() {
        return (EnumC2006507tX[]) LL.clone();
    }

    public static EnumC2006507tX valueOf(String str) {
        return (EnumC2006507tX) C08FF.LIZ(EnumC2006507tX.class, str);
    }

    public EnumC2006507tX(String str, int i) {
    }
}
