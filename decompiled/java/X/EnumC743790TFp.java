package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC743790TFp {
    public static final /* synthetic */ EnumC743790TFp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC743790TFp NONE;
    public static final EnumC743790TFp TRAY_ONLY;
    public static final EnumC743790TFp VIDEO_ONLY;

    public static InterfaceC2044707zh<EnumC743790TFp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC743790TFp enumC743790TFp = new EnumC743790TFp("NONE", 0);
        NONE = enumC743790TFp;
        EnumC743790TFp enumC743790TFp2 = new EnumC743790TFp("VIDEO_ONLY", 1);
        VIDEO_ONLY = enumC743790TFp2;
        EnumC743790TFp enumC743790TFp3 = new EnumC743790TFp("TRAY_ONLY", 2);
        TRAY_ONLY = enumC743790TFp3;
        EnumC743790TFp[] enumC743790TFpArr = {enumC743790TFp, enumC743790TFp2, enumC743790TFp3};
        LL = enumC743790TFpArr;
        LLILLJJLI = new C2254308sP(enumC743790TFpArr);
    }

    public static EnumC743790TFp[] values() {
        return (EnumC743790TFp[]) LL.clone();
    }

    public static EnumC743790TFp valueOf(String str) {
        return (EnumC743790TFp) C08FF.LIZ(EnumC743790TFp.class, str);
    }

    public EnumC743790TFp(String str, int i) {
    }
}
