package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1038090d7X {
    public static final /* synthetic */ EnumC1038090d7X[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1038090d7X TITLE;
    public static final EnumC1038090d7X URL;

    public static InterfaceC2044707zh<EnumC1038090d7X> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1038090d7X enumC1038090d7X = new EnumC1038090d7X("URL", 0);
        URL = enumC1038090d7X;
        EnumC1038090d7X enumC1038090d7X2 = new EnumC1038090d7X("TITLE", 1);
        TITLE = enumC1038090d7X2;
        EnumC1038090d7X[] enumC1038090d7XArr = {enumC1038090d7X, enumC1038090d7X2};
        LL = enumC1038090d7XArr;
        LLILLJJLI = new C2254308sP(enumC1038090d7XArr);
    }

    public static EnumC1038090d7X[] values() {
        return (EnumC1038090d7X[]) LL.clone();
    }

    public static EnumC1038090d7X valueOf(String str) {
        return (EnumC1038090d7X) C08FF.LIZ(EnumC1038090d7X.class, str);
    }

    public EnumC1038090d7X(String str, int i) {
    }
}
