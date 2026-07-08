package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cAV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1001490cAV {
    public static final EnumC1001490cAV CANCELLED;
    public static final EnumC1001490cAV COMPLETED;
    public static final EnumC1001490cAV FAILED;
    public static final EnumC1001490cAV FORCE_RUN_COMPLETED;
    public static final /* synthetic */ EnumC1001490cAV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1001490cAV PENDING;
    public static final EnumC1001490cAV RUNNING;

    public static InterfaceC2044707zh<EnumC1001490cAV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1001490cAV enumC1001490cAV = new EnumC1001490cAV("PENDING", 0);
        PENDING = enumC1001490cAV;
        EnumC1001490cAV enumC1001490cAV2 = new EnumC1001490cAV("RUNNING", 1);
        RUNNING = enumC1001490cAV2;
        EnumC1001490cAV enumC1001490cAV3 = new EnumC1001490cAV("COMPLETED", 2);
        COMPLETED = enumC1001490cAV3;
        EnumC1001490cAV enumC1001490cAV4 = new EnumC1001490cAV("FAILED", 3);
        FAILED = enumC1001490cAV4;
        EnumC1001490cAV enumC1001490cAV5 = new EnumC1001490cAV("CANCELLED", 4);
        CANCELLED = enumC1001490cAV5;
        EnumC1001490cAV enumC1001490cAV6 = new EnumC1001490cAV("FORCE_RUN_COMPLETED", 5);
        FORCE_RUN_COMPLETED = enumC1001490cAV6;
        EnumC1001490cAV[] enumC1001490cAVArr = {enumC1001490cAV, enumC1001490cAV2, enumC1001490cAV3, enumC1001490cAV4, enumC1001490cAV5, enumC1001490cAV6};
        LL = enumC1001490cAVArr;
        LLILLJJLI = new C2254308sP(enumC1001490cAVArr);
    }

    public static EnumC1001490cAV[] values() {
        return (EnumC1001490cAV[]) LL.clone();
    }

    public static EnumC1001490cAV valueOf(String str) {
        return (EnumC1001490cAV) C08FF.LIZ(EnumC1001490cAV.class, str);
    }

    public EnumC1001490cAV(String str, int i) {
    }
}
