package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423190Gib extends C214906198m {
    public final String LL;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        ((C1295960jpS) getContentView().findViewById(R.id.nr8)).pauseAnimation();
    }

    public C423190Gib(Context context, String str) {
        super(context);
        this.LL = str;
        setContentView(C786410Ut5.Sd(R.layout.ano, C786410Ut5.ne(context), null));
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(new BitmapDrawable());
        View viewFindViewById = getContentView().findViewById(R.id.o9n);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.uj, context);
        c384050F3z.LIZJ = Float.valueOf(C0H9H.LIZIZ(12));
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        ((C1295960jpS) getContentView().findViewById(R.id.nr8)).setAnimationFromUrl(this.LL);
        ((C1295960jpS) getContentView().findViewById(R.id.nr8)).playAnimation();
    }
}
