package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.level.LevelRenderEffectConfig;
import com.bytedance.android.livesdk.livesetting.level.LevelRenderResourceConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveLevelRenderEffectConfigSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0eV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091110eV3 {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(String str) {
        Uri uri;
        if (str != null) {
            try {
                if ((!TextUtils.isEmpty(str)) && (uri = UriProtector.parse(str)) != null) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "device_score");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                    }
                    if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                        return CastFloatProtector.parseFloat(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                    return 0.0f;
                }
                return 0.0f;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public static LevelRenderResourceConfig LIZIZ(long j) {
        List<LevelRenderResourceConfig> list;
        long j2;
        LevelRenderEffectConfig levelSystemResConfig = LiveLevelRenderEffectConfigSetting.INSTANCE.getLevelSystemResConfig();
        LevelRenderResourceConfig levelRenderResourceConfig = null;
        if (levelSystemResConfig == null || (list = levelSystemResConfig.renderBarrageResConfigList) == null || !(!list.isEmpty())) {
            return null;
        }
        Iterator<LevelRenderResourceConfig> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LevelRenderResourceConfig next = it2.next();
            LevelRenderResourceConfig levelRenderResourceConfig2 = next;
            long j3 = 0;
            if (levelRenderResourceConfig2 != null) {
                j2 = levelRenderResourceConfig2.maxGrade;
            } else {
                j2 = 0;
            }
            if (j <= j2) {
                if (levelRenderResourceConfig2 != null) {
                    j3 = levelRenderResourceConfig2.minGrade;
                }
                if (j >= j3) {
                    levelRenderResourceConfig = next;
                    break;
                }
            }
        }
        return levelRenderResourceConfig;
    }
}
