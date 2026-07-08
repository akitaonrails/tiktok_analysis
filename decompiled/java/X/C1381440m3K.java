package X;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0m3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381440m3K {
    public final C21560119Zf LIZ;
    public final Context LIZIZ;

    public final DialogInterfaceC21560019Ze LIZIZ() {
        DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ = this.LIZ.LIZ();
        C786410Ut5.D4(dialogInterfaceC21560019ZeLIZ);
        return dialogInterfaceC21560019ZeLIZ;
    }

    public C1381440m3K(Context context) {
        this.LIZIZ = context;
        this.LIZ = new C21560119Zf(context, R.style.ak);
    }

    public final void LIZ(final CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        C21560119Zf c21560119Zf = this.LIZ;
        final Context context = this.LIZIZ;
        ArrayAdapter<CharSequence> arrayAdapter = new ArrayAdapter<CharSequence>(context, charSequenceArr) { // from class: X.0m3L
            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public final long getItemId(int i) {
                return i;
            }

            @Override // android.widget.BaseAdapter, android.widget.Adapter
            public final boolean hasStableIds() {
                return true;
            }
        };
        C21560219Zg c21560219Zg = c21560119Zf.LIZ;
        c21560219Zg.LJIIZILJ = arrayAdapter;
        c21560219Zg.LJIJ = onClickListener;
    }
}
