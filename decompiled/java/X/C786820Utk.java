package X;

import android.widget.SeekBar;

/* JADX INFO: renamed from: X.0Utk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786820Utk implements SeekBar.OnSeekBarChangeListener {
    public final SeekBar.OnSeekBarChangeListener LL;

    public C786820Utk(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.LL = onSeekBarChangeListener;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LL;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C1847860yBc.LJ(seekBar);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LL;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
        C1847860yBc.LIZLLL(seekBar);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LL;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }
}
