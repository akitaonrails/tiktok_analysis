package X;

import android.content.Context;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gMR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162650gMR {
    public static C1162990gMz LIZ(Context context, C1162640gMQ c1162640gMQ, Map map, Function1 function1) {
        C1162990gMz c1162990gMz = new C1162990gMz(context);
        c1162990gMz.LJFF = new C1156700gCq(new C1160820gJU(c1162990gMz, function1));
        if (!c1162990gMz.LJIIIIZZ) {
            c1162990gMz.LIZIZ = 1;
            c1162990gMz.LJI = c1162640gMQ.LIZJ;
            c1162990gMz.LIZJ(c1162640gMQ);
            MynaTemplateProtocol mynaTemplateProtocol = c1162640gMQ.LIZIZ;
            if (mynaTemplateProtocol != null) {
                C21326718d7 c21326718d7 = c1162990gMz.LJ;
                if (c21326718d7 == null) {
                    c21326718d7 = null;
                }
                C21326518d5 c21326518d5LIZ = C21326618d6.LIZ(c21326718d7, mynaTemplateProtocol, c1162640gMQ.LJ);
                C1156700gCq c1156700gCq = c1162990gMz.LJFF;
                if (c1156700gCq == null) {
                    c1156700gCq = null;
                }
                c21326518d5LIZ.LJI = c1156700gCq;
                c1162990gMz.LIZLLL = c21326518d5LIZ;
                c21326518d5LIZ.LIZ.LJIIJ.LJIIIZ = new C1156860gD6(c1162990gMz);
                c21326518d5LIZ.LIZJ = c1162990gMz.LJII;
                c21326518d5LIZ.LIZLLL = null;
                c21326518d5LIZ.LJ = false;
            }
            if (map != null) {
                c1162990gMz.LIZ(null, map);
            }
            return c1162990gMz;
        }
        "MynaView has been released".toString();
        throw new IllegalStateException("MynaView has been released");
    }
}
