package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779420wPE {
    public static final EnumC1779420wPE AUDIENCE;
    public static final EnumC1779420wPE LINK;
    public static final /* synthetic */ EnumC1779420wPE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779420wPE NONE;

    public static InterfaceC2044707zh<EnumC1779420wPE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779420wPE enumC1779420wPE = new EnumC1779420wPE("NONE", 0);
        NONE = enumC1779420wPE;
        EnumC1779420wPE enumC1779420wPE2 = new EnumC1779420wPE("AUDIENCE", 1);
        AUDIENCE = enumC1779420wPE2;
        EnumC1779420wPE enumC1779420wPE3 = new EnumC1779420wPE("LINK", 2);
        LINK = enumC1779420wPE3;
        EnumC1779420wPE[] enumC1779420wPEArr = {enumC1779420wPE, enumC1779420wPE2, enumC1779420wPE3};
        LL = enumC1779420wPEArr;
        LLILLJJLI = new C2254308sP(enumC1779420wPEArr);
    }

    public static EnumC1779420wPE[] values() {
        return (EnumC1779420wPE[]) LL.clone();
    }

    public static EnumC1779420wPE valueOf(String str) {
        return (EnumC1779420wPE) C08FF.LIZ(EnumC1779420wPE.class, str);
    }

    public EnumC1779420wPE(String str, int i) {
    }
}
