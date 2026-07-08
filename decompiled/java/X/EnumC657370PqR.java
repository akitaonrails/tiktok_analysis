package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC657370PqR {
    public static final EnumC657370PqR AD_PHOTO;
    public static final EnumC657370PqR LIVE;
    public static final /* synthetic */ EnumC657370PqR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC657370PqR PHOTO;
    public static final EnumC657370PqR VIDEO;

    public static InterfaceC2044707zh<EnumC657370PqR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC657370PqR enumC657370PqR = new EnumC657370PqR("VIDEO", 0);
        VIDEO = enumC657370PqR;
        EnumC657370PqR enumC657370PqR2 = new EnumC657370PqR("PHOTO", 1);
        PHOTO = enumC657370PqR2;
        EnumC657370PqR enumC657370PqR3 = new EnumC657370PqR("LIVE", 2);
        LIVE = enumC657370PqR3;
        EnumC657370PqR enumC657370PqR4 = new EnumC657370PqR("AD_PHOTO", 3);
        AD_PHOTO = enumC657370PqR4;
        EnumC657370PqR[] enumC657370PqRArr = {enumC657370PqR, enumC657370PqR2, enumC657370PqR3, enumC657370PqR4};
        LL = enumC657370PqRArr;
        LLILLJJLI = new C2254308sP(enumC657370PqRArr);
    }

    public static EnumC657370PqR[] values() {
        return (EnumC657370PqR[]) LL.clone();
    }

    public static EnumC657370PqR valueOf(String str) {
        return (EnumC657370PqR) C08FF.LIZ(EnumC657370PqR.class, str);
    }

    public EnumC657370PqR(String str, int i) {
    }
}
