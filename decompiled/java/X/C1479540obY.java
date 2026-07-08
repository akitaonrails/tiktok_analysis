package X;

import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0obY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479540obY {
    public static SimVideo LIZIZ(InterfaceC1479620obg interfaceC1479620obg) {
        InterfaceC1479740obs interfaceC1479740obs;
        InterfaceC1479740obs interfaceC1479740obs2;
        SimBitRate simBitRate;
        C1479530obX request;
        SimVideo simVideo;
        if (interfaceC1479620obg == null) {
            return null;
        }
        SimVideo simVideo2 = new SimVideo();
        simVideo2.setRatio(interfaceC1479620obg.getRatio());
        simVideo2.setMeta(interfaceC1479620obg.getMeta());
        interfaceC1479620obg.LJI();
        simVideo2.setVideoThumbs(null);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(interfaceC1479620obg.getFormat())) {
            simVideo2.setFormat(interfaceC1479620obg.getFormat());
        }
        if (((Boolean) C1474810oTv.LIZLLL.getValue()).booleanValue() && (request = interfaceC1479620obg.getRequest()) != null && (simVideo = request.LIZLLL) != null) {
            return simVideo;
        }
        if (interfaceC1479620obg.LJII() != null) {
            if (interfaceC1479620obg.LIZLLL() != null && !TextUtils.isEmpty(null)) {
                Iterator<InterfaceC1479740obs> it2 = interfaceC1479620obg.LJII().iterator();
                if (it2.hasNext()) {
                    it2.next().getKey();
                    throw null;
                }
            } else {
                for (InterfaceC1479740obs interfaceC1479740obs3 : interfaceC1479620obg.LJII()) {
                    if (interfaceC1479740obs3 == null) {
                        simBitRate = null;
                    } else {
                        simBitRate = new SimBitRate();
                        simBitRate.setBitRate(interfaceC1479740obs3.getBitRate());
                        simBitRate.setGearName(interfaceC1479740obs3.getGearName());
                        simBitRate.setQualityType(interfaceC1479740obs3.getQualityType());
                        simBitRate.setPlayAddr(LIZJ(interfaceC1479620obg, interfaceC1479740obs3));
                        simBitRate.setCodecType(interfaceC1479740obs3.LJIIIZ());
                        simBitRate.setVideoExtra(interfaceC1479740obs3.LJIIJ());
                    }
                    arrayList.add(simBitRate);
                }
            }
            simVideo2.setBitRate(arrayList);
        }
        interfaceC1479620obg.LJI();
        if (interfaceC1479620obg.LJIIJJI() != null) {
            interfaceC1479740obs = null;
            interfaceC1479740obs2 = null;
            for (InterfaceC1479740obs interfaceC1479740obs4 : interfaceC1479620obg.LJIIJJI()) {
                if (interfaceC1479740obs4.LJIIIZ() == 0) {
                    interfaceC1479740obs = interfaceC1479740obs4;
                } else if (interfaceC1479740obs4.LJIIIZ() == 1) {
                    interfaceC1479740obs2 = interfaceC1479740obs4;
                }
            }
        } else {
            interfaceC1479740obs = null;
            interfaceC1479740obs2 = null;
        }
        SimVideoUrlModel simVideoUrlModelLIZJ = LIZJ(interfaceC1479620obg, interfaceC1479740obs);
        if (simVideoUrlModelLIZJ != null) {
            simVideo2.setPlayAddr(simVideoUrlModelLIZJ);
            simVideo2.setPlayAddrH264(simVideoUrlModelLIZJ);
            simVideoUrlModelLIZJ.setSourceId(interfaceC1479620obg.getKey());
            if (arrayList.size() > 0) {
                simVideoUrlModelLIZJ.setBitRate(arrayList);
            }
        }
        SimVideoUrlModel simVideoUrlModelLIZJ2 = LIZJ(interfaceC1479620obg, interfaceC1479740obs2);
        if (simVideoUrlModelLIZJ2 != null) {
            simVideo2.setPlayAddrBytevc1(simVideoUrlModelLIZJ2);
            if (arrayList.size() > 0) {
                simVideoUrlModelLIZJ2.setBitRate(arrayList);
            }
        }
        if (interfaceC1479620obg.LIZIZ() != null) {
            simVideo2.setVideoModelStr(((C1480030ocL) interfaceC1479620obg.LIZIZ()).LIZ.LIZJ.LIZ.LIZLLL.LIZ);
            interfaceC1479620obg.LIZIZ().getClass();
            simVideo2.setVideoModelMap(null);
            interfaceC1479620obg.LIZIZ().getClass();
            simVideo2.setDrmTokenAuth(null);
        }
        simVideo2.setSourceId(interfaceC1479620obg.getKey());
        interfaceC1479620obg.LIZ();
        simVideo2.cdnUrlExpired = 0L;
        simVideo2.setDuration(interfaceC1479620obg.getDuration());
        simVideo2.setMeta(interfaceC1479620obg.getMeta());
        interfaceC1479620obg.getVideoWidth();
        simVideo2.setWidth(0);
        interfaceC1479620obg.getVideoHeight();
        simVideo2.setHeight(0);
        return simVideo2;
    }

    public static SimVideoUrlModel LIZLLL(InterfaceC1479620obg interfaceC1479620obg) {
        C1479530obX c1479530obXLIZ = LIZ(interfaceC1479620obg, null);
        SimVideoUrlModel simVideoUrlModel = c1479530obXLIZ.LJII;
        SimVideo simVideo = c1479530obXLIZ.LIZLLL;
        if (simVideoUrlModel == null && simVideo != null) {
            return C1479290ob9.LJII(simVideo);
        }
        return simVideoUrlModel;
    }

    public static C1479530obX LJ(C1479530obX c1479530obX) {
        SimVideo simVideo = c1479530obX.LIZLLL;
        if (simVideo == null) {
            return null;
        }
        simVideo.setPlayAddrBytevc1(null);
        List<SimBitRate> bitRate = simVideo.getBitRate();
        ArrayList arrayList = new ArrayList();
        if (bitRate != null) {
            for (SimBitRate simBitRate : bitRate) {
                if (simBitRate.isBytevc1() == 0) {
                    arrayList.add(simBitRate);
                }
            }
        }
        simVideo.setBitRate(arrayList);
        if (simVideo.getPlayAddrH264() != null && simVideo.getPlayAddrH264().getHitBitrate() != null && simVideo.getPlayAddrH264().getHitBitrate().isBytevc1() == 1) {
            simVideo.getPlayAddrH264().setHitBitrate(null);
            C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
            String sourceId = simVideo.getPlayAddrH264().getSourceId();
            c1477400oY6.getClass();
            if (!TextUtils.isEmpty(sourceId)) {
                c1477400oY6.LIZLLL.remove(sourceId);
            }
        }
        if (simVideo.getPlayAddrH264() == null && (simVideo.getBitRate() == null || simVideo.getBitRate().size() == 0)) {
            return null;
        }
        c1479530obX.LIZLLL = simVideo;
        return c1479530obX;
    }

    public static C1479530obX LIZ(InterfaceC1479620obg interfaceC1479620obg, Surface surface) {
        String key;
        boolean z;
        IRadarTransmitter iRadarTransmitterLJIIIZ;
        String strSubstring;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1479570obb c1479570obbLIZLLL = interfaceC1479620obg.LIZLLL();
        SimVideo simVideoLIZIZ = LIZIZ(interfaceC1479620obg);
        C1479720obq c1479720obq = new C1479720obq();
        C1479530obX c1479530obX = c1479720obq.LIZ;
        c1479530obX.LIZLLL = simVideoLIZIZ;
        c1479530obX.LJJLIL = 2;
        if (interfaceC1479620obg.LJ() != null) {
            c1479720obq.LIZ.LJJJJZI = interfaceC1479620obg.LJ();
        }
        if (c1479570obbLIZLLL != null) {
            interfaceC1479620obg.LJIIJ();
            if (TextUtils.isEmpty(null)) {
                key = interfaceC1479620obg.getKey();
            } else {
                interfaceC1479620obg.LJIIJ();
                key = null;
            }
            OnPreRenderListener onPreRenderListener = c1479570obbLIZLLL.LIZ;
            C1479530obX c1479530obX2 = c1479720obq.LIZ;
            c1479530obX2.LIZIZ = onPreRenderListener;
            c1479530obX2.LJJJLZIJ = c1479570obbLIZLLL.LJJ;
            c1479530obX2.LJJJZ = false;
            c1479530obX2.LJIIIIZZ = c1479570obbLIZLLL.LJIJI;
            if (!C1480850odf.LIZJ.optSpecialAppAnr() && (((iRadarTransmitterLJIIIZ = C1475000oUE.LJIIIZ()) == null || iRadarTransmitterLJIIIZ.enabled()) && !TextUtils.isEmpty(key))) {
                if (key != null) {
                    int length = key.length();
                    if (6 <= length) {
                        length = 6;
                    }
                    strSubstring = key.substring(0, length);
                } else {
                    strSubstring = null;
                }
                C1479530obX c1479530obX3 = c1479720obq.LIZ;
                c1479530obX3.LJJLIIIJLLLLLLLZ = strSubstring;
                SimVideo simVideo = c1479530obX3.LIZLLL;
                if (simVideo != null) {
                    SimVideoUrlModel playAddr = simVideo.getPlayAddr();
                    if (playAddr != null) {
                        playAddr.setLogLabel(strSubstring);
                    }
                    SimVideoUrlModel playAddrH264 = simVideo.getPlayAddrH264();
                    if (playAddrH264 != null) {
                        playAddrH264.setLogLabel(strSubstring);
                    }
                    SimVideoUrlModel playAddrBytevc1 = simVideo.getPlayAddrBytevc1();
                    if (playAddrBytevc1 != null) {
                        playAddrBytevc1.setLogLabel(strSubstring);
                    }
                    List<SimBitRate> bitRate = simVideo.getBitRate();
                    if (bitRate != null) {
                        for (SimBitRate simBitRate : bitRate) {
                            SimUrlModel simUrlModel = simBitRate.playAddrBytevc1;
                            if (simUrlModel != null) {
                                simUrlModel.setLogLabel(strSubstring);
                            }
                            SimUrlModel playAddr2 = simBitRate.getPlayAddr();
                            if (playAddr2 != null) {
                                playAddr2.setLogLabel(strSubstring);
                            }
                        }
                    }
                }
            }
            C1479530obX c1479530obX4 = c1479720obq.LIZ;
            c1479530obX4.LJIIJ = true;
            c1479530obX4.LJIILLIIL = c1479570obbLIZLLL.LIZIZ;
            c1479530obX4.LJJLIIIJJI = c1479570obbLIZLLL.LJJI;
            c1479530obX4.LJJ = false;
            c1479530obX4.LJJI = false;
            c1479530obX4.LJJL = false;
            c1479530obX4.LJJLJ = false;
            c1479530obX4.LJJII = 1.0f;
            c1479530obX4.LJJIII = true;
            c1479530obX4.LJJIJIL = c1479570obbLIZLLL.LIZJ;
            c1479530obX4.LJJIJL = false;
            c1479530obX4.LJJIJLIJ = false;
            c1479530obX4.LJJIL = false;
            c1479530obX4.LJJIZ = false;
            c1479530obX4.LJJJ = false;
            c1479530obX4.LJJJIL = false;
            c1479530obX4.LJJJI = false;
            c1479530obX4.LJJJJ = 0;
            c1479530obX4.LJJJJI = null;
            c1479530obX4.LJJJJIZL = null;
            c1479530obX4.LJJJJJ = null;
            c1479530obX4.LJJJJJL = c1479570obbLIZLLL.LIZLLL;
            c1479530obX4.LJJJJL = c1479570obbLIZLLL.LJ;
            if (!c1479570obbLIZLLL.LJI && !TextUtils.equals(interfaceC1479620obg.getFormat(), "mp3")) {
                z = false;
            } else {
                z = true;
            }
            C1479530obX c1479530obX5 = c1479720obq.LIZ;
            c1479530obX5.LJJJLIIL = z;
            c1479530obX5.LJJJLL = c1479570obbLIZLLL.LJII;
            c1479530obX5.LJJIFFI = c1479570obbLIZLLL.LJIIIIZZ;
            c1479530obX5.LJIIJJI = c1479570obbLIZLLL.LJIIIZ;
            int i = c1479570obbLIZLLL.LJIIJJI;
            c1479530obX5.LJJJJLL = i;
            c1479530obX5.LJIILIIL = i;
            int i2 = c1479570obbLIZLLL.LJIIJ;
            c1479530obX5.LJJJJLI = i2;
            c1479530obX5.LJIIL = i2;
            c1479530obX5.LJIL = c1479570obbLIZLLL.LJIIL;
            c1479530obX5.LJIJI = c1479570obbLIZLLL.LJIILIIL;
            c1479530obX5.LJIIIZ = c1479570obbLIZLLL.LJIILJJIL;
            c1479530obX5.LJJIIJ = c1479570obbLIZLLL.LJIJJLI;
            c1479530obX5.LJJIIJZLJL = 0L;
            c1479530obX5.LJJIIZ = c1479570obbLIZLLL.LJIL;
            c1479530obX5.LJJIIZI = null;
            c1479530obX5.LJJIJIIJI = null;
            c1479530obX5.LJJIJ = null;
            c1479530obX5.LJJIJIIJIL = null;
            c1479530obX5.LJIJJ = true;
            c1479530obX5.LJIILL = c1479570obbLIZLLL.LJIJJ;
            c1479530obX5.LJI = null;
            c1479530obX5.LJIJJLI = c1479570obbLIZLLL.LJIJ;
            c1479720obq.LIZJ(c1479570obbLIZLLL.LJIILL);
            c1479720obq.LIZIZ(c1479570obbLIZLLL.LJIILLIIL);
            Map<String, String> map = c1479570obbLIZLLL.LJIIZILJ;
            C1479530obX c1479530obX6 = c1479720obq.LIZ;
            c1479530obX6.LJLL = map;
            c1479530obX6.LJJIJLIJ = false;
            c1479530obX6.LJJLIIIJL = jCurrentTimeMillis;
            c1479530obX6.LJJJJZ = false;
            c1479530obX6.LJJZZI = c1479570obbLIZLLL.LJJII;
            c1479530obX6.LJJLIIIJJIZ = c1479570obbLIZLLL.LJJIII;
            c1479530obX6.LJLJJL = c1479570obbLIZLLL.LJJIIJ;
            c1479530obX6.LJLJI = false;
            c1479530obX6.LJLJL = false;
            c1479530obX6.LJJLL = null;
            c1479530obX6.LJLLI = c1479570obbLIZLLL.LJJIIZI;
            c1479530obX6.LJLLILLLL = false;
            c1479530obX6.LJLLLLLL = c1479570obbLIZLLL.LJJIJ;
            c1479530obX6.LJLJJLL = c1479570obbLIZLLL.LJJIIJZLJL;
            c1479530obX6.LIZ = c1479570obbLIZLLL.LJJIJIIJI;
            c1479530obX6.LJZ = false;
            c1479530obX6.LJZI = false;
        }
        if (surface != null) {
            c1479720obq.LIZ.LJIILJJIL = surface;
        }
        if (!TextUtils.isEmpty(interfaceC1479620obg.LIZJ())) {
            c1479720obq.LIZIZ(interfaceC1479620obg.LIZJ());
        }
        C1479530obX c1479530obXLIZ = c1479720obq.LIZ();
        interfaceC1479620obg.LJIIJ();
        c1479530obXLIZ.LJJLIIIJLLLLLLLZ = interfaceC1479620obg.getKey();
        return c1479530obXLIZ;
    }

    public static SimVideoUrlModel LIZJ(InterfaceC1479620obg interfaceC1479620obg, InterfaceC1479740obs interfaceC1479740obs) {
        if (interfaceC1479740obs == null) {
            return null;
        }
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        interfaceC1479620obg.LJIIJ();
        simVideoUrlModel.setLogLabel(interfaceC1479620obg.getKey());
        simVideoUrlModel.setRatio(interfaceC1479620obg.getRatio());
        if (interfaceC1479740obs.getUri() != null) {
            simVideoUrlModel.setUri(interfaceC1479740obs.getUri());
        } else {
            simVideoUrlModel.setUri(interfaceC1479740obs.LJIIJJI());
        }
        simVideoUrlModel.setUrlKey(interfaceC1479740obs.getKey());
        simVideoUrlModel.setSourceId(interfaceC1479620obg.getKey());
        simVideoUrlModel.setUrlList(interfaceC1479740obs.getUrls());
        simVideoUrlModel.setSize(interfaceC1479740obs.getSize());
        simVideoUrlModel.setDuration(interfaceC1479620obg.getDuration());
        if (interfaceC1479740obs.getKey() != null) {
            simVideoUrlModel.setHitBitrate(C1477400oY6.LJJJJI.LJIJI(interfaceC1479620obg.getKey()));
        }
        simVideoUrlModel.setaK(interfaceC1479740obs.getAccessKey());
        if (interfaceC1479620obg.LIZLLL() != null) {
            interfaceC1479620obg.LIZLLL().getClass();
            if (!TextUtils.isEmpty(null)) {
                interfaceC1479620obg.LIZLLL().getClass();
                simVideoUrlModel.setMdlVideoPath(null);
            }
        }
        simVideoUrlModel.setSize(interfaceC1479740obs.getSize());
        interfaceC1479620obg.LIZ();
        simVideoUrlModel.setCdnUrlExpired(0L);
        interfaceC1479620obg.getAspectRatio();
        simVideoUrlModel.setAspectRatio(0.0f);
        if (interfaceC1479620obg.LIZLLL() != null) {
            interfaceC1479620obg.LIZLLL().getClass();
            simVideoUrlModel.setBusinessUrlExpiredTime(0L);
        }
        return simVideoUrlModel;
    }
}
