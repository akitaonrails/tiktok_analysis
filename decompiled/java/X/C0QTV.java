package X;

import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.config.EcSearchSugOptimizeConfig;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QTV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QTV implements C0QTB {
    public final View LL;
    public final C19EG LLILLJJLI;
    public final InterfaceC497601wk LLILLL;
    public final InterfaceC670870QTd LLILZ;
    public final ConcurrentHashMap<String, EcSearchSugResponse> LLILZIL;
    public final boolean LLILZLL;
    public long LLIZ;
    public final Deque<C670860QTc> LLIZLLLIL;

    @Override // X.C0QTB
    public final void onDestroy() {
        Object c098200Yq;
        try {
            for (C670860QTc c670860QTc : this.LLIZLLLIL) {
                c670860QTc.LIZJ = true;
                ListenableFuture<EcSearchSugResponse> listenableFuture = c670860QTc.LIZIZ;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
            }
            ((LinkedList) this.LLIZLLLIL).clear();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }

    @Override // X.C0QTB
    public final void LJJLIIIJLJLI() {
        if (!C124000da.LIZ()) {
            this.LLILZIL.clear();
        }
        if (this.LLILZLL) {
            C671000QTq.LIZ();
        }
        C0QR8.LIZ.getClass();
        C0QR8.LIZIZ = 0L;
        C0QR8.LIZJ = 0L;
    }

    @Override // X.C0QTB
    public final void LLZZ(SearchSugEntity searchSugEntity) {
        for (Map.Entry<String, EcSearchSugResponse> entry : this.LLILZIL.entrySet()) {
            String key = entry.getKey();
            Iterator<SearchSugEntity> it2 = entry.getValue().sugList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    SearchSugEntity next = it2.next();
                    if (next.LIZJ() && Intrinsics.LJFF(next.content, searchSugEntity.content)) {
                        this.LLILZIL.remove(key);
                        break;
                    }
                }
            }
        }
        C670940QTk.LIZ.getClass();
        if (((EcSearchSugOptimizeConfig) C670940QTk.LIZJ.getValue()).enableSugCacheBaseWord) {
            C671000QTq.LIZ();
        }
    }

    public final void LLJLILLLLZIIL(C670840QTa c670840QTa, C670860QTc c670860QTc, long j) throws ExecutionException, InterruptedException {
        String str;
        Integer num;
        C664000Q2s c664000Q2s;
        ISearchMiddleForECService iSearchMiddleForECService = (ISearchMiddleForECService) ServiceManager.get().getService(ISearchMiddleForECService.class);
        String str2 = c670840QTa.LIZ;
        String str3 = c670840QTa.LIZIZ;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this.LL);
        C19EG c19eg = this.LLILLJJLI;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragmentLIZLLL, c19eg);
        String str4 = "";
        if (c650960Pg6LJII == null || (c664000Q2s = c650960Pg6LJII.searchCommonModel) == null || (str = c664000Q2s.enterFrom) == null) {
            str = "";
        }
        boolean z = C0QOY.LIZIZ;
        C0QOY.LIZIZ = false;
        if (z) {
            num = 1;
        } else {
            num = null;
        }
        this.LLILZ.LIZIZ(str2);
        if (!c670860QTc.LIZJ) {
            C668220QIy c668220QIy = (C668220QIy) ((HashMap) C668230QIz.LIZ).get(str2);
            if (c668220QIy == null) {
                c668220QIy = C0QJ0.LIZ;
            }
            c668220QIy.getClass();
            C668220QIy c668220QIy2 = C0QJ0.LIZ;
            if (!Intrinsics.LJFF(c668220QIy, c668220QIy2)) {
                c668220QIy.LIZJ = System.currentTimeMillis();
            }
            C0QP7.LIZJ(iSearchMiddleForECService, this.LLILLJJLI);
            C0QTB.LJJLIIIJJIZ.getClass();
            long j2 = C0QTH.LIZJ;
            long j3 = C0QTH.LIZIZ;
            if (j2 > j3) {
                j3 = C0QTH.LIZJ;
            }
            C0QTH.LIZIZ = j3;
            String str5 = c670840QTa.LIZJ;
            String strLIZ = C670980QTo.LIZIZ.LIZ().LIZ();
            Integer num2 = c670840QTa.LJ;
            String strLIZ2 = C668260QJc.LIZ();
            Integer num3 = c670840QTa.LJI;
            Long lValueOf = Long.valueOf(C0QTH.LIZIZ);
            String str6 = C0QOY.LIZ;
            String str7 = c670840QTa.LJIIJ;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = c670840QTa.LJIIJJI;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = c670840QTa.LJIIL;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = c670840QTa.LJIILIIL;
            if (str10 != null) {
                str4 = str10;
            }
            int i = c670840QTa.LJIILJJIL;
            String str11 = c670840QTa.LJIILL;
            if (str11 == null) {
                str11 = null;
            }
            ListenableFuture<EcSearchSugResponse> listenableFutureLIZ = C0QTW.LIZ(new C670840QTa(str2, str3, str5, strLIZ, num2, strLIZ2, num3, lValueOf, str, 0, str6, str7, str8, str9, str4, i, str11, c670840QTa.LJIILLIIL, num));
            C0QTH.LIZIZ++;
            C668260QJc.LIZLLL = str2;
            c670860QTc.LIZIZ = listenableFutureLIZ;
            EcSearchSugResponse ecSearchSugResponse = listenableFutureLIZ.get();
            if (!c670860QTc.LIZJ) {
                ecSearchSugResponse.getClass();
                ecSearchSugResponse.LLILLJJLI = str2;
                if (!Intrinsics.LJFF(c668220QIy, c668220QIy2)) {
                    c668220QIy.LIZLLL = System.currentTimeMillis();
                }
                if (!Intrinsics.LJFF(c668220QIy, c668220QIy2)) {
                    c668220QIy.LJ = ecSearchSugResponse;
                }
                while (!this.LLIZLLLIL.isEmpty()) {
                    if (((C670860QTc) ((LinkedList) this.LLIZLLLIL).pollFirst()).LIZ < c670860QTc.LIZ) {
                        c670860QTc.LIZJ = true;
                        ListenableFuture<EcSearchSugResponse> listenableFuture = c670860QTc.LIZIZ;
                        if (listenableFuture != null) {
                            listenableFuture.cancel(true);
                        }
                    }
                }
                if (C670890QTf.LIZIZ()) {
                    C670890QTf.LIZJ.add(new C670880QTe(str2, ecSearchSugResponse));
                }
                LJLZ(ecSearchSugResponse, false, "sug_show_success", j);
                return;
            }
            throw new CancellationException();
        }
        throw new CancellationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    @Override // X.C0QTB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(X.C670840QTa r16, boolean r17, final long r18) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QTV.f0(X.0QTa, boolean, long):void");
    }

    public C0QTV(View view, C19EG c19eg, InterfaceC497601wk interfaceC497601wk, C0QT3 c0qt3) {
        this.LL = view;
        this.LLILLJJLI = c19eg;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = c0qt3;
        new BPEAHandler(Looper.getMainLooper());
        this.LLILZIL = new ConcurrentHashMap<>();
        C670940QTk.LIZ.getClass();
        this.LLILZLL = ((EcSearchSugOptimizeConfig) C670940QTk.LIZJ.getValue()).enableSugCacheBaseWord;
        this.LLIZLLLIL = new LinkedList();
    }

    public final void LJLZ(EcSearchSugResponse ecSearchSugResponse, boolean z, String str, long j) {
        C584850Mwl.LIZ.LJI(ecSearchSugResponse.requestId, ecSearchSugResponse.logPb);
        if (this.LLILZLL) {
            String str2 = ecSearchSugResponse.LLILLJJLI;
            if (str2 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ((C804450Vh5) C671000QTq.LIZ.getValue()).LIZIZ(str2, new C443120HZe(ecSearchSugResponse, Long.valueOf(jCurrentTimeMillis), C0QOY.LIZ));
            }
        } else {
            ecSearchSugResponse.LLILLL = Long.valueOf(System.currentTimeMillis());
            this.LLILZIL.put(ecSearchSugResponse.LLILLJJLI, ecSearchSugResponse);
        }
        C0QR8 c0qr8 = C0QR8.LIZ;
        String str3 = ecSearchSugResponse.LLILLJJLI;
        c0qr8.getClass();
        C0QR8.LIZIZ(str3);
        this.LLILZ.LIZ(ecSearchSugResponse, z, str, j);
    }
}
