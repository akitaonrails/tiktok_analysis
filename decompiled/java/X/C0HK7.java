package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HK7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HK7 {
    public static final C0HK7 AVATAR_DUO;
    public static final /* synthetic */ C0HK7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HK7 MIX_STUDIO;
    public static final C0HK7 SOCIAL_AVATAR;
    public static final C0HK7 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0HK7> getEntries() {
        return LLILLL;
    }

    static {
        C0HK7 c0hk7 = new C0HK7("UNKNOWN", 0, 0);
        UNKNOWN = c0hk7;
        C0HK7 c0hk72 = new C0HK7("MIX_STUDIO", 1, 1);
        MIX_STUDIO = c0hk72;
        C0HK7 c0hk73 = new C0HK7("SOCIAL_AVATAR", 2, 2);
        SOCIAL_AVATAR = c0hk73;
        C0HK7 c0hk74 = new C0HK7("AVATAR_DUO", 3, 3);
        AVATAR_DUO = c0hk74;
        C0HK7[] c0hk7Arr = {c0hk7, c0hk72, c0hk73, c0hk74};
        LLILLJJLI = c0hk7Arr;
        LLILLL = new C2254308sP(c0hk7Arr);
    }

    public static C0HK7[] values() {
        return (C0HK7[]) LLILLJJLI.clone();
    }

    public final int getSource() {
        return this.LL;
    }

    public static C0HK7 valueOf(String str) {
        return (C0HK7) C08FF.LIZ(C0HK7.class, str);
    }

    public C0HK7(String str, int i, int i2) {
        this.LL = i2;
    }
}
