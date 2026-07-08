package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC975270bUD {
    public static final EnumC975270bUD CHANNEL_ID_INVALID;
    public static final /* synthetic */ EnumC975270bUD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "channel_id_invalid";

    public static InterfaceC2044707zh<EnumC975270bUD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC975270bUD enumC975270bUD = new EnumC975270bUD();
        CHANNEL_ID_INVALID = enumC975270bUD;
        EnumC975270bUD[] enumC975270bUDArr = {enumC975270bUD};
        LLILLJJLI = enumC975270bUDArr;
        LLILLL = new C2254308sP(enumC975270bUDArr);
    }

    public static EnumC975270bUD[] values() {
        return (EnumC975270bUD[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC975270bUD valueOf(String str) {
        return (EnumC975270bUD) C08FF.LIZ(EnumC975270bUD.class, str);
    }
}
