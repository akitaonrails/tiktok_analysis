package X;

import android.content.Context;
import android.widget.Toast;
import com.zhihu.matisse.internal.ui.widget.IncapableDialog;

/* JADX INFO: renamed from: X.1474, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1474 {
    public final int LIZ;
    public final String LIZIZ;

    public AnonymousClass1474(String str) {
        this.LIZIZ = str;
    }

    public AnonymousClass1474(String str, int i) {
        this.LIZ = 1;
        this.LIZIZ = str;
    }

    public static void LIZ(Context context, AnonymousClass1474 anonymousClass1474) {
        if (anonymousClass1474 == null) {
            return;
        }
        int i = anonymousClass1474.LIZ;
        if (i != 1) {
            if (i != 2) {
                C786410Ut5.re(Toast.makeText(context, anonymousClass1474.LIZIZ, 0));
                return;
            }
            return;
        }
        IncapableDialog.MR(null, anonymousClass1474.LIZIZ).show(((C19EG) context).getSupportFragmentManager(), IncapableDialog.class.getName());
    }
}
