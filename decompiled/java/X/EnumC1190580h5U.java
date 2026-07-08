package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1190580h5U {
    public static final EnumC1190580h5U DISLIKED;
    public static final EnumC1190580h5U LIKED;
    public static final /* synthetic */ EnumC1190580h5U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1190580h5U NEUTRAL;

    public static InterfaceC2044707zh<EnumC1190580h5U> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1190580h5U enumC1190580h5U = new EnumC1190580h5U("LIKED", 0);
        LIKED = enumC1190580h5U;
        EnumC1190580h5U enumC1190580h5U2 = new EnumC1190580h5U("DISLIKED", 1);
        DISLIKED = enumC1190580h5U2;
        EnumC1190580h5U enumC1190580h5U3 = new EnumC1190580h5U("NEUTRAL", 2);
        NEUTRAL = enumC1190580h5U3;
        EnumC1190580h5U[] enumC1190580h5UArr = {enumC1190580h5U, enumC1190580h5U2, enumC1190580h5U3};
        LL = enumC1190580h5UArr;
        LLILLJJLI = new C2254308sP(enumC1190580h5UArr);
    }

    public static EnumC1190580h5U[] values() {
        return (EnumC1190580h5U[]) LL.clone();
    }

    public static EnumC1190580h5U valueOf(String str) {
        return (EnumC1190580h5U) C08FF.LIZ(EnumC1190580h5U.class, str);
    }

    public EnumC1190580h5U(String str, int i) {
    }
}
