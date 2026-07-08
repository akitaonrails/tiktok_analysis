package X;

import Y.ACallableS421S0100000_14;
import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.publishcheck.CheckManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857230Xk1 {
    public final String LIZ;
    public final int LIZIZ;
    public long LIZLLL;
    public long LJ;
    public AbstractC857240Xk2<?> LJII;
    public boolean LJIIJ;
    public Function0<Unit> LJIILIIL;
    public final ArrayList<AbstractC857240Xk2<?>> LIZJ = new ArrayList<>();
    public final Set<AbstractC857240Xk2<?>> LJFF = new LinkedHashSet();
    public final List<InterfaceC857250Xk3> LJI = new ArrayList();
    public final C857220Xk0 LJIIIIZZ = new C857220Xk0(this);
    public final BPEAHandler LJIIIZ = new BPEAHandler(Looper.getMainLooper());
    public EnumC864300XvQ LJIIJJI = EnumC864300XvQ.NEW;
    public int LJIIL = -1;

    public final void LIZJ() {
        synchronized (this) {
            try {
                EnumC864300XvQ enumC864300XvQ = this.LJIIJJI;
                EnumC864300XvQ enumC864300XvQ2 = EnumC864300XvQ.CANCELED;
                if (enumC864300XvQ != enumC864300XvQ2 && enumC864300XvQ != EnumC864300XvQ.END) {
                    String strLIZJ = "";
                    int i = this.LJIIL;
                    if (i >= 0 && i < this.LIZJ.size()) {
                        strLIZJ = this.LIZJ.get(this.LJIIL).LIZJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("canceled by: ");
                        sbLIZ.append(strLIZJ);
                        sbLIZ.append(", total time: ");
                        sbLIZ.append(System.currentTimeMillis() - this.LIZLLL);
                        LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                        C350801Xu c350801Xu = C350801Xu.LIZ;
                        String str = this.LIZ;
                        long j = this.LIZLLL;
                        boolean z = this.LJIIJ;
                        c350801Xu.getClass();
                        C350801Xu.LIZ(j, str, strLIZJ, z);
                    }
                    this.LJIIJJI = enumC864300XvQ2;
                    Iterator it2 = ((ArrayList) this.LJI).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC857250Xk3) it2.next()).LIZJ(strLIZJ);
                    }
                    CheckManager.LIZ.LIZLLL(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF() {
        synchronized (this) {
            try {
                if (this.LJIIJJI != EnumC864300XvQ.NEW) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start: click in illegal state: ");
                    sbLIZ.append(this.LJIIJJI);
                    LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("check start, checker: ");
                sbLIZ2.append(this.LIZ);
                LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                Iterator it2 = ((ArrayList) this.LJI).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC857250Xk3) it2.next()).LJFF();
                }
                this.LJFF.clear();
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.LIZLLL = jCurrentTimeMillis;
                this.LJ = jCurrentTimeMillis;
                this.LJIIJJI = EnumC864300XvQ.RUNNING;
                this.LJIIL = -1;
                for (AbstractC857240Xk2<?> abstractC857240Xk2 : this.LIZJ) {
                    abstractC857240Xk2.getClass();
                    abstractC857240Xk2.LLILLJJLI = new MutableLiveData<>();
                    abstractC857240Xk2.LLILLL = new MutableLiveData<>(Boolean.FALSE);
                    C15O7.LIZJ(new ACallableS421S0100000_14(abstractC857240Xk2, 0));
                }
                C350801Xu c350801Xu = C350801Xu.LIZ;
                String str = this.LIZ;
                long j = this.LIZLLL;
                c350801Xu.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("checker_name", str);
                c2344009Gk.LIZLLL(j, "start_time");
                C20684815ws.LJIILLIIL("tool_performance_publish_check_start", c2344009Gk.LIZ);
                this.LJIIIIZZ.LIZ(null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LIZIZ() {
        EnumC864300XvQ enumC864300XvQ = this.LJIIJJI;
        if (enumC864300XvQ != EnumC864300XvQ.RUNNING && enumC864300XvQ != EnumC864300XvQ.PENDING) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LIZLLL <= this.LIZIZ) {
            return false;
        }
        int i = this.LJIIL;
        if (i >= 0 && i < this.LIZJ.size()) {
            LIZLLL("time out by: " + ((AbstractC857240Xk2) ListProtector.get(this.LIZJ, this.LJIIL)).LIZJ() + ", total time: " + (jCurrentTimeMillis - this.LIZLLL));
        }
        this.LJIIJ = true;
        LIZJ();
        return true;
    }

    public static void LIZLLL(String str) {
        C201955140j.LIZIZ("PublishCheckerLog", str);
    }

    public final void LIZ(AbstractC857240Xk2 abstractC857240Xk2) {
        int size = this.LIZJ.size();
        if (abstractC857240Xk2 != null && this.LJIIJJI == EnumC864300XvQ.NEW) {
            abstractC857240Xk2.LL = this;
            if (size > this.LIZJ.size() - 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addCheck: ");
                sbLIZ.append(abstractC857240Xk2.LIZJ());
                LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZJ.add(abstractC857240Xk2);
                return;
            }
            if (size < 0) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addCheck: ");
            sbLIZ2.append(abstractC857240Xk2.LIZJ());
            sbLIZ2.append(", index: ");
            sbLIZ2.append(size);
            LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            ListProtector.add(this.LIZJ, size, abstractC857240Xk2);
        }
    }

    public final void LJ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LJIIIZ, new ARunnableS106S0100000_6((Function0) function0, 103));
        }
    }

    public C857230Xk1(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
