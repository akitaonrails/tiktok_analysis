package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.100p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC191769100p {
    public static final EnumC191769100p ALL;
    public static final EnumC191769100p CARE_MODE_ON;
    public static final EnumC191769100p CARE_MODE_RECOMMEND;
    public static final EnumC191769100p FILTER_ALL;
    public static final /* synthetic */ EnumC191769100p[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC191769100p PAUSE_INTERACTION;

    public static InterfaceC2044707zh<EnumC191769100p> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC191769100p enumC191769100p = new EnumC191769100p("ALL", 0);
        ALL = enumC191769100p;
        EnumC191769100p enumC191769100p2 = new EnumC191769100p("CARE_MODE_ON", 1);
        CARE_MODE_ON = enumC191769100p2;
        EnumC191769100p enumC191769100p3 = new EnumC191769100p("CARE_MODE_RECOMMEND", 2);
        CARE_MODE_RECOMMEND = enumC191769100p3;
        EnumC191769100p enumC191769100p4 = new EnumC191769100p("FILTER_ALL", 3);
        FILTER_ALL = enumC191769100p4;
        EnumC191769100p enumC191769100p5 = new EnumC191769100p("PAUSE_INTERACTION", 4);
        PAUSE_INTERACTION = enumC191769100p5;
        EnumC191769100p[] enumC191769100pArr = {enumC191769100p, enumC191769100p2, enumC191769100p3, enumC191769100p4, enumC191769100p5};
        LL = enumC191769100pArr;
        LLILLJJLI = new C2254308sP(enumC191769100pArr);
    }

    public static EnumC191769100p[] values() {
        return (EnumC191769100p[]) LL.clone();
    }

    public static EnumC191769100p valueOf(String str) {
        return (EnumC191769100p) C08FF.LIZ(EnumC191769100p.class, str);
    }

    public EnumC191769100p(String str, int i) {
    }
}
