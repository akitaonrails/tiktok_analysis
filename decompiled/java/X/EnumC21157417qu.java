package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21157417qu {
    public static final EnumC21157417qu EXTERNAL_HYBRID;
    public static final EnumC21157417qu INTERNAL_HYBRID;
    public static final /* synthetic */ EnumC21157417qu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21157417qu PLACEHOLDER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC21157417qu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21157417qu enumC21157417qu = new EnumC21157417qu("INTERNAL_HYBRID", 0, 1);
        INTERNAL_HYBRID = enumC21157417qu;
        EnumC21157417qu enumC21157417qu2 = new EnumC21157417qu("EXTERNAL_HYBRID", 1, 2);
        EXTERNAL_HYBRID = enumC21157417qu2;
        EnumC21157417qu enumC21157417qu3 = new EnumC21157417qu("PLACEHOLDER", 2, 3);
        PLACEHOLDER = enumC21157417qu3;
        EnumC21157417qu[] enumC21157417quArr = {enumC21157417qu, enumC21157417qu2, enumC21157417qu3};
        LLILLJJLI = enumC21157417quArr;
        LLILLL = new C2254308sP(enumC21157417quArr);
    }

    public static EnumC21157417qu[] values() {
        return (EnumC21157417qu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC21157417qu valueOf(String str) {
        return (EnumC21157417qu) C08FF.LIZ(EnumC21157417qu.class, str);
    }

    public EnumC21157417qu(String str, int i, int i2) {
        this.LL = i2;
    }
}
