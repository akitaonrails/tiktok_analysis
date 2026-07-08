package X;

import android.app.Activity;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2230008oU {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final int LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final Long LJII;
    public final Long LJIIIIZZ;
    public final Integer LJIIIZ;
    public final Integer LJIIJ;
    public final Long LJIIJJI;
    public final Long LJIIL;
    public final Long LJIILIIL;
    public final Long LJIILJJIL;
    public final Long LJIILL;
    public final Long LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C2230008oU() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        String str = this.LIZ;
        Integer num = this.LIZIZ;
        Integer num2 = this.LIZJ;
        Float fValueOf = this.LIZLLL != null ? Float.valueOf(r0.intValue() / 1000.0f) : null;
        int i = this.LJ;
        Integer num3 = this.LJFF;
        Integer num4 = this.LJI;
        Float fValueOf2 = (this.LJIIIIZZ == null || this.LJII == null) ? null : Float.valueOf((r1.longValue() - this.LJII.longValue()) / 1000.0f);
        Integer num5 = this.LJIIIZ;
        Integer num6 = this.LJIIJ;
        Float fValueOf3 = (this.LJIIL == null || this.LJIIJJI == null) ? null : Float.valueOf((r1.longValue() - this.LJIIJJI.longValue()) / 1000.0f);
        Float fValueOf4 = (this.LJIILJJIL == null || this.LJIILIIL == null) ? null : Float.valueOf((r1.longValue() - this.LJIILIIL.longValue()) / 1000.0f);
        Float fValueOf5 = (this.LJIILLIIL == null || this.LJIILL == null) ? null : Float.valueOf((r1.longValue() - this.LJIILL.longValue()) / 1000.0f);
        String str2 = this.LJIIZILJ;
        String str3 = this.LJIJ;
        Pair[] pairArr = new Pair[15];
        pairArr[0] = new Pair("error_code", Integer.valueOf(i));
        pairArr[1] = new Pair("message_id", str);
        pairArr[2] = new Pair("network_error_code", num3);
        pairArr[3] = new Pair("total_message_duration", fValueOf);
        pairArr[4] = new Pair("using_local_cache", num4);
        pairArr[5] = new Pair("downloading_duration", fValueOf2);
        pairArr[6] = new Pair("requested_message_refresh", num5);
        pairArr[7] = new Pair("message_refresh_result", num6);
        pairArr[8] = new Pair("media_refresh_duration", fValueOf3);
        pairArr[9] = new Pair("player_ready_duration", fValueOf4);
        pairArr[10] = new Pair("total_waiting_duration", fValueOf5);
        pairArr[11] = new Pair("sent_from_user_self", num);
        pairArr[12] = new Pair("is_first_play", num2);
        pairArr[13] = new Pair("phase", str2);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[14] = new Pair("vregion", str3);
        List listLJIIJJI = C1697810uHb.LJIIJJI(pairArr);
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (((Pair) obj).getSecond() != null) {
                arrayList.add(obj);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Pair pair : arrayList) {
            Pair pair2 = new Pair(pair.getFirst(), String.valueOf(pair.getSecond()));
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_voice_message_playback_perf", linkedHashMap);
        IMSaasHostOfflineDebugService.LIZ.getClass();
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugServiceLIZIZ = C0Z40.LIZIZ();
        if (iMSaasHostOfflineDebugServiceLIZIZ == null || !iMSaasHostOfflineDebugServiceLIZIZ.LJII() || (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        linkedHashMap.forEach(new C2022707w9(c259800zU));
        c1389890mGx.LJIIJ((String) c259800zU.element);
        c1389890mGx.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
        c1389890mGx.LJIIJJI();
    }

    public /* synthetic */ C2230008oU(String str, Integer num, Integer num2, Integer num3, Integer num4, Long l, Integer num5, Long l2, String str2, String str3, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, 0, null, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : l, null, (i & 512) != 0 ? null : num5, null, null, null, null, null, (32768 & i) != 0 ? null : l2, null, (131072 & i) != 0 ? "" : str2, (i & 262144) != 0 ? null : str3);
    }

    public static C2230008oU LIZ(C2230008oU c2230008oU, int i, Integer num, Integer num2, Long l, Long l2, Integer num3, Integer num4, Long l3, Long l4, Long l5, Long l6, Long l7, int i2) {
        String str;
        Integer num5;
        Integer num6;
        Integer num7;
        Long l8;
        String str2;
        Long l9 = l6;
        Long l10 = l5;
        Long l11 = l4;
        Long l12 = l3;
        Integer num8 = num4;
        Long l13 = l7;
        Integer num9 = num3;
        Long l14 = l2;
        Long l15 = l;
        Integer num10 = num2;
        Integer num11 = num;
        int i3 = i;
        String str3 = null;
        if ((i2 & 1) != 0) {
            str = c2230008oU.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            num5 = c2230008oU.LIZIZ;
        } else {
            num5 = null;
        }
        if ((i2 & 4) != 0) {
            num6 = c2230008oU.LIZJ;
        } else {
            num6 = null;
        }
        if ((i2 & 8) != 0) {
            num7 = c2230008oU.LIZLLL;
        } else {
            num7 = null;
        }
        if ((i2 & 16) != 0) {
            i3 = c2230008oU.LJ;
        }
        if ((i2 & 32) != 0) {
            num11 = c2230008oU.LJFF;
        }
        if ((i2 & 64) != 0) {
            num10 = c2230008oU.LJI;
        }
        if ((i2 & 128) != 0) {
            l15 = c2230008oU.LJII;
        }
        if ((i2 & 256) != 0) {
            l14 = c2230008oU.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            num9 = c2230008oU.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            num8 = c2230008oU.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            l12 = c2230008oU.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            l11 = c2230008oU.LJIIL;
        }
        if ((i2 & 8192) != 0) {
            l10 = c2230008oU.LJIILIIL;
        }
        if ((i2 & 16384) != 0) {
            l9 = c2230008oU.LJIILJJIL;
        }
        if ((32768 & i2) != 0) {
            l8 = c2230008oU.LJIILL;
        } else {
            l8 = null;
        }
        if ((65536 & i2) != 0) {
            l13 = c2230008oU.LJIILLIIL;
        }
        if ((131072 & i2) != 0) {
            str2 = c2230008oU.LJIIZILJ;
        } else {
            str2 = null;
        }
        if ((i2 & 262144) != 0) {
            str3 = c2230008oU.LJIJ;
        }
        c2230008oU.getClass();
        return new C2230008oU(str, num5, num6, num7, i3, num11, num10, l15, l14, num9, num8, l12, l11, l10, l9, l8, l13, str2, str3);
    }

    public C2230008oU(String str, Integer num, Integer num2, Integer num3, int i, Integer num4, Integer num5, Long l, Long l2, Integer num6, Integer num7, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = num3;
        this.LJ = i;
        this.LJFF = num4;
        this.LJI = num5;
        this.LJII = l;
        this.LJIIIIZZ = l2;
        this.LJIIIZ = num6;
        this.LJIIJ = num7;
        this.LJIIJJI = l3;
        this.LJIIL = l4;
        this.LJIILIIL = l5;
        this.LJIILJJIL = l6;
        this.LJIILL = l7;
        this.LJIILLIIL = l8;
        this.LJIIZILJ = str2;
        this.LJIJ = str3;
    }
}
