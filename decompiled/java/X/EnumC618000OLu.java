package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC618000OLu {
    public static final EnumC618000OLu BAR_ENTRANCE_TYPE_LIVE;
    public static final EnumC618000OLu BAR_ENTRANCE_TYPE_UNKNOWN;
    public static final /* synthetic */ EnumC618000OLu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC618000OLu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC618000OLu enumC618000OLu = new EnumC618000OLu("BAR_ENTRANCE_TYPE_UNKNOWN", 0, 0);
        BAR_ENTRANCE_TYPE_UNKNOWN = enumC618000OLu;
        EnumC618000OLu enumC618000OLu2 = new EnumC618000OLu("BAR_ENTRANCE_TYPE_LIVE", 1, 1);
        BAR_ENTRANCE_TYPE_LIVE = enumC618000OLu2;
        EnumC618000OLu[] enumC618000OLuArr = {enumC618000OLu, enumC618000OLu2};
        LLILLJJLI = enumC618000OLuArr;
        LLILLL = new C2254308sP(enumC618000OLuArr);
    }

    public static EnumC618000OLu[] values() {
        return (EnumC618000OLu[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC618000OLu valueOf(String str) {
        return (EnumC618000OLu) C08FF.LIZ(EnumC618000OLu.class, str);
    }

    public EnumC618000OLu(String str, int i, int i2) {
        this.LL = i2;
    }
}
