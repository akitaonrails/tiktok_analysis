package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1410805fe {
    public static final EnumC1410805fe FAIL;
    public static final /* synthetic */ EnumC1410805fe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1410805fe LOADING;
    public static final EnumC1410805fe SUCCESS;

    public static InterfaceC2044707zh<EnumC1410805fe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1410805fe enumC1410805fe = new EnumC1410805fe("LOADING", 0);
        LOADING = enumC1410805fe;
        EnumC1410805fe enumC1410805fe2 = new EnumC1410805fe("FAIL", 1);
        FAIL = enumC1410805fe2;
        EnumC1410805fe enumC1410805fe3 = new EnumC1410805fe("SUCCESS", 2);
        SUCCESS = enumC1410805fe3;
        EnumC1410805fe[] enumC1410805feArr = {enumC1410805fe, enumC1410805fe2, enumC1410805fe3};
        LL = enumC1410805feArr;
        LLILLJJLI = new C2254308sP(enumC1410805feArr);
    }

    public static EnumC1410805fe[] values() {
        return (EnumC1410805fe[]) LL.clone();
    }

    public static EnumC1410805fe valueOf(String str) {
        return (EnumC1410805fe) C08FF.LIZ(EnumC1410805fe.class, str);
    }

    public EnumC1410805fe(String str, int i) {
    }
}
