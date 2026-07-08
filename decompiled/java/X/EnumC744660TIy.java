package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC744660TIy {
    public static final EnumC744660TIy BOTTOM_SHEET;
    public static final /* synthetic */ EnumC744660TIy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC744660TIy OVERLAY;

    public static InterfaceC2044707zh<EnumC744660TIy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC744660TIy enumC744660TIy = new EnumC744660TIy("OVERLAY", 0);
        OVERLAY = enumC744660TIy;
        EnumC744660TIy enumC744660TIy2 = new EnumC744660TIy("BOTTOM_SHEET", 1);
        BOTTOM_SHEET = enumC744660TIy2;
        EnumC744660TIy[] enumC744660TIyArr = {enumC744660TIy, enumC744660TIy2};
        LL = enumC744660TIyArr;
        LLILLJJLI = new C2254308sP(enumC744660TIyArr);
    }

    public static EnumC744660TIy[] values() {
        return (EnumC744660TIy[]) LL.clone();
    }

    public static EnumC744660TIy valueOf(String str) {
        return (EnumC744660TIy) C08FF.LIZ(EnumC744660TIy.class, str);
    }

    public EnumC744660TIy(String str, int i) {
    }
}
