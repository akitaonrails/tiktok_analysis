package X;

import Y.ARunnableS113S0100000_13;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VWH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VWH implements InterfaceC1602960roc {
    public final String LIZ;
    public C0VWC LIZIZ;
    public C0VWC LIZJ;
    public final C0VWL LIZLLL;
    public final ARunnableS113S0100000_13 LJ;
    public volatile boolean LJFF;

    @Override // X.InterfaceC1602960roc
    public final void LJIIIIZZ() {
        this.LIZJ = null;
    }

    @Override // X.InterfaceC1602960roc
    public final void start() {
        String str = this.LIZ;
        C0VWW.LJFF(str, new C0VWZ("metric_type_default", str));
        C314640CVa.LIZ(this.LIZ);
        C798520VUc.LIZIZ(this.LIZ);
    }

    @Override // X.InterfaceC1602960roc
    public final void stop() {
        C314640CVa.LIZLLL(this.LIZ);
        C798520VUc.LIZJ(this.LIZ);
        String str = this.LIZ;
        C0VWW.LJFF(str, new C0VWY("metric_type_default", str));
    }

    @Override // X.InterfaceC1602960roc
    public final void LJI() {
        start();
        C2487409ou.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL, new ARunnableS113S0100000_13(this, 175));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0VWL, java.lang.Object] */
    public C0VWH(String str) {
        this.LIZ = str;
        ?? r2 = new InterfaceC798590VUj() { // from class: X.0VWL
            @Override // X.InterfaceC798590VUj
            public final void LJIIJ(String str2) {
                if (Intrinsics.LJFF(str2, this.LIZ.LIZ)) {
                    C0VWC c0vwc = this.LIZ.LIZIZ;
                    if (c0vwc != null) {
                        c0vwc.LJIIJ(str2);
                    }
                    C0VWC c0vwc2 = this.LIZ.LIZJ;
                    if (c0vwc2 != null) {
                        c0vwc2.LJIIJ(str2);
                    }
                }
            }

            @Override // X.InterfaceC798590VUj
            public final void onStop(String str2) {
                if (Intrinsics.LJFF(str2, this.LIZ.LIZ)) {
                    C0VWC c0vwc = this.LIZ.LIZIZ;
                    if (c0vwc != null) {
                        c0vwc.onStop(str2);
                    }
                    C0VWC c0vwc2 = this.LIZ.LIZJ;
                    if (c0vwc2 != null) {
                        c0vwc2.onStop(str2);
                    }
                }
            }
        };
        this.LIZLLL = r2;
        try {
            C1957307lb c1957307lb = C798520VUc.LIZLLL;
            c1957307lb = c1957307lb == null ? null : c1957307lb;
            synchronized (c1957307lb) {
                try {
                    ((ArrayList) c1957307lb.LLILLJJLI).add(r2);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
        this.LJ = new ARunnableS113S0100000_13(this, 174);
    }

    @Override // X.InterfaceC1602960roc
    public final void LIZIZ(RecyclerView recyclerView) {
        if (!TextUtils.equals(this.LIZ, "user_profile")) {
            C582550Mt3.LIZ = this.LIZ;
        }
        final String str = this.LIZ;
        if (recyclerView != null) {
            if (str != null) {
                recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0VUl
                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                        if (i != 0) {
                            if (i != 1) {
                                C798520VUc.LIZIZ(str);
                                return;
                            } else {
                                C798520VUc.LIZIZ(str);
                                return;
                            }
                        }
                        C798520VUc.LIZJ(str);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("param scene is null");
        }
        throw new IllegalArgumentException("param recyclerView is null");
    }

    @Override // X.InterfaceC1602960roc
    public final void LIZJ(long j) {
        C2487409ou.LIZLLL(j, new ARunnableS113S0100000_13(this, 176));
    }

    @Override // X.InterfaceC1602960roc
    public final InterfaceC1602960roc LIZLLL(C0OQN c0oqn) {
        this.LIZIZ = c0oqn;
        return this;
    }

    @Override // X.InterfaceC1602960roc
    public final void LJFF(AbstractC1616220sA0 abstractC1616220sA0) {
        C582550Mt3.LIZ = this.LIZ;
        if (abstractC1616220sA0 != null) {
            abstractC1616220sA0.LIZJ(new C0SNZ() { // from class: X.0VWK
                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            this.LL.start();
                            return;
                        } else {
                            this.LL.start();
                            C800880VbK.LIZIZ(this.LL.LIZ);
                            return;
                        }
                    }
                    this.LL.stop();
                    C800880VbK.LIZ();
                }
            });
        }
    }

    @Override // X.InterfaceC1602960roc
    public final void LJII(VerticalViewPager verticalViewPager) {
        if (!((Boolean) C275040AqE.LIZ.getValue()).booleanValue()) {
            return;
        }
        C582550Mt3.LIZ = this.LIZ;
        if (verticalViewPager != null) {
            verticalViewPager.LIZJ(new C0SNZ() { // from class: X.0VWI
                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            C0VWH c0vwh = this.LL;
                            c0vwh.stop();
                            if (c0vwh.LJFF) {
                                c0vwh.LJFF = false;
                                C2487409ou.LIZ(c0vwh.LJ);
                                return;
                            }
                            return;
                        }
                        C0VWH c0vwh2 = this.LL;
                        c0vwh2.stop();
                        if (!c0vwh2.LJFF) {
                            return;
                        }
                        c0vwh2.LJFF = false;
                        C2487409ou.LIZ(c0vwh2.LJ);
                        return;
                    }
                    C0VWH c0vwh3 = this.LL;
                    c0vwh3.start();
                    C2487409ou.LIZLLL(((Number) C275240AqY.LIZ.getValue()).longValue(), c0vwh3.LJ);
                    c0vwh3.LJFF = true;
                }
            });
        }
    }

    @Override // X.InterfaceC1602960roc
    public final void LJIIIZ(ViewPager viewPager) {
        final String str = this.LIZ;
        C582550Mt3.LIZ = str;
        if (viewPager != null) {
            if (str != null) {
                viewPager.addOnPageChangeListener(new C0SNZ() { // from class: X.0VWM
                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i) {
                        if (i != 0) {
                            if (i != 1) {
                                C798520VUc.LIZIZ(str);
                                return;
                            } else {
                                C798520VUc.LIZIZ(str);
                                return;
                            }
                        }
                        C798520VUc.LIZJ(str);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("param scene is null");
        }
        throw new IllegalArgumentException("param viewPager is null");
    }

    @Override // X.InterfaceC1602960roc
    public final InterfaceC1602960roc LJIIJ(C0VWC c0vwc) {
        this.LIZJ = c0vwc;
        return this;
    }

    @Override // X.InterfaceC1602960roc
    public final InterfaceC1602960roc LIZ(String str, String str2) {
        C798520VUc.LIZ(this.LIZ, str, str2);
        return this;
    }

    @Override // X.InterfaceC1602960roc
    public final InterfaceC1602960roc LJIIJJI(Object obj, String str) {
        if (obj instanceof String) {
            C798520VUc.LIZ(this.LIZ, str, (String) obj);
        }
        return this;
    }

    @Override // X.InterfaceC1602960roc
    public final void LJ(final VerticalViewPager verticalViewPager, final Function0 function0, final Function0 function02, final Function0 function03) {
        C582550Mt3.LIZ = this.LIZ;
        if (verticalViewPager != null) {
            verticalViewPager.LIZJ(new C360660ECa() { // from class: X.0VWJ
                @Override // X.C360660ECa, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (function03.invoke().booleanValue()) {
                                Function0<Unit> function04 = function0;
                                if (function04 != null) {
                                    function04.invoke();
                                    return;
                                }
                                return;
                            }
                            verticalViewPager.LIZLLL(this);
                            return;
                        }
                        if (function03.invoke().booleanValue()) {
                            Function0<Unit> function05 = function0;
                            if (function05 != null) {
                                function05.invoke();
                            }
                        } else {
                            verticalViewPager.LIZLLL(this);
                        }
                        C800880VbK.LIZIZ(this.LIZ);
                        return;
                    }
                    if (function03.invoke().booleanValue()) {
                        Function0<Unit> function06 = function02;
                        if (function06 != null) {
                            function06.invoke();
                        }
                    } else {
                        verticalViewPager.LIZLLL(this);
                    }
                    C800880VbK.LIZ();
                }
            });
        }
    }
}
