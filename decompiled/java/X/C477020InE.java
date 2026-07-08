package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0InE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477020InE implements InterfaceC472300Ifc {
    public final C19EG LL;
    public final InterfaceC477030InF LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 611));
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public Function1<? super Boolean, Unit> LLJILLL;

    @Override // X.InterfaceC472300Ifc
    public final void Je() {
        this.LLILLJJLI.LJI();
    }

    public final int LIZIZ() {
        return ((Number) this.LLJIJIL.getValue()).intValue();
    }

    public final boolean LIZJ() {
        return this.LLILLJJLI.LIZ();
    }

    @Override // X.InterfaceC472300Ifc
    public final boolean LJJJLZIJ() {
        return this.LLILLJJLI.LJJJLZIJ();
    }

    @Override // X.InterfaceC472300Ifc
    public final boolean Fh(MotionEvent motionEvent) {
        if (!this.LLILLJJLI.LJIIJ(motionEvent) && !this.LLILLJJLI.LJIIIIZZ(motionEvent) && !this.LLILLJJLI.LJFF(motionEvent) && !this.LLILLJJLI.LJ(motionEvent) && !this.LLILLJJLI.LJIIJJI(motionEvent) && !this.LLILLJJLI.LIZLLL(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(float f) {
        if (LIZJ() && f > LIZIZ()) {
            this.LLJI = true;
        }
        if (LIZJ() && this.LLJILJILJ) {
            this.LLILZLL = true;
            return;
        }
        if (!this.LLILZLL) {
            if ((f > 0.0f && this.LLILLJJLI.LIZJ() && !LIZJ()) || (f < 0.0f && LIZJ() && !this.LLJI)) {
                this.LLILZLL = true;
            }
        }
    }

    @Override // X.InterfaceC472300Ifc
    public final boolean LJJJJ(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LLIZ = false;
            }
            if (this.LLIZ && LIZJ()) {
                return false;
            }
            Integer numValueOf = Integer.valueOf(motionEvent.getAction());
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLILZLL = false;
                    this.LLIZLLLIL = false;
                    this.LLJILJIL = false;
                    this.LLJI = false;
                    this.LLIZ = false;
                    this.LLILLL = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    this.LLILZ = rawY;
                    this.LLILZIL = rawY;
                    if (this.LLILLJJLI.LJIIIZ()) {
                        this.LLIZLLLIL = true;
                    } else if (LIZJ() && !this.LLILLJJLI.LJIIJ(motionEvent) && !this.LLILLJJLI.LJIIIIZZ(motionEvent) && !this.LLILLJJLI.LJFF(motionEvent) && !this.LLILLJJLI.LJ(motionEvent) && !this.LLILLJJLI.LJIIJJI(motionEvent) && !this.LLILLJJLI.LJIILIIL(motionEvent) && !this.LLILLJJLI.LIZLLL(motionEvent)) {
                        if (this.LLJILJILJ) {
                            this.LLJILJIL = true;
                        } else {
                            this.LLIZLLLIL = true;
                        }
                    }
                    Function1<? super Boolean, Unit> function1 = this.LLJILLL;
                    if (function1 != null) {
                        if (LIZJ() && this.LLILLJJLI.LJIIIIZZ(motionEvent)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        function1.invoke(Boolean.valueOf(z));
                    }
                    if (LIZJ()) {
                        this.LLILLJJLI.LJI();
                    }
                } else if (numValueOf.intValue() == 2) {
                    float rawX = motionEvent.getRawX() - this.LLILLL;
                    float rawY2 = motionEvent.getRawY() - this.LLILZ;
                    motionEvent.getRawX();
                    this.LLILZIL = motionEvent.getRawY();
                    if (this.LLJILJILJ) {
                        if (Math.abs(rawY2) > LIZIZ()) {
                            this.LLJILJIL = false;
                        }
                        if (Math.abs(rawY2) > LIZIZ() && Math.abs(rawY2) * 0.5f > Math.abs(rawX) && LIZJ()) {
                            LIZ(false, EnumC476920In4.NULL, EnumC476910In3.DRAW);
                            return true;
                        }
                    }
                    if (Math.abs(rawY2) > LIZIZ() && ((!LIZJ() && Math.abs(rawY2) * 0.5f > Math.abs(rawX)) || LIZJ() || this.LLILLJJLI.LJIIIZ())) {
                        LIZLLL(rawY2);
                    }
                } else if (numValueOf.intValue() == 1 && this.LLJILJILJ && this.LLJILJIL) {
                    LIZ(false, EnumC476920In4.NULL, EnumC476910In3.DRAW);
                    return true;
                }
            }
        }
        if (this.LLILZLL || this.LLIZLLLIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC472300Ifc
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LLIZ = false;
            }
            if (this.LLIZ && LIZJ()) {
                return false;
            }
            Integer numValueOf = Integer.valueOf(motionEvent.getAction());
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLILZLL = false;
                    this.LLIZ = false;
                    this.LLILLL = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    this.LLILZ = rawY;
                    this.LLILZIL = rawY;
                    if (this.LLIZLLLIL) {
                        LIZ(false, EnumC476920In4.NULL, EnumC476910In3.DRAW);
                        return true;
                    }
                } else if (numValueOf != null) {
                    if (numValueOf.intValue() == 2) {
                        float rawX = motionEvent.getRawX() - this.LLILLL;
                        float rawY2 = motionEvent.getRawY() - this.LLILZ;
                        float rawY3 = motionEvent.getRawY() - this.LLILZIL;
                        motionEvent.getRawX();
                        this.LLILZIL = motionEvent.getRawY();
                        if (this.LLIZLLLIL) {
                            return true;
                        }
                        if (Math.abs(rawY2) > LIZIZ() && Math.abs(rawY2) > Math.abs(rawX)) {
                            LIZLLL(rawY2);
                            if (this.LLILZLL) {
                                if (this.LLJILJILJ && rawY2 > 0.0f && (LIZJ() || this.LLILLJJLI.LJIIIZ())) {
                                    this.LLJ = true;
                                    LIZ(false, EnumC476920In4.NULL, EnumC476910In3.DRAW);
                                } else if (!this.LLJ) {
                                    if (this.LLILLJJLI.LIZIZ()) {
                                        if (!LIZJ()) {
                                            this.LLJ = true;
                                            LIZ(true, EnumC476920In4.DRAW, EnumC476910In3.NULL);
                                        }
                                    } else {
                                        this.LLILLJJLI.LJII(rawY3);
                                        this.LLILLJJLI.LJIILJJIL();
                                    }
                                }
                            }
                        }
                    } else if (numValueOf.intValue() == 1) {
                        float rawY4 = motionEvent.getRawY() - this.LLILZ;
                        motionEvent.getRawX();
                        if (this.LLILZLL && !this.LLJ) {
                            if (rawY4 >= 0.0f && !LIZJ()) {
                                LIZ(true, EnumC476920In4.DRAW, EnumC476910In3.NULL);
                            } else {
                                LIZ(false, EnumC476920In4.NULL, EnumC476910In3.DRAW);
                            }
                        }
                        this.LLJ = false;
                        this.LLJI = false;
                        this.LLILZLL = false;
                        this.LLIZLLLIL = false;
                        this.LLIZ = false;
                        this.LLILLL = 0.0f;
                        this.LLILZ = 0.0f;
                    } else if (numValueOf.intValue() == 3) {
                        this.LLJ = false;
                        this.LLJI = false;
                        this.LLILZLL = false;
                        this.LLIZLLLIL = false;
                        this.LLIZ = false;
                        this.LLILLL = 0.0f;
                        this.LLILZ = 0.0f;
                    }
                }
            }
        }
        return this.LLILZLL;
    }

    public C477020InE(C19EG c19eg, C476850Imx c476850Imx) {
        this.LL = c19eg;
        this.LLILLJJLI = c476850Imx;
    }

    public final void LIZ(boolean z, EnumC476920In4 enumC476920In4, EnumC476910In3 enumC476910In3) {
        if (LIZJ() && !z) {
            this.LLILLJJLI.LJJIIJZLJL();
        }
        this.LLILLJJLI.LJIIL(z, enumC476920In4, enumC476910In3);
    }
}
