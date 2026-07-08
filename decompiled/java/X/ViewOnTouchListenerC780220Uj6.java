package X;

import Y.ARunnableS112S0100000_12;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS661S0100000_12;

/* JADX INFO: renamed from: X.0Uj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class ViewOnTouchListenerC780220Uj6 implements View.OnTouchListener {
    public final View LL;
    public final View LLILLJJLI;
    public final Function2<Integer, EnumC780210Uj5, Unit> LLILLL;
    public final InterfaceC1631620sYq<Integer, Integer, EnumC780210Uj5, Unit> LLILZ;
    public final Function2<Integer, Integer, Unit> LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public final int[] LLJJJJJIL;
    public EnumC780260UjA LLIZLLLIL = EnumC780260UjA.RIGHT_BOTTOM;
    public final int LLJILLL = (int) C497740JfY.LIZIZ(12.0f);
    public final int LLJJ = (int) C497740JfY.LIZIZ(12.0f);
    public final C01GW LLJJI = C292401Bi.LIZ(new AwS556S0100000_12(this, 945));
    public final C01GW LLJJIII = C292401Bi.LIZ(new AwS556S0100000_12(this, 944));
    public final C01GW LLJJIJI = C292401Bi.LIZ(new AwS556S0100000_12(this, 946));
    public EnumC780210Uj5 LLJJIJIIJIL = EnumC780210Uj5.Default;

    public final float LIZLLL() {
        return ((Number) this.LLJJI.getValue()).floatValue();
    }

    public final float LJ() {
        return ((Number) this.LLJJIJI.getValue()).floatValue();
    }

    public static EnumC780210Uj5 LIZIZ(EnumC780210Uj5 enumC780210Uj5) {
        EnumC780210Uj5[] enumC780210Uj5ArrValues = EnumC780210Uj5.values();
        if (enumC780210Uj5.ordinal() >= EnumC780210Uj5.values().length - 1) {
            return enumC780210Uj5;
        }
        for (EnumC780210Uj5 enumC780210Uj52 : enumC780210Uj5ArrValues) {
            if (enumC780210Uj52 == enumC780210Uj5) {
                EnumC780210Uj5 enumC780210Uj53 = (EnumC780210Uj5) C13LQ.LJJIIZ(enumC780210Uj52.ordinal() + 1, enumC780210Uj5ArrValues);
                if (enumC780210Uj53 != null) {
                    return enumC780210Uj53;
                }
                return enumC780210Uj5;
            }
        }
        return enumC780210Uj5;
    }

    public final EnumC780210Uj5 LIZJ(int i) {
        float fLIZLLL = (i * 10.0f) / LIZLLL();
        if (Float.isNaN(fLIZLLL)) {
            return this.LLJJIJIIJIL;
        }
        float fLIZIZ = C814420VxA.LIZIZ(fLIZLLL);
        EnumC780210Uj5 enumC780210Uj5 = EnumC780210Uj5.Scale120;
        float f = 10;
        float ratio = enumC780210Uj5.getRatio() * f;
        EnumC780210Uj5 enumC780210Uj52 = EnumC780210Uj5.Default;
        if (fLIZIZ <= (ratio + (enumC780210Uj52.getRatio() * f)) / 2) {
            if (fLIZIZ >= enumC780210Uj52.getRatio() * f) {
                return enumC780210Uj52;
            }
            enumC780210Uj5 = EnumC780210Uj5.Scale90;
            if (fLIZIZ < enumC780210Uj5.getRatio() * f) {
                enumC780210Uj5 = EnumC780210Uj5.Scale80;
                if (fLIZIZ < enumC780210Uj5.getRatio() * f) {
                    enumC780210Uj5 = EnumC780210Uj5.Scale70;
                    if (fLIZIZ < enumC780210Uj5.getRatio() * f) {
                        return EnumC780210Uj5.Scale60;
                    }
                }
            }
        }
        return enumC780210Uj5;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer numValueOf;
        EnumC780210Uj5 enumC780210Uj5LIZIZ;
        int iLJ;
        float ratio;
        float fLIZLLL;
        boolean zLJI = MethodIDManager.LJI(202262);
        boolean z = false;
        if (view == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        if (view.getContext() == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                view.getLeft();
                view.getRight();
                view.getTop();
                view.getBottom();
                this.LLIZ = (int) motionEvent.getRawY();
                this.LLILZLL = (int) motionEvent.getRawX();
                this.LLJI = view.getMeasuredWidth();
                this.LLJIJIL = view.getMeasuredHeight();
                this.LLJJJIL = C14KS.LJI(view.getContext());
                this.LLJJJJ = C14KS.LJ(view.getContext());
                View view2 = this.LLILLJJLI;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int top = view2.getTop();
                int left = view2.getLeft();
                int bottom = view2.getBottom();
                int right = view2.getRight();
                if (y < bottom && y > top && x > left && x < right) {
                    z = true;
                }
                this.LLJ = z;
                if (z) {
                    this.LL.getLocationOnScreen(this.LLJJJJJIL);
                }
            } else if (numValueOf.intValue() == 2) {
                this.LLJJIJIL = ((int) motionEvent.getRawX()) - this.LLILZLL;
                this.LLJJJ = ((int) motionEvent.getRawY()) - this.LLIZ;
                if (this.LLIZLLLIL.isLeft()) {
                    this.LLJJIJIL = -this.LLJJIJIL;
                }
                if (this.LLIZLLLIL.isTop()) {
                    this.LLJJJ = -this.LLJJJ;
                }
                if (this.LLJ) {
                    if (Math.abs(this.LLJJIJIL) > Math.abs(this.LLJJJ / LJ())) {
                        iLJ = this.LLJJIJIL;
                    } else {
                        iLJ = (int) (this.LLJJJ / LJ());
                    }
                    int i = this.LLJI + iLJ;
                    this.LLJILJIL = i;
                    float f = i;
                    EnumC780210Uj5 enumC780210Uj5 = EnumC780210Uj5.Scale120;
                    if (f > enumC780210Uj5.getRatio() * LIZLLL()) {
                        ratio = enumC780210Uj5.getRatio();
                        fLIZLLL = LIZLLL();
                    } else {
                        EnumC780210Uj5 enumC780210Uj52 = EnumC780210Uj5.Scale60;
                        if (f < enumC780210Uj52.getRatio() * LIZLLL()) {
                            ratio = enumC780210Uj52.getRatio();
                            fLIZLLL = LIZLLL();
                        }
                        this.LLJILJIL = i;
                        int iLJ2 = (int) (i * LJ());
                        this.LLJILJILJ = iLJ2;
                        int i2 = this.LLJILJIL;
                        int iLJI = LJI(i2 - this.LLJI, iLJ2 - this.LLJIJIL, i2, iLJ2);
                        this.LLJILJIL = iLJI;
                        int iLJ3 = (int) (iLJI * LJ());
                        this.LLJILJILJ = iLJ3;
                        int i3 = this.LLJILJIL;
                        LIZ(view, i3 - this.LLJI, iLJ3 - this.LLJIJIL, i3, iLJ3);
                        int i4 = this.LLJILJIL;
                        this.LLJI = i4;
                        this.LLJIJIL = this.LLJILJILJ;
                        this.LLJJIJIIJIL = LIZJ(i4);
                        this.LLILLL.invoke(Integer.valueOf((int) ((this.LLJILJIL * 100) / LIZLLL())), this.LLJJIJIIJIL);
                    }
                    i = (int) (ratio * fLIZLLL);
                    this.LLJILJIL = i;
                    int iLJ22 = (int) (i * LJ());
                    this.LLJILJILJ = iLJ22;
                    int i22 = this.LLJILJIL;
                    int iLJI2 = LJI(i22 - this.LLJI, iLJ22 - this.LLJIJIL, i22, iLJ22);
                    this.LLJILJIL = iLJI2;
                    int iLJ32 = (int) (iLJI2 * LJ());
                    this.LLJILJILJ = iLJ32;
                    int i32 = this.LLJILJIL;
                    LIZ(view, i32 - this.LLJI, iLJ32 - this.LLJIJIL, i32, iLJ32);
                    int i42 = this.LLJILJIL;
                    this.LLJI = i42;
                    this.LLJIJIL = this.LLJILJILJ;
                    this.LLJJIJIIJIL = LIZJ(i42);
                    this.LLILLL.invoke(Integer.valueOf((int) ((this.LLJILJIL * 100) / LIZLLL())), this.LLJJIJIIJIL);
                }
                this.LLIZ = (int) motionEvent.getRawY();
                this.LLILZLL = (int) motionEvent.getRawX();
            } else if (numValueOf.intValue() == 1) {
                this.LLJ = false;
                int iLIZLLL = (int) (LIZLLL() * this.LLJJIJIIJIL.getRatio());
                this.LLJILJIL = iLIZLLL;
                int iLJ4 = (int) (iLIZLLL * LJ());
                this.LLJILJILJ = iLJ4;
                int i5 = this.LLJILJIL;
                int iLJI3 = LJI(i5 - this.LLJI, iLJ4 - this.LLJIJIL, i5, iLJ4);
                while (this.LLJILJIL != iLJI3 && (enumC780210Uj5LIZIZ = LIZIZ(this.LLJJIJIIJIL)) != this.LLJJIJIIJIL) {
                    this.LLJJIJIIJIL = enumC780210Uj5LIZIZ;
                    int iLIZLLL2 = (int) (LIZLLL() * this.LLJJIJIIJIL.getRatio());
                    this.LLJILJIL = iLIZLLL2;
                    int iLJ5 = (int) (iLIZLLL2 * LJ());
                    this.LLJILJILJ = iLJ5;
                    int i6 = this.LLJILJIL;
                    iLJI3 = LJI(i6 - this.LLJI, iLJ5 - this.LLJIJIL, i6, iLJ5);
                }
                int iLJ6 = (int) (this.LLJILJIL * LJ());
                this.LLJILJILJ = iLJ6;
                int i7 = this.LLJILJIL;
                LIZ(view, i7 - this.LLJI, iLJ6 - this.LLJIJIL, i7, iLJ6);
                int i8 = this.LLJILJIL;
                this.LLJI = i8;
                this.LLJIJIL = this.LLJILJILJ;
                this.LLJJIJIIJIL = LIZJ(i8);
                this.LLILLL.invoke(Integer.valueOf((int) ((this.LLJILJIL * 100) / LIZLLL())), this.LLJJIJIIJIL);
                this.LLILZ.invoke(Integer.valueOf(this.LLJILJIL), Integer.valueOf(this.LLJILJILJ), this.LLJJIJIIJIL);
            }
        }
        boolean z2 = this.LLJ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return z2;
    }

    public final boolean LJFF(int i, int i2, int i3) {
        if (((C497740JfY.LJIIZILJ() - (this.LLJILLL * 2)) - i) - i3 < 0 || (C497740JfY.LJIILLIIL() - (this.LLJJ * 2)) - i2 < 0) {
            return false;
        }
        return true;
    }

    public final int LJI(int i, int i2, int i3, int i4) {
        EnumC780260UjA enumC780260UjA = this.LLIZLLLIL;
        int[] iArr = C780250Uj9.LIZ;
        int i5 = iArr[enumC780260UjA.ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3 && i5 != 4) {
                throw new C1954807lC();
            }
            if (this.LLJJJJJIL[0] + i3 > this.LLJJJIL - this.LLJILLL) {
                return i3 - i;
            }
        } else if (this.LLJJJJJIL[0] - i < this.LLJILLL) {
            return i3 - i;
        }
        int i6 = iArr[this.LLIZLLLIL.ordinal()];
        if (i6 != 1) {
            if (i6 != 2 && i6 != 3) {
                if (i6 != 4) {
                    throw new C1954807lC();
                }
            } else {
                if (this.LLJJJJJIL[1] - i2 < this.LLJJ) {
                    return i3 - i;
                }
                return i3;
            }
        }
        if (this.LLJJJJJIL[1] + i4 > this.LLJJJJ - this.LLJJ) {
            return i3 - i;
        }
        return i3;
    }

    public ViewOnTouchListenerC780220Uj6(ConstraintLayout constraintLayout, LiveIconView liveIconView, C780230Uj7 c780230Uj7, AwS661S0100000_12 awS661S0100000_12, AwS626S0100000_12 awS626S0100000_12) {
        this.LL = constraintLayout;
        this.LLILLJJLI = liveIconView;
        this.LLILLL = c780230Uj7;
        this.LLILZ = awS661S0100000_12;
        this.LLILZIL = awS626S0100000_12;
        HandlerHook.viewPost(this.LL, new ARunnableS112S0100000_12(this, 437));
        this.LLJJJJJIL = new int[2];
    }

    public final void LIZ(View view, int i, int i2, int i3, int i4) {
        int i5 = C780250Uj9.LIZ[this.LLIZLLLIL.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    this.LLILZIL.invoke(0, Integer.valueOf(-i2));
                    int[] iArr = this.LLJJJJJIL;
                    iArr[1] = iArr[1] - i2;
                }
            } else {
                this.LLILZIL.invoke(Integer.valueOf(-i), Integer.valueOf(-i2));
                int[] iArr2 = this.LLJJJJJIL;
                iArr2[0] = iArr2[0] - i;
                iArr2[1] = iArr2[1] - i2;
            }
        } else {
            this.LLILZIL.invoke(Integer.valueOf(-i), 0);
            int[] iArr3 = this.LLJJJJJIL;
            iArr3[0] = iArr3[0] - i;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i4;
        C786410Ut5.W5(view, layoutParams);
    }
}
