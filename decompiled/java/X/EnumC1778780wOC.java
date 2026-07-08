package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778780wOC {
    public static final EnumC1778780wOC DM_LOCAL_VIDEO;
    public static final EnumC1778780wOC DM_PHOTO;
    public static final /* synthetic */ EnumC1778780wOC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1778780wOC UGC;
    public final int LL;

    public EnumC1778780wOC() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1778780wOC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1778780wOC enumC1778780wOC = new EnumC1778780wOC("UGC", 0);
        UGC = enumC1778780wOC;
        EnumC1778780wOC enumC1778780wOC2 = new EnumC1778780wOC("DM_PHOTO", 1);
        DM_PHOTO = enumC1778780wOC2;
        EnumC1778780wOC enumC1778780wOC3 = new EnumC1778780wOC("DM_LOCAL_VIDEO", 2);
        DM_LOCAL_VIDEO = enumC1778780wOC3;
        EnumC1778780wOC[] enumC1778780wOCArr = {enumC1778780wOC, enumC1778780wOC2, enumC1778780wOC3};
        LLILLJJLI = enumC1778780wOCArr;
        LLILLL = new C2254308sP(enumC1778780wOCArr);
    }

    public static EnumC1778780wOC[] values() {
        return (EnumC1778780wOC[]) LLILLJJLI.clone();
    }

    public final int getStrRes() {
        return this.LL;
    }

    public static EnumC1778780wOC valueOf(String str) {
        return (EnumC1778780wOC) C08FF.LIZ(EnumC1778780wOC.class, str);
    }

    public EnumC1778780wOC(String str, int i) {
        this.LL = -1;
    }
}
