package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C749800Tb8 {
    public final Context LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;

    public C749800Tb8(Context context) {
        if (context != null) {
            this.LIZ = context;
            return;
        }
        throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
    }

    public static C749800Tb8 LIZ(Context context) {
        C749800Tb8 c749800Tb8 = new C749800Tb8(context);
        TextView textView = (TextView) C786410Ut5.Sd(R.layout.h78, C786410Ut5.ne(context), null);
        textView.setText(2131851920);
        c749800Tb8.LIZJ = textView;
        TextView textView2 = (TextView) C786410Ut5.Sd(R.layout.h77, C786410Ut5.ne(context), null);
        textView2.setText(2131853470);
        c749800Tb8.LIZIZ = textView2;
        TextView textView3 = (TextView) C786410Ut5.Sd(R.layout.h77, C786410Ut5.ne(context), null);
        textView3.setText(2131851924);
        C786410Ut5.I7(null, textView3);
        c749800Tb8.LIZLLL = textView3;
        return c749800Tb8;
    }
}
