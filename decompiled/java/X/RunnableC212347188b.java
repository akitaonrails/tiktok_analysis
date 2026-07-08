package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget;

/* JADX INFO: renamed from: X.188b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class RunnableC212347188b implements Runnable {
    public final /* synthetic */ LivePreviewInteractionLayerWidget LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    public RunnableC212347188b(LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget, boolean z, boolean z2) {
        this.LL = livePreviewInteractionLayerWidget;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    public final void LIZ() {
        final LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget = this.LL;
        final boolean z = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        if (!livePreviewInteractionLayerWidget.isDestroyed && !livePreviewInteractionLayerWidget.LLLI.get()) {
            C1ACA c1acaZ1 = livePreviewInteractionLayerWidget.z1();
            if (!C487180J8q.LIZJ(c1acaZ1 != null ? c1acaZ1.LJ : null) && z2) {
                C1ACA c1acaZ12 = livePreviewInteractionLayerWidget.z1();
                C487180J8q.LIZ(new Runnable() { // from class: X.188X
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LivePreviewInteractionLayerWidget@4dc8.doPerformWidgetP0WhenPageIdle$1");
                        try {
                            LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget2 = livePreviewInteractionLayerWidget;
                            if (!livePreviewInteractionLayerWidget2.isDestroyed && ((!z || livePreviewInteractionLayerWidget2.LL) && livePreviewInteractionLayerWidget2.LLLI.compareAndSet(false, true))) {
                                livePreviewInteractionLayerWidget.O1();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LivePreviewInteractionLayerWidget@4dc8.doPerformWidgetP0WhenPageIdle$1");
                    }
                }, c1acaZ12 != null ? c1acaZ12.LJ : null);
            } else if ((!z || livePreviewInteractionLayerWidget.LL) && livePreviewInteractionLayerWidget.LLLI.compareAndSet(false, true)) {
                livePreviewInteractionLayerWidget.O1();
            }
        }
        final LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget2 = this.LL;
        final boolean z3 = this.LLILLJJLI;
        final boolean z4 = this.LLILLL;
        C486790J7d.LIZLLL(new Runnable() { // from class: X.188a
            public final void LIZ() {
                final LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget3 = livePreviewInteractionLayerWidget2;
                final boolean z5 = z3;
                boolean z6 = z4;
                if (livePreviewInteractionLayerWidget3.isDestroyed || livePreviewInteractionLayerWidget3.LLLII.get()) {
                    return;
                }
                C1ACA c1acaZ13 = livePreviewInteractionLayerWidget3.z1();
                if (!C487180J8q.LIZJ(c1acaZ13 != null ? c1acaZ13.LJ : null) && z6) {
                    C1ACA c1acaZ14 = livePreviewInteractionLayerWidget3.z1();
                    C487180J8q.LIZ(new Runnable() { // from class: X.188W
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LivePreviewInteractionLayerWidget@4dc8.doPerformWidgetP1WhenPageIdle$1");
                            try {
                                LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget4 = livePreviewInteractionLayerWidget3;
                                if (!livePreviewInteractionLayerWidget4.isDestroyed && ((!z5 || livePreviewInteractionLayerWidget4.LL) && livePreviewInteractionLayerWidget4.LLLII.compareAndSet(false, true))) {
                                    livePreviewInteractionLayerWidget3.P1(false);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LivePreviewInteractionLayerWidget@4dc8.doPerformWidgetP1WhenPageIdle$1");
                        }
                    }, c1acaZ14 != null ? c1acaZ14.LJ : null);
                } else if ((!z5 || livePreviewInteractionLayerWidget3.LL) && livePreviewInteractionLayerWidget3.LLLII.compareAndSet(false, true)) {
                    livePreviewInteractionLayerWidget3.P1(false);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LivePreviewInteractionLayerWidget@4dc8.performWidgetOnLoadOpt$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LivePreviewInteractionLayerWidget@4dc8.performWidgetOnLoadOpt$1$1");
            }
        }, livePreviewInteractionLayerWidget2, 10L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LivePreviewInteractionLayerWidget@4dc8.performWidgetOnLoadOpt$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePreviewInteractionLayerWidget@4dc8.performWidgetOnLoadOpt$1");
    }
}
