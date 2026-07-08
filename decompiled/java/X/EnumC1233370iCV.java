package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1233370iCV {
    public static final EnumC1233370iCV BULLET;
    public static final EnumC1233370iCV ENTRANCE;
    public static final /* synthetic */ EnumC1233370iCV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1233370iCV PANEL_LIST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1233370iCV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1233370iCV enumC1233370iCV = new EnumC1233370iCV("ENTRANCE", 0, 1);
        ENTRANCE = enumC1233370iCV;
        EnumC1233370iCV enumC1233370iCV2 = new EnumC1233370iCV("PANEL_LIST", 1, 2);
        PANEL_LIST = enumC1233370iCV2;
        EnumC1233370iCV enumC1233370iCV3 = new EnumC1233370iCV("BULLET", 2, 3);
        BULLET = enumC1233370iCV3;
        EnumC1233370iCV[] enumC1233370iCVArr = {enumC1233370iCV, enumC1233370iCV2, enumC1233370iCV3};
        LLILLJJLI = enumC1233370iCVArr;
        LLILLL = new C2254308sP(enumC1233370iCVArr);
    }

    public static EnumC1233370iCV[] values() {
        return (EnumC1233370iCV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1233370iCV valueOf(String str) {
        return (EnumC1233370iCV) C08FF.LIZ(EnumC1233370iCV.class, str);
    }

    public EnumC1233370iCV(String str, int i, int i2) {
        this.LL = i2;
    }
}
