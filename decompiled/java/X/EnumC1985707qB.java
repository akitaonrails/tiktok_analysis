package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1985707qB {
    public static final EnumC1985707qB FIVE_SHEET;
    public static final /* synthetic */ EnumC1985707qB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1985707qB THREE_SHEET;

    public static InterfaceC2044707zh<EnumC1985707qB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1985707qB enumC1985707qB = new EnumC1985707qB("THREE_SHEET", 0);
        THREE_SHEET = enumC1985707qB;
        EnumC1985707qB enumC1985707qB2 = new EnumC1985707qB("FIVE_SHEET", 1);
        FIVE_SHEET = enumC1985707qB2;
        EnumC1985707qB[] enumC1985707qBArr = {enumC1985707qB, enumC1985707qB2};
        LL = enumC1985707qBArr;
        LLILLJJLI = new C2254308sP(enumC1985707qBArr);
    }

    public static EnumC1985707qB[] values() {
        return (EnumC1985707qB[]) LL.clone();
    }

    public static EnumC1985707qB valueOf(String str) {
        return (EnumC1985707qB) C08FF.LIZ(EnumC1985707qB.class, str);
    }

    public EnumC1985707qB(String str, int i) {
    }
}
