package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vHK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1736080vHK {
    public static final EnumC1736080vHK EDIT_DEFAULT;
    public static final EnumC1736080vHK EDIT_EFFECT_IMG_CREATOR;
    public static final /* synthetic */ EnumC1736080vHK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1736080vHK NO_EDIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1736080vHK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1736080vHK enumC1736080vHK = new EnumC1736080vHK("NO_EDIT", 0, 0);
        NO_EDIT = enumC1736080vHK;
        EnumC1736080vHK enumC1736080vHK2 = new EnumC1736080vHK("EDIT_DEFAULT", 1, 1);
        EDIT_DEFAULT = enumC1736080vHK2;
        EnumC1736080vHK enumC1736080vHK3 = new EnumC1736080vHK("EDIT_EFFECT_IMG_CREATOR", 2, 2);
        EDIT_EFFECT_IMG_CREATOR = enumC1736080vHK3;
        EnumC1736080vHK[] enumC1736080vHKArr = {enumC1736080vHK, enumC1736080vHK2, enumC1736080vHK3};
        LLILLJJLI = enumC1736080vHKArr;
        LLILLL = new C2254308sP(enumC1736080vHKArr);
    }

    public static EnumC1736080vHK[] values() {
        return (EnumC1736080vHK[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1736080vHK valueOf(String str) {
        return (EnumC1736080vHK) C08FF.LIZ(EnumC1736080vHK.class, str);
    }

    public EnumC1736080vHK(String str, int i, int i2) {
        this.LL = i2;
    }
}
