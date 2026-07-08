package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1579440rCg {
    public static final EnumC1579440rCg CLICK_BUBBLE;
    public static final EnumC1579440rCg DRAG_DOWN;
    public static final EnumC1579440rCg FIRST_SHOW;
    public static final /* synthetic */ EnumC1579440rCg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1579440rCg SIMPLE_TOUCH;

    public static InterfaceC2044707zh<EnumC1579440rCg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1579440rCg enumC1579440rCg = new EnumC1579440rCg("FIRST_SHOW", 0);
        FIRST_SHOW = enumC1579440rCg;
        EnumC1579440rCg enumC1579440rCg2 = new EnumC1579440rCg("CLICK_BUBBLE", 1);
        CLICK_BUBBLE = enumC1579440rCg2;
        EnumC1579440rCg enumC1579440rCg3 = new EnumC1579440rCg("DRAG_DOWN", 2);
        DRAG_DOWN = enumC1579440rCg3;
        EnumC1579440rCg enumC1579440rCg4 = new EnumC1579440rCg("SIMPLE_TOUCH", 3);
        SIMPLE_TOUCH = enumC1579440rCg4;
        EnumC1579440rCg[] enumC1579440rCgArr = {enumC1579440rCg, enumC1579440rCg2, enumC1579440rCg3, enumC1579440rCg4};
        LL = enumC1579440rCgArr;
        LLILLJJLI = new C2254308sP(enumC1579440rCgArr);
    }

    public static EnumC1579440rCg[] values() {
        return (EnumC1579440rCg[]) LL.clone();
    }

    public static EnumC1579440rCg valueOf(String str) {
        return (EnumC1579440rCg) C08FF.LIZ(EnumC1579440rCg.class, str);
    }

    public EnumC1579440rCg(String str, int i) {
    }
}
