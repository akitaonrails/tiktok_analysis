package X;

import android.graphics.Color;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337210DJv extends RecyclerView.ViewHolder {
    public C322460CkW LL;
    public InterfaceC337190DJt LLILLJJLI;
    public final SmartImageView LLILLL;
    public final View LLILZ;
    public final C0HZQ LLILZIL;
    public final SmartImageView LLILZLL;
    public final C426320Gne LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxIconView LLJ;
    public final TuxTextView LLJI;
    public final TuxIconView LLJIJIL;
    public final ViewGroup LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final TuxTag LLJJ;
    public final String LLJJI;

    public C337210DJv(View view) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        int iIntValue2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super(view);
        this.LLILLL = (SmartImageView) view.findViewById(R.id.cover);
        this.LLILZ = view.findViewById(R.id.c2k);
        C0HZQ c0hzq = (C0HZQ) view.findViewById(R.id.ukj);
        this.LLILZIL = c0hzq;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.jzb);
        this.LLILZLL = smartImageView;
        this.LLIZ = (C426320Gne) view.findViewById(R.id.nn_);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.nn9);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.nn8);
        this.LLJ = tuxIconView;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.p09);
        this.LLJI = tuxTextView;
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.ary);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.fop);
        this.LLJILJIL = viewGroup;
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.fp_);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.fph);
        this.LLJILLL = tuxTextView2;
        this.LLJJ = (TuxTag) view.findViewById(R.id.mld);
        if (a0.LJJIZ(NumberFormat.getPercentInstance().format(0L), ' ', 0, false, 6) == -1) {
            str = "";
        } else {
            str = " ";
        }
        this.LLJJI = str;
        this.itemView.setHapticFeedbackEnabled(false);
        Size size = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
        C786410Ut5.LJLZ(8, viewGroup);
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        }
        View viewFindViewById = this.itemView.findViewById(R.id.yac);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, viewFindViewById.getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            int i = (iIntValue2 >> 16) & 255;
            int i2 = (iIntValue2 >> 8) & 255;
            int i3 = iIntValue2 & 255;
            viewFindViewById.setBackground(C335840DEo.LIZ(Color.argb(128, i, i2, i3), Color.argb(1, i, i2, i3)));
        }
        View viewFindViewById2 = this.itemView.findViewById(R.id.cdp);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e1, viewFindViewById2.getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            int i4 = (iIntValue >> 16) & 255;
            int i5 = (iIntValue >> 8) & 255;
            int i6 = iIntValue & 255;
            viewFindViewById2.setBackground(C335840DEo.LIZ(Color.argb(1, i4, i5, i6), Color.argb(128, i4, i5, i6)));
        }
        tuxTextView2.setTuxFont(62);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = size.getWidth();
            layoutParams2.height = size.getHeight();
            C786410Ut5.G6(this.LLILZLL, layoutParams2);
        }
        smartImageView.getHierarchy().LJJIII(C1331100kk8.LIZLLL(iLIZIZ));
        ViewGroup.LayoutParams layoutParams3 = c0hzq.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        }
        tuxTextView.setTuxFont(62);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
        tuxIconView.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
    }
}
