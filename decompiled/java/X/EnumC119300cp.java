package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC119300cp {
    public static final EnumC119300cp CAMERA;
    public static final /* synthetic */ EnumC119300cp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC119300cp RECORD_AUDIO;

    public static InterfaceC2044707zh<EnumC119300cp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC119300cp enumC119300cp = new EnumC119300cp("RECORD_AUDIO", 0);
        RECORD_AUDIO = enumC119300cp;
        EnumC119300cp enumC119300cp2 = new EnumC119300cp("CAMERA", 1);
        CAMERA = enumC119300cp2;
        EnumC119300cp[] enumC119300cpArr = {enumC119300cp, enumC119300cp2};
        LL = enumC119300cpArr;
        LLILLJJLI = new C2254308sP(enumC119300cpArr);
    }

    public static EnumC119300cp[] values() {
        return (EnumC119300cp[]) LL.clone();
    }

    public static EnumC119300cp valueOf(String str) {
        return (EnumC119300cp) C08FF.LIZ(EnumC119300cp.class, str);
    }

    public EnumC119300cp(String str, int i) {
    }
}
