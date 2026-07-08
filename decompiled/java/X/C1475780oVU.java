package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oVU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1475780oVU {
    public int LIZ;
    public List<C1475770oVT> LIZIZ;
    public boolean LIZJ;

    public final long LIZIZ() {
        long jLIZIZ = 0;
        if (this.LIZIZ != null) {
            for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
                jLIZIZ += ((C1475760oVS) ListProtector.get(this.LIZIZ, i)).LIZIZ();
            }
        }
        return jLIZIZ;
    }

    public final boolean LIZJ() {
        int i;
        boolean z = true;
        if (this.LIZIZ != null) {
            i = 0;
            for (int i2 = 0; i2 < ((ArrayList) this.LIZIZ).size(); i2++) {
                C1475760oVS c1475760oVS = (C1475760oVS) ListProtector.get(this.LIZIZ, i2);
                if (c1475760oVS == null || c1475760oVS.LIZ()) {
                    i++;
                } else {
                    z = false;
                }
            }
        } else {
            i = 0;
        }
        return !this.LIZJ ? z || (i >= 1 && this.LIZ == 1) : z || (i >= 2 && this.LIZ == 1);
    }

    public final boolean LIZLLL() {
        if (this.LIZ != 2) {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "task is not a preload task");
            return false;
        }
        if (this.LIZIZ == null) {
            return true;
        }
        for (int i2 = 0; i2 < ((ArrayList) this.LIZIZ).size(); i2++) {
            C1475760oVS c1475760oVS = (C1475760oVS) ListProtector.get(this.LIZIZ, i2);
            if (c1475760oVS != null && !c1475760oVS.LIZ()) {
                return false;
            }
        }
        return true;
    }

    public final C1475770oVT LIZ(String str) {
        List<C1475770oVT> list;
        if (!TextUtils.isEmpty(str) && (list = this.LIZIZ) != null) {
            for (C1475770oVT c1475770oVT : list) {
                if (c1475770oVT.LIZ.equals(str)) {
                    return c1475770oVT;
                }
            }
            return null;
        }
        return null;
    }

    public final void LJ(C1471550oOf c1471550oOf) {
        boolean z;
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList();
        }
        int i = 0;
        int i2 = 0;
        for (C1476220oWC c1476220oWC : (CopyOnWriteArrayList) c1471550oOf.LJIILLIIL) {
            C1475760oVS c1475760oVSLIZ = LIZ(c1476220oWC.LIZ);
            if (c1475760oVSLIZ == null) {
                c1475760oVSLIZ = new C1475760oVS() { // from class: X.0oVT
                };
                z = false;
            } else {
                z = true;
            }
            c1475760oVSLIZ.LIZ = c1476220oWC.LIZ;
            c1475760oVSLIZ.LIZIZ = c1476220oWC.LJIIJ;
            long j = c1476220oWC.LJIIJJI;
            if (c1475760oVSLIZ.LIZLLL == null) {
                c1475760oVSLIZ.LIZLLL = new ArrayList();
            }
            if (((ArrayList) c1475760oVSLIZ.LIZLLL).size() == 0) {
                ((ArrayList) c1475760oVSLIZ.LIZLLL).add(new C1475800oVW());
            }
            ListProtector.get(c1475760oVSLIZ.LIZLLL, 0).getClass();
            ((C1475800oVW) ListProtector.get(c1475760oVSLIZ.LIZLLL, 0)).LIZ = j;
            c1475760oVSLIZ.LJ = c1476220oWC.LJIIL;
            c1475760oVSLIZ.LIZJ = c1476220oWC.LJIIIZ;
            C1474520oTS c1474520oTS = c1476220oWC.LJ;
            if (c1474520oTS != null) {
                if (c1474520oTS.LJFF() == 0) {
                    i2++;
                } else if (c1476220oWC.LJ.LJFF() == 1) {
                    i++;
                }
            }
            if (!z) {
                ((ArrayList) this.LIZIZ).add(c1475760oVSLIZ);
            }
        }
        if (i > 0 && i2 > 0) {
            this.LIZJ = true;
        }
    }
}
