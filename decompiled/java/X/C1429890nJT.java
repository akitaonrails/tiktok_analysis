package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0nJT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429890nJT implements Serializable {
    public C1402840mbq LL;
    public boolean interactStickerCheckEffectSdk;
    public InteractStickerTracksContext mInteractStickerContext;

    public String toBusinessData() {
        return GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), this);
    }

    public InteractStickerTracksContext getInteractStickerContext() {
        return this.mInteractStickerContext;
    }

    public C1402840mbq getShareContext() {
        return this.LL;
    }

    public static String getShareContext(String str) {
        C1429890nJT c1429890nJT;
        if (C2093608Ic.LJ(str) || (c1429890nJT = (C1429890nJT) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), str, C1429890nJT.class)) == null || c1429890nJT.getShareContext() == null) {
            return null;
        }
        return GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), c1429890nJT.getShareContext());
    }

    public void setInteractStickerContext(InteractStickerTracksContext interactStickerTracksContext) {
        this.mInteractStickerContext = interactStickerTracksContext;
    }

    public void setShareContext(C1402840mbq c1402840mbq) {
        this.LL = c1402840mbq;
    }

    public static String getShareContext(C1429890nJT c1429890nJT) {
        if (c1429890nJT != null && c1429890nJT.getShareContext() != null) {
            return GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), c1429890nJT.getShareContext());
        }
        return null;
    }

    public static String updateSDKShareContextWhenSaveOrPost(boolean z, String str) {
        return str;
    }
}
