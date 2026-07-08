package X;

import android.os.SystemClock;
import com.bytedance.ilasdk.api.MaterialScanService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS652S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.08re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.understanding.tasks.LocalEmbScanTask$run$1$completed$1", f = "LocalEmbScanTask.kt", l = {150}, m = "invokeSuspend")
public final class C2249608re extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C2250008ri LLILZ;
    public final /* synthetic */ List<C2249908rh> LLILZIL;
    public final /* synthetic */ MaterialScanService LLILZLL;
    public final /* synthetic */ List<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2249608re(C2250008ri c2250008ri, List<C2249908rh> list, MaterialScanService materialScanService, List<String> list2, InterfaceC1364105Vn<? super C2249608re> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c2250008ri;
        this.LLILZIL = list;
        this.LLILZLL = materialScanService;
        this.LLIZ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2249608re c2249608re = new C2249608re(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c2249608re.LLILLL = obj;
        return c2249608re;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long jElapsedRealtime;
        EnumC094300Xd enumC094300Xd;
        Set<C00AG> set;
        C00AF c00af;
        C1C7U.LIZ("LocalEmbScanTask@bf5b.run$1$completed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            try {
                c098200Yq = this.LLILZLL.LJ(this.LLIZ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C201955140j.LJIIJ(C1673840tew.LIZIZ, "LocalEmbScanTask preQuery error", thM5exceptionOrNullimpl);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Map mapLJ = (Map) c098200Yq;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C2250008ri c2250008ri = this.LLILZ;
            List<C2249908rh> list = this.LLILZIL;
            c2250008ri.getClass();
            ArrayList arrayList = new ArrayList(list.size());
            ArrayList arrayList2 = new ArrayList(list.size());
            for (C2249908rh c2249908rh : list) {
                List list2 = (List) mapLJ.get(c2249908rh.LIZ);
                if (list2 != null && (c00af = (C00AF) C13LP.LJJJLL(list2)) != null) {
                    set = c00af.LJFF;
                } else {
                    set = null;
                }
                if (set != null && set.containsAll(C2250008ri.LL)) {
                    arrayList.add(c2249908rh);
                } else {
                    arrayList2.add(c2249908rh);
                }
            }
            List<C2249908rh> list3 = (List) new Pair(arrayList, arrayList2).getSecond();
            C1673840tew c1673840tew = C1673840tew.LIZIZ;
            C201955140j.LJIILJJIL(c1673840tew, "LocalEmbScanTask partition: total=" + this.LLILZIL.size() + ", cached=" + (this.LLILZIL.size() - list3.size()) + ", needsScan=" + list3.size() + ", preQueryMs=" + (SystemClock.elapsedRealtime() - jElapsedRealtime2));
            if (!list3.isEmpty()) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                C2250008ri c2250008ri2 = this.LLILZ;
                MaterialScanService materialScanService = this.LLILZLL;
                this.LL = jElapsedRealtime;
                this.LLILLJJLI = 1;
                c2250008ri2.getClass();
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                if (!materialScanService.LJFF()) {
                    C201955140j.LJIIJ(c1673840tew, "LocalEmbScanTask scan not ready (SDK released/uninitialized), skip scanAssets", new Throwable("LocalEmbScanTask scan not ready"));
                    if (c2252611DEt.isActive()) {
                        Unit unit = Unit.LIZ;
                        C189200o6.m2constructorimpl(unit);
                        c2252611DEt.resumeWith(unit);
                    }
                } else {
                    int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 1, "local_emb_scan_priority", true);
                    if (iLJIJ != 0) {
                        if (iLJIJ == 1 || iLJIJ != 2) {
                            enumC094300Xd = EnumC094300Xd.NORMAL;
                        } else {
                            enumC094300Xd = EnumC094300Xd.HIGH;
                        }
                    } else {
                        enumC094300Xd = EnumC094300Xd.LOW;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LocalEmbScanTask scan config: priority=");
                    sbLIZ.append(enumC094300Xd);
                    C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
                    C094200Xc c094200Xc = new C094200Xc(Collections.singletonList(C00AG.NODE_HUB_C1500), enumC094300Xd, true, true, false, true);
                    C259800zU c259800zU = new C259800zU();
                    try {
                        c259800zU.element = materialScanService.LJI(list3, c094200Xc, null, new AwS652S0100000_3(c2252611DEt, 4));
                        c2252611DEt.LJJII(new AwS369S0200000_3(c259800zU, c2250008ri2, materialScanService, 12));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C201955140j.LJIIJ(C1673840tew.LIZIZ, "LocalEmbScanTask scanAssets threw, treat as scan failure", th2);
                        if (c2252611DEt.isActive()) {
                            Unit unit2 = Unit.LIZ;
                            C189200o6.m2constructorimpl(unit2);
                            c2252611DEt.resumeWith(unit2);
                        }
                    }
                }
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ != C099R.LJFF()) {
                    objLJIJ = Unit.LIZ;
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("LocalEmbScanTask@bf5b.run$1$completed$1");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("LocalEmbScanTask@bf5b.run$1$completed$1");
            return true;
        }
        C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LocalEmbScanTask scan finished, scanMs=");
        sbLIZ2.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
        C201955140j.LJIILJJIL(c1673840tew2, C2188811AlT.LIZIZ(sbLIZ2));
        C1C7U.LIZIZ("LocalEmbScanTask@bf5b.run$1$completed$1");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
