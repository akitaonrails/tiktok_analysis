package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC963350bAz {
    public static final EnumC963350bAz COHOST_WITH_GUEST;
    public static final EnumC963350bAz ENLARGED_COHOST;
    public static final EnumC963350bAz GROUP_LIVE;
    public static final /* synthetic */ EnumC963350bAz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC963350bAz MULTI_GUEST;
    public static final EnumC963350bAz TAKE_THE_STAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC963350bAz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC963350bAz enumC963350bAz = new EnumC963350bAz("MULTI_GUEST", 0, "multi_guest");
        MULTI_GUEST = enumC963350bAz;
        EnumC963350bAz enumC963350bAz2 = new EnumC963350bAz("TAKE_THE_STAGE", 1, "take_the_stage");
        TAKE_THE_STAGE = enumC963350bAz2;
        EnumC963350bAz enumC963350bAz3 = new EnumC963350bAz("GROUP_LIVE", 2, "group_live");
        GROUP_LIVE = enumC963350bAz3;
        EnumC963350bAz enumC963350bAz4 = new EnumC963350bAz("COHOST_WITH_GUEST", 3, "cohost_with_guest");
        COHOST_WITH_GUEST = enumC963350bAz4;
        EnumC963350bAz enumC963350bAz5 = new EnumC963350bAz("ENLARGED_COHOST", 4, "enlarged_cohost");
        ENLARGED_COHOST = enumC963350bAz5;
        EnumC963350bAz[] enumC963350bAzArr = {enumC963350bAz, enumC963350bAz2, enumC963350bAz3, enumC963350bAz4, enumC963350bAz5};
        LLILLJJLI = enumC963350bAzArr;
        LLILLL = new C2254308sP(enumC963350bAzArr);
    }

    public static EnumC963350bAz[] values() {
        return (EnumC963350bAz[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC963350bAz valueOf(String str) {
        return (EnumC963350bAz) C08FF.LIZ(EnumC963350bAz.class, str);
    }

    public EnumC963350bAz(String str, int i, String str2) {
        this.LL = str2;
    }
}
