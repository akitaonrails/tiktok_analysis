package X;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0jEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273130jEd {
    public final HashMap<String, VideoFrame> LIZ = new HashMap<>();
    public List<C1276780jKW> LIZIZ = new ArrayList();
    public int LIZJ;
    public int LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEvent(textureMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutList=");
        sbLIZ.append(C216900sZ.LIZIZ(this.LIZIZ));
        sbLIZ.append("), videoWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
