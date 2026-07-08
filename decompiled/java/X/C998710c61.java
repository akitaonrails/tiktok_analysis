package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c61, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998710c61 extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ AdCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C998710c61(AdCardWidget adCardWidget) {
        super(0);
        this.LL = adCardWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ FrameLayout invoke() {
        FrameLayout frameLayout = (FrameLayout) this.LL.findViewById(R.id.live_ad_card_container);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = C418440Gaw.LIZLLL(frameLayout.getContext()) - C341940Daq.LIZ(24.0d);
        C786410Ut5.a6(frameLayout, layoutParams);
        return frameLayout;
    }
}
