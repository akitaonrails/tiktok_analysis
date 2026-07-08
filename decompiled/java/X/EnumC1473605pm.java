package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1473605pm {
    public static final /* synthetic */ EnumC1473605pm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1473605pm SHARE_PANEL_ID_TYPE_GROUP;
    public static final EnumC1473605pm SHARE_PANEL_ID_TYPE_TAKO;
    public static final EnumC1473605pm SHARE_PANEL_ID_TYPE_USER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1473605pm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1473605pm enumC1473605pm = new EnumC1473605pm("SHARE_PANEL_ID_TYPE_USER", 0, 0);
        SHARE_PANEL_ID_TYPE_USER = enumC1473605pm;
        EnumC1473605pm enumC1473605pm2 = new EnumC1473605pm("SHARE_PANEL_ID_TYPE_GROUP", 1, 1);
        SHARE_PANEL_ID_TYPE_GROUP = enumC1473605pm2;
        EnumC1473605pm enumC1473605pm3 = new EnumC1473605pm("SHARE_PANEL_ID_TYPE_TAKO", 2, 2);
        SHARE_PANEL_ID_TYPE_TAKO = enumC1473605pm3;
        EnumC1473605pm[] enumC1473605pmArr = {enumC1473605pm, enumC1473605pm2, enumC1473605pm3};
        LLILLJJLI = enumC1473605pmArr;
        LLILLL = new C2254308sP(enumC1473605pmArr);
    }

    public static EnumC1473605pm[] values() {
        return (EnumC1473605pm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1473605pm valueOf(String str) {
        return (EnumC1473605pm) C08FF.LIZ(EnumC1473605pm.class, str);
    }

    public EnumC1473605pm(String str, int i, int i2) {
        this.LL = i2;
    }
}
