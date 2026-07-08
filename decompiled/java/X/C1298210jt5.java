package X;

import android.graphics.RectF;
import com.lynx.react.bridge.JavaOnlyMap;

/* JADX INFO: renamed from: X.0jt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1298210jt5 {
    public RectF LIZ;
    public RectF LIZIZ;
    public RectF LIZJ;
    public float LIZLLL;
    public boolean LJ;
    public String LJFF;

    public final JavaOnlyMap LIZIZ() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putMap("relativeRect", LIZ(this.LIZ));
        javaOnlyMap.putMap("boundingClientRect", LIZ(this.LIZIZ));
        javaOnlyMap.putMap("intersectionRect", LIZ(this.LIZJ));
        javaOnlyMap.putDouble("intersectionRatio", this.LIZLLL);
        javaOnlyMap.putBoolean("isIntersecting", this.LJ);
        javaOnlyMap.putDouble("time", 0.0d);
        javaOnlyMap.putString("observerId", this.LJFF);
        return javaOnlyMap;
    }

    public static JavaOnlyMap LIZ(RectF rectF) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (rectF != null) {
            javaOnlyMap.putDouble("left", rectF.left);
            javaOnlyMap.putDouble("right", rectF.right);
            javaOnlyMap.putDouble("top", rectF.top);
            javaOnlyMap.putDouble("bottom", rectF.bottom);
            return javaOnlyMap;
        }
        javaOnlyMap.putDouble("left", 0.0d);
        javaOnlyMap.putDouble("right", 0.0d);
        javaOnlyMap.putDouble("top", 0.0d);
        javaOnlyMap.putDouble("bottom", 0.0d);
        return javaOnlyMap;
    }
}
