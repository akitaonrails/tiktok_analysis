package X;

import Y.AObserverS226S0100000_24;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14Td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20270314Td {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final InterfaceC20270614Tg LIZ;
    public final String LIZIZ;
    public final LifecycleOwner LIZJ;
    public final LiveData<C0ZPH> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function2<Boolean, Boolean, Unit> LJFF;
    public final Function1<String, Unit> LJI;
    public final Function0<Unit> LJII;
    public boolean LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public C1292030jj7<C1294720jnS> LJIIJ;
    public C20308914dL LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public volatile Boolean LJIILJJIL;
    public final AObserverS226S0100000_24 LJIILL = new AObserverS226S0100000_24(this, 10);
    public final LifecycleEventObserver LJIILLIIL = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.story.avatar.preload.StoryAvatarPreloadAnimator$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.LL.LIZ("lifecycle_destroy");
            }
        }
    };

    public final boolean LIZJ() {
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return true;
        }
        this.LJIIL = false;
        C1608950ryH c1608950ryHLIZIZ = C1606010rtX.LIZIZ.LIZIZ();
        if (c1608950ryHLIZIZ == null) {
            LIZ(null);
            return false;
        }
        C1292030jj7<C1294720jnS> c1292030jj7LIZ = C19469211Fa.LIZ(c1608950ryHLIZIZ.LIZ, c1608950ryHLIZIZ.LIZIZ);
        this.LJIIJ = c1292030jj7LIZ;
        if (c1292030jj7LIZ == null) {
            LIZ(null);
            return false;
        }
        this.LJ.invoke();
        if (this.LIZ.LIZLLL()) {
            C20308914dL c20308914dL = new C20308914dL(this, 0);
            this.LJIIJJI = c20308914dL;
            C1292030jj7<C1294720jnS> c1292030jj7 = this.LJIIJ;
            if (c1292030jj7 != null) {
                c1292030jj7.LIZIZ(c20308914dL);
            }
        } else if (!this.LJIIIIZZ) {
            this.LJIIIIZZ = true;
            this.LIZ.LIZJ();
        }
        this.LIZLLL.observe(this.LIZJ, this.LJIILL);
        this.LIZJ.getLifecycle().addObserver(this.LJIILLIIL);
        this.LJIIIZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZJ), C2153208c6.LIZ().LIZJ, null, new C420001kE(this, null), 2);
        return true;
    }

    public final void LIZ(String str) {
        C1292030jj7<C1294720jnS> c1292030jj7;
        Function1<String, Unit> function1;
        if (this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        if (str != null && !this.LJIILIIL && (function1 = this.LJI) != null) {
            function1.invoke(str);
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIIZ = null;
        try {
            this.LIZLLL.removeObserver(this.LJIILL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            this.LIZJ.getLifecycle().removeObserver(this.LJIILLIIL);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C20308914dL c20308914dL = this.LJIIJJI;
        if (c20308914dL != null && (c1292030jj7 = this.LJIIJ) != null) {
            c1292030jj7.LJII(c20308914dL);
        }
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJII.invoke();
        if (this.LJIIIIZZ) {
            this.LJIIIIZZ = false;
            this.LIZ.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Sfn, X.14Tf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0Sfn] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0Sfn] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.14Tf] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20270314Td.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public C20270314Td(LifecycleOwner lifecycleOwner, MutableLiveData mutableLiveData, InterfaceC20270614Tg interfaceC20270614Tg, String str, Function0 function0, AwS574S0100000_30 awS574S0100000_30, Function1 function1, Function2 function2) {
        this.LIZ = interfaceC20270614Tg;
        this.LIZIZ = str;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = mutableLiveData;
        this.LJ = function0;
        this.LJFF = function2;
        this.LJI = function1;
        this.LJII = awS574S0100000_30;
    }
}
