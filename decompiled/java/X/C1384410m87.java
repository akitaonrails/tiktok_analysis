package X;

import kotlin.jvm.internal.AwS9S0000001_21;

/* JADX INFO: renamed from: X.0m87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384410m87 {
    public int LIZ;
    public int LIZIZ;
    public float LIZJ = 1.0f;
    public float LIZLLL = 1.0f;
    public final /* synthetic */ C1384500m8G LJ;

    public C1384410m87(C1384500m8G c1384500m8G) {
        this.LJ = c1384500m8G;
    }

    public final void LIZ(float f) {
        if (this.LIZJ != f && f != 0.0f) {
            this.LIZJ = f;
            this.LJ.LIZIZ(new AwS9S0000001_21(f, 0));
            this.LJ.LIZLLL();
        }
    }
}
