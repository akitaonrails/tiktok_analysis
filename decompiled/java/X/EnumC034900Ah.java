package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC034900Ah {
    public static final /* synthetic */ EnumC034900Ah[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC034900Ah SURPRISE_ITEMTYPE_ACTIVITY;
    public static final EnumC034900Ah SURPRISE_ITEMTYPE_COMMMON;
    public final int LL;

    public static InterfaceC2044707zh<EnumC034900Ah> getEntries() {
        return LLILLL;
    }

    static {
        EnumC034900Ah enumC034900Ah = new EnumC034900Ah("SURPRISE_ITEMTYPE_COMMMON", 0, 0);
        SURPRISE_ITEMTYPE_COMMMON = enumC034900Ah;
        EnumC034900Ah enumC034900Ah2 = new EnumC034900Ah("SURPRISE_ITEMTYPE_ACTIVITY", 1, 1);
        SURPRISE_ITEMTYPE_ACTIVITY = enumC034900Ah2;
        EnumC034900Ah[] enumC034900AhArr = {enumC034900Ah, enumC034900Ah2};
        LLILLJJLI = enumC034900AhArr;
        LLILLL = new C2254308sP(enumC034900AhArr);
    }

    public static EnumC034900Ah[] values() {
        return (EnumC034900Ah[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC034900Ah valueOf(String str) {
        return (EnumC034900Ah) C08FF.LIZ(EnumC034900Ah.class, str);
    }

    public EnumC034900Ah(String str, int i, int i2) {
        this.LL = i2;
    }
}
