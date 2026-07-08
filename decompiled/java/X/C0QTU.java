package X;

import Y.ACallableS242S0200000_10;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ab.EcSearchSugRequestCancelQueueConfig;
import com.ss.android.ugc.aweme.config.EcSearchSugOptimizeConfig;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QTU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QTU implements C0QTB {
    public final View LL;
    public final C19EG LLILLJJLI;
    public final InterfaceC497601wk LLILLL;
    public final InterfaceC670870QTd LLILZ;
    public final ConcurrentHashMap<String, EcSearchSugResponse> LLILZIL = new ConcurrentHashMap<>();
    public final boolean LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public long LLJ;
    public final Deque<C0QTX> LLJI;
    public final ArrayDeque<C0QTX> LLJIJIL;
    public final AtomicInteger LLJILJIL;

    public final boolean D0() {
        boolean z = false;
        while (this.LLJIJIL.size() >= this.LLIZLLLIL) {
            C0QTX c0qtxPollFirst = this.LLJIJIL.pollFirst();
            if (c0qtxPollFirst != null) {
                z = true;
                c0qtxPollFirst.LJI = true;
                ListenableFuture<EcSearchSugResponse> listenableFuture = c0qtxPollFirst.LJFF;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
                synchronized (this.LLJI) {
                    try {
                        ((LinkedList) this.LLJI).remove(c0qtxPollFirst);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        return z;
    }

    public final void C0() {
        synchronized (this.LLJIJIL) {
            while (this.LLJILJIL.get() < this.LLIZ) {
                try {
                    C0QTX c0qtxPollFirst = this.LLJIJIL.pollFirst();
                    if (c0qtxPollFirst == null) {
                        return;
                    }
                    if (!c0qtxPollFirst.LJI) {
                        c0qtxPollFirst.LJ.LIZLLL = Long.valueOf(System.currentTimeMillis());
                        this.LLJILJIL.incrementAndGet();
                        C15O7.LIZJ(new ACallableS242S0200000_10(this, c0qtxPollFirst, 4));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C0QTB
    public final void onDestroy() {
        synchronized (this.LLJI) {
            try {
                for (C0QTX c0qtx : this.LLJI) {
                    c0qtx.LJI = true;
                    ListenableFuture<EcSearchSugResponse> listenableFuture = c0qtx.LJFF;
                    if (listenableFuture != null) {
                        listenableFuture.cancel(true);
                    }
                }
                ((LinkedList) this.LLJI).clear();
                this.LLJIJIL.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
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

    public final void LJLZ(C0QTX c0qtx) {
        synchronized (this.LLJIJIL) {
            try {
                c0qtx.LJ.LIZJ = Long.valueOf(System.currentTimeMillis());
                c0qtx.LJ.LJFF = D0();
                this.LLJIJIL.addLast(c0qtx);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0();
    }

    public final void LLZLLIL(C0QTX c0qtx) throws ExecutionException, InterruptedException {
        String str;
        Integer num;
        C664000Q2s c664000Q2s;
        C670840QTa c670840QTa = c0qtx.LIZJ;
        long j = c0qtx.LIZLLL;
        ISearchMiddleForECService iSearchMiddleForECService = (ISearchMiddleForECService) ServiceManager.get().getService(ISearchMiddleForECService.class);
        String str2 = c670840QTa.LIZ;
        String str3 = c670840QTa.LIZIZ;
        C646000PVm c646000PVm = C650950Pg5.Companion;
        Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this.LL);
        C19EG c19eg = this.LLILLJJLI;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragmentLIZLLL, c19eg);
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
        if (!c0qtx.LJI) {
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
            String str4 = c670840QTa.LIZJ;
            String strLIZ = C670980QTo.LIZIZ.LIZ().LIZ();
            Integer num2 = c670840QTa.LJ;
            String strLIZ2 = C668260QJc.LIZ();
            Integer num3 = c670840QTa.LJI;
            Long lValueOf = Long.valueOf(c0qtx.LIZIZ);
            String str5 = C0QOY.LIZ;
            String str6 = c670840QTa.LJIIJ;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = c670840QTa.LJIIJJI;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = c670840QTa.LJIIL;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = c670840QTa.LJIILIIL;
            if (str9 == null) {
                str9 = "";
            }
            int i = c670840QTa.LJIILJJIL;
            String str10 = c670840QTa.LJIILL;
            if (str10 == null) {
                str10 = null;
            }
            ListenableFuture<EcSearchSugResponse> listenableFutureLIZ = C0QTW.LIZ(new C670840QTa(str2, str3, str4, strLIZ, num2, strLIZ2, num3, lValueOf, str, 0, str5, str6, str7, str8, str9, i, str10, c670840QTa.LJIILLIIL, num));
            C668260QJc.LIZLLL = str2;
            c0qtx.LJFF = listenableFutureLIZ;
            EcSearchSugResponse ecSearchSugResponse = listenableFutureLIZ.get();
            if (!c0qtx.LJI) {
                c0qtx.LJ.LJ = Long.valueOf(System.currentTimeMillis());
                ecSearchSugResponse.getClass();
                ecSearchSugResponse.LLILLJJLI = str2;
                ecSearchSugResponse.LLILZ = c0qtx.LJ;
                if (!Intrinsics.LJFF(c668220QIy, c668220QIy2)) {
                    c668220QIy.LIZLLL = System.currentTimeMillis();
                }
                if (!Intrinsics.LJFF(c668220QIy, c668220QIy2)) {
                    c668220QIy.LJ = ecSearchSugResponse;
                }
                synchronized (this.LLJI) {
                    while (!this.LLJI.isEmpty()) {
                        try {
                            C0QTX c0qtx2 = (C0QTX) ((LinkedList) this.LLJI).pollFirst();
                            if (c0qtx2.LIZ < c0qtx.LIZ) {
                                c0qtx2.LJI = true;
                                ListenableFuture<EcSearchSugResponse> listenableFuture = c0qtx2.LJFF;
                                if (listenableFuture != null) {
                                    listenableFuture.cancel(true);
                                }
                            }
                            if (c0qtx2.LIZ == c0qtx.LIZ) {
                                break;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                if (C670890QTf.LIZIZ()) {
                    C670890QTf.LIZJ.add(new C670880QTe(str2, ecSearchSugResponse));
                }
                LLJLILLLLZIIL(ecSearchSugResponse, false, "sug_show_success", j);
                return;
            }
            throw new CancellationException();
        }
        throw new CancellationException();
    }

    @Override // X.C0QTB
    public final void LLZZ(SearchSugEntity searchSugEntity) {
        Iterator<Map.Entry<String, EcSearchSugResponse>> it2 = this.LLILZIL.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator<SearchSugEntity> it3 = it2.next().getValue().sugList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    SearchSugEntity next = it3.next();
                    if (next.LIZJ() && Intrinsics.LJFF(next.content, searchSugEntity.content)) {
                        it2.remove();
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

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    @Override // X.C0QTB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(X.C670840QTa r20, boolean r21, long r22) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QTU.f0(X.0QTa, boolean, long):void");
    }

    public C0QTU(View view, C19EG c19eg, InterfaceC497601wk interfaceC497601wk, C0QT4 c0qt4) {
        this.LL = view;
        this.LLILLJJLI = c19eg;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = c0qt4;
        C670940QTk.LIZ.getClass();
        this.LLILZLL = ((EcSearchSugOptimizeConfig) C670940QTk.LIZJ.getValue()).enableSugCacheBaseWord;
        C670800QSw.LIZ.getClass();
        C01GW c01gw = C670800QSw.LIZJ;
        int i = ((EcSearchSugRequestCancelQueueConfig) c01gw.getValue()).maxParallelCount;
        this.LLIZ = i < 1 ? 1 : i;
        int i2 = ((EcSearchSugRequestCancelQueueConfig) c01gw.getValue()).maxQueueSize;
        this.LLIZLLLIL = i2 >= 1 ? i2 : 1;
        this.LLJI = new LinkedList();
        this.LLJIJIL = new ArrayDeque<>();
        this.LLJILJIL = new AtomicInteger(0);
    }

    public final void LLJLILLLLZIIL(EcSearchSugResponse ecSearchSugResponse, boolean z, String str, long j) {
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
