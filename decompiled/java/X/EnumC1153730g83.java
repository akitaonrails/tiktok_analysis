package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g83, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153730g83 {
    public static final EnumC1153730g83 DEMO_TASK_GROUP;
    public static final /* synthetic */ EnumC1153730g83[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153730g83 MAIN_PAGE_INIT;
    public static final EnumC1153730g83 MAIN_PAGE_ONLINE_RENDER;

    public static InterfaceC2044707zh<EnumC1153730g83> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153730g83 enumC1153730g83 = new EnumC1153730g83("MAIN_PAGE_INIT", 0);
        MAIN_PAGE_INIT = enumC1153730g83;
        EnumC1153730g83 enumC1153730g832 = new EnumC1153730g83("MAIN_PAGE_ONLINE_RENDER", 1);
        MAIN_PAGE_ONLINE_RENDER = enumC1153730g832;
        EnumC1153730g83 enumC1153730g833 = new EnumC1153730g83("DEMO_TASK_GROUP", 2);
        DEMO_TASK_GROUP = enumC1153730g833;
        EnumC1153730g83[] enumC1153730g83Arr = {enumC1153730g83, enumC1153730g832, enumC1153730g833};
        LL = enumC1153730g83Arr;
        LLILLJJLI = new C2254308sP(enumC1153730g83Arr);
    }

    public static EnumC1153730g83[] values() {
        return (EnumC1153730g83[]) LL.clone();
    }

    public static EnumC1153730g83 valueOf(String str) {
        return (EnumC1153730g83) C08FF.LIZ(EnumC1153730g83.class, str);
    }

    public EnumC1153730g83(String str, int i) {
    }
}
