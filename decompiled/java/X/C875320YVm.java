package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0YVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875320YVm implements InterfaceC870450YCt {
    public SQLiteDatabase LIZ = null;
    public C0YLQ LIZIZ;

    @Override // X.InterfaceC870450YCt
    public final void LJIIIIZZ() {
        this.LIZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC870450YCt
    public final void LJJII() {
        this.LIZ.LJI(false);
    }

    @Override // X.InterfaceC870450YCt
    public final void LJJIIZ() {
        this.LIZ.LJJIIZ();
    }

    @Override // X.InterfaceC870450YCt
    public final void LJJIIZI() {
        this.LIZ.LJJIIZI();
    }

    @Override // X.InterfaceC870450YCt
    public final boolean LJJIJIIJI() {
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        sQLiteDatabase.LIZ();
        try {
            boolean z = sQLiteDatabase.LJJJJJ().LJ != null;
            sQLiteDatabase.LIZLLL();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sQLiteDatabase.LIZLLL();
            throw th;
        }
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJIZ() {
        String strLIZIZ;
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        if (TextUtils.isEmpty(null)) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" where ");
            sbLIZ.append((String) null);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("select count(*) from ");
        sbLIZ2.append("conversation_list");
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        sQLiteDatabase.LIZ();
        try {
            C907990Zjh c907990Zjh = new C907990Zjh(sQLiteDatabase, strLIZIZ2, null);
            sQLiteDatabase.LIZLLL();
            try {
                long jLIZIZ = C908000Zji.LIZIZ(c907990Zjh);
                c907990Zjh.LIZLLL();
                return jLIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c907990Zjh.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            sQLiteDatabase.LIZLLL();
            throw th2;
        }
    }

    @Override // X.InterfaceC870450YCt
    public final InterfaceC869960YAw LJIIJJI(String str) {
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        sQLiteDatabase.LIZ();
        try {
            final C907990Zjh c907990Zjh = new C907990Zjh(sQLiteDatabase, str, null);
            sQLiteDatabase.LIZLLL();
            return new InterfaceC869960YAw(c907990Zjh) { // from class: X.0YVn
                public final C907990Zjh LIZ;

                @Override // X.InterfaceC869960YAw
                public final int LJIIL() {
                    return this.LIZ.LJII();
                }

                @Override // X.InterfaceC869960YAw
                public final long LJIL() {
                    return this.LIZ.LJIL();
                }

                @Override // X.InterfaceC869960YAw
                public final void LJJIIZ() {
                    Object[] objArr = this.LIZ.LLILZLL;
                    if (objArr != null) {
                        Arrays.fill(objArr, (Object) null);
                    }
                }

                @Override // X.InterfaceC869960YAw
                public final void close() {
                    this.LIZ.LIZLLL();
                }

                {
                    this.LIZ = c907990Zjh;
                }

                @Override // X.InterfaceC869960YAw
                public final void LJIILIIL(int i, String str2) {
                    this.LIZ.LJIILIIL(i, str2);
                }

                @Override // X.InterfaceC869960YAw
                public final void LJIJ(int i, long j) {
                    this.LIZ.LJFF(i, Long.valueOf(j));
                }

                @Override // X.InterfaceC869960YAw
                public final void LJJI(double d, int i) {
                    this.LIZ.LJFF(i, Double.valueOf(d));
                }

                @Override // X.InterfaceC869960YAw
                public final void LJJIIJZLJL(int i, byte[] bArr) {
                    C907990Zjh c907990Zjh2 = this.LIZ;
                    if (bArr != null) {
                        c907990Zjh2.LJFF(i, bArr);
                        return;
                    }
                    c907990Zjh2.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("the bind value at index ");
                    sbLIZ.append(i);
                    sbLIZ.append(" is null");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            };
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sQLiteDatabase.LIZLLL();
            throw th;
        }
    }

    @Override // X.InterfaceC870450YCt
    public final void LJIILJJIL(String str) {
        C0YLQ c0ylq = this.LIZIZ;
        if (c0ylq != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("imsdkdb");
            sbLIZ.append(str);
            c0ylq.LIZ.LLJILLL.LIZLLL().LJFF(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.LJJ(str, null);
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJIJIIJIL(String str, ContentValues contentValues) {
        return this.LIZ.LJJJZ(str, contentValues, 0);
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJIJLIJ(String str, ContentValues contentValues) {
        return this.LIZ.LJJJZ(str, contentValues, 5);
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJIL(String str, ContentValues contentValues) {
        return this.LIZ.LJJJZ(str, contentValues, 5);
    }

    @Override // X.InterfaceC870450YCt
    public final InterfaceC869470Y8z LJJJ(String str, String[] strArr) {
        C0YLQ c0ylq = this.LIZIZ;
        if (c0ylq != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("imsdkdb");
            sbLIZ.append(str);
            c0ylq.LIZ.LLJILLL.LIZLLL().LJFF(C2188811AlT.LIZIZ(sbLIZ));
        }
        final C908020Zjk c908020ZjkLJJLL = this.LIZ.LJJLL(str, strArr, null);
        return new InterfaceC869470Y8z(c908020ZjkLJJLL) { // from class: X.1ETG
            public final C1ETH LIZ;

            @Override // X.InterfaceC869470Y8z
            public final void close() {
                this.LIZ.close();
            }

            @Override // X.InterfaceC869470Y8z
            public final int getCount() {
                return this.LIZ.getCount();
            }

            @Override // X.InterfaceC869470Y8z
            public final boolean moveToFirst() {
                return this.LIZ.moveToFirst();
            }

            @Override // X.InterfaceC869470Y8z
            public final boolean moveToNext() {
                return this.LIZ.moveToNext();
            }

            {
                this.LIZ = c908020ZjkLJJLL;
            }

            @Override // X.InterfaceC869470Y8z
            public final byte[] getBlob(int i) {
                return this.LIZ.getBlob(i);
            }

            @Override // X.InterfaceC869470Y8z
            public final int getColumnIndex(String str2) {
                return this.LIZ.getColumnIndex(str2);
            }

            @Override // X.InterfaceC869470Y8z
            public final int getColumnIndexOrThrow(String str2) {
                return this.LIZ.getColumnIndexOrThrow(str2);
            }

            @Override // X.InterfaceC869470Y8z
            public final int getInt(int i) {
                return this.LIZ.getInt(i);
            }

            @Override // X.InterfaceC869470Y8z
            public final long getLong(int i) {
                return this.LIZ.getLong(i);
            }

            @Override // X.InterfaceC869470Y8z
            public final String getString(int i) {
                return this.LIZ.getString(i);
            }

            @Override // X.InterfaceC869470Y8z
            public final int getType(int i) {
                return this.LIZ.getType(i);
            }
        };
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJJI(String str, ContentValues contentValues) {
        return this.LIZ.LJJJZ(str, contentValues, 4);
    }

    @Override // X.InterfaceC870450YCt
    public final int LJJIJL(String str, String str2, String[] strArr) {
        return this.LIZ.LJIILL(str, str2, strArr);
    }

    @Override // X.InterfaceC870450YCt
    public final int LJJIJIL(String str, ContentValues contentValues, String str2, String[] strArr) {
        int length;
        String str3;
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        sQLiteDatabase.getClass();
        if (contentValues.size() != 0) {
            sQLiteDatabase.LIZ();
            try {
                StringBuilder sb = new StringBuilder(120);
                sb.append("UPDATE ");
                int i = 0;
                sb.append(SQLiteDatabase.LLJ[0]);
                sb.append(str);
                sb.append(" SET ");
                int size = contentValues.size();
                if (strArr == null) {
                    length = size;
                } else {
                    length = strArr.length + size;
                }
                Object[] objArr = new Object[length];
                for (String str4 : contentValues.keySet()) {
                    if (i > 0) {
                        str3 = ",";
                    } else {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append(str4);
                    objArr[i] = contentValues.get(str4);
                    sb.append("=?");
                    i++;
                }
                if (strArr != null) {
                    for (int i2 = size; i2 < length; i2++) {
                        objArr[i2] = strArr[i2 - size];
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(" WHERE ");
                    sb.append(str2);
                }
                C907990Zjh c907990Zjh = new C907990Zjh(sQLiteDatabase, sb.toString(), objArr);
                try {
                    int iLJII = c907990Zjh.LJII();
                    c907990Zjh.LIZLLL();
                    sQLiteDatabase.LIZLLL();
                    return iLJII;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c907990Zjh.LIZLLL();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                sQLiteDatabase.LIZLLL();
                throw th2;
            }
        }
        throw new IllegalArgumentException("Empty values");
    }
}
