package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1338180kvY {
    public static final /* synthetic */ EnumC1338180kvY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1338180kvY Longer;
    public static final EnumC1338180kvY Shorter;

    public static InterfaceC2044707zh<EnumC1338180kvY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1338180kvY enumC1338180kvY = new EnumC1338180kvY("Shorter", 0);
        Shorter = enumC1338180kvY;
        EnumC1338180kvY enumC1338180kvY2 = new EnumC1338180kvY("Longer", 1);
        Longer = enumC1338180kvY2;
        EnumC1338180kvY[] enumC1338180kvYArr = {enumC1338180kvY, enumC1338180kvY2};
        LL = enumC1338180kvYArr;
        LLILLJJLI = new C2254308sP(enumC1338180kvYArr);
    }

    public static EnumC1338180kvY[] values() {
        return (EnumC1338180kvY[]) LL.clone();
    }

    public static EnumC1338180kvY valueOf(String str) {
        return (EnumC1338180kvY) C08FF.LIZ(EnumC1338180kvY.class, str);
    }

    public EnumC1338180kvY(String str, int i) {
    }
}
