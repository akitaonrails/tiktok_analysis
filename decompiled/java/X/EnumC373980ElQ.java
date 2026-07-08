package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ElQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373980ElQ {
    public static final EnumC373980ElQ LEFT;
    public static final /* synthetic */ EnumC373980ElQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC373980ElQ RIGHT;

    public static InterfaceC2044707zh<EnumC373980ElQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC373980ElQ enumC373980ElQ = new EnumC373980ElQ("LEFT", 0);
        LEFT = enumC373980ElQ;
        EnumC373980ElQ enumC373980ElQ2 = new EnumC373980ElQ("RIGHT", 1);
        RIGHT = enumC373980ElQ2;
        EnumC373980ElQ[] enumC373980ElQArr = {enumC373980ElQ, enumC373980ElQ2};
        LL = enumC373980ElQArr;
        LLILLJJLI = new C2254308sP(enumC373980ElQArr);
    }

    public static EnumC373980ElQ[] values() {
        return (EnumC373980ElQ[]) LL.clone();
    }

    public static EnumC373980ElQ valueOf(String str) {
        return (EnumC373980ElQ) C08FF.LIZ(EnumC373980ElQ.class, str);
    }

    public EnumC373980ElQ(String str, int i) {
    }
}
