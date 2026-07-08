package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC635540OwK {
    public static final EnumC635540OwK CANT_SELECT;
    public static final /* synthetic */ EnumC635540OwK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC635540OwK SELECTED;
    public static final EnumC635540OwK UNSELECTED;

    public static InterfaceC2044707zh<EnumC635540OwK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC635540OwK enumC635540OwK = new EnumC635540OwK("SELECTED", 0);
        SELECTED = enumC635540OwK;
        EnumC635540OwK enumC635540OwK2 = new EnumC635540OwK("UNSELECTED", 1);
        UNSELECTED = enumC635540OwK2;
        EnumC635540OwK enumC635540OwK3 = new EnumC635540OwK("CANT_SELECT", 2);
        CANT_SELECT = enumC635540OwK3;
        EnumC635540OwK[] enumC635540OwKArr = {enumC635540OwK, enumC635540OwK2, enumC635540OwK3};
        LL = enumC635540OwKArr;
        LLILLJJLI = new C2254308sP(enumC635540OwKArr);
    }

    public static EnumC635540OwK[] values() {
        return (EnumC635540OwK[]) LL.clone();
    }

    public static EnumC635540OwK valueOf(String str) {
        return (EnumC635540OwK) C08FF.LIZ(EnumC635540OwK.class, str);
    }

    public EnumC635540OwK(String str, int i) {
    }
}
