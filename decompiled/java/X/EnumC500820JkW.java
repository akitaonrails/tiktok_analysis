package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC500820JkW {
    public static final EnumC500820JkW LL;
    public static final EnumC500820JkW LLILLJJLI;
    public static final /* synthetic */ EnumC500820JkW[] LLILLL;

    static {
        EnumC500820JkW enumC500820JkW = new EnumC500820JkW("PRIMARY", 0);
        LL = enumC500820JkW;
        EnumC500820JkW enumC500820JkW2 = new EnumC500820JkW("LINK", 1);
        LLILLJJLI = enumC500820JkW2;
        EnumC500820JkW[] enumC500820JkWArr = {enumC500820JkW, enumC500820JkW2};
        LLILLL = enumC500820JkWArr;
        new C2254308sP(enumC500820JkWArr);
    }

    public static EnumC500820JkW[] values() {
        return (EnumC500820JkW[]) LLILLL.clone();
    }

    public static EnumC500820JkW valueOf(String str) {
        return (EnumC500820JkW) C08FF.LIZ(EnumC500820JkW.class, str);
    }

    public EnumC500820JkW(String str, int i) {
    }
}
