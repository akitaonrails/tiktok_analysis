package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Dug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354240Dug {
    public final C354510Dv7 LIZ;
    public final NLETrackSlot LIZIZ;
    public final NLEModel LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicBusinessParams(magicResourceItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", operatedSlot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", operatedNLEModel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C354240Dug(C354510Dv7 c354510Dv7, NLETrackSlot nLETrackSlot, NLEModel nLEModel) {
        this.LIZ = c354510Dv7;
        this.LIZIZ = nLETrackSlot;
        this.LIZJ = nLEModel;
    }
}
