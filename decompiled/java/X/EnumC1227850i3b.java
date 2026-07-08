package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1227850i3b {
    public static final EnumC1227850i3b FINISH_CREATE_PANEL;
    public static final EnumC1227850i3b FINISH_LOAD_DATA;
    public static final EnumC1227850i3b FINISH_RENDER_DATA;
    public static final /* synthetic */ EnumC1227850i3b[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1227850i3b READY_TO_CREATE_PANEL;
    public static final EnumC1227850i3b READY_TO_LOAD_DATA;
    public static final EnumC1227850i3b READY_TO_RENDER_DATA;

    public static InterfaceC2044707zh<EnumC1227850i3b> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1227850i3b enumC1227850i3b = new EnumC1227850i3b("READY_TO_CREATE_PANEL", 0);
        READY_TO_CREATE_PANEL = enumC1227850i3b;
        EnumC1227850i3b enumC1227850i3b2 = new EnumC1227850i3b("FINISH_CREATE_PANEL", 1);
        FINISH_CREATE_PANEL = enumC1227850i3b2;
        EnumC1227850i3b enumC1227850i3b3 = new EnumC1227850i3b("READY_TO_LOAD_DATA", 2);
        READY_TO_LOAD_DATA = enumC1227850i3b3;
        EnumC1227850i3b enumC1227850i3b4 = new EnumC1227850i3b("FINISH_LOAD_DATA", 3);
        FINISH_LOAD_DATA = enumC1227850i3b4;
        EnumC1227850i3b enumC1227850i3b5 = new EnumC1227850i3b("READY_TO_RENDER_DATA", 4);
        READY_TO_RENDER_DATA = enumC1227850i3b5;
        EnumC1227850i3b enumC1227850i3b6 = new EnumC1227850i3b("FINISH_RENDER_DATA", 5);
        FINISH_RENDER_DATA = enumC1227850i3b6;
        EnumC1227850i3b[] enumC1227850i3bArr = {enumC1227850i3b, enumC1227850i3b2, enumC1227850i3b3, enumC1227850i3b4, enumC1227850i3b5, enumC1227850i3b6};
        LL = enumC1227850i3bArr;
        LLILLJJLI = new C2254308sP(enumC1227850i3bArr);
    }

    public static EnumC1227850i3b[] values() {
        return (EnumC1227850i3b[]) LL.clone();
    }

    public static EnumC1227850i3b valueOf(String str) {
        return (EnumC1227850i3b) C08FF.LIZ(EnumC1227850i3b.class, str);
    }

    public EnumC1227850i3b(String str, int i) {
    }
}
