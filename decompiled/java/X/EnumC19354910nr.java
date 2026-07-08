package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10nr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19354910nr {
    public static final EnumC19354910nr COLOR_BG_WITHOUT_BRACKETS;
    public static final /* synthetic */ EnumC19354910nr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19354910nr NONE;
    public static final EnumC19354910nr TRANSPARENT_BG_WITH_BRACKETS;

    public static InterfaceC2044707zh<EnumC19354910nr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19354910nr enumC19354910nr = new EnumC19354910nr("NONE", 0);
        NONE = enumC19354910nr;
        EnumC19354910nr enumC19354910nr2 = new EnumC19354910nr("COLOR_BG_WITHOUT_BRACKETS", 1);
        COLOR_BG_WITHOUT_BRACKETS = enumC19354910nr2;
        EnumC19354910nr enumC19354910nr3 = new EnumC19354910nr("TRANSPARENT_BG_WITH_BRACKETS", 2);
        TRANSPARENT_BG_WITH_BRACKETS = enumC19354910nr3;
        EnumC19354910nr[] enumC19354910nrArr = {enumC19354910nr, enumC19354910nr2, enumC19354910nr3};
        LL = enumC19354910nrArr;
        LLILLJJLI = new C2254308sP(enumC19354910nrArr);
    }

    public static EnumC19354910nr[] values() {
        return (EnumC19354910nr[]) LL.clone();
    }

    public static EnumC19354910nr valueOf(String str) {
        return (EnumC19354910nr) C08FF.LIZ(EnumC19354910nr.class, str);
    }

    public EnumC19354910nr(String str, int i) {
    }
}
