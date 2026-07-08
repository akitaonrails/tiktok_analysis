package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveSearchCardWarmUpOpt;

/* JADX INFO: renamed from: X.0g6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152570g6B implements C0J4W {
    @Override // X.C0J4W
    public final boolean LIZ() {
        LiveSearchCardWarmUpOpt liveSearchCardWarmUpOpt = LiveSearchCardWarmUpOpt.INSTANCE;
        return (liveSearchCardWarmUpOpt.getValue().ecCardWarmUp || liveSearchCardWarmUpOpt.getValue().mixCardWarmUp) && liveSearchCardWarmUpOpt.getValue().enable;
    }

    @Override // X.C0J4W
    public final boolean LIZJ() {
        LiveSearchCardWarmUpOpt liveSearchCardWarmUpOpt = LiveSearchCardWarmUpOpt.INSTANCE;
        return liveSearchCardWarmUpOpt.getValue().mixCardWarmUp && liveSearchCardWarmUpOpt.getValue().enable;
    }

    @Override // X.C0J4W
    public final boolean LIZLLL() {
        LiveSearchCardWarmUpOpt liveSearchCardWarmUpOpt = LiveSearchCardWarmUpOpt.INSTANCE;
        return liveSearchCardWarmUpOpt.getValue().ecCardWarmUp && liveSearchCardWarmUpOpt.getValue().enable;
    }

    @Override // X.C0J4W
    public final boolean enable() {
        return LiveSearchCardWarmUpOpt.INSTANCE.getValue().enable;
    }

    @Override // X.C0J4W
    public final boolean LIZIZ() {
        return C1152560g6A.LIZ();
    }
}
