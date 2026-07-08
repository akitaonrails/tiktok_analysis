package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1217960hne {
    public static final EnumC1217960hne BATCH;
    public static final /* synthetic */ EnumC1217960hne[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1217960hne SINGLE;

    public static InterfaceC2044707zh<EnumC1217960hne> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1217960hne enumC1217960hne = new EnumC1217960hne("SINGLE", 0);
        SINGLE = enumC1217960hne;
        EnumC1217960hne enumC1217960hne2 = new EnumC1217960hne("BATCH", 1);
        BATCH = enumC1217960hne2;
        EnumC1217960hne[] enumC1217960hneArr = {enumC1217960hne, enumC1217960hne2};
        LL = enumC1217960hneArr;
        LLILLJJLI = new C2254308sP(enumC1217960hneArr);
    }

    public static EnumC1217960hne[] values() {
        return (EnumC1217960hne[]) LL.clone();
    }

    public static EnumC1217960hne valueOf(String str) {
        return (EnumC1217960hne) C08FF.LIZ(EnumC1217960hne.class, str);
    }

    public EnumC1217960hne(String str, int i) {
    }
}
