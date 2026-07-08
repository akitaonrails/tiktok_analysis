package X;

/* JADX INFO: renamed from: X.0bhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983410bhL {
    public static EnumC982500bfs LIZ(Integer num) {
        EnumC982500bfs enumC982500bfs = EnumC982500bfs.UNKNOWN;
        int type = enumC982500bfs.getType();
        if (num == null || num.intValue() != type) {
            EnumC982500bfs enumC982500bfs2 = EnumC982500bfs.WIN;
            int type2 = enumC982500bfs2.getType();
            if (num != null && num.intValue() == type2) {
                return enumC982500bfs2;
            }
            EnumC982500bfs enumC982500bfs3 = EnumC982500bfs.LOSE;
            int type3 = enumC982500bfs3.getType();
            if (num != null && num.intValue() == type3) {
                return enumC982500bfs3;
            }
            EnumC982500bfs enumC982500bfs4 = EnumC982500bfs.DRAW;
            int type4 = enumC982500bfs4.getType();
            if (num != null && num.intValue() == type4) {
                return enumC982500bfs4;
            }
        }
        return enumC982500bfs;
    }
}
