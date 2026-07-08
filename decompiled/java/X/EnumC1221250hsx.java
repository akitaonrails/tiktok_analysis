package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221250hsx {
    public static final EnumC1221250hsx DISMISS;
    public static final /* synthetic */ EnumC1221250hsx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1221250hsx SHOW;

    public static InterfaceC2044707zh<EnumC1221250hsx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221250hsx enumC1221250hsx = new EnumC1221250hsx("SHOW", 0);
        SHOW = enumC1221250hsx;
        EnumC1221250hsx enumC1221250hsx2 = new EnumC1221250hsx("DISMISS", 1);
        DISMISS = enumC1221250hsx2;
        EnumC1221250hsx[] enumC1221250hsxArr = {enumC1221250hsx, enumC1221250hsx2};
        LL = enumC1221250hsxArr;
        LLILLJJLI = new C2254308sP(enumC1221250hsxArr);
    }

    public static EnumC1221250hsx[] values() {
        return (EnumC1221250hsx[]) LL.clone();
    }

    public static EnumC1221250hsx valueOf(String str) {
        return (EnumC1221250hsx) C08FF.LIZ(EnumC1221250hsx.class, str);
    }

    public EnumC1221250hsx(String str, int i) {
    }
}
