package X;

import android.widget.TextView;
import kotlin.jvm.internal.AwS376S0200000_10;

/* JADX INFO: renamed from: X.0R1A, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R1A {
    public static final Object LIZ(TextView textView, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        if (textView.isLaidOut() && textView.getLayout() != null) {
            return C2286608xc.LJ(textView.getLayout().getLineCount());
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C0R4F c0r4f = new C0R4F(textView, c2252611DEt, 5);
        textView.addOnAttachStateChangeListener(new C0R48(c0r4f, textView, 12));
        c2252611DEt.LJJII(new AwS376S0200000_10(textView, c0r4f, 99));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
