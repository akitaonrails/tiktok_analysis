package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.AwS654S0100000_5;

/* JADX INFO: renamed from: X.0FWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C391570FWx implements SeekBar.OnSeekBarChangeListener {
    public final int $t;
    public Object l0;

    public static final void onProgressChanged$7(C391570FWx c391570FWx, SeekBar seekBar, int i, boolean z) {
    }

    public static final void onStartTrackingTouch$1(C391570FWx c391570FWx, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$4(C391570FWx c391570FWx, SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.$t) {
            case 0:
                LIZ$0(seekBar);
                break;
            case 1:
                onProgressChanged$1(this, seekBar, i, z);
                break;
            case 2:
                onProgressChanged$2(this, seekBar, i, z);
                break;
            case 3:
                onProgressChanged$3(this, seekBar, i, z);
                break;
            case 4:
                onProgressChanged$4(this, seekBar, i, z);
                break;
            case 5:
                onProgressChanged$5(this, seekBar, i, z);
                break;
            case 6:
                onProgressChanged$6(this, seekBar, i, z);
                break;
            case 7:
                onProgressChanged$7(this, seekBar, i, z);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.$t) {
            case 0:
                onStartTrackingTouch$0(this, seekBar);
                break;
            case 1:
                onStartTrackingTouch$1(this, seekBar);
                break;
            case 2:
                onStartTrackingTouch$2(this, seekBar);
                break;
            case 3:
                onStartTrackingTouch$3(this, seekBar);
                break;
            case 4:
                onStartTrackingTouch$4(this, seekBar);
                break;
            case 5:
                onStartTrackingTouch$5(this, seekBar);
                break;
            case 6:
                onStartTrackingTouch$6(this, seekBar);
                break;
            case 7:
                onStartTrackingTouch$7(this, seekBar);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.$t) {
            case 0:
                onStopTrackingTouch$0(this, seekBar);
                break;
            case 1:
                onStopTrackingTouch$1(this, seekBar);
                break;
            case 2:
                onStopTrackingTouch$2(this, seekBar);
                break;
            case 3:
                onStopTrackingTouch$3(this, seekBar);
                break;
            case 4:
                onStopTrackingTouch$4(this, seekBar);
                break;
            case 5:
                onStopTrackingTouch$5(this, seekBar);
                break;
            case 6:
                onStopTrackingTouch$6(this, seekBar);
                break;
            case 7:
                onStopTrackingTouch$7(this, seekBar);
                break;
        }
    }

    public final void LIZ$0(SeekBar seekBar) {
        int iLIZIZ;
        int paddingStart = seekBar.getPaddingStart();
        int measuredWidth = (seekBar.getMeasuredWidth() - paddingStart) - seekBar.getPaddingEnd();
        if (!(seekBar instanceof C367060EaG)) {
            return;
        }
        TuxTextView tuxTextViewLLLLLLIL = ((C360920EDa) this.l0).LLLLLLIL();
        if (tuxTextViewLLLLLLIL != null) {
            Locale locale = Locale.ENGLISH;
            float actualProgress = ((C367060EaG) seekBar).getActualProgress() / 10.0f;
            ((C360920EDa) this.l0).getClass();
            tuxTextViewLLLLLLIL.setText(C786410Ut5.k4(locale, "%.1fs", Arrays.copyOf(new Object[]{Float.valueOf(((float) Math.floor(actualProgress * r4)) / 10)}, 1)));
        }
        TuxTextView tuxTextViewLLLLLLIL2 = ((C360920EDa) this.l0).LLLLLLIL();
        if (tuxTextViewLLLLLLIL2 == null || (iLIZIZ = tuxTextViewLLLLLLIL2.getMeasuredWidth()) == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53));
        }
        C367060EaG c367060EaG = (C367060EaG) seekBar;
        double x = ((double) ((c367060EaG.getX() + paddingStart) + (c367060EaG.getScale() * measuredWidth))) - (((double) iLIZIZ) / 2.0d);
        TuxTextView tuxTextViewLLLLLLIL3 = ((C360920EDa) this.l0).LLLLLLIL();
        if (tuxTextViewLLLLLLIL3 != null) {
            C426750GoL.LJIIIZ(tuxTextViewLLLLLLIL3, Integer.valueOf((int) x), null, null, null, false, 30);
        }
    }

    public final void LIZ$1(boolean z) {
        ViewParent parent;
        ViewParent parent2;
        ViewGroup viewGroup;
        ViewParent parent3;
        ViewParent parent4;
        ViewGroup viewGroup2;
        ViewParent parent5;
        ViewGroup viewGroup3;
        TuxTextView tuxTextView = ((C383470F1t) this.l0).LLILLL;
        ViewParent parent6 = null;
        if (tuxTextView != null) {
            parent = tuxTextView.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
            viewGroup3.setClipChildren(z);
        }
        TuxTextView tuxTextView2 = ((C383470F1t) this.l0).LLILLL;
        if (tuxTextView2 != null && (parent5 = tuxTextView2.getParent()) != null) {
            parent2 = parent5.getParent();
        } else {
            parent2 = null;
        }
        if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
            viewGroup2.setClipChildren(z);
        }
        TuxTextView tuxTextView3 = ((C383470F1t) this.l0).LLILLL;
        if (tuxTextView3 != null && (parent3 = tuxTextView3.getParent()) != null && (parent4 = parent3.getParent()) != null) {
            parent6 = parent4.getParent();
        }
        if ((parent6 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent6) != null) {
            viewGroup.setClipChildren(z);
        }
    }

    public final void LIZIZ$2(SeekBar seekBar) {
        int iLIZIZ;
        int iLIZIZ2;
        int paddingStart = seekBar.getPaddingStart();
        int measuredWidth = (seekBar.getMeasuredWidth() - paddingStart) - seekBar.getPaddingEnd();
        if (!(seekBar instanceof C367060EaG)) {
            return;
        }
        TuxTextView tuxTextView = ((C383470F1t) this.l0).LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(((C367060EaG) seekBar).getActualProgress()));
        }
        TuxTextView tuxTextView2 = ((C383470F1t) this.l0).LLILLL;
        int paddingTop = 0;
        if (tuxTextView2 == null || (iLIZIZ = tuxTextView2.getMeasuredWidth()) == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53));
        }
        TuxTextView tuxTextView3 = ((C383470F1t) this.l0).LLILLL;
        if (tuxTextView3 == null || (iLIZIZ2 = tuxTextView3.getMeasuredHeight()) == 0) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
        }
        C367060EaG c367060EaG = (C367060EaG) seekBar;
        double x = ((double) ((c367060EaG.getX() + paddingStart) + (c367060EaG.getScale() * measuredWidth))) - (((double) iLIZIZ) / 2.0d);
        C383470F1t c383470F1t = (C383470F1t) this.l0;
        TuxTextView tuxTextView4 = c383470F1t.LLILLL;
        if (tuxTextView4 != null) {
            int i = (int) x;
            int width = (c383470F1t.LLILLJJLI.getWidth() - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)));
            if (i > width) {
                i = width;
            }
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)));
            if (i < iLIZIZ3) {
                i = iLIZIZ3;
            }
            Integer numValueOf = Integer.valueOf(i);
            int top = ((C383470F1t) this.l0).LLILLJJLI.getTop() + c367060EaG.getTop();
            RecyclerView recyclerView = ((C383470F1t) this.l0).LL;
            if (recyclerView != null) {
                paddingTop = recyclerView.getPaddingTop();
            }
            C426750GoL.LJIIIZ(tuxTextView4, numValueOf, Integer.valueOf(((top + paddingTop) - iLIZIZ2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, null, false, 28);
        }
    }

    public C391570FWx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onStartTrackingTouch$0(C391570FWx c391570FWx, SeekBar seekBar) {
        C0E55 player;
        if (!(seekBar instanceof C367060EaG)) {
            return;
        }
        ((C367060EaG) seekBar).LJII(true);
        c391570FWx.LIZ$0(seekBar);
        TuxTextView tuxTextViewLLLLLLIL = ((C360920EDa) c391570FWx.l0).LLLLLLIL();
        if (tuxTextViewLLLLLLIL != null) {
            C12C5.LIZIZ(tuxTextViewLLLLLLIL, 0L, 0.0f, null, 7);
        }
        C0E48 c0e48LIZIZ = ((C360920EDa) c391570FWx.l0).LIZIZ();
        if (c0e48LIZIZ != null && (player = c0e48LIZIZ.getPlayer()) != null) {
            player.pause(false);
        }
    }

    public static final void onStartTrackingTouch$2(C391570FWx c391570FWx, SeekBar seekBar) {
        C367060EaG c367060EaG;
        if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
            c367060EaG.LJII(true);
        }
        ((C374830Emn) c391570FWx.l0).LLLLLLL(seekBar);
        TuxTextView tuxTextViewLLLLLLJ = ((C374830Emn) c391570FWx.l0).LLLLLLJ();
        if (tuxTextViewLLLLLLJ != null) {
            C12C5.LIZIZ(tuxTextViewLLLLLLJ, 0L, 0.0f, null, 7);
        }
    }

    public static final void onStartTrackingTouch$3(C391570FWx c391570FWx, SeekBar seekBar) {
        C367060EaG c367060EaG;
        if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
            c367060EaG.LJII(true);
        }
        ((C374830Emn) c391570FWx.l0).LLLLLLL(seekBar);
        TuxTextView tuxTextViewLLLLLLJ = ((C374830Emn) c391570FWx.l0).LLLLLLJ();
        if (tuxTextViewLLLLLLJ != null) {
            C12C5.LIZIZ(tuxTextViewLLLLLLJ, 0L, 0.0f, null, 7);
        }
    }

    public static final void onStartTrackingTouch$5(C391570FWx c391570FWx, SeekBar seekBar) {
        C367060EaG c367060EaG;
        C383450F1r c383450F1r = ((C383470F1t) c391570FWx.l0).LLJI;
        if (c383450F1r == null) {
            return;
        }
        if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
            c367060EaG.LJII(true);
        }
        AwS619S0100000_5 awS619S0100000_5 = ((C383470F1t) c391570FWx.l0).LLILZ;
        if (awS619S0100000_5 != null) {
            awS619S0100000_5.invoke(c383450F1r.LIZ, Float.valueOf(seekBar.getProgress() / 100.0f));
        }
        c391570FWx.LIZIZ$2(seekBar);
        TuxTextView tuxTextView = ((C383470F1t) c391570FWx.l0).LLILLL;
        if (tuxTextView != null) {
            C12C5.LIZIZ(tuxTextView, 0L, 0.0f, null, 7);
        }
        c391570FWx.LIZ$1(false);
    }

    public static final void onStartTrackingTouch$6(C391570FWx c391570FWx, SeekBar seekBar) {
        C0GX9 c0gx9;
        if ((seekBar instanceof C0GX9) && (c0gx9 = (C0GX9) seekBar) != null) {
            c0gx9.LJI();
        }
    }

    public static final void onStartTrackingTouch$7(C391570FWx c391570FWx, SeekBar seekBar) {
        ((C0EZS) c391570FWx.l0).LLJLIL = true;
    }

    public static final void onStopTrackingTouch$0(C391570FWx c391570FWx, SeekBar seekBar) {
        TuxTextView tuxTextViewLLLLLLIL = ((C360920EDa) c391570FWx.l0).LLLLLLIL();
        if (tuxTextViewLLLLLLIL != null) {
            C786410Ut5.B5(tuxTextViewLLLLLLIL, 1.0f);
        }
        TuxTextView tuxTextViewLLLLLLIL2 = ((C360920EDa) c391570FWx.l0).LLLLLLIL();
        if (tuxTextViewLLLLLLIL2 != null) {
            C12C5.LIZJ(tuxTextViewLLLLLLIL2, 0L, null, null, 15);
        }
        if (!(seekBar instanceof C367060EaG)) {
            return;
        }
        C367060EaG c367060EaG = (C367060EaG) seekBar;
        c367060EaG.LJII(false);
        ((C360920EDa) c391570FWx.l0).LLLLIL().LIZLLL(c367060EaG.getActualProgress());
    }

    public static final void onStopTrackingTouch$1(C391570FWx c391570FWx, SeekBar seekBar) {
        int progress;
        Function1<Integer, Unit> function1 = ((C374370Em3) c391570FWx.l0).LLLLIL().LIZJ;
        if (seekBar != null) {
            progress = seekBar.getProgress();
        } else {
            progress = 0;
        }
        function1.invoke(Integer.valueOf(progress));
    }

    public static final void onStopTrackingTouch$2(C391570FWx c391570FWx, SeekBar seekBar) {
        C367060EaG c367060EaG;
        ((C374830Emn) c391570FWx.l0).LLLLIL().LJ.invoke(EnumC374750Emf.STRENGTH);
        if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
            c367060EaG.LJII(false);
        }
        TuxTextView tuxTextViewLLLLLLJ = ((C374830Emn) c391570FWx.l0).LLLLLLJ();
        if (tuxTextViewLLLLLLJ != null) {
            C0F29.LIZ(tuxTextViewLLLLLLJ, new AwS549S0100000_5((C374830Emn) c391570FWx.l0, 528), 7);
        }
    }

    public static final void onStopTrackingTouch$3(C391570FWx c391570FWx, SeekBar seekBar) {
        C367060EaG c367060EaG;
        ((C374830Emn) c391570FWx.l0).LLLLIL().LJ.invoke(EnumC374750Emf.SHADOW);
        if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
            c367060EaG.LJII(false);
        }
        TuxTextView tuxTextViewLLLLLLJ = ((C374830Emn) c391570FWx.l0).LLLLLLJ();
        if (tuxTextViewLLLLLLJ != null) {
            C0F29.LIZ(tuxTextViewLLLLLLJ, new AwS549S0100000_5((C374830Emn) c391570FWx.l0, 531), 7);
        }
    }

    public static final void onStopTrackingTouch$4(C391570FWx c391570FWx, SeekBar seekBar) {
        int progress;
        Function1<Integer, Unit> function1 = ((C374180Elk) c391570FWx.l0).LLLLIL().LIZLLL;
        if (seekBar != null) {
            progress = seekBar.getProgress();
        } else {
            progress = 0;
        }
        function1.invoke(Integer.valueOf(progress));
    }

    public static final void onStopTrackingTouch$5(C391570FWx c391570FWx, SeekBar seekBar) {
        C367060EaG c367060EaG;
        C383450F1r c383450F1r = ((C383470F1t) c391570FWx.l0).LLJI;
        if (c383450F1r == null || seekBar == null) {
            return;
        }
        if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
            c367060EaG.LJII(false);
        }
        AwS619S0100000_5 awS619S0100000_5 = ((C383470F1t) c391570FWx.l0).LLILZLL;
        if (awS619S0100000_5 != null) {
            awS619S0100000_5.invoke(c383450F1r.LIZ, Float.valueOf(seekBar.getProgress() / 100.0f));
        }
        C383470F1t c383470F1t = (C383470F1t) c391570FWx.l0;
        TuxTextView tuxTextView = c383470F1t.LLILLL;
        if (tuxTextView != null) {
            C0F29.LIZ(tuxTextView, new AwS406S0200000_5(c383470F1t, c391570FWx, 55), 7);
        }
    }

    public static final void onStopTrackingTouch$6(C391570FWx c391570FWx, SeekBar seekBar) {
        int progress;
        C0GX9 c0gx9;
        if ((seekBar instanceof C0GX9) && (c0gx9 = (C0GX9) seekBar) != null) {
            c0gx9.LJI();
        }
        C0EBL c0eblLLLLIL = ((C0EBH) c391570FWx.l0).LLLLIL();
        if (seekBar != null) {
            progress = seekBar.getProgress();
        } else {
            progress = 0;
        }
        c0eblLLLLIL.LIZLLL(progress);
    }

    public static final void onStopTrackingTouch$7(C391570FWx c391570FWx, SeekBar seekBar) {
        int progress = 0;
        ((C0EZS) c391570FWx.l0).LLJLIL = false;
        if (seekBar != null) {
            progress = seekBar.getProgress();
        }
        ((C0EZS) c391570FWx.l0).LLLLIL().LJ.invoke(Integer.valueOf((((C0EZS) c391570FWx.l0).LLLLILI().LIZ.LJ * progress) / 100));
    }

    public static final void onProgressChanged$1(C391570FWx c391570FWx, SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((C374370Em3) c391570FWx.l0).LLLLIL().LIZIZ.invoke(Integer.valueOf(i));
        }
    }

    public static final void onProgressChanged$2(C391570FWx c391570FWx, SeekBar seekBar, int i, boolean z) {
        TuxTextView tuxTextViewLLLLLJLJLL = ((C374830Emn) c391570FWx.l0).LLLLLJLJLL();
        if (tuxTextViewLLLLLJLJLL != null) {
            tuxTextViewLLLLLJLJLL.setText(String.valueOf(i));
        }
        ((C374830Emn) c391570FWx.l0).LLLLIL().LIZ.invoke(Float.valueOf(i / 100));
        ((C374830Emn) c391570FWx.l0).LLLLLLL(seekBar);
    }

    public static final void onProgressChanged$3(C391570FWx c391570FWx, SeekBar seekBar, int i, boolean z) {
        TuxTextView tuxTextViewLLLLLLIL = ((C374830Emn) c391570FWx.l0).LLLLLLIL();
        if (tuxTextViewLLLLLLIL != null) {
            tuxTextViewLLLLLLIL.setText(String.valueOf(i));
        }
        ((C374830Emn) c391570FWx.l0).LLLLIL().LIZIZ.invoke(Float.valueOf(i / 100));
        ((C374830Emn) c391570FWx.l0).LLLLLLL(seekBar);
    }

    public static final void onProgressChanged$4(C391570FWx c391570FWx, SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((C374180Elk) c391570FWx.l0).LLLLIL().LIZJ.invoke(Integer.valueOf(i));
        }
    }

    public static final void onProgressChanged$5(C391570FWx c391570FWx, SeekBar seekBar, int i, boolean z) {
        C383470F1t c383470F1t = (C383470F1t) c391570FWx.l0;
        C383450F1r c383450F1r = c383470F1t.LLJI;
        if (c383450F1r == null) {
            return;
        }
        AwS654S0100000_5 awS654S0100000_5 = c383470F1t.LLILZIL;
        if (awS654S0100000_5 != null) {
            awS654S0100000_5.invoke(c383450F1r.LIZ, Float.valueOf(seekBar.getProgress() / 100.0f), Boolean.valueOf(z));
        }
        c391570FWx.LIZIZ$2(seekBar);
    }

    public static final void onProgressChanged$6(C391570FWx c391570FWx, SeekBar seekBar, int i, boolean z) {
        ((C0EBH) c391570FWx.l0).LLLLIL().LIZIZ(i, z);
    }
}
