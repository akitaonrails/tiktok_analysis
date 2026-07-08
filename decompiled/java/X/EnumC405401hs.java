package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC405401hs {
    public static final EnumC405401hs BIZ_ABILITY_TASK;
    public static final EnumC405401hs COLLECT_DATA;
    public static final EnumC405401hs DISPATCH_DATA;
    public static final EnumC405401hs DISPATCH_METRICS_BIZ;
    public static final EnumC405401hs HEAD;
    public static final /* synthetic */ EnumC405401hs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC405401hs SIMPLE;
    public static final EnumC405401hs TRIGGER_ALGORITHM;
    public static final EnumC405401hs UPDATE_BIZ_STATUS;

    public static InterfaceC2044707zh<EnumC405401hs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC405401hs enumC405401hs = new EnumC405401hs("HEAD", 0);
        HEAD = enumC405401hs;
        EnumC405401hs enumC405401hs2 = new EnumC405401hs("TRIGGER_ALGORITHM", 1);
        TRIGGER_ALGORITHM = enumC405401hs2;
        EnumC405401hs enumC405401hs3 = new EnumC405401hs("DISPATCH_DATA", 2);
        DISPATCH_DATA = enumC405401hs3;
        EnumC405401hs enumC405401hs4 = new EnumC405401hs("UPDATE_BIZ_STATUS", 3);
        UPDATE_BIZ_STATUS = enumC405401hs4;
        EnumC405401hs enumC405401hs5 = new EnumC405401hs("COLLECT_DATA", 4);
        COLLECT_DATA = enumC405401hs5;
        EnumC405401hs enumC405401hs6 = new EnumC405401hs("BIZ_ABILITY_TASK", 5);
        BIZ_ABILITY_TASK = enumC405401hs6;
        EnumC405401hs enumC405401hs7 = new EnumC405401hs("DISPATCH_METRICS_BIZ", 6);
        DISPATCH_METRICS_BIZ = enumC405401hs7;
        EnumC405401hs enumC405401hs8 = new EnumC405401hs("SIMPLE", 7);
        SIMPLE = enumC405401hs8;
        EnumC405401hs[] enumC405401hsArr = {enumC405401hs, enumC405401hs2, enumC405401hs3, enumC405401hs4, enumC405401hs5, enumC405401hs6, enumC405401hs7, enumC405401hs8};
        LL = enumC405401hsArr;
        LLILLJJLI = new C2254308sP(enumC405401hsArr);
    }

    public static EnumC405401hs[] values() {
        return (EnumC405401hs[]) LL.clone();
    }

    public static EnumC405401hs valueOf(String str) {
        return (EnumC405401hs) C08FF.LIZ(EnumC405401hs.class, str);
    }

    public EnumC405401hs(String str, int i) {
    }
}
