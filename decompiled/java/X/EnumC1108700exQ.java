package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0exQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1108700exQ {
    public static final EnumC1108700exQ AUTO;
    public static final EnumC1108700exQ CLOSE;
    public static final EnumC1108700exQ HIDE;
    public static final /* synthetic */ EnumC1108700exQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1108700exQ OTHER;
    public static final EnumC1108700exQ REPLACED;
    public static final EnumC1108700exQ UNPIN;

    public static InterfaceC2044707zh<EnumC1108700exQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1108700exQ enumC1108700exQ = new EnumC1108700exQ("CLOSE", 0);
        CLOSE = enumC1108700exQ;
        EnumC1108700exQ enumC1108700exQ2 = new EnumC1108700exQ("AUTO", 1);
        AUTO = enumC1108700exQ2;
        EnumC1108700exQ enumC1108700exQ3 = new EnumC1108700exQ("UNPIN", 2);
        UNPIN = enumC1108700exQ3;
        EnumC1108700exQ enumC1108700exQ4 = new EnumC1108700exQ("REPLACED", 3);
        REPLACED = enumC1108700exQ4;
        EnumC1108700exQ enumC1108700exQ5 = new EnumC1108700exQ("OTHER", 4);
        OTHER = enumC1108700exQ5;
        EnumC1108700exQ enumC1108700exQ6 = new EnumC1108700exQ("HIDE", 5);
        HIDE = enumC1108700exQ6;
        EnumC1108700exQ[] enumC1108700exQArr = {enumC1108700exQ, enumC1108700exQ2, enumC1108700exQ3, enumC1108700exQ4, enumC1108700exQ5, enumC1108700exQ6};
        LL = enumC1108700exQArr;
        LLILLJJLI = new C2254308sP(enumC1108700exQArr);
    }

    public static EnumC1108700exQ[] values() {
        return (EnumC1108700exQ[]) LL.clone();
    }

    public static EnumC1108700exQ valueOf(String str) {
        return (EnumC1108700exQ) C08FF.LIZ(EnumC1108700exQ.class, str);
    }

    public EnumC1108700exQ(String str, int i) {
    }
}
