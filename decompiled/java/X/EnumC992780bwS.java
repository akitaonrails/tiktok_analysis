package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992780bwS {
    public static final EnumC992780bwS FETCHING;
    public static final EnumC992780bwS FETCH_SUCCESS;
    public static final /* synthetic */ EnumC992780bwS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992780bwS NO_FETCH;

    public static InterfaceC2044707zh<EnumC992780bwS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992780bwS enumC992780bwS = new EnumC992780bwS("NO_FETCH", 0);
        NO_FETCH = enumC992780bwS;
        EnumC992780bwS enumC992780bwS2 = new EnumC992780bwS("FETCHING", 1);
        FETCHING = enumC992780bwS2;
        EnumC992780bwS enumC992780bwS3 = new EnumC992780bwS("FETCH_SUCCESS", 2);
        FETCH_SUCCESS = enumC992780bwS3;
        EnumC992780bwS[] enumC992780bwSArr = {enumC992780bwS, enumC992780bwS2, enumC992780bwS3};
        LL = enumC992780bwSArr;
        LLILLJJLI = new C2254308sP(enumC992780bwSArr);
    }

    public static EnumC992780bwS[] values() {
        return (EnumC992780bwS[]) LL.clone();
    }

    public static EnumC992780bwS valueOf(String str) {
        return (EnumC992780bwS) C08FF.LIZ(EnumC992780bwS.class, str);
    }

    public EnumC992780bwS(String str, int i) {
    }
}
