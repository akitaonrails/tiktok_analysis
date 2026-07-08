package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1A49, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A49 {
    public final String LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final List<? extends AbstractC1776680wKo> LJIIIIZZ;
    public final List<AbstractC1696860uG4> LJIIIZ;

    public C1A49() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
    }

    public C1A49(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        ArrayList arrayList;
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        list = (i & 256) != 0 ? C1696220uF2.LIZ : list;
        if ((i & 512) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = f6;
        this.LJII = f7;
        this.LJIIIIZZ = list;
        this.LJIIIZ = arrayList;
    }
}
