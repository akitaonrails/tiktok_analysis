package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19286310cn extends RecyclerView.ViewHolder {
    public final View LL;

    public C19286310cn(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(view);
        this.LL = view;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.hn);
        int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R.dimen.hi);
        int dimensionPixelSize3 = view.getContext().getResources().getDimensionPixelSize(R.dimen.hj);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.pqq);
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if ((layoutParams instanceof RecyclerView.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (C19286010ck.LIZJ()) {
                if (C14LC.LJIIIZ) {
                    marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), dimensionPixelSize, marginLayoutParams.getMarginEnd(), dimensionPixelSize2);
                } else {
                    marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), dimensionPixelSize, marginLayoutParams.getMarginEnd(), dimensionPixelSize3);
                }
            }
            C786410Ut5.d6(linearLayout, marginLayoutParams);
        }
    }
}
