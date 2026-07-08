package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0L14, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L14 extends C0L18 {
    public static final C0L14 LIZ = new C0L14();

    public static void LIZ(C0L13 c0l13) {
        ArrayList<MediaModel> arrayList = c0l13.LIZJ;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            if (C23241098t.LIZ()) {
                LIZIZ(c0l13);
                return;
            }
        } else {
            Iterator<MediaModel> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJIILJJIL()) {
                    break;
                }
            }
            if (C23241098t.LIZ() && c0l13.LIZJ.size() > 1) {
                LIZIZ(c0l13);
                return;
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0L11(c0l13, null), 3);
    }

    public static void LIZIZ(final C0L13 c0l13) {
        long jCurrentTimeMillis;
        try {
            C0L16.LIZ(0, "go_next_start", "");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{\"event\":\"nextClicked\",\"selectedCount\":");
            sbLIZ.append(c0l13.LIZJ.size());
            sbLIZ.append(",\"creationId\":\"");
            sbLIZ.append(c0l13.LIZIZ.getCreationId());
            sbLIZ.append("\"}");
            C201955140j.LJIILIIL("PhotoMVNext", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C573020Mdg c573020Mdg = new C573020Mdg(c0l13.LIZ, false, c0l13.LJIIIIZZ);
        ShortVideoContext shortVideoContext = c0l13.LIZIZ;
        ArrayList<MediaModel> arrayList = c0l13.LIZJ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<MediaModel> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LJFF());
        }
        InterfaceC573150Mdt interfaceC573150Mdt = new InterfaceC573150Mdt() { // from class: X.0L15
            @Override // X.InterfaceC573150Mdt
            public final void onFinish(boolean z) {
                String strLIZIZ;
                int i;
                try {
                    if (z) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("{\"event\":\"nextFinish\",\"result\":\"success\",\"creationId\":\"");
                        sbLIZ2.append(c0l13.LIZIZ.getCreationId());
                        sbLIZ2.append("\"}");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("{\"event\":\"nextFinish\",\"result\":\"failure\",\"creationId\":\"");
                        sbLIZ3.append(c0l13.LIZIZ.getCreationId());
                        sbLIZ3.append("\"}");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    C201955140j.LJIILIIL("PhotoMVNext", strLIZIZ);
                    if (z) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    C0L16.LIZ(i, "go_next_end", strLIZIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                if (z) {
                    c0l13.LJ.invoke();
                } else {
                    c0l13.LJFF.invoke();
                }
            }
        };
        Long l = c0l13.LJII;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        C573020Mdg.LJIIIIZZ(c573020Mdg, shortVideoContext, arrayList2, interfaceC573150Mdt, false, null, Long.valueOf(jCurrentTimeMillis), c0l13.LIZLLL, c0l13.LIZJ, null, c0l13.LJI, null, null, 13824);
    }
}
