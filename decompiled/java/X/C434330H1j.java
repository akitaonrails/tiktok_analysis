package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434330H1j {
    public static final C434330H1j LIZ = new C434330H1j();

    public static void LIZIZ(View view, ImageView imageView) {
        Drawable drawableMutate;
        C500260Jjc.LLFFF(imageView);
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.exs, view.getContext());
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.e94, view.getContext());
        if (c20743516FdLIZLLL != null && (drawableMutate = c20743516FdLIZLLL.mutate()) != null) {
            C16GF.LJI(drawableMutate, iLIZIZ);
            imageView.setImageDrawable(drawableMutate);
        }
    }

    public static void LIZ(long j, TextView textView, boolean z) {
        if (z) {
            C500260Jjc.LLFFF(textView);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append('s');
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C500260Jjc.LJIILIIL(textView);
    }
}
