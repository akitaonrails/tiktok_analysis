package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gtj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC430090Gtj {
    public static final EnumC430090Gtj DISABLED;
    public static final EnumC430090Gtj HIDDEN;
    public static final /* synthetic */ EnumC430090Gtj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC430090Gtj LOCKED;
    public static final EnumC430090Gtj NORMAL;
    public static final EnumC430090Gtj PRESSED;
    public static final EnumC430090Gtj RECORD_FINISHED;

    public static InterfaceC2044707zh<EnumC430090Gtj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC430090Gtj enumC430090Gtj = new EnumC430090Gtj("HIDDEN", 0);
        HIDDEN = enumC430090Gtj;
        EnumC430090Gtj enumC430090Gtj2 = new EnumC430090Gtj("DISABLED", 1);
        DISABLED = enumC430090Gtj2;
        EnumC430090Gtj enumC430090Gtj3 = new EnumC430090Gtj("NORMAL", 2);
        NORMAL = enumC430090Gtj3;
        EnumC430090Gtj enumC430090Gtj4 = new EnumC430090Gtj("PRESSED", 3);
        PRESSED = enumC430090Gtj4;
        EnumC430090Gtj enumC430090Gtj5 = new EnumC430090Gtj("LOCKED", 4);
        LOCKED = enumC430090Gtj5;
        EnumC430090Gtj enumC430090Gtj6 = new EnumC430090Gtj("RECORD_FINISHED", 5);
        RECORD_FINISHED = enumC430090Gtj6;
        EnumC430090Gtj[] enumC430090GtjArr = {enumC430090Gtj, enumC430090Gtj2, enumC430090Gtj3, enumC430090Gtj4, enumC430090Gtj5, enumC430090Gtj6};
        LL = enumC430090GtjArr;
        LLILLJJLI = new C2254308sP(enumC430090GtjArr);
    }

    public static EnumC430090Gtj[] values() {
        return (EnumC430090Gtj[]) LL.clone();
    }

    public static EnumC430090Gtj valueOf(String str) {
        return (EnumC430090Gtj) C08FF.LIZ(EnumC430090Gtj.class, str);
    }

    public EnumC430090Gtj(String str, int i) {
    }
}
