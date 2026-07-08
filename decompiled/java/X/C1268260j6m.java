package X;

import com.ss.bytertc.engine.type.VideoStrategyChannelParams;
import com.ss.bytertc.engine.type.VideoStrategyChannelResult;
import com.ss.bytertc.engine.type.VideoStrategyParams;
import com.ss.bytertc.engine.video.IVideoStrategyResultListener;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0j6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268260j6m implements IVideoStrategyRunner {
    public IVideoStrategyResultListener LIZ;
    public C1267280j5C LIZIZ;
    public EnumC1267980j6K LIZJ = EnumC1267980j6K.NORMAL_LIVE;
    public int LIZLLL;

    @Override // com.ss.bytertc.engine.video.IVideoStrategyRunner
    public final boolean isActive() {
        if (this.LIZIZ == null) {
            return false;
        }
        int i = C1266940j4e.LIZ[this.LIZJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && (this.LIZLLL & 16) == 16) {
                            return true;
                        }
                    } else if ((this.LIZLLL & 8) == 8) {
                        return true;
                    }
                } else if ((this.LIZLLL & 4) == 4) {
                    return true;
                }
            } else if ((this.LIZLLL & 2) == 2) {
                return true;
            }
        } else if ((this.LIZLLL & 1) == 1) {
            return true;
        }
        return false;
    }

    public final void LIZ(ArrayList<C1268270j6n> arrayList) {
        if (this.LIZ == null || arrayList.isEmpty()) {
            return;
        }
        VideoStrategyChannelResult[] videoStrategyChannelResultArr = new VideoStrategyChannelResult[arrayList.size()];
        int i = 0;
        for (C1268270j6n c1268270j6n : arrayList) {
            VideoStrategyChannelResult videoStrategyChannelResult = new VideoStrategyChannelResult();
            videoStrategyChannelResultArr[i] = videoStrategyChannelResult;
            videoStrategyChannelResult.channelIndex = c1268270j6n.LIZ;
            videoStrategyChannelResult.finalBps = c1268270j6n.LIZIZ;
            C1268250j6l c1268250j6l = c1268270j6n.LJ;
            videoStrategyChannelResult.finalFps = c1268250j6l.LIZ;
            videoStrategyChannelResult.finalWidth = c1268250j6l.LIZIZ;
            videoStrategyChannelResult.finalHeight = c1268250j6l.LIZJ;
            C1268250j6l c1268250j6l2 = c1268270j6n.LIZJ;
            videoStrategyChannelResult.perfFps = c1268250j6l2.LIZ;
            videoStrategyChannelResult.perfWidth = c1268250j6l2.LIZIZ;
            videoStrategyChannelResult.perfHeight = c1268250j6l2.LIZJ;
            C1268250j6l c1268250j6l3 = c1268270j6n.LIZLLL;
            videoStrategyChannelResult.netFps = c1268250j6l3.LIZ;
            videoStrategyChannelResult.netWidth = c1268250j6l3.LIZIZ;
            videoStrategyChannelResult.netHeight = c1268250j6l3.LIZJ;
            videoStrategyChannelResult.minBps = c1268270j6n.LJFF;
            videoStrategyChannelResult.maxBps = c1268270j6n.LJI;
            videoStrategyChannelResult.minRequestBps = c1268270j6n.LJII;
            i++;
        }
        this.LIZ.onVideoStrategyResult(videoStrategyChannelResultArr);
    }

    @Override // com.ss.bytertc.engine.video.IVideoStrategyRunner
    public final void setResultListener(IVideoStrategyResultListener iVideoStrategyResultListener) {
        this.LIZ = iVideoStrategyResultListener;
    }

    @Override // com.ss.bytertc.engine.video.IVideoStrategyRunner
    public final void updateFeatures(VideoStrategyParams videoStrategyParams) {
        if (this.LIZIZ == null) {
            return;
        }
        C1267170j51 c1267170j51 = new C1267170j51();
        for (VideoStrategyChannelParams videoStrategyChannelParams : videoStrategyParams.getChannelEncInfoTable()) {
            C1267240j58 c1267240j58 = new C1267240j58();
            int i = videoStrategyChannelParams.channelIndex;
            c1267240j58.LIZ = i;
            c1267240j58.LIZIZ = videoStrategyChannelParams.subscriberMaxDownlinkBps;
            c1267240j58.LIZJ = videoStrategyChannelParams.subscriberCount;
            c1267240j58.LIZLLL = videoStrategyChannelParams.cfgMaxEncWidth;
            c1267240j58.LJ = videoStrategyChannelParams.cfgMaxEncHeight;
            c1267240j58.LJFF = videoStrategyChannelParams.cfgMaxEncFps;
            c1267240j58.LJI = videoStrategyChannelParams.cfgMinEncBps;
            c1267240j58.LJII = videoStrategyChannelParams.cfgMaxEncBps;
            c1267240j58.LJIIIIZZ = videoStrategyChannelParams.currentEncWidth;
            c1267240j58.LJIIIZ = videoStrategyChannelParams.currentEncHeight;
            c1267240j58.LJIIJ = videoStrategyChannelParams.currentEncTargetFps;
            c1267240j58.LJIIJJI = videoStrategyChannelParams.currentEncTargetBps;
            ((HashMap) c1267170j51.LIZJ).put(Integer.valueOf(i), c1267240j58);
        }
        c1267170j51.LIZ = videoStrategyParams.getMediaTargetBps();
        c1267170j51.LIZIZ = videoStrategyParams.getSceneType();
        C1267080j4s c1267080j4s = this.LIZIZ.LIZLLL;
        c1267080j4s.LIZ(c1267080j4s.LJIILJJIL, c1267170j51);
    }
}
