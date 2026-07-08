package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bUC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC975260bUC {
    public static final EnumC975260bUC CHANNEL_ID_INVALID;
    public static final /* synthetic */ EnumC975260bUC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "channel_id_invalid";

    public static InterfaceC2044707zh<EnumC975260bUC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC975260bUC enumC975260bUC = new EnumC975260bUC();
        CHANNEL_ID_INVALID = enumC975260bUC;
        EnumC975260bUC[] enumC975260bUCArr = {enumC975260bUC};
        LLILLJJLI = enumC975260bUCArr;
        LLILLL = new C2254308sP(enumC975260bUCArr);
    }

    public static EnumC975260bUC[] values() {
        return (EnumC975260bUC[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC975260bUC valueOf(String str) {
        return (EnumC975260bUC) C08FF.LIZ(EnumC975260bUC.class, str);
    }
}
