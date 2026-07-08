package X;

import Y.ACListenerS131S0200000_29;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1139, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1139 extends RecyclerView.ViewHolder {
    public final View LL;
    public final C113D LLILLJJLI;
    public C1324800kZy LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public EffectModel LLILZLL;
    public final /* synthetic */ AnonymousClass1138 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1139(AnonymousClass1138 anonymousClass1138, View view, C113D c113d) {
        super(view);
        this.LLIZ = anonymousClass1138;
        this.LL = view;
        this.LLILLJJLI = c113d;
        ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.l1n).getLayoutParams();
        C113G c113g = anonymousClass1138.LLILLJJLI;
        layoutParams.width = c113g.LJJ + c113g.LJIL;
        C1324800kZy c1324800kZy = (C1324800kZy) view.findViewById(R.id.lfj);
        int iMin = Math.min(C366700EZg.LIZ(60.0d), (int) (((double) C1415610mwR.LIZIZ()) * 0.14d));
        c1324800kZy.getLayoutParams().width = iMin;
        c1324800kZy.getLayoutParams().height = iMin;
        this.LLILLL = c1324800kZy;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zjr);
        tuxTextView.setHorizontalFadingEdgeEnabled(true);
        tuxTextView.setFadingEdgeLength((int) C12ES.LIZJ(4.0f, tuxTextView.getContext()));
        tuxTextView.getLayoutParams().width = anonymousClass1138.LLILLJJLI.LJJ;
        this.LLILZ = tuxTextView;
        C1324800kZy c1324800kZy2 = this.LLILLL;
        if (c1324800kZy2 != null) {
            C786410Ut5.Ka(c1324800kZy2, new ACListenerS131S0200000_29(anonymousClass1138, this, 54));
        }
        View viewFindViewById = view.findViewById(R.id.w4q);
        C1324800kZy c1324800kZy3 = this.LLILLL;
        if (c1324800kZy3 != null) {
            c1324800kZy3.setOnTouchListener(new ViewOnTouchListenerC1657570tEh(1.2f, 100L, viewFindViewById));
        }
        viewFindViewById.getLayoutParams().width = iMin + C366700EZg.LIZ(8.0d);
        viewFindViewById.getLayoutParams().height = viewFindViewById.getLayoutParams().width;
        this.LLILZIL = viewFindViewById;
    }
}
