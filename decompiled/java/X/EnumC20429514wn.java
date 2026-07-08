package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20429514wn {
    public static final EnumC20429514wn FAILURE;
    public static final EnumC20429514wn IDLE;
    public static final /* synthetic */ EnumC20429514wn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20429514wn RUNNING;
    public static final EnumC20429514wn SUCCESS;

    public static InterfaceC2044707zh<EnumC20429514wn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20429514wn enumC20429514wn = new EnumC20429514wn("IDLE", 0);
        IDLE = enumC20429514wn;
        EnumC20429514wn enumC20429514wn2 = new EnumC20429514wn("RUNNING", 1);
        RUNNING = enumC20429514wn2;
        EnumC20429514wn enumC20429514wn3 = new EnumC20429514wn("SUCCESS", 2);
        SUCCESS = enumC20429514wn3;
        EnumC20429514wn enumC20429514wn4 = new EnumC20429514wn("FAILURE", 3);
        FAILURE = enumC20429514wn4;
        EnumC20429514wn[] enumC20429514wnArr = {enumC20429514wn, enumC20429514wn2, enumC20429514wn3, enumC20429514wn4};
        LL = enumC20429514wnArr;
        LLILLJJLI = new C2254308sP(enumC20429514wnArr);
    }

    public static EnumC20429514wn[] values() {
        return (EnumC20429514wn[]) LL.clone();
    }

    public static EnumC20429514wn valueOf(String str) {
        return (EnumC20429514wn) C08FF.LIZ(EnumC20429514wn.class, str);
    }

    public EnumC20429514wn(String str, int i) {
    }
}
