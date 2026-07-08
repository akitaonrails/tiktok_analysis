package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC978030bYf {
    public static final EnumC978030bYf LEAGUE;
    public static final /* synthetic */ EnumC978030bYf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC978030bYf MATCH_MANIA;
    public static final EnumC978030bYf NORMAL;
    public static final EnumC978030bYf NORMAL_BADGE;
    public static final EnumC978030bYf NORMAL_BADGE_NO_BADGE;

    public static InterfaceC2044707zh<EnumC978030bYf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC978030bYf enumC978030bYf = new EnumC978030bYf("LEAGUE", 0);
        LEAGUE = enumC978030bYf;
        EnumC978030bYf enumC978030bYf2 = new EnumC978030bYf("NORMAL_BADGE", 1);
        NORMAL_BADGE = enumC978030bYf2;
        EnumC978030bYf enumC978030bYf3 = new EnumC978030bYf("NORMAL_BADGE_NO_BADGE", 2);
        NORMAL_BADGE_NO_BADGE = enumC978030bYf3;
        EnumC978030bYf enumC978030bYf4 = new EnumC978030bYf("NORMAL", 3);
        NORMAL = enumC978030bYf4;
        EnumC978030bYf enumC978030bYf5 = new EnumC978030bYf("MATCH_MANIA", 4);
        MATCH_MANIA = enumC978030bYf5;
        EnumC978030bYf[] enumC978030bYfArr = {enumC978030bYf, enumC978030bYf2, enumC978030bYf3, enumC978030bYf4, enumC978030bYf5};
        LL = enumC978030bYfArr;
        LLILLJJLI = new C2254308sP(enumC978030bYfArr);
    }

    public static EnumC978030bYf[] values() {
        return (EnumC978030bYf[]) LL.clone();
    }

    public static EnumC978030bYf valueOf(String str) {
        return (EnumC978030bYf) C08FF.LIZ(EnumC978030bYf.class, str);
    }

    public EnumC978030bYf(String str, int i) {
    }
}
