package X;

import android.database.CharArrayBuffer;
import com.tencent.wcdb.CursorWindow;
import m4p.a;

/* JADX INFO: renamed from: X.0Zjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC908030Zjl extends a {
    public CursorWindow LLJILJIL;

    public final void LIZLLL() {
        if (-1 == this.LL || getCount() == this.LL) {
            throw new C2396309aD(this.LL, getCount());
        }
        if (this.LLJILJIL == null) {
            throw new C908090Zjr("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    @Override // m4p.a
    public final void LIZ() {
        super.LIZ();
        CursorWindow cursorWindow = this.LLJILJIL;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.LLJILJIL = null;
        }
    }

    @Override // m4p.a, X.C1ETH, android.database.Cursor
    public final byte[] getBlob(int i) {
        LIZLLL();
        return this.LLJILJIL.LJII(this.LL, i);
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        LIZLLL();
        return this.LLJILJIL.LJIILL(this.LL, i);
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        LIZLLL();
        return (float) this.LLJILJIL.LJIILL(this.LL, i);
    }

    @Override // X.C1ETH, android.database.Cursor
    public final int getInt(int i) {
        LIZLLL();
        return (int) this.LLJILJIL.LJIILLIIL(this.LL, i);
    }

    @Override // m4p.a, X.C1ETH, android.database.Cursor
    public final long getLong(int i) {
        LIZLLL();
        return this.LLJILJIL.LJIILLIIL(this.LL, i);
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        LIZLLL();
        return (short) this.LLJILJIL.LJIILLIIL(this.LL, i);
    }

    @Override // m4p.a, X.C1ETH, android.database.Cursor
    public final String getString(int i) {
        LIZLLL();
        return this.LLJILJIL.LJIJJ(this.LL, i);
    }

    @Override // m4p.a, X.C1ETH, android.database.Cursor
    public final int getType(int i) {
        LIZLLL();
        return this.LLJILJIL.LJIJJLI(this.LL, i);
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        LIZLLL();
        if (this.LLJILJIL.LJIJJLI(this.LL, i) == 0) {
            return true;
        }
        return false;
    }

    @Override // m4p.a, android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        LIZLLL();
        this.LLJILJIL.LJI(this.LL, i, charArrayBuffer);
    }
}
