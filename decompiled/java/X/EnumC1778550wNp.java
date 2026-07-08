package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778550wNp {
    public static final EnumC1778550wNp CANCEL;
    public static final EnumC1778550wNp CONFIRM;
    public static final /* synthetic */ EnumC1778550wNp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778550wNp MASK;

    public static InterfaceC2044707zh<EnumC1778550wNp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778550wNp enumC1778550wNp = new EnumC1778550wNp("CONFIRM", 0);
        CONFIRM = enumC1778550wNp;
        EnumC1778550wNp enumC1778550wNp2 = new EnumC1778550wNp("CANCEL", 1);
        CANCEL = enumC1778550wNp2;
        EnumC1778550wNp enumC1778550wNp3 = new EnumC1778550wNp("MASK", 2);
        MASK = enumC1778550wNp3;
        EnumC1778550wNp[] enumC1778550wNpArr = {enumC1778550wNp, enumC1778550wNp2, enumC1778550wNp3};
        LL = enumC1778550wNpArr;
        LLILLJJLI = new C2254308sP(enumC1778550wNpArr);
    }

    public static EnumC1778550wNp[] values() {
        return (EnumC1778550wNp[]) LL.clone();
    }

    public static EnumC1778550wNp valueOf(String str) {
        return (EnumC1778550wNp) C08FF.LIZ(EnumC1778550wNp.class, str);
    }

    public EnumC1778550wNp(String str, int i) {
    }
}
