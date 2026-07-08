package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0igs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1252200igs {
    public static final EnumC1252200igs BAN;
    public static final EnumC1252200igs BLOCK;
    public static final EnumC1252200igs DOUBLE_CANCEL;
    public static final EnumC1252200igs FINISH;
    public static final /* synthetic */ EnumC1252200igs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1252200igs LOGIN;
    public static final EnumC1252200igs REQUESTED;
    public static final EnumC1252200igs START;
    public static final EnumC1252200igs TEMPORARY_BAN;

    public static InterfaceC2044707zh<EnumC1252200igs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1252200igs enumC1252200igs = new EnumC1252200igs("START", 0);
        START = enumC1252200igs;
        EnumC1252200igs enumC1252200igs2 = new EnumC1252200igs("LOGIN", 1);
        LOGIN = enumC1252200igs2;
        EnumC1252200igs enumC1252200igs3 = new EnumC1252200igs("BLOCK", 2);
        BLOCK = enumC1252200igs3;
        EnumC1252200igs enumC1252200igs4 = new EnumC1252200igs("BAN", 3);
        BAN = enumC1252200igs4;
        EnumC1252200igs enumC1252200igs5 = new EnumC1252200igs("TEMPORARY_BAN", 4);
        TEMPORARY_BAN = enumC1252200igs5;
        EnumC1252200igs enumC1252200igs6 = new EnumC1252200igs("DOUBLE_CANCEL", 5);
        DOUBLE_CANCEL = enumC1252200igs6;
        EnumC1252200igs enumC1252200igs7 = new EnumC1252200igs("REQUESTED", 6);
        REQUESTED = enumC1252200igs7;
        EnumC1252200igs enumC1252200igs8 = new EnumC1252200igs("FINISH", 7);
        FINISH = enumC1252200igs8;
        EnumC1252200igs[] enumC1252200igsArr = {enumC1252200igs, enumC1252200igs2, enumC1252200igs3, enumC1252200igs4, enumC1252200igs5, enumC1252200igs6, enumC1252200igs7, enumC1252200igs8};
        LL = enumC1252200igsArr;
        LLILLJJLI = new C2254308sP(enumC1252200igsArr);
    }

    public static EnumC1252200igs[] values() {
        return (EnumC1252200igs[]) LL.clone();
    }

    public static EnumC1252200igs valueOf(String str) {
        return (EnumC1252200igs) C08FF.LIZ(EnumC1252200igs.class, str);
    }

    public EnumC1252200igs(String str, int i) {
    }
}
