package X;

import Y.ACListenerS118S0200000_15;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0at5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952250at5 extends AbstractC960470b6L<C953770avX> {
    public final Function1<C953770avX, Unit> LL;

    public C952250at5(View view, Function1 function1) {
        super(view);
        this.LL = function1;
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int iLIZIZ;
        C953770avX c953770avX = (C953770avX) obj;
        View view = this.itemView;
        if (i == 0) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        }
        C500260Jjc.LJLJL(iLIZIZ, view);
        C1322090kVb c1322090kVb = (C1322090kVb) view.findViewById(R.id.k55);
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.wgz);
        C16FS c16fs = (C16FS) view.findViewById(R.id.use_btn);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C497740JfY.LIZLLL(R.attr.exw, C915980Zwa.LIZJ().context()));
        c1322090kVb.setBackground(gradientDrawable);
        c1322090kVb.setImageBitmap(BitmapFactory.decodeFile(c953770avX.LJ));
        String strLJIJI = c953770avX.LJIIIZ;
        if (strLJIJI.length() == 0) {
            strLJIJI = C497740JfY.LJIJI(2131853998);
        }
        textView.setText(strLJIJI);
        textView2.setText(new SimpleDateFormat("MMMM d, h:mm a", Locale.getDefault()).format(new Date(c953770avX.LIZJ)));
        c16fs.setText(2131853999);
        C786410Ut5.x3(c16fs.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC346410Di3(c16fs, 3));
        C786410Ut5.h8(c16fs, new ACListenerS118S0200000_15(c953770avX, this, 65));
    }
}
