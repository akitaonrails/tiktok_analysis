package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0YEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870840YEg {
    public final ConcurrentHashMap<Integer, WeakReference<RunnableC872360YKc>> LIZ = new ConcurrentHashMap<>();
    public final C0YFA LIZIZ = new C0YFA(this);
    public final InterfaceC863730XuV LIZJ;
    public final C872370YKd LIZLLL;
    public final C0YLL LJ;
    public final C868780Y6i LJFF;
    public C0YJA LJI;
    public C870460YCu LJII;

    public final void LIZ() {
        try {
            Iterator<WeakReference<RunnableC872360YKc>> it2 = this.LIZ.values().iterator();
            while (it2.hasNext()) {
                RunnableC872360YKc runnableC872360YKc = it2.next().get();
                C868780Y6i c868780Y6i = this.LJFF;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Task clean task ");
                sbLIZ.append(runnableC872360YKc);
                c868780Y6i.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (runnableC872360YKc != null) {
                    runnableC872360YKc.LLILZIL.removeMessages(100001);
                    runnableC872360YKc.LLILZIL.removeMessages(100003);
                }
            }
            this.LIZ.clear();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJ.LJ(e);
        }
    }

    public final <T> void LIZIZ(InterfaceC872410YKh<T> interfaceC872410YKh, InterfaceC864800XwE<T> interfaceC864800XwE) {
        LIZJ(interfaceC872410YKh, interfaceC864800XwE, false, this.LIZLLL.LIZIZ());
    }

    public C870840YEg(InterfaceC863730XuV interfaceC863730XuV, C872370YKd c872370YKd, C0YLL c0yll, C868780Y6i c868780Y6i) {
        this.LIZJ = interfaceC863730XuV;
        this.LIZLLL = c872370YKd;
        this.LJ = c0yll;
        this.LJFF = c868780Y6i;
    }

    public final <T> void LIZJ(InterfaceC872410YKh<T> interfaceC872410YKh, InterfaceC864800XwE<T> interfaceC864800XwE, boolean z, Executor executor) {
        boolean zIsLogin = this.LIZJ.isLogin();
        if (zIsLogin) {
            RunnableC872360YKc runnableC872360YKc = new RunnableC872360YKc(this.LJFF, this.LJ, this.LJI, this.LIZLLL, this.LIZJ.LJIIIZ().LJJIIJZLJL, interfaceC872410YKh, interfaceC864800XwE, executor, this.LIZIZ);
            runnableC872360YKc.LJFF();
            this.LIZ.put(Integer.valueOf(hashCode()), new WeakReference<>(runnableC872360YKc));
            return;
        }
        C870460YCu c870460YCu = this.LJII;
        if (c870460YCu != null) {
            C0YJ9 c0yj9 = new C0YJ9(c870460YCu.LIZJ);
            c0yj9.LIZJ("im_sdk_execute_task_not_login");
            c0yj9.LJ(1.0f);
        }
        C868780Y6i c868780Y6i = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Task execute not start, isLogin:");
        sbLIZ.append(zIsLogin);
        c868780Y6i.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (!z || interfaceC864800XwE == null) {
            return;
        }
        interfaceC864800XwE.LIZ(null);
    }
}
