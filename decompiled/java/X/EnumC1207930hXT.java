package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hXT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1207930hXT {
    public static final EnumC1207930hXT Cancel;
    public static final EnumC1207930hXT CertInvalid;
    public static final EnumC1207930hXT Denied;
    public static final EnumC1207930hXT DeniedPermanently;
    public static final EnumC1207930hXT DeniedPermanentlyNoPopup;
    public static final EnumC1207930hXT Granted;
    public static final EnumC1207930hXT InnerPopupFailed;
    public static final /* synthetic */ EnumC1207930hXT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1207930hXT NotInitialized;
    public static final EnumC1207930hXT OverLimit;

    public static InterfaceC2044707zh<EnumC1207930hXT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1207930hXT enumC1207930hXT = new EnumC1207930hXT("Granted", 0);
        Granted = enumC1207930hXT;
        EnumC1207930hXT enumC1207930hXT2 = new EnumC1207930hXT("Denied", 1);
        Denied = enumC1207930hXT2;
        EnumC1207930hXT enumC1207930hXT3 = new EnumC1207930hXT("Cancel", 2);
        Cancel = enumC1207930hXT3;
        EnumC1207930hXT enumC1207930hXT4 = new EnumC1207930hXT("DeniedPermanently", 3);
        DeniedPermanently = enumC1207930hXT4;
        EnumC1207930hXT enumC1207930hXT5 = new EnumC1207930hXT("DeniedPermanentlyNoPopup", 4);
        DeniedPermanentlyNoPopup = enumC1207930hXT5;
        EnumC1207930hXT enumC1207930hXT6 = new EnumC1207930hXT("NotInitialized", 5);
        NotInitialized = enumC1207930hXT6;
        EnumC1207930hXT enumC1207930hXT7 = new EnumC1207930hXT("CertInvalid", 6);
        CertInvalid = enumC1207930hXT7;
        EnumC1207930hXT enumC1207930hXT8 = new EnumC1207930hXT("InnerPopupFailed", 7);
        InnerPopupFailed = enumC1207930hXT8;
        EnumC1207930hXT enumC1207930hXT9 = new EnumC1207930hXT("OverLimit", 8);
        OverLimit = enumC1207930hXT9;
        EnumC1207930hXT[] enumC1207930hXTArr = {enumC1207930hXT, enumC1207930hXT2, enumC1207930hXT3, enumC1207930hXT4, enumC1207930hXT5, enumC1207930hXT6, enumC1207930hXT7, enumC1207930hXT8, enumC1207930hXT9};
        LL = enumC1207930hXTArr;
        LLILLJJLI = new C2254308sP(enumC1207930hXTArr);
    }

    public static EnumC1207930hXT[] values() {
        return (EnumC1207930hXT[]) LL.clone();
    }

    public static EnumC1207930hXT valueOf(String str) {
        return (EnumC1207930hXT) C08FF.LIZ(EnumC1207930hXT.class, str);
    }

    public EnumC1207930hXT(String str, int i) {
    }
}
