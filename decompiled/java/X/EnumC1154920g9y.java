package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154920g9y {
    public static final /* synthetic */ EnumC1154920g9y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154920g9y REPOST;
    public static final EnumC1154920g9y SHARE;
    public static final EnumC1154920g9y UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1154920g9y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154920g9y enumC1154920g9y = new EnumC1154920g9y("UNKNOWN", 0, 0);
        UNKNOWN = enumC1154920g9y;
        EnumC1154920g9y enumC1154920g9y2 = new EnumC1154920g9y("REPOST", 1, 1);
        REPOST = enumC1154920g9y2;
        EnumC1154920g9y enumC1154920g9y3 = new EnumC1154920g9y("SHARE", 2, 2);
        SHARE = enumC1154920g9y3;
        EnumC1154920g9y[] enumC1154920g9yArr = {enumC1154920g9y, enumC1154920g9y2, enumC1154920g9y3};
        LLILLJJLI = enumC1154920g9yArr;
        LLILLL = new C2254308sP(enumC1154920g9yArr);
    }

    public static EnumC1154920g9y[] values() {
        return (EnumC1154920g9y[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1154920g9y valueOf(String str) {
        return (EnumC1154920g9y) C08FF.LIZ(EnumC1154920g9y.class, str);
    }

    public EnumC1154920g9y(String str, int i, int i2) {
        this.LL = i2;
    }
}
