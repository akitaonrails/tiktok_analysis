package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ekv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373670Ekv {
    public static final EnumC373670Ekv GESTURE_MASK;
    public static final EnumC373670Ekv KEYFRAME_MASK;
    public static final /* synthetic */ EnumC373670Ekv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC373670Ekv TRACK_MASK;

    public static InterfaceC2044707zh<EnumC373670Ekv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC373670Ekv enumC373670Ekv = new EnumC373670Ekv("KEYFRAME_MASK", 0);
        KEYFRAME_MASK = enumC373670Ekv;
        EnumC373670Ekv enumC373670Ekv2 = new EnumC373670Ekv("TRACK_MASK", 1);
        TRACK_MASK = enumC373670Ekv2;
        EnumC373670Ekv enumC373670Ekv3 = new EnumC373670Ekv("GESTURE_MASK", 2);
        GESTURE_MASK = enumC373670Ekv3;
        EnumC373670Ekv[] enumC373670EkvArr = {enumC373670Ekv, enumC373670Ekv2, enumC373670Ekv3};
        LL = enumC373670EkvArr;
        LLILLJJLI = new C2254308sP(enumC373670EkvArr);
    }

    public static EnumC373670Ekv[] values() {
        return (EnumC373670Ekv[]) LL.clone();
    }

    public static EnumC373670Ekv valueOf(String str) {
        return (EnumC373670Ekv) C08FF.LIZ(EnumC373670Ekv.class, str);
    }

    public EnumC373670Ekv(String str, int i) {
    }
}
