package X;

import android.opengl.Matrix;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;

/* JADX INFO: renamed from: X.0jJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276200jJa {
    public GlRenderDrawer LIZ;
    public C1271390jBp LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public Handler LJII;
    public final EnumC1152960g6o LJIIIIZZ;
    public float[] LJIIIZ;
    public final C1276240jJe LJIIJ = new C1276240jJe();

    public C1276200jJa(Handler handler, EnumC1152960g6o enumC1152960g6o) {
        this.LJIIIIZZ = EnumC1152960g6o.MODE_FIT;
        float[] fArr = new float[16];
        this.LJIIIZ = fArr;
        Matrix.setIdentityM(fArr, 0);
        this.LJIIIIZZ = enumC1152960g6o;
        this.LJII = handler;
        if (handler != null) {
        } else {
            throw new AndroidRuntimeException("Handler is null.");
        }
    }
}
