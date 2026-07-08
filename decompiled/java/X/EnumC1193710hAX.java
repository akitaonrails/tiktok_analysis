package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1193710hAX {
    public static final EnumC1193710hAX END_COMPONENT_CREATE;
    public static final EnumC1193710hAX END_LCP_RENDER;
    public static final EnumC1193710hAX END_NETWORK_FAIL;
    public static final EnumC1193710hAX END_NETWORK_SUCCESS;
    public static final EnumC1193710hAX END_PAGE_OPEN;
    public static final EnumC1193710hAX END_RENDER;
    public static final /* synthetic */ EnumC1193710hAX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1193710hAX NODE_CREATE;
    public static final EnumC1193710hAX PAGE_EXIT;
    public static final EnumC1193710hAX START_COMPONENT_CREATE;
    public static final EnumC1193710hAX START_NETWORK;
    public static final EnumC1193710hAX START_PAGE_OPEN;

    public static InterfaceC2044707zh<EnumC1193710hAX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1193710hAX enumC1193710hAX = new EnumC1193710hAX("START_PAGE_OPEN", 0);
        START_PAGE_OPEN = enumC1193710hAX;
        EnumC1193710hAX enumC1193710hAX2 = new EnumC1193710hAX("END_PAGE_OPEN", 1);
        END_PAGE_OPEN = enumC1193710hAX2;
        EnumC1193710hAX enumC1193710hAX3 = new EnumC1193710hAX("START_NETWORK", 2);
        START_NETWORK = enumC1193710hAX3;
        EnumC1193710hAX enumC1193710hAX4 = new EnumC1193710hAX("END_NETWORK_SUCCESS", 3);
        END_NETWORK_SUCCESS = enumC1193710hAX4;
        EnumC1193710hAX enumC1193710hAX5 = new EnumC1193710hAX("END_NETWORK_FAIL", 4);
        END_NETWORK_FAIL = enumC1193710hAX5;
        EnumC1193710hAX enumC1193710hAX6 = new EnumC1193710hAX("END_RENDER", 5);
        END_RENDER = enumC1193710hAX6;
        EnumC1193710hAX enumC1193710hAX7 = new EnumC1193710hAX("END_LCP_RENDER", 6);
        END_LCP_RENDER = enumC1193710hAX7;
        EnumC1193710hAX enumC1193710hAX8 = new EnumC1193710hAX("PAGE_EXIT", 7);
        PAGE_EXIT = enumC1193710hAX8;
        EnumC1193710hAX enumC1193710hAX9 = new EnumC1193710hAX("NODE_CREATE", 8);
        NODE_CREATE = enumC1193710hAX9;
        EnumC1193710hAX enumC1193710hAX10 = new EnumC1193710hAX("START_COMPONENT_CREATE", 9);
        START_COMPONENT_CREATE = enumC1193710hAX10;
        EnumC1193710hAX enumC1193710hAX11 = new EnumC1193710hAX("END_COMPONENT_CREATE", 10);
        END_COMPONENT_CREATE = enumC1193710hAX11;
        EnumC1193710hAX[] enumC1193710hAXArr = {enumC1193710hAX, enumC1193710hAX2, enumC1193710hAX3, enumC1193710hAX4, enumC1193710hAX5, enumC1193710hAX6, enumC1193710hAX7, enumC1193710hAX8, enumC1193710hAX9, enumC1193710hAX10, enumC1193710hAX11};
        LL = enumC1193710hAXArr;
        LLILLJJLI = new C2254308sP(enumC1193710hAXArr);
    }

    public static EnumC1193710hAX[] values() {
        return (EnumC1193710hAX[]) LL.clone();
    }

    public static EnumC1193710hAX valueOf(String str) {
        return (EnumC1193710hAX) C08FF.LIZ(EnumC1193710hAX.class, str);
    }

    public EnumC1193710hAX(String str, int i) {
    }
}
