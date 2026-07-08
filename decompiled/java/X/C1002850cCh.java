package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS85S0200000_16;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002850cCh implements InterfaceC988260bpA {
    public final C0Q1B LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1105));
    public final C1004580cFU LLILLL = new C1004580cFU(0);
    public final Aweme LLILZ;
    public final SearchAdEventLogger LLILZIL;
    public InterfaceC1002840cCg LLILZLL;
    public final C01GW LLIZ;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC988260bpA
    public final void onDestroy() {
        this.LLILZLL = null;
    }

    public final InterfaceC660150Puv LIZ() {
        return (InterfaceC660150Puv) this.LLILLJJLI.getValue();
    }

    public final void LIZIZ() {
        Video video;
        Aweme aweme = this.LL.getAweme();
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return;
        }
        long videoLength = video.getVideoLength();
        InterfaceC1002840cCg interfaceC1002840cCg = this.LLILZLL;
        AwemeRawAd awemeRawAdLJIIIIZZ = null;
        VideoPlayTaskManager videoPlayTaskManagerLIZIZ = interfaceC1002840cCg != null ? interfaceC1002840cCg.LIZIZ() : null;
        double d = videoLength;
        int i = (int) (0.25d * d);
        int i2 = (int) (0.5d * d);
        int i3 = (int) (d * 0.75d);
        if (C1010120cOQ.LJJIJ(this.LLILZ)) {
            Aweme aweme2 = this.LLILZ;
            if (aweme2 != null) {
                awemeRawAdLJIIIIZZ = C1010120cOQ.LJIIIIZZ(aweme2);
            }
        } else {
            Aweme aweme3 = this.LLILZ;
            if (aweme3 != null) {
                awemeRawAdLJIIIIZZ = aweme3.getAwemeRawAd();
            }
        }
        if (videoLength >= 2000 && videoPlayTaskManagerLIZIZ != null) {
            C988300bpE c988300bpE = new C988300bpE("2sPlayProgressTrack");
            c988300bpE.LIZIZ(videoLength);
            c988300bpE.LIZJ = 2000;
            c988300bpE.LIZLLL = new ARunnableS85S0200000_16(this, awemeRawAdLJIIIIZZ, 47);
            c988300bpE.LJ = true;
            videoPlayTaskManagerLIZIZ.LLIFFJFJJ(c988300bpE.LIZ());
        }
        if (videoLength >= 6000) {
            if (videoPlayTaskManagerLIZIZ == null) {
                return;
            }
            C988300bpE c988300bpE2 = new C988300bpE("6sPlayProgressTrack");
            c988300bpE2.LIZIZ(videoLength);
            c988300bpE2.LIZJ = 6000;
            c988300bpE2.LIZLLL = new ARunnableS85S0200000_16(this, awemeRawAdLJIIIIZZ, 48);
            c988300bpE2.LJ = true;
            videoPlayTaskManagerLIZIZ.LLIFFJFJJ(c988300bpE2.LIZ());
        } else if (videoPlayTaskManagerLIZIZ == null) {
            return;
        }
        C988300bpE c988300bpE3 = new C988300bpE("searchVideoFirstQuartileTimingTask");
        c988300bpE3.LIZIZ(videoLength);
        c988300bpE3.LIZJ = i;
        c988300bpE3.LIZLLL = new ARunnableS116S0100000_16(this, 174);
        c988300bpE3.LJ = true;
        videoPlayTaskManagerLIZIZ.LLIFFJFJJ(c988300bpE3.LIZ());
        C988300bpE c988300bpE4 = new C988300bpE("searchVideoMidQuartileTimingTask");
        c988300bpE4.LIZIZ(videoLength);
        c988300bpE4.LIZJ = i2;
        c988300bpE4.LIZLLL = new ARunnableS116S0100000_16(this, 175);
        c988300bpE4.LJ = true;
        videoPlayTaskManagerLIZIZ.LLIFFJFJJ(c988300bpE4.LIZ());
        C988300bpE c988300bpE5 = new C988300bpE("searchVideoThirdQuartileTimingTask");
        c988300bpE5.LIZIZ(videoLength);
        c988300bpE5.LIZJ = i3;
        c988300bpE5.LIZLLL = new ARunnableS116S0100000_16(this, 176);
        c988300bpE5.LJ = true;
        videoPlayTaskManagerLIZIZ.LLIFFJFJJ(c988300bpE5.LIZ());
    }

    @Override // X.InterfaceC988260bpA
    public final void LL() {
        VideoPlayTaskManager videoPlayTaskManagerLIZIZ;
        int i = C2510609se.LIZ;
        this.LLILLL.LIZJ.clear();
        C1010120cOQ.LJJIL(this.LLILLL);
        if (C1010120cOQ.LJJIJ(this.LLILZ)) {
            InterfaceC1002840cCg interfaceC1002840cCg = this.LLILZLL;
            if (interfaceC1002840cCg != null && (videoPlayTaskManagerLIZIZ = interfaceC1002840cCg.LIZIZ()) != null) {
                videoPlayTaskManagerLIZIZ.LL();
            }
            LIZIZ();
        }
    }

    @Override // X.InterfaceC988260bpA
    public final void Uh2() {
        C1007860cKm c1007860cKmLJIILIIL;
        int i = C2510609se.LIZ;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null) {
            c1007860cKmLJIILIIL.LIZLLL(this.LLILZ, EnumC590180NCu.HAS_TRACKED_IN_DETAIL_PAGE);
        }
        ((InterfaceC1002890cCl) this.LLIZ.getValue()).LIZ(true);
    }

    @Override // X.InterfaceC988260bpA
    public final void y70() {
        int i = C2510609se.LIZ;
        Aweme aweme = this.LLILZ;
        if (aweme == null || !C1010120cOQ.LJJIFFI(aweme)) {
            return;
        }
        Df1();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    @Override // X.InterfaceC988260bpA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Df1() {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "transformOpen transformOpenClickType = "
            r1.append(r0)
            X.0Puv r0 = r8.LIZ()
            r6 = 0
            if (r0 == 0) goto L82
            java.lang.Integer r0 = r0.LJIIL()
        L14:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            int r0 = X.C2510609se.LIZ
            X.0Puv r0 = r8.LIZ()
            if (r0 == 0) goto L80
            java.lang.Integer r7 = r0.LJIIL()
        L26:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LLILZ
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L7e
            boolean r0 = X.C1017180cZo.LJJII(r0)
            r5 = 1
            if (r0 != r5) goto L7e
        L37:
            if (r7 != 0) goto L7c
            if (r5 == 0) goto L75
            java.lang.Integer r0 = X.C0DHT.LIZ
        L3d:
            if (r0 == 0) goto L75
            int r4 = r0.intValue()
            kotlin.jvm.internal.AwS156S0101000_16 r3 = new kotlin.jvm.internal.AwS156S0101000_16
            r0 = 1
            r3.<init>(r8, r4, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LLILZ
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
        L51:
            boolean r0 = X.C1010120cOQ.LIZIZ(r4, r0)
            if (r0 == 0) goto L76
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0cCe r1 = new X.0cCe
            r1.<init>(r4, r3, r8, r6)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r6, r6, r1, r0)
        L68:
            if (r5 == 0) goto L6c
            if (r7 == 0) goto L75
        L6c:
            X.0Puv r0 = r8.LIZ()
            if (r0 == 0) goto L75
            r0.LJIJJ(r6)
        L75:
            return
        L76:
            r3.invoke()
            goto L68
        L7a:
            r0 = r6
            goto L51
        L7c:
            r0 = r7
            goto L3d
        L7e:
            r5 = 0
            goto L37
        L80:
            r7 = r6
            goto L26
        L82:
            r0 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1002850cCh.Df1():void");
    }

    @Override // X.InterfaceC988260bpA
    public final void ep1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumePlayInDetail  searchAdItemModule = ");
        sbLIZ.append(LIZ());
        sbLIZ.append(" eventTrackList=");
        sbLIZ.append(this.LLILLL.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        LIZIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1001610cAh(null), 3);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ C0Q1B Mh() {
        return this.LL;
    }

    @Override // X.InterfaceC988260bpA
    public final C1004580cFU getShareInfo() {
        return this.LLILLL;
    }

    public C1002850cCh(C0Q19 c0q19) {
        this.LL = c0q19;
        Aweme aweme = c0q19.LIZ;
        this.LLILZ = aweme;
        this.LLILZIL = new SearchAdEventLogger(aweme, C1010120cOQ.LJIIIIZZ(aweme));
        this.LLIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(435));
    }

    @Override // X.InterfaceC988260bpA
    public final void Hf(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayComplete playTims=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = C2510609se.LIZ;
        C1004580cFU c1004580cFU = this.LLILLL;
        c1004580cFU.LIZIZ = i;
        c1004580cFU.LIZJ.clear();
    }

    @Override // X.InterfaceC988260bpA
    public final void f71(int i) {
        this.LLILLL.LIZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    @Override // X.InterfaceC988260bpA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xV0(X.C988250bp9 r15) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1002850cCh.xV0(X.0bp9):void");
    }

    @Override // X.InterfaceC988260bpA
    public final void zG(AwS260S0300000_16 awS260S0300000_16) {
        EnumC590180NCu enumC590180NCuLIZJ;
        C1007860cKm c1007860cKmLJIILIIL;
        C1007860cKm c1007860cKmLJIILIIL2;
        C1004580cFU shareInfo;
        int i = C2510609se.LIZ;
        InterfaceC660150Puv interfaceC660150PuvLIZ = LIZ();
        if (interfaceC660150PuvLIZ != null && (shareInfo = interfaceC660150PuvLIZ.getShareInfo()) != null) {
            C1010120cOQ.LJJJJI(this.LLILLL, shareInfo);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterFromSearch eventTrackedList = ");
        sbLIZ.append(this.LLILLL.LIZJ);
        sbLIZ.append(" playtims = ");
        sbLIZ.append(this.LLILLL.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (!CommerceSearchAdConfigSetting.LIZ().enableDedupShowAndOmsdk) {
            if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL2 = interfaceC657510PqfLIZLLL.LJIILIIL()) != null) {
                enumC590180NCuLIZJ = c1007860cKmLJIILIIL2.LIZJ(this.LLILZ);
            } else {
                enumC590180NCuLIZJ = null;
            }
            EnumC590180NCu enumC590180NCu = EnumC590180NCu.HAS_TRACKED_IN_DETAIL_PAGE;
            if (enumC590180NCuLIZJ != enumC590180NCu && C0R12.LIZIZ.LJIILJJIL(this.LLILZ, "general_search")) {
                awS260S0300000_16.invoke();
                ((InterfaceC1002890cCl) this.LLIZ.getValue()).LIZ(true);
                if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null) {
                    c1007860cKmLJIILIIL.LIZLLL(this.LLILZ, enumC590180NCu);
                }
            }
        }
        SearchAdEventLogger searchAdEventLogger = this.LLILZIL;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJIILL, new AwS595S0100000_16(this, 303));
        this.LLILLL.LJ = false;
    }

    @Override // X.InterfaceC988260bpA
    public final void zO(EnumC1010840cPa enumC1010840cPa) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("appendVideoPlayTrackList type = ");
        sbLIZ.append(enumC1010840cPa);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        this.LLILLL.LIZJ.add(enumC1010840cPa);
    }
}
