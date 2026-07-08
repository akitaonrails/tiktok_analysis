package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1916460zyG {
    public static final EnumC1916460zyG CONSENT_BOX;
    public static final /* synthetic */ EnumC1916460zyG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1916460zyG USER_LOGIN;
    public static final EnumC1916460zyG USER_NOTICE;

    public static InterfaceC2044707zh<EnumC1916460zyG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1916460zyG enumC1916460zyG = new EnumC1916460zyG("CONSENT_BOX", 0);
        CONSENT_BOX = enumC1916460zyG;
        EnumC1916460zyG enumC1916460zyG2 = new EnumC1916460zyG("USER_LOGIN", 1);
        USER_LOGIN = enumC1916460zyG2;
        EnumC1916460zyG enumC1916460zyG3 = new EnumC1916460zyG("USER_NOTICE", 2);
        USER_NOTICE = enumC1916460zyG3;
        EnumC1916460zyG[] enumC1916460zyGArr = {enumC1916460zyG, enumC1916460zyG2, enumC1916460zyG3};
        LL = enumC1916460zyGArr;
        LLILLJJLI = new C2254308sP(enumC1916460zyGArr);
    }

    public static EnumC1916460zyG[] values() {
        return (EnumC1916460zyG[]) LL.clone();
    }

    public static EnumC1916460zyG valueOf(String str) {
        return (EnumC1916460zyG) C08FF.LIZ(EnumC1916460zyG.class, str);
    }

    public EnumC1916460zyG(String str, int i) {
    }
}
