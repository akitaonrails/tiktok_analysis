package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0llJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1370270llJ {
    public static final EnumC1370270llJ FIRST;
    public static final EnumC1370270llJ LAST;
    public static final /* synthetic */ EnumC1370270llJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1370270llJ MIDDLE;

    public static InterfaceC2044707zh<EnumC1370270llJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1370270llJ enumC1370270llJ = new EnumC1370270llJ("FIRST", 0);
        FIRST = enumC1370270llJ;
        EnumC1370270llJ enumC1370270llJ2 = new EnumC1370270llJ("MIDDLE", 1);
        MIDDLE = enumC1370270llJ2;
        EnumC1370270llJ enumC1370270llJ3 = new EnumC1370270llJ("LAST", 2);
        LAST = enumC1370270llJ3;
        EnumC1370270llJ[] enumC1370270llJArr = {enumC1370270llJ, enumC1370270llJ2, enumC1370270llJ3};
        LL = enumC1370270llJArr;
        LLILLJJLI = new C2254308sP(enumC1370270llJArr);
    }

    public static EnumC1370270llJ[] values() {
        return (EnumC1370270llJ[]) LL.clone();
    }

    public static EnumC1370270llJ valueOf(String str) {
        return (EnumC1370270llJ) C08FF.LIZ(EnumC1370270llJ.class, str);
    }

    public EnumC1370270llJ(String str, int i) {
    }
}
