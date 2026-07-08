package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06j5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1686906j5 {
    public static final EnumC1686906j5 EXPLOSION;
    public static final /* synthetic */ EnumC1686906j5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1686906j5 VIDEO_RAIN;

    public static InterfaceC2044707zh<EnumC1686906j5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1686906j5 enumC1686906j5 = new EnumC1686906j5("VIDEO_RAIN", 0);
        VIDEO_RAIN = enumC1686906j5;
        EnumC1686906j5 enumC1686906j52 = new EnumC1686906j5("EXPLOSION", 1);
        EXPLOSION = enumC1686906j52;
        EnumC1686906j5[] enumC1686906j5Arr = {enumC1686906j5, enumC1686906j52};
        LL = enumC1686906j5Arr;
        LLILLJJLI = new C2254308sP(enumC1686906j5Arr);
    }

    public static EnumC1686906j5[] values() {
        return (EnumC1686906j5[]) LL.clone();
    }

    public static EnumC1686906j5 valueOf(String str) {
        return (EnumC1686906j5) C08FF.LIZ(EnumC1686906j5.class, str);
    }

    public EnumC1686906j5(String str, int i) {
    }
}
