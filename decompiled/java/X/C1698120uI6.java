package X;

import android.widget.SeekBar;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uI6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698120uI6 implements SeekBar.OnSeekBarChangeListener {
    public final int $t;
    public Object l0;

    public static final void onStartTrackingTouch$1(C1698120uI6 c1698120uI6, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$2(C1698120uI6 c1698120uI6, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$2(C1698120uI6 c1698120uI6, SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.$t) {
            case 0:
                onProgressChanged$0(this, seekBar, i, z);
                break;
            case 1:
                onProgressChanged$1(this, seekBar, i, z);
                break;
            case 2:
                onProgressChanged$2(this, seekBar, i, z);
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
        }
    }

    public C1698120uI6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onStartTrackingTouch$0(C1698120uI6 c1698120uI6, SeekBar seekBar) {
        InterfaceC1640220smi interfaceC1640220smi = ((C1644490stb) c1698120uI6.l0).LJ;
        if (interfaceC1640220smi != null) {
            interfaceC1640220smi.Qm();
        }
    }

    public static final void onStopTrackingTouch$0(C1698120uI6 c1698120uI6, SeekBar seekBar) {
        C1644490stb c1644490stb = (C1644490stb) c1698120uI6.l0;
        FilterBean filterBean = c1644490stb.LJIILIIL;
        if (filterBean != null) {
            c1644490stb.LJIIZILJ.onNext(new C1644460stY(EnumC588350N5t.CHANGE_END, Integer.valueOf(c1644490stb.LJIILJJIL), filterBean, Boolean.FALSE));
        }
    }

    public static final void onStopTrackingTouch$1(C1698120uI6 c1698120uI6, SeekBar seekBar) {
        C1644500stc c1644500stc = (C1644500stc) c1698120uI6.l0;
        FilterBean filterBean = c1644500stc.LJIIJJI;
        if (filterBean != null) {
            c1644500stc.LJIILJJIL.onNext(new C1644460stY(EnumC588350N5t.CHANGE_END, Integer.valueOf(c1644500stc.LJIIL), filterBean, Boolean.FALSE));
        }
    }

    public static final void onProgressChanged$0(C1698120uI6 c1698120uI6, SeekBar seekBar, int i, boolean z) {
        int defaultDotProgress;
        boolean z2;
        C12ME c12me;
        if ((seekBar instanceof C12ME) && (c12me = (C12ME) seekBar) != null) {
            defaultDotProgress = c12me.getDefaultDotProgress();
        } else {
            defaultDotProgress = -1;
        }
        C1644490stb c1644490stb = (C1644490stb) c1698120uI6.l0;
        if (defaultDotProgress == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1644490stb.LJIILJJIL = i;
        FilterBean filterBean = c1644490stb.LJIILIIL;
        if (filterBean != null) {
            c1644490stb.LJIIZILJ.onNext(new C1644460stY(EnumC588350N5t.CHANGING, Integer.valueOf(i), filterBean, Boolean.valueOf(z2)));
        }
    }

    public static final void onProgressChanged$1(C1698120uI6 c1698120uI6, SeekBar seekBar, int i, boolean z) {
        int defaultDotProgress;
        boolean z2;
        C12ME c12me;
        if ((seekBar instanceof C12ME) && (c12me = (C12ME) seekBar) != null) {
            defaultDotProgress = c12me.getDefaultDotProgress();
        } else {
            defaultDotProgress = -1;
        }
        C1644500stc c1644500stc = (C1644500stc) c1698120uI6.l0;
        if (defaultDotProgress == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1644500stc.LJIIL = i;
        FilterBean filterBean = c1644500stc.LJIIJJI;
        if (filterBean != null) {
            c1644500stc.LJIILJJIL.onNext(new C1644460stY(EnumC588350N5t.CHANGING, Integer.valueOf(i), filterBean, Boolean.valueOf(z2)));
        }
    }

    public static final void onProgressChanged$2(C1698120uI6 c1698120uI6, SeekBar seekBar, int i, boolean z) {
        ((Function1) c1698120uI6.l0).invoke(Integer.valueOf(i));
    }
}
