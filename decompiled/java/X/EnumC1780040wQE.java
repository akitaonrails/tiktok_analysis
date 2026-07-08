package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780040wQE {
    public static final EnumC1780040wQE FAN;
    public static final /* synthetic */ EnumC1780040wQE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1780040wQE NONE;
    public static final EnumC1780040wQE REGULAR;

    public static InterfaceC2044707zh<EnumC1780040wQE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1780040wQE enumC1780040wQE = new EnumC1780040wQE("NONE", 0);
        NONE = enumC1780040wQE;
        EnumC1780040wQE enumC1780040wQE2 = new EnumC1780040wQE("FAN", 1);
        FAN = enumC1780040wQE2;
        EnumC1780040wQE enumC1780040wQE3 = new EnumC1780040wQE("REGULAR", 2);
        REGULAR = enumC1780040wQE3;
        EnumC1780040wQE[] enumC1780040wQEArr = {enumC1780040wQE, enumC1780040wQE2, enumC1780040wQE3};
        LL = enumC1780040wQEArr;
        LLILLJJLI = new C2254308sP(enumC1780040wQEArr);
    }

    public static EnumC1780040wQE[] values() {
        return (EnumC1780040wQE[]) LL.clone();
    }

    public static EnumC1780040wQE valueOf(String str) {
        return (EnumC1780040wQE) C08FF.LIZ(EnumC1780040wQE.class, str);
    }

    public EnumC1780040wQE(String str, int i) {
    }
}
