package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QuK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC685260QuK {
    public static final EnumC685260QuK BOTTOM;
    public static final EnumC685260QuK CENTER;
    public static final EnumC685260QuK END;
    public static final /* synthetic */ EnumC685260QuK[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC685260QuK START;
    public static final EnumC685260QuK TOP;
    public final String LL;
    public final float LLILLJJLI;

    public static InterfaceC2044707zh<EnumC685260QuK> getEntries() {
        return LLILZ;
    }

    static {
        EnumC685260QuK enumC685260QuK = new EnumC685260QuK(0.5f, "CENTER", 0, "center");
        CENTER = enumC685260QuK;
        EnumC685260QuK enumC685260QuK2 = new EnumC685260QuK(0.0f, "TOP", 1, "top");
        TOP = enumC685260QuK2;
        EnumC685260QuK enumC685260QuK3 = new EnumC685260QuK(1.0f, "BOTTOM", 2, "bottom");
        BOTTOM = enumC685260QuK3;
        EnumC685260QuK enumC685260QuK4 = new EnumC685260QuK(0.0f, "START", 3, "start");
        START = enumC685260QuK4;
        EnumC685260QuK enumC685260QuK5 = new EnumC685260QuK(1.0f, "END", 4, "end");
        END = enumC685260QuK5;
        EnumC685260QuK[] enumC685260QuKArr = {enumC685260QuK, enumC685260QuK2, enumC685260QuK3, enumC685260QuK4, enumC685260QuK5};
        LLILLL = enumC685260QuKArr;
        LLILZ = new C2254308sP(enumC685260QuKArr);
    }

    public static EnumC685260QuK[] values() {
        return (EnumC685260QuK[]) LLILLL.clone();
    }

    public final float getBias() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC685260QuK valueOf(String str) {
        return (EnumC685260QuK) C08FF.LIZ(EnumC685260QuK.class, str);
    }

    public EnumC685260QuK(float f, String str, int i, String str2) {
        this.LL = str2;
        this.LLILLJJLI = f;
    }
}
