package X;

import android.content.SharedPreferences;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: X.1Beh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210091Beh {
    public static final long[][] LJIIJ = {new long[]{60000, 0, 12}, new long[]{120000, 5, 1}, new long[]{240000, 5, 1}, new long[]{480000, 4, 1}, new long[]{960000, 2, 1}};
    public static int LJIIJJI = -1;
    public final String LIZ;
    public final C2209571Bdr LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public float LJ;
    public int LJFF;
    public long LJI;
    public long LJII;
    public long[][] LJIIIIZZ;
    public final C2209631Bdx LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mPrefix=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mTableIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mHasSendCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mHasSendPackCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mContinueSuccSendCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mLastSendTime=");
        sbLIZ.append(this.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2210091Beh(String str, C2209571Bdr c2209571Bdr, C2209631Bdx c2209631Bdx) {
        this.LIZIZ = c2209571Bdr;
        this.LIZ = str;
        this.LJIIIZ = c2209631Bdx;
        this.LIZJ = 0;
        SharedPreferences sharedPreferences = c2209571Bdr.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("downgrade_time");
        if (System.currentTimeMillis() - sharedPreferences.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) < 10800000) {
            SharedPreferences sharedPreferences2 = c2209571Bdr.LJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("downgrade_index");
            this.LIZJ = sharedPreferences2.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
        } else {
            SharedPreferences.Editor editorEdit = c2209571Bdr.LJ.edit();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("downgrade_time");
            SharedPreferences.Editor editorRemove = editorEdit.remove(C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append("downgrade_index");
            editorRemove.remove(C2188811AlT.LIZIZ(sbLIZ4)).apply();
        }
        long[][] jArr = LJIIJ;
        this.LJIIIIZZ = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 5, jArr[0].length);
        int i = 0;
        do {
            long[] jArr2 = jArr[i];
            System.arraycopy(jArr2, 0, this.LJIIIIZZ[i], 0, jArr2.length);
            i++;
        } while (i < 5);
        int i2 = LJIIJJI;
        if (i2 > 0) {
            this.LJIIIIZZ[0][2] = i2;
        }
        C2209631Bdx c2209631Bdx2 = this.LJIIIZ;
        if (c2209631Bdx2 != null) {
            int i3 = c2209631Bdx2.LIZ;
            if (i3 == 0) {
                this.LJIIIIZZ[0][2] = 2147483647L;
            } else if (-1 != i3) {
                this.LJIIIIZZ[0][2] = 60;
            }
            long j = c2209631Bdx2.LIZLLL;
            if (j > 0) {
                int i4 = 1;
                while (true) {
                    long[][] jArr3 = this.LJIIIIZZ;
                    if (i4 < jArr3.length) {
                        if (i4 == 1) {
                            jArr3[i4][0] = 2 * j;
                        } else {
                            jArr3[i4][0] = jArr3[i4 - 1][0] * 2;
                        }
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
