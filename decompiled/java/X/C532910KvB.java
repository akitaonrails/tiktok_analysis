package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0KvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532910KvB extends AbstractC532930KvD {
    public final C054G LIZJ;
    public final String LIZLLL;

    public C532910KvB() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LIZLLL = "WuZhuiDownloader MaterialHandler";
    }

    @Override // X.AbstractC532930KvD
    public final String LJ() {
        return this.LIZLLL;
    }

    public final String LJIIJ(String str) {
        Object c098200Yq;
        Object obj;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("copyMaterialDownloadToTemplateCache: source missing: ");
            sbLIZ.append(str);
            LJI(C2188811AlT.LIZIZ(sbLIZ));
            return str;
        }
        try {
            C0VSJ c0vsjLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.UGC_TEMPLATE, EnumC23090092y.TEMPLATE_CACHE.getDirName(), true);
            if (c0vsj.isDirectory()) {
                C0VSJ c0vsj2 = new C0VSJ(c0vsjLJIIJ, c0vsj.getName());
                if (c0vsj2.exists()) {
                    C08QA.LJIIZILJ(c0vsj2);
                }
                C08QA.LJIILL(c0vsj, c0vsj2, true, 4);
                c098200Yq = c0vsj2.getAbsolutePath();
            } else {
                C0VSJ c0vsj3 = new C0VSJ(c0vsjLJIIJ, c0vsj.getName());
                C08QA.LJIILLIIL(c0vsj, c0vsj3, true, 4);
                c098200Yq = c0vsj3.getAbsolutePath();
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            obj = c098200Yq;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("copyMaterialDownloadToTemplateCache failed: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            LJI(C2188811AlT.LIZIZ(sbLIZ2));
            obj = str;
        }
        return (String) obj;
    }

    public static String LJIILIIL(C532910KvB c532910KvB, List list) {
        c532910KvB.getClass();
        if (list.isEmpty()) {
            return "[]";
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(list, 5), null, e3.e, e3.f, 0, null, null, 57);
        if (list.size() <= 5) {
            return strLJJLIIIJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append("...(");
        sbLIZ.append(list.size());
        sbLIZ.append(" total)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIILJJIL(C532910KvB c532910KvB, List list) {
        c532910KvB.getClass();
        if (list != null && !list.isEmpty()) {
            String strLJIILLIIL = C09RB.LJIILLIIL(C09RB.LJJI(new C08LY(new C1939607ik(list), AFwS239S0000000_8.get$arr$(285)), 5), null, e3.e, e3.f, null, 57);
            if (list.size() > 5) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJIILLIIL);
                sbLIZ.append("...(");
                sbLIZ.append(list.size());
                sbLIZ.append(" total)");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return strLJIILLIIL;
        }
        return "[]";
    }

    @Override // X.AbstractC532930KvD, X.InterfaceC533130KvX
    public final void LIZ(List list, C535880Kzy c535880Kzy) {
        if (list.isEmpty()) {
            return;
        }
        EffectManager effectManager = (EffectManager) this.LIZIZ.getValue();
        if (effectManager == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c535880Kzy.onError((String) it2.next(), -4002, "effectManager not available");
            }
            return;
        }
        C23250099c.LIZLLL(this.LIZJ, null, null, new C532880Kv8(list, this, c535880Kzy, effectManager, null), 3);
    }

    @Override // X.AbstractC532930KvD, X.InterfaceC533130KvX
    public final void LIZIZ(String str, InterfaceC531800KtO interfaceC531800KtO) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadResource: ");
        sbLIZ.append(str);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(this.LIZJ, null, null, new C532800Kv0(this, str, interfaceC531800KtO, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r15, X.InterfaceC531800KtO r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532910KvB.LJIIJJI(java.lang.String, X.0KtO, X.05Vn):java.lang.Object");
    }

    public final String LJIIL(String str, C1662010tLr c1662010tLr, List<String> list, List<MaterialResource> list2) {
        String name;
        int size;
        Exception exc = c1662010tLr.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" failed: errorCode=");
        sbLIZ.append(c1662010tLr.LIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(c1662010tLr.LIZIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(c1662010tLr.LIZJ);
        sbLIZ.append(", cause=");
        String message = null;
        if (exc != null) {
            name = exc.getClass().getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append(':');
        if (exc != null) {
            message = exc.getMessage();
        }
        sbLIZ.append(message);
        sbLIZ.append(", requestedKeys=");
        sbLIZ.append(LJIILIIL(this, list));
        sbLIZ.append(", failedCount=");
        if (list2 != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(", failedKeys=");
        sbLIZ.append(LJIILJJIL(this, list2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
