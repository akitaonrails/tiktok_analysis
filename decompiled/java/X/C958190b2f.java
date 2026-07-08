package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0b2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958190b2f {
    public final List<String> LIZ;
    public final C954460awe LIZIZ;
    public final String LIZJ;
    public final MicPositionContentInfo LIZLLL;
    public final boolean LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicAuxStreamChangedMessage(linkMicIdList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coHostUser=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", streamId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", micPositionContentInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isAuxStreamChange=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C958190b2f(List<String> list, C954460awe c954460awe, String str, MicPositionContentInfo micPositionContentInfo, boolean z) {
        this.LIZ = list;
        this.LIZIZ = c954460awe;
        this.LIZJ = str;
        this.LIZLLL = micPositionContentInfo;
        this.LJ = z;
    }
}
