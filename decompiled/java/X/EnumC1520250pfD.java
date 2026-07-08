package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1520250pfD {
    public static final EnumC1520250pfD BLOCK_LIST;
    public static final EnumC1520250pfD CATCH_EXCEPTION;
    public static final EnumC1520250pfD EVENT_REPEATED;
    public static final EnumC1520250pfD HOST_VIEW_DESTROYED;
    public static final EnumC1520250pfD INVALID_CASE;
    public static final /* synthetic */ EnumC1520250pfD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1520250pfD NOT_ATTACHED;
    public static final EnumC1520250pfD PARAM_EXCEPTION;
    public static final EnumC1520250pfD SWITCH_OFF;

    public static InterfaceC2044707zh<EnumC1520250pfD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1520250pfD enumC1520250pfD = new EnumC1520250pfD("SWITCH_OFF", 0);
        SWITCH_OFF = enumC1520250pfD;
        EnumC1520250pfD enumC1520250pfD2 = new EnumC1520250pfD("PARAM_EXCEPTION", 1);
        PARAM_EXCEPTION = enumC1520250pfD2;
        EnumC1520250pfD enumC1520250pfD3 = new EnumC1520250pfD("CATCH_EXCEPTION", 2);
        CATCH_EXCEPTION = enumC1520250pfD3;
        EnumC1520250pfD enumC1520250pfD4 = new EnumC1520250pfD("EVENT_REPEATED", 3);
        EVENT_REPEATED = enumC1520250pfD4;
        EnumC1520250pfD enumC1520250pfD5 = new EnumC1520250pfD("INVALID_CASE", 4);
        INVALID_CASE = enumC1520250pfD5;
        EnumC1520250pfD enumC1520250pfD6 = new EnumC1520250pfD("HOST_VIEW_DESTROYED", 5);
        HOST_VIEW_DESTROYED = enumC1520250pfD6;
        EnumC1520250pfD enumC1520250pfD7 = new EnumC1520250pfD("BLOCK_LIST", 6);
        BLOCK_LIST = enumC1520250pfD7;
        EnumC1520250pfD enumC1520250pfD8 = new EnumC1520250pfD("NOT_ATTACHED", 7);
        NOT_ATTACHED = enumC1520250pfD8;
        EnumC1520250pfD[] enumC1520250pfDArr = {enumC1520250pfD, enumC1520250pfD2, enumC1520250pfD3, enumC1520250pfD4, enumC1520250pfD5, enumC1520250pfD6, enumC1520250pfD7, enumC1520250pfD8};
        LL = enumC1520250pfDArr;
        LLILLJJLI = new C2254308sP(enumC1520250pfDArr);
    }

    public static EnumC1520250pfD[] values() {
        return (EnumC1520250pfD[]) LL.clone();
    }

    public static EnumC1520250pfD valueOf(String str) {
        return (EnumC1520250pfD) C08FF.LIZ(EnumC1520250pfD.class, str);
    }

    public EnumC1520250pfD(String str, int i) {
    }
}
