package X;

import android.view.View;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gMT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162670gMT {
    public static final /* synthetic */ int LIZJ = 0;
    public final C1162990gMz LIZ;
    public String LIZIZ;

    static {
        new C1162660gMS();
    }

    public final View LIZ() {
        C21326518d5 c21326518d5 = this.LIZ.LIZLLL;
        if (c21326518d5 == null) {
            c21326518d5 = null;
        }
        return c21326518d5.LIZIZ;
    }

    public C1162670gMT(C1162990gMz c1162990gMz) {
        this.LIZ = c1162990gMz;
    }

    public static void LIZIZ(C1162670gMT c1162670gMT, Map map) {
        String string = UUID.randomUUID().toString();
        if (!Intrinsics.LJFF(c1162670gMT.LIZIZ, string)) {
            C21326518d5 c21326518d5 = c1162670gMT.LIZ.LIZLLL;
            if (c21326518d5 == null) {
                c21326518d5 = null;
            }
            c21326518d5.LIZ.LJIILIIL().LIZ.clear();
        }
        c1162670gMT.LIZ.LIZ(string, map);
        c1162670gMT.LIZIZ = string;
    }
}
