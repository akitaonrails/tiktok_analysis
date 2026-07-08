package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07sB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1998107sB {
    public static final /* synthetic */ EnumC1998107sB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1998107sB POST_FREQUENCY_LIMIT_DIALOG;
    public static final EnumC1998107sB PRIVACY_DIALOG;
    public static final EnumC1998107sB SENSITIVE_TITLE_DIALOG;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1998107sB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1998107sB enumC1998107sB = new EnumC1998107sB("PRIVACY_DIALOG", 0, 2);
        PRIVACY_DIALOG = enumC1998107sB;
        EnumC1998107sB enumC1998107sB2 = new EnumC1998107sB("POST_FREQUENCY_LIMIT_DIALOG", 1, 2);
        POST_FREQUENCY_LIMIT_DIALOG = enumC1998107sB2;
        EnumC1998107sB enumC1998107sB3 = new EnumC1998107sB("SENSITIVE_TITLE_DIALOG", 2, 1);
        SENSITIVE_TITLE_DIALOG = enumC1998107sB3;
        EnumC1998107sB[] enumC1998107sBArr = {enumC1998107sB, enumC1998107sB2, enumC1998107sB3};
        LLILLJJLI = enumC1998107sBArr;
        LLILLL = new C2254308sP(enumC1998107sBArr);
    }

    public static EnumC1998107sB[] values() {
        return (EnumC1998107sB[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC1998107sB valueOf(String str) {
        return (EnumC1998107sB) C08FF.LIZ(EnumC1998107sB.class, str);
    }

    public EnumC1998107sB(String str, int i, int i2) {
        this.LL = i2;
    }
}
