package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC432940GyK {
    public static final /* synthetic */ EnumC432940GyK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC432940GyK NONE;
    public static final EnumC432940GyK PAUSED;
    public static final EnumC432940GyK PLAYING;

    public static InterfaceC2044707zh<EnumC432940GyK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC432940GyK enumC432940GyK = new EnumC432940GyK("PLAYING", 0);
        PLAYING = enumC432940GyK;
        EnumC432940GyK enumC432940GyK2 = new EnumC432940GyK("PAUSED", 1);
        PAUSED = enumC432940GyK2;
        EnumC432940GyK enumC432940GyK3 = new EnumC432940GyK("NONE", 2);
        NONE = enumC432940GyK3;
        EnumC432940GyK[] enumC432940GyKArr = {enumC432940GyK, enumC432940GyK2, enumC432940GyK3};
        LL = enumC432940GyKArr;
        LLILLJJLI = new C2254308sP(enumC432940GyKArr);
    }

    public static EnumC432940GyK[] values() {
        return (EnumC432940GyK[]) LL.clone();
    }

    public static EnumC432940GyK valueOf(String str) {
        return (EnumC432940GyK) C08FF.LIZ(EnumC432940GyK.class, str);
    }

    public EnumC432940GyK(String str, int i) {
    }
}
