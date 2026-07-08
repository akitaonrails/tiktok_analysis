package X;

import com.ss.android.ugc.aweme.refine.base.bytebench.PerformanceOptimizeStrategy;

/* JADX INFO: renamed from: X.1D7P, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D7P implements C1D7N {
    public static final /* synthetic */ C1D7P LJIILLIIL = new C1D7P();
    public final /* synthetic */ C1D7N LJIILL;

    @Override // X.C1D7N
    public final int getOpenAlbumGroup() {
        return this.LJIILL.getOpenAlbumGroup();
    }

    @Override // X.C1D7N
    public final boolean isOpenAlbumThreeColumns() {
        return this.LJIILL.isOpenAlbumThreeColumns();
    }

    @Override // X.C1D7N
    public final boolean isOpenTaskDegradation() {
        return this.LJIILL.isOpenTaskDegradation();
    }

    public C1D7P() {
        C1D7N c1d7n;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_open_performance_bytebench", true, false)) {
            C212350188e c212350188eLIZJ = C212350188e.LIZJ();
            C0CHQ.LIZ().getApplicationService();
            C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C19221910Hx.LIZ());
            if (c09gaLIZIZ == null || (c1d7n = (C1D7N) c09gaLIZIZ.LJII(PerformanceOptimizeStrategy.class)) == null) {
                c1d7n = new C1D7N() { // from class: X.1D7O
                    @Override // X.C1D7N
                    public final int getOpenAlbumGroup() {
                        return 0;
                    }

                    @Override // X.C1D7N
                    public final boolean isOpenAlbumThreeColumns() {
                        return false;
                    }

                    @Override // X.C1D7N
                    public final boolean isOpenTaskDegradation() {
                        return false;
                    }
                };
            }
        } else {
            c1d7n = new C1D7N() { // from class: X.1D7O
                @Override // X.C1D7N
                public final int getOpenAlbumGroup() {
                    return 0;
                }

                @Override // X.C1D7N
                public final boolean isOpenAlbumThreeColumns() {
                    return false;
                }

                @Override // X.C1D7N
                public final boolean isOpenTaskDegradation() {
                    return false;
                }
            };
        }
        this.LJIILL = c1d7n;
    }
}
