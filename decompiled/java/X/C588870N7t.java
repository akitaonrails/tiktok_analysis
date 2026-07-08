package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ml.api.ISmartHARService;
import com.ss.android.ugc.aweme.video.simkit.picker.exp.AdPlayForDynamicBitrateExp;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588870N7t {
    public static final InterfaceC1474770oTr[] LIZ = {new InterfaceC1474770oTr() { // from class: X.0N7p
        public static final IAwemeService LIZ = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);

        @Override // X.InterfaceC1474770oTr
        public final String key() {
            return "video_format";
        }

        @Override // X.InterfaceC1474770oTr
        public final String LIZ(String str) {
            Aweme awemeLLILZ;
            IAwemeService iAwemeService = LIZ;
            if (iAwemeService == null || (awemeLLILZ = iAwemeService.LLILZ(str)) == null || awemeLLILZ.getVideo() == null) {
                return "-1";
            }
            if (!awemeLLILZ.getVideo().hasVideoModel()) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            return "1";
        }
    }, new InterfaceC1474770oTr() { // from class: X.0N7q
        @Override // X.InterfaceC1474770oTr
        public final String key() {
            return "user_choose_quality_mode";
        }

        @Override // X.InterfaceC1474770oTr
        public final String LIZ(String str) {
            C582130MsN.LIZ().LJ().getClass();
            return String.valueOf(1);
        }
    }, new C804530VhD(), new InterfaceC1474770oTr() { // from class: X.0N7r
        public static final IAwemeService LIZ = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);

        @Override // X.InterfaceC1474770oTr
        public final String key() {
            return "video_duration_seconds";
        }

        @Override // X.InterfaceC1474770oTr
        public final String LIZ(String str) {
            Aweme awemeLLILZ;
            IAwemeService iAwemeService = LIZ;
            if (iAwemeService == null || (awemeLLILZ = iAwemeService.LLILZ(str)) == null || awemeLLILZ.getVideo() == null) {
                return "-1";
            }
            return String.valueOf(awemeLLILZ.getVideo().getDuration() / 1000.0f);
        }
    }, new InterfaceC1474770oTr() { // from class: X.0N7s
        public static final IAwemeService LIZ = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);

        @Override // X.InterfaceC1474770oTr
        public final String key() {
            return "qprf";
        }

        @Override // X.InterfaceC1474770oTr
        public final String LIZ(String str) {
            Video video;
            IAwemeService iAwemeService = LIZ;
            if (iAwemeService == null) {
                return "-1";
            }
            Aweme awemeLLILZ = iAwemeService.LLILZ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            float f = 1.0f;
            if (awemeLLILZ != null && (video = awemeLLILZ.getVideo()) != null) {
                String meta = video.getMeta();
                if (!TextUtils.isEmpty(meta)) {
                    try {
                        JSONObject jSONObject = new JSONObject(meta);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("");
                        sbLIZ2.append(1.0f);
                        String strOptString = jSONObject.optString("qprf", C2188811AlT.LIZIZ(sbLIZ2));
                        if (!TextUtils.isEmpty(strOptString)) {
                            f = CastFloatProtector.parseFloat(strOptString);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            sbLIZ.append(f);
            sbLIZ.append("");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }, new InterfaceC1474770oTr() { // from class: X.0N7u
        @Override // X.InterfaceC1474770oTr
        public final String key() {
            return "har_type";
        }

        @Override // X.InterfaceC1474770oTr
        public final String LIZ(String str) {
            ISmartHARService iSmartHARService = (ISmartHARService) PluggableExtentionKt.pluggableSpi(ISmartHARService.class);
            if (iSmartHARService != null && iSmartHARService.enable()) {
                return String.valueOf(iSmartHARService.getLastStatus());
            }
            return "-1";
        }
    }, new InterfaceC1474770oTr() { // from class: X.0N90
        public static final Map<String, String> LIZ;

        static {
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("story", "1")};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) == null) {
                LIZ = Collections.unmodifiableMap(map);
            } else {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }

        @Override // X.InterfaceC1474770oTr
        public final String key() {
            return "play_scene";
        }

        @Override // X.InterfaceC1474770oTr
        public final String LIZ(String str) {
            Aweme awemeLLILZ = C0N91.LIZ.LLILZ(str);
            if (awemeLLILZ != null) {
                if (awemeLLILZ.getIsTikTokStory() || awemeLLILZ.getAwemeType() == 40) {
                    return LIZ.get("story");
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
    }, new InterfaceC1474770oTr() { // from class: X.0N92
        @Override // X.InterfaceC1474770oTr
        public final String key() {
            return "ad_play";
        }

        @Override // X.InterfaceC1474770oTr
        public final String LIZ(String str) {
            boolean z;
            C0N96 c0n96;
            AdPlayForDynamicBitrateExp.AdPlayConfig adPlayConfig;
            C0N93 c0n93 = C0N94.LIZ;
            c0n93.getClass();
            Aweme awemeLLILZ = C0N91.LIZ.LLILZ(str);
            if (awemeLLILZ != null && awemeLLILZ.isAd()) {
                z = true;
            } else {
                z = false;
            }
            if (z && (adPlayConfig = (c0n96 = c0n93.LIZ).LIZJ) != null && c0n96.LIZIZ > adPlayConfig.minSampleSize && c0n96.LIZ >= adPlayConfig.minContinuousSize) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
    }};
}
