package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2281308wl {
    public static final EnumC2281308wl Blocked;
    public static final /* synthetic */ EnumC2281308wl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2281308wl Sequence;

    public static InterfaceC2044707zh<EnumC2281308wl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2281308wl enumC2281308wl = new EnumC2281308wl("Sequence", 0);
        Sequence = enumC2281308wl;
        EnumC2281308wl enumC2281308wl2 = new EnumC2281308wl("Blocked", 1);
        Blocked = enumC2281308wl2;
        EnumC2281308wl[] enumC2281308wlArr = {enumC2281308wl, enumC2281308wl2};
        LL = enumC2281308wlArr;
        LLILLJJLI = new C2254308sP(enumC2281308wlArr);
    }

    public static EnumC2281308wl[] values() {
        return (EnumC2281308wl[]) LL.clone();
    }

    public static EnumC2281308wl valueOf(String str) {
        return (EnumC2281308wl) C08FF.LIZ(EnumC2281308wl.class, str);
    }

    public EnumC2281308wl(String str, int i) {
    }
}
