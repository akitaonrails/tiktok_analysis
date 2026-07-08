package X;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: X.0Wja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC831480Wja<A, ResultT> {
    public final Feature[] LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public AbstractC831480Wja() {
    }

    public AbstractC831480Wja(Feature[] featureArr, boolean z, int i) {
        this.LIZ = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.LIZIZ = z2;
        this.LIZJ = i;
    }

    public abstract void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, C835520Wq6 c835520Wq6);
}
