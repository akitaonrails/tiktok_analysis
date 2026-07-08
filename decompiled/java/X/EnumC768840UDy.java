package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC768840UDy {
    public static final EnumC768840UDy BROADCAST;
    public static final EnumC768840UDy CO_HOST;
    public static final /* synthetic */ EnumC768840UDy[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC768840UDy MATCH;
    public static final EnumC768840UDy MULTI_GUEST;
    public static final EnumC768840UDy MULTI_GUEST_FIX_LAYOUT;
    public static final EnumC768840UDy ORDER;
    public static final EnumC768840UDy PREVIEW;
    public static final EnumC768840UDy UNKNOWN;
    public final String LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public static InterfaceC2044707zh<EnumC768840UDy> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC768840UDy enumC768840UDy = new EnumC768840UDy("UNKNOWN", 0, "unknown", false, false);
        UNKNOWN = enumC768840UDy;
        EnumC768840UDy enumC768840UDy2 = new EnumC768840UDy("PREVIEW", 1, "preview", false, true);
        PREVIEW = enumC768840UDy2;
        EnumC768840UDy enumC768840UDy3 = new EnumC768840UDy("BROADCAST", 2, "broadcast", false, true);
        BROADCAST = enumC768840UDy3;
        EnumC768840UDy enumC768840UDy4 = new EnumC768840UDy("MULTI_GUEST", 3, "multi_guest", true, false);
        MULTI_GUEST = enumC768840UDy4;
        EnumC768840UDy enumC768840UDy5 = new EnumC768840UDy("MULTI_GUEST_FIX_LAYOUT", 4, "multi_guest_fix_layout", false, true);
        MULTI_GUEST_FIX_LAYOUT = enumC768840UDy5;
        EnumC768840UDy enumC768840UDy6 = new EnumC768840UDy("MATCH", 5, "match", true, false);
        MATCH = enumC768840UDy6;
        EnumC768840UDy enumC768840UDy7 = new EnumC768840UDy("CO_HOST", 6, "co_host", true, false);
        CO_HOST = enumC768840UDy7;
        EnumC768840UDy enumC768840UDy8 = new EnumC768840UDy("ORDER", 7, "order", false, false);
        ORDER = enumC768840UDy8;
        EnumC768840UDy[] enumC768840UDyArr = {enumC768840UDy, enumC768840UDy2, enumC768840UDy3, enumC768840UDy4, enumC768840UDy5, enumC768840UDy6, enumC768840UDy7, enumC768840UDy8};
        LLILZ = enumC768840UDyArr;
        LLILZIL = new C2254308sP(enumC768840UDyArr);
    }

    public static EnumC768840UDy[] values() {
        return (EnumC768840UDy[]) LLILZ.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public final boolean isBroadcast() {
        return this.LLILLL;
    }

    public final boolean isLink() {
        return this.LLILLJJLI;
    }

    public static EnumC768840UDy valueOf(String str) {
        return (EnumC768840UDy) C08FF.LIZ(EnumC768840UDy.class, str);
    }

    public EnumC768840UDy(String str, int i, String str2, boolean z, boolean z2) {
        this.LL = str2;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }
}
