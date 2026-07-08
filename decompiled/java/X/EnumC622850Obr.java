package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Obr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC622850Obr {
    public static final EnumC622850Obr FRAGMENTS_NO_DESTROY;
    public static final EnumC622850Obr LIMITED_NUM_FRAGMENTS_NO_DESTROY;
    public static final /* synthetic */ EnumC622850Obr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC622850Obr REGULAR;

    public static InterfaceC2044707zh<EnumC622850Obr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC622850Obr enumC622850Obr = new EnumC622850Obr("REGULAR", 0);
        REGULAR = enumC622850Obr;
        EnumC622850Obr enumC622850Obr2 = new EnumC622850Obr("FRAGMENTS_NO_DESTROY", 1);
        FRAGMENTS_NO_DESTROY = enumC622850Obr2;
        EnumC622850Obr enumC622850Obr3 = new EnumC622850Obr("LIMITED_NUM_FRAGMENTS_NO_DESTROY", 2);
        LIMITED_NUM_FRAGMENTS_NO_DESTROY = enumC622850Obr3;
        EnumC622850Obr[] enumC622850ObrArr = {enumC622850Obr, enumC622850Obr2, enumC622850Obr3};
        LL = enumC622850ObrArr;
        LLILLJJLI = new C2254308sP(enumC622850ObrArr);
    }

    public static EnumC622850Obr[] values() {
        return (EnumC622850Obr[]) LL.clone();
    }

    public static EnumC622850Obr valueOf(String str) {
        return (EnumC622850Obr) C08FF.LIZ(EnumC622850Obr.class, str);
    }

    public EnumC622850Obr(String str, int i) {
    }
}
