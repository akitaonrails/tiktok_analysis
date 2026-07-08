package Y;

import X.C1150160g2I;
import X.C1806860x7U;
import X.C1806930x7b;
import X.C1807010x7j;
import X.C1807050x7n;
import X.C1807170x7z;
import X.C1864460ycO;
import X.C20736316Cj;
import X.C20744116Fj;
import X.C2188811AlT;
import X.C416760GVu;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public class AObserverS32S0500000_27 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS32S0500000_27 aObserverS32S0500000_27, Object obj) {
        C1806930x7b c1806930x7b = (C1806930x7b) obj;
        ((TextView) aObserverS32S0500000_27.l0).setText(c1806930x7b.LIZJ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1806930x7b.LIZLLL);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        spannableStringBuilder.append((CharSequence) strLIZIZ);
        if (((C1807010x7j) aObserverS32S0500000_27.l1).LLILZ != null && c1806930x7b.LJ) {
            C1864460ycO c1864460ycO = new C1864460ycO((C1806860x7U) aObserverS32S0500000_27.l4, (C1807010x7j) aObserverS32S0500000_27.l1, 0);
            spannableStringBuilder.append((CharSequence) "{voucherdetail}");
            C1150160g2I c1150160g2I = new C1150160g2I();
            c1150160g2I.LIZ(new C416760GVu(((C1807010x7j) aObserverS32S0500000_27.l1).LLILZ));
            c1150160g2I.LIZ(c1864460ycO);
            c1150160g2I.LIZIZ = strLIZIZ.length();
            c1150160g2I.LIZJ = strLIZIZ.length() + 15;
            c1150160g2I.LIZIZ(spannableStringBuilder);
        }
        boolean z = false;
        if (c1806930x7b.LIZIZ) {
            ((TextView) aObserverS32S0500000_27.l0).setTextColor(C20736316Cj.LIZIZ(R.attr.ewz, ((C1807010x7j) aObserverS32S0500000_27.l1).itemView.getContext()));
            ((TextView) aObserverS32S0500000_27.l2).setTextColor(C20736316Cj.LIZIZ(R.attr.ewz, ((C1807010x7j) aObserverS32S0500000_27.l1).itemView.getContext()));
            C1807170x7z.LIZ((TextView) aObserverS32S0500000_27.l0, ((C1807010x7j) aObserverS32S0500000_27.l1).LLILLL);
            ((C20744116Fj) aObserverS32S0500000_27.l3).setEnabled(false);
        } else {
            ((TextView) aObserverS32S0500000_27.l0).setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, ((C1807010x7j) aObserverS32S0500000_27.l1).itemView.getContext()));
            ((TextView) aObserverS32S0500000_27.l2).setTextColor(C20736316Cj.LIZIZ(R.attr.ex7, ((C1807010x7j) aObserverS32S0500000_27.l1).itemView.getContext()));
            C1807170x7z.LIZ((TextView) aObserverS32S0500000_27.l0, ((C1807010x7j) aObserverS32S0500000_27.l1).LLILLJJLI);
            ((C20744116Fj) aObserverS32S0500000_27.l3).setEnabled(true);
        }
        ((TextView) aObserverS32S0500000_27.l2).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) aObserverS32S0500000_27.l2).setText(spannableStringBuilder);
        C20744116Fj c20744116Fj = (C20744116Fj) aObserverS32S0500000_27.l3;
        if (c1806930x7b.LIZ && !c1806930x7b.LIZIZ) {
            z = true;
        }
        c20744116Fj.setChecked(z);
    }

    public static final void onChanged$1(AObserverS32S0500000_27 aObserverS32S0500000_27, Object obj) {
        C1806930x7b c1806930x7b = (C1806930x7b) obj;
        ((TextView) aObserverS32S0500000_27.l0).setText(c1806930x7b.LIZJ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1806930x7b.LIZLLL);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        spannableStringBuilder.append((CharSequence) strLIZIZ);
        if (((C1807050x7n) aObserverS32S0500000_27.l1).LLILZIL != null && c1806930x7b.LJ) {
            C1864460ycO c1864460ycO = new C1864460ycO((C1806860x7U) aObserverS32S0500000_27.l4, (C1807050x7n) aObserverS32S0500000_27.l1, 1);
            spannableStringBuilder.append((CharSequence) "{voucherdetail}");
            C1150160g2I c1150160g2I = new C1150160g2I();
            c1150160g2I.LIZ(new C416760GVu(((C1807050x7n) aObserverS32S0500000_27.l1).LLILZIL));
            c1150160g2I.LIZ(c1864460ycO);
            c1150160g2I.LIZIZ = strLIZIZ.length();
            c1150160g2I.LIZJ = strLIZIZ.length() + 15;
            c1150160g2I.LIZIZ(spannableStringBuilder);
        }
        boolean z = false;
        if (c1806930x7b.LIZIZ) {
            ((TextView) aObserverS32S0500000_27.l0).setTextColor(C20736316Cj.LIZIZ(R.attr.ewz, ((C1807050x7n) aObserverS32S0500000_27.l1).itemView.getContext()));
            ((TextView) aObserverS32S0500000_27.l2).setTextColor(C20736316Cj.LIZIZ(R.attr.ewz, ((C1807050x7n) aObserverS32S0500000_27.l1).itemView.getContext()));
            C1807170x7z.LIZ((TextView) aObserverS32S0500000_27.l0, ((C1807050x7n) aObserverS32S0500000_27.l1).LLILZ);
            ((C20744116Fj) aObserverS32S0500000_27.l3).setEnabled(false);
        } else {
            ((TextView) aObserverS32S0500000_27.l0).setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, ((C1807050x7n) aObserverS32S0500000_27.l1).itemView.getContext()));
            ((TextView) aObserverS32S0500000_27.l2).setTextColor(C20736316Cj.LIZIZ(R.attr.ex7, ((C1807050x7n) aObserverS32S0500000_27.l1).itemView.getContext()));
            C1807170x7z.LIZ((TextView) aObserverS32S0500000_27.l0, ((C1807050x7n) aObserverS32S0500000_27.l1).LLILLL);
            ((C20744116Fj) aObserverS32S0500000_27.l3).setEnabled(true);
        }
        ((TextView) aObserverS32S0500000_27.l2).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) aObserverS32S0500000_27.l2).setText(spannableStringBuilder);
        C20744116Fj c20744116Fj = (C20744116Fj) aObserverS32S0500000_27.l3;
        if (c1806930x7b.LIZ && !c1806930x7b.LIZIZ) {
            z = true;
        }
        c20744116Fj.setChecked(z);
    }

    public AObserverS32S0500000_27(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
