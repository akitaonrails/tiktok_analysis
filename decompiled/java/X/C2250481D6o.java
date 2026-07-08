package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxError;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1D6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250481D6o {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Context LIZ;
    public final C2250491D6p<C1537720q7O> LIZIZ;
    public final CopyOnWriteArrayList<C1537720q7O> LIZJ;

    public final void LIZ() {
        C2250491D6p<C1537720q7O> c2250491D6p = this.LIZIZ;
        c2250491D6p.LJFF = true;
        synchronized (C2250491D6p.LJIIIIZZ) {
            try {
                c2250491D6p.LJ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c2250491D6p.LIZJ.evictAll();
        c2250491D6p.LIZLLL.evictAll();
        for (C1537720q7O c1537720q7O : this.LIZJ) {
            if (!c1537720q7O.LLJLIL) {
                c1537720q7O.LLD(true);
            }
        }
        this.LIZJ.clear();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0qbj] */
    public C2250481D6o(Context context) {
        ExecutorService executorService;
        this.LIZ = context;
        ?? r1 = new Object() { // from class: X.0qbj
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Builder{lruSize=");
                sbLIZ.append(10);
                sbLIZ.append(", enableUseCreateExecutor=");
                sbLIZ.append(true);
                sbLIZ.append(", enableUseLoadExecutor=");
                sbLIZ.append(true);
                sbLIZ.append(", slidingWindowsSize=");
                sbLIZ.append(5);
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
        C2250531D6t c2250531D6t = C2250541D6u.LIZ;
        LynxLog.d("LynxAsyncManager", r1.toString());
        C2250491D6p<C1537720q7O> c2250491D6p = new C2250491D6p<>(r1);
        synchronized (c2250531D6t) {
            if (c2250531D6t.LIZ == null) {
                Executor executorLIZ = C1301610jyZ.LIZ();
                if (executorLIZ instanceof ExecutorService) {
                    c2250531D6t.LIZ = (ExecutorService) executorLIZ;
                }
            }
            executorService = c2250531D6t.LIZ;
        }
        if (c2250491D6p.LJII == null) {
            c2250491D6p.LJII = executorService;
        } else {
            LynxLog.e("LynxAsyncManager", "mLoadExecutor has been set.");
        }
        this.LIZIZ = c2250491D6p;
        this.LIZJ = new CopyOnWriteArrayList<>();
    }

    public final C1537720q7O LIZJ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC647710Par interfaceC647710ParLIZLLL = this.LIZIZ.LIZLLL(str);
        if (interfaceC647710ParLIZLLL != null && interfaceC647710ParLIZLLL.getLynxView() != null) {
            interfaceC647710ParLIZLLL.getLynxView().processRender();
        } else {
            interfaceC647710ParLIZLLL = null;
        }
        C1537720q7O c1537720q7O = (C1537720q7O) interfaceC647710ParLIZLLL;
        if (c1537720q7O == null) {
            LIZLLL("render", "empty", null, str);
            return c1537720q7O;
        }
        C1530570pvr.LIZJ(c1537720q7O.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_CONSUME_PRE_RESULT}, Long.valueOf(jCurrentTimeMillis));
        c1537720q7O.LJJIII(null);
        C1537720q7O.LJJIIZ(c1537720q7O, 2);
        LIZLLL("render", "succeed", c1537720q7O.getHybridContext(), str);
        return c1537720q7O;
    }

    public static void LIZLLL(String str, String str2, C1537480q70 c1537480q70, String str3) {
        String str4;
        String strLJIJI;
        String str5 = null;
        if (c1537480q70 != null) {
            str4 = c1537480q70.containerId;
            strLJIJI = c1537480q70.LJIJI();
            str5 = c1537480q70.bid;
        } else {
            str4 = null;
            strLJIJI = null;
        }
        C1520080pew.LJFF(str4, "lynx_async_prelayout", str, null, strLJIJI, str5, str3, str2, 8);
    }

    public final void LIZIZ(final String str, final C1537720q7O c1537720q7O, boolean z, final InterfaceC2250511D6r<C1537720q7O> interfaceC2250511D6r) {
        this.LIZJ.add(c1537720q7O);
        C1530570pvr.LJFF(c1537720q7O.getHybridContext(), EnumC1537150q6T.OPT_PRE_LAYOUT_STATUS, 1);
        this.LIZIZ.LIZJ(str, c1537720q7O, new C2250501D6q(z), new InterfaceC2250511D6r<C1537720q7O>() { // from class: X.1D6n
            @Override // X.InterfaceC2250511D6r
            public final void LIZ(C0Q8K c0q8k, LynxError lynxError) {
                C2250481D6o c2250481D6o = this.LIZ;
                C1537480q70 hybridContext = c1537720q7O.getHybridContext();
                String str2 = str;
                c2250481D6o.getClass();
                C2250481D6o.LIZLLL("layout", "error", hybridContext, str2);
                InterfaceC2250511D6r<C1537720q7O> interfaceC2250511D6r2 = interfaceC2250511D6r;
                if (interfaceC2250511D6r2 != null) {
                    interfaceC2250511D6r2.LIZ(c0q8k, lynxError);
                }
            }

            @Override // X.InterfaceC2250511D6r
            public final void LIZIZ(InterfaceC647710Par interfaceC647710Par, String str2) {
                C2250481D6o c2250481D6o = this.LIZ;
                C1537480q70 hybridContext = c1537720q7O.getHybridContext();
                c2250481D6o.getClass();
                C2250481D6o.LIZLLL("layout", "succeed", hybridContext, str2);
                InterfaceC2250511D6r<C1537720q7O> interfaceC2250511D6r2 = interfaceC2250511D6r;
                if (interfaceC2250511D6r2 != null) {
                    interfaceC2250511D6r2.LIZIZ(interfaceC647710Par, str2);
                }
            }
        });
    }
}
