package X;

import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807000x7i extends AbstractC1807100x7s<C1777900wMm> {
    public final InterfaceC1806580x72 LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final C419890GdH LLILZ;
    public final StyleSpan LLILZIL;
    public final ForegroundColorSpan LLILZLL;
    public final C1864480ycQ LLIZ;

    public C1807000x7i(ViewGroup viewGroup, InterfaceC1807160x7y interfaceC1807160x7y) {
        ForegroundColorSpan foregroundColorSpan;
        super(R.layout.gq9, viewGroup);
        this.LL = interfaceC1807160x7y;
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.swn);
        TextView textView = (TextView) this.itemView.findViewById(R.id.sw3);
        this.LLILLL = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.eya);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLILZ = new C419890GdH(c419910GdJ.LIZ(this.itemView.getContext()), 2);
        this.LLILZIL = new StyleSpan(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ese, this.itemView.getContext());
        if (numLIZJ != null) {
            foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
        } else {
            foregroundColorSpan = null;
        }
        this.LLILZLL = foregroundColorSpan;
        this.LLIZ = new C1864480ycQ(this, 5);
    }
}
