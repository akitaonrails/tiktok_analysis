package androidx.media;

import X.C2188811AlT;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes34.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes LIZ;
    public int LIZIZ = -1;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioAttributesCompat: audioattributes=");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.LIZ.equals(((AudioAttributesImplApi21) obj).LIZ);
    }
}
