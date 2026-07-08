package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1753520vjS {
    public static final EnumC1753520vjS BUBBLE_CLICK;
    public static final EnumC1753520vjS BUBBLE_SHOW;
    public static final /* synthetic */ EnumC1753520vjS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1753520vjS TAG_CLICK;
    public static final EnumC1753520vjS TAG_SHOW;
    public static final EnumC1753520vjS UNKNOWN;

    public static InterfaceC2044707zh<EnumC1753520vjS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1753520vjS enumC1753520vjS = new EnumC1753520vjS("UNKNOWN", 0);
        UNKNOWN = enumC1753520vjS;
        EnumC1753520vjS enumC1753520vjS2 = new EnumC1753520vjS("BUBBLE_SHOW", 1);
        BUBBLE_SHOW = enumC1753520vjS2;
        EnumC1753520vjS enumC1753520vjS3 = new EnumC1753520vjS("BUBBLE_CLICK", 2);
        BUBBLE_CLICK = enumC1753520vjS3;
        EnumC1753520vjS enumC1753520vjS4 = new EnumC1753520vjS("TAG_SHOW", 3);
        TAG_SHOW = enumC1753520vjS4;
        EnumC1753520vjS enumC1753520vjS5 = new EnumC1753520vjS("TAG_CLICK", 4);
        TAG_CLICK = enumC1753520vjS5;
        EnumC1753520vjS[] enumC1753520vjSArr = {enumC1753520vjS, enumC1753520vjS2, enumC1753520vjS3, enumC1753520vjS4, enumC1753520vjS5};
        LL = enumC1753520vjSArr;
        LLILLJJLI = new C2254308sP(enumC1753520vjSArr);
    }

    public static EnumC1753520vjS[] values() {
        return (EnumC1753520vjS[]) LL.clone();
    }

    public static EnumC1753520vjS valueOf(String str) {
        return (EnumC1753520vjS) C08FF.LIZ(EnumC1753520vjS.class, str);
    }

    public EnumC1753520vjS(String str, int i) {
    }
}
