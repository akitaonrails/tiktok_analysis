package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2008307tp {
    public static final EnumC2008307tp BLOCKED_BY_CALLER;
    public static final EnumC2008307tp BLOCKED_BY_SHEET;
    public static final EnumC2008307tp FRAGMENT_DESTROYED;
    public static final /* synthetic */ EnumC2008307tp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2008307tp UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2008307tp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2008307tp enumC2008307tp = new EnumC2008307tp("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC2008307tp;
        EnumC2008307tp enumC2008307tp2 = new EnumC2008307tp("BLOCKED_BY_SHEET", 1, "blocked_by_sheet");
        BLOCKED_BY_SHEET = enumC2008307tp2;
        EnumC2008307tp enumC2008307tp3 = new EnumC2008307tp("BLOCKED_BY_CALLER", 2, "blocked_by_caller");
        BLOCKED_BY_CALLER = enumC2008307tp3;
        EnumC2008307tp enumC2008307tp4 = new EnumC2008307tp("FRAGMENT_DESTROYED", 3, "fragment_destroyed");
        FRAGMENT_DESTROYED = enumC2008307tp4;
        EnumC2008307tp[] enumC2008307tpArr = {enumC2008307tp, enumC2008307tp2, enumC2008307tp3, enumC2008307tp4};
        LLILLJJLI = enumC2008307tpArr;
        LLILLL = new C2254308sP(enumC2008307tpArr);
    }

    public static EnumC2008307tp[] values() {
        return (EnumC2008307tp[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC2008307tp valueOf(String str) {
        return (EnumC2008307tp) C08FF.LIZ(EnumC2008307tp.class, str);
    }

    public EnumC2008307tp(String str, int i, String str2) {
        this.LL = str2;
    }
}
