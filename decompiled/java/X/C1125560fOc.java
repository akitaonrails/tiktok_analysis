package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0fOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125560fOc extends FrameLayout implements InterfaceC1125550fOb {
    public final View LL;
    public final C16F5 LLILLJJLI;
    public final C16FV LLILLL;
    public String LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public ImageModel LLIZ;

    public C1125560fOc(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.gnr, this);
        View viewFindViewById = findViewById(R.id.myn);
        this.LL = viewFindViewById;
        C16F5 c16f5 = (C16F5) findViewById(R.id.tv_progress);
        c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, context));
        this.LLILLJJLI = c16f5;
        this.LLILLL = (C16FV) findViewById(R.id.lto);
        Integer numLIZ = C1135270feH.LIZ(R.attr.ezl, context);
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -13816531;
        }
        viewFindViewById.setBackgroundColor(iIntValue);
    }

    public final void LIZ(long j, long j2) {
        int iIntValue;
        int iIntValue2;
        SpannableString spannableString;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateProgress: progress ");
        sbLIZ.append(j);
        sbLIZ.append(", target ");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("LiveGoalBubble", C2188811AlT.LIZIZ(sbLIZ));
        Integer numLIZ = C1135270feH.LIZ(R.attr.ezq, getContext());
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -592138;
        }
        this.LLILZIL = j;
        this.LLILZLL = j2;
        if (j >= j2) {
            this.LLILLJJLI.setText(C497740JfY.LJIJI(2131852572));
            this.LLILLJJLI.setTextColor(iIntValue);
            return;
        }
        Integer numLIZ2 = C1135270feH.LIZ(R.attr.ezt, getContext());
        if (numLIZ2 != null) {
            iIntValue2 = numLIZ2.intValue();
        } else {
            iIntValue2 = -1711276033;
        }
        this.LLILLJJLI.setTextColor(iIntValue2);
        if (C497740JfY.LJJ()) {
            spannableString = new SpannableString(C786410Ut5.k4(Locale.US, "%d/%d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j)}, 2)));
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), String.valueOf(j2).length() + 1, spannableString.toString().length(), 33);
        } else {
            spannableString = new SpannableString(C786410Ut5.k4(Locale.US, "%d/%d", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, 2)));
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, String.valueOf(j).length(), 33);
        }
        this.LLILLJJLI.setText(spannableString);
    }
}
