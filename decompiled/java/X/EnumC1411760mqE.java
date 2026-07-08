package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1411760mqE {
    public static final EnumC1411760mqE EDIT;
    public static final /* synthetic */ EnumC1411760mqE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1411760mqE PUBLISH;

    public static InterfaceC2044707zh<EnumC1411760mqE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1411760mqE enumC1411760mqE = new EnumC1411760mqE("PUBLISH", 0);
        PUBLISH = enumC1411760mqE;
        EnumC1411760mqE enumC1411760mqE2 = new EnumC1411760mqE("EDIT", 1);
        EDIT = enumC1411760mqE2;
        EnumC1411760mqE[] enumC1411760mqEArr = {enumC1411760mqE, enumC1411760mqE2};
        LL = enumC1411760mqEArr;
        LLILLJJLI = new C2254308sP(enumC1411760mqEArr);
    }

    public static EnumC1411760mqE[] values() {
        return (EnumC1411760mqE[]) LL.clone();
    }

    public static EnumC1411760mqE valueOf(String str) {
        return (EnumC1411760mqE) C08FF.LIZ(EnumC1411760mqE.class, str);
    }

    public EnumC1411760mqE(String str, int i) {
    }
}
