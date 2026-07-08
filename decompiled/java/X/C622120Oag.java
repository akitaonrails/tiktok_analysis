package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Oag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622120Oag {
    public static final int LIZ(C908020Zjk c908020Zjk, String str) {
        int columnIndex = c908020Zjk.getColumnIndex(str);
        if (columnIndex != -1) {
            return c908020Zjk.getInt(columnIndex);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Column ");
        sbLIZ.append(str);
        sbLIZ.append(" does not exist");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Long LIZIZ(C908020Zjk c908020Zjk, String str) {
        boolean z;
        try {
            int columnIndex = c908020Zjk.getColumnIndex(str);
            if (columnIndex == -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLongOrNull: Column ");
                sbLIZ.append(str);
                sbLIZ.append(" not found, returning null.");
                C622290Oax.LJFF("CursorUtils", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            Long lValueOf = Long.valueOf(c908020Zjk.getLong(columnIndex));
            if (lValueOf.longValue() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return null;
            }
            return lValueOf;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getLongOrNull: Failed to get long for column ");
            sbLIZ2.append(str);
            sbLIZ2.append(". Error: ");
            sbLIZ2.append(e.getMessage());
            C622290Oax.LJFF("CursorUtils", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    public static final long LIZJ(C908020Zjk c908020Zjk, String str) {
        int columnIndex = c908020Zjk.getColumnIndex(str);
        if (columnIndex != -1) {
            return c908020Zjk.getLong(columnIndex);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Column ");
        sbLIZ.append(str);
        sbLIZ.append(" does not exist");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LIZLLL(C908020Zjk c908020Zjk, String str) {
        boolean z;
        try {
            int columnIndex = c908020Zjk.getColumnIndex(str);
            if (columnIndex == -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getStringOrNull: Column ");
                sbLIZ.append(str);
                sbLIZ.append(" not found, returning null.");
                C622290Oax.LJFF("CursorUtils", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            String string = c908020Zjk.getString(columnIndex);
            if (string != null) {
                if (string.length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return string;
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getStringOrNull: Failed to get string for column ");
            sbLIZ2.append(str);
            sbLIZ2.append(". Error: ");
            sbLIZ2.append(e.getMessage());
            C622290Oax.LJFF("CursorUtils", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    public static final String LJ(C908020Zjk c908020Zjk, String str) {
        int columnIndex = c908020Zjk.getColumnIndex(str);
        if (columnIndex != -1) {
            String string = c908020Zjk.getString(columnIndex);
            if (string != null) {
                return string;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Column ");
            sbLIZ.append(str);
            sbLIZ.append(" cannot be null");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Column ");
        sbLIZ2.append(str);
        sbLIZ2.append(" does not exist");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
