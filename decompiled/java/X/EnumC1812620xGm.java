package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1812620xGm {
    public static final EnumC1812620xGm EMPTY;
    public static final EnumC1812620xGm FAIL;
    public static final /* synthetic */ EnumC1812620xGm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1812620xGm LOADING;
    public static final EnumC1812620xGm SUCCESS;

    public static InterfaceC2044707zh<EnumC1812620xGm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1812620xGm enumC1812620xGm = new EnumC1812620xGm("SUCCESS", 0);
        SUCCESS = enumC1812620xGm;
        EnumC1812620xGm enumC1812620xGm2 = new EnumC1812620xGm("EMPTY", 1);
        EMPTY = enumC1812620xGm2;
        EnumC1812620xGm enumC1812620xGm3 = new EnumC1812620xGm("FAIL", 2);
        FAIL = enumC1812620xGm3;
        EnumC1812620xGm enumC1812620xGm4 = new EnumC1812620xGm("LOADING", 3);
        LOADING = enumC1812620xGm4;
        EnumC1812620xGm[] enumC1812620xGmArr = {enumC1812620xGm, enumC1812620xGm2, enumC1812620xGm3, enumC1812620xGm4};
        LL = enumC1812620xGmArr;
        LLILLJJLI = new C2254308sP(enumC1812620xGmArr);
    }

    public static EnumC1812620xGm[] values() {
        return (EnumC1812620xGm[]) LL.clone();
    }

    public static EnumC1812620xGm valueOf(String str) {
        return (EnumC1812620xGm) C08FF.LIZ(EnumC1812620xGm.class, str);
    }

    public EnumC1812620xGm(String str, int i) {
    }
}
