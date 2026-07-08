package X;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204041BNy extends C2204051BNz {
    public final ConcurrentLinkedQueue<C1BO6> LJIJ;
    public volatile WeakReference<View> LJIJI;
    public final C1BP6 LJIJJ;
    public final boolean LJIJJLI;
    public final AtomicBoolean LJIL;
    public final AtomicBoolean LJJ;
    public final AtomicBoolean LJJI;
    public final AtomicBoolean LJJIFFI;
    public final AtomicBoolean LJJII;
    public volatile InterfaceC2204171BOl LJJIII;

    public final View LJI() {
        if (this.LJIJI != null) {
            return this.LJIJI.get();
        }
        return null;
    }

    public final void LJII() {
        if (this.LJJII.get()) {
            C1BPP.LIZ("[Runtime] call initialize after release.");
            return;
        }
        if (!this.LJIL.compareAndSet(false, true)) {
            C1BPP.LIZ("[Runtime] initialize more than once!");
            return;
        }
        for (C1BO6 c1bo6 : this.LJIJ) {
            try {
                c1bo6.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Runtime] ");
                sbLIZ.append(c1bo6.LIZ());
                sbLIZ.append("initialize error:");
                C1BPP.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), th);
                this.LJIJ.remove(c1bo6);
            }
        }
    }

    public final boolean LJIIIZ() {
        this.LIZLLL.getClass();
        return !Intrinsics.LJFF(r1, Config.LIZIZ);
    }

    @Override // X.C1BOC, X.InterfaceC1542530qF9
    public final void release() {
        if (!this.LJJII.compareAndSet(false, true)) {
            C1BPP.LIZ("[Runtime] release more than once!");
            return;
        }
        if (this.LJJIII != null) {
            this.LJJIII.remove("ctx-pia-runtime");
            this.LJJIII = null;
        }
        super.release();
        Iterator<C1BO6> it2 = this.LJIJ.iterator();
        while (it2.hasNext()) {
            it2.next().release();
        }
        this.LJIJ.clear();
        C1BP6 c1bp6 = this.LJIJJ;
        c1bp6.getClass();
        C1287700jc8.LIZJ(new C1BPZ(c1bp6));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Runtime] release runtime. url=");
        sbLIZ.append(this.LJ);
        C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C1BO6 LJFF(String str) {
        if (this.LJJII.get()) {
            C1BPP.LIZ("[Runtime] call getPlugin after release.");
            return null;
        }
        if (!str.isEmpty()) {
            Object obj = get(str);
            if (obj instanceof C1BO6) {
                return (C1BO6) obj;
            }
        }
        return null;
    }

    public final void LJIIJ(View view) {
        if (this.LJJII.get()) {
            C1BPP.LIZ("[Runtime] call onBindView after release.");
            return;
        }
        if (!this.LJJ.compareAndSet(false, true)) {
            C1BPP.LIZ("[Runtime] onBindView more than once!");
            return;
        }
        if (view instanceof WebView) {
            final C1287750jcD c1287750jcD = this.LJII;
            final WebView webView = (WebView) view;
            c1287750jcD.getClass();
            C1287700jc8.LIZJ(new Runnable() { // from class: X.0jc6
                @Override // java.lang.Runnable
                public final void run() {
                    C1287750jcD c1287750jcD2 = c1287750jcD;
                    WebView webView2 = webView;
                    c1287750jcD2.getClass();
                    C1C7U.LIZ("PiaMetrics@8663.setWebView$1L");
                    c1287750jcD2.LJFF = new WeakReference<>(webView2);
                    C1C7U.LIZIZ("PiaMetrics@8663.setWebView$1L");
                }
            });
        }
        this.LJIJI = new WeakReference<>(view);
        for (C1BO6 c1bo6 : this.LJIJ) {
            try {
                c1bo6.LIZLLL(view);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Runtime] ");
                sbLIZ.append(c1bo6.LIZ());
                sbLIZ.append(" onBindView error:");
                C1BPP.LIZJ(4, C2188811AlT.LIZIZ(sbLIZ), th);
            }
        }
    }

    public final void LJIIIIZZ(Class<? extends C1BO6> cls, Object obj) {
        C1BO6 c1bo6NewInstance;
        if (this.LJIL.get()) {
            C1BPP.LIZ("[Runtime] can not install plugin after initialized!");
            return;
        }
        if (this.LJJII.get()) {
            C1BPP.LIZ("[Runtime] call installPlugin after release.");
            return;
        }
        try {
            if (obj == null) {
                c1bo6NewInstance = cls.getConstructor(C2204041BNy.class).newInstance(this);
            } else {
                c1bo6NewInstance = cls.getConstructor(C2204041BNy.class, obj.getClass()).newInstance(this, obj);
            }
            if (get(c1bo6NewInstance.LIZ()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Runtime] duplicate plugin registered, name=");
                sbLIZ.append(c1bo6NewInstance.LIZ());
                C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            LIZ(c1bo6NewInstance, c1bo6NewInstance.LIZ());
            this.LJIJ.add(c1bo6NewInstance);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[Runtime] install plugin success, name=");
            sbLIZ2.append(c1bo6NewInstance.LIZ());
            C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1BPP.LIZJ(4, "[Runtime] install plugin error:", th);
        }
    }

    public final void LJIIJJI(String str, Object... objArr) {
        if (!this.LJIL.get()) {
            C1BPP.LIZ("[Runtime] can not send event before initialize!");
            return;
        }
        if (this.LJJII.get()) {
            C1BPP.LIZ("[Runtime] can not send event after released!");
            return;
        }
        for (C1BO6 c1bo6 : this.LJIJ) {
            try {
                c1bo6.LJ(str, objArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Runtime] ");
                sbLIZ.append(c1bo6.LIZ());
                sbLIZ.append(" onEvent error:");
                C1BPP.LIZJ(4, C2188811AlT.LIZIZ(sbLIZ), th);
            }
        }
    }

    public C2204041BNy(Uri uri, String str, String str2, Object obj, boolean z, DefaultResourceLoader defaultResourceLoader, InterfaceC1503700pEW interfaceC1503700pEW, String str3, Config config, Map map, C1BOI c1boi) {
        super(uri, str, str2, obj, defaultResourceLoader, interfaceC1503700pEW, str3, config, map, c1boi);
        this.LJIJ = new ConcurrentLinkedQueue<>();
        this.LJIJI = null;
        this.LJIJJ = new C1BP6(C1BP0.Render, this, this.LJI);
        this.LJIL = new AtomicBoolean(false);
        this.LJJ = new AtomicBoolean(false);
        this.LJJI = new AtomicBoolean(false);
        this.LJJIFFI = new AtomicBoolean(false);
        this.LJJII = new AtomicBoolean(false);
        this.LJJIII = null;
        this.LJIJJLI = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Runtime] created runtime. url=");
        sbLIZ.append(uri);
        C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIILJJIL.LIZJ(System.currentTimeMillis(), "initialize.end");
    }
}
