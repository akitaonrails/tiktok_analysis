package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01gG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC395401gG {
    public static final EnumC395401gG CLICK;
    public static final EnumC395401gG CLICK_CANCEL;
    public static final /* synthetic */ EnumC395401gG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC395401gG SLIDE;

    public static InterfaceC2044707zh<EnumC395401gG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC395401gG enumC395401gG = new EnumC395401gG("CLICK_CANCEL", 0);
        CLICK_CANCEL = enumC395401gG;
        EnumC395401gG enumC395401gG2 = new EnumC395401gG("SLIDE", 1);
        SLIDE = enumC395401gG2;
        EnumC395401gG enumC395401gG3 = new EnumC395401gG("CLICK", 2);
        CLICK = enumC395401gG3;
        EnumC395401gG[] enumC395401gGArr = {enumC395401gG, enumC395401gG2, enumC395401gG3};
        LL = enumC395401gGArr;
        LLILLJJLI = new C2254308sP(enumC395401gGArr);
    }

    public static EnumC395401gG[] values() {
        return (EnumC395401gG[]) LL.clone();
    }

    public static EnumC395401gG valueOf(String str) {
        return (EnumC395401gG) C08FF.LIZ(EnumC395401gG.class, str);
    }

    public EnumC395401gG(String str, int i) {
    }
}
