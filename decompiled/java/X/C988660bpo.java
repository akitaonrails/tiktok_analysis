package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: renamed from: X.0bpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988660bpo implements InterfaceC422740Ghs {
    public long LIZ;
    public final ARunnableS116S0100000_16 LIZIZ = new ARunnableS116S0100000_16(this, 194);
    public final /* synthetic */ CommerceVideoDelegateKt LIZJ;
    public final /* synthetic */ LinkData LIZLLL;

    @Override // X.InterfaceC422740Ghs
    public final void LIZLLL() {
        if (this.LIZ == 0) {
            return;
        }
        C988670bpp c988670bppLJ = LJ();
        c988670bppLJ.LIZ = "show_over";
        c988670bppLJ.LJFF = 0;
        c988670bppLJ.LJI = System.currentTimeMillis() - this.LIZ;
        C1019030ccn.LJIJJ(this.LIZJ.context, c988670bppLJ.LIZ());
        this.LIZ = 0L;
        C422750Ght c422750Ght = this.LIZJ.linkTag;
        if (c422750Ght != null) {
            HandlerHook.viewRemoveCallbacks(c422750Ght, this.LIZIZ);
        }
    }

    public final C988670bpp LJ() {
        C988670bpp c988670bpp = new C988670bpp();
        c988670bpp.LIZIZ = this.LIZLLL;
        c988670bpp.LIZJ = this.LIZJ.aweme;
        c988670bpp.LIZLLL = false;
        return c988670bpp;
    }

    @Override // X.InterfaceC422730Ghr
    public final void LIZ() {
        C988670bpp c988670bppLJ = LJ();
        c988670bppLJ.LIZ = "close";
        c988670bppLJ.LJFF = 0;
        C1019030ccn.LJIJJ(this.LIZJ.context, c988670bppLJ.LIZ());
        Aweme aweme = this.LIZJ.aweme;
        if (aweme != null && C1017070cZd.LJLJJLL(aweme)) {
            CommerceVideoDelegateKt commerceVideoDelegateKt = this.LIZJ;
            C1019030ccn.LJIL("link_click", commerceVideoDelegateKt.context, this.LIZLLL, commerceVideoDelegateKt.aweme, false, false);
        }
        LIZLLL();
    }

    @Override // X.InterfaceC422730Ghr
    public final void LIZIZ() {
        AwemeCommerceStruct commerceVideoAuthInfo;
        String originUri;
        Video video;
        VideoUrlModel playAddr;
        C988670bpp c988670bppLJ = LJ();
        c988670bppLJ.LIZ = "click";
        c988670bppLJ.LJFF = 100;
        C1019030ccn.LJIJJ(this.LIZJ.context, c988670bppLJ.LIZ());
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LIZJ;
        C988380bpM c988380bpM = ((C988370bpL) commerceVideoDelegateKt.depend).LIZJ;
        Context context = commerceVideoDelegateKt.context;
        LinkData linkData = this.LIZLLL;
        Aweme aweme = commerceVideoDelegateKt.aweme;
        c988380bpM.getClass();
        AbstractC1025070cmX.LJIJJ(context, linkData, aweme, false);
        Aweme aweme2 = this.LIZJ.aweme;
        if (aweme2 != null && C1017070cZd.LJLJJLL(aweme2)) {
            CommerceVideoDelegateKt commerceVideoDelegateKt2 = this.LIZJ;
            C1019030ccn.LJIL("link_click", commerceVideoDelegateKt2.context, this.LIZLLL, commerceVideoDelegateKt2.aweme, false, false);
        }
        Aweme aweme3 = this.LIZJ.aweme;
        if (aweme3 == null || (commerceVideoAuthInfo = aweme3.getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo.getAdSource() != 1) {
            return;
        }
        CommerceVideoDelegateKt commerceVideoDelegateKt3 = this.LIZJ;
        C1019030ccn.LJJIIZI(commerceVideoDelegateKt3.context, commerceVideoDelegateKt3.aweme, "common_link");
        Aweme aweme4 = this.LIZJ.aweme;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme4 != null ? aweme4.getAwemeRawAd() : null);
        c1022820ciuLIZLLL.LIZJ("common_link", "refer");
        Aweme aweme5 = this.LIZJ.aweme;
        if (aweme5 == null || (video = aweme5.getVideo()) == null || (playAddr = video.getPlayAddr()) == null || (originUri = playAddr.getOriginUri()) == null) {
            originUri = "";
        }
        c1022820ciuLIZLLL.LIZIZ(originUri, "bsh_video_id");
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    @Override // X.InterfaceC422730Ghr
    public final void LIZJ() {
        C422750Ght c422750Ght;
        C988670bpp c988670bppLJ = LJ();
        c988670bppLJ.LIZ = "show";
        c988670bppLJ.LJFF = 100;
        C1019030ccn.LJIJJ(this.LIZJ.context, c988670bppLJ.LIZ());
        this.LIZ = System.currentTimeMillis();
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LIZJ;
        if (commerceVideoDelegateKt.linkTag != null && (c422750Ght = commerceVideoDelegateKt.linkTag) != null) {
            HandlerHook.viewPostDelay(c422750Ght, this.LIZIZ, 1000L);
        }
        C1603330rpD.LIZIZ.LJ().LIZIZ(this.LIZJ.aweme, this.LIZLLL);
    }

    public C988660bpo(CommerceVideoDelegateKt commerceVideoDelegateKt, LinkData linkData) {
        this.LIZJ = commerceVideoDelegateKt;
        this.LIZLLL = linkData;
    }
}
