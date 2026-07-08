package X;

import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12AK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12AK extends C1617910sCj implements InterfaceC585770MyF {
    public EffectRecommendationCardViewModel LL;

    @Override // X.InterfaceC585770MyF
    public final void LJLLLL() {
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LL;
        if (effectRecommendationCardViewModel != null) {
            effectRecommendationCardViewModel.vQ2(C12AU.LIZ);
        }
    }

    private final int getScreenHeightDp() {
        return (int) C0HCL.LIZIZ(getResources().getDisplayMetrics().heightPixels, getContext());
    }

    public final boolean e0() {
        return getScreenHeightDp() >= 800;
    }

    public final boolean h0() {
        return getScreenHeightDp() <= 640;
    }

    @Override // X.InterfaceC585770MyF
    public final void LLLLIIIILLL(C19EG c19eg) {
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LL;
        if (effectRecommendationCardViewModel != null) {
            effectRecommendationCardViewModel.vQ2(new C12AP(c19eg));
        }
    }

    @Override // X.InterfaceC585770MyF
    public final void a(C19EG c19eg) {
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LL;
        if (effectRecommendationCardViewModel != null) {
            effectRecommendationCardViewModel.vQ2(new C12AR(c19eg));
        }
    }

    @Override // X.InterfaceC585770MyF
    public final void Y(Fragment fragment, Aweme aweme) {
        MutableLiveData mutableLiveData;
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = (EffectRecommendationCardViewModel) ViewModelProviders.of(fragment).get(EffectRecommendationCardViewModel.class);
        effectRecommendationCardViewModel.vQ2(new C12AQ(aweme));
        this.LL = effectRecommendationCardViewModel;
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        EffectRecommendationCardViewModel effectRecommendationCardViewModel2 = this.LL;
        if (effectRecommendationCardViewModel2 != null && (mutableLiveData = effectRecommendationCardViewModel2.LLIZLLLIL) != null) {
            mutableLiveData.observe(viewLifecycleOwner, new AObserverS231S0100000_29(this, 189));
        }
    }

    @Override // X.InterfaceC585770MyF
    public final void j(C19EG c19eg, Aweme aweme) {
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LL;
        if (effectRecommendationCardViewModel != null) {
            effectRecommendationCardViewModel.vQ2(new C12AM(getContext(), c19eg, aweme));
        }
    }

    public C12AK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Sd(R.layout.eks, C786410Ut5.ne(context), this);
    }
}
