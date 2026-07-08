package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fVF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1129670fVF {
    public static final EnumC1129670fVF CACHE_FIRST;
    public static final EnumC1129670fVF CACHE_ONLY;
    public static final /* synthetic */ EnumC1129670fVF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1129670fVF NETWORK_ONLY;

    public static InterfaceC2044707zh<EnumC1129670fVF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1129670fVF enumC1129670fVF = new EnumC1129670fVF("CACHE_ONLY", 0);
        CACHE_ONLY = enumC1129670fVF;
        EnumC1129670fVF enumC1129670fVF2 = new EnumC1129670fVF("CACHE_FIRST", 1);
        CACHE_FIRST = enumC1129670fVF2;
        EnumC1129670fVF enumC1129670fVF3 = new EnumC1129670fVF("NETWORK_ONLY", 2);
        NETWORK_ONLY = enumC1129670fVF3;
        EnumC1129670fVF[] enumC1129670fVFArr = {enumC1129670fVF, enumC1129670fVF2, enumC1129670fVF3};
        LL = enumC1129670fVFArr;
        LLILLJJLI = new C2254308sP(enumC1129670fVFArr);
    }

    public static EnumC1129670fVF[] values() {
        return (EnumC1129670fVF[]) LL.clone();
    }

    public static EnumC1129670fVF valueOf(String str) {
        return (EnumC1129670fVF) C08FF.LIZ(EnumC1129670fVF.class, str);
    }

    public EnumC1129670fVF(String str, int i) {
    }
}
