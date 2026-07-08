package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0lvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376730lvj extends ConstraintLayout {
    public C1376920lw2 LL;
    public final TextView LLILLJJLI;

    public C1376730lvj(Context context) {
        super(context);
        C786410Ut5.LJLLJ(getContext(), R.layout.b85, this);
        ImageView imageView = (ImageView) findViewById(R.id.l_a);
        findViewById(R.id.lc0);
        this.LLILLJJLI = (TextView) findViewById(R.id.text);
        C786410Ut5.Q7(imageView, new ACListenerS155S0100000_21(this, 135));
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0lvk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        a aVar = new a(C1848410yCV.LIZ ? new f(onClickListener) : onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
