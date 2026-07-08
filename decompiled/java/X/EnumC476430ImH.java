package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ImH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC476430ImH {
    public static final EnumC476430ImH INIT;
    public static final /* synthetic */ EnumC476430ImH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC476430ImH PAUSE;
    public static final EnumC476430ImH PLAYING;
    public static final EnumC476430ImH STOP;

    public static InterfaceC2044707zh<EnumC476430ImH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC476430ImH enumC476430ImH = new EnumC476430ImH("INIT", 0);
        INIT = enumC476430ImH;
        EnumC476430ImH enumC476430ImH2 = new EnumC476430ImH("PLAYING", 1);
        PLAYING = enumC476430ImH2;
        EnumC476430ImH enumC476430ImH3 = new EnumC476430ImH("PAUSE", 2);
        PAUSE = enumC476430ImH3;
        EnumC476430ImH enumC476430ImH4 = new EnumC476430ImH("STOP", 3);
        STOP = enumC476430ImH4;
        EnumC476430ImH[] enumC476430ImHArr = {enumC476430ImH, enumC476430ImH2, enumC476430ImH3, enumC476430ImH4};
        LL = enumC476430ImHArr;
        LLILLJJLI = new C2254308sP(enumC476430ImHArr);
    }

    public static EnumC476430ImH[] values() {
        return (EnumC476430ImH[]) LL.clone();
    }

    public static EnumC476430ImH valueOf(String str) {
        return (EnumC476430ImH) C08FF.LIZ(EnumC476430ImH.class, str);
    }

    public EnumC476430ImH(String str, int i) {
    }
}
