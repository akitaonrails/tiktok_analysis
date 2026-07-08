package X;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0d3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035690d3f implements InterfaceC1029720cu2 {
    public final C1035680d3e LL;
    public final C1036000d4A LLILLJJLI;
    public SparkContext LLILLL;
    public final C1035700d3g LLILZ = new C11N2<Boolean>() { // from class: X.0d3g
        @Override // X.InterfaceC626120Oh8
        public final void onComplete() {
        }

        @Override // X.InterfaceC626120Oh8
        public final void onError(Throwable th) {
        }

        @Override // X.InterfaceC626120Oh8
        public final void onNext(Object obj) {
            InterfaceC1036190d4T interfaceC1036190d4T;
            InterfaceC1036110d4L interfaceC1036110d4L;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            SparkContext sparkContext = this.LLILLJJLI.LLILLL;
            if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                interfaceC1036110d4L.LJIILL(zBooleanValue);
            }
            SparkContext sparkContext2 = this.LLILLJJLI.LLILLL;
            if (sparkContext2 != null && (interfaceC1036190d4T = (InterfaceC1036190d4T) sparkContext2.LJFF(InterfaceC1036190d4T.class)) != null) {
                interfaceC1036190d4T.LJIIIIZZ(zBooleanValue);
            }
            if (zBooleanValue) {
                C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "appEnterBackgroundEvent"));
            } else {
                C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "appEnterForegroundEvent"));
            }
        }
    };
    public volatile boolean LLILZIL;

    @Override // X.InterfaceC1036150d4P
    public final void LJJJLZIJ() {
    }

    @Override // X.InterfaceC1036150d4P
    public final boolean onBackPress() {
        return true;
    }

    @Override // X.InterfaceC1036150d4P
    public final void onPause() {
    }

    @Override // X.InterfaceC1036150d4P
    public final void onResume() {
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLLILZ() {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLLILZJ() {
        if (this.LLILZIL) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC1036150d4P
    public final void onDestroy() {
        dispose();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012b A[PHI: r1
      0x012b: PHI (r1v9 java.lang.String) = (r1v8 java.lang.String), (r1v11 java.lang.String) binds: [B:103:0x0128, B:98:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec A[PHI: r1
      0x00ec: PHI (r1v14 java.lang.String) = (r1v13 java.lang.String), (r1v16 java.lang.String) binds: [B:75:0x00e9, B:70:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    @Override // X.InterfaceC1036150d4P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShow() {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1035690d3f.onShow():void");
    }

    @Override // X.InterfaceC1036150d4P
    public final void LIZIZ() {
        C2214201BlK.LIZLLL().LIZIZ(this.LLILZ);
    }

    @Override // X.InterfaceC1036870d5Z
    public final C1036000d4A LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1036870d5Z
    public final C1035680d3e LIZJ() {
        return this.LL;
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLJI(Runnable runnable) {
        C1035680d3e c1035680d3e = this.LL;
        if (c1035680d3e != null) {
            c1035680d3e.LIZIZ = runnable;
        }
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLLIL(String str) {
        C1035680d3e c1035680d3e = this.LL;
        if (c1035680d3e != null) {
            c1035680d3e.LJ(false);
        }
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLLIZZ(SparkContext sparkContext) {
        this.LLILLL = sparkContext;
    }

    @C14EU
    public final void onEvent(C0DQL c0dql) {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        View viewE1;
        WebView webView;
        SparkFragment sparkFragment;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        C1035880d3y c1035880d3y;
        SparkContext sparkContext = this.LLILLL;
        if (sparkContext != null && (c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class)) != null) {
            c1035880d3y.setClickedCloseAll(true);
        }
        C1035680d3e c1035680d3e = this.LL;
        if (c1035680d3e != null) {
            SparkContext sparkContext2 = this.LLILLL;
            if (sparkContext2 != null) {
                interfaceC1059280dfiLJJIJLIJ = sparkContext2.LJJIJLIJ();
            } else {
                interfaceC1059280dfiLJJIJLIJ = null;
            }
            if ((interfaceC1059280dfiLJJIJLIJ instanceof SparkFragment) && (sparkFragment = (SparkFragment) interfaceC1059280dfiLJJIJLIJ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                viewE1 = kitView.e1();
            } else {
                viewE1 = null;
            }
            if (viewE1 instanceof WebView) {
                webView = (WebView) viewE1;
            } else {
                webView = null;
            }
            if (c0dql != null && c0dql.LIZ != 0 && webView != null && c1035680d3e.LIZIZ != null && webView.hashCode() == c0dql.LIZ) {
                c1035680d3e.LIZLLL = webView;
                C1035880d3y c1035880d3y2 = c1035680d3e.LIZJ;
                if (c1035880d3y2 != null) {
                    c1035880d3y2.setClickedCloseAll(true);
                }
                c1035680d3e.LIZJ(null, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0d3g] */
    public C1035690d3f(Context context, C1035680d3e c1035680d3e, View view) {
        this.LLILLJJLI = new C1036000d4A(context, view, 6);
        this.LL = c1035680d3e == null ? new C1035680d3e() : c1035680d3e;
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLLILZLLLI(SparkContext sparkContext, C1016930cZP c1016930cZP, String str, Runnable runnable) {
        C1036000d4A c1036000d4A = this.LLILLJJLI;
        if (c1036000d4A != null) {
            c1036000d4A.LJIIIIZZ(sparkContext, c1016930cZP, str, runnable);
        }
    }
}
