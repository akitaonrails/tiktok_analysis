package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009Z, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009Z {
    public static final C009Z EFFECT_STICKER_NEW_WATERMARK;
    public static final C009Z EFFECT_STICKER_WATERMARK;
    public static final C009Z LIVE_COUNT_DOWN_STICKER;
    public static final /* synthetic */ C009Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009Z NORMAL_ALLOW_SWITCH;

    public static InterfaceC2044707zh<C009Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009Z c009z = new C009Z("LIVE_COUNT_DOWN_STICKER", 0);
        LIVE_COUNT_DOWN_STICKER = c009z;
        C009Z c009z2 = new C009Z("EFFECT_STICKER_WATERMARK", 1);
        EFFECT_STICKER_WATERMARK = c009z2;
        C009Z c009z3 = new C009Z("EFFECT_STICKER_NEW_WATERMARK", 2);
        EFFECT_STICKER_NEW_WATERMARK = c009z3;
        C009Z c009z4 = new C009Z("NORMAL_ALLOW_SWITCH", 3);
        NORMAL_ALLOW_SWITCH = c009z4;
        C009Z[] c009zArr = {c009z, c009z2, c009z3, c009z4};
        LL = c009zArr;
        LLILLJJLI = new C2254308sP(c009zArr);
    }

    public static C009Z[] values() {
        return (C009Z[]) LL.clone();
    }

    public static C009Z valueOf(String str) {
        return (C009Z) C08FF.LIZ(C009Z.class, str);
    }

    public C009Z(String str, int i) {
    }
}
