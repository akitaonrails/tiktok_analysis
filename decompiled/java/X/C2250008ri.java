package X;

import com.bytedance.ilasdk.api.MaterialScanService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2250008ri extends C1D8B {
    public static final Set<C00AG> LL = Collections.singleton(C00AG.NODE_HUB_C1500);

    public static C2249908rh LJII(String str) {
        Object c098200Yq;
        String str2;
        EnumC1986907qN enumC1986907qN;
        if (u.LJJIIJZLJL(str, "content://", false)) {
            try {
                C844470XAv.LIZ.getClass();
                c098200Yq = C09N5.LIZ(C844470XAv.LIZ(), UriProtector.parse(str));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            str2 = (String) c098200Yq;
            if (str2 == null || str2.length() == 0) {
                C201955140j.LJIIJ(C1673840tew.LIZIZ, "LocalEmbScanTask convertUriToPath empty for uri suffix=" + a0.LJJLJ('/', str, str), new Throwable("LocalEmbScanTask convertUriToPath failed"));
                str2 = str;
            }
        } else {
            str2 = str;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        if (!u.LJIIZILJ(lowerCase, ".mp4", false) && !u.LJIIZILJ(lowerCase, ".mov", false) && !u.LJIIZILJ(lowerCase, ".avi", false) && !u.LJIIZILJ(lowerCase, ".mkv", false) && !u.LJIIZILJ(lowerCase, ".webm", false)) {
            enumC1986907qN = EnumC1986907qN.IMAGE;
        } else {
            enumC1986907qN = EnumC1986907qN.VIDEO;
        }
        return new C2249908rh(str, str2, enumC1986907qN, null, null, false, 504);
    }

    public static List LJI(MaterialScanService materialScanService, List list) {
        Object c098200Yq;
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        try {
            c098200Yq = materialScanService.LJ(list);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJIIJ(C1673840tew.LIZIZ, "LocalEmbScanTask queryScanResult error", thM5exceptionOrNullimpl);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Map mapLJ = (Map) c098200Yq;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = mapLJ.values().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) it2.next()).iterator();
            while (it3.hasNext()) {
                for (C00AM c00am : ((C00AF) it3.next()).LIZIZ) {
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(c00am.LIZ);
                    if (numLJIIJJI != null) {
                        int iIntValue = numLJIIJJI.intValue();
                        if (hashSet.add(Integer.valueOf(iIntValue))) {
                            arrayList.add(new C053200Hi(c00am.LIZJ, c00am.LIZIZ, iIntValue));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.C1D8B
    public final void LJFF(C1404610meh c1404610meh, C1D85 c1d85) {
        C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "LocalEmbScanTask start");
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof ContentPipelineContext) {
                if (next != null) {
                    ContentPipelineContext contentPipelineContext = (ContentPipelineContext) next;
                    if (!C1458780o44.LIZ()) {
                        c1d85.LJ(1, new IllegalStateException("local_emb_ab_disabled"));
                        return;
                    }
                    List<String> list = contentPipelineContext.request.sources;
                    if (list.isEmpty()) {
                        c1d85.LJ(8, new IllegalStateException("local_emb_empty_sources"));
                        return;
                    } else {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2250108rj(c1d85, list, this, contentPipelineContext, null), 3);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.understanding.ContentPipelineContext");
    }
}
