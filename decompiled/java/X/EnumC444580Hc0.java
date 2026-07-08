package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC444580Hc0 {
    public static final /* synthetic */ EnumC444580Hc0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC444580Hc0 NO_BUTTON;
    public static final EnumC444580Hc0 PILL_BUTTON;
    public static final EnumC444580Hc0 SQUARED_BUTTON;

    public static InterfaceC2044707zh<EnumC444580Hc0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC444580Hc0 enumC444580Hc0 = new EnumC444580Hc0("PILL_BUTTON", 0);
        PILL_BUTTON = enumC444580Hc0;
        EnumC444580Hc0 enumC444580Hc02 = new EnumC444580Hc0("SQUARED_BUTTON", 1);
        SQUARED_BUTTON = enumC444580Hc02;
        EnumC444580Hc0 enumC444580Hc03 = new EnumC444580Hc0("NO_BUTTON", 2);
        NO_BUTTON = enumC444580Hc03;
        EnumC444580Hc0[] enumC444580Hc0Arr = {enumC444580Hc0, enumC444580Hc02, enumC444580Hc03};
        LL = enumC444580Hc0Arr;
        LLILLJJLI = new C2254308sP(enumC444580Hc0Arr);
    }

    public static EnumC444580Hc0[] values() {
        return (EnumC444580Hc0[]) LL.clone();
    }

    public static EnumC444580Hc0 valueOf(String str) {
        return (EnumC444580Hc0) C08FF.LIZ(EnumC444580Hc0.class, str);
    }

    public EnumC444580Hc0(String str, int i) {
    }
}
