package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1137150fhJ {
    public static final EnumC1137150fhJ COMB;
    public static final EnumC1137150fhJ ENTRY;
    public static final EnumC1137150fhJ EXIT;
    public static final EnumC1137150fhJ FIRST;
    public static final /* synthetic */ EnumC1137150fhJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1137150fhJ SHOW;

    public static InterfaceC2044707zh<EnumC1137150fhJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1137150fhJ enumC1137150fhJ = new EnumC1137150fhJ("FIRST", 0);
        FIRST = enumC1137150fhJ;
        EnumC1137150fhJ enumC1137150fhJ2 = new EnumC1137150fhJ("ENTRY", 1);
        ENTRY = enumC1137150fhJ2;
        EnumC1137150fhJ enumC1137150fhJ3 = new EnumC1137150fhJ("COMB", 2);
        COMB = enumC1137150fhJ3;
        EnumC1137150fhJ enumC1137150fhJ4 = new EnumC1137150fhJ("SHOW", 3);
        SHOW = enumC1137150fhJ4;
        EnumC1137150fhJ enumC1137150fhJ5 = new EnumC1137150fhJ("EXIT", 4);
        EXIT = enumC1137150fhJ5;
        EnumC1137150fhJ[] enumC1137150fhJArr = {enumC1137150fhJ, enumC1137150fhJ2, enumC1137150fhJ3, enumC1137150fhJ4, enumC1137150fhJ5};
        LL = enumC1137150fhJArr;
        LLILLJJLI = new C2254308sP(enumC1137150fhJArr);
    }

    public static EnumC1137150fhJ[] values() {
        return (EnumC1137150fhJ[]) LL.clone();
    }

    public static EnumC1137150fhJ valueOf(String str) {
        return (EnumC1137150fhJ) C08FF.LIZ(EnumC1137150fhJ.class, str);
    }

    public EnumC1137150fhJ(String str, int i) {
    }
}
