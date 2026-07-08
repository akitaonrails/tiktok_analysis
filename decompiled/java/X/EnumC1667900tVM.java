package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tVM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1667900tVM {
    public static final EnumC1667900tVM FillContainer;
    public static final EnumC1667900tVM HugContent;
    public static final /* synthetic */ EnumC1667900tVM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1667900tVM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1667900tVM enumC1667900tVM = new EnumC1667900tVM("HugContent", 0);
        HugContent = enumC1667900tVM;
        EnumC1667900tVM enumC1667900tVM2 = new EnumC1667900tVM("FillContainer", 1);
        FillContainer = enumC1667900tVM2;
        EnumC1667900tVM[] enumC1667900tVMArr = {enumC1667900tVM, enumC1667900tVM2};
        LL = enumC1667900tVMArr;
        LLILLJJLI = new C2254308sP(enumC1667900tVMArr);
    }

    public static EnumC1667900tVM[] values() {
        return (EnumC1667900tVM[]) LL.clone();
    }

    public static EnumC1667900tVM valueOf(String str) {
        return (EnumC1667900tVM) C08FF.LIZ(EnumC1667900tVM.class, str);
    }

    public EnumC1667900tVM(String str, int i) {
    }
}
