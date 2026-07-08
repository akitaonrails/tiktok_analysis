package X;

import Y.ARunnableS111S0100000_11;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mVV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398910mVV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ UrlModel LL;
    public final /* synthetic */ VideoMusicCoverAssem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ SmartImageView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398910mVV(UrlModel urlModel, VideoMusicCoverAssem videoMusicCoverAssem, int i, int i2, C427870Gq9 c427870Gq9) {
        super(0);
        this.LL = urlModel;
        this.LLILLJJLI = videoMusicCoverAssem;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = c427870Gq9;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(this.LL);
        if (C637980P0q.LIZ(((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme()) && imageUrlModelLIZ.isEmpty()) {
            this.LLILLJJLI.Qp();
            VideoMusicCoverAssem videoMusicCoverAssem = this.LLILLJJLI;
            C427870Gq9 c427870Gq9 = videoMusicCoverAssem.LLLI;
            if (c427870Gq9 != null) {
                HandlerHook.viewPost(c427870Gq9, new ARunnableS111S0100000_11(videoMusicCoverAssem, 2));
            }
            C608450Ntj c608450Ntj = C608450Ntj.LIZ;
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme();
            String str = ((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).mEventType;
            C1D92 c1d92 = this.LLILLJJLI.LLLIIII;
            boolean z = c1d92 != null && c1d92.getVisibility() == 0;
            c608450Ntj.getClass();
            C608450Ntj.LJFF(str, C608450Ntj.LIZLLL(aweme), aweme, false, z);
        } else {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(this.LL));
            int i = this.LLILLL;
            int i2 = this.LLILZ;
            c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
            c1331670kl3LJIIIIZZ.LJIIIZ = i2;
            c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
            c1331670kl3LJIIIIZZ.LIZLLL("VideoMusicCoverAssem");
            c1331670kl3LJIIIIZZ.LJJ(this.LLILZIL);
            C608450Ntj c608450Ntj2 = C608450Ntj.LIZ;
            Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme();
            String str2 = ((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).mEventType;
            c608450Ntj2.getClass();
            c1331670kl3LJIIIIZZ.LJJJIL = new C608420Ntg(aweme2, str2);
            if (C302070Bsj.LIZ() == 3 || C302070Bsj.LIZ() == 7) {
                c1331670kl3LJIIIIZZ.LJIIJJI();
            } else {
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        }
        return Unit.LIZ;
    }
}
