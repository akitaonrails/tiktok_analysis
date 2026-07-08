package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC877300YbI {
    public static final EnumC877300YbI ALL;
    public static final C877220YbA Companion;
    public static final /* synthetic */ EnumC877300YbI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC877300YbI NULL;
    public static final EnumC877300YbI PRIMARY;
    public static final EnumC877300YbI SECONDARY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC877300YbI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC877300YbI enumC877300YbI = new EnumC877300YbI("NULL", 0, -1);
        NULL = enumC877300YbI;
        EnumC877300YbI enumC877300YbI2 = new EnumC877300YbI("ALL", 1, 0);
        ALL = enumC877300YbI2;
        EnumC877300YbI enumC877300YbI3 = new EnumC877300YbI("PRIMARY", 2, 1);
        PRIMARY = enumC877300YbI3;
        EnumC877300YbI enumC877300YbI4 = new EnumC877300YbI("SECONDARY", 3, 2);
        SECONDARY = enumC877300YbI4;
        EnumC877300YbI[] enumC877300YbIArr = {enumC877300YbI, enumC877300YbI2, enumC877300YbI3, enumC877300YbI4};
        LLILLJJLI = enumC877300YbIArr;
        LLILLL = new C2254308sP(enumC877300YbIArr);
        Companion = new C877220YbA();
    }

    public static EnumC877300YbI[] values() {
        return (EnumC877300YbI[]) LLILLJJLI.clone();
    }

    public final FilterTabType getFilterTabType() {
        int i = C877310YbJ.LIZ[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? FilterTabType.NULL : FilterTabType.SECONDARY : FilterTabType.PRIMARY : FilterTabType.OVERALL;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC877300YbI valueOf(String str) {
        return (EnumC877300YbI) C08FF.LIZ(EnumC877300YbI.class, str);
    }

    public EnumC877300YbI(String str, int i, int i2) {
        this.LL = i2;
    }
}
