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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fOZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125530fOZ extends FrameLayout implements InterfaceC1125550fOb {
    public final View LL;
    public final C16F5 LLILLJJLI;
    public final C16FV LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public ImageModel LLIZLLLIL;

    public final long getTargetNum() {
        return this.LLILZIL ? this.LLILZLL + this.LLIZ : this.LLILZLL;
    }

    public C1125530fOZ(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        this.LLILZIL = true;
        FrameLayout.inflate(context, R.layout.gnp, this);
        View viewFindViewById = findViewById(R.id.ixb);
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

    public static void LIZ(C1125530fOZ c1125530fOZ, Long l, Long l2, boolean z, Long l3, String str, Boolean bool, Integer num, Long l4, int i) {
        int iIntValue;
        int iIntValue2;
        SpannableString spannableString;
        long jLongValue;
        Long l5 = l2;
        Long l6 = l4;
        Boolean bool2 = bool;
        String str2 = str;
        Integer num2 = null;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l5 = null;
        }
        if ((i & 8) != 0) {
            l3 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if ((i & 64) == 0) {
            num2 = num;
        }
        if ((i & 128) != 0) {
            l6 = 0L;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateProgress: progressTemp ");
        sbLIZ.append(l);
        sbLIZ.append(", leftNumTemp ");
        sbLIZ.append(l5);
        sbLIZ.append(", ");
        sbLIZ.append(c1125530fOZ.LLILZLL);
        sbLIZ.append(", ");
        sbLIZ.append(c1125530fOZ.LLIZ);
        sbLIZ.append(", ");
        sbLIZ.append(num2);
        C20441214yg.LIZIZ("GiftGalleryBubble", C2188811AlT.LIZIZ(sbLIZ));
        c1125530fOZ.LLILZ = str2;
        c1125530fOZ.LLILZIL = z;
        if (l5 != null && l != null) {
            c1125530fOZ.LLIZ = l5.longValue();
            c1125530fOZ.LLILZLL = l.longValue();
        } else {
            long j = c1125530fOZ.LLIZ;
            if (j > 0 && num2 != null) {
                c1125530fOZ.LLIZ = j - ((long) num2.intValue());
                c1125530fOZ.LLILZLL += (long) num2.intValue();
            }
        }
        long j2 = c1125530fOZ.LLILZLL + c1125530fOZ.LLIZ;
        Integer numLIZ = C1135270feH.LIZ(R.attr.ezq, c1125530fOZ.getContext());
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -592138;
        }
        if (c1125530fOZ.LLILZLL >= j2) {
            c1125530fOZ.LLILLJJLI.setText(C497740JfY.LJIJI(2131852573));
            c1125530fOZ.LLILLJJLI.setTextColor(iIntValue);
        } else if (!z) {
            c1125530fOZ.LLILLJJLI.setText(C497740JfY.LJIJI(2131841881));
            c1125530fOZ.LLILLJJLI.setTextColor(iIntValue);
        } else {
            Integer numLIZ2 = C1135270feH.LIZ(R.attr.ezt, c1125530fOZ.getContext());
            if (numLIZ2 != null) {
                iIntValue2 = numLIZ2.intValue();
            } else {
                iIntValue2 = -1711276033;
            }
            c1125530fOZ.LLILLJJLI.setTextColor(iIntValue2);
            if (C497740JfY.LJJ()) {
                spannableString = new SpannableString(C786410Ut5.k4(Locale.US, "%d/%d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(c1125530fOZ.LLILZLL)}, 2)));
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), String.valueOf(j2).length() + 1, spannableString.toString().length(), 33);
            } else {
                spannableString = new SpannableString(C786410Ut5.k4(Locale.US, "%d/%d", Arrays.copyOf(new Object[]{Long.valueOf(c1125530fOZ.LLILZLL), Long.valueOf(j2)}, 2)));
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, String.valueOf(c1125530fOZ.LLILZLL).length(), 33);
            }
            c1125530fOZ.LLILLJJLI.setText(spannableString);
        }
        if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
            long j3 = c1125530fOZ.LLILZLL;
            long targetNum = c1125530fOZ.getTargetNum();
            if (l3 != null) {
                jLongValue = l3.longValue();
            } else {
                jLongValue = -1;
            }
            C1125070fNp.LIZIZ("show", "gift_gallery", j3, targetNum, jLongValue, str2, l6);
        }
    }
}
