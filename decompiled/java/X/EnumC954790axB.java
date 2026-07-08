package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0axB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC954790axB {
    public static final EnumC954790axB LIVE_STUDIO_STREAM_LANDSCAPE;
    public static final EnumC954790axB LIVE_STUDIO_STREAM_PORTRAIT;
    public static final /* synthetic */ EnumC954790axB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC954790axB STREAM;
    public static final EnumC954790axB UNKNOWN;
    public int LL;

    public static InterfaceC2044707zh<EnumC954790axB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC954790axB enumC954790axB = new EnumC954790axB("UNKNOWN", 0, 0);
        UNKNOWN = enumC954790axB;
        EnumC954790axB enumC954790axB2 = new EnumC954790axB("STREAM", 1, 1);
        STREAM = enumC954790axB2;
        EnumC954790axB enumC954790axB3 = new EnumC954790axB("LIVE_STUDIO_STREAM_PORTRAIT", 2, 2);
        LIVE_STUDIO_STREAM_PORTRAIT = enumC954790axB3;
        EnumC954790axB enumC954790axB4 = new EnumC954790axB("LIVE_STUDIO_STREAM_LANDSCAPE", 3, 3);
        LIVE_STUDIO_STREAM_LANDSCAPE = enumC954790axB4;
        EnumC954790axB[] enumC954790axBArr = {enumC954790axB, enumC954790axB2, enumC954790axB3, enumC954790axB4};
        LLILLJJLI = enumC954790axBArr;
        LLILLL = new C2254308sP(enumC954790axBArr);
    }

    public static EnumC954790axB[] values() {
        return (EnumC954790axB[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC954790axB valueOf(String str) {
        return (EnumC954790axB) C08FF.LIZ(EnumC954790axB.class, str);
    }

    public final void setType(int i) {
        this.LL = i;
    }

    public EnumC954790axB(String str, int i, int i2) {
        this.LL = i2;
    }
}
