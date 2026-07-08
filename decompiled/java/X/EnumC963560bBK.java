package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bBK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC963560bBK {
    public static final EnumC963560bBK ANCHOR;
    public static final EnumC963560bBK AUDIENCE;
    public static final /* synthetic */ EnumC963560bBK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC963560bBK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC963560bBK enumC963560bBK = new EnumC963560bBK("ANCHOR", 0);
        ANCHOR = enumC963560bBK;
        EnumC963560bBK enumC963560bBK2 = new EnumC963560bBK("AUDIENCE", 1);
        AUDIENCE = enumC963560bBK2;
        EnumC963560bBK[] enumC963560bBKArr = {enumC963560bBK, enumC963560bBK2};
        LL = enumC963560bBKArr;
        LLILLJJLI = new C2254308sP(enumC963560bBKArr);
    }

    public static EnumC963560bBK[] values() {
        return (EnumC963560bBK[]) LL.clone();
    }

    public static EnumC963560bBK valueOf(String str) {
        return (EnumC963560bBK) C08FF.LIZ(EnumC963560bBK.class, str);
    }

    public EnumC963560bBK(String str, int i) {
    }
}
