package X;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: X.13sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20148713sb extends C20148013sU {
    public static final Uri LJIJJ = MediaStore.Files.getContentUri("external");
    public static final String[] LJIJJLI = {"_id", "_display_name", "mime_type", "_size", "duration"};
    public static final String[] LJIL = {String.valueOf(1), String.valueOf(3)};
    public final boolean LJIJI;

    @Override // X.C20147913sT
    public final void LJ() {
    }

    @Override // X.AbstractC20147813sS
    public final Cursor LJIIJ() {
        Cursor cursorLJIILIIL = super.LJIILIIL();
        if (!this.LJIJI || !C786410Ut5.N3(this.LIZJ).getPackageManager().hasSystemFeature("android.hardware.camera")) {
            return cursorLJIILIIL;
        }
        MatrixCursor matrixCursor = new MatrixCursor(LJIJJLI);
        matrixCursor.addRow(new Object[]{-1L, "Capture", "", 0, 0});
        return new MergeCursor(new Cursor[]{matrixCursor, cursorLJIILIIL});
    }

    public C20148713sb(Context context, String str, String[] strArr, boolean z) {
        super(context, LJIJJ, LJIJJLI, str, strArr);
        this.LJIJI = z;
    }
}
