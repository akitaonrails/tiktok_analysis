package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006650cIp {
    public static final EnumC1006650cIp DESTROYED;
    public static final EnumC1006650cIp FAIL;
    public static final EnumC1006650cIp FP_ARRIVED;
    public static final EnumC1006650cIp IN_PROGRESS;
    public static final /* synthetic */ EnumC1006650cIp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1006650cIp LOAD_COMPLETE;

    public static InterfaceC2044707zh<EnumC1006650cIp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1006650cIp enumC1006650cIp = new EnumC1006650cIp("IN_PROGRESS", 0);
        IN_PROGRESS = enumC1006650cIp;
        EnumC1006650cIp enumC1006650cIp2 = new EnumC1006650cIp("FAIL", 1);
        FAIL = enumC1006650cIp2;
        EnumC1006650cIp enumC1006650cIp3 = new EnumC1006650cIp("LOAD_COMPLETE", 2);
        LOAD_COMPLETE = enumC1006650cIp3;
        EnumC1006650cIp enumC1006650cIp4 = new EnumC1006650cIp("FP_ARRIVED", 3);
        FP_ARRIVED = enumC1006650cIp4;
        EnumC1006650cIp enumC1006650cIp5 = new EnumC1006650cIp("DESTROYED", 4);
        DESTROYED = enumC1006650cIp5;
        EnumC1006650cIp[] enumC1006650cIpArr = {enumC1006650cIp, enumC1006650cIp2, enumC1006650cIp3, enumC1006650cIp4, enumC1006650cIp5};
        LL = enumC1006650cIpArr;
        LLILLJJLI = new C2254308sP(enumC1006650cIpArr);
    }

    public static EnumC1006650cIp[] values() {
        return (EnumC1006650cIp[]) LL.clone();
    }

    public static EnumC1006650cIp valueOf(String str) {
        return (EnumC1006650cIp) C08FF.LIZ(EnumC1006650cIp.class, str);
    }

    public EnumC1006650cIp(String str, int i) {
    }
}
