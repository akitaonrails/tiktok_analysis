package X;

import com.bytedance.android.livesdk.livesetting.broadcast.AnchorStreamJankABSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.00oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C192400oc {
    public final int LIZIZ;
    public final int LIZJ;
    public int LJFF;
    public final List<C192500od> LIZLLL = new ArrayList();
    public final List<C192500od> LJ = new ArrayList();
    public final int LIZ = AnchorStreamJankABSetting.maxAccumulateTimes();

    public final void LIZIZ() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (((ArrayList) this.LIZLLL).isEmpty()) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((C192500od) it2.next()).LIZIZ;
        }
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
            jSONObject = null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (C192500od c192500od : (ArrayList) this.LIZLLL) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("ts", c192500od.LIZ);
                jSONObject3.put("duration", c192500od.LIZIZ);
                jSONObject3.put("extra", c192500od.LIZJ);
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("hangs_detail", jSONArray);
            jSONObject2 = jSONObject;
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            jSONObject2 = jSONObject;
            if (jSONObject == null) {
                return;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_stream_hang");
        c474500IjALIZ.LJIL();
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJII(Integer.valueOf(((ArrayList) this.LIZLLL).size()), "count");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "total_stall_duration");
        c474500IjALIZ.LIZ();
    }

    public C192400oc() {
        int iStallThreshold = AnchorStreamJankABSetting.stallThreshold();
        this.LIZIZ = (int) (((double) AnchorStreamJankABSetting.windowPercent()) * 0.01d * ((double) 2000));
        this.LIZJ = iStallThreshold / 2;
    }

    public final void LIZ(int i, String str) {
        long j;
        if (i >= this.LIZIZ) {
            if (this.LJFF == 0) {
                ((ArrayList) this.LJ).add(new C192500od(System.currentTimeMillis() - ((long) 2000), i, str));
            } else {
                ((ArrayList) this.LJ).add(new C192500od(0L, i, str));
            }
            this.LJFF++;
        } else {
            ((ArrayList) this.LJ).clear();
            this.LJFF = 0;
        }
        if (((ArrayList) this.LJ).size() >= this.LIZJ) {
            this.LJFF = 0;
            Iterator it2 = ((ArrayList) this.LJ).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                i2 += ((C192500od) it2.next()).LIZIZ;
            }
            C192500od c192500od = (C192500od) C13LP.LJJJLZIJ(0, this.LJ);
            if (c192500od != null) {
                j = c192500od.LIZ;
            } else {
                j = -1;
            }
            ((ArrayList) this.LIZLLL).add(new C192500od(j, i2, ""));
            ((ArrayList) this.LJ).clear();
        }
        if (((ArrayList) this.LIZLLL).size() >= this.LIZ) {
            LIZIZ();
            ((ArrayList) this.LIZLLL).clear();
        }
    }
}
