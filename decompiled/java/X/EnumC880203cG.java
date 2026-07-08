package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03cG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC880203cG {
    public static final EnumC880203cG BIND_ERROR;
    public static final EnumC880203cG CANCEL;
    public static final /* synthetic */ EnumC880203cG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC880203cG NEED_3DS;
    public static final EnumC880203cG NEED_CVV;
    public static final EnumC880203cG SLIDER_REVIEW;
    public static final EnumC880203cG SUCCESS;
    public static final EnumC880203cG SYSTEM_ERROR;
    public static final EnumC880203cG VERIFY_PASS;
    public static final EnumC880203cG VERIFY_REVIEW;

    public static InterfaceC2044707zh<EnumC880203cG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC880203cG enumC880203cG = new EnumC880203cG("CANCEL", 0);
        CANCEL = enumC880203cG;
        EnumC880203cG enumC880203cG2 = new EnumC880203cG("SUCCESS", 1);
        SUCCESS = enumC880203cG2;
        EnumC880203cG enumC880203cG3 = new EnumC880203cG("VERIFY_REVIEW", 2);
        VERIFY_REVIEW = enumC880203cG3;
        EnumC880203cG enumC880203cG4 = new EnumC880203cG("NEED_CVV", 3);
        NEED_CVV = enumC880203cG4;
        EnumC880203cG enumC880203cG5 = new EnumC880203cG("VERIFY_PASS", 4);
        VERIFY_PASS = enumC880203cG5;
        EnumC880203cG enumC880203cG6 = new EnumC880203cG("NEED_3DS", 5);
        NEED_3DS = enumC880203cG6;
        EnumC880203cG enumC880203cG7 = new EnumC880203cG("SYSTEM_ERROR", 6);
        SYSTEM_ERROR = enumC880203cG7;
        EnumC880203cG enumC880203cG8 = new EnumC880203cG("SLIDER_REVIEW", 7);
        SLIDER_REVIEW = enumC880203cG8;
        EnumC880203cG enumC880203cG9 = new EnumC880203cG("BIND_ERROR", 8);
        BIND_ERROR = enumC880203cG9;
        EnumC880203cG[] enumC880203cGArr = {enumC880203cG, enumC880203cG2, enumC880203cG3, enumC880203cG4, enumC880203cG5, enumC880203cG6, enumC880203cG7, enumC880203cG8, enumC880203cG9};
        LL = enumC880203cGArr;
        LLILLJJLI = new C2254308sP(enumC880203cGArr);
    }

    public static EnumC880203cG[] values() {
        return (EnumC880203cG[]) LL.clone();
    }

    public static EnumC880203cG valueOf(String str) {
        return (EnumC880203cG) C08FF.LIZ(EnumC880203cG.class, str);
    }

    public EnumC880203cG(String str, int i) {
    }
}
