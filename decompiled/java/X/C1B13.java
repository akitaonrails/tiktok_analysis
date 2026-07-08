package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pia.core.PiaManifest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1B13, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B13 {
    public static PiaManifest LIZ(C2204051BNz c2204051BNz, String str) {
        boolean z;
        Object c098200Yq;
        C1287750jcD c1287750jcD;
        Object c098200Yq2;
        C1287750jcD c1287750jcD2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        String lastPathSegment;
        List listLJJLIIIJ;
        boolean zBooleanValue3 = false;
        if (str != null && !u.LJJIIJZLJL(str, "http://", false)) {
            z = true;
        } else {
            z = false;
        }
        if ((z && !u.LJJIIJZLJL(str, "https://", false)) || str == null || !a0.LJJIIZI(str, "__pia_manifest__", false)) {
            return null;
        }
        Uri uri = UriProtector.parse(str);
        try {
            c098200Yq = (PiaManifest.InlineManifest) PiaManifest.LJI.LJII(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "__pia_manifest__"), PiaManifest.InlineManifest.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            PiaManifest.InlineManifest inlineManifest = (PiaManifest.InlineManifest) c098200Yq;
            C1BPP.LJFF(6, "[Manifest] Parse inline manifest (InlineManifest: " + inlineManifest + ')', null);
            String str2 = inlineManifest.pageName;
            if (str2 == null && ((lastPathSegment = uri.getLastPathSegment()) == null || (listLJJLIIIJ = a0.LJJLIIIJ(lastPathSegment, new char[]{'.'}, false, 0, 6)) == null || (str2 = (String) ListProtector.get(listLJJLIIIJ, 0)) == null)) {
                return null;
            }
            C1545410qJn.LIZ.getClass();
            C1545410qJn.LIZLLL();
            String str3 = inlineManifest.publicPath;
            if (str3 != null) {
                try {
                    c098200Yq2 = UriProtector.parse(str3);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) == null) {
                    Uri uri2 = (Uri) c098200Yq2;
                    if (uri2 == null || uri2.isRelative()) {
                        return null;
                    }
                    if (!Intrinsics.LJFF(uri2.getScheme(), "http") && !Intrinsics.LJFF(uri2.getScheme(), "https")) {
                        return null;
                    }
                    Boolean bool = inlineManifest.worker;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    Boolean bool2 = inlineManifest.snapshot;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                    Boolean bool3 = inlineManifest.nsr;
                    if (bool3 != null) {
                        zBooleanValue3 = bool3.booleanValue();
                    }
                    return new PiaManifest(uri, str2, uri2, zBooleanValue, zBooleanValue2, zBooleanValue3);
                }
                if (c2204051BNz != null && (c1287750jcD2 = c2204051BNz.LJII) != null) {
                    c1287750jcD2.LIZ("manifest", 1006);
                }
            }
            return null;
        }
        if (c2204051BNz != null && (c1287750jcD = c2204051BNz.LJII) != null) {
            c1287750jcD.LIZ("manifest", 1005);
        }
        return null;
    }
}
