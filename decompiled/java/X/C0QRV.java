package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QRV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QRV extends C09AY implements InterfaceC1631630sYr<String, C0QRQ, JSONObject, Map<String, String>, Unit> {
    public C0QRV() {
        super(4);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, C0QRQ c0qrq, JSONObject jSONObject, Map<String, String> map) {
        C0QRW c0qrw;
        String strLIZ;
        String strOptString;
        Long lLJIILIIL;
        String strOptString2;
        C0QRQ c0qrq2 = c0qrq;
        JSONObject jSONObject2 = jSONObject;
        Map<String, String> map2 = map;
        EnumC686550QwP enumC686550QwP = c0qrq2.LIZIZ;
        if (enumC686550QwP != null && (c0qrw = c0qrq2.LIZJ) != null) {
            switch (C0QRU.LIZ[c0qrw.ordinal()]) {
                case 1:
                    C670360QRe.LIZ.getClass();
                    C682520Qpu.LIZ.getClass();
                    if (C682520Qpu.LIZ() != 0 || C682520Qpu.LIZIZ().searchSceneNum != 0) {
                        String str2 = null;
                        if ((jSONObject2 == null || (strLIZ = C0QRR.LIZIZ(jSONObject2)) == null) && (map2 == null || (strLIZ = C0QRR.LIZ(map2)) == null)) {
                            strLIZ = "";
                        }
                        switch (C686600QwU.LIZ[enumC686550QwP.ordinal()]) {
                            case 1:
                                if (((jSONObject2 != null && (strOptString = jSONObject2.optString("duration")) != null) || (map2 != null && (strOptString = map2.get("duration")) != null)) && (lLJIILIIL = C2095008Iq.LJIILIIL(strOptString)) != null) {
                                    lLJIILIIL.longValue();
                                    if (lLJIILIIL.longValue() >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                                        if (jSONObject2 != null && (strOptString2 = jSONObject2.optString("duration")) != null) {
                                            str2 = strOptString2;
                                        } else if (map2 != null) {
                                            str2 = map2.get("duration");
                                        }
                                        C0Q3E.LJI().yY1().LIZ(new C686280Qvy(strLIZ, str2, enumC686550QwP));
                                    }
                                }
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case BdTuring.TYPE_ECAF /* 9 */:
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            case BdTuring.TYPE_EMAIL /* 11 */:
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                C0Q3E.LJI().yY1().LIZ(new C686280Qvy(strLIZ, null, enumC686550QwP));
                                break;
                        }
                    }
                    break;
                case 2:
                    C670360QRe.LIZ.getClass();
                    C670360QRe.LIZIZ(enumC686550QwP, map2, jSONObject2);
                    break;
                case 3:
                    C670360QRe.LIZ.getClass();
                    C670360QRe.LIZIZ(enumC686550QwP, map2, jSONObject2);
                    break;
                case 4:
                    C670360QRe.LIZ.getClass();
                    C670360QRe.LIZIZ(enumC686550QwP, map2, jSONObject2);
                    break;
                case 5:
                    C670360QRe.LIZ.getClass();
                    C670360QRe.LIZIZ(enumC686550QwP, map2, jSONObject2);
                    break;
                case 6:
                    C670360QRe.LIZ.getClass();
                    C670360QRe.LIZIZ(enumC686550QwP, map2, jSONObject2);
                    break;
                case 7:
                    C670360QRe.LIZ.getClass();
                    C670360QRe.LIZIZ(enumC686550QwP, map2, jSONObject2);
                    break;
            }
        }
        return Unit.LIZ;
    }
}
