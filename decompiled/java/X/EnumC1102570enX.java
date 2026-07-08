package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0enX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1102570enX {
    public static final EnumC1102570enX LL;
    public static final EnumC1102570enX LLILLJJLI;
    public static final /* synthetic */ EnumC1102570enX[] LLILLL;

    static {
        EnumC1102570enX enumC1102570enX = new EnumC1102570enX("ATTACH", 0);
        LL = enumC1102570enX;
        EnumC1102570enX enumC1102570enX2 = new EnumC1102570enX("DETACH", 1);
        LLILLJJLI = enumC1102570enX2;
        EnumC1102570enX[] enumC1102570enXArr = {enumC1102570enX, enumC1102570enX2};
        LLILLL = enumC1102570enXArr;
        new C2254308sP(enumC1102570enXArr);
    }

    public static EnumC1102570enX[] values() {
        return (EnumC1102570enX[]) LLILLL.clone();
    }

    public static EnumC1102570enX valueOf(String str) {
        return (EnumC1102570enX) C08FF.LIZ(EnumC1102570enX.class, str);
    }

    public EnumC1102570enX(String str, int i) {
    }
}
