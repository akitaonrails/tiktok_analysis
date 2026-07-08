package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC893160Z2c {
    public static final /* synthetic */ EnumC893160Z2c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC893160Z2c REACTION;
    public static final EnumC893160Z2c REPLY;
    public static final EnumC893160Z2c UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC893160Z2c> getEntries() {
        return LLILLL;
    }

    static {
        EnumC893160Z2c enumC893160Z2c = new EnumC893160Z2c("UNKNOWN", 0, -1);
        UNKNOWN = enumC893160Z2c;
        EnumC893160Z2c enumC893160Z2c2 = new EnumC893160Z2c("REACTION", 1, 1);
        REACTION = enumC893160Z2c2;
        EnumC893160Z2c enumC893160Z2c3 = new EnumC893160Z2c("REPLY", 2, 2);
        REPLY = enumC893160Z2c3;
        EnumC893160Z2c[] enumC893160Z2cArr = {enumC893160Z2c, enumC893160Z2c2, enumC893160Z2c3};
        LLILLJJLI = enumC893160Z2cArr;
        LLILLL = new C2254308sP(enumC893160Z2cArr);
    }

    public static EnumC893160Z2c[] values() {
        return (EnumC893160Z2c[]) LLILLJJLI.clone();
    }

    public final int getEventTrackType() {
        return this.LL;
    }

    public static EnumC893160Z2c valueOf(String str) {
        return (EnumC893160Z2c) C08FF.LIZ(EnumC893160Z2c.class, str);
    }

    public EnumC893160Z2c(String str, int i, int i2) {
        this.LL = i2;
    }
}
