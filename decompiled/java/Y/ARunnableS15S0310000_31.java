package Y;

import X.AbstractC316870CbV;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1335180kqi;
import X.C1335190kqj;
import X.C15VJ;
import X.C1C7U;
import X.C20530015Va;
import X.C20749916Hp;
import X.C438710HIf;
import X.EnumC1334360kpO;
import X.EnumC323450Cm7;
import X.EnumC714850S2h;
import X.InterfaceC605070NoH;
import android.content.Context;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.File;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS15S0310000_31 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        List<Aweme> list = (List) this.l0;
        if (list != null) {
            Context context = (Context) this.l1;
            EnumC1334360kpO enumC1334360kpO = (EnumC1334360kpO) this.l2;
            boolean z = this.z3;
            for (final Aweme aweme : list) {
                Video video = aweme.getVideo();
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video != null ? video.getCover() : null));
                c1331670kl3LJIIIIZZ.LJJIJL(context);
                c1331670kl3LJIIIIZZ.LJJIII = enumC1334360kpO;
                Pair pairLIZ = C15VJ.LIZ(aweme);
                if (pairLIZ != null) {
                    int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
                    int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
                    c1331670kl3LJIIIIZZ.LJIIIIZZ = iIntValue;
                    c1331670kl3LJIIIIZZ.LJIIIZ = iIntValue2;
                }
                if (C1335180kqi.LIZLLL()) {
                    c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                    c1331670kl3LJIIIIZZ.LJJJJJ = "explore_feed_image_cache";
                } else if (C1335190kqj.LIZJ()) {
                    c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                    c1331670kl3LJIIIIZZ.LJJJJJ = "photomode_image_cache_v2";
                }
                String aid = aweme.getAid();
                Video video2 = aweme.getVideo();
                final C20530015Va c20530015Va = new C20530015Va(aid, C438710HIf.LIZ(video2 != null ? video2.getCover() : null), aweme, false, 24);
                if (z) {
                    c1331670kl3LJIIIIZZ.LJJIIJZLJL(new C20749916Hp(aweme, c20530015Va, 1));
                } else {
                    c1331670kl3LJIIIIZZ.LJIJ(new InterfaceC605070NoH() { // from class: X.15VM
                        @Override // X.InterfaceC605070NoH
                        public final void onCanceled() {
                            C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), c20530015Va);
                        }

                        @Override // X.InterfaceC605070NoH
                        public final void LIZ(File file) {
                            String aid2;
                            if (C1335180kqi.LIZ() && (aid2 = aweme.getAid()) != null) {
                                C15VC.LIZIZ.add(aid2);
                            }
                            C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), c20530015Va);
                        }

                        @Override // X.InterfaceC605070NoH
                        public final void onFailed(Throwable th) {
                            C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), c20530015Va);
                        }
                    });
                }
            }
        }
    }

    public static final void run$0(ARunnableS15S0310000_31 aRunnableS15S0310000_31) {
        boolean zLIZ;
        C1C7U.LIZ("PowerPageLoader@be3.manualLoad$1");
        try {
            ((PowerPageLoader) aRunnableS15S0310000_31.l0).LIZJ((EnumC323450Cm7) aRunnableS15S0310000_31.l1, (AbstractC316870CbV) aRunnableS15S0310000_31.l2, aRunnableS15S0310000_31.z3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PowerPageLoader@be3.manualLoad$1");
    }

    public static final void run$1(ARunnableS15S0310000_31 aRunnableS15S0310000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LightenHelper@f2a4.lightenPreloadImage$3");
        try {
            aRunnableS15S0310000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LightenHelper@f2a4.lightenPreloadImage$3");
    }

    public ARunnableS15S0310000_31(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
        this.z3 = z;
    }
}
