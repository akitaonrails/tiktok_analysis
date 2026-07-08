package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1784170wWt {
    public static final EnumC1784170wWt CLICK;
    public static final EnumC1784170wWt DELETE;
    public static final EnumC1784170wWt DRAG;
    public static final EnumC1784170wWt EDIT;
    public static final /* synthetic */ EnumC1784170wWt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1784170wWt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1784170wWt enumC1784170wWt = new EnumC1784170wWt("CLICK", 0);
        CLICK = enumC1784170wWt;
        EnumC1784170wWt enumC1784170wWt2 = new EnumC1784170wWt("DELETE", 1);
        DELETE = enumC1784170wWt2;
        EnumC1784170wWt enumC1784170wWt3 = new EnumC1784170wWt("DRAG", 2);
        DRAG = enumC1784170wWt3;
        EnumC1784170wWt enumC1784170wWt4 = new EnumC1784170wWt("EDIT", 3);
        EDIT = enumC1784170wWt4;
        EnumC1784170wWt[] enumC1784170wWtArr = {enumC1784170wWt, enumC1784170wWt2, enumC1784170wWt3, enumC1784170wWt4};
        LL = enumC1784170wWtArr;
        LLILLJJLI = new C2254308sP(enumC1784170wWtArr);
    }

    public static EnumC1784170wWt[] values() {
        return (EnumC1784170wWt[]) LL.clone();
    }

    public static EnumC1784170wWt valueOf(String str) {
        return (EnumC1784170wWt) C08FF.LIZ(EnumC1784170wWt.class, str);
    }

    public EnumC1784170wWt(String str, int i) {
    }
}
