package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.boot.live.LiveRevenueBean;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;

/* JADX INFO: renamed from: X.0DiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346520DiE implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(C346520DiE c346520DiE) {
    }

    public static final void onComplete$1(C346520DiE c346520DiE) {
    }

    public static final void onSubscribe$0(C346520DiE c346520DiE, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
        }
    }

    public C346520DiE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C346520DiE c346520DiE, Throwable th) {
        ((C313520CQs) c346520DiE.l0).getClass();
        C313520CQs.LIZ(1, "live_revenue_disable_cache_request_fail");
        ((C313520CQs) c346520DiE.l0).getClass();
        C313520CQs.LIZ(2, "live_revenue_disable_cache_result");
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeBoolean("key_disable_feed_cache", false);
    }

    public static final void onError$1(C346520DiE c346520DiE, Throwable th) {
        MyEffectsViewModel myEffectsViewModel = (MyEffectsViewModel) c346520DiE.l0;
        myEffectsViewModel.LLJLILLLLZIIL.postValue(C0D8F.ERROR);
    }

    public static final void onNext$0(C346520DiE c346520DiE, Object obj) {
        int i;
        LiveRevenueBean.Data data = (LiveRevenueBean.Data) obj;
        C313520CQs c313520CQs = (C313520CQs) c346520DiE.l0;
        boolean z = data.disableClientCache;
        c313520CQs.getClass();
        int i2 = 1;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C313520CQs.LIZ(i, "live_revenue_disable_cache_result");
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeBoolean("key_disable_feed_cache", z);
        C313520CQs c313520CQs2 = (C313520CQs) c346520DiE.l0;
        if (!data.disableClientCache) {
            i2 = 2;
        }
        c313520CQs2.getClass();
        C313520CQs.LIZ(i2, "live_revenue_disable_cache_request_success");
    }

    public static final void onNext$1(C346520DiE c346520DiE, Object obj) {
        MyEffectsViewModel myEffectsViewModel = (MyEffectsViewModel) c346520DiE.l0;
        myEffectsViewModel.LLJLIL = (NewFaceStickerListBean) obj;
        myEffectsViewModel.LLJLILLLLZIIL.postValue(C0D8F.DONE);
    }

    public static final void onSubscribe$1(C346520DiE c346520DiE, InterfaceC420801kM interfaceC420801kM) {
        ((MyEffectsViewModel) c346520DiE.l0).LLJL.LIZ(interfaceC420801kM);
    }
}
