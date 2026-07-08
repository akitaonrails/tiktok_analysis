package androidx.media;

import X.InterfaceC815410Vyl;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes34.dex */
public class AudioAttributesCompat implements InterfaceC815410Vyl {
    public static final /* synthetic */ int LIZIZ = 0;
    public AudioAttributesImpl LIZ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.LIZ;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.LIZ != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.LIZ);
    }
}
