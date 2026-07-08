package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19748912Op extends FrameLayout {
    public final C16F5 LL;
    public final SeekBar LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public final int LLIZLLLIL;
    public final boolean LLJ;

    public final void LIZ(SeekBar seekBar) {
        int progress = seekBar.getProgress();
        this.LLILZLL = progress;
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            int paddingLeft = seekBar.getPaddingLeft();
            int measuredWidth = (seekBar.getMeasuredWidth() - paddingLeft) - seekBar.getPaddingRight();
            c16f5.setText(String.valueOf(progress));
            int i = this.LLILZIL;
            if (progress <= i && i > 0) {
                double measuredWidth2 = ((double) (paddingLeft + ((progress / i) * measuredWidth))) - (((double) c16f5.getMeasuredWidth()) / 2.0d);
                if (C497740JfY.LJJ()) {
                    measuredWidth2 = -measuredWidth2;
                }
                C786410Ut5.Rc(c16f5, (float) measuredWidth2);
                C786410Ut5.od(c16f5, this.LLIZLLLIL);
            }
        }
    }

    public final void setCurrentProgress(int i) {
        SeekBar seekBar = this.LLILLJJLI;
        if (seekBar != null) {
            seekBar.setProgress(i);
        }
    }

    public final void setMaxProgress(int i) {
        this.LLILZIL = i;
        SeekBar seekBar = this.LLILLJJLI;
        if (seekBar != null) {
            seekBar.setMax(i);
        }
    }

    public final void setSeekbarListener(final SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        SeekBar seekBar = this.LLILLJJLI;
        if (seekBar != null) {
            C786410Ut5.wb(seekBar, new SeekBar.OnSeekBarChangeListener() { // from class: X.12Oq
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar2) {
                    onSeekBarChangeListener.onStartTrackingTouch(seekBar2);
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar2) {
                    onSeekBarChangeListener.onStopTrackingTouch(seekBar2);
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                    if (seekBar2 != null && i != this.LL.LLILZLL && i >= 0 && i <= seekBar2.getMax()) {
                        this.LL.LIZ(seekBar2);
                        onSeekBarChangeListener.onProgressChanged(seekBar2, i, true);
                    }
                }
            });
        }
    }

    public C19748912Op(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = 5;
        this.LLIZ = true;
        try {
            if (C520010KaN.LJJIIZI(context, true) != null) {
                FrameLayout.inflate(context, R.layout.h74, this);
            }
            C16F5 c16f5 = (C16F5) findViewById(R.id.ujq);
            this.LL = c16f5;
            SeekBar seekBar = (SeekBar) findViewById(R.id.ujs);
            this.LLILLJJLI = seekBar;
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveTextSeekBar);
                this.LLJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveTextSeekBar_seekbar_if_thumb_small, false);
                this.LLILZLL = typedArrayObtainStyledAttributes.getInteger(R$styleable.LiveTextSeekBar_seekbar_progress, 0);
                this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveTextSeekBar_seekbar_text_color, -1);
                this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LiveTextSeekBar_seekbar_text_size, (int) C497740JfY.LJJIFFI(14.0f));
                this.LLILZIL = typedArrayObtainStyledAttributes.getInteger(R$styleable.LiveTextSeekBar_seekbar_max_progress, 5);
                this.LLIZLLLIL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveTextSeekBar_seekbar_text_top_margin, (int) C497740JfY.LIZIZ(0.0f));
                typedArrayObtainStyledAttributes.recycle();
            }
            if (c16f5 != null) {
                c16f5.setText(String.valueOf(this.LLILZLL));
                c16f5.setTextColor(this.LLILLL);
                c16f5.setTextSize(0, this.LLILZ);
            }
            if (seekBar != null) {
                seekBar.setMax(this.LLILZIL);
            }
            if (this.LLJ && seekBar != null) {
                seekBar.setThumb(C497740JfY.LJIIJ(R.drawable.f_f));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("LiveTextSeekbar", e.toString());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LLIZ) {
            SeekBar seekBar = this.LLILLJJLI;
            if (seekBar != null) {
                LIZ(seekBar);
            }
            this.LLIZ = false;
        }
    }
}
