package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17sG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21165817sG {
    public static final EnumC21165817sG EVENT;
    public static final /* synthetic */ EnumC21165817sG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21165817sG METHOD;

    public static InterfaceC2044707zh<EnumC21165817sG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21165817sG enumC21165817sG = new EnumC21165817sG("METHOD", 0);
        METHOD = enumC21165817sG;
        EnumC21165817sG enumC21165817sG2 = new EnumC21165817sG("EVENT", 1);
        EVENT = enumC21165817sG2;
        EnumC21165817sG[] enumC21165817sGArr = {enumC21165817sG, enumC21165817sG2};
        LL = enumC21165817sGArr;
        LLILLJJLI = new C2254308sP(enumC21165817sGArr);
    }

    public static EnumC21165817sG[] values() {
        return (EnumC21165817sG[]) LL.clone();
    }

    public static EnumC21165817sG valueOf(String str) {
        return (EnumC21165817sG) C08FF.LIZ(EnumC21165817sG.class, str);
    }

    public EnumC21165817sG(String str, int i) {
    }
}
