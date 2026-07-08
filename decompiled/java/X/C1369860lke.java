package X;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1369860lke {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(317));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(316));

    public final boolean LIZ(String str) {
        ((Paint) this.LIZIZ.getValue()).getTextBounds(str, 0, str.length(), (Rect) this.LIZ.getValue());
        if (((Rect) this.LIZ.getValue()).width() <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62))) {
            return false;
        }
        return true;
    }
}
