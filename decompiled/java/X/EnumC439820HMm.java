package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439820HMm {
    public static final EnumC439820HMm ERR_PARAM;
    public static final EnumC439820HMm FACE_NOT_MATCH;
    public static final /* synthetic */ EnumC439820HMm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC439820HMm NO_FACE;

    public static InterfaceC2044707zh<EnumC439820HMm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439820HMm enumC439820HMm = new EnumC439820HMm("ERR_PARAM", 0);
        ERR_PARAM = enumC439820HMm;
        EnumC439820HMm enumC439820HMm2 = new EnumC439820HMm("NO_FACE", 1);
        NO_FACE = enumC439820HMm2;
        EnumC439820HMm enumC439820HMm3 = new EnumC439820HMm("FACE_NOT_MATCH", 2);
        FACE_NOT_MATCH = enumC439820HMm3;
        EnumC439820HMm[] enumC439820HMmArr = {enumC439820HMm, enumC439820HMm2, enumC439820HMm3};
        LL = enumC439820HMmArr;
        LLILLJJLI = new C2254308sP(enumC439820HMmArr);
    }

    public static EnumC439820HMm[] values() {
        return (EnumC439820HMm[]) LL.clone();
    }

    public static EnumC439820HMm valueOf(String str) {
        return (EnumC439820HMm) C08FF.LIZ(EnumC439820HMm.class, str);
    }

    public EnumC439820HMm(String str, int i) {
    }
}
