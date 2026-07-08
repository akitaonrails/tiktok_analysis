package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;

/* JADX INFO: renamed from: X.0Zji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908000Zji {
    public static int LIZ(String str) {
        String strTrim = str.trim();
        if (strTrim.length() < 3) {
            return 99;
        }
        int i = 0;
        int i2 = 0;
        do {
            int iCharAt = strTrim.charAt(i);
            if (iCharAt >= 97) {
                if (iCharAt <= 122) {
                    iCharAt = (iCharAt - 97) + 65;
                } else if (iCharAt >= 128) {
                    return 99;
                }
            }
            i2 |= (iCharAt & 127) << (i * 8);
            i++;
        } while (i < 3);
        switch (i2) {
            case 4279873:
            case 5522756:
                break;
            case 4280912:
                break;
            case 4476485:
            case 5066563:
                break;
            case 4477013:
            case 4998468:
            case 5260626:
            case 5459529:
                break;
            case 4543043:
            case 5198404:
            case 5524545:
                break;
            case 4670786:
                break;
            case 4998483:
                break;
            case 5001042:
                break;
            case 5526593:
                break;
        }
        return 99;
    }

    public static long LIZIZ(C907990Zjh c907990Zjh) {
        c907990Zjh.LIZ();
        try {
            try {
                C908190Zk1 c908190Zk1LJJJJJ = c907990Zjh.LL.LJJJJJ();
                String str = c907990Zjh.LLILLJJLI;
                Object[] objArr = c907990Zjh.LLILZLL;
                SQLiteDatabase sQLiteDatabase = c907990Zjh.LL;
                boolean z = c907990Zjh.LLILLL;
                sQLiteDatabase.getClass();
                long jLJI = c908190Zk1LJJJJJ.LJI(str, objArr, SQLiteDatabase.LJJJJ(z));
                c907990Zjh.LIZLLL();
                return jLJI;
            } catch (SQLiteDatabaseCorruptException e) {
                TryCatchGuardChecker.doCheck(e);
                c907990Zjh.LJI(e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c907990Zjh.LIZLLL();
            throw th;
        }
    }
}
