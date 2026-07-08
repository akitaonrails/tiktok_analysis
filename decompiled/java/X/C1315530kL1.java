package X;

import Y.ARunnableS96S0000000_20;
import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0kL1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315530kL1 {
    public static volatile C1315530kL1 LJIIJ;
    public Application LIZ;
    public InterfaceC1315110kKL LIZIZ;
    public C1317780kOe LJFF;
    public SharedPreferences LJI;
    public String LJII;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final List<C1313970kIV> LIZLLL = new ArrayList();
    public InputMethodManager LJ = null;
    public final boolean LJIIIIZZ = true;
    public C1317340kNw LJIIIZ = null;

    public final synchronized List<C1313970kIV> LIZ() {
        ArrayList arrayList;
        synchronized (this.LIZLLL) {
            try {
                arrayList = new ArrayList(this.LIZLLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final synchronized C1317780kOe LIZIZ() {
        return this.LJFF;
    }

    static {
        if (C1315620kLA.LIZ) {
            return;
        }
        C1315620kLA.LIZ = true;
    }

    public static C1315530kL1 LJ() {
        if (LJIIJ == null) {
            synchronized (C1315530kL1.class) {
                try {
                    if (LJIIJ == null) {
                        LJIIJ = new C1315530kL1();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIJ;
    }

    public final void LIZLLL() {
        synchronized (this.LIZLLL) {
            try {
                ((ArrayList) this.LIZLLL).addAll(new InterfaceC1315110kKL() { // from class: X.0kL2
                    @Override // X.InterfaceC1315110kKL
                    public final List<C1313970kIV> create() {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C1313970kIV() { // from class: X.0kKz
                            @Override // X.C1313970kIV
                            public final C1314650kJb LIZ(AbstractC1317090kNX abstractC1317090kNX) {
                                return new C1314650kJb(abstractC1317090kNX);
                            }

                            @Override // X.C1313970kIV
                            public final AbstractC1313520kHm LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
                                return new C1299030juP(abstractC1317090kNX);
                            }
                        });
                        arrayList.add(new C1313970kIV() { // from class: X.0kL0
                            @Override // X.C1313970kIV
                            public final C1314650kJb LIZ(AbstractC1317090kNX abstractC1317090kNX) {
                                return new C1314650kJb(abstractC1317090kNX);
                            }

                            @Override // X.C1313970kIV
                            public final AbstractC1313520kHm LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
                                return new C1314690kJf(abstractC1317090kNX);
                            }
                        });
                        return arrayList;
                    }
                }.create());
                InterfaceC1315110kKL interfaceC1315110kKL = this.LIZIZ;
                if (interfaceC1315110kKL != null) {
                    ((ArrayList) this.LIZLLL).addAll(interfaceC1315110kKL.create());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final synchronized void LIZJ(Application application, C1315550kL3 c1315550kL3) {
        if (this.LIZJ.get()) {
            return;
        }
        this.LIZJ.set(true);
        if (!C1315630kLB.LIZ) {
            C1315630kLB.LIZ = true;
        }
        this.LIZ = application;
        this.LIZIZ = c1315550kL3;
        LIZLLL();
        if (!C1315640kLC.LIZ) {
            C1315640kLC.LIZ = true;
            C1314100kIi.LIZ().execute(new ARunnableS96S0000000_20(6));
            C1314100kIi.LIZ().execute(new ARunnableS96S0000000_20(7));
            C1314100kIi.LIZ().execute(new ARunnableS96S0000000_20(8));
        }
        C1314100kIi.LIZ().execute(new RunnableC514801zW(LIZ(), 113));
        this.LJFF = new C1317780kOe(C786410Ut5.M3(application));
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(application, 0, "sdui_prefs");
        this.LJI = sharedPreferencesLIZJ;
        String string = sharedPreferencesLIZJ.getString("client_id", null);
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            this.LJI.edit().putString("client_id", string).apply();
        }
        this.LJII = string;
    }
}
