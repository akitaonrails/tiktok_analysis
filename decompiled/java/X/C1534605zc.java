package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.IVideoDetailLoadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1534605zc {
    public static final C1534605zc LIZ = new C1534605zc();

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Pair LIZIZ(String str, String str2, String str3) {
        Aweme awemeLLILZ;
        EnumC1534705zd enumC1534705zd;
        if (str != null && !Intrinsics.LJFF(str, "{}")) {
            awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).xr(str2);
        } else {
            awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str2);
        }
        if (awemeLLILZ != null) {
            enumC1534705zd = EnumC1534705zd.INNER_CACHE;
        } else {
            C1227904rF.LIZ.getClass();
            awemeLLILZ = (Aweme) C1227904rF.LIZIZ(str3, Aweme.class);
            LIZ.getClass();
            try {
                AwemeRawAd awemeRawAd = (AwemeRawAd) JsonParseUtils.LIZLLL(AwemeRawAd.class, str);
                if (awemeRawAd != null) {
                    if (awemeRawAd.getAdId() != null && awemeRawAd != null) {
                        LIZ.getClass();
                        if (awemeLLILZ != null && awemeRawAd.getAdId() != null) {
                            awemeLLILZ.setAwemeRawAd(awemeRawAd);
                            if (awemeLLILZ.getAwemeRawAd() != null) {
                                awemeLLILZ.setAd(true);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            LIZ.getClass();
            if (awemeLLILZ != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01JZ(awemeLLILZ, null), 3);
            }
            enumC1534705zd = EnumC1534705zd.SCHEMA;
        }
        return new Pair(awemeLLILZ, enumC1534705zd);
    }

    public static Pair LIZJ(C1525405y8 c1525405y8, String str, String str2) {
        EnumC1534705zd enumC1534705zd;
        Aweme awemeLIZIZ;
        boolean z = true;
        c1525405y8.LLIZLLLIL = true;
        if (str.length() != 0) {
            z = false;
        }
        Aweme aweme = null;
        if (!z) {
            IVideoDetailLoadService iVideoDetailLoadServiceLIZ = C1181304jj.LIZ();
            if (iVideoDetailLoadServiceLIZ != null && (awemeLIZIZ = iVideoDetailLoadServiceLIZ.LIZIZ(str)) != null) {
                aweme = awemeLIZIZ;
                enumC1534705zd = EnumC1534705zd.INNER_CACHE;
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1534405za(str2, c1525405y8, null), 3);
                enumC1534705zd = EnumC1534705zd.PRELOADER;
            }
        } else {
            enumC1534705zd = EnumC1534705zd.PRELOADER;
        }
        return new Pair(aweme, enumC1534705zd);
    }
}
