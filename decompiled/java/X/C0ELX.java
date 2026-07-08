package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0ELX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELX {
    public float LIZ;
    public final Bitmap LIZIZ;
    public final String LIZJ;
    public final NLETrackSlot LIZLLL;
    public final boolean LJ;
    public boolean LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I2vTrackData(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coverPath='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', nleTrackSlot=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showMask=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0ELX(float f, String str, NLETrackSlot nLETrackSlot, boolean z) {
        this(f, null, str, nLETrackSlot, z, false);
    }

    public C0ELX(float f, Bitmap bitmap, String str, NLETrackSlot nLETrackSlot, boolean z, boolean z2) {
        this.LIZ = f;
        this.LIZIZ = bitmap;
        this.LIZJ = str;
        this.LIZLLL = nLETrackSlot;
        this.LJ = z;
        this.LJFF = z2;
    }
}
