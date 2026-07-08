package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vAF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1731690vAF {
    public static final EnumC1731690vAF CONTENT_EMPTY;
    public static final EnumC1731690vAF DISABLED;
    public static final /* synthetic */ EnumC1731690vAF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1731690vAF SHOW;
    public static final EnumC1731690vAF TIMESTAMP_EXPIRED;

    public static InterfaceC2044707zh<EnumC1731690vAF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1731690vAF enumC1731690vAF = new EnumC1731690vAF("CONTENT_EMPTY", 0);
        CONTENT_EMPTY = enumC1731690vAF;
        EnumC1731690vAF enumC1731690vAF2 = new EnumC1731690vAF("DISABLED", 1);
        DISABLED = enumC1731690vAF2;
        EnumC1731690vAF enumC1731690vAF3 = new EnumC1731690vAF("TIMESTAMP_EXPIRED", 2);
        TIMESTAMP_EXPIRED = enumC1731690vAF3;
        EnumC1731690vAF enumC1731690vAF4 = new EnumC1731690vAF("SHOW", 3);
        SHOW = enumC1731690vAF4;
        EnumC1731690vAF[] enumC1731690vAFArr = {enumC1731690vAF, enumC1731690vAF2, enumC1731690vAF3, enumC1731690vAF4};
        LL = enumC1731690vAFArr;
        LLILLJJLI = new C2254308sP(enumC1731690vAFArr);
    }

    public static EnumC1731690vAF[] values() {
        return (EnumC1731690vAF[]) LL.clone();
    }

    public static EnumC1731690vAF valueOf(String str) {
        return (EnumC1731690vAF) C08FF.LIZ(EnumC1731690vAF.class, str);
    }

    public EnumC1731690vAF(String str, int i) {
    }
}
