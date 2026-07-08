package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0htn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221770htn {
    public static final EnumC1221770htn FAILED;
    public static final EnumC1221770htn GENERATING;
    public static final EnumC1221770htn IDLE;
    public static final EnumC1221770htn IN_QUEUE;
    public static final /* synthetic */ EnumC1221770htn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1221770htn SUCCESSFUL;
    public static final EnumC1221770htn UNKNOWN;

    public static InterfaceC2044707zh<EnumC1221770htn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221770htn enumC1221770htn = new EnumC1221770htn("IDLE", 0);
        IDLE = enumC1221770htn;
        EnumC1221770htn enumC1221770htn2 = new EnumC1221770htn("GENERATING", 1);
        GENERATING = enumC1221770htn2;
        EnumC1221770htn enumC1221770htn3 = new EnumC1221770htn("SUCCESSFUL", 2);
        SUCCESSFUL = enumC1221770htn3;
        EnumC1221770htn enumC1221770htn4 = new EnumC1221770htn("FAILED", 3);
        FAILED = enumC1221770htn4;
        EnumC1221770htn enumC1221770htn5 = new EnumC1221770htn("IN_QUEUE", 4);
        IN_QUEUE = enumC1221770htn5;
        EnumC1221770htn enumC1221770htn6 = new EnumC1221770htn("UNKNOWN", 5);
        UNKNOWN = enumC1221770htn6;
        EnumC1221770htn[] enumC1221770htnArr = {enumC1221770htn, enumC1221770htn2, enumC1221770htn3, enumC1221770htn4, enumC1221770htn5, enumC1221770htn6};
        LL = enumC1221770htnArr;
        LLILLJJLI = new C2254308sP(enumC1221770htnArr);
    }

    public static EnumC1221770htn[] values() {
        return (EnumC1221770htn[]) LL.clone();
    }

    public static EnumC1221770htn valueOf(String str) {
        return (EnumC1221770htn) C08FF.LIZ(EnumC1221770htn.class, str);
    }

    public EnumC1221770htn(String str, int i) {
    }
}
