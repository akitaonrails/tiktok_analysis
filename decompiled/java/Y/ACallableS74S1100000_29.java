package Y;

import X.C05HM;
import X.C0CHQ;
import X.C111Q;
import X.C116D;
import X.C19221910Hx;
import X.C1C7U;
import X.C297540BlQ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiomode.vopclone.instantclone.InstantCloneVoiceActivity;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public class ACallableS74S1100000_29 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS74S1100000_29 aCallableS74S1100000_29) {
        C1C7U.LIZ("InstantCloneVoiceActivity@3bb3.onCreate$1$onSuccess$1");
        if (C05HM.LIZIZ.init(aCallableS74S1100000_29.s0) == 0) {
            InstantCloneVoiceActivity instantCloneVoiceActivity = (InstantCloneVoiceActivity) aCallableS74S1100000_29.l1;
            instantCloneVoiceActivity.runOnUiThread(new ARunnableS129S0100000_29(instantCloneVoiceActivity, 18));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstantCloneVoiceActivity@3bb3.onCreate$1$onSuccess$1");
        return unit;
    }

    public static final Object call$1(ACallableS74S1100000_29 aCallableS74S1100000_29) throws ExecutionException, InterruptedException {
        C111Q c111q = (C111Q) aCallableS74S1100000_29.l1;
        String str = aCallableS74S1100000_29.s0;
        c111q.getClass();
        C1C7U.LIZ("StickerPropDetailPresenter@dd19.fetchData$1L");
        StickerPropApi stickerPropApi = C111Q.LLJIJIL;
        C0CHQ.LIZ().getApplicationService();
        NewFaceStickerListBean newFaceStickerListBean = stickerPropApi.LIZIZ(str, 1, C19221910Hx.LIZIZ()).get();
        C1C7U.LIZIZ("StickerPropDetailPresenter@dd19.fetchData$1L");
        return newFaceStickerListBean;
    }

    public static final Object call$2(ACallableS74S1100000_29 aCallableS74S1100000_29) throws ExecutionException, InterruptedException {
        boolean z;
        C111Q c111q = (C111Q) aCallableS74S1100000_29.l1;
        String str = aCallableS74S1100000_29.s0;
        c111q.getClass();
        C1C7U.LIZ("StickerPropDetailPresenter@dd19.fetchData$2L");
        NewFaceStickerListBean newFaceStickerListBean = null;
        if (C297540BlQ.LIZ() && c111q.LLILZ.booleanValue()) {
            if (C116D.LIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    NewFaceStickerListBean newFaceStickerListBean2 = C116D.LIZIZ;
                    if (newFaceStickerListBean2 == null) {
                        Future<NewFaceStickerListBean> future = C116D.LIZJ;
                        if (future != null) {
                            newFaceStickerListBean2 = future.get();
                        } else {
                            newFaceStickerListBean2 = null;
                        }
                        C116D.LIZIZ = newFaceStickerListBean2;
                    }
                    newFaceStickerListBean = newFaceStickerListBean2;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (newFaceStickerListBean == null) {
            StickerPropApi stickerPropApi = C111Q.LLJIJIL;
            C0CHQ.LIZ().getApplicationService();
            newFaceStickerListBean = stickerPropApi.getStickerDetail(str, C19221910Hx.LIZIZ()).get();
        }
        C1C7U.LIZIZ("StickerPropDetailPresenter@dd19.fetchData$2L");
        return newFaceStickerListBean;
    }

    public ACallableS74S1100000_29(String str, Object obj, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
