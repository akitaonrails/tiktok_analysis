package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0efr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1097810efr {
    public static final EnumC1097810efr BIZ;
    public static final EnumC1097810efr CLEANUP;
    public static final EnumC1097810efr FC;
    public static final EnumC1097810efr LEAVE_ROOM;
    public static final /* synthetic */ EnumC1097810efr[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1097810efr MANUALLY_ROUTE;
    public final String LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1097810efr> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1097810efr enumC1097810efr = new EnumC1097810efr("BIZ", 0, "biz", true);
        BIZ = enumC1097810efr;
        EnumC1097810efr enumC1097810efr2 = new EnumC1097810efr("CLEANUP", 1, "framework_cleanup", true);
        CLEANUP = enumC1097810efr2;
        EnumC1097810efr enumC1097810efr3 = new EnumC1097810efr("LEAVE_ROOM", 2, "framework_leave_room", false);
        LEAVE_ROOM = enumC1097810efr3;
        EnumC1097810efr enumC1097810efr4 = new EnumC1097810efr("FC", 3, "framework_fc", true);
        FC = enumC1097810efr4;
        EnumC1097810efr enumC1097810efr5 = new EnumC1097810efr("MANUALLY_ROUTE", 4, "manually_route", false);
        MANUALLY_ROUTE = enumC1097810efr5;
        EnumC1097810efr[] enumC1097810efrArr = {enumC1097810efr, enumC1097810efr2, enumC1097810efr3, enumC1097810efr4, enumC1097810efr5};
        LLILLL = enumC1097810efrArr;
        LLILZ = new C2254308sP(enumC1097810efrArr);
    }

    public static EnumC1097810efr[] values() {
        return (EnumC1097810efr[]) LLILLL.clone();
    }

    public final boolean getRecordConsumeTs() {
        return this.LLILLJJLI;
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1097810efr valueOf(String str) {
        return (EnumC1097810efr) C08FF.LIZ(EnumC1097810efr.class, str);
    }

    public EnumC1097810efr(String str, int i, String str2, boolean z) {
        this.LL = str2;
        this.LLILLJJLI = z;
    }
}
