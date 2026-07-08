package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC368330EcJ {
    public static final EnumC368330EcJ HIDE;
    public static final /* synthetic */ EnumC368330EcJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC368330EcJ WITHOUT_BORDER;
    public static final EnumC368330EcJ WITH_BORDER;

    public static InterfaceC2044707zh<EnumC368330EcJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC368330EcJ enumC368330EcJ = new EnumC368330EcJ("HIDE", 0);
        HIDE = enumC368330EcJ;
        EnumC368330EcJ enumC368330EcJ2 = new EnumC368330EcJ("WITH_BORDER", 1);
        WITH_BORDER = enumC368330EcJ2;
        EnumC368330EcJ enumC368330EcJ3 = new EnumC368330EcJ("WITHOUT_BORDER", 2);
        WITHOUT_BORDER = enumC368330EcJ3;
        EnumC368330EcJ[] enumC368330EcJArr = {enumC368330EcJ, enumC368330EcJ2, enumC368330EcJ3};
        LL = enumC368330EcJArr;
        LLILLJJLI = new C2254308sP(enumC368330EcJArr);
    }

    public static EnumC368330EcJ[] values() {
        return (EnumC368330EcJ[]) LL.clone();
    }

    public static EnumC368330EcJ valueOf(String str) {
        return (EnumC368330EcJ) C08FF.LIZ(EnumC368330EcJ.class, str);
    }

    public EnumC368330EcJ(String str, int i) {
    }
}
