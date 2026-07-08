package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562160M3a {
    public static final EnumC562160M3a BOTH_TIMELINE_AND_BADGE;
    public static final /* synthetic */ EnumC562160M3a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC562160M3a NONE;
    public static final EnumC562160M3a ONLY_BADGE_STYLE;
    public static final EnumC562160M3a ONLY_TIMELINE;

    public static InterfaceC2044707zh<EnumC562160M3a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC562160M3a enumC562160M3a = new EnumC562160M3a("NONE", 0);
        NONE = enumC562160M3a;
        EnumC562160M3a enumC562160M3a2 = new EnumC562160M3a("ONLY_TIMELINE", 1);
        ONLY_TIMELINE = enumC562160M3a2;
        EnumC562160M3a enumC562160M3a3 = new EnumC562160M3a("ONLY_BADGE_STYLE", 2);
        ONLY_BADGE_STYLE = enumC562160M3a3;
        EnumC562160M3a enumC562160M3a4 = new EnumC562160M3a("BOTH_TIMELINE_AND_BADGE", 3);
        BOTH_TIMELINE_AND_BADGE = enumC562160M3a4;
        EnumC562160M3a[] enumC562160M3aArr = {enumC562160M3a, enumC562160M3a2, enumC562160M3a3, enumC562160M3a4};
        LL = enumC562160M3aArr;
        LLILLJJLI = new C2254308sP(enumC562160M3aArr);
    }

    public static EnumC562160M3a[] values() {
        return (EnumC562160M3a[]) LL.clone();
    }

    public static EnumC562160M3a valueOf(String str) {
        return (EnumC562160M3a) C08FF.LIZ(EnumC562160M3a.class, str);
    }

    public EnumC562160M3a(String str, int i) {
    }
}
