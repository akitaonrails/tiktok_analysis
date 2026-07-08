package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07r2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1991007r2 {
    public static final EnumC1991007r2 ADD_POI_ACCOMPLISHED_EVENT;
    public static final EnumC1991007r2 ADD_POI_FAILED_EVENT;
    public static final /* synthetic */ EnumC1991007r2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1991007r2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1991007r2 enumC1991007r2 = new EnumC1991007r2("ADD_POI_ACCOMPLISHED_EVENT", 0);
        ADD_POI_ACCOMPLISHED_EVENT = enumC1991007r2;
        EnumC1991007r2 enumC1991007r22 = new EnumC1991007r2("ADD_POI_FAILED_EVENT", 1);
        ADD_POI_FAILED_EVENT = enumC1991007r22;
        EnumC1991007r2[] enumC1991007r2Arr = {enumC1991007r2, enumC1991007r22};
        LL = enumC1991007r2Arr;
        LLILLJJLI = new C2254308sP(enumC1991007r2Arr);
    }

    public static EnumC1991007r2[] values() {
        return (EnumC1991007r2[]) LL.clone();
    }

    public static EnumC1991007r2 valueOf(String str) {
        return (EnumC1991007r2) C08FF.LIZ(EnumC1991007r2.class, str);
    }

    public EnumC1991007r2(String str, int i) {
    }
}
