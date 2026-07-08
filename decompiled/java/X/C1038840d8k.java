package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS81S1300000_16;

/* JADX INFO: renamed from: X.0d8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038840d8k extends FrameLayout implements InterfaceC1038870d8n {
    public final C1749280vcc LL;

    @Override // X.InterfaceC1038870d8n
    public C1038840d8k getView() {
        return this;
    }

    @Override // X.InterfaceC1038870d8n
    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    @Override // X.InterfaceC1038870d8n
    public /* bridge */ /* synthetic */ View getView() {
        getView();
        return this;
    }

    public C1038840d8k(Context context) {
        super(context, null, 0);
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        C786410Ut5.U6(c1749280vcc, new FrameLayout.LayoutParams(-1, -1));
        this.LL = c1749280vcc;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        setClickable(true);
        setFocusable(true);
        addView(c1749280vcc);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    @Override // X.InterfaceC1038870d8n
    public final void LIZ(AwS81S1300000_16 awS81S1300000_16, AwS81S1300000_16 awS81S1300000_162, boolean z, boolean z2) {
        int i;
        int i2;
        if (!z) {
            if (!z2) {
                LIZIZ();
                return;
            }
        } else {
            if (!z2) {
                i = 2131836760;
                i2 = 2131836761;
            }
            C1749280vcc c1749280vcc = this.LL;
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = getContext().getString(i);
            c1722300uv6.LJIIIZ = new C1038850d8l(this, i2, z2, awS81S1300000_162, awS81S1300000_16);
            c1749280vcc.setStatus(c1722300uv6);
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
        }
        i = 2131836762;
        i2 = 2131836763;
        C1749280vcc c1749280vcc2 = this.LL;
        C1722300uv6 c1722300uv62 = new C1722300uv6();
        c1722300uv62.LJI = getContext().getString(i);
        c1722300uv62.LJIIIZ = new C1038850d8l(this, i2, z2, awS81S1300000_162, awS81S1300000_16);
        c1749280vcc2.setStatus(c1722300uv62);
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
    }
}
