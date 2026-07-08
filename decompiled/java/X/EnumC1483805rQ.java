package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05rQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1483805rQ {
    public static final /* synthetic */ EnumC1483805rQ[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1483805rQ UPDATE_BY_2_BACKGROUND;
    public static final EnumC1483805rQ UPDATE_BY_BROADCAST;
    public static final EnumC1483805rQ UPDATE_BY_LAUNCH;
    public static final EnumC1483805rQ UPDATE_BY_LOGIN;
    public static final EnumC1483805rQ UPDATE_BY_SCHEDULER;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1483805rQ> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1483805rQ enumC1483805rQ = new EnumC1483805rQ("UPDATE_BY_SCHEDULER", 0, 0, "cubes_update_wm_scheduled");
        UPDATE_BY_SCHEDULER = enumC1483805rQ;
        EnumC1483805rQ enumC1483805rQ2 = new EnumC1483805rQ("UPDATE_BY_LAUNCH", 1, 1, "cubes_update_launched");
        UPDATE_BY_LAUNCH = enumC1483805rQ2;
        EnumC1483805rQ enumC1483805rQ3 = new EnumC1483805rQ("UPDATE_BY_BROADCAST", 2, 2, "cubes_update_broadcast");
        UPDATE_BY_BROADCAST = enumC1483805rQ3;
        EnumC1483805rQ enumC1483805rQ4 = new EnumC1483805rQ("UPDATE_BY_2_BACKGROUND", 3, 3, "cubes_update_2_background");
        UPDATE_BY_2_BACKGROUND = enumC1483805rQ4;
        EnumC1483805rQ enumC1483805rQ5 = new EnumC1483805rQ("UPDATE_BY_LOGIN", 4, 4, "cubes_update_login");
        UPDATE_BY_LOGIN = enumC1483805rQ5;
        EnumC1483805rQ[] enumC1483805rQArr = {enumC1483805rQ, enumC1483805rQ2, enumC1483805rQ3, enumC1483805rQ4, enumC1483805rQ5};
        LLILLL = enumC1483805rQArr;
        LLILZ = new C2254308sP(enumC1483805rQArr);
    }

    public static EnumC1483805rQ[] values() {
        return (EnumC1483805rQ[]) LLILLL.clone();
    }

    public final String getTag() {
        return this.LLILLJJLI;
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1483805rQ valueOf(String str) {
        return (EnumC1483805rQ) C08FF.LIZ(EnumC1483805rQ.class, str);
    }

    public EnumC1483805rQ(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
