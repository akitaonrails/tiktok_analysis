package X;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.model.UnderWaterInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0RJP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJP {
    public Aweme LIZ;
    public String LIZIZ;
    public final Reference<TuxTextView> LIZJ;

    public final void LIZ() {
        TuxTextView tuxTextView = this.LIZJ.get();
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        if (C299030Bnp.LIZ() && EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    public C0RJP(ViewStub viewStub) {
        Reference<TuxTextView> softReference;
        View viewLJLLLL;
        View viewLJLLLL2;
        if (C299030Bnp.LIZ()) {
            if (viewStub != null) {
                viewLJLLLL2 = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL2 = null;
            }
            softReference = new WeakReference<>(viewLJLLLL2 instanceof TuxTextView ? viewLJLLLL2 : null);
        } else {
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            softReference = new SoftReference<>(viewLJLLLL instanceof TuxTextView ? viewLJLLLL : null);
        }
        this.LIZJ = softReference;
        C299030Bnp.LIZ();
    }

    public final boolean LIZIZ(Aweme aweme) {
        UnderWaterInfo underWaterInfo;
        String str;
        UnderWaterInfo underWaterInfo2;
        TuxTextView tuxTextView = this.LIZJ.get();
        if (tuxTextView != null) {
            if (aweme == null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            } else {
                this.LIZ = aweme;
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                String underWater = null;
                if (commerceVideoAuthInfo != null && (underWaterInfo2 = commerceVideoAuthInfo.getUnderWaterInfo()) != null) {
                    underWater = underWaterInfo2.getUnderWater();
                }
                this.LIZIZ = underWater;
                AwemeCommerceStruct commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo2 != null && (underWaterInfo = commerceVideoAuthInfo2.getUnderWaterInfo()) != null) {
                    String underWater2 = underWaterInfo.getUnderWater();
                    Map<String, String> profileVideoUnderWaterStatusMap = underWaterInfo.getProfileVideoUnderWaterStatusMap();
                    if (underWater2 != null && underWater2.length() != 0 && profileVideoUnderWaterStatusMap != null && !profileVideoUnderWaterStatusMap.isEmpty() && (str = profileVideoUnderWaterStatusMap.get(underWater2)) != null && str.length() != 0) {
                        tuxTextView.setText(str);
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                        if (!EventBus.LIZLLL().LJIIJ(this)) {
                            EventBus.LIZLLL().LJIJJ(this);
                        }
                        return true;
                    }
                }
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return false;
            }
        }
        return false;
    }

    @C14EU
    public final void onEvent(C584900Mwq c584900Mwq) {
        String aid;
        AwemeCommerceStruct commerceVideoAuthInfo;
        UnderWaterInfo underWaterInfo;
        String str = c584900Mwq.LIZ;
        Aweme aweme = this.LIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return;
        }
        String str2 = c584900Mwq.LIZIZ;
        if (Intrinsics.LJFF(str2, this.LIZIZ)) {
            return;
        }
        Aweme aweme2 = this.LIZ;
        if (aweme2 != null && (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) != null && (underWaterInfo = commerceVideoAuthInfo.getUnderWaterInfo()) != null) {
            underWaterInfo.setUnderWater(str2);
        }
        if (str2 != null && str2.length() != 0) {
            LIZIZ(this.LIZ);
        } else {
            LIZ();
        }
    }
}
