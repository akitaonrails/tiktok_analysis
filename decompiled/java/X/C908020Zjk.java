package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Zjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908020Zjk extends AbstractC908030Zjl {
    public static final C908100Zjs LLJJIJIIJIL = new InterfaceC2186508hT() { // from class: X.0Zjs
    };
    public final String[] LLJILJILJ;
    public final C907980Zjg LLJILLL;
    public final InterfaceC908110Zjt LLJJ;
    public int LLJJIII;
    public int LLJJI = -1;
    public Map<String, Integer> LLJJIJI = null;

    @Override // m4p.a
    public final void finalize() {
        try {
            if (this.LLJILJIL != null) {
                close();
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // m4p.a, X.C1ETH, android.database.Cursor
    public final int getCount() {
        if (this.LLJJI == -1) {
            LJFF(0);
        }
        return this.LLJJI;
    }

    @Override // m4p.a, android.database.Cursor
    public final boolean requery() {
        if (this.LLILLL) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.LLJILLL.LL.isOpen()) {
                    return false;
                }
                CursorWindow cursorWindow = this.LLJILJIL;
                if (cursorWindow != null) {
                    cursorWindow.LJFF();
                }
                this.LL = -1;
                this.LLJJI = -1;
                this.LLJJ.getClass();
                try {
                    super.requery();
                    return true;
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requery() failed ");
                    sbLIZ.append(e.getMessage());
                    Log.LJFF(C2188811AlT.LIZIZ(sbLIZ), e);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // m4p.a, X.C1ETH, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        synchronized (this) {
            try {
                this.LLJILLL.LIZLLL();
                this.LLJJ.getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // m4p.a, android.database.Cursor
    public final void deactivate() {
        LIZ();
        this.LLJJ.getClass();
    }

    @Override // m4p.a, android.database.Cursor
    public final String[] getColumnNames() {
        return this.LLJILJILJ;
    }

    @Override // m4p.a
    public final void LIZIZ(int i) {
        int i2;
        CursorWindow cursorWindow = this.LLJILJIL;
        if (cursorWindow == null || i < (i2 = cursorWindow.mStartPos) || i >= i2 + cursorWindow.LJIIZILJ()) {
            LJFF(i);
        }
    }

    public final void LJFF(int i) {
        String strLJJJ = this.LLJILLL.LL.LJJJ();
        CursorWindow cursorWindow = this.LLJILJIL;
        if (cursorWindow == null) {
            this.LLJILJIL = new CursorWindow(strLJJJ);
        } else {
            cursorWindow.LJFF();
        }
        try {
            if (this.LLJJI == -1) {
                this.LLJJI = this.LLJILLL.LJII(this.LLJILJIL, Math.max(i, 0), i, true);
                this.LLJJIII = this.LLJILJIL.LJIIZILJ();
            } else {
                this.LLJILLL.LJII(this.LLJILJIL, Math.max(i - (this.LLJJIII / 3), 0), i, false);
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            CursorWindow cursorWindow2 = this.LLJILJIL;
            if (cursorWindow2 != null) {
                cursorWindow2.close();
                this.LLJILJIL = null;
            }
            throw e;
        }
    }

    @Override // m4p.a, X.C1ETH, android.database.Cursor
    public final int getColumnIndex(String str) {
        if (this.LLJJIJI == null) {
            String[] strArr = this.LLJILJILJ;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                map.put(strArr[i], Integer.valueOf(i));
            }
            this.LLJJIJI = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Exception exc = new Exception();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requesting column name with table name -- ");
            sbLIZ.append(str);
            Log.LIZIZ("WCDB.SQLiteCursor", C2188811AlT.LIZIZ(sbLIZ), exc);
            str = str.substring(iLastIndexOf + 1);
        }
        Integer num = this.LLJJIJI.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public C908020Zjk(C908010Zjj c908010Zjj, C907980Zjg c907980Zjg) {
        int i = -1;
        this.LLJJ = c908010Zjj;
        this.LLJILLL = c907980Zjg;
        String[] strArr = c907980Zjg.LLILZ;
        this.LLJILJILJ = strArr;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (strArr[i2].equals("_id")) {
                i = i2;
                break;
            }
            i2++;
        }
        this.LLILLJJLI = i;
    }
}
