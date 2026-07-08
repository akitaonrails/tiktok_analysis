package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.067c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC15554067c {
    public static final EnumC15554067c APP_STATUS_COLD_START;
    public static final EnumC15554067c APP_STATUS_NEW_LOGIN;
    public static final EnumC15554067c APP_STATUS_NORMAL;
    public static final EnumC15554067c APP_STATUS_UNKNOWN;
    public static final /* synthetic */ EnumC15554067c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC15554067c> getEntries() {
        return LLILLL;
    }

    static {
        EnumC15554067c enumC15554067c = new EnumC15554067c("APP_STATUS_UNKNOWN", 0, 0);
        APP_STATUS_UNKNOWN = enumC15554067c;
        EnumC15554067c enumC15554067c2 = new EnumC15554067c("APP_STATUS_NEW_LOGIN", 1, 1);
        APP_STATUS_NEW_LOGIN = enumC15554067c2;
        EnumC15554067c enumC15554067c3 = new EnumC15554067c("APP_STATUS_COLD_START", 2, 2);
        APP_STATUS_COLD_START = enumC15554067c3;
        EnumC15554067c enumC15554067c4 = new EnumC15554067c("APP_STATUS_NORMAL", 3, 3);
        APP_STATUS_NORMAL = enumC15554067c4;
        EnumC15554067c[] enumC15554067cArr = {enumC15554067c, enumC15554067c2, enumC15554067c3, enumC15554067c4};
        LLILLJJLI = enumC15554067cArr;
        LLILLL = new C2254308sP(enumC15554067cArr);
    }

    public static EnumC15554067c[] values() {
        return (EnumC15554067c[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC15554067c valueOf(String str) {
        return (EnumC15554067c) C08FF.LIZ(EnumC15554067c.class, str);
    }

    public EnumC15554067c(String str, int i, int i2) {
        this.LL = i2;
    }
}
