package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1757710vqD {
    public static final EnumC1757710vqD BOTTOM_LEFT;
    public static final EnumC1757710vqD BOTTOM_RIGHT;
    public static final /* synthetic */ EnumC1757710vqD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1757710vqD TOP_LEFT;
    public static final EnumC1757710vqD TOP_RIGHT;

    public static InterfaceC2044707zh<EnumC1757710vqD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1757710vqD enumC1757710vqD = new EnumC1757710vqD("TOP_LEFT", 0);
        TOP_LEFT = enumC1757710vqD;
        EnumC1757710vqD enumC1757710vqD2 = new EnumC1757710vqD("TOP_RIGHT", 1);
        TOP_RIGHT = enumC1757710vqD2;
        EnumC1757710vqD enumC1757710vqD3 = new EnumC1757710vqD("BOTTOM_RIGHT", 2);
        BOTTOM_RIGHT = enumC1757710vqD3;
        EnumC1757710vqD enumC1757710vqD4 = new EnumC1757710vqD("BOTTOM_LEFT", 3);
        BOTTOM_LEFT = enumC1757710vqD4;
        EnumC1757710vqD[] enumC1757710vqDArr = {enumC1757710vqD, enumC1757710vqD2, enumC1757710vqD3, enumC1757710vqD4};
        LL = enumC1757710vqDArr;
        LLILLJJLI = new C2254308sP(enumC1757710vqDArr);
    }

    public static EnumC1757710vqD[] values() {
        return (EnumC1757710vqD[]) LL.clone();
    }

    public static EnumC1757710vqD valueOf(String str) {
        return (EnumC1757710vqD) C08FF.LIZ(EnumC1757710vqD.class, str);
    }

    public EnumC1757710vqD(String str, int i) {
    }
}
