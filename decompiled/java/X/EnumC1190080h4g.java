package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1190080h4g {
    public static final EnumC1190080h4g CANCEL_DISLIKE;
    public static final EnumC1190080h4g CANCEL_LIKE;
    public static final EnumC1190080h4g DELETE;
    public static final EnumC1190080h4g DISLIKE;
    public static final EnumC1190080h4g LIKE;
    public static final /* synthetic */ EnumC1190080h4g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1190080h4g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1190080h4g enumC1190080h4g = new EnumC1190080h4g("LIKE", 0, 1);
        LIKE = enumC1190080h4g;
        EnumC1190080h4g enumC1190080h4g2 = new EnumC1190080h4g("DISLIKE", 1, 2);
        DISLIKE = enumC1190080h4g2;
        EnumC1190080h4g enumC1190080h4g3 = new EnumC1190080h4g("CANCEL_LIKE", 2, 3);
        CANCEL_LIKE = enumC1190080h4g3;
        EnumC1190080h4g enumC1190080h4g4 = new EnumC1190080h4g("CANCEL_DISLIKE", 3, 4);
        CANCEL_DISLIKE = enumC1190080h4g4;
        EnumC1190080h4g enumC1190080h4g5 = new EnumC1190080h4g("DELETE", 4, 10);
        DELETE = enumC1190080h4g5;
        EnumC1190080h4g[] enumC1190080h4gArr = {enumC1190080h4g, enumC1190080h4g2, enumC1190080h4g3, enumC1190080h4g4, enumC1190080h4g5};
        LLILLJJLI = enumC1190080h4gArr;
        LLILLL = new C2254308sP(enumC1190080h4gArr);
    }

    public static EnumC1190080h4g[] values() {
        return (EnumC1190080h4g[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1190080h4g valueOf(String str) {
        return (EnumC1190080h4g) C08FF.LIZ(EnumC1190080h4g.class, str);
    }

    public EnumC1190080h4g(String str, int i, int i2) {
        this.LL = i2;
    }
}
