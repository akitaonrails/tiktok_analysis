package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128390fTB extends RecyclerView.ViewHolder {
    public final View LL;
    public final View LLILLJJLI;
    public final TextView LLILLL;
    public final C1324720kZq LLILZ;
    public final GradientDrawable LLILZIL;
    public final GradientDrawable LLILZLL;

    public C1128390fTB(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = view.findViewById(R.id.bnu);
        this.LLILLL = (TextView) view.findViewById(R.id.text);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.res);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(view.getResources().getDisplayMetrics().density * 4.0f);
        gradientDrawable.setColor(C20736316Cj.LIZJ(R.attr.ev4, view));
        this.LLILZIL = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(view.getResources().getDisplayMetrics().density * 4.0f);
        gradientDrawable2.setColor(C20736316Cj.LIZJ(R.attr.cdh, view));
        this.LLILZLL = gradientDrawable2;
    }
}
