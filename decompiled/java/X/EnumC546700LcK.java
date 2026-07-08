package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC546700LcK {
    public static final EnumC546700LcK FAILED;
    public static final EnumC546700LcK FINISHED;
    public static final /* synthetic */ EnumC546700LcK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC546700LcK RUNNING;
    public static final EnumC546700LcK UNKNOWN;

    public static InterfaceC2044707zh<EnumC546700LcK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC546700LcK enumC546700LcK = new EnumC546700LcK("RUNNING", 0);
        RUNNING = enumC546700LcK;
        EnumC546700LcK enumC546700LcK2 = new EnumC546700LcK("FINISHED", 1);
        FINISHED = enumC546700LcK2;
        EnumC546700LcK enumC546700LcK3 = new EnumC546700LcK("FAILED", 2);
        FAILED = enumC546700LcK3;
        EnumC546700LcK enumC546700LcK4 = new EnumC546700LcK("UNKNOWN", 3);
        UNKNOWN = enumC546700LcK4;
        EnumC546700LcK[] enumC546700LcKArr = {enumC546700LcK, enumC546700LcK2, enumC546700LcK3, enumC546700LcK4};
        LL = enumC546700LcKArr;
        LLILLJJLI = new C2254308sP(enumC546700LcKArr);
    }

    public static EnumC546700LcK[] values() {
        return (EnumC546700LcK[]) LL.clone();
    }

    public static EnumC546700LcK valueOf(String str) {
        return (EnumC546700LcK) C08FF.LIZ(EnumC546700LcK.class, str);
    }

    public EnumC546700LcK(String str, int i) {
    }
}
