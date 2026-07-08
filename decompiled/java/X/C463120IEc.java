package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedStrategyEnterTtlSetting;

/* JADX INFO: renamed from: X.0IEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463120IEc {
    public final C0IG1 LIZ;
    public C463950IHh LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LJI;

    public final void LIZIZ() {
        this.LIZLLL = false;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = 0L;
    }

    public final boolean LIZ() {
        return this.LIZIZ != null && this.LJI > 0 && System.currentTimeMillis() - this.LJI <= LiveFeedStrategyEnterTtlSetting.INSTANCE.getValue();
    }

    public C463120IEc(C463100IEa c463100IEa) {
        this.LIZ = c463100IEa;
    }
}
