package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1654620t9w {
    public static final EnumC1654620t9w AI_ALIVE;
    public static final EnumC1654620t9w AI_THEATER;
    public static final EnumC1654620t9w ANCHOR_FILTER;
    public static final EnumC1654620t9w ANCHOR_LAYOUT;
    public static final EnumC1654620t9w GREEN_SCREEN;
    public static final EnumC1654620t9w LAYOUT;
    public static final /* synthetic */ EnumC1654620t9w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1654620t9w NONE;
    public static final EnumC1654620t9w TEXT_MODE;

    public static InterfaceC2044707zh<EnumC1654620t9w> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1654620t9w enumC1654620t9w = new EnumC1654620t9w("NONE", 0);
        NONE = enumC1654620t9w;
        EnumC1654620t9w enumC1654620t9w2 = new EnumC1654620t9w("AI_THEATER", 1);
        AI_THEATER = enumC1654620t9w2;
        EnumC1654620t9w enumC1654620t9w3 = new EnumC1654620t9w("AI_ALIVE", 2);
        AI_ALIVE = enumC1654620t9w3;
        EnumC1654620t9w enumC1654620t9w4 = new EnumC1654620t9w("ANCHOR_LAYOUT", 3);
        ANCHOR_LAYOUT = enumC1654620t9w4;
        EnumC1654620t9w enumC1654620t9w5 = new EnumC1654620t9w("ANCHOR_FILTER", 4);
        ANCHOR_FILTER = enumC1654620t9w5;
        EnumC1654620t9w enumC1654620t9w6 = new EnumC1654620t9w("LAYOUT", 5);
        LAYOUT = enumC1654620t9w6;
        EnumC1654620t9w enumC1654620t9w7 = new EnumC1654620t9w("GREEN_SCREEN", 6);
        GREEN_SCREEN = enumC1654620t9w7;
        EnumC1654620t9w enumC1654620t9w8 = new EnumC1654620t9w("TEXT_MODE", 7);
        TEXT_MODE = enumC1654620t9w8;
        EnumC1654620t9w[] enumC1654620t9wArr = {enumC1654620t9w, enumC1654620t9w2, enumC1654620t9w3, enumC1654620t9w4, enumC1654620t9w5, enumC1654620t9w6, enumC1654620t9w7, enumC1654620t9w8};
        LL = enumC1654620t9wArr;
        LLILLJJLI = new C2254308sP(enumC1654620t9wArr);
    }

    public static EnumC1654620t9w[] values() {
        return (EnumC1654620t9w[]) LL.clone();
    }

    public static EnumC1654620t9w valueOf(String str) {
        return (EnumC1654620t9w) C08FF.LIZ(EnumC1654620t9w.class, str);
    }

    public EnumC1654620t9w(String str, int i) {
    }
}
