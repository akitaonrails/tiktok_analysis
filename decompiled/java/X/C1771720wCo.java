package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra.EcMixMallInitConfigSettings;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771720wCo {
    public static volatile int LIZLLL;
    public final C1771760wCs LIZ;
    public C1772770wEV LIZIZ;
    public String LIZJ;

    public final void LIZ() {
        if (C7879035x.LIZLLL()) {
            LIZLLL--;
            this.LIZ.LIZIZ.LJ("mix_mall_runtime_card_ready", 0, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            C1772770wEV c1772770wEV = this.LIZIZ;
            if (c1772770wEV != null) {
                c1772770wEV.release();
            }
            this.LIZIZ = null;
            this.LIZJ = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            LIZLLL--;
            this.LIZ.LIZIZ.LJ("mix_mall_runtime_card_ready", 0, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            C1772770wEV c1772770wEV2 = this.LIZIZ;
            if (c1772770wEV2 != null) {
                c1772770wEV2.release();
            }
            this.LIZIZ = null;
            this.LIZJ = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C1771720wCo(C1771760wCs c1771760wCs) {
        this.LIZ = c1771760wCs;
    }

    public static Pair LIZIZ(String str, String str2, Map map) {
        Object obj;
        Object obj2;
        Map map2;
        EcMixMallInitConfigSettings.EcMixMallInitConfigModel ecMixMallInitConfigModel = EcMixMallInitConfigSettings.LIZIZ;
        String str3 = "";
        if ((str2 == null || Intrinsics.LJFF(str2, "sea")) && ecMixMallInitConfigModel.runtimeCardBffSwitch != 1) {
            str = "";
            obj = "";
        } else {
            obj = null;
            if (map != null) {
                obj2 = map.get("item_data");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null) {
                obj = map2.get("from");
            }
            if (!(obj instanceof String) || obj == null) {
                obj = "";
            }
            if (str == null) {
                str = "";
            }
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZLLL();
        }
        if (str.length() == 0) {
            String str4 = ecMixMallInitConfigModel.runtimeCardSchema;
            if (str4 != null) {
                str3 = str4;
            }
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZLLL();
            obj = "settings";
            str = str3;
        }
        if (str.length() == 0 && (str2 == null || Intrinsics.LJFF(str2, "sea"))) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZLLL();
            obj = "sea_backup";
            str = "sslocal://lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_ecom_hybrid_mall%2Fglobal_runtime%2Fruntime%2Ftemplate.sea.js&use_spark=2&__live_platform__=webcast&target_handler=webcast&business_from=ecom&enable_code_cache=1&enable_pre_decode=1&spark_perf_biz=ec_mmk_preload&use_forest=1";
        }
        return new Pair(str, obj);
    }
}
