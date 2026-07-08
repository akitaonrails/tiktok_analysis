package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: renamed from: X.0D1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332420D1k {
    public static final void LIZ(SimVideoUrlModel simVideoUrlModel, boolean z, int i) {
        String sourceId;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        if (simVideoUrlModel != null) {
            sourceId = simVideoUrlModel.getSourceId();
        } else {
            sourceId = null;
        }
        sbLIZ.append(sourceId);
        sbLIZ.append("] add preload task into engine [");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        sbLIZ.append(str);
        sbLIZ.append("], size : ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
