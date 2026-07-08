package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC892060Yz6 {
    public static final /* synthetic */ EnumC892060Yz6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC892060Yz6 REFRESH_END;
    public static final EnumC892060Yz6 REFRESH_START;
    public static final EnumC892060Yz6 TRY_REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC892060Yz6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC892060Yz6 enumC892060Yz6 = new EnumC892060Yz6("TRY_REFRESH", 0, "try_refresh");
        TRY_REFRESH = enumC892060Yz6;
        EnumC892060Yz6 enumC892060Yz62 = new EnumC892060Yz6("REFRESH_START", 1, "refresh_start");
        REFRESH_START = enumC892060Yz62;
        EnumC892060Yz6 enumC892060Yz63 = new EnumC892060Yz6("REFRESH_END", 2, "refresh_end");
        REFRESH_END = enumC892060Yz63;
        EnumC892060Yz6[] enumC892060Yz6Arr = {enumC892060Yz6, enumC892060Yz62, enumC892060Yz63};
        LLILLJJLI = enumC892060Yz6Arr;
        LLILLL = new C2254308sP(enumC892060Yz6Arr);
    }

    public static EnumC892060Yz6[] values() {
        return (EnumC892060Yz6[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC892060Yz6 valueOf(String str) {
        return (EnumC892060Yz6) C08FF.LIZ(EnumC892060Yz6.class, str);
    }

    public EnumC892060Yz6(String str, int i, String str2) {
        this.LL = str2;
    }
}
