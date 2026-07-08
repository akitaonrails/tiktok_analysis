package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ubc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1710220ubc {
    public static final EnumC1710220ubc BACK_TO_PREVIOUS;
    public static final EnumC1710220ubc DISMISS;
    public static final /* synthetic */ EnumC1710220ubc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1710220ubc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1710220ubc enumC1710220ubc = new EnumC1710220ubc("DISMISS", 0);
        DISMISS = enumC1710220ubc;
        EnumC1710220ubc enumC1710220ubc2 = new EnumC1710220ubc("BACK_TO_PREVIOUS", 1);
        BACK_TO_PREVIOUS = enumC1710220ubc2;
        EnumC1710220ubc[] enumC1710220ubcArr = {enumC1710220ubc, enumC1710220ubc2};
        LL = enumC1710220ubcArr;
        LLILLJJLI = new C2254308sP(enumC1710220ubcArr);
    }

    public static EnumC1710220ubc[] values() {
        return (EnumC1710220ubc[]) LL.clone();
    }

    public static EnumC1710220ubc valueOf(String str) {
        return (EnumC1710220ubc) C08FF.LIZ(EnumC1710220ubc.class, str);
    }

    public EnumC1710220ubc(String str, int i) {
    }
}
