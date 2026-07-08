package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.124m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196966124m {
    public final SeekBar LIZ;
    public C196967124n<?> LIZIZ;
    public boolean LJ;
    public Function0<Unit> LJI;
    public float LIZJ = 0.75f;
    public float LIZLLL = 1.2f;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.124o
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int min;
            C196966124m c196966124m = this.LL;
            C196967124n<?> c196967124n = c196966124m.LIZIZ;
            if (c196967124n != null) {
                float f = message.arg1;
                if (Build.VERSION.SDK_INT >= 26) {
                    min = c196966124m.LIZ.getMin();
                } else {
                    min = 0;
                }
                float f2 = min;
                float max = c196966124m.LIZ.getMax();
                float f3 = c196966124m.LIZJ;
                float f4 = c196966124m.LIZLLL;
                if (f > f2) {
                    if (f >= max) {
                        f3 = f4;
                    } else {
                        f3 = ((f3 * (max - f)) + (f4 * (f - f2))) / (max - f2);
                    }
                }
                c196967124n.LJI(c196967124n.LIZJ() * f3);
                return true;
            }
            return true;
        }
    });

    public C196966124m(SeekBar seekBar) {
        this.LIZ = seekBar;
        C786410Ut5.wb(seekBar, new SeekBar.OnSeekBarChangeListener() { // from class: X.124p
            public int LL;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar2) {
                this.LL = seekBar2.getProgress();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar2) {
                Function0<Unit> function0;
                if (this.LL != seekBar2.getProgress() && (function0 = this.LLILLJJLI.LJI) != null) {
                    function0.invoke();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                C196966124m c196966124m = this.LLILLJJLI;
                if (c196966124m.LIZIZ != null) {
                    BPEAHandler bPEAHandler = c196966124m.LJFF;
                    C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(0, i, 0));
                }
            }
        });
    }

    public final void LIZ(float f) {
        int min;
        if (this.LJ) {
            SeekBar seekBar = this.LIZ;
            float f2 = this.LIZJ;
            float f3 = this.LIZLLL;
            if (Build.VERSION.SDK_INT >= 26) {
                min = seekBar.getMin();
            } else {
                min = 0;
            }
            float f4 = min;
            float max = this.LIZ.getMax();
            if (f > f2) {
                if (f >= f3) {
                    f4 = max;
                } else {
                    f4 = ((f4 * (f3 - f)) + (max * (f - f2))) / (f3 - f2);
                }
            }
            seekBar.setProgress(C814420VxA.LIZIZ(f4));
            this.LJ = false;
        }
    }

    public final void LIZIZ(TextView textView) {
        Object obj;
        C196967124n<?> c196967124n;
        this.LJ = true;
        C196967124n<?> c196967124n2 = this.LIZIZ;
        C196967124n<?> c196967124n3 = null;
        if (c196967124n2 != null) {
            obj = c196967124n2.LIZ;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(obj, textView)) {
            C196967124n<?> c196967124n4 = this.LIZIZ;
            if (c196967124n4 != null) {
                c196967124n4.LJFF();
            }
            C389630FPl c389630FPl = new C389630FPl(this);
            if (textView != null) {
                if (textView instanceof C124Y) {
                    c196967124n3 = new C196965124l((C124Y) textView, this, c389630FPl);
                } else {
                    c196967124n3 = new C196967124n<>(textView, this, c389630FPl);
                }
                c196967124n3.LJ();
            }
            this.LIZIZ = c196967124n3;
            return;
        }
        if (!this.LJ || (c196967124n = this.LIZIZ) == null) {
            return;
        }
        LIZ(c196967124n.LIZLLL() / c196967124n.LIZJ());
    }
}
