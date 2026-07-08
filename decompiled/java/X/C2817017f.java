package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.017f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2817017f {
    public static final String LIZIZ(Object obj) {
        Object c098200Yq;
        try {
            c098200Yq = C08JS.LIZLLL(obj);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static final Uri LIZ(Uri uri, String str, String str2) {
        if (uri != null && !uri.isOpaque()) {
            try {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str) != null) {
                    builderBuildUpon.clearQuery();
                    for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                        if (!Intrinsics.LJFF(str3, str)) {
                            Iterator<String> it2 = UriProtector.getQueryParameters(uri, str3).iterator();
                            while (it2.hasNext()) {
                                builderBuildUpon.appendQueryParameter(str3, it2.next());
                            }
                        }
                    }
                }
                return builderBuildUpon.appendQueryParameter(str, str2).build();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return uri;
    }
}
