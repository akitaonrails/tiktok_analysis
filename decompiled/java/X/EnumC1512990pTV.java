package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pTV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1512990pTV {
    public static final C1513000pTW Companion;
    public static final EnumC1512990pTV INVALID;
    public static final /* synthetic */ EnumC1512990pTV[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1512990pTV V1;
    public static final EnumC1512990pTV V2;
    public static final EnumC1512990pTV V3;
    public static final EnumC1512990pTV V4;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1512990pTV> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0pTW] */
    static {
        EnumC1512990pTV enumC1512990pTV = new EnumC1512990pTV("V1", 0, 5, 6, 5);
        V1 = enumC1512990pTV;
        EnumC1512990pTV enumC1512990pTV2 = new EnumC1512990pTV("V2", 1, 4, 6, 5);
        V2 = enumC1512990pTV2;
        EnumC1512990pTV enumC1512990pTV3 = new EnumC1512990pTV("V3", 2, 5, 5, 5);
        V3 = enumC1512990pTV3;
        EnumC1512990pTV enumC1512990pTV4 = new EnumC1512990pTV("V4", 3, 4, 5, 5);
        V4 = enumC1512990pTV4;
        EnumC1512990pTV enumC1512990pTV5 = new EnumC1512990pTV("INVALID", 4, -1, 0, 0);
        INVALID = enumC1512990pTV5;
        EnumC1512990pTV[] enumC1512990pTVArr = {enumC1512990pTV, enumC1512990pTV2, enumC1512990pTV3, enumC1512990pTV4, enumC1512990pTV5};
        LLILZ = enumC1512990pTVArr;
        LLILZIL = new C2254308sP(enumC1512990pTVArr);
        Companion = new Object() { // from class: X.0pTW
        };
    }

    public static EnumC1512990pTV[] values() {
        return (EnumC1512990pTV[]) LLILZ.clone();
    }

    public final int getBadnet() {
        return this.LL;
    }

    public final int getCountWhenExecute() {
        return this.LLILLJJLI;
    }

    public final int getCountWhenPreload() {
        return this.LLILLL;
    }

    public static EnumC1512990pTV valueOf(String str) {
        return (EnumC1512990pTV) C08FF.LIZ(EnumC1512990pTV.class, str);
    }

    public EnumC1512990pTV(String str, int i, int i2, int i3, int i4) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
    }
}
