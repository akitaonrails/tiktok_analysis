package X;

import com.bytedance.scalpel.protos.BinderInfo;
import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.IoInfo;
import com.bytedance.scalpel.protos.LockInfo;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0XAR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XAR {
    public ArrayList<C0XAS> LIZ = new ArrayList<>();
    public final ArrayList<BinderInfo> LIZIZ = new ArrayList<>();
    public final ArrayList<GCRecord> LIZJ = new ArrayList<>();
    public final ArrayList<LockInfo> LIZLLL = new ArrayList<>();
    public final ArrayList<IoInfo> LJ = new ArrayList<>();
    public long LJFF = 0;
    public long LJI = 0;
    public final HashMap<String, Object> LJII = new HashMap<>();
    public String LJIIIIZZ = "";

    public final void LIZ() {
        if (this.LIZ.size() > 50) {
            this.LIZ = new ArrayList<>();
        } else {
            this.LIZ.clear();
        }
        this.LIZIZ.clear();
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LJII.clear();
        this.LJIIIIZZ = "";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BigJankInfo{stacks=");
        sbLIZ.append(this.LIZ.size());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
