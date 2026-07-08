package X;

import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0x1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803370x1r {
    public final EnumC1802790x0v LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final boolean LJI;
    public final Integer LJII;
    public final String LJIIIIZZ;
    public final Integer LJIIIZ;
    public final String LJIIJ;
    public final long LJIIJJI;
    public final RechargeRequestParams LJIIL;
    public final Map<String, String> LJIILIIL;

    public C1803370x1r(EnumC1802790x0v enumC1802790x0v, String str, String str2, long j, int i, String str3, boolean z, Integer num, String str4, Integer num2, String str5, long j2, RechargeRequestParams rechargeRequestParams, Map map, int i2) {
        Integer num3 = num2;
        String str6 = str4;
        Integer num4 = num;
        long j3 = j2;
        String str7 = str5;
        Map linkedHashMap = map;
        boolean z2 = (i2 & 64) != 0 ? true : z;
        num4 = (i2 & 128) != 0 ? null : num4;
        str6 = (i2 & 256) != 0 ? null : str6;
        num3 = (i2 & 512) != 0 ? null : num3;
        str7 = (i2 & 1024) != 0 ? null : str7;
        j3 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j3;
        RechargeRequestParams rechargeRequestParams2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? rechargeRequestParams : null;
        linkedHashMap = (i2 & 8192) != 0 ? new LinkedHashMap() : linkedHashMap;
        this.LIZ = enumC1802790x0v;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = i;
        this.LJFF = str3;
        this.LJI = z2;
        this.LJII = num4;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = num3;
        this.LJIIJ = str7;
        this.LJIIJJI = j3;
        this.LJIIL = rechargeRequestParams2;
        this.LJIILIIL = linkedHashMap;
    }
}
