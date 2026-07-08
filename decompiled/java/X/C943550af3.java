package X;

import Y.AAListenerS326S0100000_15;
import android.animation.AnimatorSet;
import android.os.Build;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0af3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943550af3 {
    public final View LIZ;
    public final View LIZIZ;
    public AbstractC943570af5 LIZJ;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0af4] */
    public final C943560af4 LIZ() {
        if (this.LIZJ == null) {
            "GuideAnimatorStrategy is null.".toString();
            throw new IllegalArgumentException("GuideAnimatorStrategy is null.");
        }
        final View view = this.LIZ;
        final View view2 = this.LIZIZ;
        final AbstractC943570af5 abstractC943570af5 = this.LIZJ;
        return new InterfaceC943500aey(view, view2, abstractC943570af5) { // from class: X.0af4
            public final View LIZ;
            public final View LIZIZ;
            public final AbstractC943570af5 LIZJ;
            public boolean LIZLLL;

            @Override // X.InterfaceC943500aey
            public final C943450aet LIZ() {
                AbstractC943570af5 abstractC943570af52 = this.LIZJ;
                if (abstractC943570af52 != null) {
                    return abstractC943570af52.LIZ;
                }
                return null;
            }

            public final AnimatorSet LIZLLL() {
                AbstractC943570af5 abstractC943570af52 = this.LIZJ;
                if (abstractC943570af52 == null) {
                    return null;
                }
                View view3 = this.LIZ;
                View view4 = this.LIZIZ;
                if (abstractC943570af52.LIZIZ == null) {
                    abstractC943570af52.LIZIZ = abstractC943570af52.LIZ(view3, view4);
                }
                return abstractC943570af52.LIZIZ;
            }

            @Override // X.InterfaceC943500aey
            public final void cancel() {
                if (isRunning()) {
                    this.LIZLLL = true;
                    C20441214yg.LIZIZ("AgreeApplyGuideAnimator", "stop");
                    AnimatorSet animatorSetLIZLLL = LIZLLL();
                    if (animatorSetLIZLLL != null) {
                        animatorSetLIZLLL.cancel();
                    }
                }
            }

            @Override // X.InterfaceC943500aey
            public final boolean isRunning() {
                AnimatorSet animatorSetLIZLLL = LIZLLL();
                if (animatorSetLIZLLL != null) {
                    return animatorSetLIZLLL.isRunning();
                }
                return false;
            }

            @Override // X.InterfaceC943500aey
            public final long jq() {
                AnimatorSet animatorSetLIZLLL = LIZLLL();
                if (animatorSetLIZLLL == null) {
                    return Long.MAX_VALUE;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return animatorSetLIZLLL.getCurrentPlayTime();
                    }
                    return 0L;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("AnimatorCompat", "getCurrentPlayTime failed, api < 26", e);
                    return 0L;
                }
            }

            @Override // X.InterfaceC943500aey
            public final void start() {
                if (isRunning()) {
                    return;
                }
                C20441214yg.LIZIZ("AgreeApplyGuideAnimator", "startNewAnimation");
                AnimatorSet animatorSetLIZLLL = LIZLLL();
                if (animatorSetLIZLLL != null) {
                    animatorSetLIZLLL.start();
                    C943450aet c943450aetLIZ = LIZ();
                    if (c943450aetLIZ != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setCurrentPlayTime, ");
                        sbLIZ.append(c943450aetLIZ.LIZJ);
                        C20441214yg.LIZIZ("AgreeApplyGuideAnimator", C2188811AlT.LIZIZ(sbLIZ));
                        long j = c943450aetLIZ.LIZJ;
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                animatorSetLIZLLL.setCurrentPlayTime(j);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJFF("AnimatorCompat", "setCurrentPlayTime failed, api < 26", e);
                        }
                    }
                }
            }

            @Override // X.InterfaceC943500aey
            public final boolean LIZIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC943500aey
            public final void LIZJ(AwS416S0200000_15 awS416S0200000_15) {
                AnimatorSet animatorSetLIZLLL = LIZLLL();
                if (animatorSetLIZLLL != null) {
                    animatorSetLIZLLL.addListener(new AAListenerS326S0100000_15(awS416S0200000_15, 9));
                }
            }

            {
                this.LIZ = view;
                this.LIZIZ = view2;
                this.LIZJ = abstractC943570af5;
            }
        };
    }

    public C943550af3(View view, View view2) {
        this.LIZ = view;
        this.LIZIZ = view2;
    }
}
