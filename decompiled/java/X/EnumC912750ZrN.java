package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC912750ZrN {
    public static final EnumC912750ZrN HIDDEN;
    public static final /* synthetic */ EnumC912750ZrN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC912750ZrN VISIBLE;

    public static InterfaceC2044707zh<EnumC912750ZrN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC912750ZrN enumC912750ZrN = new EnumC912750ZrN("VISIBLE", 0);
        VISIBLE = enumC912750ZrN;
        EnumC912750ZrN enumC912750ZrN2 = new EnumC912750ZrN("HIDDEN", 1);
        HIDDEN = enumC912750ZrN2;
        EnumC912750ZrN[] enumC912750ZrNArr = {enumC912750ZrN, enumC912750ZrN2};
        LL = enumC912750ZrNArr;
        LLILLJJLI = new C2254308sP(enumC912750ZrNArr);
    }

    public static EnumC912750ZrN[] values() {
        return (EnumC912750ZrN[]) LL.clone();
    }

    public static EnumC912750ZrN valueOf(String str) {
        return (EnumC912750ZrN) C08FF.LIZ(EnumC912750ZrN.class, str);
    }

    public EnumC912750ZrN(String str, int i) {
    }
}
