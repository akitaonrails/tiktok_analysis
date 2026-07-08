package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.SeekBar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0jmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294020jmK extends C21413918rB {
    public InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super C1294020jmK, Unit> LLILLJJLI;

    public C1294020jmK(Context context) {
        new LinkedHashMap();
        super(context, null);
        getThumb().clearColorFilter();
        getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        getThumb().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() { // from class: X.0jfo
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                int progress;
                if (seekBar != null) {
                    progress = seekBar.getProgress();
                } else {
                    progress = 0;
                }
                C1294020jmK c1294020jmK = this.LL;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("currentDuration", Integer.valueOf(progress)));
                InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super C1294020jmK, Unit> interfaceC1631620sYq = c1294020jmK.LLILLJJLI;
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke("seekbegin", mapLIZJ, c1294020jmK);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                int progress;
                if (seekBar != null) {
                    progress = seekBar.getProgress();
                } else {
                    progress = 0;
                }
                C1294020jmK c1294020jmK = this.LL;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("currentDuration", Integer.valueOf(progress)));
                InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super C1294020jmK, Unit> interfaceC1631620sYq = c1294020jmK.LLILLJJLI;
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke("seekend", mapLIZJ, c1294020jmK);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                int progress;
                if (seekBar != null) {
                    progress = seekBar.getProgress();
                } else {
                    progress = 0;
                }
                C1294020jmK c1294020jmK = this.LL;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("currentDuration", Integer.valueOf(progress)));
                InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super C1294020jmK, Unit> interfaceC1631620sYq = c1294020jmK.LLILLJJLI;
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke("seekchanged", mapLIZJ, c1294020jmK);
                }
            }
        };
        setOnSeekBarChangeListener(C1848410yCV.LIZ ? new C786820Utk(onSeekBarChangeListener) : onSeekBarChangeListener);
    }

    public final void setStateReporter(InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super C1294020jmK, Unit> interfaceC1631620sYq) {
        this.LLILLJJLI = interfaceC1631620sYq;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
