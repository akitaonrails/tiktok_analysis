package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FAO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FAO {
    public static final C0FAO EFFECT;
    public static final C0FAO EFFECT_MODEL;
    public static final C0FAO FONT;
    public static final /* synthetic */ C0FAO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FAO MUSIC;
    public static final C0FAO MV;

    public static InterfaceC2044707zh<C0FAO> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FAO c0fao = new C0FAO("EFFECT", 0);
        EFFECT = c0fao;
        C0FAO c0fao2 = new C0FAO("EFFECT_MODEL", 1);
        EFFECT_MODEL = c0fao2;
        C0FAO c0fao3 = new C0FAO("FONT", 2);
        FONT = c0fao3;
        C0FAO c0fao4 = new C0FAO("MV", 3);
        MV = c0fao4;
        C0FAO c0fao5 = new C0FAO("MUSIC", 4);
        MUSIC = c0fao5;
        C0FAO[] c0faoArr = {c0fao, c0fao2, c0fao3, c0fao4, c0fao5};
        LL = c0faoArr;
        LLILLJJLI = new C2254308sP(c0faoArr);
    }

    public static C0FAO[] values() {
        return (C0FAO[]) LL.clone();
    }

    public static C0FAO valueOf(String str) {
        return (C0FAO) C08FF.LIZ(C0FAO.class, str);
    }

    public C0FAO(String str, int i) {
    }
}
