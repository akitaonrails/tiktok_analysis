package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.WithoutCartSearchStruct;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Qaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673020Qaa {
    public static final C673020Qaa LIZ = new C673020Qaa();

    public static void LIZ(Context context, C1770220wAO c1770220wAO, Map map) {
        String str;
        if (context != null) {
            try {
                WithoutCartSearchStruct withoutCartSearchStructLIZ = c1770220wAO.LIZIZ.LIZ();
                if (withoutCartSearchStructLIZ != null && (str = withoutCartSearchStructLIZ.schema) != null) {
                    Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                    C1976807ok.LIZIZ(builderBuildUpon, map);
                    SmartRouter.buildRoute(context, builderBuildUpon.toString()).open();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:8:0x0026, B:10:0x0036, B:13:0x003e, B:15:0x004f, B:17:0x0055, B:18:0x005f, B:20:0x0063, B:22:0x006f, B:24:0x0079, B:25:0x0086, B:26:0x008c, B:12:0x003c), top: B:37:0x0026 }] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, android.net.Uri] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r12, X.C1770220wAO r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.Map r17) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C673020Qaa.LIZIZ(android.content.Context, X.0wAO, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }
}
