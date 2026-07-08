package X;

import com.bytedance.sdui.render.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1314240kIw {
    public static final C1314240kIw LJ = new C1314240kIw();
    public final float LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;

    public C1314240kIw() {
        this.LIZ = 0.5f;
        this.LIZIZ = 1;
        this.LIZJ = 0.5f;
        this.LIZLLL = 1;
    }

    public C1314240kIw(ReadableArray readableArray) {
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
