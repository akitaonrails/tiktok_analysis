package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0OUY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0OUY extends C0OUZ {
    public int LJI;

    public abstract Map<String, C620140OUa> LJIIIIZZ();

    @Override // X.C0OUZ
    public final void LIZIZ() {
        if (LIZ()) {
            Iterator<Map.Entry<String, C620140OUa>> it2 = LJIIIIZZ().entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().LJ();
            }
        }
        super.LIZIZ();
    }

    @Override // X.C0OUZ
    public void LJ() {
        super.LJ();
        if (LIZ()) {
            Iterator<Map.Entry<String, C620140OUa>> it2 = LJIIIIZZ().entrySet().iterator();
            while (it2.hasNext()) {
                C620140OUa value = it2.next().getValue();
                synchronized (value) {
                    value.LIZJ.LIZLLL();
                }
            }
        }
    }

    @Override // X.C0OUZ
    public void LJII() {
        super.LJII();
        Iterator<Map.Entry<String, C620140OUa>> it2 = LJIIIIZZ().entrySet().iterator();
        while (it2.hasNext()) {
            C620140OUa value = it2.next().getValue();
            synchronized (value) {
                value.LIZIZ.LIZ = EnumC620170OUd.UNKNOWN;
                C620150OUb c620150OUb = value.LIZJ;
                c620150OUb.LIZ = 0L;
                c620150OUb.LIZIZ = 0L;
                value.LIZLLL = -1;
            }
        }
        this.LJI = 0;
    }

    public C0OUY(String str) {
        super(str);
    }

    @Override // X.C0OUZ
    public void LJFF(C2241008qG c2241008qG) {
        int i;
        for (Map.Entry<String, C620140OUa> entry : LJIIIIZZ().entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("module_state_");
            sbLIZ.append(entry.getKey());
            c2241008qG.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), entry.getValue().LIZ().getValue());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("module_cost_time_");
            sbLIZ2.append(entry.getKey());
            c2241008qG.LIZJ(Long.valueOf(entry.getValue().LIZIZ()), C2188811AlT.LIZIZ(sbLIZ2));
            if (entry.getValue().LIZ() == EnumC620170OUd.FAIL) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("module_error_code_");
                sbLIZ3.append(entry.getKey());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                C620140OUa value = entry.getValue();
                synchronized (value) {
                    i = value.LIZLLL;
                }
                c2241008qG.LIZIZ(Integer.valueOf(i), strLIZIZ);
            }
        }
    }

    public final void LJIIIZ(String str, EnumC620170OUd enumC620170OUd, int i) {
        if (LIZ()) {
            C620140OUa c620140OUa = LJIIIIZZ().get(str);
            boolean z = true;
            if (c620140OUa != null) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bulletin_board_sli_qualitySceneName:");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(": updateModuleRecord: ");
                sbLIZ.append(str);
                sbLIZ.append(", state:");
                sbLIZ.append(enumC620170OUd.getValue());
                sbLIZ.append(", needChange：");
                sbLIZ.append(c620140OUa.LIZJ());
                C1720106oR.LJI("BulletinBoardSliQualityEvent", C2188811AlT.LIZIZ(sbLIZ));
                if (C620160OUc.LIZ.contains(enumC620170OUd) && c620140OUa.LIZJ()) {
                    synchronized (c620140OUa) {
                        c620140OUa.LIZIZ.LIZ = enumC620170OUd;
                        if (enumC620170OUd == EnumC620170OUd.FAIL) {
                            c620140OUa.LIZLLL = i;
                        } else {
                            c620140OUa.LIZLLL = -1;
                        }
                    }
                    c620140OUa.LIZLLL();
                    this.LJI++;
                }
            }
            if (this.LJI == LJIIIIZZ().size() && LIZ()) {
                Collection<C620140OUa> collectionValues = LJIIIIZZ().values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    z = false;
                } else {
                    Iterator<T> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        if (((C620140OUa) it2.next()).LIZ() == EnumC620170OUd.FAIL) {
                            break;
                        }
                    }
                    z = false;
                }
                Iterator<Map.Entry<String, C620140OUa>> it3 = LJIIIIZZ().entrySet().iterator();
                while (it3.hasNext()) {
                    it3.next().getValue().LJ();
                }
                if (z) {
                    LIZLLL(-1);
                } else {
                    LIZJ();
                }
            }
        }
    }
}
