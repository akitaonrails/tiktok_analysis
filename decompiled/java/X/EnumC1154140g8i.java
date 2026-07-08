package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154140g8i {
    public static final EnumC1154140g8i APPEAL;
    public static final /* synthetic */ EnumC1154140g8i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154140g8i VIEW_DETAILS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1154140g8i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154140g8i enumC1154140g8i = new EnumC1154140g8i("VIEW_DETAILS", 0, "view_details");
        VIEW_DETAILS = enumC1154140g8i;
        EnumC1154140g8i enumC1154140g8i2 = new EnumC1154140g8i("APPEAL", 1, "appeal");
        APPEAL = enumC1154140g8i2;
        EnumC1154140g8i[] enumC1154140g8iArr = {enumC1154140g8i, enumC1154140g8i2};
        LLILLJJLI = enumC1154140g8iArr;
        LLILLL = new C2254308sP(enumC1154140g8iArr);
    }

    public static EnumC1154140g8i[] values() {
        return (EnumC1154140g8i[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1154140g8i valueOf(String str) {
        return (EnumC1154140g8i) C08FF.LIZ(EnumC1154140g8i.class, str);
    }

    public EnumC1154140g8i(String str, int i, String str2) {
        this.LL = str2;
    }
}
