package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08oT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2229908oT {
    public final int LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final float LIZLLL;
    public final Long LJ;
    public final Long LJFF;
    public final Long LJI;
    public final Long LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Integer numValueOf = Integer.valueOf(this.LIZ);
        Integer num = this.LIZIZ;
        Integer num2 = this.LIZJ;
        Float fValueOf = Float.valueOf(this.LIZLLL);
        Float fValueOf2 = null;
        Float fValueOf3 = (this.LJFF == null || this.LJ == null) ? null : Float.valueOf((r1.longValue() - this.LJ.longValue()) / 1000.0f);
        if (this.LJII != null && this.LJI != null) {
            fValueOf2 = Float.valueOf((r1.longValue() - this.LJI.longValue()) / 1000.0f);
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(new Pair("error_code", numValueOf), new Pair("recorder_error", num), new Pair("cancel_code", num2), new Pair("real_total_recording_duration", fValueOf), new Pair("recorder_ready_latency", fValueOf3), new Pair("recorder_finishing_latency", fValueOf2));
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
        C20684815ws.LJIILLIIL("im_voice_message_record_perf", linkedHashMap);
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

    public /* synthetic */ C2229908oT(int i, float f, Long l, int i2) {
        this((i2 & 1) != 0 ? 0 : i, null, null, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? null : l, null, null, null);
    }

    public C2229908oT(int i, Integer num, Integer num2, float f, Long l, Long l2, Long l3, Long l4) {
        this.LIZ = i;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = f;
        this.LJ = l;
        this.LJFF = l2;
        this.LJI = l3;
        this.LJII = l4;
    }

    public static C2229908oT LIZ(C2229908oT c2229908oT, int i, Integer num, float f, Long l, Long l2, Long l3, int i2) {
        Integer num2;
        Long l4 = l2;
        Long l5 = l;
        Integer num3 = num;
        float f2 = f;
        Long l6 = l3;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c2229908oT.LIZ;
        }
        if ((i2 & 2) != 0) {
            num3 = c2229908oT.LIZIZ;
        }
        Long l7 = null;
        if ((i2 & 4) != 0) {
            num2 = c2229908oT.LIZJ;
        } else {
            num2 = null;
        }
        if ((i2 & 8) != 0) {
            f2 = c2229908oT.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            l7 = c2229908oT.LJ;
        }
        if ((i2 & 32) != 0) {
            l5 = c2229908oT.LJFF;
        }
        if ((i2 & 64) != 0) {
            l4 = c2229908oT.LJI;
        }
        if ((i2 & 128) != 0) {
            l6 = c2229908oT.LJII;
        }
        return new C2229908oT(i3, num3, num2, f2, l7, l5, l4, l6);
    }
}
