package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.ui.MatisseActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.147M, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C147M {
    public CursorAdapter LIZ;
    public TextView LIZIZ;
    public final C21553019Wm LIZJ;
    public MatisseActivity LIZLLL;

    public C147M(Context context) {
        C21553019Wm c21553019Wm = new C21553019Wm(context, null, R.attr.c5a, 0);
        this.LIZJ = c21553019Wm;
        c21553019Wm.LLJJJJJIL = true;
        c21553019Wm.LLJJJJLIIL.setFocusable(true);
        float f = context.getResources().getDisplayMetrics().density;
        c21553019Wm.LIZLLL((int) (216.0f * f));
        c21553019Wm.LLILZLL = (int) (16.0f * f);
        c21553019Wm.LJIIIIZZ((int) (f * (-48.0f)));
        c21553019Wm.LLJJI = new AdapterView.OnItemClickListener() { // from class: X.1477
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.LL.LIZ(i, adapterView.getContext());
                MatisseActivity matisseActivity = this.LL.LIZLLL;
                if (matisseActivity != null) {
                    matisseActivity.onItemSelected(adapterView, view, i, j);
                }
            }
        };
    }

    public final void LIZ(int i, Context context) {
        this.LIZJ.dismiss();
        Cursor cursor = this.LIZ.getCursor();
        cursor.moveToPosition(i);
        String strLIZ = Album.LIZJ(cursor).LIZ(context);
        if (this.LIZIZ.getVisibility() == 0) {
            this.LIZIZ.setText(strLIZ);
            return;
        }
        C786410Ut5.S4(0.0f, this.LIZIZ);
        C786410Ut5.LLIL(this.LIZIZ, 0);
        this.LIZIZ.setText(strLIZ);
        this.LIZIZ.animate().alpha(1.0f).setDuration(context.getResources().getInteger(android.R.integer.config_longAnimTime)).start();
    }
}
