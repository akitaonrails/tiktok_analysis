package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993270bxF {
    public static final EnumC993270bxF GIFT_DIALOG;
    public static final /* synthetic */ EnumC993270bxF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993270bxF RECHARGE_DIALOG;

    public static InterfaceC2044707zh<EnumC993270bxF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993270bxF enumC993270bxF = new EnumC993270bxF("GIFT_DIALOG", 0);
        GIFT_DIALOG = enumC993270bxF;
        EnumC993270bxF enumC993270bxF2 = new EnumC993270bxF("RECHARGE_DIALOG", 1);
        RECHARGE_DIALOG = enumC993270bxF2;
        EnumC993270bxF[] enumC993270bxFArr = {enumC993270bxF, enumC993270bxF2};
        LL = enumC993270bxFArr;
        LLILLJJLI = new C2254308sP(enumC993270bxFArr);
    }

    public static EnumC993270bxF[] values() {
        return (EnumC993270bxF[]) LL.clone();
    }

    public static EnumC993270bxF valueOf(String str) {
        return (EnumC993270bxF) C08FF.LIZ(EnumC993270bxF.class, str);
    }

    public EnumC993270bxF(String str, int i) {
    }
}
