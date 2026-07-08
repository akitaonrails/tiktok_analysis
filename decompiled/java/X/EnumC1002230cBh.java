package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1002230cBh {
    public static final EnumC1002230cBh DONE;
    public static final /* synthetic */ EnumC1002230cBh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1002230cBh PENDING;
    public static final EnumC1002230cBh READY;

    public static InterfaceC2044707zh<EnumC1002230cBh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1002230cBh enumC1002230cBh = new EnumC1002230cBh("PENDING", 0);
        PENDING = enumC1002230cBh;
        EnumC1002230cBh enumC1002230cBh2 = new EnumC1002230cBh("READY", 1);
        READY = enumC1002230cBh2;
        EnumC1002230cBh enumC1002230cBh3 = new EnumC1002230cBh("DONE", 2);
        DONE = enumC1002230cBh3;
        EnumC1002230cBh[] enumC1002230cBhArr = {enumC1002230cBh, enumC1002230cBh2, enumC1002230cBh3};
        LL = enumC1002230cBhArr;
        LLILLJJLI = new C2254308sP(enumC1002230cBhArr);
    }

    public static EnumC1002230cBh[] values() {
        return (EnumC1002230cBh[]) LL.clone();
    }

    public static EnumC1002230cBh valueOf(String str) {
        return (EnumC1002230cBh) C08FF.LIZ(EnumC1002230cBh.class, str);
    }

    public EnumC1002230cBh(String str, int i) {
    }
}
