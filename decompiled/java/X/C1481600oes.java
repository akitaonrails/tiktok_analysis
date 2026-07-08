package X;

import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;

/* JADX INFO: renamed from: X.0oes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481600oes {
    public String LIZ;
    public VideoInfo LIZIZ;
    public C1481690of1 LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerStateManager key ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ssid ");
        sbLIZ.append((String) null);
        sbLIZ.append(", currentVideoInfo ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(C1481560oeo c1481560oeo) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new VideoInfo();
        }
        VideoInfo videoInfo = this.LIZIZ;
        if (videoInfo != null) {
            videoInfo.setAid(c1481560oeo.LIZ);
            videoInfo.setPlayBitrate(c1481560oeo.LJIILL);
            videoInfo.setVideoBitrate(c1481560oeo.LJFF);
            videoInfo.setAudioBitrate(c1481560oeo.LJI);
            videoInfo.setBitRateSet(c1481560oeo.LJIIL);
            videoInfo.setVideoQuality(c1481560oeo.LJIIJ);
            videoInfo.setAudioQuality(c1481560oeo.LJIIJJI);
            videoInfo.setDuration(c1481560oeo.LJIILJJIL);
            videoInfo.setBytevc1(c1481560oeo.LJJIJ);
            videoInfo.setVideoSize(c1481560oeo.LIZJ);
            videoInfo.setCodecName(String.valueOf(c1481560oeo.LJIJJLI));
            videoInfo.setCodecNameStr(c1481560oeo.LJIL);
            videoInfo.setCodecId(c1481560oeo.LJJIIZ);
            videoInfo.setPreCacheSize(c1481560oeo.LJJII);
            videoInfo.setPreloaded(c1481560oeo.LJJII);
            videoInfo.setInternetSpeed(c1481560oeo.LJIIIZ);
            videoInfo.setAccess2(c1481560oeo.LJJIFFI);
            videoInfo.setBatterySaver(c1481560oeo.LJJIIZI);
            videoInfo.setPtPredictL(c1481560oeo.LJJIIJZLJL);
        } else {
            videoInfo = null;
        }
        this.LIZIZ = videoInfo;
    }

    public final void LIZIZ(String str, C1481580oeq c1481580oeq) {
        VideoInfo videoInfo;
        this.LIZ = str;
        if (c1481580oeq != null) {
            videoInfo = new VideoInfo();
            videoInfo.setAppId(c1481580oeq.LIZ);
            videoInfo.setAppVersion(c1481580oeq.LIZJ);
            videoInfo.setAid(c1481580oeq.LIZIZ);
            videoInfo.setDuration(c1481580oeq.LIZLLL);
            videoInfo.setHitCache(c1481580oeq.LJII);
            videoInfo.setPreCacheSize(c1481580oeq.LJIIIZ);
            videoInfo.setPlayBitrate(c1481580oeq.LJIILIIL);
            videoInfo.setVideoBitrate(c1481580oeq.LJIILJJIL);
            videoInfo.setVideoQuality(c1481580oeq.LJIILL);
            videoInfo.setAudioBitrate(c1481580oeq.LJIILLIIL);
            videoInfo.setAudioQuality(c1481580oeq.LJIIZILJ);
            videoInfo.setCodecName(c1481580oeq.LJIIJJI);
            videoInfo.setCodecId(c1481580oeq.LJIIJ);
            videoInfo.setInternetSpeed(c1481580oeq.LJIJI);
            videoInfo.setAccess2(c1481580oeq.LJI);
            videoInfo.setEnableHdr(c1481580oeq.LJIJJ);
        } else {
            videoInfo = null;
        }
        this.LIZIZ = videoInfo;
    }

    public final void LIZJ(String str, C1481580oeq c1481580oeq) {
        this.LIZ = str;
        VideoInfo videoInfo = this.LIZIZ;
        if (videoInfo != null) {
            videoInfo.setAppId(c1481580oeq.LIZ);
            videoInfo.setAppVersion(c1481580oeq.LIZJ);
            videoInfo.setAid(c1481580oeq.LIZIZ);
            videoInfo.setDuration(c1481580oeq.LIZLLL);
            videoInfo.setHitCache(c1481580oeq.LJII);
            videoInfo.setPreCacheSize(c1481580oeq.LJIIIZ);
            videoInfo.setPlayBitrate(c1481580oeq.LJIILIIL);
            videoInfo.setVideoBitrate(c1481580oeq.LJIILJJIL);
            videoInfo.setVideoQuality(c1481580oeq.LJIILL);
            videoInfo.setAudioBitrate(c1481580oeq.LJIILLIIL);
            videoInfo.setAudioQuality(c1481580oeq.LJIIZILJ);
            videoInfo.setCodecName(c1481580oeq.LJIIJJI);
            videoInfo.setCodecId(c1481580oeq.LJIIJ);
            videoInfo.setInternetSpeed(c1481580oeq.LJIJI);
            videoInfo.setAccess2(c1481580oeq.LJI);
            videoInfo.setEnableHdr(c1481580oeq.LJIJJ);
        } else {
            videoInfo = null;
        }
        this.LIZIZ = videoInfo;
    }
}
