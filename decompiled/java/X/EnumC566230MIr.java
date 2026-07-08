package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC566230MIr {
    public static final /* synthetic */ EnumC566230MIr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC566230MIr NEW_CREATE;
    public static final EnumC566230MIr PROGRESS;
    public static final EnumC566230MIr QUEUE;

    public static InterfaceC2044707zh<EnumC566230MIr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC566230MIr enumC566230MIr = new EnumC566230MIr("NEW_CREATE", 0);
        NEW_CREATE = enumC566230MIr;
        EnumC566230MIr enumC566230MIr2 = new EnumC566230MIr("QUEUE", 1);
        QUEUE = enumC566230MIr2;
        EnumC566230MIr enumC566230MIr3 = new EnumC566230MIr("PROGRESS", 2);
        PROGRESS = enumC566230MIr3;
        EnumC566230MIr[] enumC566230MIrArr = {enumC566230MIr, enumC566230MIr2, enumC566230MIr3};
        LL = enumC566230MIrArr;
        LLILLJJLI = new C2254308sP(enumC566230MIrArr);
    }

    public static EnumC566230MIr[] values() {
        return (EnumC566230MIr[]) LL.clone();
    }

    public static EnumC566230MIr valueOf(String str) {
        return (EnumC566230MIr) C08FF.LIZ(EnumC566230MIr.class, str);
    }

    public EnumC566230MIr(String str, int i) {
    }
}
