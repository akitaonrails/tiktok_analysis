package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC094100Xb {
    public static final EnumC094100Xb END;
    public static final /* synthetic */ EnumC094100Xb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC094100Xb START;

    public static InterfaceC2044707zh<EnumC094100Xb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC094100Xb enumC094100Xb = new EnumC094100Xb("START", 0);
        START = enumC094100Xb;
        EnumC094100Xb enumC094100Xb2 = new EnumC094100Xb("END", 1);
        END = enumC094100Xb2;
        EnumC094100Xb[] enumC094100XbArr = {enumC094100Xb, enumC094100Xb2};
        LL = enumC094100XbArr;
        LLILLJJLI = new C2254308sP(enumC094100XbArr);
    }

    public static EnumC094100Xb[] values() {
        return (EnumC094100Xb[]) LL.clone();
    }

    public static EnumC094100Xb valueOf(String str) {
        return (EnumC094100Xb) C08FF.LIZ(EnumC094100Xb.class, str);
    }

    public EnumC094100Xb(String str, int i) {
    }
}
