package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0311008v {
    public static final EnumC0311008v FeatureType_3DFaceSticker;
    public static final EnumC0311008v FeatureType_Background2D;
    public static final EnumC0311008v FeatureType_FaceDistortion;
    public static final EnumC0311008v FeatureType_FaceInset;
    public static final EnumC0311008v FeatureType_FaceLiquify;
    public static final EnumC0311008v FeatureType_Filter;
    public static final EnumC0311008v FeatureType_Foreground2D;
    public static final EnumC0311008v FeatureType_Gan;
    public static final EnumC0311008v FeatureType_HairColor;
    public static final EnumC0311008v FeatureType_Makeup;
    public static final EnumC0311008v FeatureType_PostProcess;
    public static final EnumC0311008v FeatureType_Unknown;
    public static final /* synthetic */ EnumC0311008v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC0311008v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0311008v enumC0311008v = new EnumC0311008v("FeatureType_Unknown", 0);
        FeatureType_Unknown = enumC0311008v;
        EnumC0311008v enumC0311008v2 = new EnumC0311008v("FeatureType_Foreground2D", 1);
        FeatureType_Foreground2D = enumC0311008v2;
        EnumC0311008v enumC0311008v3 = new EnumC0311008v("FeatureType_Background2D", 2);
        FeatureType_Background2D = enumC0311008v3;
        EnumC0311008v enumC0311008v4 = new EnumC0311008v("FeatureType_FaceInset", 3);
        FeatureType_FaceInset = enumC0311008v4;
        EnumC0311008v enumC0311008v5 = new EnumC0311008v("FeatureType_Filter", 4);
        FeatureType_Filter = enumC0311008v5;
        EnumC0311008v enumC0311008v6 = new EnumC0311008v("FeatureType_FaceDistortion", 5);
        FeatureType_FaceDistortion = enumC0311008v6;
        EnumC0311008v enumC0311008v7 = new EnumC0311008v("FeatureType_FaceLiquify", 6);
        FeatureType_FaceLiquify = enumC0311008v7;
        EnumC0311008v enumC0311008v8 = new EnumC0311008v("FeatureType_HairColor", 7);
        FeatureType_HairColor = enumC0311008v8;
        EnumC0311008v enumC0311008v9 = new EnumC0311008v("FeatureType_Makeup", 8);
        FeatureType_Makeup = enumC0311008v9;
        EnumC0311008v enumC0311008v10 = new EnumC0311008v("FeatureType_Gan", 9);
        FeatureType_Gan = enumC0311008v10;
        EnumC0311008v enumC0311008v11 = new EnumC0311008v("FeatureType_PostProcess", 10);
        FeatureType_PostProcess = enumC0311008v11;
        EnumC0311008v enumC0311008v12 = new EnumC0311008v("FeatureType_3DFaceSticker", 11);
        FeatureType_3DFaceSticker = enumC0311008v12;
        EnumC0311008v[] enumC0311008vArr = {enumC0311008v, enumC0311008v2, enumC0311008v3, enumC0311008v4, enumC0311008v5, enumC0311008v6, enumC0311008v7, enumC0311008v8, enumC0311008v9, enumC0311008v10, enumC0311008v11, enumC0311008v12};
        LL = enumC0311008vArr;
        LLILLJJLI = new C2254308sP(enumC0311008vArr);
    }

    public static EnumC0311008v[] values() {
        return (EnumC0311008v[]) LL.clone();
    }

    public static EnumC0311008v valueOf(String str) {
        return (EnumC0311008v) C08FF.LIZ(EnumC0311008v.class, str);
    }

    public EnumC0311008v(String str, int i) {
    }
}
