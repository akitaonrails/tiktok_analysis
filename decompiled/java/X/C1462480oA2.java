package X;

import android.app.Activity;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462480oA2 implements InterfaceC1655950tC5 {
    public final Activity LIZ;
    public final Function0<Boolean> LIZIZ;
    public final InterfaceC1631620sYq<String, Integer, Long, Unit> LIZJ;
    public long LJ;
    public long LJFF;
    public final String LJII;
    public C1390360mHi LJIIIIZZ;
    public final C1462490oA3 LJIIIZ;
    public int LJIIJ;
    public final long LIZLLL = System.currentTimeMillis();
    public long LJI = C1462510oA5.LIZ().timeInterceptInterval;

    @Override // X.InterfaceC1655950tC5
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1655950tC5
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1655950tC5
    public final void destroy() {
        NavigationScene navigationScene;
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(this.LIZ);
        if (interfaceC20597015iiLIZJ == null || (navigationScene = interfaceC20597015iiLIZJ.getNavigationScene()) == null) {
            return;
        }
        navigationScene.unregisterChildSceneLifecycleCallbacks(this.LJIIIZ);
    }

    @Override // X.InterfaceC1655950tC5
    public final boolean LIZ(String str) {
        if (!Intrinsics.LJFF(str, "system_back_button") && !Intrinsics.LJFF(str, "swipe_down")) {
            C1390360mHi c1390360mHi = this.LJIIIIZZ;
            if (c1390360mHi != null) {
                c1390360mHi.dismiss();
            }
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LJFF > this.LJI) {
                long j = jCurrentTimeMillis - this.LIZLLL;
                if (C1462510oA5.LIZ().timeMisTouchTriggerEnd != -2 ? !(j < C1462510oA5.LIZ().timeMisTouchTrigger || (C1462510oA5.LIZ().timeMisTouchTriggerEnd > 0 && j > C1462510oA5.LIZ().timeMisTouchTriggerEnd)) : (!this.LIZIZ.invoke().booleanValue())) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(this.LJII);
                    creativeToastBuilder.duration(C1462510oA5.LIZ().timeToastShow);
                    creativeToastBuilder.onDismissListener(new CreativeToast.OnDismissListener() { // from class: X.0oA4
                        @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToast.OnDismissListener
                        public final void onDismiss(CreativeToast creativeToast) {
                            this.LIZ.LJIIIIZZ = null;
                        }
                    });
                    C1390360mHi c1390360mHi2 = (C1390360mHi) C1390390mHl.LIZ.createToast(this.LIZ, 3086, creativeToastBuilder);
                    c1390360mHi2.show();
                    this.LJIIIIZZ = c1390360mHi2;
                    int i = this.LJIIJ + 1;
                    this.LJIIJ = i;
                    this.LIZJ.invoke(str, Integer.valueOf(i), Long.valueOf(this.LJ));
                    this.LJ = System.currentTimeMillis();
                    this.LJFF = jCurrentTimeMillis;
                    if (this.LJI < 0) {
                        this.LJI = Long.MAX_VALUE;
                        return true;
                    }
                    return true;
                }
            }
            C1390360mHi c1390360mHi3 = this.LJIIIIZZ;
            if (c1390360mHi3 != null) {
                c1390360mHi3.dismiss();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0oA3, X.19AH] */
    public C1462480oA2(C19EG c19eg, Scene scene, Function0 function0, InterfaceC1631620sYq interfaceC1631620sYq) {
        SAAActivity sAAActivity;
        NavigationScene navigationScene;
        this.LIZ = c19eg;
        this.LIZIZ = function0;
        this.LIZJ = interfaceC1631620sYq;
        this.LJII = c19eg.getString(2131827243);
        ?? r2 = new C0Y8U() { // from class: X.0oA3
            @Override // X.C0Y8U, X.C19AH
            public final void LIZLLL(Scene scene2) {
                if (scene2 instanceof VideoPublishEditContainerScene) {
                    C1390360mHi c1390360mHi = this.LIZ.LJIIIIZZ;
                    if (c1390360mHi != null) {
                        c1390360mHi.dismiss();
                    }
                    this.LIZ.LJFF = 0L;
                }
            }
        };
        this.LJIIIZ = r2;
        if (C294080Bfq.LIZ()) {
            InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(scene);
            if (interfaceC20597015iiLJ != null) {
                navigationScene = interfaceC20597015iiLJ.getNavigationScene();
            } else {
                return;
            }
        } else if (!(c19eg instanceof SAAActivity) || (sAAActivity = (SAAActivity) c19eg) == null) {
            return;
        } else {
            navigationScene = sAAActivity.LLIZ;
        }
        if (navigationScene != 0) {
            navigationScene.registerChildSceneLifecycleCallbacks(r2, true);
        }
    }
}
