package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0O4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC613520O4o {
    public static final EnumC613520O4o LLILLJJLI;
    public static final EnumC613520O4o LLILLL;
    public static final EnumC613520O4o LLILZ;
    public static final EnumC613520O4o LLILZIL;
    public static final EnumC613520O4o LLILZLL;
    public static final EnumC613520O4o LLIZ;
    public static final /* synthetic */ EnumC613520O4o[] LLIZLLLIL;
    public final int LL;

    static {
        EnumC613520O4o enumC613520O4o = new EnumC613520O4o("TTM_GECKO_RESOURCE_EXITS", 0, 0);
        LLILLJJLI = enumC613520O4o;
        EnumC613520O4o enumC613520O4o2 = new EnumC613520O4o("TTM_GECKO_RESOURCE_NOT_EXITS", 1, 1);
        EnumC613520O4o enumC613520O4o3 = new EnumC613520O4o("TTM_GECKO_RESOURCE_DOWNLOADING", 2, 2);
        LLILLL = enumC613520O4o3;
        EnumC613520O4o enumC613520O4o4 = new EnumC613520O4o("TTM_GECKO_RESOURCE_DOWNLOAD_FAILED", 3, 3);
        LLILZ = enumC613520O4o4;
        EnumC613520O4o enumC613520O4o5 = new EnumC613520O4o("TTM_GECKO_RESOURCE_CHANNEL_INVALID", 4, 4);
        LLILZIL = enumC613520O4o5;
        EnumC613520O4o enumC613520O4o6 = new EnumC613520O4o("TTM_GECKO_RESOURCE_CHECK_SERVER_FAIL", 5, 5);
        LLILZLL = enumC613520O4o6;
        EnumC613520O4o enumC613520O4o7 = new EnumC613520O4o("TTM_GECKO_RESOURCE_CHANNEL_LAST_VERSION", 6, 6);
        LLIZ = enumC613520O4o7;
        EnumC613520O4o[] enumC613520O4oArr = {enumC613520O4o, enumC613520O4o2, enumC613520O4o3, enumC613520O4o4, enumC613520O4o5, enumC613520O4o6, enumC613520O4o7};
        LLIZLLLIL = enumC613520O4oArr;
        new C2254308sP(enumC613520O4oArr);
    }

    public static EnumC613520O4o[] values() {
        return (EnumC613520O4o[]) LLIZLLLIL.clone();
    }

    public static EnumC613520O4o valueOf(String str) {
        return (EnumC613520O4o) C08FF.LIZ(EnumC613520O4o.class, str);
    }

    public EnumC613520O4o(String str, int i, int i2) {
        this.LL = i2;
    }
}
