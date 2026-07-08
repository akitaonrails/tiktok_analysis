package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC344040DeE {
    public static final EnumC344040DeE FAIL;
    public static final /* synthetic */ EnumC344040DeE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC344040DeE LOADING;
    public static final EnumC344040DeE SUCCESS;

    public static InterfaceC2044707zh<EnumC344040DeE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC344040DeE enumC344040DeE = new EnumC344040DeE("SUCCESS", 0);
        SUCCESS = enumC344040DeE;
        EnumC344040DeE enumC344040DeE2 = new EnumC344040DeE("LOADING", 1);
        LOADING = enumC344040DeE2;
        EnumC344040DeE enumC344040DeE3 = new EnumC344040DeE("FAIL", 2);
        FAIL = enumC344040DeE3;
        EnumC344040DeE[] enumC344040DeEArr = {enumC344040DeE, enumC344040DeE2, enumC344040DeE3};
        LL = enumC344040DeEArr;
        LLILLJJLI = new C2254308sP(enumC344040DeEArr);
    }

    public static EnumC344040DeE[] values() {
        return (EnumC344040DeE[]) LL.clone();
    }

    public static EnumC344040DeE valueOf(String str) {
        return (EnumC344040DeE) C08FF.LIZ(EnumC344040DeE.class, str);
    }

    public EnumC344040DeE(String str, int i) {
    }
}
