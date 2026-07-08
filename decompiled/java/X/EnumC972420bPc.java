package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC972420bPc {
    public static final EnumC972420bPc INVITEE;
    public static final EnumC972420bPc INVITER;
    public static final /* synthetic */ EnumC972420bPc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC972420bPc UNKNOWN;

    public static InterfaceC2044707zh<EnumC972420bPc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC972420bPc enumC972420bPc = new EnumC972420bPc("UNKNOWN", 0);
        UNKNOWN = enumC972420bPc;
        EnumC972420bPc enumC972420bPc2 = new EnumC972420bPc("INVITER", 1);
        INVITER = enumC972420bPc2;
        EnumC972420bPc enumC972420bPc3 = new EnumC972420bPc("INVITEE", 2);
        INVITEE = enumC972420bPc3;
        EnumC972420bPc[] enumC972420bPcArr = {enumC972420bPc, enumC972420bPc2, enumC972420bPc3};
        LL = enumC972420bPcArr;
        LLILLJJLI = new C2254308sP(enumC972420bPcArr);
    }

    public static EnumC972420bPc[] values() {
        return (EnumC972420bPc[]) LL.clone();
    }

    public static EnumC972420bPc valueOf(String str) {
        return (EnumC972420bPc) C08FF.LIZ(EnumC972420bPc.class, str);
    }

    public EnumC972420bPc(String str, int i) {
    }
}
