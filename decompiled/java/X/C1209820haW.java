package X;

import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0haW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209820haW implements InterfaceC1209240hZa {
    public final ViewGroup LIZ;
    public final Context LIZIZ;
    public View LIZJ;

    @Override // X.InterfaceC1209240hZa
    public final View LIZ() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup instanceof FrameLayout) {
            this.LIZJ = C20673215v0.LIZLLL(R.layout.bkk, C1388190mED.LIZ(this.LIZIZ), this.LIZ, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) C12ES.LIZJ(6.0f, this.LIZIZ);
            this.LIZ.addView(this.LIZJ, layoutParams);
            View view = this.LIZJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else if (viewGroup instanceof RelativeLayout) {
            this.LIZJ = C20673215v0.LIZLLL(R.layout.bkk, C1388190mED.LIZ(this.LIZIZ), this.LIZ, false);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(14);
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = (int) C12ES.LIZJ(6.0f, this.LIZIZ);
            this.LIZ.addView(this.LIZJ, layoutParams2);
            View view2 = this.LIZJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC1209240hZa
    public final void LIZIZ() {
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.InterfaceC1209240hZa
    public final void LIZJ(Aweme aweme) {
        BrandedContentToolSchema brandedContentToolSchemaLIZ;
        View view;
        long playCount;
        if (aweme == null || (brandedContentToolSchemaLIZ = C1209830haX.LIZ()) == null || brandedContentToolSchemaLIZ.baViewInsightsSchema == null || (view = this.LIZJ) == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.za_);
        AwemeStatistics statistics = aweme.getStatistics();
        long shareCount = 0;
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        String quantityString = this.LIZIZ.getResources().getQuantityString(2131755103, (int) playCount, C1050540dRc.LIZIZ(playCount));
        if (statistics != null) {
            shareCount = statistics.getShareCount();
        }
        String quantityString2 = this.LIZIZ.getResources().getQuantityString(2131755102, (int) shareCount, C1050540dRc.LIZIZ(shareCount));
        String string = this.LIZIZ.getResources().getString(2131831117);
        if (textView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(quantityString);
            sbLIZ.append(string);
            sbLIZ.append(' ');
            sbLIZ.append(quantityString2);
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LIZJ;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS122S0200000_19(aweme, this, 96), view3);
        }
    }

    public C1209820haW(Context context, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = context;
    }
}
