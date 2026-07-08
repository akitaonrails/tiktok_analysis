package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1198390hI5 {
    public static final EnumC1198390hI5 ACTIVITY_ENDED;
    public static final /* synthetic */ EnumC1198390hI5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1198390hI5 LOADING;
    public static final EnumC1198390hI5 LOC_UNAVAILABLE;
    public static final EnumC1198390hI5 NO_CONTENT;
    public static final EnumC1198390hI5 NO_GOOGLE_PLAY_SERVICE;
    public static final EnumC1198390hI5 NO_NETWORK;
    public static final EnumC1198390hI5 OTHER_EXCEPTION;

    public static InterfaceC2044707zh<EnumC1198390hI5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1198390hI5 enumC1198390hI5 = new EnumC1198390hI5("LOADING", 0);
        LOADING = enumC1198390hI5;
        EnumC1198390hI5 enumC1198390hI52 = new EnumC1198390hI5("ACTIVITY_ENDED", 1);
        ACTIVITY_ENDED = enumC1198390hI52;
        EnumC1198390hI5 enumC1198390hI53 = new EnumC1198390hI5("NO_NETWORK", 2);
        NO_NETWORK = enumC1198390hI53;
        EnumC1198390hI5 enumC1198390hI54 = new EnumC1198390hI5("NO_CONTENT", 3);
        NO_CONTENT = enumC1198390hI54;
        EnumC1198390hI5 enumC1198390hI55 = new EnumC1198390hI5("NO_GOOGLE_PLAY_SERVICE", 4);
        NO_GOOGLE_PLAY_SERVICE = enumC1198390hI55;
        EnumC1198390hI5 enumC1198390hI56 = new EnumC1198390hI5("LOC_UNAVAILABLE", 5);
        LOC_UNAVAILABLE = enumC1198390hI56;
        EnumC1198390hI5 enumC1198390hI57 = new EnumC1198390hI5("OTHER_EXCEPTION", 6);
        OTHER_EXCEPTION = enumC1198390hI57;
        EnumC1198390hI5[] enumC1198390hI5Arr = {enumC1198390hI5, enumC1198390hI52, enumC1198390hI53, enumC1198390hI54, enumC1198390hI55, enumC1198390hI56, enumC1198390hI57};
        LL = enumC1198390hI5Arr;
        LLILLJJLI = new C2254308sP(enumC1198390hI5Arr);
    }

    public static EnumC1198390hI5[] values() {
        return (EnumC1198390hI5[]) LL.clone();
    }

    public static EnumC1198390hI5 valueOf(String str) {
        return (EnumC1198390hI5) C08FF.LIZ(EnumC1198390hI5.class, str);
    }

    public EnumC1198390hI5(String str, int i) {
    }
}
