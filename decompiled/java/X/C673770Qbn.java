package X;

import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Qbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673770Qbn extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLIZ = 0;
    public final ArrayList<SearchHistory> LL;
    public HashMap<String, Object> LLILLJJLI;
    public final FrameLayout LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;
    public final C01GW LLILZLL;

    public C673770Qbn(final View view) {
        float f;
        Resources resources;
        DisplayMetrics displayMetrics;
        super(view);
        this.LL = new ArrayList<>();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1313));
        this.LLILZLL = c01gwLIZIZ;
        final Context context = view.getContext();
        C0PVJ c0pvj = new C0PVJ(context) { // from class: X.0Qbp
            @Override // X.C0PVJ
            public final void LIZ(boolean z) {
                TuxTextView tuxTextView = this.LLJI.LLILZ;
                if (z) {
                    if (tuxTextView != null) {
                        C786410Ut5.B5(tuxTextView, 0.2f);
                    }
                    C786410Ut5.x5((TuxIconView) view.findViewById(R.id.k58), 0.2f);
                } else {
                    if (tuxTextView != null) {
                        C786410Ut5.B5(tuxTextView, 1.0f);
                    }
                    C786410Ut5.x5((TuxIconView) view.findViewById(R.id.k58), 1.0f);
                }
            }
        };
        c0pvj.LLIZ = new ATListenerS444S0100000_10(this, 23);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.eqx);
        this.LLILLL = frameLayout;
        this.LLILZ = (TuxTextView) view.findViewById(R.id.tv_view_more);
        this.LLILZIL = (TuxIconView) view.findViewById(R.id.k58);
        View view2 = (View) c01gwLIZIZ.getValue();
        if (view2 != null) {
            view2.setOnTouchListener(c0pvj);
        }
        if (frameLayout != null && (resources = frameLayout.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f = (displayMetrics.widthPixels / displayMetrics.density) / 375.0f;
        } else {
            f = 1.0f;
        }
        FrameLayout frameLayout2 = this.LLILLL;
        if (frameLayout2 != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams != null && layoutParams.width > 0) {
                layoutParams.width = (int) (layoutParams.width * f);
            }
            int i = layoutParams.height;
            if (i > 0) {
                layoutParams.height = (int) (i * f);
            }
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
        LinearLayout linearLayout = (LinearLayout) c01gwLIZIZ.getValue();
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 != null && layoutParams2.width > 0) {
                layoutParams2.width = (int) (layoutParams2.width * f);
            }
            int i2 = layoutParams2.height;
            if (i2 > 0) {
                layoutParams2.height = (int) (i2 * f);
            }
            linearLayout.setPaddingRelative((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * f), 0, (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * f), 0);
            C786410Ut5.d6(linearLayout, layoutParams2);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
            if (layoutParams3 != null && layoutParams3.width > 0) {
                layoutParams3.width = (int) (layoutParams3.width * f);
            }
            int i3 = layoutParams3.height;
            if (i3 > 0) {
                layoutParams3.height = (int) (i3 * f);
            }
            tuxTextView.setTextSize(0, tuxTextView.getTextSize() * f);
            C786410Ut5.R6(tuxTextView, layoutParams3);
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams4 = tuxIconView.getLayoutParams();
            if (layoutParams4 != null && layoutParams4.width > 0) {
                layoutParams4.width = (int) (layoutParams4.width * f);
            }
            int i4 = layoutParams4.height;
            if (i4 > 0) {
                layoutParams4.height = (int) (i4 * f);
            }
            C0QAW.LIZIZ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) * f), tuxIconView);
            tuxIconView.setIconWidth((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * f));
            tuxIconView.setIconHeight((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * f));
            C786410Ut5.M6(tuxIconView, layoutParams4);
        }
    }
}
