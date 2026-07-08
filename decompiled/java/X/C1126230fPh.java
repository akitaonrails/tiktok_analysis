package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS86S0200000_17;
import android.content.Context;
import android.provider.Settings;
import android.view.View;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS11S0200001_17;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS23S0100001_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0fPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126230fPh {
    public final InterfaceC1126270fPl LIZ;
    public int LIZIZ;
    public C1126370fPv LIZLLL;
    public C1126370fPv LJ;
    public C1126370fPv LJFF;
    public C1126370fPv LJI;
    public C1126370fPv LJII;
    public final C1126250fPj LJIIIIZZ;
    public final View LJIIIZ;
    public final C0GSA LJIIJ;
    public final C1126260fPk LJIIJJI;
    public final C1126240fPi LJIIL;
    public float LIZJ = 1.0f;
    public final String LJIILIIL = C1017903yT.LIZ();
    public boolean LJIILJJIL = true;

    public final void LIZ() {
        C1126370fPv c1126370fPv = this.LIZLLL;
        if (c1126370fPv != null && c1126370fPv.LIZIZ()) {
            C1126370fPv c1126370fPv2 = this.LIZLLL;
            if (c1126370fPv2 != null) {
                c1126370fPv2.LIZ();
            }
            this.LIZLLL = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new_combo_appear_anim_");
        sbLIZ.append(this.LJIILIIL);
        C1126030fPN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ() {
        C1126370fPv c1126370fPv = this.LJI;
        if (c1126370fPv != null && c1126370fPv.LIZIZ()) {
            C1126370fPv c1126370fPv2 = this.LJI;
            if (c1126370fPv2 != null) {
                c1126370fPv2.LIZ();
            }
            this.LJI = null;
        }
        C1126240fPi c1126240fPi = this.LJIIL;
        if (c1126240fPi != null) {
            float f = this.LIZJ;
            c1126240fPi.LLILZLL = f;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi);
            c1126240fPi.setScaleX(f);
            float f2 = c1126240fPi.LLILZLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi);
            c1126240fPi.setScaleY(f2);
        }
    }

    public final void LIZJ() {
        C1126370fPv c1126370fPv = this.LJ;
        if (c1126370fPv != null && c1126370fPv.LIZIZ()) {
            C1126370fPv c1126370fPv2 = this.LJ;
            if (c1126370fPv2 != null) {
                c1126370fPv2.LIZ();
            }
            this.LJ = null;
        }
        C1126240fPi c1126240fPi = this.LJIIL;
        if (c1126240fPi != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi);
            c1126240fPi.setAlpha(1.0f);
        }
        C0GSA c0gsa = this.LJIIJ;
        if (c0gsa != null) {
            c0gsa.setProgress(360.0f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new_combo_countdown_anim_");
        sbLIZ.append(this.LJIILIIL);
        C1126030fPN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL() {
        C1126370fPv c1126370fPv = this.LJFF;
        if (c1126370fPv != null && c1126370fPv.LIZIZ()) {
            C1126370fPv c1126370fPv2 = this.LJFF;
            if (c1126370fPv2 != null) {
                c1126370fPv2.LIZ();
            }
            this.LJFF = null;
        }
        C1126260fPk c1126260fPk = this.LJIIJJI;
        if (c1126260fPk != null) {
            float f = this.LIZJ;
            c1126260fPk.LLILZIL = f;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126260fPk);
            c1126260fPk.setScaleX(f);
            float f2 = c1126260fPk.LLILZIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126260fPk);
            c1126260fPk.setScaleY(f2);
        }
        C1126260fPk c1126260fPk2 = this.LJIIJJI;
        if (c1126260fPk2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126260fPk2);
            c1126260fPk2.setAlpha(1.0f);
        }
        View view = this.LJIIIZ;
        if (view != null) {
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
            C786410Ut5.T4(view, 1.0f);
        }
    }

    public final void LJ() {
        C1126260fPk c1126260fPk = this.LJIIJJI;
        if (c1126260fPk != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126260fPk);
            c1126260fPk.setScaleX(1.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126260fPk);
            c1126260fPk.setScaleY(1.0f);
        }
        C0GSA c0gsa = this.LJIIJ;
        if (c0gsa != null) {
            c0gsa.setScale(1.0f);
            c0gsa.setBorderWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
            c0gsa.setBorderAlpha(255);
        }
        C1126250fPj c1126250fPj = this.LJIIIIZZ;
        if (c1126250fPj != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126250fPj);
            c1126250fPj.setAlpha(1.0f);
        }
        C1126240fPi c1126240fPi = this.LJIIL;
        if (c1126240fPi != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi);
            c1126240fPi.setScaleX(1.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi);
            c1126240fPi.setScaleY(1.0f);
        }
    }

    public C1126230fPh(InterfaceC1126270fPl interfaceC1126270fPl) {
        this.LIZ = interfaceC1126270fPl;
        interfaceC1126270fPl.LIZ();
        this.LJIIIIZZ = (C1126250fPj) interfaceC1126270fPl.findViewById(R.id.e9p);
        this.LJIIIZ = interfaceC1126270fPl.findViewById(R.id.e9e);
        this.LJIIJ = (C0GSA) interfaceC1126270fPl.findViewById(R.id.e9i);
        this.LJIIJJI = (C1126260fPk) interfaceC1126270fPl.findViewById(R.id.e9f);
        C1126240fPi c1126240fPi = (C1126240fPi) interfaceC1126270fPl.findViewById(R.id.e9m);
        this.LJIIL = c1126240fPi;
        if (c1126240fPi != null) {
            c1126240fPi.setComboNumberOptManager(interfaceC1126270fPl.getComboNumberOptManager());
        }
    }

    public final void LJFF(ARunnableS112S0100000_12 aRunnableS112S0100000_12) {
        float f;
        C1126290fPn c1126290fPn;
        float f2;
        C1126300fPo c1126300fPoLIZ;
        Pair pair;
        int iLIZIZ;
        float f3;
        this.LIZIZ = 1;
        LIZ();
        LIZJ();
        LIZLLL();
        LIZIZ();
        int iLIZIZ2 = this.LIZ.LIZIZ();
        float f4 = 1.08f;
        if (iLIZIZ2 < 10) {
            f = 1.0f;
        } else if (iLIZIZ2 < 20) {
            f = 1.08f;
        } else {
            f = 1.16f;
        }
        if (this.LIZJ != f) {
            if (iLIZIZ2 != 10 && iLIZIZ2 != 20) {
                LJII(f, true);
            } else {
                LJII(f, false);
                if (iLIZIZ2 == 10) {
                    float f5 = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                    C1126240fPi c1126240fPi = this.LJIIL;
                    if (c1126240fPi != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi);
                        c1126240fPi.setTranslationY(f5);
                    }
                    f3 = 1.0f;
                } else {
                    float f6 = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    C1126240fPi c1126240fPi2 = this.LJIIL;
                    if (c1126240fPi2 != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi2);
                        c1126240fPi2.setTranslationY(f6);
                    }
                    f3 = 1.08f;
                }
                C1126370fPv c1126370fPvLIZ = C1126360fPu.LIZ(new AwS23S0100001_17(this, f3, 1));
                c1126370fPvLIZ.LIZJ();
                this.LJI = c1126370fPvLIZ;
            }
        }
        C1126250fPj c1126250fPj = this.LJIIIIZZ;
        if (c1126250fPj != null && (iLIZIZ = this.LIZ.LIZIZ()) != 1) {
            c1126250fPj.LIZ(1.0f, true);
            c1126250fPj.LIZ(Math.min(iLIZIZ / 20.0f, 1.0f), false);
        }
        C1126240fPi c1126240fPi3 = this.LJIIL;
        if (c1126240fPi3 != null) {
            int iLIZIZ3 = this.LIZ.LIZIZ();
            if (this.LJIILJJIL) {
                C1126480fQ6 c1126480fQ6 = c1126240fPi3.LLIZLLLIL;
                if (c1126480fQ6 != null && (c1126300fPoLIZ = c1126480fQ6.LIZ(iLIZIZ3)) != null && c1126300fPoLIZ.LIZJ == null) {
                    int i = c1126300fPoLIZ.LIZ;
                    if (String.valueOf(c1126240fPi3.LLIZ).length() != String.valueOf(i).length() && i < 1001) {
                        if (i >= 1000) {
                            pair = new Pair(61, 75);
                        } else if (i >= 100) {
                            pair = new Pair(46, 61);
                        } else if (i >= 10) {
                            pair = new Pair(40, 46);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onComboNumWidthAnimation: startWidth ");
                        sbLIZ.append(((Number) pair.getFirst()).intValue());
                        sbLIZ.append(" endWidth ");
                        sbLIZ.append(((Number) pair.getSecond()).intValue());
                        C20441214yg.LJIIIZ("GiftComboNumberView", C2188811AlT.LIZIZ(sbLIZ));
                        C1126370fPv c1126370fPvLIZ2 = C1126360fPu.LIZ(new AwS383S0200000_17(c1126240fPi3, (C1126240fPi) pair, (Pair<Integer, Integer>) 61));
                        c1126370fPvLIZ2.LIZJ();
                        c1126240fPi3.LLILZIL = c1126370fPvLIZ2;
                    }
                    c1126240fPi3.LLIZ = i;
                }
                c1126240fPi3.LIZ(iLIZIZ3, true);
                C1126370fPv c1126370fPv = c1126240fPi3.LLILLL;
                if (c1126370fPv != null && c1126370fPv.LIZIZ()) {
                    C1126370fPv c1126370fPv2 = c1126240fPi3.LLILLL;
                    if (c1126370fPv2 != null) {
                        c1126370fPv2.LIZ();
                    }
                    c1126240fPi3.LLILLL = null;
                }
                if (iLIZIZ3 <= 20) {
                    if (iLIZIZ3 > 10) {
                        f4 = 1.06f;
                    } else {
                        f4 = 1.0f;
                    }
                }
                C817403Hg c817403Hg = new C817403Hg();
                if (iLIZIZ3 % 10 == 0) {
                    f2 = 1.25f;
                } else {
                    f2 = 1.1f;
                }
                c817403Hg.element = f2 * f4;
                C1126370fPv c1126370fPvLIZ3 = C1126360fPu.LIZ(new AwS11S0200001_17(f4, c1126240fPi3, c817403Hg, 3));
                c1126370fPvLIZ3.LIZJ();
                c1126240fPi3.LLILLL = c1126370fPvLIZ3;
            }
        }
        C1126260fPk c1126260fPk = this.LJIIJJI;
        if (c1126260fPk != null) {
            int iLIZIZ4 = this.LIZ.LIZIZ();
            ARunnableS86S0200000_17 aRunnableS86S0200000_17 = new ARunnableS86S0200000_17(this, aRunnableS112S0100000_12, 42);
            if (iLIZIZ4 == 1) {
                aRunnableS86S0200000_17.run();
            } else {
                if (c1126260fPk.LL != null) {
                    c1126260fPk.LIZ(iLIZIZ4, true);
                    if (!c1126260fPk.LL.LJI()) {
                        C1126540fQC c1126540fQC = c1126260fPk.LL;
                        c1126540fQC.LLJILJIL = C1143780fs0.LJIIJ("tiktok_live_revenue_demand_5", "gift_combo_button_bg.webp");
                        c1126540fQC.LLJJIII = true;
                        c1126540fQC.LLJILJILJ = new C0I9J() { // from class: X.0ejP
                            @Override // X.C0I9J, X.InterfaceC1331000kjy
                            public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
                                boolean z;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("GiftComboButtonView onAnimationStop: ");
                                if (animatedDrawable2 != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sbLIZ2.append(z);
                                C20441214yg.LJIIIZ("GiftComboButtonView", C2188811AlT.LIZIZ(sbLIZ2));
                                if (animatedDrawable2 != null) {
                                    animatedDrawable2.start();
                                }
                            }
                        };
                        c1126540fQC.LJII();
                    }
                }
                C1126370fPv c1126370fPv3 = c1126260fPk.LLILLL;
                if (c1126370fPv3 != null && c1126370fPv3.LIZIZ()) {
                    C1126370fPv c1126370fPv4 = c1126260fPk.LLILLL;
                    if (c1126370fPv4 != null) {
                        c1126370fPv4.LIZ();
                    }
                    c1126260fPk.LLILLL = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onComboButtonScaleAnim: isLongPress: ");
                sbLIZ2.append(false);
                sbLIZ2.append(", longPressNum ");
                sbLIZ2.append(c1126260fPk.LLILZLL);
                C20441214yg.LJIIIZ("GiftComboButtonView", C2188811AlT.LIZIZ(sbLIZ2));
                if (c1126260fPk.LLILZLL > 0) {
                    c1126260fPk.LLILZLL = 0;
                    float f7 = c1126260fPk.LLILZIL;
                    c1126290fPn = new C1126290fPn(1.2f * f7, 1.24f * f7, f7);
                } else {
                    c1126260fPk.LLILZLL = 0;
                    float f8 = c1126260fPk.LLILZIL;
                    c1126290fPn = new C1126290fPn(f8, 1.24f * f8, f8);
                }
                C1126370fPv c1126370fPvLIZ4 = C1126360fPu.LIZ(new AwS226S0300000_17(c1126260fPk, c1126290fPn, aRunnableS86S0200000_17, 6));
                c1126370fPvLIZ4.LIZJ();
                c1126260fPk.LLILLL = c1126370fPvLIZ4;
            }
        }
        C1126280fPm.LIZ(this.LJIIJ, this.LIZ.LIZIZ(), true);
    }

    public final void LJI(Runnable runnable) {
        if (this.LJIIJ == null) {
            return;
        }
        LIZJ();
        if (this.LIZIZ != 0) {
            C1126370fPv c1126370fPv = this.LJII;
            if (c1126370fPv != null && c1126370fPv.LIZIZ()) {
                C1126370fPv c1126370fPv2 = this.LJII;
                if (c1126370fPv2 != null) {
                    c1126370fPv2.LIZ();
                }
                this.LJII = null;
            }
            C1126370fPv c1126370fPvLIZ = C1126360fPu.LIZ(new AwS596S0100000_17(this, 355));
            c1126370fPvLIZ.LIZJ();
            this.LJII = c1126370fPvLIZ;
            C1126260fPk c1126260fPk = this.LJIIJJI;
            if (c1126260fPk != null) {
                c1126260fPk.LIZ(this.LIZ.LIZIZ(), false);
            }
            C1126240fPi c1126240fPi = this.LJIIL;
            if (c1126240fPi != null) {
                c1126240fPi.LIZ(this.LIZ.LIZIZ(), false);
            }
            C1126280fPm.LIZ(this.LJIIJ, this.LIZ.LIZIZ(), false);
        }
        Context viewContext = this.LIZ.getViewContext();
        if (viewContext != null && Settings.Global.getFloat(viewContext.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new_combo_countdown_anim_");
            sbLIZ.append(this.LJIILIIL);
            C1126030fPN.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), 2000L, null, new AwS418S0200000_17(this, runnable, 58));
            return;
        }
        C1126370fPv c1126370fPvLIZ2 = C1126360fPu.LIZ(new AwS383S0200000_17(this, runnable, 62));
        c1126370fPvLIZ2.LIZJ();
        this.LJ = c1126370fPvLIZ2;
    }

    public final void LJII(float f, boolean z) {
        C1126240fPi c1126240fPi;
        this.LIZJ = f;
        if (z) {
            C1126260fPk c1126260fPk = this.LJIIJJI;
            if (c1126260fPk != null) {
                c1126260fPk.LLILZIL = f;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126260fPk);
                c1126260fPk.setScaleX(f);
                float f2 = c1126260fPk.LLILZIL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126260fPk);
                c1126260fPk.setScaleY(f2);
            }
            C1126240fPi c1126240fPi2 = this.LJIIL;
            if (c1126240fPi2 != null) {
                c1126240fPi2.LLILZLL = f;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi2);
                c1126240fPi2.setScaleX(f);
                float f3 = c1126240fPi2.LLILZLL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi2);
                c1126240fPi2.setScaleY(f3);
            }
            if (f == 1.0f && (c1126240fPi = this.LJIIL) != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126240fPi);
                c1126240fPi.setTranslationY(0.0f);
            }
        }
    }
}
