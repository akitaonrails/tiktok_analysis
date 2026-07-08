package X;

import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DCZ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCZ {
    public static final C1DCD LIZ = C1DCD.LIZ;
    public static final C1DCN LIZIZ = C1DCN.LIZ;
    public static final C1DCU LIZJ = C1DCU.LIZ;
    public static final C1DCS LIZLLL = C1DCS.LIZ;
    public static final C1DCL LJ = new InterfaceC2251961DCg<C204535151p>() { // from class: X.1DCL
        @Override // X.InterfaceC2251961DCg
        public final void LIZIZ(C204535151p c204535151p) throws JSONException {
            Boolean booleanFeature$default;
            String stringFeature$default;
            Number numberLIZ;
            Number numberLIZ2;
            Number numberLIZ3;
            Number numberLIZ4;
            Number numberLIZ5;
            InterfaceC582850MtX interfaceC582850MtX = c204535151p.LIZIZ;
            SessionFeatureItem sessionFeatureItem = c204535151p.LIZ;
            JSONObject jSONObject = new JSONObject();
            if (interfaceC582850MtX instanceof C583460MuW) {
                jSONObject.put("aweme", ((C583460MuW) interfaceC582850MtX).LIZ);
                if (C1DCY.LJIILJJIL && (numberLIZ5 = LIZ("block_count", jSONObject)) != null) {
                    if (Intrinsics.LJFF(numberLIZ5, -1)) {
                        sessionFeatureItem.blockCount = Integer.valueOf(numberLIZ5.intValue());
                    } else {
                        sessionFeatureItem.blockCount = Integer.valueOf(numberLIZ5.intValue());
                    }
                }
                if (C1DCY.LJIILL && (numberLIZ4 = LIZ("block_duration", jSONObject)) != null) {
                    if (Intrinsics.LJFF(numberLIZ4, -1)) {
                        sessionFeatureItem.blockDuration = 0L;
                        return;
                    } else {
                        sessionFeatureItem.blockDuration = Long.valueOf(numberLIZ4.longValue());
                        return;
                    }
                }
                return;
            }
            if (!(interfaceC582850MtX instanceof C583510Mub)) {
                return;
            }
            jSONObject.put("aweme", ((C583510Mub) interfaceC582850MtX).LIZ);
            if (C1DCY.LJIIL && (numberLIZ3 = LIZ("start_playing_timestamp", jSONObject)) != null) {
                sessionFeatureItem.videoStartTimestamp = Long.valueOf(numberLIZ3.longValue());
            }
            if (C1DCY.LJIILIIL && (numberLIZ2 = LIZ("first_frame_duration", jSONObject)) != null) {
                sessionFeatureItem.firstFrameDuration = Long.valueOf(numberLIZ2.longValue());
            }
            if (C1DCY.LJIILLIIL && (numberLIZ = LIZ("video_bitrate", jSONObject)) != null) {
                sessionFeatureItem.videoBitrate = numberLIZ.longValue();
            }
            if (C1DCY.LJIIZILJ) {
                FeatureServiceManager.Companion.getClass();
                FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
                if (producer$default != null && (stringFeature$default = FeatureProducer.getStringFeature$default(producer$default, "video_resolution", jSONObject, "feed_carry", (ReturnCode) null, 8, (Object) null)) != null) {
                    sessionFeatureItem.videoResolution = stringFeature$default;
                }
            }
            if (!C1DCY.LJIJ) {
                return;
            }
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
            if (producer$default2 == null || (booleanFeature$default = FeatureProducer.getBooleanFeature$default(producer$default2, "is_h265", jSONObject, "feed_carry", null, 8, null)) == null) {
                return;
            }
            sessionFeatureItem.isBytevc1 = Boolean.valueOf(booleanFeature$default.booleanValue());
        }

        public static Number LIZ(String str, JSONObject jSONObject) {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
            if (producer$default == null) {
                return null;
            }
            return FeatureProducer.getNumericFeature$default(producer$default, str, -1, jSONObject, "feed_carry", null, 16, null);
        }
    };
    public static final C2251901DCa LJFF = new InterfaceC2251961DCg<C204535151p>() { // from class: X.1DCa
        @Override // X.InterfaceC2251961DCg
        public final void LIZIZ(C204535151p c204535151p) {
            InterfaceC582850MtX interfaceC582850MtX = c204535151p.LIZIZ;
            SessionFeatureItem sessionFeatureItem = c204535151p.LIZ;
            if (interfaceC582850MtX instanceof C1022650cid) {
                sessionFeatureItem.isAdClick = ((C1022650cid) interfaceC582850MtX).LIZIZ;
            }
        }
    };
    public static final C1DCJ LJI = C1DCJ.LIZ;
}
