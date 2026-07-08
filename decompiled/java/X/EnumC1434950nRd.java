package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1434950nRd {
    public static final EnumC1434950nRd ADDED_TO_QUEUE;
    public static final EnumC1434950nRd CREATE_AWEME;
    public static final /* synthetic */ EnumC1434950nRd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1434950nRd START_PUBLISH;
    public static final EnumC1434950nRd UPLOAD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1434950nRd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1434950nRd enumC1434950nRd = new EnumC1434950nRd("ADDED_TO_QUEUE", 0, 1);
        ADDED_TO_QUEUE = enumC1434950nRd;
        EnumC1434950nRd enumC1434950nRd2 = new EnumC1434950nRd("START_PUBLISH", 1, 2);
        START_PUBLISH = enumC1434950nRd2;
        EnumC1434950nRd enumC1434950nRd3 = new EnumC1434950nRd("UPLOAD", 2, 3);
        UPLOAD = enumC1434950nRd3;
        EnumC1434950nRd enumC1434950nRd4 = new EnumC1434950nRd("CREATE_AWEME", 3, 4);
        CREATE_AWEME = enumC1434950nRd4;
        EnumC1434950nRd[] enumC1434950nRdArr = {enumC1434950nRd, enumC1434950nRd2, enumC1434950nRd3, enumC1434950nRd4};
        LLILLJJLI = enumC1434950nRdArr;
        LLILLL = new C2254308sP(enumC1434950nRdArr);
    }

    public static EnumC1434950nRd[] values() {
        return (EnumC1434950nRd[]) LLILLJJLI.clone();
    }

    public final int getStageLogVal() {
        return this.LL;
    }

    public static EnumC1434950nRd valueOf(String str) {
        return (EnumC1434950nRd) C08FF.LIZ(EnumC1434950nRd.class, str);
    }

    public EnumC1434950nRd(String str, int i, int i2) {
        this.LL = i2;
    }
}
