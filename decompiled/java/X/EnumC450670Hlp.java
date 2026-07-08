package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC450670Hlp {
    public static final EnumC450670Hlp LARGE;
    public static final /* synthetic */ EnumC450670Hlp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC450670Hlp MEDIUM;
    public static final EnumC450670Hlp SMALL;

    public static InterfaceC2044707zh<EnumC450670Hlp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC450670Hlp enumC450670Hlp = new EnumC450670Hlp("SMALL", 0);
        SMALL = enumC450670Hlp;
        EnumC450670Hlp enumC450670Hlp2 = new EnumC450670Hlp("MEDIUM", 1);
        MEDIUM = enumC450670Hlp2;
        EnumC450670Hlp enumC450670Hlp3 = new EnumC450670Hlp("LARGE", 2);
        LARGE = enumC450670Hlp3;
        EnumC450670Hlp[] enumC450670HlpArr = {enumC450670Hlp, enumC450670Hlp2, enumC450670Hlp3};
        LL = enumC450670HlpArr;
        LLILLJJLI = new C2254308sP(enumC450670HlpArr);
    }

    public static EnumC450670Hlp[] values() {
        return (EnumC450670Hlp[]) LL.clone();
    }

    public static EnumC450670Hlp valueOf(String str) {
        return (EnumC450670Hlp) C08FF.LIZ(EnumC450670Hlp.class, str);
    }

    public EnumC450670Hlp(String str, int i) {
    }
}
