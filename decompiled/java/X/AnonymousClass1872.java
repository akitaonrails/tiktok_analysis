package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText;
import java.util.Map;
import webcast.data.oec_msg.CarouselCfg;

/* JADX INFO: renamed from: X.1872, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1872 {
    public final Long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final Map<String, AuctionText> LJ;
    public final int LJFF;
    public final boolean LJI;
    public final C212294186a LJII;
    public boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final CarouselCfg LJIIJ;

    public AnonymousClass1872(Long l, String str, String str2, Boolean bool, Map map, boolean z, int i, int i2, boolean z2, C212294186a c212294186a, boolean z3, CarouselCfg carouselCfg, int i3) {
        boolean z4;
        int i4 = i2;
        boolean z5 = z2;
        C212294186a c212294186a2 = c212294186a;
        boolean z6 = z3;
        CarouselCfg carouselCfg2 = carouselCfg;
        bool = (i3 & 8) != 0 ? Boolean.FALSE : bool;
        i4 = (i3 & 128) != 0 ? 0 : i4;
        z5 = (i3 & 256) != 0 ? false : z5;
        c212294186a2 = (i3 & 512) != 0 ? null : c212294186a2;
        if ((i3 & 1024) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        z6 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z6;
        carouselCfg2 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : carouselCfg2;
        this.LIZ = l;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = bool;
        this.LJ = map;
        this.LJFF = i4;
        this.LJI = z5;
        this.LJII = c212294186a2;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = z6;
        this.LJIIJ = carouselCfg2;
    }
}
