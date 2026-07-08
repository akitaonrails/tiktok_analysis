package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC375290EnX {
    public static final EnumC375290EnX DOWN;
    public static final /* synthetic */ EnumC375290EnX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC375290EnX UP;

    public static InterfaceC2044707zh<EnumC375290EnX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC375290EnX enumC375290EnX = new EnumC375290EnX("DOWN", 0);
        DOWN = enumC375290EnX;
        EnumC375290EnX enumC375290EnX2 = new EnumC375290EnX("UP", 1);
        UP = enumC375290EnX2;
        EnumC375290EnX[] enumC375290EnXArr = {enumC375290EnX, enumC375290EnX2};
        LL = enumC375290EnXArr;
        LLILLJJLI = new C2254308sP(enumC375290EnXArr);
    }

    public static EnumC375290EnX[] values() {
        return (EnumC375290EnX[]) LL.clone();
    }

    public static EnumC375290EnX valueOf(String str) {
        return (EnumC375290EnX) C08FF.LIZ(EnumC375290EnX.class, str);
    }

    public EnumC375290EnX(String str, int i) {
    }
}
