package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586520MzS {
    public static final /* synthetic */ EnumC586520MzS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586520MzS TYPE_HISTORY;
    public static final EnumC586520MzS TYPE_TEXT;

    public static InterfaceC2044707zh<EnumC586520MzS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586520MzS enumC586520MzS = new EnumC586520MzS("TYPE_TEXT", 0);
        TYPE_TEXT = enumC586520MzS;
        EnumC586520MzS enumC586520MzS2 = new EnumC586520MzS("TYPE_HISTORY", 1);
        TYPE_HISTORY = enumC586520MzS2;
        EnumC586520MzS[] enumC586520MzSArr = {enumC586520MzS, enumC586520MzS2};
        LL = enumC586520MzSArr;
        LLILLJJLI = new C2254308sP(enumC586520MzSArr);
    }

    public static EnumC586520MzS[] values() {
        return (EnumC586520MzS[]) LL.clone();
    }

    public static EnumC586520MzS valueOf(String str) {
        return (EnumC586520MzS) C08FF.LIZ(EnumC586520MzS.class, str);
    }

    public EnumC586520MzS(String str, int i) {
    }
}
