package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584570MwJ {
    public static final EnumC584570MwJ AUTO_SCROLL_STATE_PAUSE;
    public static final EnumC584570MwJ AUTO_SCROLL_STATE_START;
    public static final EnumC584570MwJ AUTO_SCROLL_STATE_STOP;
    public static final /* synthetic */ EnumC584570MwJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC584570MwJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584570MwJ enumC584570MwJ = new EnumC584570MwJ("AUTO_SCROLL_STATE_START", 0);
        AUTO_SCROLL_STATE_START = enumC584570MwJ;
        EnumC584570MwJ enumC584570MwJ2 = new EnumC584570MwJ("AUTO_SCROLL_STATE_PAUSE", 1);
        AUTO_SCROLL_STATE_PAUSE = enumC584570MwJ2;
        EnumC584570MwJ enumC584570MwJ3 = new EnumC584570MwJ("AUTO_SCROLL_STATE_STOP", 2);
        AUTO_SCROLL_STATE_STOP = enumC584570MwJ3;
        EnumC584570MwJ[] enumC584570MwJArr = {enumC584570MwJ, enumC584570MwJ2, enumC584570MwJ3};
        LL = enumC584570MwJArr;
        LLILLJJLI = new C2254308sP(enumC584570MwJArr);
    }

    public static EnumC584570MwJ[] values() {
        return (EnumC584570MwJ[]) LL.clone();
    }

    public static EnumC584570MwJ valueOf(String str) {
        return (EnumC584570MwJ) C08FF.LIZ(EnumC584570MwJ.class, str);
    }

    public EnumC584570MwJ(String str, int i) {
    }
}
