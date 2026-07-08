package X;

import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0abR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941310abR {
    public final C1324720kZq LIZ;
    public boolean LIZIZ;
    public String LIZJ = "ttlive_sound_wavee_anim_low.webp";

    public C941310abR(C1324720kZq c1324720kZq) {
        this.LIZ = c1324720kZq;
    }

    public final void LIZ(final String str) {
        InterfaceC1320850kTb controller;
        if (Intrinsics.LJFF("", str)) {
            this.LIZIZ = true;
            return;
        }
        C500260Jjc.LLFFF(this.LIZ);
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        C1324720kZq c1324720kZq = this.LIZ;
        if (c1324720kZq != null) {
            controller = c1324720kZq.getController();
        } else {
            controller = null;
        }
        c1320810kTXLIZJ.LJIILJJIL = controller;
        c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), str));
        c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0abW
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str2, Object obj, final Animatable animatable) {
                if (animatable instanceof AnimatedDrawable2) {
                    final C941310abR c941310abR = this.LIZIZ;
                    final String str3 = str;
                    ((AnimatedDrawable2) animatable).LJII(new C0I9J(animatable, str3) { // from class: X.0abX
                        public final /* synthetic */ String LIZIZ;

                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                        public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
                            if (animatedDrawable2 != null && i == animatedDrawable2.LIZJ() - 1) {
                                C941310abR c941310abR2 = this.LIZ;
                                if (c941310abR2.LIZIZ) {
                                    C1324720kZq c1324720kZq2 = c941310abR2.LIZ;
                                    if (c1324720kZq2 != null) {
                                        c1324720kZq2.setController(null);
                                    }
                                    C500260Jjc.LJIILLIIL(this.LIZ.LIZ);
                                }
                                if (!Intrinsics.LJFF(this.LIZIZ, this.LIZ.LIZJ)) {
                                    C941310abR c941310abR3 = this.LIZ;
                                    c941310abR3.LIZ(c941310abR3.LIZJ);
                                }
                            }
                        }

                        {
                            this.LIZIZ = str3;
                        }
                    });
                }
            }
        };
        c1320810kTXLIZJ.LJIIJJI = true;
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        C1324720kZq c1324720kZq2 = this.LIZ;
        if (c1324720kZq2 != null) {
            c1324720kZq2.setController(abstractC1320710kTNLIZ);
        }
    }
}
