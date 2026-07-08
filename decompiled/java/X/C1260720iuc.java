package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.PhotoModeBannerLearnMoreConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AFwS341S0000000_19;

/* JADX INFO: renamed from: X.0iuc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260720iuc {
    public static final C1260720iuc LIZ = new C1260720iuc();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI(C1237504sn.LIZ(), ((PhotoModeBannerLearnMoreConfig) C1260610iuR.LIZIZ.getValue()).url);

    public static void LIZIZ() {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LIZ = "photo_mode_spark_biz";
        c1097680efe.LJIJ = 8;
        c1097680efe.LJIJI = 600;
        c1097680efe.LJIIIIZZ = AFwS303S0000000_19.get$arr$(37);
        c1097680efe.LJIJJ = AFwS341S0000000_19.get$arr$(7);
        c1097680efe.LJIJJLI = LIZIZ;
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
    }

    public static String LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }
}
