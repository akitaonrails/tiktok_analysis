package X;

import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Qbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673780Qbo extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILZIL = 0;
    public final ArrayList<SearchHistory> LL;
    public HashMap<String, Object> LLILLJJLI;
    public final TuxTextView LLILLL;
    public final LinearLayout LLILZ;

    public C673780Qbo(final View view) {
        float f;
        Resources resources;
        DisplayMetrics displayMetrics;
        super(view);
        this.LL = new ArrayList<>();
        final Context context = view.getContext();
        C0PVJ c0pvj = new C0PVJ(context) { // from class: X.0Qbq
            @Override // X.C0PVJ
            public final void LIZ(boolean z) {
                if (z) {
                    C786410Ut5.B5((TuxTextView) view.findViewById(R.id.zdt), 0.2f);
                } else {
                    C786410Ut5.B5((TuxTextView) view.findViewById(R.id.zdt), 1.0f);
                }
            }
        };
        c0pvj.LLIZ = new ATListenerS444S0100000_10(this, 22);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.eqx);
        this.LLILZ = linearLayout;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zdt);
        this.LLILLL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setOnTouchListener(c0pvj);
        }
        if (linearLayout != null && (resources = linearLayout.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f = (displayMetrics.widthPixels / displayMetrics.density) / 375.0f;
        } else {
            f = 1.0f;
        }
        LinearLayout linearLayout2 = this.LLILZ;
        if (linearLayout2 != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            if (layoutParams != null && layoutParams.width > 0) {
                layoutParams.width = (int) (layoutParams.width * f);
            }
            int i = layoutParams.height;
            if (i > 0) {
                layoutParams.height = (int) (i * f);
            }
            C786410Ut5.d6(linearLayout2, layoutParams);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            ViewGroup.LayoutParams layoutParams2 = tuxTextView2.getLayoutParams();
            if (layoutParams2 != null && layoutParams2.width > 0) {
                layoutParams2.width = (int) (layoutParams2.width * f);
            }
            int i2 = layoutParams2.height;
            if (i2 > 0) {
                layoutParams2.height = (int) (i2 * f);
            }
            tuxTextView2.setTextSize(0, tuxTextView2.getTextSize() * f);
            C786410Ut5.R6(tuxTextView2, layoutParams2);
        }
    }
}
