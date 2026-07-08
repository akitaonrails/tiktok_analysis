package Y;

import X.C013C;
import X.C1620050sGB;
import X.C197039127h;
import X.C418440Gaw;
import X.C786410Ut5;
import android.text.Html;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.title.ECTrendingTitleAssem;
import com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData;
import com.ss.android.ugc.aweme.ug.guide.NotInterestedBottomSheetFragment;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public class AObserverS30S0500000_12 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS30S0500000_12 aObserverS30S0500000_12, Object obj) {
        float fLIZIZ;
        Integer num = (Integer) obj;
        if (((C013C) aObserverS30S0500000_12.l0).element && num.intValue() >= 0 && num.intValue() <= C418440Gaw.LIZIZ(155) * 2) {
            if (((ECTrendingTitleAssem) aObserverS30S0500000_12.l1).LLJI) {
                fLIZIZ = C418440Gaw.LIZIZ(111);
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(155);
            }
            if (((ECTrendingTitleAssem) aObserverS30S0500000_12.l1).LLJI) {
                float fIntValue = 1 - (num.intValue() / fLIZIZ);
                if (0.8f <= fIntValue && fIntValue <= 0.98f) {
                    fIntValue = 0.8f;
                }
                View view = (View) aObserverS30S0500000_12.l2;
                if (view != null) {
                    C786410Ut5.T4(view, fIntValue);
                }
                View view2 = (View) aObserverS30S0500000_12.l3;
                if (view2 != null) {
                    C786410Ut5.T4(view2, num.intValue() / fLIZIZ);
                    return;
                }
                return;
            }
            View view3 = (View) aObserverS30S0500000_12.l4;
            if (view3 != null) {
                C786410Ut5.T4(view3, 1 - (num.intValue() / fLIZIZ));
            }
            View view4 = (View) aObserverS30S0500000_12.l3;
            if (view4 == null) {
                return;
            }
            C786410Ut5.T4(view4, 1.0f);
        }
    }

    public static final void onChanged$1(AObserverS30S0500000_12 aObserverS30S0500000_12, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        NotInterestedTutorialData notInterestedTutorialData = (NotInterestedTutorialData) obj;
        if (notInterestedTutorialData != null && (str = notInterestedTutorialData.title) != null && !a0.LJJJIL(str) && (str2 = notInterestedTutorialData.notInterestedText) != null && !a0.LJJJIL(str2) && (str3 = notInterestedTutorialData.addFavoriteText) != null && !a0.LJJJIL(str3) && (str4 = notInterestedTutorialData.button) != null && !a0.LJJJIL(str4)) {
            TuxTextView tuxTextView = (TuxTextView) aObserverS30S0500000_12.l0;
            if (tuxTextView != null) {
                tuxTextView.setText(notInterestedTutorialData.title);
            }
            TuxTextView tuxTextView2 = (TuxTextView) aObserverS30S0500000_12.l1;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(Html.fromHtml(notInterestedTutorialData.notInterestedText));
            }
            TuxTextView tuxTextView3 = (TuxTextView) aObserverS30S0500000_12.l2;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(Html.fromHtml(notInterestedTutorialData.addFavoriteText));
            }
            C197039127h c197039127h = (C197039127h) aObserverS30S0500000_12.l3;
            if (c197039127h != null) {
                c197039127h.setText(notInterestedTutorialData.button);
            }
            C1620050sGB c1620050sGB = ((NotInterestedBottomSheetFragment) aObserverS30S0500000_12.l4).LLILLL;
            if (c1620050sGB != null) {
                c1620050sGB.LJIIIIZZ(true);
            }
        }
    }

    public AObserverS30S0500000_12(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
