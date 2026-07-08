package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadAiSummary;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180760gpe extends FrameLayout {
    public final ViewGroup LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxIconView LLILZ;

    public final TuxIconView getAiSummaryEndIcon() {
        return this.LLILZ;
    }

    public final TuxIconView getAiSummaryStartIcon() {
        return this.LLILLL;
    }

    public final TuxTextView getAiSummaryTitle() {
        return this.LLILLJJLI;
    }

    public final ViewGroup getContainer() {
        return this.LL;
    }

    public final void LIZ(PoiHeadAiSummary poiHeadAiSummary) {
        int i;
        String str;
        Object c098200Yq;
        int i2;
        String str2 = poiHeadAiSummary.recommendationText;
        if (str2 != null) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.setText(str2);
            }
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (tuxTextView2 != null) {
                if (C0H4W.LIZ()) {
                    i2 = 4;
                } else {
                    i2 = 3;
                }
                tuxTextView2.setTextDirection(i2);
            }
        }
        DynamicIcon dynamicIcon = poiHeadAiSummary.icon;
        if (dynamicIcon != null && (str = dynamicIcon.tuxToken) != null) {
            try {
                C01GW c01gw = C2248361CzK.LIZ;
                c098200Yq = C2248361CzK.LJFF(getContext(), str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C698190Ra5 c698190Ra5 = (C698190Ra5) c098200Yq;
            if (c698190Ra5 != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c698190Ra5.LIZ;
                c419910GdJ.LIZLLL = c698190Ra5.LIZIZ;
                TuxIconView tuxIconView = this.LLILLL;
                if (tuxIconView != null) {
                    tuxIconView.setTuxIcon(c419910GdJ);
                }
            }
        }
        TuxIconView tuxIconView2 = this.LLILZ;
        if (tuxIconView2 != null) {
            if (!Intrinsics.LJFF(poiHeadAiSummary.clickEnable, Boolean.FALSE)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, i);
        }
    }

    public C1180760gpe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.e02, this);
        this.LL = (ViewGroup) findViewById(R.id.qw_);
        this.LLILLL = (TuxIconView) findViewById(R.id.r05);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.r0_);
        this.LLILZ = (TuxIconView) findViewById(R.id.r08);
    }
}
