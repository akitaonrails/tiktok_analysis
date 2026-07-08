package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1131980fYy {
    public static final EnumC1131980fYy LL;
    public static final EnumC1131980fYy LLILLJJLI;
    public static final EnumC1131980fYy LLILLL;
    public static final /* synthetic */ EnumC1131980fYy[] LLILZ;

    static {
        EnumC1131980fYy enumC1131980fYy = new EnumC1131980fYy("WAIT_START", 0);
        LL = enumC1131980fYy;
        EnumC1131980fYy enumC1131980fYy2 = new EnumC1131980fYy("IN_FLIGHT", 1);
        LLILLJJLI = enumC1131980fYy2;
        EnumC1131980fYy enumC1131980fYy3 = new EnumC1131980fYy("DONE", 2);
        LLILLL = enumC1131980fYy3;
        EnumC1131980fYy[] enumC1131980fYyArr = {enumC1131980fYy, enumC1131980fYy2, enumC1131980fYy3};
        LLILZ = enumC1131980fYyArr;
        new C2254308sP(enumC1131980fYyArr);
    }

    public static EnumC1131980fYy[] values() {
        return (EnumC1131980fYy[]) LLILZ.clone();
    }

    public static EnumC1131980fYy valueOf(String str) {
        return (EnumC1131980fYy) C08FF.LIZ(EnumC1131980fYy.class, str);
    }

    public EnumC1131980fYy(String str, int i) {
    }
}
