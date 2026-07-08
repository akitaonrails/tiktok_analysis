package X;

import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0meJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404370meJ {
    public final InterfaceC1661400tKs LIZ;
    public final ArrayList<C1404380meK> LIZIZ = new ArrayList<>();
    public final ArrayList<C1404380meK> LIZJ = new ArrayList<>();

    public final void LIZ() throws Exception {
        List<ComposerInfo> list;
        InterfaceC1661400tKs interfaceC1661400tKs = this.LIZ;
        if (!(interfaceC1661400tKs instanceof C1404360meI)) {
            throw new Exception("should not go this case ");
        }
        C1404360meI c1404360meI = (C1404360meI) interfaceC1661400tKs;
        c1404360meI.getClass();
        if (this.LIZIZ.size() > 0) {
            for (C1404380meK c1404380meK : this.LIZIZ) {
                int i = c1404380meK.LIZ;
                if (i == 0) {
                    c1404360meI.LIZIZ.clear();
                    c1404360meI.LIZ.LJIIL().getClass();
                } else if (i == 1) {
                    List<ComposerInfo> list2 = c1404360meI.LIZIZ.get(Integer.valueOf(c1404380meK.LIZIZ));
                    int i2 = 12;
                    String str = null;
                    String str2 = "";
                    if (list2 == null) {
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        copyOnWriteArrayList.add(new ComposerInfo(c1404380meK.LIZJ, str2, str, i2));
                        c1404360meI.LIZIZ.put(Integer.valueOf(c1404380meK.LIZIZ), copyOnWriteArrayList);
                    } else {
                        list2.add(new ComposerInfo(c1404380meK.LIZJ, str2, str, i2));
                    }
                } else if (i == 2) {
                    c1404360meI.LIZJ(c1404380meK.LIZJ);
                } else if (i == 3) {
                    c1404360meI.LIZIZ.remove(Integer.valueOf(c1404380meK.LIZIZ));
                }
            }
            c1404360meI.LIZ();
        }
        for (C1404380meK c1404380meK2 : this.LIZJ) {
            int i3 = c1404380meK2.LIZIZ;
            if (i3 != -1 && (list = c1404360meI.LIZIZ.get(Integer.valueOf(i3))) != null) {
                for (ComposerInfo composerInfo : list) {
                    String str3 = composerInfo.nodePath;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1404380meK2.LIZJ);
                    sbLIZ.append(';');
                    sbLIZ.append(c1404380meK2.LIZLLL);
                    if (a0.LJJIIZI(str3, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c1404380meK2.LIZJ);
                        sbLIZ2.append(';');
                        sbLIZ2.append(c1404380meK2.LIZLLL);
                        sbLIZ2.append(';');
                        sbLIZ2.append(c1404380meK2.LJ);
                        composerInfo.nodePath = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    String str4 = composerInfo.nodePath;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(c1404380meK2.LIZJ);
                    sbLIZ3.append(':');
                    sbLIZ3.append(c1404380meK2.LIZLLL);
                    if (a0.LJJIIZI(str4, C2188811AlT.LIZIZ(sbLIZ3), false)) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(c1404380meK2.LIZJ);
                        sbLIZ4.append(':');
                        sbLIZ4.append(c1404380meK2.LIZLLL);
                        sbLIZ4.append(':');
                        sbLIZ4.append(c1404380meK2.LJ);
                        composerInfo.nodePath = C2188811AlT.LIZIZ(sbLIZ4);
                    }
                }
            }
            c1404360meI.LIZ.LJIIL().LJJIJIIJI(c1404380meK2.LIZJ, c1404380meK2.LIZLLL, c1404380meK2.LJ);
        }
        this.LIZIZ.clear();
        this.LIZJ.clear();
    }

    public C1404370meJ(InterfaceC1661400tKs interfaceC1661400tKs) {
        this.LIZ = interfaceC1661400tKs;
    }

    public final C1404370meJ LIZIZ(float f, String str, String str2) {
        this.LIZJ.add(new C1404380meK(str, str2, f));
        return this;
    }

    public final C1404370meJ LIZJ(float f, String str, int i, String str2) {
        this.LIZJ.add(new C1404380meK(i, str, str2, f));
        return this;
    }
}
