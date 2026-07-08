package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC379010EtX {
    public static final EnumC379010EtX GENERATE_CLICKED;
    public static final EnumC379010EtX GENERATE_FAIL;
    public static final EnumC379010EtX INIT;
    public static final EnumC379010EtX INIT_OTHER;
    public static final /* synthetic */ EnumC379010EtX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC379010EtX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC379010EtX enumC379010EtX = new EnumC379010EtX("INIT", 0);
        INIT = enumC379010EtX;
        EnumC379010EtX enumC379010EtX2 = new EnumC379010EtX("INIT_OTHER", 1);
        INIT_OTHER = enumC379010EtX2;
        EnumC379010EtX enumC379010EtX3 = new EnumC379010EtX("GENERATE_CLICKED", 2);
        GENERATE_CLICKED = enumC379010EtX3;
        EnumC379010EtX enumC379010EtX4 = new EnumC379010EtX("GENERATE_FAIL", 3);
        GENERATE_FAIL = enumC379010EtX4;
        EnumC379010EtX[] enumC379010EtXArr = {enumC379010EtX, enumC379010EtX2, enumC379010EtX3, enumC379010EtX4};
        LL = enumC379010EtXArr;
        LLILLJJLI = new C2254308sP(enumC379010EtXArr);
    }

    public static EnumC379010EtX[] values() {
        return (EnumC379010EtX[]) LL.clone();
    }

    public static EnumC379010EtX valueOf(String str) {
        return (EnumC379010EtX) C08FF.LIZ(EnumC379010EtX.class, str);
    }

    public EnumC379010EtX(String str, int i) {
    }
}
