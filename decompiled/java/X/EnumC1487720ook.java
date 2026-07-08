package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ook, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1487720ook {
    public static final EnumC1487720ook IDLE;
    public static final /* synthetic */ EnumC1487720ook[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1487720ook PAUSE;
    public static final EnumC1487720ook RESUME;

    public static InterfaceC2044707zh<EnumC1487720ook> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1487720ook enumC1487720ook = new EnumC1487720ook("IDLE", 0);
        IDLE = enumC1487720ook;
        EnumC1487720ook enumC1487720ook2 = new EnumC1487720ook("RESUME", 1);
        RESUME = enumC1487720ook2;
        EnumC1487720ook enumC1487720ook3 = new EnumC1487720ook("PAUSE", 2);
        PAUSE = enumC1487720ook3;
        EnumC1487720ook[] enumC1487720ookArr = {enumC1487720ook, enumC1487720ook2, enumC1487720ook3};
        LL = enumC1487720ookArr;
        LLILLJJLI = new C2254308sP(enumC1487720ookArr);
    }

    public static EnumC1487720ook[] values() {
        return (EnumC1487720ook[]) LL.clone();
    }

    public static EnumC1487720ook valueOf(String str) {
        return (EnumC1487720ook) C08FF.LIZ(EnumC1487720ook.class, str);
    }

    public EnumC1487720ook(String str, int i) {
    }
}
