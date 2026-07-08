package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC963730bBb {
    public static final /* synthetic */ EnumC963730bBb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC963730bBb LOARDING;
    public static final EnumC963730bBb SHRINK;

    public static InterfaceC2044707zh<EnumC963730bBb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC963730bBb enumC963730bBb = new EnumC963730bBb("SHRINK", 0);
        SHRINK = enumC963730bBb;
        EnumC963730bBb enumC963730bBb2 = new EnumC963730bBb("LOARDING", 1);
        LOARDING = enumC963730bBb2;
        EnumC963730bBb[] enumC963730bBbArr = {enumC963730bBb, enumC963730bBb2};
        LL = enumC963730bBbArr;
        LLILLJJLI = new C2254308sP(enumC963730bBbArr);
    }

    public static EnumC963730bBb[] values() {
        return (EnumC963730bBb[]) LL.clone();
    }

    public static EnumC963730bBb valueOf(String str) {
        return (EnumC963730bBb) C08FF.LIZ(EnumC963730bBb.class, str);
    }

    public EnumC963730bBb(String str, int i) {
    }
}
