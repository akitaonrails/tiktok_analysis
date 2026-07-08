package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1996307rt {
    public static final EnumC1996307rt CLICK_RECORDING;
    public static final /* synthetic */ EnumC1996307rt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1996307rt LONG_PRESS_RECORDING;

    public static InterfaceC2044707zh<EnumC1996307rt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1996307rt enumC1996307rt = new EnumC1996307rt("CLICK_RECORDING", 0);
        CLICK_RECORDING = enumC1996307rt;
        EnumC1996307rt enumC1996307rt2 = new EnumC1996307rt("LONG_PRESS_RECORDING", 1);
        LONG_PRESS_RECORDING = enumC1996307rt2;
        EnumC1996307rt[] enumC1996307rtArr = {enumC1996307rt, enumC1996307rt2};
        LL = enumC1996307rtArr;
        LLILLJJLI = new C2254308sP(enumC1996307rtArr);
    }

    public static EnumC1996307rt[] values() {
        return (EnumC1996307rt[]) LL.clone();
    }

    public static EnumC1996307rt valueOf(String str) {
        return (EnumC1996307rt) C08FF.LIZ(EnumC1996307rt.class, str);
    }

    public EnumC1996307rt(String str, int i) {
    }
}
