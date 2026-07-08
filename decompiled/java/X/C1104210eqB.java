package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104210eqB extends RecyclerView.ViewHolder {
    public C1104220eqC LL;
    public final ImageView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;

    public C1104210eqB(View view) {
        int iIntValue;
        super(view);
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.yrv);
        this.LLILLL = (TextView) view.findViewById(R.id.ywa);
        TextView textView = (TextView) view.findViewById(R.id.yw8);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezs, C1385040m98.LIZ(textView.getContext(), true));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textView.setTextColor(iIntValue);
        this.LLILZ = textView;
    }
}
