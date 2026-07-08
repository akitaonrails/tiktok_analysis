package X;

import android.app.Activity;
import android.net.Uri;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09e1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2419909e1 extends AbstractC1953807l2 {
    public C2419909e1(InterfaceC1953607l0 interfaceC1953607l0) {
        super(interfaceC1953607l0);
    }

    public static AbstractC2420009e2 LIZIZ(Activity activity, C1950707kX c1950707kX, List list) {
        Uri uriLJIIIZ;
        Uri uri = c1950707kX.LIZIZ;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC2420009e2 abstractC2420009e2 = (AbstractC2420009e2) it2.next();
            if (abstractC2420009e2 != null) {
                String scheme = uri.getScheme();
                String str = "";
                if (scheme == null) {
                    scheme = "";
                }
                String host = uri.getHost();
                if (host == null) {
                    host = "";
                }
                String path = uri.getPath();
                if (path != null) {
                    str = path;
                }
                if (abstractC2420009e2.LJI(uri, scheme, host, str)) {
                    if (abstractC2420009e2.LJFF(uri) && (uriLJIIIZ = abstractC2420009e2.LJIIIZ(activity, uri)) != null) {
                        c1950707kX.LIZIZ = uriLJIIIZ;
                        AbstractC2420009e2 abstractC2420009e2LIZIZ = LIZIZ(activity, c1950707kX, list);
                        if (abstractC2420009e2LIZIZ != null) {
                            return abstractC2420009e2LIZIZ;
                        }
                    }
                    return abstractC2420009e2;
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC1953807l2
    public final Pair<Boolean, String> LIZ(C1950707kX c1950707kX, HashMap<String, Object> map, C1962707mT c1962707mT) {
        AbstractC2420009e2 abstractC2420009e2LIZIZ;
        Activity activity = c1950707kX.LIZ;
        List<AbstractC2420009e2> deeplinkCommands = ((IMainService) ServiceManager.get().getService(IMainService.class)).getDeeplinkCommands();
        if (deeplinkCommands != null) {
            abstractC2420009e2LIZIZ = LIZIZ(activity, c1950707kX, deeplinkCommands);
        } else {
            abstractC2420009e2LIZIZ = null;
        }
        return LIZJ(c1950707kX, map, c1962707mT, abstractC2420009e2LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b1 A[EDGE_INSN: B:145:0x01b1->B:67:0x01b1 BREAK  A[LOOP:0: B:85:0x021a->B:147:?], EDGE_INSN: B:146:0x01b1->B:67:0x01b1 BREAK  A[LOOP:0: B:85:0x021a->B:147:?]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, kotlin.jvm.functions.Function0<kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, kotlin.jvm.functions.Function0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Boolean, java.lang.String> LIZJ(X.C1950707kX r22, java.util.HashMap<java.lang.String, java.lang.Object> r23, X.C1962707mT r24, X.AbstractC2420009e2 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2419909e1.LIZJ(X.07kX, java.util.HashMap, X.07mT, X.09e2):kotlin.Pair");
    }
}
