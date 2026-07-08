package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13eO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20060613eO {
    public static final EnumC20060613eO Cancelled;
    public static final /* synthetic */ EnumC20060613eO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20060613eO None;
    public static final EnumC20060613eO RedirectCancelled;
    public static final EnumC20060613eO Redirected;

    public static InterfaceC2044707zh<EnumC20060613eO> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC20060613eO valueOf(String str) {
        return (EnumC20060613eO) C08FF.LIZ(EnumC20060613eO.class, str);
    }

    public static EnumC20060613eO[] values() {
        return (EnumC20060613eO[]) LL.clone();
    }

    static {
        EnumC20060613eO enumC20060613eO = new EnumC20060613eO("None", 0);
        None = enumC20060613eO;
        EnumC20060613eO enumC20060613eO2 = new EnumC20060613eO("Cancelled", 1);
        Cancelled = enumC20060613eO2;
        EnumC20060613eO enumC20060613eO3 = new EnumC20060613eO("Redirected", 2);
        Redirected = enumC20060613eO3;
        EnumC20060613eO enumC20060613eO4 = new EnumC20060613eO("RedirectCancelled", 3);
        RedirectCancelled = enumC20060613eO4;
        EnumC20060613eO[] enumC20060613eOArr = {enumC20060613eO, enumC20060613eO2, enumC20060613eO3, enumC20060613eO4};
        LL = enumC20060613eOArr;
        LLILLJJLI = new C2254308sP(enumC20060613eOArr);
    }

    public EnumC20060613eO(String str, int i) {
    }
}
