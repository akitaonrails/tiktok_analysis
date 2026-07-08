package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC441840HUg {
    public static final EnumC441840HUg AI_SELF;
    public static final EnumC441840HUg EMOJI;
    public static final EnumC441840HUg IMAGINE_ENTRANCE;
    public static final EnumC441840HUg IMAGINE_LOADING;
    public static final /* synthetic */ EnumC441840HUg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC441840HUg RED_DOT;

    public static InterfaceC2044707zh<EnumC441840HUg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC441840HUg enumC441840HUg = new EnumC441840HUg("EMOJI", 0);
        EMOJI = enumC441840HUg;
        EnumC441840HUg enumC441840HUg2 = new EnumC441840HUg("AI_SELF", 1);
        AI_SELF = enumC441840HUg2;
        EnumC441840HUg enumC441840HUg3 = new EnumC441840HUg("RED_DOT", 2);
        RED_DOT = enumC441840HUg3;
        EnumC441840HUg enumC441840HUg4 = new EnumC441840HUg("IMAGINE_LOADING", 3);
        IMAGINE_LOADING = enumC441840HUg4;
        EnumC441840HUg enumC441840HUg5 = new EnumC441840HUg("IMAGINE_ENTRANCE", 4);
        IMAGINE_ENTRANCE = enumC441840HUg5;
        EnumC441840HUg[] enumC441840HUgArr = {enumC441840HUg, enumC441840HUg2, enumC441840HUg3, enumC441840HUg4, enumC441840HUg5};
        LL = enumC441840HUgArr;
        LLILLJJLI = new C2254308sP(enumC441840HUgArr);
    }

    public static EnumC441840HUg[] values() {
        return (EnumC441840HUg[]) LL.clone();
    }

    public static EnumC441840HUg valueOf(String str) {
        return (EnumC441840HUg) C08FF.LIZ(EnumC441840HUg.class, str);
    }

    public EnumC441840HUg(String str, int i) {
    }
}
