package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0UC9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UC9 {
    public final LiveEffect LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final List<String> LJI;

    public C0UC9() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveEffectTimeRecord(sticker=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", downloadDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", addTimeStamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", effectSDKTimeStamp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isMultiGuest=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", panel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", modelNameList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0UC9(LiveEffect liveEffect, long j, long j2, boolean z, String str) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = liveEffect;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = -1L;
        this.LJ = z;
        this.LJFF = str;
        this.LJI = arrayList;
    }
}
