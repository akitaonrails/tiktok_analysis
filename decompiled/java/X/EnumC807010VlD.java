package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC807010VlD {
    public static final EnumC807010VlD ALOG;
    public static final EnumC807010VlD APM_EVENT_LOG;
    public static final EnumC807010VlD APM_NET_API_LOG;
    public static final EnumC807010VlD APP_LOG;
    public static final /* synthetic */ EnumC807010VlD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC807010VlD ORIGIN_LOG;
    public static final EnumC807010VlD UNKNOWN_LOG;
    public final int LL;

    public static InterfaceC2044707zh<EnumC807010VlD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC807010VlD enumC807010VlD = new EnumC807010VlD("UNKNOWN_LOG", 0, -1);
        UNKNOWN_LOG = enumC807010VlD;
        EnumC807010VlD enumC807010VlD2 = new EnumC807010VlD("ORIGIN_LOG", 1, 0);
        ORIGIN_LOG = enumC807010VlD2;
        EnumC807010VlD enumC807010VlD3 = new EnumC807010VlD("APP_LOG", 2, 1);
        APP_LOG = enumC807010VlD3;
        EnumC807010VlD enumC807010VlD4 = new EnumC807010VlD("APM_NET_API_LOG", 3, 2);
        APM_NET_API_LOG = enumC807010VlD4;
        EnumC807010VlD enumC807010VlD5 = new EnumC807010VlD("APM_EVENT_LOG", 4, 3);
        APM_EVENT_LOG = enumC807010VlD5;
        EnumC807010VlD enumC807010VlD6 = new EnumC807010VlD("ALOG", 5, 10);
        ALOG = enumC807010VlD6;
        EnumC807010VlD[] enumC807010VlDArr = {enumC807010VlD, enumC807010VlD2, enumC807010VlD3, enumC807010VlD4, enumC807010VlD5, enumC807010VlD6};
        LLILLJJLI = enumC807010VlDArr;
        LLILLL = new C2254308sP(enumC807010VlDArr);
    }

    public static EnumC807010VlD[] values() {
        return (EnumC807010VlD[]) LLILLJJLI.clone();
    }

    public final int getCategory() {
        return this.LL;
    }

    public static EnumC807010VlD valueOf(String str) {
        return (EnumC807010VlD) C08FF.LIZ(EnumC807010VlD.class, str);
    }

    public EnumC807010VlD(String str, int i, int i2) {
        this.LL = i2;
    }
}
