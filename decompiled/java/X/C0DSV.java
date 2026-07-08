package X;

import Y.ATListenerS438S0100000_4;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DSV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DSV extends FrameLayout {
    public long LL;
    public final FrameLayout LLILLJJLI;
    public final SeekBar LLILLL;
    public final FrameLayout LLILZ;
    public final LinearLayout LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public Function1<? super Float, Unit> LLIZLLLIL;

    public C0DSV(C1361400lX0 c1361400lX0) {
        super(c1361400lX0, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(c1361400lX0), R.layout.frd, this, true);
        findViewById(R.id.xd8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.xdb);
        this.LLILLL = seekBar;
        this.LLILZ = (FrameLayout) findViewById(R.id.xda);
        this.LLILZIL = (LinearLayout) findViewById(R.id.xd_);
        this.LLILZLL = (TuxTextView) findViewById(R.id.xd9);
        this.LLIZ = (TuxTextView) findViewById(R.id.xdc);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.xd7);
        this.LLILLJJLI = frameLayout;
        C07QI.LIZ.getClass();
        if (C07QI.LIZ() && frameLayout != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, 50331648, 83886080, 117440512, 218103808, 335544320, 436207616, 587202560, 855638016});
            if (Build.VERSION.SDK_INT >= 29) {
                gradientDrawable.setColors(new int[]{0, 50331648, 83886080, 117440512, 218103808, 335544320, 436207616, 587202560, 855638016}, new float[]{0.0f, 0.1144f, 0.2316f, 0.3098f, 0.427f, 0.5442f, 0.681f, 0.8254f, 0.974f});
            }
            frameLayout.setBackground(gradientDrawable);
        }
        if (seekBar != null) {
            seekBar.setOnTouchListener(new ATListenerS438S0100000_4(this, 3));
            C786410Ut5.wb(seekBar, new SeekBar.OnSeekBarChangeListener() { // from class: X.0DSU
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar2) {
                    if (Build.VERSION.SDK_INT >= 29 && seekBar2 != null) {
                        seekBar2.setProgressDrawable(C800330VaR.LIZIZ(this.LL.getContext(), R.drawable.dfp));
                        seekBar2.setThumb(C800330VaR.LIZIZ(this.LL.getContext(), R.drawable.dfq));
                        seekBar2.setMaxHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar2) {
                    int progress;
                    if (seekBar2 != null) {
                        progress = seekBar2.getProgress();
                    } else {
                        progress = 0;
                    }
                    Function1<? super Float, Unit> function1 = this.LL.LLIZLLLIL;
                    if (function1 != null) {
                        function1.invoke(Float.valueOf(progress));
                    }
                    LinearLayout linearLayout = this.LL.LLILZIL;
                    if (linearLayout != null) {
                        C786410Ut5.LJZL(4, linearLayout);
                    }
                    if (Build.VERSION.SDK_INT >= 29 && seekBar2 != null) {
                        seekBar2.setProgressDrawable(C800330VaR.LIZIZ(this.LL.getContext(), R.drawable.dfo));
                        seekBar2.setThumb(C800330VaR.LIZIZ(this.LL.getContext(), R.drawable.dfr));
                        seekBar2.setMaxHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                    if (z) {
                        LinearLayout linearLayout = this.LL.LLILZIL;
                        if (linearLayout != null) {
                            C786410Ut5.LJZL(0, linearLayout);
                        }
                        TuxTextView tuxTextView = this.LL.LLILZLL;
                        if (tuxTextView != null) {
                            tuxTextView.setText(C0DSV.LIZ((int) (r0.LL * (i / 100.0f))));
                        }
                        C0DSV c0dsv = this.LL;
                        TuxTextView tuxTextView2 = c0dsv.LLIZ;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(C0DSV.LIZ((int) c0dsv.LL));
                            return;
                        }
                        return;
                    }
                    if (seekBar2 == null || seekBar2.getVisibility() != 4) {
                        return;
                    }
                    C786410Ut5.LLIILZL(seekBar2, 0);
                    FrameLayout frameLayout2 = this.LL.LLILZ;
                    if (frameLayout2 == null) {
                        return;
                    }
                    C786410Ut5.LJZ(8, frameLayout2);
                }
            });
        }
    }

    public static String LIZ(int i) {
        if (i <= 0) {
            return "00:00";
        }
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
    }

    public final void setCurrentProgress(float f) {
        SeekBar seekBar = this.LLILLL;
        if (seekBar != null) {
            seekBar.setProgress((int) f);
        }
    }

    public final void setOnSeekListener(Function1<? super Float, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    public final void setVideoDuration(long j) {
        this.LL = j;
    }
}
