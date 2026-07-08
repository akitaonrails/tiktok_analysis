package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q26, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1534440q26 {
    public static final EnumC1534440q26 BLOCKED;
    public static final EnumC1534440q26 CANCELED;
    public static final EnumC1534440q26 EXECUTED;
    public static final EnumC1534440q26 FETCHING;
    public static final EnumC1534440q26 FINISHED;
    public static final EnumC1534440q26 LIMITED;
    public static final /* synthetic */ EnumC1534440q26[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1534440q26 PENDING;
    public static final EnumC1534440q26 PREPARING;
    public static final EnumC1534440q26 PROCESSING;
    public static final EnumC1534440q26 RECORDED;

    public static InterfaceC2044707zh<EnumC1534440q26> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1534440q26 enumC1534440q26 = new EnumC1534440q26("PENDING", 0);
        PENDING = enumC1534440q26;
        EnumC1534440q26 enumC1534440q262 = new EnumC1534440q26("PREPARING", 1);
        PREPARING = enumC1534440q262;
        EnumC1534440q26 enumC1534440q263 = new EnumC1534440q26("FETCHING", 2);
        FETCHING = enumC1534440q263;
        EnumC1534440q26 enumC1534440q264 = new EnumC1534440q26("PROCESSING", 3);
        PROCESSING = enumC1534440q264;
        EnumC1534440q26 enumC1534440q265 = new EnumC1534440q26("FINISHED", 4);
        FINISHED = enumC1534440q265;
        EnumC1534440q26 enumC1534440q266 = new EnumC1534440q26("CANCELED", 5);
        CANCELED = enumC1534440q266;
        EnumC1534440q26 enumC1534440q267 = new EnumC1534440q26("BLOCKED", 6);
        BLOCKED = enumC1534440q267;
        EnumC1534440q26 enumC1534440q268 = new EnumC1534440q26("RECORDED", 7);
        RECORDED = enumC1534440q268;
        EnumC1534440q26 enumC1534440q269 = new EnumC1534440q26("LIMITED", 8);
        LIMITED = enumC1534440q269;
        EnumC1534440q26 enumC1534440q2610 = new EnumC1534440q26("EXECUTED", 9);
        EXECUTED = enumC1534440q2610;
        EnumC1534440q26[] enumC1534440q26Arr = {enumC1534440q26, enumC1534440q262, enumC1534440q263, enumC1534440q264, enumC1534440q265, enumC1534440q266, enumC1534440q267, enumC1534440q268, enumC1534440q269, enumC1534440q2610};
        LL = enumC1534440q26Arr;
        LLILLJJLI = new C2254308sP(enumC1534440q26Arr);
    }

    public static EnumC1534440q26[] values() {
        return (EnumC1534440q26[]) LL.clone();
    }

    public static EnumC1534440q26 valueOf(String str) {
        return (EnumC1534440q26) C08FF.LIZ(EnumC1534440q26.class, str);
    }

    public EnumC1534440q26(String str, int i) {
    }
}
