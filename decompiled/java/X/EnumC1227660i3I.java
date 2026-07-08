package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i3I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1227660i3I {
    public static final EnumC1227660i3I FINISH_CREATE_PANEL;
    public static final EnumC1227660i3I FINISH_LOAD_DATA;
    public static final EnumC1227660i3I FINISH_RENDER_DATA;
    public static final /* synthetic */ EnumC1227660i3I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1227660i3I READY_TO_CREATE_PANEL;
    public static final EnumC1227660i3I READY_TO_LOAD_DATA;
    public static final EnumC1227660i3I READY_TO_RENDER_DATA;

    public static InterfaceC2044707zh<EnumC1227660i3I> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1227660i3I enumC1227660i3I = new EnumC1227660i3I("READY_TO_LOAD_DATA", 0);
        READY_TO_LOAD_DATA = enumC1227660i3I;
        EnumC1227660i3I enumC1227660i3I2 = new EnumC1227660i3I("FINISH_LOAD_DATA", 1);
        FINISH_LOAD_DATA = enumC1227660i3I2;
        EnumC1227660i3I enumC1227660i3I3 = new EnumC1227660i3I("READY_TO_CREATE_PANEL", 2);
        READY_TO_CREATE_PANEL = enumC1227660i3I3;
        EnumC1227660i3I enumC1227660i3I4 = new EnumC1227660i3I("FINISH_CREATE_PANEL", 3);
        FINISH_CREATE_PANEL = enumC1227660i3I4;
        EnumC1227660i3I enumC1227660i3I5 = new EnumC1227660i3I("READY_TO_RENDER_DATA", 4);
        READY_TO_RENDER_DATA = enumC1227660i3I5;
        EnumC1227660i3I enumC1227660i3I6 = new EnumC1227660i3I("FINISH_RENDER_DATA", 5);
        FINISH_RENDER_DATA = enumC1227660i3I6;
        EnumC1227660i3I[] enumC1227660i3IArr = {enumC1227660i3I, enumC1227660i3I2, enumC1227660i3I3, enumC1227660i3I4, enumC1227660i3I5, enumC1227660i3I6};
        LL = enumC1227660i3IArr;
        LLILLJJLI = new C2254308sP(enumC1227660i3IArr);
    }

    public static EnumC1227660i3I[] values() {
        return (EnumC1227660i3I[]) LL.clone();
    }

    public static EnumC1227660i3I valueOf(String str) {
        return (EnumC1227660i3I) C08FF.LIZ(EnumC1227660i3I.class, str);
    }

    public EnumC1227660i3I(String str, int i) {
    }
}
