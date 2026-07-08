package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC851810XbH {
    public static final EnumC851810XbH FINISHED;
    public static final /* synthetic */ EnumC851810XbH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC851810XbH NOT_START;
    public static final EnumC851810XbH STARTED;

    public static InterfaceC2044707zh<EnumC851810XbH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC851810XbH enumC851810XbH = new EnumC851810XbH("NOT_START", 0);
        NOT_START = enumC851810XbH;
        EnumC851810XbH enumC851810XbH2 = new EnumC851810XbH("STARTED", 1);
        STARTED = enumC851810XbH2;
        EnumC851810XbH enumC851810XbH3 = new EnumC851810XbH("FINISHED", 2);
        FINISHED = enumC851810XbH3;
        EnumC851810XbH[] enumC851810XbHArr = {enumC851810XbH, enumC851810XbH2, enumC851810XbH3};
        LL = enumC851810XbHArr;
        LLILLJJLI = new C2254308sP(enumC851810XbHArr);
    }

    public static EnumC851810XbH[] values() {
        return (EnumC851810XbH[]) LL.clone();
    }

    public static EnumC851810XbH valueOf(String str) {
        return (EnumC851810XbH) C08FF.LIZ(EnumC851810XbH.class, str);
    }

    public EnumC851810XbH(String str, int i) {
    }
}
