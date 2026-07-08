package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586690Mzj {
    public static final /* synthetic */ EnumC586690Mzj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586690Mzj MODAL;
    public static final EnumC586690Mzj PASS_THROUGH;

    public static InterfaceC2044707zh<EnumC586690Mzj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586690Mzj enumC586690Mzj = new EnumC586690Mzj("PASS_THROUGH", 0);
        PASS_THROUGH = enumC586690Mzj;
        EnumC586690Mzj enumC586690Mzj2 = new EnumC586690Mzj("MODAL", 1);
        MODAL = enumC586690Mzj2;
        EnumC586690Mzj[] enumC586690MzjArr = {enumC586690Mzj, enumC586690Mzj2};
        LL = enumC586690MzjArr;
        LLILLJJLI = new C2254308sP(enumC586690MzjArr);
    }

    public static EnumC586690Mzj[] values() {
        return (EnumC586690Mzj[]) LL.clone();
    }

    public static EnumC586690Mzj valueOf(String str) {
        return (EnumC586690Mzj) C08FF.LIZ(EnumC586690Mzj.class, str);
    }

    public EnumC586690Mzj(String str, int i) {
    }
}
