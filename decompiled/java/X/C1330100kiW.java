package X;

/* JADX INFO: renamed from: X.0kiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1330100kiW {
    public int LIZ;
    public int LIZIZ;

    public final void LIZ(int i) {
        int i2;
        int i3 = this.LIZIZ;
        if (i3 >= i && (i2 = this.LIZ) > 0) {
            this.LIZ = i2 - 1;
            this.LIZIZ = i3 - i;
        } else {
            C1328570kg3.LJIJI("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZ));
        }
    }
}
