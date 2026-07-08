package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedbackVoteData;
import com.zhiliaoapp.musically.R;
import g1c.AjS0S1400000_1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04HU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04HU {
    public static boolean LIZ(int i, boolean z) {
        if (z) {
            if (i % 2 == 0) {
                return true;
            }
            return false;
        }
        if (i < 3) {
            return true;
        }
        return false;
    }

    public static ConstraintLayout LIZIZ(Context context, View view, FeedbackVoteData feedbackVoteData, Integer num) {
        int iIntValue;
        int iIntValue2;
        TuxIconView tuxIconView;
        String strValueOf;
        Uri uriLIZ;
        Uri uri;
        Map mapLJIIJ = C1741890vQh.LJIIJ(feedbackVoteData.daInfo);
        if (mapLJIIJ == null) {
            mapLJIIJ = C2097608Jq.LJ();
        }
        PageFinder pageFinderVia = PageFinder.via(view);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = C04HT.LLJJLIIIJLLLLLLLZ;
        }
        C0H1U.LJIIJ(iIntValue, constraintLayout);
        if (num != null) {
            iIntValue2 = num.intValue();
        } else {
            iIntValue2 = C04HT.LLJJLIIIJLLLLLLLZ;
        }
        C0H1U.LJII(iIntValue2, constraintLayout);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(View.generateViewId());
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setTuxFont(61);
        tuxTextView.setText(feedbackVoteData.text);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (Intrinsics.LJFF(feedbackVoteData.hasInfoIcon, Boolean.TRUE)) {
            tuxIconView = new TuxIconView(context, null, 0, 6, null);
            tuxIconView.setId(View.generateViewId());
            tuxIconView.setIconRes(R.raw.icon_info_circle);
            tuxIconView.setTintColorRes(R.attr.a1k);
        } else {
            tuxIconView = null;
        }
        C19ME c19me = new C19ME(-2, -2);
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        if (tuxIconView != null) {
            c19me.endToStart = tuxIconView.getId();
        } else {
            c19me.endToEnd = 0;
        }
        c19me.bottomToBottom = 0;
        c19me.horizontalBias = 0.0f;
        c19me.constrainedWidth = true;
        constraintLayout.addView(tuxTextView, c19me);
        if (tuxIconView != null) {
            int i = C04HT.LLJJJJLIIL;
            C19ME c19me2 = new C19ME(i, i);
            ((ViewGroup.MarginLayoutParams) c19me2).leftMargin = C04HT.LLJJL;
            c19me2.startToEnd = tuxTextView.getId();
            c19me2.topToTop = 0;
            c19me2.endToEnd = 0;
            c19me2.bottomToBottom = 0;
            c19me2.horizontalBias = 0.0f;
            constraintLayout.addView(tuxIconView, c19me2);
        }
        if (C1533950q1J.LJ(feedbackVoteData.schema)) {
            try {
                String str = feedbackVoteData.schema;
                if (str != null && (uri = UriProtector.parse(str)) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C044V.LIZ.getClass();
                    linkedHashMap.putAll(C044V.LIZIZ);
                    linkedHashMap.putAll(mapLJIIJ);
                    linkedHashMap.put("module_zone", "sku");
                    uriLIZ = C956403oY.LIZ(uri, C1741890vQh.LJIIIIZZ(linkedHashMap));
                } else {
                    uriLIZ = null;
                }
                strValueOf = String.valueOf(uriLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR108, e, null);
                strValueOf = feedbackVoteData.schema;
            }
            C786410Ut5.I7(new AjS0S1400000_1(context, strValueOf, view, mapLJIIJ, pageFinderVia, 1), constraintLayout);
        }
        C1748720vbi.LJI(view, new C10515049h(), new AwS86S1000000_1(23), "c55267.d3519", pageFinderVia, new AwS115S1100000_1(mapLJIIJ, 43));
        return constraintLayout;
    }
}
