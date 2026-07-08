package X;

import Y.ARunnableS125S0100000_25;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0svY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645700svY extends RelativeLayout {
    public static final float LLILZ = C11VU.LIZ(35.0f);
    public TextView LL;
    public TextView LLILLJJLI;
    public final ARunnableS125S0100000_25 LLILLL;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    public C1645700svY(Context context) {
        super(context, null, 0);
        this.LLILLL = new ARunnableS125S0100000_25(this, 77);
        RelativeLayout.inflate(getContext(), R.layout.fv2, this);
        this.LL = (TextView) findViewById(R.id.i0s);
        this.LLILLJJLI = (TextView) findViewById(R.id.uht);
        C786410Ut5.S4(1.0f, this.LL);
        C786410Ut5.S4(1.0f, this.LLILLJJLI);
        C786410Ut5.LLIL(this.LLILLJJLI, 0);
        C786410Ut5.LLIL(this.LL, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
