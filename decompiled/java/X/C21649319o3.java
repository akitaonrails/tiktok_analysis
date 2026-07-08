package X;

import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19o3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21649319o3 implements InterfaceC21650219oC<C21649719o7> {
    public InterfaceC21650219oC<C21649319o3> LL;
    public final C21649719o7 LLILLJJLI;
    public final ArrayList<Integer> LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public int LLJILJIL;

    public C21649319o3() {
        C21649719o7 c21649719o7 = new C21649719o7();
        this.LLILLJJLI = c21649719o7;
        this.LLILLL = new ArrayList<>();
        this.LLILZ = 1.0f;
        this.LLJIJIL = 1.0f;
        c21649719o7.LJIIIZ = this;
    }

    @Override // X.InterfaceC21650219oC
    public final void LIZ(C21649719o7 c21649719o7) {
        C21649719o7 c21649719o72 = c21649719o7;
        if (this.LLILLJJLI.LIZ == 1) {
            this.LLILZ = 1.0f;
            this.LLJIJIL = 1.0f;
        } else {
            float[] fArr = c21649719o72.LIZLLL;
            float f = fArr[1] - fArr[0];
            float[] fArr2 = c21649719o72.LJ;
            float f2 = fArr2[1] - fArr2[0];
            float[] fArr3 = c21649719o72.LJFF;
            float f3 = fArr3[1] - fArr3[0];
            float[] fArr4 = c21649719o72.LJI;
            float f4 = fArr4[1] - fArr4[0];
            float fHypot = (float) Math.hypot(f, f2);
            float fHypot2 = (float) Math.hypot(f3, f4);
            float f5 = this.LLILZ;
            float f6 = fHypot2 / fHypot;
            this.LLILZ = f6;
            this.LLJIJIL = f6 / f5;
            this.LLIZ = LIZIZ(c21649719o72.LIZ, c21649719o72.LJFF);
            this.LLIZLLLIL = LIZIZ(c21649719o72.LIZ, c21649719o72.LJI);
        }
        float fLIZIZ = LIZIZ(c21649719o72.LIZ, c21649719o72.LJFF) - LIZIZ(c21649719o72.LIZ, c21649719o72.LJII);
        this.LLJ = fLIZIZ;
        this.LLILZIL += fLIZIZ;
        float fLIZIZ2 = LIZIZ(c21649719o72.LIZ, c21649719o72.LJI) - LIZIZ(c21649719o72.LIZ, c21649719o72.LJIIIIZZ);
        this.LLJI = fLIZIZ2;
        this.LLILZLL += fLIZIZ2;
        if (this.LLILLJJLI.LIZ == 1) {
            if (this.LLJILJIL == 0) {
                if (Math.abs(this.LLILZIL) - Math.abs(this.LLILZLL) >= 0.0f) {
                    if (this.LLILZIL < -10.0f && !this.LLILLL.contains(1)) {
                        this.LLJILJIL = 1;
                    }
                    if (this.LLILZIL > 10.0f && !this.LLILLL.contains(3)) {
                        this.LLJILJIL = 3;
                    }
                } else {
                    if (this.LLILZLL < -10.0f && !this.LLILLL.contains(2)) {
                        this.LLJILJIL = 2;
                    }
                    if (this.LLILZLL > 10.0f && !this.LLILLL.contains(4)) {
                        this.LLJILJIL = 4;
                    }
                }
            }
        } else {
            this.LLJILJIL = -1;
        }
        InterfaceC21650219oC<C21649319o3> interfaceC21650219oC = this.LL;
        if (interfaceC21650219oC != null) {
            interfaceC21650219oC.LIZ(this);
        }
    }

    @Override // X.InterfaceC21650219oC
    public final void LIZJ(C21649719o7 c21649719o7) {
        InterfaceC21650219oC<C21649319o3> interfaceC21650219oC = this.LL;
        if (interfaceC21650219oC != null) {
            interfaceC21650219oC.LIZJ(this);
        }
    }

    @Override // X.InterfaceC21650219oC
    public final void LIZLLL(C21649719o7 c21649719o7) {
        InterfaceC21650219oC<C21649319o3> interfaceC21650219oC = this.LL;
        if (interfaceC21650219oC != null) {
            interfaceC21650219oC.LIZLLL(this);
        }
        this.LLILZ = 1.0f;
        this.LLILZIL = 0.0f;
        this.LLILZLL = 0.0f;
        this.LLIZ = 0.0f;
        this.LLIZLLLIL = 0.0f;
        this.LLJ = 0.0f;
        this.LLJI = 0.0f;
        this.LLJIJIL = 1.0f;
        this.LLJILJIL = 0;
    }

    public final boolean LJ(MotionEvent motionEvent) {
        C21649719o7 c21649719o7 = this.LLILLJJLI;
        c21649719o7.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                c21649719o7.LIZIZ(motionEvent);
                                if (c21649719o7.LIZ == 0) {
                                    c21649719o7.LIZ();
                                } else {
                                    C21649319o3 c21649319o3 = c21649719o7.LJIIIZ;
                                    if (c21649319o3 != null) {
                                        c21649319o3.LIZ(c21649719o7);
                                        return true;
                                    }
                                }
                            }
                        } else {
                            c21649719o7.LIZIZ(motionEvent);
                            C21649319o3 c21649319o32 = c21649719o7.LJIIIZ;
                            if (c21649319o32 != null) {
                                c21649319o32.LIZ(c21649719o7);
                                return true;
                            }
                        }
                    } else {
                        c21649719o7.LIZ();
                        return true;
                    }
                } else {
                    c21649719o7.LIZIZ = c21649719o7.LIZ;
                    int i = 0;
                    do {
                        int iFindPointerIndex = motionEvent.findPointerIndex(c21649719o7.LIZJ[i]);
                        if (iFindPointerIndex != -1) {
                            float[] fArr = c21649719o7.LJII;
                            float[] fArr2 = c21649719o7.LJFF;
                            fArr[i] = fArr2[i];
                            c21649719o7.LJIIIIZZ[i] = c21649719o7.LJI[i];
                            fArr2[i] = motionEvent.getX(iFindPointerIndex);
                            c21649719o7.LJI[i] = motionEvent.getY(iFindPointerIndex);
                        }
                        i++;
                    } while (i < 2);
                    C21649319o3 c21649319o33 = c21649719o7.LJIIIZ;
                    if (c21649319o33 != null) {
                        c21649319o33.LIZ(c21649719o7);
                        return true;
                    }
                }
            } else {
                c21649719o7.LIZIZ(motionEvent);
                if (c21649719o7.LIZ == 0) {
                    c21649719o7.LIZ();
                    return true;
                }
                C21649319o3 c21649319o34 = c21649719o7.LJIIIZ;
                if (c21649319o34 != null) {
                    c21649319o34.LIZ(c21649719o7);
                    return true;
                }
            }
            return true;
        }
        C21649319o3 c21649319o35 = c21649719o7.LJIIIZ;
        if (c21649319o35 != null) {
            c21649319o35.LIZJ(c21649719o7);
        }
        c21649719o7.LIZIZ(motionEvent);
        return true;
    }

    public static float LIZIZ(int i, float[] fArr) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        if (i <= 0) {
            return 0.0f;
        }
        return f / i;
    }
}
