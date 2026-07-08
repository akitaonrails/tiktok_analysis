package X;

import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.18sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21422618sa extends C21432818uE {
    public final Set<String> LJFF = new LinkedHashSet();

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZIZ(TextView textView) {
        View view;
        Object parent = textView.getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            view.setTag(R.id.o0m, null);
        }
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            C089E c089e = new C089E(spanned.getSpans(0, spanned.length(), InterfaceC1859630yUb.class));
            while (c089e.hasNext()) {
                ((InterfaceC1859630yUb) c089e.next()).LIZJ(textView);
            }
        }
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZJ(C21433918uP c21433918uP) {
        C21439618vK c21439618vK = new C21439618vK();
        c21439618vK.LIZ.addAll(this.LJFF);
        c21433918uP.LIZ(c21439618vK);
    }
}
