package X;

import X.C20147913sT;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: renamed from: X.13sU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20148013sU extends AbstractC20147813sS<Cursor> {
    public final C20147913sT<Cursor>.a LJIIJJI;
    public final Uri LJIIL;
    public final String[] LJIILIIL;
    public final String LJIILJJIL;
    public final String[] LJIILL;
    public final String LJIILLIIL;
    public Cursor LJIIZILJ;
    public C20148513sZ LJIJ;

    @Override // X.AbstractC20147813sS
    public final void LJIIIIZZ() {
        synchronized (this) {
            try {
                C20148513sZ c20148513sZ = this.LJIJ;
                if (c20148513sZ != null) {
                    c20148513sZ.LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public Cursor LJIILIIL() {
        synchronized (this) {
            try {
                if (this.LJIIJ != null) {
                    throw new C741250T5v();
                }
                this.LJIJ = new C20148513sZ();
            } finally {
            }
        }
        try {
            ContentResolver contentResolver = this.LIZJ.getContentResolver();
            Uri uri = this.LJIIL;
            String[] strArr = this.LJIILIIL;
            String str = this.LJIILJJIL;
            String[] strArr2 = this.LJIILL;
            String str2 = this.LJIILLIIL;
            C20148513sZ c20148513sZ = this.LJIJ;
            try {
                Cursor cursorLJJIZ = C2204961BRm.LJJIZ(contentResolver, uri, strArr, str, strArr2, str2, c20148513sZ != null ? (CancellationSignal) c20148513sZ.LIZIZ() : null, new C0WZX("dTF6Tg0zW9KSVlgzQFyHafvE/Tf/OUpTd+iHfTByTMhXCK1D0FD5c7wmJQ==", new String[]{"01789"}));
                if (cursorLJJIZ != null) {
                    try {
                        cursorLJJIZ.getCount();
                        cursorLJJIZ.registerContentObserver(this.LJIIJJI);
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        cursorLJJIZ.close();
                        throw e;
                    }
                }
                synchronized (this) {
                    try {
                        this.LJIJ = null;
                    } finally {
                    }
                }
                return cursorLJJIZ;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (e2 instanceof OperationCanceledException) {
                    throw new C741250T5v();
                }
                throw e2;
            }
        } catch (Throwable th) {
            synchronized (this) {
                try {
                    this.LJIJ = null;
                    throw th;
                } finally {
                }
            }
        }
    }

    @Override // X.C20147913sT
    public final void LJI() {
        Cursor cursor = this.LJIIZILJ;
        if (cursor != null) {
            LIZIZ(cursor);
        }
        boolean z = this.LJI;
        this.LJI = false;
        this.LJII |= z;
        if (z || this.LJIIZILJ == null) {
            LIZLLL();
        }
    }

    @Override // X.C20147913sT
    public final void LJFF() {
        LIZ();
        Cursor cursor = this.LJIIZILJ;
        if (cursor != null && !cursor.isClosed()) {
            this.LJIIZILJ.close();
        }
        this.LJIIZILJ = null;
    }

    @Override // X.C20147913sT
    public final void LJII() {
        LIZ();
    }

    @Override // X.AbstractC20147813sS
    public final void LJIIJJI(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 != null && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    @Override // X.C20147913sT
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    public final void LIZIZ(Cursor cursor) {
        if (this.LJFF) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.LJIIZILJ;
        this.LJIIZILJ = cursor;
        if (this.LIZLLL) {
            super.LIZIZ(cursor);
        }
        if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    @Override // X.AbstractC20147813sS, X.C20147913sT
    public final void LIZJ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.LIZJ(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.LJIIL);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.LJIILIIL));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.LJIILJJIL);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.LJIILL));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.LJIILLIIL);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.LJIIZILJ);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.LJI);
    }

    public C20148013sU(Context context, Uri uri, String[] strArr, String str, String[] strArr2) {
        super(context);
        this.LJIIJJI = new C20147913sT.a();
        this.LJIIL = uri;
        this.LJIILIIL = strArr;
        this.LJIILJJIL = str;
        this.LJIILL = strArr2;
        this.LJIILLIIL = "datetaken DESC";
    }
}
