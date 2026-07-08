package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0nPY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433660nPY {
    public final int LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final C1433690nPb LIZLLL = new C1433690nPb();
    public final LinkedHashMap<String, C1433530nPL> LJ = new LinkedHashMap<>();
    public C1433530nPL LJFF;

    public final synchronized boolean LJ() {
        ArrayList arrayList;
        Collection<C1433530nPL> collectionValues = this.LJ.values();
        arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (true ^ (((C1433530nPL) next).LIZLLL instanceof C1433210nOp)) {
                arrayList.add(next);
            }
        }
        return arrayList.size() >= this.LIZ;
    }

    public final synchronized boolean LIZ(C1433530nPL c1433530nPL) {
        if (LJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RunningTaskFull startNewFailed cancelLast:");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" size: ");
            sbLIZ.append(this.LJ.values().size());
            sbLIZ.append(" recordsType: ");
            sbLIZ.append(this.LIZJ);
            C1433730nPf.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ));
            if (this.LIZIZ) {
                C1433700nPc c1433700nPc = new C1433700nPc();
                c1433700nPc.LIZ = "cancel_last_task_while_adding";
                C1433230nOr c1433230nOrLIZ = c1433700nPc.LIZ();
                Collection<C1433530nPL> collectionValues = this.LJ.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (!(((C1433530nPL) obj).LIZLLL instanceof C1433210nOp)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG = ((C1433530nPL) it2.next()).LJI;
                    if (interfaceRunnableC1433480nPG != null) {
                        interfaceRunnableC1433480nPG.LJIILL(c1433230nOrLIZ);
                    }
                }
            } else {
                return false;
            }
        }
        this.LJ.put(c1433530nPL.LIZIZ, c1433530nPL);
        this.LJFF = c1433530nPL;
        return true;
    }

    public final synchronized C1433530nPL LIZIZ(String str) {
        C1433530nPL c1433530nPL;
        c1433530nPL = this.LJ.get(str);
        C1433530nPL c1433530nPL2 = this.LJFF;
        if (c1433530nPL == null) {
            LJFF(c1433530nPL2, str);
        } else if ((c1433530nPL.LIZLLL instanceof C1433210nOp) && c1433530nPL2 != null) {
            LJFF(c1433530nPL2, str);
        }
        c1433530nPL = c1433530nPL2;
        return c1433530nPL;
    }

    public final synchronized C1433530nPL LIZLLL(String str) {
        C1433530nPL c1433530nPL;
        c1433530nPL = null;
        if (str != null) {
            C1433530nPL c1433530nPL2 = this.LJ.get(str);
            if (c1433530nPL2 == null || (c1433530nPL2.LIZLLL instanceof C1433210nOp)) {
                LJFF(null, str);
            } else {
                c1433530nPL = c1433530nPL2;
            }
        }
        return c1433530nPL;
    }

    public static void LJFF(C1433530nPL c1433530nPL, String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishScheduler | RedirectRecord oldId:");
        sbLIZ.append(str);
        sbLIZ.append(" newId:");
        if (c1433530nPL != null) {
            str2 = c1433530nPL.LIZIZ;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1433660nPY(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = str;
    }

    public static C1433530nPL LIZJ(C1433660nPY c1433660nPY, String str, PublishModel publishModel) {
        synchronized (c1433660nPY) {
            C1433690nPb c1433690nPb = c1433660nPY.LIZLLL;
            C1433530nPL c1433530nPLLIZIZ = c1433660nPY.LIZIZ(str);
            if (c1433530nPLLIZIZ != null) {
                if (c1433690nPb.LIZ(publishModel, c1433530nPLLIZIZ.LIZ)) {
                    return c1433530nPLLIZIZ;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PublishScheduler | Find unequal creationId src:");
                sbLIZ.append(publishModel.creationId);
                sbLIZ.append(" result:");
                sbLIZ.append(c1433530nPLLIZIZ.LIZ.creationId);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            return null;
        }
    }
}
