package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ppc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC656860Ppc {
    public static final EnumC656860Ppc LIEK_COUNT;
    public static final /* synthetic */ EnumC656860Ppc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC656860Ppc NONE;
    public static final EnumC656860Ppc WATCH_COUNT;

    public static InterfaceC2044707zh<EnumC656860Ppc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC656860Ppc enumC656860Ppc = new EnumC656860Ppc("NONE", 0);
        NONE = enumC656860Ppc;
        EnumC656860Ppc enumC656860Ppc2 = new EnumC656860Ppc("LIEK_COUNT", 1);
        LIEK_COUNT = enumC656860Ppc2;
        EnumC656860Ppc enumC656860Ppc3 = new EnumC656860Ppc("WATCH_COUNT", 2);
        WATCH_COUNT = enumC656860Ppc3;
        EnumC656860Ppc[] enumC656860PpcArr = {enumC656860Ppc, enumC656860Ppc2, enumC656860Ppc3};
        LL = enumC656860PpcArr;
        LLILLJJLI = new C2254308sP(enumC656860PpcArr);
    }

    public static EnumC656860Ppc[] values() {
        return (EnumC656860Ppc[]) LL.clone();
    }

    public static EnumC656860Ppc valueOf(String str) {
        return (EnumC656860Ppc) C08FF.LIZ(EnumC656860Ppc.class, str);
    }

    public EnumC656860Ppc(String str, int i) {
    }
}
