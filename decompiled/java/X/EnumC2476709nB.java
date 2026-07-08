package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09nB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2476709nB {
    public static final EnumC2476709nB LL;
    public static final EnumC2476709nB LLILLJJLI;
    public static final /* synthetic */ EnumC2476709nB[] LLILLL;

    static {
        EnumC2476709nB enumC2476709nB = new EnumC2476709nB("VERTICAL", 0);
        LL = enumC2476709nB;
        EnumC2476709nB enumC2476709nB2 = new EnumC2476709nB("HORIZONTAL", 1);
        LLILLJJLI = enumC2476709nB2;
        EnumC2476709nB[] enumC2476709nBArr = {enumC2476709nB, enumC2476709nB2};
        LLILLL = enumC2476709nBArr;
        new C2254308sP(enumC2476709nBArr);
    }

    public static EnumC2476709nB[] values() {
        return (EnumC2476709nB[]) LLILLL.clone();
    }

    public static EnumC2476709nB valueOf(String str) {
        return (EnumC2476709nB) C08FF.LIZ(EnumC2476709nB.class, str);
    }

    public EnumC2476709nB(String str, int i) {
    }
}
