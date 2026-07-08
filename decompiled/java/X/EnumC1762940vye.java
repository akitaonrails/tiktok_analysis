package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1762940vye {
    public static final EnumC1762940vye LL;
    public static final EnumC1762940vye LLILLJJLI;
    public static final EnumC1762940vye LLILLL;
    public static final /* synthetic */ EnumC1762940vye[] LLILZ;

    static {
        EnumC1762940vye enumC1762940vye = new EnumC1762940vye("ONLY_HEAD", 0);
        LL = enumC1762940vye;
        EnumC1762940vye enumC1762940vye2 = new EnumC1762940vye("ONLY_TAIL", 1);
        LLILLJJLI = enumC1762940vye2;
        EnumC1762940vye enumC1762940vye3 = new EnumC1762940vye("BOTH_OR_NONE", 2);
        LLILLL = enumC1762940vye3;
        EnumC1762940vye[] enumC1762940vyeArr = {enumC1762940vye, enumC1762940vye2, enumC1762940vye3};
        LLILZ = enumC1762940vyeArr;
        new C2254308sP(enumC1762940vyeArr);
    }

    public static EnumC1762940vye[] values() {
        return (EnumC1762940vye[]) LLILZ.clone();
    }

    public static EnumC1762940vye valueOf(String str) {
        return (EnumC1762940vye) C08FF.LIZ(EnumC1762940vye.class, str);
    }

    public EnumC1762940vye(String str, int i) {
    }
}
