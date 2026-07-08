package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982500bfs {
    public static final C983410bhL Companion;
    public static final EnumC982500bfs DRAW;
    public static final /* synthetic */ EnumC982500bfs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC982500bfs LOSE;
    public static final EnumC982500bfs UNKNOWN;
    public static final EnumC982500bfs WIN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC982500bfs> getEntries() {
        return LLILLL;
    }

    public static final EnumC982500bfs getTypeFromInt(Integer num) {
        Companion.getClass();
        return C983410bhL.LIZ(num);
    }

    static {
        EnumC982500bfs enumC982500bfs = new EnumC982500bfs("UNKNOWN", 0, 0);
        UNKNOWN = enumC982500bfs;
        EnumC982500bfs enumC982500bfs2 = new EnumC982500bfs("WIN", 1, 1);
        WIN = enumC982500bfs2;
        EnumC982500bfs enumC982500bfs3 = new EnumC982500bfs("LOSE", 2, 2);
        LOSE = enumC982500bfs3;
        EnumC982500bfs enumC982500bfs4 = new EnumC982500bfs("DRAW", 3, 3);
        DRAW = enumC982500bfs4;
        EnumC982500bfs[] enumC982500bfsArr = {enumC982500bfs, enumC982500bfs2, enumC982500bfs3, enumC982500bfs4};
        LLILLJJLI = enumC982500bfsArr;
        LLILLL = new C2254308sP(enumC982500bfsArr);
        Companion = new C983410bhL();
    }

    public static EnumC982500bfs[] values() {
        return (EnumC982500bfs[]) LLILLJJLI.clone();
    }

    public final String getString() {
        int i = C983050bgl.LIZ[ordinal()];
        if (i == 1) {
            return "none";
        }
        if (i == 2) {
            return "win";
        }
        if (i == 3) {
            return "lose";
        }
        if (i == 4) {
            return "draw";
        }
        throw new C1954807lC();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC982500bfs valueOf(String str) {
        return (EnumC982500bfs) C08FF.LIZ(EnumC982500bfs.class, str);
    }

    public EnumC982500bfs(String str, int i, int i2) {
        this.LL = i2;
    }
}
