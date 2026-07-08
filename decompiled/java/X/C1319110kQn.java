package X;

import com.lynx.react.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319110kQn {
    public ReadableArray LIZ;
    public ReadableArray LIZIZ;
    public ReadableArray LIZJ;
    public ReadableArray LIZLLL;
    public ReadableArray LJ;
    public ReadableArray LJFF;
    public final /* synthetic */ C1319030kQf LJI;

    public final void LIZ() {
        if (this.LIZJ != null) {
            for (int i = 0; i < this.LIZJ.size(); i++) {
                this.LJI.notifyItemChanged(this.LIZJ.getInt(i), Integer.valueOf(this.LIZLLL.getInt(i)));
            }
        }
        if (this.LJ != null) {
            for (int i2 = 0; i2 < this.LJ.size(); i2++) {
                this.LJI.notifyItemMoved(this.LJ.getInt(i2), this.LJFF.getInt(i2));
            }
        }
        ReadableArray readableArray = this.LIZIZ;
        if (readableArray != null) {
            for (int size = readableArray.size() - 1; size >= 0; size--) {
                this.LJI.notifyItemRemoved(this.LIZIZ.getInt(size));
            }
        }
        if (this.LIZ != null) {
            for (int i3 = 0; i3 < this.LIZ.size(); i3++) {
                this.LJI.notifyItemInserted(this.LIZ.getInt(i3));
            }
        }
    }

    public C1319110kQn(C1319030kQf c1319030kQf) {
        this.LJI = c1319030kQf;
    }

    public static boolean LIZIZ(ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() > 0) {
            return true;
        }
        return false;
    }
}
