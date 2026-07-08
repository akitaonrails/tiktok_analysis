package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07uQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2012007uQ {
    public static final EnumC2012007uQ BANNER;
    public static final EnumC2012007uQ ICON;
    public static final /* synthetic */ EnumC2012007uQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2012007uQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2012007uQ enumC2012007uQ = new EnumC2012007uQ("ICON", 0);
        ICON = enumC2012007uQ;
        EnumC2012007uQ enumC2012007uQ2 = new EnumC2012007uQ("BANNER", 1);
        BANNER = enumC2012007uQ2;
        EnumC2012007uQ[] enumC2012007uQArr = {enumC2012007uQ, enumC2012007uQ2};
        LL = enumC2012007uQArr;
        LLILLJJLI = new C2254308sP(enumC2012007uQArr);
    }

    public static EnumC2012007uQ[] values() {
        return (EnumC2012007uQ[]) LL.clone();
    }

    public static EnumC2012007uQ valueOf(String str) {
        return (EnumC2012007uQ) C08FF.LIZ(EnumC2012007uQ.class, str);
    }

    public EnumC2012007uQ(String str, int i) {
    }
}
