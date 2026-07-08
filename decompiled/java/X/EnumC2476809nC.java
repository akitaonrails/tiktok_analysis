package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09nC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2476809nC {
    public static final EnumC2476809nC LL;
    public static final EnumC2476809nC LLILLJJLI;
    public static final /* synthetic */ EnumC2476809nC[] LLILLL;

    static {
        EnumC2476809nC enumC2476809nC = new EnumC2476809nC("VERTICAL", 0);
        LL = enumC2476809nC;
        EnumC2476809nC enumC2476809nC2 = new EnumC2476809nC("HORIZONTAL", 1);
        LLILLJJLI = enumC2476809nC2;
        EnumC2476809nC[] enumC2476809nCArr = {enumC2476809nC, enumC2476809nC2};
        LLILLL = enumC2476809nCArr;
        new C2254308sP(enumC2476809nCArr);
    }

    public static EnumC2476809nC[] values() {
        return (EnumC2476809nC[]) LLILLL.clone();
    }

    public static EnumC2476809nC valueOf(String str) {
        return (EnumC2476809nC) C08FF.LIZ(EnumC2476809nC.class, str);
    }

    public EnumC2476809nC(String str, int i) {
    }
}
