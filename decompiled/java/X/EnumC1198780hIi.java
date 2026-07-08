package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1198780hIi {
    public static final EnumC1198780hIi GPS;
    public static final /* synthetic */ EnumC1198780hIi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1198780hIi PROMOTE_PRECISE;

    public static InterfaceC2044707zh<EnumC1198780hIi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1198780hIi enumC1198780hIi = new EnumC1198780hIi("GPS", 0);
        GPS = enumC1198780hIi;
        EnumC1198780hIi enumC1198780hIi2 = new EnumC1198780hIi("PROMOTE_PRECISE", 1);
        PROMOTE_PRECISE = enumC1198780hIi2;
        EnumC1198780hIi[] enumC1198780hIiArr = {enumC1198780hIi, enumC1198780hIi2};
        LL = enumC1198780hIiArr;
        LLILLJJLI = new C2254308sP(enumC1198780hIiArr);
    }

    public static EnumC1198780hIi[] values() {
        return (EnumC1198780hIi[]) LL.clone();
    }

    public static EnumC1198780hIi valueOf(String str) {
        return (EnumC1198780hIi) C08FF.LIZ(EnumC1198780hIi.class, str);
    }

    public EnumC1198780hIi(String str, int i) {
    }
}
