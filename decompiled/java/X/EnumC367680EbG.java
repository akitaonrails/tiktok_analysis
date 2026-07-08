package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC367680EbG {
    public static final EnumC367680EbG ADJUST;
    public static final EnumC367680EbG BEAUTY;
    public static final EnumC367680EbG FILTER;
    public static final /* synthetic */ EnumC367680EbG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC367680EbG NONE;
    public static final EnumC367680EbG VIDEO_ANIM;

    public static InterfaceC2044707zh<EnumC367680EbG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC367680EbG enumC367680EbG = new EnumC367680EbG("NONE", 0);
        NONE = enumC367680EbG;
        EnumC367680EbG enumC367680EbG2 = new EnumC367680EbG("FILTER", 1);
        FILTER = enumC367680EbG2;
        EnumC367680EbG enumC367680EbG3 = new EnumC367680EbG("ADJUST", 2);
        ADJUST = enumC367680EbG3;
        EnumC367680EbG enumC367680EbG4 = new EnumC367680EbG("BEAUTY", 3);
        BEAUTY = enumC367680EbG4;
        EnumC367680EbG enumC367680EbG5 = new EnumC367680EbG("VIDEO_ANIM", 4);
        VIDEO_ANIM = enumC367680EbG5;
        EnumC367680EbG[] enumC367680EbGArr = {enumC367680EbG, enumC367680EbG2, enumC367680EbG3, enumC367680EbG4, enumC367680EbG5};
        LL = enumC367680EbGArr;
        LLILLJJLI = new C2254308sP(enumC367680EbGArr);
    }

    public static EnumC367680EbG[] values() {
        return (EnumC367680EbG[]) LL.clone();
    }

    public static EnumC367680EbG valueOf(String str) {
        return (EnumC367680EbG) C08FF.LIZ(EnumC367680EbG.class, str);
    }

    public EnumC367680EbG(String str, int i) {
    }
}
