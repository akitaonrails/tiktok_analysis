package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.service.interest.model.InterestTag;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS167S1200000_26;

/* JADX INFO: renamed from: X.0uud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722010uud extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLIZ = 0;
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final Function2<String, Boolean, Unit> LLILZ;
    public final FrameLayout LLILZIL;
    public final GridLayout LLILZLL;

    public final void I5(int i, int i2, InterestTag interestTag, boolean z) {
        String str;
        int iLIZIZ;
        int i3;
        int iLIZIZ2;
        int i4;
        Context context = this.LLILZIL.getContext();
        if (context != null && interestTag != null && (str = interestTag.id) != null) {
            int i5 = i / 2;
            int i6 = i % 2;
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.spec(i5, 1.0f), GridLayout.spec(i6, 1.0f));
            layoutParams.width = 0;
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
            if (i6 == 0) {
                if (this.LLILLL) {
                    i4 = 16;
                } else {
                    i4 = 24;
                }
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i4));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            }
            layoutParams.setMarginStart(iLIZIZ);
            if (i6 == 0) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            } else {
                if (this.LLILLL) {
                    i3 = 16;
                } else {
                    i3 = 24;
                }
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3));
            }
            layoutParams.setMarginEnd(iLIZIZ2);
            if (i5 > 0) {
                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            }
            if (i5 < i2 - 1) {
                layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            }
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setText(interestTag.text);
            tuxTextView.setTuxFont(102);
            tuxTextView.setTextColor(-1);
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.setGravity(8388627);
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 26);
            tuxTextView.setSelected(Intrinsics.LJFF(interestTag.selected, Boolean.TRUE));
            if (!z) {
                tuxTextView.setBackgroundResource(R.drawable.bao);
                C786410Ut5.I7(new AbS167S1200000_26(tuxTextView, str, this, 0), tuxTextView);
            }
            GridLayout gridLayout = this.LLILZLL;
            if (gridLayout != null) {
                gridLayout.addView(tuxTextView);
            }
        }
    }

    public C1722010uud(int i, int i2, View view, Function2 function2, boolean z) {
        super(view);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = function2;
        FrameLayout frameLayout = (FrameLayout) view;
        this.LLILZIL = frameLayout;
        GridLayout gridLayout = (GridLayout) frameLayout.findViewById(R.id.kwt);
        this.LLILZLL = gridLayout;
        if (gridLayout != null) {
            gridLayout.setRowCount(i);
            gridLayout.setColumnCount(i2);
        }
    }
}
