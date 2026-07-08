package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC807060VlI {
    public static final EnumC807060VlI ALOG;
    public static final EnumC807060VlI APPLOG;
    public static final /* synthetic */ EnumC807060VlI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC807060VlI ORIGIN_LOG;
    public static final EnumC807060VlI SLARDAR_API_LOG;
    public static final EnumC807060VlI SLARDAR_EVENT_LOG;

    public static InterfaceC2044707zh<EnumC807060VlI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC807060VlI enumC807060VlI = new EnumC807060VlI("ORIGIN_LOG", 0);
        ORIGIN_LOG = enumC807060VlI;
        EnumC807060VlI enumC807060VlI2 = new EnumC807060VlI("APPLOG", 1);
        APPLOG = enumC807060VlI2;
        EnumC807060VlI enumC807060VlI3 = new EnumC807060VlI("SLARDAR_API_LOG", 2);
        SLARDAR_API_LOG = enumC807060VlI3;
        EnumC807060VlI enumC807060VlI4 = new EnumC807060VlI("SLARDAR_EVENT_LOG", 3);
        SLARDAR_EVENT_LOG = enumC807060VlI4;
        EnumC807060VlI enumC807060VlI5 = new EnumC807060VlI("ALOG", 4);
        ALOG = enumC807060VlI5;
        EnumC807060VlI[] enumC807060VlIArr = {enumC807060VlI, enumC807060VlI2, enumC807060VlI3, enumC807060VlI4, enumC807060VlI5};
        LL = enumC807060VlIArr;
        LLILLJJLI = new C2254308sP(enumC807060VlIArr);
    }

    public static EnumC807060VlI[] values() {
        return (EnumC807060VlI[]) LL.clone();
    }

    public static EnumC807060VlI valueOf(String str) {
        return (EnumC807060VlI) C08FF.LIZ(EnumC807060VlI.class, str);
    }

    public EnumC807060VlI(String str, int i) {
    }
}
