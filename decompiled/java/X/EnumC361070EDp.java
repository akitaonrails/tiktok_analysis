package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC361070EDp {
    public static final EnumC361070EDp INIT;
    public static final /* synthetic */ EnumC361070EDp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC361070EDp LOADING;
    public static final EnumC361070EDp SUCCESS;

    public static InterfaceC2044707zh<EnumC361070EDp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC361070EDp enumC361070EDp = new EnumC361070EDp("INIT", 0);
        INIT = enumC361070EDp;
        EnumC361070EDp enumC361070EDp2 = new EnumC361070EDp("LOADING", 1);
        LOADING = enumC361070EDp2;
        EnumC361070EDp enumC361070EDp3 = new EnumC361070EDp("SUCCESS", 2);
        SUCCESS = enumC361070EDp3;
        EnumC361070EDp[] enumC361070EDpArr = {enumC361070EDp, enumC361070EDp2, enumC361070EDp3};
        LL = enumC361070EDpArr;
        LLILLJJLI = new C2254308sP(enumC361070EDpArr);
    }

    public static EnumC361070EDp[] values() {
        return (EnumC361070EDp[]) LL.clone();
    }

    public static EnumC361070EDp valueOf(String str) {
        return (EnumC361070EDp) C08FF.LIZ(EnumC361070EDp.class, str);
    }

    public EnumC361070EDp(String str, int i) {
    }
}
