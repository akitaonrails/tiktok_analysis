package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mOB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1394370mOB {
    public static final EnumC1394370mOB AUTOCUT;
    public static final /* synthetic */ EnumC1394370mOB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1394370mOB MV_TEMPLATE;
    public static final EnumC1394370mOB PHOTO_MODE_TEMPLATE;
    public static final EnumC1394370mOB PUGC;
    public static final EnumC1394370mOB UGC;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1394370mOB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1394370mOB enumC1394370mOB = new EnumC1394370mOB("PUGC", 0, "pugc");
        PUGC = enumC1394370mOB;
        EnumC1394370mOB enumC1394370mOB2 = new EnumC1394370mOB("UGC", 1, "ugc");
        UGC = enumC1394370mOB2;
        EnumC1394370mOB enumC1394370mOB3 = new EnumC1394370mOB("AUTOCUT", 2, "auto_cut");
        AUTOCUT = enumC1394370mOB3;
        EnumC1394370mOB enumC1394370mOB4 = new EnumC1394370mOB("MV_TEMPLATE", 3, "mv_template");
        MV_TEMPLATE = enumC1394370mOB4;
        EnumC1394370mOB enumC1394370mOB5 = new EnumC1394370mOB("PHOTO_MODE_TEMPLATE", 4, "photo_mode_template");
        PHOTO_MODE_TEMPLATE = enumC1394370mOB5;
        EnumC1394370mOB[] enumC1394370mOBArr = {enumC1394370mOB, enumC1394370mOB2, enumC1394370mOB3, enumC1394370mOB4, enumC1394370mOB5};
        LLILLJJLI = enumC1394370mOBArr;
        LLILLL = new C2254308sP(enumC1394370mOBArr);
    }

    public static EnumC1394370mOB[] values() {
        return (EnumC1394370mOB[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1394370mOB valueOf(String str) {
        return (EnumC1394370mOB) C08FF.LIZ(EnumC1394370mOB.class, str);
    }

    public EnumC1394370mOB(String str, int i, String str2) {
        this.LL = str2;
    }
}
