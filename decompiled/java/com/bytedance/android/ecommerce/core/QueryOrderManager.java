package com.bytedance.android.ecommerce.core;

import X.C1724080uxy;
import X.C1724150uy5;
import X.C1724170uy7;
import X.C1C7U;
import X.C2188811AlT;
import X.C898303fB;
import X.C910203h6;
import X.C912203hQ;
import X.C914603ho;
import X.C915403hw;
import X.EnumC934003kw;
import X.InterfaceC1724070uxx;
import X.InterfaceC906703gX;
import X.InterfaceC919903if;
import X.RunnableC823120WQs;
import Y.ARunnableS3S0310000_1;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.ecommerce.core.QueryOrderManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryOrderManager {
    public final WorkHandler LIZ;
    public final C898303fB LIZIZ;
    public final InterfaceC919903if LIZJ;
    public int LIZLLL;
    public long LJ;
    public final C912203hQ LJFF;
    public final boolean LJI;
    public final AtomicBoolean LJII = new AtomicBoolean(false);
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final C915403hw LJIIIZ = new InterfaceC919903if() { // from class: X.03hw
        @Override // X.InterfaceC919903if
        public final void LIZ(C910203h6 c910203h6) {
            boolean z;
            int i;
            boolean z2;
            boolean z3;
            QueryOrderManager queryOrderManager = this.LIZ;
            C912203hQ c912203hQ = queryOrderManager.LJFF;
            if (c912203hQ == null) {
                z = false;
            } else {
                z = c912203hQ.LIZJ;
            }
            if (z) {
                EnumC934003kw enumC934003kw = c910203h6.LJII;
                EnumC934003kw enumC934003kw2 = EnumC934003kw.INIT;
                if (enumC934003kw != enumC934003kw2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && queryOrderManager.LJII.compareAndSet(true, false)) {
                    if (!this.LIZ.LJIIIIZZ.compareAndSet(false, true)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("parallel branch A: final state already handled by another branch, skip. status=");
                        sbLIZ.append(c910203h6.LJII);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("parallel branch A: final state reached, status=");
                    sbLIZ2.append(c910203h6.LJII);
                    sbLIZ2.append(", queryCount=");
                    sbLIZ2.append(this.LIZ.LIZLLL);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    this.LIZ.LIZ.removeMessages(1);
                    QueryOrderManager queryOrderManager2 = this.LIZ;
                    queryOrderManager2.LIZIZ(queryOrderManager2.LIZIZ, c910203h6);
                    this.LIZ.LIZJ.LIZ(c910203h6);
                    return;
                }
                QueryOrderManager queryOrderManager3 = this.LIZ;
                if (queryOrderManager3.LIZLLL >= queryOrderManager3.LIZ() && this.LIZ.LJII.compareAndSet(true, false)) {
                    this.LIZ.LJIIIIZZ.compareAndSet(false, true);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("parallel branch B: max retry reached, queryCount=");
                    sbLIZ3.append(this.LIZ.LIZLLL);
                    sbLIZ3.append(", maxCount=");
                    sbLIZ3.append(this.LIZ.LIZ());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    this.LIZ.LIZ.removeMessages(1);
                    QueryOrderManager queryOrderManager4 = this.LIZ;
                    queryOrderManager4.LIZIZ(queryOrderManager4.LIZIZ, c910203h6);
                    this.LIZ.LIZJ.LIZ(new C910203h6("enable parallel polling, query failed because query order state retry count is to maxRetryCount.", 0));
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("parallel branch C: CAS failed, isFinalState=");
                if (c910203h6.LJII != enumC934003kw2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sbLIZ4.append(z3);
                sbLIZ4.append(", status=");
                sbLIZ4.append(c910203h6.LJII);
                sbLIZ4.append(", queryCount=");
                sbLIZ4.append(this.LIZ.LIZLLL);
                sbLIZ4.append(", isQueryInProgress=");
                sbLIZ4.append(this.LIZ.LJII.get());
                C2188811AlT.LIZIZ(sbLIZ4);
                if (c910203h6.LJII != enumC934003kw2) {
                    if (this.LIZ.LJIIIIZZ.compareAndSet(false, true)) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("parallel branch C2: first late final-state forwarded, status=");
                        sbLIZ5.append(c910203h6.LJII);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        QueryOrderManager queryOrderManager5 = this.LIZ;
                        queryOrderManager5.LIZIZ(queryOrderManager5.LIZIZ, c910203h6);
                        this.LIZ.LIZJ.LIZ(c910203h6);
                        return;
                    }
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("parallel branch C2: duplicate late final-state dropped, status=");
                    sbLIZ6.append(c910203h6.LJII);
                    C2188811AlT.LIZIZ(sbLIZ6);
                    return;
                }
                return;
            }
            if (c910203h6.LJII != EnumC934003kw.INIT) {
                queryOrderManager.LIZIZ(queryOrderManager.LIZIZ, c910203h6);
                this.LIZ.LIZJ.LIZ(c910203h6);
                return;
            }
            if (queryOrderManager.LIZLLL <= queryOrderManager.LIZ()) {
                QueryOrderManager queryOrderManager6 = this.LIZ;
                C912203hQ c912203hQ2 = queryOrderManager6.LJFF;
                if (c912203hQ2 == null || (i = c912203hQ2.LIZ) == 0) {
                    i = 500;
                }
                queryOrderManager6.LIZ.sendEmptyMessageDelayed(1, i);
                return;
            }
            QueryOrderManager queryOrderManager7 = this.LIZ;
            queryOrderManager7.LIZIZ(queryOrderManager7.LIZIZ, c910203h6);
            this.LIZ.LIZJ.LIZ(new C910203h6("not enable parallel polling, query failed because query order state retry count is to maxRetryCount.", 0));
        }
    };

    public final int LIZ() {
        int i;
        C912203hQ c912203hQ = this.LJFF;
        if (c912203hQ == null || (i = c912203hQ.LIZIZ) == 0) {
            return 10;
        }
        return i;
    }

    public final void LIZJ() {
        int i;
        C1724170uy7 c1724170uy7;
        C912203hQ c912203hQ = this.LJFF;
        if (c912203hQ == null || !c912203hQ.LIZJ || this.LJII.get()) {
            this.LIZLLL++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start the ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(" time query");
            C2188811AlT.LIZIZ(sbLIZ);
            C912203hQ c912203hQ2 = this.LJFF;
            if (c912203hQ2 != null) {
                String str = c912203hQ2.LIZLLL;
                List<String> list = c912203hQ2.LJ;
                if (!TextUtils.isEmpty(str) && list != null && list.contains(str) && (c1724170uy7 = C1724150uy5.LJIIL.LIZ) != null) {
                    String str2 = c1724170uy7.LJIIZILJ;
                    if (!TextUtils.isEmpty(str2)) {
                        this.LIZIZ.LJ = str2;
                    }
                }
            }
            InterfaceC906703gX interfaceC906703gXLIZLLL = C1724150uy5.LJIIL.LIZLLL();
            C898303fB c898303fB = this.LIZIZ;
            boolean z = this.LJI;
            C915403hw c915403hw = this.LJIIIZ;
            C914603ho c914603ho = (C914603ho) interfaceC906703gXLIZLLL;
            c914603ho.getClass();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new ARunnableS3S0310000_1(c915403hw, c914603ho, c898303fB, z, 0));
            } else {
                C914603ho.LJFF(c898303fB, z, c915403hw);
            }
            C912203hQ c912203hQ3 = this.LJFF;
            if (c912203hQ3 == null || !c912203hQ3.LIZJ || !this.LJII.get() || this.LIZLLL >= LIZ()) {
                return;
            }
            C912203hQ c912203hQ4 = this.LJFF;
            if (c912203hQ4 == null || (i = c912203hQ4.LIZ) == 0) {
                i = 500;
            }
            this.LIZ.sendEmptyMessageDelayed(1, i);
        }
    }

    public final void LIZLLL() {
        C912203hQ c912203hQ = this.LJFF;
        if (!(c912203hQ == null ? false : c912203hQ.LIZJ) || this.LJII.compareAndSet(false, true)) {
            this.LJIIIIZZ.set(false);
            this.LJ = System.currentTimeMillis();
            this.LIZ.sendEmptyMessage(1);
        }
    }

    public final void LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopQueryTask called, mHasQueryCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mIsQueryInProgress=");
        sbLIZ.append(this.LJII.get());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ.removeCallbacksAndMessages(null);
        this.LJII.set(false);
    }

    public static class WorkHandler extends BPEAHandler {
        public final QueryOrderManager LL;
        public final WeakReference<QueryOrderManager> LLILLJJLI;
        public final boolean LLILLL;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("QueryOrderManager$WorkHandler@dba7.handleMessage");
            super.handleMessage(message);
            if (message.what == 1) {
                if (this.LLILLL) {
                    QueryOrderManager queryOrderManager = this.LLILLJJLI.get();
                    if (queryOrderManager != null) {
                        queryOrderManager.LIZJ();
                    }
                } else {
                    this.LL.LIZJ();
                }
            }
            C1C7U.LIZIZ("QueryOrderManager$WorkHandler@dba7.handleMessage");
        }

        public WorkHandler(QueryOrderManager queryOrderManager, boolean z) {
            super(Looper.getMainLooper());
            this.LLILLL = z;
            if (z) {
                this.LLILLJJLI = new WeakReference<>(queryOrderManager);
            } else {
                this.LL = queryOrderManager;
            }
        }
    }

    public final void LIZIZ(C898303fB c898303fB, C910203h6 c910203h6) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1724070uxx interfaceC1724070uxxLIZIZ = C1724150uy5.LJIIL.LIZIZ();
        c898303fB.getClass();
        String str = c898303fB.LJII;
        EnumC934003kw enumC934003kw = c910203h6.LJII;
        String str2 = c910203h6.LJFF;
        String str3 = c910203h6.LJI;
        int i = this.LIZLLL;
        long j = jCurrentTimeMillis - this.LJ;
        String string = c910203h6.toString();
        C1724080uxy c1724080uxy = (C1724080uxy) interfaceC1724070uxxLIZIZ;
        c1724080uxy.getClass();
        JSONObject jSONObjectLIZ = C1724080uxy.LIZ();
        try {
            jSONObjectLIZ.put("merchant_order_id", (Object) null);
            jSONObjectLIZ.put("param_payment_reference", str);
            jSONObjectLIZ.put("order_status", enumC934003kw.getStatus());
            jSONObjectLIZ.put("error_code", str2);
            jSONObjectLIZ.put("error_message", str3);
            jSONObjectLIZ.put("try_times", i);
            jSONObjectLIZ.put("param_duration", j);
            jSONObjectLIZ.put("param_response_str", string);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1724080uxy.onEventV3("ecommerce_query", jSONObjectLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.03hw] */
    public QueryOrderManager(C898303fB c898303fB, C912203hQ c912203hQ, boolean z, InterfaceC919903if interfaceC919903if) {
        this.LIZIZ = c898303fB;
        this.LIZJ = interfaceC919903if;
        this.LJFF = c912203hQ;
        this.LJI = z;
        this.LIZ = new WorkHandler(this, c912203hQ != null ? c912203hQ.LIZJ : false);
    }
}
