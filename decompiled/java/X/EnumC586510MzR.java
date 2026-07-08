package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586510MzR {
    public static final /* synthetic */ EnumC586510MzR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586510MzR REACH_GET_PAUSE;
    public static final EnumC586510MzR REACH_GET_RESUME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC586510MzR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586510MzR enumC586510MzR = new EnumC586510MzR("REACH_GET_PAUSE", 0, "reach_get_pause");
        REACH_GET_PAUSE = enumC586510MzR;
        EnumC586510MzR enumC586510MzR2 = new EnumC586510MzR("REACH_GET_RESUME", 1, "reach_get_resume");
        REACH_GET_RESUME = enumC586510MzR2;
        EnumC586510MzR[] enumC586510MzRArr = {enumC586510MzR, enumC586510MzR2};
        LLILLJJLI = enumC586510MzRArr;
        LLILLL = new C2254308sP(enumC586510MzRArr);
    }

    public static EnumC586510MzR[] values() {
        return (EnumC586510MzR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC586510MzR valueOf(String str) {
        return (EnumC586510MzR) C08FF.LIZ(EnumC586510MzR.class, str);
    }

    public EnumC586510MzR(String str, int i, String str2) {
        this.LL = str2;
    }
}
