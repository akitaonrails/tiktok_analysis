package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lLW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1354280lLW {
    public static final EnumC1354280lLW LL;
    public static final EnumC1354280lLW LLILLJJLI;
    public static final EnumC1354280lLW LLILLL;
    public static final EnumC1354280lLW LLILZ;
    public static final /* synthetic */ EnumC1354280lLW[] LLILZIL;

    static {
        EnumC1354280lLW enumC1354280lLW = new EnumC1354280lLW("HIDE", 0);
        LL = enumC1354280lLW;
        EnumC1354280lLW enumC1354280lLW2 = new EnumC1354280lLW("WILL_SHOW", 1);
        LLILLJJLI = enumC1354280lLW2;
        EnumC1354280lLW enumC1354280lLW3 = new EnumC1354280lLW("SHOW", 2);
        LLILLL = enumC1354280lLW3;
        EnumC1354280lLW enumC1354280lLW4 = new EnumC1354280lLW("WILL_HIDE", 3);
        LLILZ = enumC1354280lLW4;
        EnumC1354280lLW[] enumC1354280lLWArr = {enumC1354280lLW, enumC1354280lLW2, enumC1354280lLW3, enumC1354280lLW4};
        LLILZIL = enumC1354280lLWArr;
        new C2254308sP(enumC1354280lLWArr);
    }

    public static EnumC1354280lLW[] values() {
        return (EnumC1354280lLW[]) LLILZIL.clone();
    }

    public static EnumC1354280lLW valueOf(String str) {
        return (EnumC1354280lLW) C08FF.LIZ(EnumC1354280lLW.class, str);
    }

    public EnumC1354280lLW(String str, int i) {
    }
}
