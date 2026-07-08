package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager;
import com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService;

/* JADX INFO: renamed from: X.0CsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327340CsO {
    public static Aweme LIZ(String str) {
        C327170Cs7 c327170Cs7LIZJ;
        Aweme aweme;
        if (str == null) {
            return null;
        }
        IAwemeFetchManager.LIZ.getClass();
        IAwemeFetchManager value = C327290CsJ.LIZIZ.getValue();
        if (value != null && (c327170Cs7LIZJ = value.LIZJ(str)) != null && (aweme = c327170Cs7LIZJ.LIZIZ) != null) {
            return aweme;
        }
        IMAwemeService.LIZ.getClass();
        IMAwemeService iMAwemeServiceLIZ = C327350CsP.LIZ();
        if (iMAwemeServiceLIZ == null) {
            return null;
        }
        return iMAwemeServiceLIZ.LLILZ(str);
    }
}
