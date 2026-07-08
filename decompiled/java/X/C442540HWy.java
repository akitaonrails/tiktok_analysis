package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0HWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442540HWy {
    public static final C442540HWy LIZ = new C442540HWy();
    public static final Map<String, Long> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());

    public static void LJ(String str) {
        try {
            LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(Context context, Aweme aweme) {
        UrlModel urlModelLIZIZ;
        String aid = null;
        if (C710930Rud.LJIIIIZZ(aweme)) {
            if (C710930Rud.LJIIIIZZ(aweme) && (urlModelLIZIZ = C710930Rud.LIZIZ(aweme)) != null) {
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                LIZ(context, urlModelLIZIZ, aid);
                if (aweme != null && C729510SjV.LJIJI(aweme)) {
                    LIZ(context, C710930Rud.LIZLLL(aweme), aweme.getAid());
                    return;
                }
                return;
            }
            return;
        }
        if (aweme == null || !C582980Mtk.LIZIZ(aweme)) {
            return;
        }
        C1EE2.LIZIZ.LJJIFFI(context, null, aweme, new IntRange(0, 1), EnumC1334360kpO.HIGH);
    }

    public static void LIZ(Context context, final UrlModel urlModel, final String str) {
        String str2;
        if (urlModel == null) {
            return;
        }
        List<String> urlList = urlModel.getUrlList();
        if (urlList == null || (str2 = (String) C13LP.LJJJLL(urlList)) == null) {
            str2 = "";
        }
        LJ(str2);
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
        c1331670kl3LJIIJ.LJJIJL(context);
        c1331670kl3LJIIJ.LJJJIL = new InterfaceC658750Psf() { // from class: X.0HWz
            @Override // X.InterfaceC658750Psf
            public final /* synthetic */ void Ck(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str3, JSONObject jSONObject) {
                String str4;
                if (!z && C0BNX.LIZ() && (str4 = str) != null) {
                    C1333930koh.LIZ(str4, jSONObject);
                }
            }
        };
        c1331670kl3LJIIJ.LIZLLL("story_photo");
        c1331670kl3LJIIJ.LJJIIJZLJL = C823050WQl.LIZLLL();
        c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIJ.LJIILLIIL(new InterfaceC605070NoH() { // from class: X.0HBt
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
                String str3;
                C442540HWy c442540HWy = C442540HWy.LIZ;
                List<String> urlList2 = urlModel.getUrlList();
                if (urlList2 == null || (str3 = (String) C13LP.LJJJLL(urlList2)) == null) {
                    str3 = "";
                }
                c442540HWy.getClass();
                try {
                    Map<String, Long> map = C442540HWy.LIZIZ;
                    Long l = map.get(str3);
                    if (l != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                        map.remove(str3);
                        C442540HWy.LIZJ(true, false, null, str3, jElapsedRealtime, null, null);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                String str3;
                C442540HWy c442540HWy = C442540HWy.LIZ;
                List<String> urlList2 = urlModel.getUrlList();
                if (urlList2 == null || (str3 = (String) C13LP.LJJJLL(urlList2)) == null) {
                    str3 = "";
                }
                c442540HWy.getClass();
                C442540HWy.LJFF(null, null, str3, true);
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                String str3;
                C442540HWy c442540HWy = C442540HWy.LIZ;
                List<String> urlList2 = urlModel.getUrlList();
                if (urlList2 == null || (str3 = (String) C13LP.LJJJLL(urlList2)) == null) {
                    str3 = "";
                }
                c442540HWy.getClass();
                C442540HWy.LIZLLL(str3, th, true);
            }
        });
    }

    public static void LIZLLL(String str, Throwable th, boolean z) {
        try {
            Map<String, Long> map = LIZIZ;
            Long l = map.get(str);
            if (l != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                map.remove(str);
                LIZJ(z, false, th, str, jElapsedRealtime, null, null);
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public static void LJFF(Integer num, Integer num2, String str, boolean z) {
        try {
            Map<String, Long> map = LIZIZ;
            Long l = map.get(str);
            if (l != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                map.remove(str);
                LIZJ(z, true, null, str, jElapsedRealtime, num, num2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZJ(boolean z, boolean z2, Throwable th, String str, long j, Integer num, Integer num2) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str3 = "1";
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("success", str2);
        if (!z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_preload", str3);
        c2344009Gk.LJIIIIZZ("load_url", str);
        c2344009Gk.LIZLLL(j, "duration");
        String message = null;
        if (th != null) {
            message = th.getMessage();
        }
        c2344009Gk.LJIIIIZZ("error_msg", message);
        if (num != null && num.intValue() > 0) {
            c2344009Gk.LIZJ(num.intValue(), "image_width");
        }
        if (num2 != null && num2.intValue() > 0) {
            c2344009Gk.LIZJ(num2.intValue(), "image_height");
        }
        C20684815ws.LJIILLIIL("story_photo_load_status", c2344009Gk.LIZ);
    }
}
