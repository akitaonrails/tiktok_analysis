package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.010g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2636010g {
    public static final EnumC2636010g DELETED;
    public static final EnumC2636010g FINISHED;
    public static final /* synthetic */ EnumC2636010g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2636010g NOT_START;
    public static final EnumC2636010g ONGOING;
    public static final EnumC2636010g UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2636010g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2636010g enumC2636010g = new EnumC2636010g("UNKNOWN", 0, 0);
        UNKNOWN = enumC2636010g;
        EnumC2636010g enumC2636010g2 = new EnumC2636010g("NOT_START", 1, 1);
        NOT_START = enumC2636010g2;
        EnumC2636010g enumC2636010g3 = new EnumC2636010g("ONGOING", 2, 2);
        ONGOING = enumC2636010g3;
        EnumC2636010g enumC2636010g4 = new EnumC2636010g("FINISHED", 3, 3);
        FINISHED = enumC2636010g4;
        EnumC2636010g enumC2636010g5 = new EnumC2636010g("DELETED", 4, 4);
        DELETED = enumC2636010g5;
        EnumC2636010g[] enumC2636010gArr = {enumC2636010g, enumC2636010g2, enumC2636010g3, enumC2636010g4, enumC2636010g5};
        LLILLJJLI = enumC2636010gArr;
        LLILLL = new C2254308sP(enumC2636010gArr);
    }

    public static EnumC2636010g[] values() {
        return (EnumC2636010g[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC2636010g valueOf(String str) {
        return (EnumC2636010g) C08FF.LIZ(EnumC2636010g.class, str);
    }

    public EnumC2636010g(String str, int i, int i2) {
        this.LL = i2;
    }
}
