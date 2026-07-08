package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1146170fvr {
    public static final EnumC1146170fvr GIFT;
    public static final /* synthetic */ EnumC1146170fvr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1146170fvr NONE;
    public static final EnumC1146170fvr RECORD;

    public static InterfaceC2044707zh<EnumC1146170fvr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1146170fvr enumC1146170fvr = new EnumC1146170fvr("NONE", 0);
        NONE = enumC1146170fvr;
        EnumC1146170fvr enumC1146170fvr2 = new EnumC1146170fvr("GIFT", 1);
        GIFT = enumC1146170fvr2;
        EnumC1146170fvr enumC1146170fvr3 = new EnumC1146170fvr("RECORD", 2);
        RECORD = enumC1146170fvr3;
        EnumC1146170fvr[] enumC1146170fvrArr = {enumC1146170fvr, enumC1146170fvr2, enumC1146170fvr3};
        LL = enumC1146170fvrArr;
        LLILLJJLI = new C2254308sP(enumC1146170fvrArr);
    }

    public static EnumC1146170fvr[] values() {
        return (EnumC1146170fvr[]) LL.clone();
    }

    public static EnumC1146170fvr valueOf(String str) {
        return (EnumC1146170fvr) C08FF.LIZ(EnumC1146170fvr.class, str);
    }

    public EnumC1146170fvr(String str, int i) {
    }
}
