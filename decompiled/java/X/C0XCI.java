package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.bdinstall.BDInstallProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XCI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCI implements InterfaceC844530XBb {
    public static final Map<String, C0XCI> LJIIL = new ConcurrentHashMap();
    public volatile C844770XBz LIZ;
    public volatile C0XCW LIZIZ;
    public final C0XCL LIZJ = new C0XCL();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final C0XBT LJFF = new AbstractC824140WUq<C0XCU>() { // from class: X.0XBT
        @Override // X.AbstractC824140WUq
        public final C0XCU LIZ(Object[] objArr) {
            if (C2123908Tt.LIZLLL((Context) objArr[0])) {
                C844710XBt c844710XBt = new C844710XBt(this.LIZJ);
                Context contextN3 = (Context) objArr[0];
                if (!(contextN3 instanceof Application) && contextN3 != null) {
                    contextN3 = C786410Ut5.N3(contextN3);
                }
                Application application = (Application) contextN3;
                if (application != null && C844710XBt.LJIIIIZZ.compareAndSet(false, true)) {
                    application.registerActivityLifecycleCallbacks(C0XCJ.LIZ);
                }
                c844710XBt.LIZLLL = this.LIZJ.LJIIIIZZ;
                return c844710XBt;
            }
            C0XBR c0xbr = new C0XBR(this.LIZJ);
            c0xbr.LIZIZ = this.LIZJ.LJIIIIZZ;
            return c0xbr;
        }
    };
    public InterfaceC844780XCa LJIIIZ = null;
    public InterfaceC844860XCi LJIIJ = null;
    public final C0XBU LJIIJJI = new AbstractC824140WUq<C0XBN>() { // from class: X.0XBU
        @Override // X.AbstractC824140WUq
        public final C0XBN LIZ(Object[] objArr) {
            C0XBN c0xbnLIZIZ = null;
            try {
                c0xbnLIZIZ = C0XBN.LIZIZ(C810670Vr7.LIZJ((Context) objArr[0], 0, "ug_install_op_pref").getString("install_info", null));
                return c0xbnLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return c0xbnLIZIZ;
            }
        }
    };
    public final C0XCH LJI = new C0XCH(this);
    public final C0XCZ LJII = new C0XCZ();
    public final C0XCK LJIIIIZZ = new C0XCK();

    public final boolean LIZ() {
        if (!this.LIZLLL.get()) {
            this.LJ.set(true);
            return false;
        }
        Context contextLJ = LJ();
        if (contextLJ == null) {
            return false;
        }
        return LIZIZ(contextLJ).LJI();
    }

    public final boolean LIZJ() {
        return this == C0XCJ.LIZIZ || this.LIZ != null;
    }

    public final Integer LIZLLL() {
        if (this.LIZ != null) {
            return Integer.valueOf(this.LIZ.LIZ);
        }
        if (this.LIZIZ != null) {
            return Integer.valueOf(this.LIZIZ.getAid());
        }
        return null;
    }

    public final Context LJ() {
        return (this.LIZ == null || this.LIZ.LIZJ == null) ? (this.LIZIZ == null || this.LIZIZ.getContext() == null) ? BDInstallProvider.LLILZ : this.LIZIZ.getContext() : this.LIZ.LIZJ;
    }

    public final C0XBN LJI() {
        if (this.LIZ != null && this.LIZ.LIZJ != null) {
            return LIZIZ(this.LIZ.LIZJ).LJIIIZ();
        }
        C844830XCf.LIZIZ("BDInstall#getInstallInfo error, not init yet!");
        Context contextLJ = LJ();
        if (contextLJ == null) {
            return null;
        }
        return LIZIZ(contextLJ);
    }

    public static C0XCI LJII(String str) {
        return (C0XCI) ((ConcurrentHashMap) LJIIL).get(str);
    }

    public final boolean LJFF(JSONObject jSONObject) {
        Context contextLJ = LJ();
        if (contextLJ == null) {
            return false;
        }
        try {
            return LIZIZ(contextLJ).LJ(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public final void LIZIZ(boolean z, C0XD6 c0xd6) {
        this.LJIIIIZZ.LIZIZ(z, new C844790XCb(c0xd6));
    }

    public final C0XCI LJIIIIZZ(C844770XBz c844770XBz, C844630XBl c844630XBl) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJIIL;
        if (!concurrentHashMap.containsKey(String.valueOf(c844770XBz.LIZ))) {
            concurrentHashMap.put(String.valueOf(c844770XBz.LIZ), this);
            if (this == C0XCJ.LIZIZ) {
                z = true;
            } else {
                z = false;
            }
            c844770XBz.LJJIIZ = z;
            this.LIZ = c844770XBz;
            LIZIZ(c844770XBz.LIZJ).LJIIJJI(c844770XBz, c844630XBl);
            this.LIZLLL.set(true);
            if (this.LJ.get()) {
                LIZ();
            }
        }
        return this;
    }

    public final void LJIIJ(String str, String str2) {
        LIZIZ(this.LIZ.LIZJ).LJIILIIL(str, str2);
    }

    public final void LJIIIZ(Context context, C844630XBl c844630XBl, long j, InterfaceC845020XCy interfaceC845020XCy) {
        Context contextLJ = LJ();
        if (contextLJ == null) {
            return;
        }
        LIZIZ(contextLJ).LIZLLL(c844630XBl, j, interfaceC845020XCy);
    }
}
