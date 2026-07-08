package X;

import Y.ARunnableS122S0100000_22;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0njA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445820njA extends AbstractC1446660nkW {
    public final String LJ;
    public final INetworkStateService LJFF;
    public C1445830njB LJI;
    public volatile boolean LJII;
    public long LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final ARunnableS122S0100000_22 LJIIJ;

    public C1445820njA() {
        super(2, "DefaultWavePublisher");
        this.LJ = "DefaultWavePublisher";
        this.LJFF = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        this.LJIIIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(366));
        this.LJIIJ = new ARunnableS122S0100000_22(this, 92);
    }

    public final Handler LJI() {
        return (Handler) this.LJIIIZ.getValue();
    }

    public final void LJII() {
        INetworkStateService iNetworkStateService = this.LJFF;
        this.LJII = (iNetworkStateService != null ? iNetworkStateService.getNetworkStatus() : null) == EnumC325100Com.STRONG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Current network status: ");
        sbLIZ.append(this.LJII);
        C201955140j.LJIILIIL("PublishNetworkStatusMonitor", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJII) {
            C201955140j.LJIILIIL("PublishNetworkStatusMonitor", "currentNetwork is poor");
            LJIIIIZZ(((Number) C0AS6.LIZ.getValue()).intValue());
        }
        C786410Ut5.LJLIIL(3600000L, LJI(), this.LJIIJ);
    }

    public final void LJIIIIZZ(int i) {
        if (this.LJIIIIZZ != 0 && System.currentTimeMillis() - this.LJIIIIZZ < i) {
            C201955140j.LJIILIIL("PublishNetworkStatusMonitor", "currentNetwork is poor and last show toast time is so short");
            return;
        }
        C201955140j.LJIIL("currentNetwork is poor and last show toast time is so long  or lastToastTime is 0");
        this.LJIIIIZZ = System.currentTimeMillis();
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(LJI(), new Runnable() { // from class: X.0nfT
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PublishNetworkStatusMonitor@5f16.showWeakNetToastReal$1");
                    try {
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if (activityLJFF != null) {
                            if (C859340XnQ.LIZIZ()) {
                                C1389880mGw c1389880mGw = new C1389880mGw(activityLJFF);
                                c1389880mGw.LJIIIIZZ(2131848769);
                                c1389880mGw.LJIIJ();
                            } else {
                                C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                                c1389890mGx.LJIIIZ(2131848769);
                                c1389890mGx.LJIIJJI();
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PublishNetworkStatusMonitor@5f16.showWeakNetToastReal$1");
                }
            });
            return;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            return;
        }
        if (C859340XnQ.LIZIZ()) {
            C1389880mGw c1389880mGw = new C1389880mGw(activityLJFF);
            c1389880mGw.LJIIIIZZ(2131848769);
            c1389880mGw.LJIIJ();
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
            c1389890mGx.LJIIIZ(2131848769);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    VideoPublishEditModel videoPublishEditModel = ((C1434960nRe) next).LIZ;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1405220mfg) {
                            if (next2 != null) {
                                ((C1405220mfg) next2).LIZJ(new AwS388S0200000_22(videoPublishEditModel, this, 147));
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        INetworkStateService iNetworkStateService;
        LJI().removeCallbacksAndMessages(null);
        C1445830njB c1445830njB = this.LJI;
        if (c1445830njB != null && (iNetworkStateService = this.LJFF) != null) {
            iNetworkStateService.removeNetworkChangeObserver(c1445830njB);
        }
        this.LJI = null;
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        INetworkStateService iNetworkStateService;
        LJI().removeCallbacksAndMessages(null);
        C1445830njB c1445830njB = this.LJI;
        if (c1445830njB != null && (iNetworkStateService = this.LJFF) != null) {
            iNetworkStateService.removeNetworkChangeObserver(c1445830njB);
        }
        this.LJI = null;
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        INetworkStateService iNetworkStateService;
        LJI().removeCallbacksAndMessages(null);
        C1445830njB c1445830njB = this.LJI;
        if (c1445830njB != null && (iNetworkStateService = this.LJFF) != null) {
            iNetworkStateService.removeNetworkChangeObserver(c1445830njB);
        }
        this.LJI = null;
    }
}
