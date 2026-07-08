package X;

import Y.ARunnableS89S0200000_20;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0klK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331840klK extends C1332000kla {
    public final List<InterfaceC1324680kZm> LIZIZ = new LinkedList();
    public final ConcurrentHashMap<InterfaceC1324680kZm, List<SoftReference<InterfaceC1331960klW>>> LIZ = new ConcurrentHashMap<>();

    public static File LJII(InterfaceC1324680kZm interfaceC1324680kZm) {
        File file;
        C1333180knU c1333180knULJIIIZ;
        Class<?> cls = C1322200kVm.LIZ;
        InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIILL().LJIIJ(interfaceC1324680kZm);
        if (interfaceC1317730kOZLJIIJ == null && (interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIJJ().LJIIJ(interfaceC1324680kZm)) == null && (c1333180knULJIIIZ = C1328130kfL.LJIILIIL().LJIIIZ()) != null) {
            Iterator it2 = c1333180knULJIIIZ.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1326920kdO interfaceC1326920kdO = (InterfaceC1326920kdO) it2.next();
                if (interfaceC1326920kdO != null && interfaceC1326920kdO.LJIIJ(interfaceC1324680kZm) != null) {
                    interfaceC1317730kOZLJIIJ = interfaceC1326920kdO.LJIIJ(interfaceC1324680kZm);
                    break;
                }
            }
        }
        if ((interfaceC1317730kOZLJIIJ instanceof C1335740krc) && (file = ((C1335740krc) interfaceC1317730kOZLJIIJ).LIZ) != null && file.exists()) {
            return file;
        }
        return null;
    }

    @Override // X.InterfaceC1335510krF
    public final void LJI(InterfaceC1332030kld interfaceC1332030kld) {
        InterfaceC1324680kZm cacheKey = interfaceC1332030kld.getCacheKey();
        if (cacheKey == null) {
            return;
        }
        C823050WQl.LIZLLL().execute(new ARunnableS89S0200000_20(cacheKey, this, 85));
    }
}
