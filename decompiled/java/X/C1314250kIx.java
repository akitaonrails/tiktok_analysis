package X;

import com.lynx.react.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1314250kIx {
    public static final C1314250kIx LJ = new C1314250kIx();
    public final float LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;

    public C1314250kIx() {
        this.LIZ = 0.5f;
        this.LIZIZ = 1;
        this.LIZJ = 0.5f;
        this.LIZLLL = 1;
    }

    public C1314250kIx(ReadableArray readableArray) {
        this.LIZ = (float) readableArray.getDouble(0);
        this.LIZIZ = readableArray.getInt(1);
        if (readableArray.size() >= 4) {
            this.LIZJ = (float) readableArray.getDouble(2);
            this.LIZLLL = readableArray.getInt(3);
        } else {
            this.LIZJ = 0.5f;
            this.LIZLLL = 1;
        }
    }
}
