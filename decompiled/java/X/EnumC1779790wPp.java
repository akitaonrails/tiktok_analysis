package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779790wPp {
    public static final EnumC1779790wPp DONE;
    public static final /* synthetic */ EnumC1779790wPp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779790wPp PAUSED;
    public static final EnumC1779790wPp PENDING;
    public static final EnumC1779790wPp PULLING;

    public static InterfaceC2044707zh<EnumC1779790wPp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779790wPp enumC1779790wPp = new EnumC1779790wPp("PENDING", 0);
        PENDING = enumC1779790wPp;
        EnumC1779790wPp enumC1779790wPp2 = new EnumC1779790wPp("PULLING", 1);
        PULLING = enumC1779790wPp2;
        EnumC1779790wPp enumC1779790wPp3 = new EnumC1779790wPp("PAUSED", 2);
        PAUSED = enumC1779790wPp3;
        EnumC1779790wPp enumC1779790wPp4 = new EnumC1779790wPp("DONE", 3);
        DONE = enumC1779790wPp4;
        EnumC1779790wPp[] enumC1779790wPpArr = {enumC1779790wPp, enumC1779790wPp2, enumC1779790wPp3, enumC1779790wPp4};
        LL = enumC1779790wPpArr;
        LLILLJJLI = new C2254308sP(enumC1779790wPpArr);
    }

    public static EnumC1779790wPp[] values() {
        return (EnumC1779790wPp[]) LL.clone();
    }

    public static EnumC1779790wPp valueOf(String str) {
        return (EnumC1779790wPp) C08FF.LIZ(EnumC1779790wPp.class, str);
    }

    public EnumC1779790wPp(String str, int i) {
    }
}
