package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0ita, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1260080ita extends AbstractC1620180sGO<Aweme> {
    public C624420OeO LLILZIL;
    public final C1259880itG LLILZLL;

    public boolean P5() {
        return false;
    }

    public int[] R5() {
        return C422830Gi1.LIZ(200);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0itG] */
    public AbstractC1260080ita(View view) {
        super(view);
        this.LLILZLL = new InterfaceC1332070klh() { // from class: X.0itG
            @Override // X.InterfaceC1332070klh
            public final void LIZ() {
                this.LIZ.getClass();
            }
        };
    }

    public boolean T5(Video video, String str) {
        if (!(this instanceof C1620170sGN)) {
            return W5(video, str, null, P5(), false);
        }
        return V5(video, str, null, P5());
    }

    public boolean U5(Video video, String str, Bitmap.Config config) {
        if (!(this instanceof C1620170sGN)) {
            return W5(video, str, config, P5(), false);
        }
        return V5(video, str, config, P5());
    }

    public final void S5(UrlModel urlModel, String str, Bitmap.Config config, C1259380isS c1259380isS) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        int[] iArrR5 = R5();
        if (iArrR5 != null) {
            c1331670kl3LJIIIIZZ.LJJIJ(iArrR5);
        }
        if ("AwemeViewHolder".equals(str) && C295250Bhj.LIZ()) {
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIIZZ.LJJJJJ = "profile_post_img";
        }
        c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
        c1331670kl3LJIIIIZZ.LIZLLL(str);
        if (config != null) {
            c1331670kl3LJIIIIZZ.LJIL = config;
        }
        if (c1259380isS != null) {
            c1331670kl3LJIIIIZZ.LJJJIL = c1259380isS;
        }
        if (P5()) {
            c1331670kl3LJIIIIZZ.LJIIJJI();
        } else {
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        Aweme aweme = this.LL;
        if (aweme != null && aweme.getVideo() != null && !C661110PwT.LIZ()) {
            this.LL.getVideo().setCachedOuterCoverUrl(urlModel);
            this.LL.getVideo().setCachedOuterCoverSize(iArrR5);
        }
    }

    public final boolean V5(Video video, String str, Bitmap.Config config, boolean z) {
        if (L5() && C1620160sGM.LIZIZ(this.LLILLJJLI, video, str, true, this.LLILZIL, null, true, config, false, z, false, false)) {
            return true;
        }
        return false;
    }

    public final boolean W5(Video video, String str, Bitmap.Config config, boolean z, boolean z2) {
        if (L5() && C1620160sGM.LIZIZ(this.LLILLJJLI, video, str, true, this.LLILZIL, null, true, config, false, z, z2, false)) {
            return true;
        }
        return false;
    }
}
