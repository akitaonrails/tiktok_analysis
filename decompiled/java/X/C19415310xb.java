package X;

import Y.ACListenerS163S0100000_29;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19415310xb extends RecyclerView.ViewHolder {
    public final C1324800kZy LL;
    public final C19471411Fw LLILLJJLI;
    public final View LLILLL;
    public final /* synthetic */ C19415210xa LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19415310xb(C19415210xa c19415210xa, View view) {
        super(view);
        this.LLILZ = c19415210xa;
        C1324800kZy c1324800kZy = (C1324800kZy) view.findViewById(R.id.w65);
        this.LL = c1324800kZy;
        C19471411Fw c19471411Fw = (C19471411Fw) view.findViewById(R.id.w7k);
        this.LLILLJJLI = c19471411Fw;
        View viewFindViewById = view.findViewById(R.id.w4q);
        this.LLILLL = viewFindViewById;
        c19471411Fw.setStatusTextColor(C960203pA.LIZ(R.attr.a04, view.getContext()));
        c19471411Fw.LJJJI();
        c19471411Fw.setHorizontalFadingEdgeEnabled(true);
        c19471411Fw.setFadingEdgeLength((int) C12ES.LIZJ(4.0f, c19471411Fw.getContext()));
        C786410Ut5.Ka(c1324800kZy, new ACListenerS163S0100000_29(this, 42));
        c1324800kZy.setOnTouchListener(new ViewOnTouchListenerC1657570tEh(1.2f, 100L, viewFindViewById));
    }
}
