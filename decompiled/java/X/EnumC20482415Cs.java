package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20482415Cs {
    public static final /* synthetic */ EnumC20482415Cs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20482415Cs NUMBER;
    public static final EnumC20482415Cs PERCENTAGE;

    public static InterfaceC2044707zh<EnumC20482415Cs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20482415Cs enumC20482415Cs = new EnumC20482415Cs("NUMBER", 0);
        NUMBER = enumC20482415Cs;
        EnumC20482415Cs enumC20482415Cs2 = new EnumC20482415Cs("PERCENTAGE", 1);
        PERCENTAGE = enumC20482415Cs2;
        EnumC20482415Cs[] enumC20482415CsArr = {enumC20482415Cs, enumC20482415Cs2};
        LL = enumC20482415CsArr;
        LLILLJJLI = new C2254308sP(enumC20482415CsArr);
    }

    public static EnumC20482415Cs[] values() {
        return (EnumC20482415Cs[]) LL.clone();
    }

    public static EnumC20482415Cs valueOf(String str) {
        return (EnumC20482415Cs) C08FF.LIZ(EnumC20482415Cs.class, str);
    }

    public EnumC20482415Cs(String str, int i) {
    }
}
