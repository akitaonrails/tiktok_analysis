package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ioq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC478020Ioq {
    public static final EnumC478020Ioq FAILED;
    public static final EnumC478020Ioq IDLE;
    public static final /* synthetic */ EnumC478020Ioq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC478020Ioq NETWORK_OFFLINE;
    public static final EnumC478020Ioq OFFLINE_NOT_REFRESH;
    public static final EnumC478020Ioq START;
    public static final EnumC478020Ioq SUCCEED;

    public static InterfaceC2044707zh<EnumC478020Ioq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC478020Ioq enumC478020Ioq = new EnumC478020Ioq("IDLE", 0);
        IDLE = enumC478020Ioq;
        EnumC478020Ioq enumC478020Ioq2 = new EnumC478020Ioq("START", 1);
        START = enumC478020Ioq2;
        EnumC478020Ioq enumC478020Ioq3 = new EnumC478020Ioq("SUCCEED", 2);
        SUCCEED = enumC478020Ioq3;
        EnumC478020Ioq enumC478020Ioq4 = new EnumC478020Ioq("FAILED", 3);
        FAILED = enumC478020Ioq4;
        EnumC478020Ioq enumC478020Ioq5 = new EnumC478020Ioq("NETWORK_OFFLINE", 4);
        NETWORK_OFFLINE = enumC478020Ioq5;
        EnumC478020Ioq enumC478020Ioq6 = new EnumC478020Ioq("OFFLINE_NOT_REFRESH", 5);
        OFFLINE_NOT_REFRESH = enumC478020Ioq6;
        EnumC478020Ioq[] enumC478020IoqArr = {enumC478020Ioq, enumC478020Ioq2, enumC478020Ioq3, enumC478020Ioq4, enumC478020Ioq5, enumC478020Ioq6};
        LL = enumC478020IoqArr;
        LLILLJJLI = new C2254308sP(enumC478020IoqArr);
    }

    public static EnumC478020Ioq[] values() {
        return (EnumC478020Ioq[]) LL.clone();
    }

    public static EnumC478020Ioq valueOf(String str) {
        return (EnumC478020Ioq) C08FF.LIZ(EnumC478020Ioq.class, str);
    }

    public EnumC478020Ioq(String str, int i) {
    }
}
