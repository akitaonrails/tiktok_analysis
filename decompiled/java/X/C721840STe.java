package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.UUID;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0STe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721840STe extends AbstractC1066890drz {
    public final C19EG LLJ;
    public final FullPageParam LLJI;

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C721840STe(this.LLJ, this.LLJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[RETURN] */
    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL() {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C721840STe.LIZLLL():java.lang.String");
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        LJJIIZI(smartImageView, new AwS555S0100000_11(smartImageView, 1557));
    }

    public C721840STe(C19EG c19eg, FullPageParam fullPageParam) {
        this.LLJ = c19eg;
        this.LLJI = fullPageParam;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String mid;
        if (!C720360SNm.LJIIIZ(LJIIZILJ()) && !C10IT.LJII(LJIIZILJ())) {
            Aweme awemeLJIIZILJ = LJIIZILJ();
            int videoLength = 0;
            if (awemeLJIIZILJ != null && !awemeLJIIZILJ.isCanPlay()) {
                return;
            }
            Aweme awemeLJIIZILJ2 = LJIIZILJ();
            if (awemeLJIIZILJ2.getMusic() != null && !TextUtils.isEmpty(awemeLJIIZILJ2.getMusic().getMid())) {
                mid = awemeLJIIZILJ2.getMusic().getMid();
            } else {
                mid = "";
            }
            if (awemeLJIIZILJ2.getVideo() != null) {
                videoLength = awemeLJIIZILJ2.getVideo().getVideoLength();
            }
            String string = UUID.randomUUID().toString();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(LJIILJJIL(), "aweme://music/detail/");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, mid);
            smartRouteBuildRoute.withParam("aweme_id", awemeLJIIZILJ2.getAid());
            smartRouteBuildRoute.withParam("extra_music_from", LJIJJLI());
            smartRouteBuildRoute.withParam("sticker_id", awemeLJIIZILJ2.getStickerIDs());
            C1386280mB8.LIZ(smartRouteBuildRoute, awemeLJIIZILJ2);
            smartRouteBuildRoute.withParam("process_id", string);
            smartRouteBuildRoute.withParam("extra_video_length", videoLength);
            smartRouteBuildRoute.withParam("aweme_type", awemeLJIIZILJ2.getAwemeType());
            smartRouteBuildRoute.open(10086);
            C721190SQr c721190SQr = C721190SQr.LIZ;
            C19EG c19eg = this.LLJ;
            FullPageParam fullPageParam = this.LLJI;
            c721190SQr.getClass();
            C721190SQr.LJIIZILJ(mid, c19eg, fullPageParam);
            LJJII(c2344009Gk, true, true);
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLJ);
        c1389890mGx.LJIIIZ(2131839802);
        c1389890mGx.LJIIJJI();
    }
}
