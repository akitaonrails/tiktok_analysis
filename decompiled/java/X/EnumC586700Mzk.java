package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586700Mzk {
    public static final /* synthetic */ EnumC586700Mzk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586700Mzk UPDATE_USER_CONTEXT_HOOK;
    public final int LL = 10;

    public static InterfaceC2044707zh<EnumC586700Mzk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586700Mzk enumC586700Mzk = new EnumC586700Mzk();
        UPDATE_USER_CONTEXT_HOOK = enumC586700Mzk;
        EnumC586700Mzk[] enumC586700MzkArr = {enumC586700Mzk};
        LLILLJJLI = enumC586700MzkArr;
        LLILLL = new C2254308sP(enumC586700MzkArr);
    }

    public static EnumC586700Mzk[] values() {
        return (EnumC586700Mzk[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC586700Mzk valueOf(String str) {
        return (EnumC586700Mzk) C08FF.LIZ(EnumC586700Mzk.class, str);
    }
}
