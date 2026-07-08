package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781600wSk {
    public static final EnumC1781600wSk GROWTH_TASK_TYPE;
    public static final EnumC1781600wSk INSTANCE_TASK_TYPE;
    public static final /* synthetic */ EnumC1781600wSk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1781600wSk NONE;

    public static InterfaceC2044707zh<EnumC1781600wSk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1781600wSk enumC1781600wSk = new EnumC1781600wSk("GROWTH_TASK_TYPE", 0);
        GROWTH_TASK_TYPE = enumC1781600wSk;
        EnumC1781600wSk enumC1781600wSk2 = new EnumC1781600wSk("INSTANCE_TASK_TYPE", 1);
        INSTANCE_TASK_TYPE = enumC1781600wSk2;
        EnumC1781600wSk enumC1781600wSk3 = new EnumC1781600wSk("NONE", 2);
        NONE = enumC1781600wSk3;
        EnumC1781600wSk[] enumC1781600wSkArr = {enumC1781600wSk, enumC1781600wSk2, enumC1781600wSk3};
        LL = enumC1781600wSkArr;
        LLILLJJLI = new C2254308sP(enumC1781600wSkArr);
    }

    public static EnumC1781600wSk[] values() {
        return (EnumC1781600wSk[]) LL.clone();
    }

    public static EnumC1781600wSk valueOf(String str) {
        return (EnumC1781600wSk) C08FF.LIZ(EnumC1781600wSk.class, str);
    }

    public EnumC1781600wSk(String str, int i) {
    }
}
