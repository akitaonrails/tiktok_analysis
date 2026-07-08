package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC732770Sol {
    public static final EnumC732770Sol EXTERNAL_SHARE;
    public static final EnumC732770Sol INNER_SHARE;
    public static final /* synthetic */ EnumC732770Sol[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC732770Sol OTHER;

    public static InterfaceC2044707zh<EnumC732770Sol> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC732770Sol enumC732770Sol = new EnumC732770Sol("INNER_SHARE", 0);
        INNER_SHARE = enumC732770Sol;
        EnumC732770Sol enumC732770Sol2 = new EnumC732770Sol("EXTERNAL_SHARE", 1);
        EXTERNAL_SHARE = enumC732770Sol2;
        EnumC732770Sol enumC732770Sol3 = new EnumC732770Sol("OTHER", 2);
        OTHER = enumC732770Sol3;
        EnumC732770Sol[] enumC732770SolArr = {enumC732770Sol, enumC732770Sol2, enumC732770Sol3};
        LL = enumC732770SolArr;
        LLILLJJLI = new C2254308sP(enumC732770SolArr);
    }

    public static EnumC732770Sol[] values() {
        return (EnumC732770Sol[]) LL.clone();
    }

    public static EnumC732770Sol valueOf(String str) {
        return (EnumC732770Sol) C08FF.LIZ(EnumC732770Sol.class, str);
    }

    public EnumC732770Sol(String str, int i) {
    }
}
