package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC509330JyF {
    public static final EnumC509330JyF GOOGLE_PLAY;
    public static final /* synthetic */ EnumC509330JyF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC509330JyF TPL_LIST;

    public static InterfaceC2044707zh<EnumC509330JyF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC509330JyF enumC509330JyF = new EnumC509330JyF("TPL_LIST", 0);
        TPL_LIST = enumC509330JyF;
        EnumC509330JyF enumC509330JyF2 = new EnumC509330JyF("GOOGLE_PLAY", 1);
        GOOGLE_PLAY = enumC509330JyF2;
        EnumC509330JyF[] enumC509330JyFArr = {enumC509330JyF, enumC509330JyF2};
        LL = enumC509330JyFArr;
        LLILLJJLI = new C2254308sP(enumC509330JyFArr);
    }

    public static EnumC509330JyF[] values() {
        return (EnumC509330JyF[]) LL.clone();
    }

    public static EnumC509330JyF valueOf(String str) {
        return (EnumC509330JyF) C08FF.LIZ(EnumC509330JyF.class, str);
    }

    public EnumC509330JyF(String str, int i) {
    }
}
