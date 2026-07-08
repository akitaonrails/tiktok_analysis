package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356370Dy7 {
    public static final EnumC356370Dy7 DRAWABLE;
    public static final EnumC356370Dy7 IMAGE;
    public static final /* synthetic */ EnumC356370Dy7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356370Dy7 TEXT;
    public static final EnumC356370Dy7 VIDEO_FRAME;

    public static InterfaceC2044707zh<EnumC356370Dy7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356370Dy7 enumC356370Dy7 = new EnumC356370Dy7("IMAGE", 0);
        IMAGE = enumC356370Dy7;
        EnumC356370Dy7 enumC356370Dy72 = new EnumC356370Dy7("TEXT", 1);
        TEXT = enumC356370Dy72;
        EnumC356370Dy7 enumC356370Dy73 = new EnumC356370Dy7("VIDEO_FRAME", 2);
        VIDEO_FRAME = enumC356370Dy73;
        EnumC356370Dy7 enumC356370Dy74 = new EnumC356370Dy7("DRAWABLE", 3);
        DRAWABLE = enumC356370Dy74;
        EnumC356370Dy7[] enumC356370Dy7Arr = {enumC356370Dy7, enumC356370Dy72, enumC356370Dy73, enumC356370Dy74};
        LL = enumC356370Dy7Arr;
        LLILLJJLI = new C2254308sP(enumC356370Dy7Arr);
    }

    public static EnumC356370Dy7[] values() {
        return (EnumC356370Dy7[]) LL.clone();
    }

    public static EnumC356370Dy7 valueOf(String str) {
        return (EnumC356370Dy7) C08FF.LIZ(EnumC356370Dy7.class, str);
    }

    public EnumC356370Dy7(String str, int i) {
    }
}
