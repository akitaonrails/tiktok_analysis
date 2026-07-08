package X;

import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0Nss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607920Nss {
    public static List LIZ(InterfaceC607930Nst interfaceC607930Nst) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        return interfaceC607930Nst.LIZJ(((Number) FollowRealTimeReadExp.LJII.getValue()).intValue(), System.currentTimeMillis() - (((Number) FollowRealTimeReadExp.LJIIIIZZ.getValue()).longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)), curUserId);
    }
}
