package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FM0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FM0 {
    public final SeekBar LIZ;
    public final C1664680tQA<TextStickerModel> LIZIZ;
    public C0FM2<?> LIZJ;
    public boolean LJFF;
    public Function0<Unit> LJII;
    public float LIZLLL = 0.75f;
    public float LJ = 1.2f;
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0FM4
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int min;
            C0FM0 c0fm0 = this.LL;
            C0FM2<?> c0fm2 = c0fm0.LIZJ;
            if (c0fm2 != null) {
                float f = message.arg1;
                if (Build.VERSION.SDK_INT >= 26) {
                    min = c0fm0.LIZ.getMin();
                } else {
                    min = 0;
                }
                float f2 = min;
                float max = c0fm0.LIZ.getMax();
                float f3 = c0fm0.LIZLLL;
                float f4 = c0fm0.LJ;
                if (f > f2) {
                    if (f >= max) {
                        f3 = f4;
                    } else {
                        f3 = ((f3 * (max - f)) + (f4 * (f - f2))) / (max - f2);
                    }
                }
                c0fm2.LJI(c0fm2.LIZJ() * f3);
                return true;
            }
            return true;
        }
    });

    public final void LIZ(TextView textView) {
        TextView textView2;
        C0FM2<?> c0fm2;
        int min;
        this.LJFF = true;
        C0FM2<?> c0fm22 = this.LIZJ;
        C0FM2<?> c0fm23 = null;
        if (c0fm22 != null) {
            textView2 = c0fm22.LIZ;
        } else {
            textView2 = null;
        }
        if (!Intrinsics.LJFF(textView2, textView)) {
            C0FM2<?> c0fm24 = this.LIZJ;
            if (c0fm24 != null) {
                c0fm24.LJFF();
            }
            C0FM3 c0fm3 = new C0FM3(this);
            C1664680tQA<TextStickerModel> c1664680tQA = this.LIZIZ;
            if (textView != null) {
                if (textView instanceof C385340F8y) {
                    c0fm23 = new C0FM1((C385340F8y) textView, this, c0fm3, c1664680tQA);
                } else {
                    c0fm23 = new C0FM2<>(textView, this, c0fm3);
                }
                c0fm23.LJ();
            }
            this.LIZJ = c0fm23;
            return;
        }
        if (!this.LJFF || (c0fm2 = this.LIZJ) == null) {
            return;
        }
        float fLIZLLL = c0fm2.LIZLLL() / c0fm2.LIZJ();
        if (!this.LJFF) {
            return;
        }
        SeekBar seekBar = this.LIZ;
        float f = this.LIZLLL;
        float f2 = this.LJ;
        if (Build.VERSION.SDK_INT >= 26) {
            min = seekBar.getMin();
        } else {
            min = 0;
        }
        float f3 = min;
        float max = this.LIZ.getMax();
        if (fLIZLLL > f) {
            if (fLIZLLL >= f2) {
                f3 = max;
            } else {
                f3 = ((f3 * (f2 - fLIZLLL)) + (max * (fLIZLLL - f))) / (f2 - f);
            }
        }
        seekBar.setProgress(C814420VxA.LIZIZ(f3));
        this.LJFF = false;
    }

    public C0FM0(C388720FLy c388720FLy, C1664680tQA c1664680tQA) {
        this.LIZ = c388720FLy;
        this.LIZIZ = c1664680tQA;
        C786410Ut5.wb(c388720FLy, new SeekBar.OnSeekBarChangeListener() { // from class: X.0FLz
            public int LL;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                this.LL = seekBar.getProgress();
                this.LLILLJJLI.LIZIZ.LIZ.setAutoAdaptCanvas(false);
                this.LLILLJJLI.LIZIZ.LIZ.setAutoAdaptDpi(false);
                this.LLILLJJLI.LIZIZ.LIZ.setFixedFontSize(true);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                Function0<Unit> function0;
                if (this.LL != seekBar.getProgress() && (function0 = this.LLILLJJLI.LJII) != null) {
                    function0.invoke();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C0FM0 c0fm0 = this.LLILLJJLI;
                if (c0fm0.LIZJ != null) {
                    BPEAHandler bPEAHandler = c0fm0.LJI;
                    C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(0, i, 0));
                }
            }
        });
    }
}
