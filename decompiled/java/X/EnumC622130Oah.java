package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC622130Oah {
    public static final EnumC622130Oah IDX_ACCESS_STATUS;
    public static final EnumC622130Oah IDX_IDENTITY_TYPE;
    public static final EnumC622130Oah IDX_OWNER_UID;
    public static final EnumC622130Oah IDX_STATUS;
    public static final EnumC622130Oah IDX_SUBSCRIBE_STATUS;
    public static final /* synthetic */ EnumC622130Oah[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC622130Oah> getEntries() {
        return LLILZ;
    }

    static {
        EnumC622130Oah enumC622130Oah = new EnumC622130Oah("IDX_OWNER_UID", 0, "IDX_CHANNEL_OWNER", EnumC622090Oad.CHANNEL_OWNER.getKey());
        IDX_OWNER_UID = enumC622130Oah;
        EnumC622130Oah enumC622130Oah2 = new EnumC622130Oah("IDX_SUBSCRIBE_STATUS", 1, "IDX_SUBSCRIBE_STATUS", EnumC622090Oad.SUBSCRIBE_STATUS_CODE.getKey());
        IDX_SUBSCRIBE_STATUS = enumC622130Oah2;
        EnumC622130Oah enumC622130Oah3 = new EnumC622130Oah("IDX_STATUS", 2, "IDX_CHANNEL_STATUS", EnumC622090Oad.CHANNEL_STATUS_CODE.getKey());
        IDX_STATUS = enumC622130Oah3;
        EnumC622130Oah enumC622130Oah4 = new EnumC622130Oah("IDX_IDENTITY_TYPE", 3, "IDX_IDENTITY_TYPE", EnumC622090Oad.IDENTITY_TYPE.getKey());
        IDX_IDENTITY_TYPE = enumC622130Oah4;
        EnumC622130Oah enumC622130Oah5 = new EnumC622130Oah("IDX_ACCESS_STATUS", 4, "IDX_ACCESS_STATUS", EnumC622090Oad.CHANNEL_ACCESS_CONTROL.getKey());
        IDX_ACCESS_STATUS = enumC622130Oah5;
        EnumC622130Oah[] enumC622130OahArr = {enumC622130Oah, enumC622130Oah2, enumC622130Oah3, enumC622130Oah4, enumC622130Oah5};
        LLILLL = enumC622130OahArr;
        LLILZ = new C2254308sP(enumC622130OahArr);
    }

    public static EnumC622130Oah[] values() {
        return (EnumC622130Oah[]) LLILLL.clone();
    }

    public final String getColumns() {
        return this.LLILLJJLI;
    }

    public final String getIndexName() {
        return this.LL;
    }

    public static EnumC622130Oah valueOf(String str) {
        return (EnumC622130Oah) C08FF.LIZ(EnumC622130Oah.class, str);
    }

    public EnumC622130Oah(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
