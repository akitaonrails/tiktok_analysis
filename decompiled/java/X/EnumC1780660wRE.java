package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780660wRE {
    public static final EnumC1780660wRE FINITE_RECURRING;
    public static final EnumC1780660wRE INFINITE_RECURRING;
    public static final /* synthetic */ EnumC1780660wRE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780660wRE NON_RECURRING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1780660wRE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780660wRE enumC1780660wRE = new EnumC1780660wRE("INFINITE_RECURRING", 0, 1);
        INFINITE_RECURRING = enumC1780660wRE;
        EnumC1780660wRE enumC1780660wRE2 = new EnumC1780660wRE("FINITE_RECURRING", 1, 2);
        FINITE_RECURRING = enumC1780660wRE2;
        EnumC1780660wRE enumC1780660wRE3 = new EnumC1780660wRE("NON_RECURRING", 2, 3);
        NON_RECURRING = enumC1780660wRE3;
        EnumC1780660wRE[] enumC1780660wREArr = {enumC1780660wRE, enumC1780660wRE2, enumC1780660wRE3};
        LLILLJJLI = enumC1780660wREArr;
        LLILLL = new C2254308sP(enumC1780660wREArr);
    }

    public static EnumC1780660wRE[] values() {
        return (EnumC1780660wRE[]) LLILLJJLI.clone();
    }

    public final int getMode() {
        return this.LL;
    }

    public static EnumC1780660wRE valueOf(String str) {
        return (EnumC1780660wRE) C08FF.LIZ(EnumC1780660wRE.class, str);
    }

    public EnumC1780660wRE(String str, int i, int i2) {
        this.LL = i2;
    }
}
