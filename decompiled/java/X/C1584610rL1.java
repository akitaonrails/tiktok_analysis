package X;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0rL1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584610rL1 implements InterfaceC1583070rIX {
    public final View LL;
    public final String LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1584620rL2(this));

    @Override // X.InterfaceC1583070rIX
    public final float getTextWidth() {
        TextPaint paint = ((TextView) this.LLILLL.getValue()).getPaint();
        if (paint != null) {
            return paint.measureText(this.LLILLJJLI);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1583070rIX
    public final int LIZ() {
        return getView().getWidth();
    }

    @Override // X.InterfaceC1583070rIX
    public final View getView() {
        return this.LL;
    }

    @Override // X.InterfaceC1583070rIX
    public final void setText(String str) {
        ((TextView) this.LLILLL.getValue()).setText(str);
    }

    public C1584610rL1(View view, String str) {
        this.LL = view;
        this.LLILLJJLI = str;
    }
}
