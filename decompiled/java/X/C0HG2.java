package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0HG2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HG2 implements C0MOK {
    public static final int LIZ = Color.rgb(102, 102, 102);

    public static final C443120HZe<Integer, Integer, Integer> LIZJ(Bitmap bitmap) {
        int iLIZ;
        if (!C0H1Y.LIZ(bitmap)) {
            iLIZ = LIZ;
        } else {
            iLIZ = C0HG4.LIZ(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), null);
        }
        Pair pair = new Pair(Integer.valueOf(Color.rgb(C814420VxA.LIZIZ(Color.red(iLIZ) * 0.8f), C814420VxA.LIZIZ(Color.green(iLIZ) * 0.8f), C814420VxA.LIZIZ(Color.blue(iLIZ) * 0.8f))), Integer.valueOf(Color.rgb(C814420VxA.LIZIZ(Color.red(iLIZ) * 0.4f), C814420VxA.LIZIZ(Color.green(iLIZ) * 0.4f), C814420VxA.LIZIZ(Color.blue(iLIZ) * 0.4f))));
        return new C443120HZe<>(Integer.valueOf(((Number) pair.getFirst()).intValue()), Integer.valueOf(((Number) pair.getSecond()).intValue()), Integer.valueOf(iLIZ));
    }

    @Override // X.C0MOK
    public final C443120HZe<Integer, Integer, Integer> LIZ(Bitmap bitmap) {
        return LIZJ(bitmap);
    }

    @Override // X.C0MOK
    public final Pair<Integer, Integer> LIZIZ(Bitmap bitmap) {
        C443120HZe<Integer, Integer, Integer> c443120HZeLIZJ = LIZJ(bitmap);
        return new Pair<>(Integer.valueOf(c443120HZeLIZJ.getFirst().intValue()), Integer.valueOf(c443120HZeLIZJ.getSecond().intValue()));
    }
}
