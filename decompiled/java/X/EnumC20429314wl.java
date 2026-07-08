package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429314wl {
    public static final EnumC20429314wl ACTIVITY;
    public static final EnumC20429314wl INTERACT;
    public static final /* synthetic */ EnumC20429314wl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429314wl MATCH;
    public static final EnumC20429314wl MULTI_GUEST;

    public static InterfaceC2044707zh<EnumC20429314wl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429314wl enumC20429314wl = new EnumC20429314wl("MULTI_GUEST", 0);
        MULTI_GUEST = enumC20429314wl;
        EnumC20429314wl enumC20429314wl2 = new EnumC20429314wl("INTERACT", 1);
        INTERACT = enumC20429314wl2;
        EnumC20429314wl enumC20429314wl3 = new EnumC20429314wl("MATCH", 2);
        MATCH = enumC20429314wl3;
        EnumC20429314wl enumC20429314wl4 = new EnumC20429314wl("ACTIVITY", 3);
        ACTIVITY = enumC20429314wl4;
        EnumC20429314wl[] enumC20429314wlArr = {enumC20429314wl, enumC20429314wl2, enumC20429314wl3, enumC20429314wl4};
        LL = enumC20429314wlArr;
        LLILLJJLI = new C2254308sP(enumC20429314wlArr);
    }

    public static EnumC20429314wl[] values() {
        return (EnumC20429314wl[]) LL.clone();
    }

    public static EnumC20429314wl valueOf(String str) {
        return (EnumC20429314wl) C08FF.LIZ(EnumC20429314wl.class, str);
    }

    public EnumC20429314wl(String str, int i) {
    }
}
