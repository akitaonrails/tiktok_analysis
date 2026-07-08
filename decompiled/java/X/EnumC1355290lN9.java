package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1355290lN9 {
    public static final EnumC1355290lN9 AUDIO_FOCUS;
    public static final EnumC1355290lN9 CAMERA;
    public static final /* synthetic */ EnumC1355290lN9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1355290lN9 MICROPHONE;

    public static InterfaceC2044707zh<EnumC1355290lN9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1355290lN9 enumC1355290lN9 = new EnumC1355290lN9("MICROPHONE", 0);
        MICROPHONE = enumC1355290lN9;
        EnumC1355290lN9 enumC1355290lN92 = new EnumC1355290lN9("CAMERA", 1);
        CAMERA = enumC1355290lN92;
        EnumC1355290lN9 enumC1355290lN93 = new EnumC1355290lN9("AUDIO_FOCUS", 2);
        AUDIO_FOCUS = enumC1355290lN93;
        EnumC1355290lN9[] enumC1355290lN9Arr = {enumC1355290lN9, enumC1355290lN92, enumC1355290lN93};
        LL = enumC1355290lN9Arr;
        LLILLJJLI = new C2254308sP(enumC1355290lN9Arr);
    }

    public static EnumC1355290lN9[] values() {
        return (EnumC1355290lN9[]) LL.clone();
    }

    public static EnumC1355290lN9 valueOf(String str) {
        return (EnumC1355290lN9) C08FF.LIZ(EnumC1355290lN9.class, str);
    }

    public EnumC1355290lN9(String str, int i) {
    }
}
