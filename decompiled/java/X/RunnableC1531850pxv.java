package X;

import Y.ARunnableS28S1100000_23;
import Y.ARunnableS92S0200000_23;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1531850pxv implements Runnable {
    public final /* synthetic */ C1532030pyD LL;
    public final /* synthetic */ C1532710pzJ LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;
    public final /* synthetic */ C1532720pzK LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ C1531820pxs LLIZ;
    public final /* synthetic */ Long LLIZLLLIL;
    public final /* synthetic */ C1531990py9<C1531820pxs> LLJ;

    public RunnableC1531850pxv(C1532030pyD c1532030pyD, C1532710pzJ c1532710pzJ, ARunnableS92S0200000_23 aRunnableS92S0200000_23, C1532720pzK c1532720pzK, String str, Map map, C1531820pxs c1531820pxs, Long l, C1531990py9 c1531990py9) {
        this.LL = c1532030pyD;
        this.LLILLJJLI = c1532710pzJ;
        this.LLILLL = aRunnableS92S0200000_23;
        this.LLILZ = c1532720pzK;
        this.LLILZIL = str;
        this.LLILZLL = map;
        this.LLIZ = c1531820pxs;
        this.LLIZLLLIL = l;
        this.LLJ = c1531990py9;
    }

    public final void LIZ() throws NoSuchAlgorithmException {
        LinkedHashMap<String, String> linkedHashMap;
        AbstractC1532040pyE abstractC1532040pyE;
        this.LL.LJ(this.LLILLJJLI);
        Runnable runnable = this.LLILLL;
        if (runnable != null) {
            runnable.run();
        }
        C1531840pxu c1531840pxu = C1531820pxs.LJIIL;
        String str = this.LLILZ.LIZ;
        String str2 = this.LLILZIL;
        String strLJJLJ = a0.LJJLJ('/', str2, str2);
        String strLJJLJ2 = a0.LJJLJ('.', strLJJLJ, strLJJLJ);
        if (strLJJLJ2 == strLJJLJ) {
            strLJJLJ2 = "";
        }
        Map<String, String> map = this.LLILZLL;
        c1531840pxu.getClass();
        long jLIZ = C1531840pxu.LIZ(map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strLJ = C08IP.LJ(str);
        boolean z = false;
        sbLIZ.append(strLJ.substring(0, 8));
        sbLIZ.append('-');
        sbLIZ.append(jLIZ);
        sbLIZ.append('.');
        sbLIZ.append(strLJJLJ2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        while (jLIZ != 0 && C1531200pws.LIZIZ.contains(strLIZIZ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("forest_");
            sbLIZ2.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        Pair pair = new Pair(strLIZIZ, Long.valueOf(jLIZ));
        String str3 = (String) pair.getFirst();
        this.LLIZ.LJFF = Long.valueOf(((Number) pair.getSecond()).longValue());
        this.LLIZ.LJ = str3;
        final C0VSJ c0vsj = new C0VSJ(C1529330ptr.LIZ(), str3);
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(c0vsj.delete()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1532030pyD c1532030pyD = this.LL;
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(152);
        if (!c1532030pyD.LJIIJJI() || c0vsj.exists()) {
            return;
        }
        try {
            c1532030pyD.LLIZLLLIL.writeLock().lock();
            if (c1532030pyD.LJIIJJI() && !c0vsj.exists() && (abstractC1532040pyE = c1532030pyD.LLILZLL) != null && abstractC1532040pyE.LJI(c0vsj, aFwS245S0000000_12)) {
                final InterfaceC1530990pwX interfaceC1530990pwX = c1532030pyD.LLILLJJLI;
                c1532030pyD.LLILLJJLI = new InterfaceC1530990pwX() { // from class: X.0pwW
                    @Override // X.InterfaceC1530990pwX
                    public final InputStream LJFF(C1532710pzJ c1532710pzJ) {
                        Object c098200Yq;
                        try {
                            c098200Yq = new C0VSP(c0vsj);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        InputStream inputStream = (InputStream) c098200Yq;
                        if (inputStream != null) {
                            return inputStream;
                        }
                        InterfaceC1530990pwX interfaceC1530990pwX2 = interfaceC1530990pwX;
                        if (interfaceC1530990pwX2 == null) {
                            return null;
                        }
                        return interfaceC1530990pwX2.LJFF(c1532710pzJ);
                    }
                };
                z = true;
            }
        } finally {
            try {
            } catch (Throwable th2) {
            }
        }
        c1532030pyD.LLIZLLLIL.writeLock().unlock();
        if (z) {
            if (!c0vsj.isFile()) {
                C1532760pzO.LIZIZ(C1532920pze.LIZJ, "HTTPCache", "createHttpCache", "cache file not exists after sync successfully", null, null, 48);
                return;
            }
            this.LLIZ.LIZIZ = c0vsj;
            C1531860pxw c1531860pxw = this.LLIZ.LIZJ;
            if (c1531860pxw != null) {
                List<String> list = C1531200pws.LIZ;
                C1531820pxs.LJIIL.getClass();
                String strLJ2 = C1531840pxu.LJ(str3);
                Gson gson = C1531810pxr.LIZ;
                if (c1531860pxw.LIZIZ == null && c1531860pxw.LIZJ == null) {
                    linkedHashMap = c1531860pxw.LIZ;
                } else {
                    LinkedHashMap<String, String> linkedHashMap2 = c1531860pxw.LIZ;
                    linkedHashMap = new LinkedHashMap<>();
                    for (Map.Entry<String, String> entry : linkedHashMap2.entrySet()) {
                        if (!c1531860pxw.LIZ(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C1531200pws.LIZIZ.storeStringJustDisk(strLJ2, GsonProtectorUtils.toJson(C1531810pxr.LIZ, linkedHashMap));
            }
            Long l = this.LLIZLLLIL;
            if (l != null) {
                long jLongValue = l.longValue();
                List<String> list2 = C1531200pws.LIZ;
                C1531820pxs.LJIIL.getClass();
                C1531200pws.LIZIZ.storeLong(C1531840pxu.LJI(str3), jLongValue);
            }
            List<String> list3 = C1531200pws.LIZ;
            Gson gson2 = C1531810pxr.LIZ;
            C1531200pws.LIZIZ.storeStringJustDisk(str3, GsonProtectorUtils.toJson(C1531810pxr.LIZ, this.LLILZLL));
            C1532960pzi.LIZLLL(new ARunnableS28S1100000_23(this.LLJ, this.LLILZIL, 26));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("NetCache$Companion@ef2e.createHttpCache$4$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NetCache$Companion@ef2e.createHttpCache$4$1");
    }
}
