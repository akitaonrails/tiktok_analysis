package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gJL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1160730gJL {
    public static final EnumC1160730gJL LL;
    public static final EnumC1160730gJL LLILLJJLI;
    public static final EnumC1160730gJL LLILLL;
    public static final EnumC1160730gJL LLILZ;
    public static final /* synthetic */ EnumC1160730gJL[] LLILZIL;

    static {
        EnumC1160730gJL enumC1160730gJL = new EnumC1160730gJL("IDLE", 0);
        LL = enumC1160730gJL;
        EnumC1160730gJL enumC1160730gJL2 = new EnumC1160730gJL("PRELOAD_FIRED", 1);
        LLILLJJLI = enumC1160730gJL2;
        EnumC1160730gJL enumC1160730gJL3 = new EnumC1160730gJL("CONTINUATION_PARKED", 2);
        LLILLL = enumC1160730gJL3;
        EnumC1160730gJL enumC1160730gJL4 = new EnumC1160730gJL("LOADING_ACTIVE", 3);
        LLILZ = enumC1160730gJL4;
        EnumC1160730gJL[] enumC1160730gJLArr = {enumC1160730gJL, enumC1160730gJL2, enumC1160730gJL3, enumC1160730gJL4};
        LLILZIL = enumC1160730gJLArr;
        new C2254308sP(enumC1160730gJLArr);
    }

    public static EnumC1160730gJL[] values() {
        return (EnumC1160730gJL[]) LLILZIL.clone();
    }

    public static EnumC1160730gJL valueOf(String str) {
        return (EnumC1160730gJL) C08FF.LIZ(EnumC1160730gJL.class, str);
    }

    public EnumC1160730gJL(String str, int i) {
    }
}
