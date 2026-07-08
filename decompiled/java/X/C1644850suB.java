package X;

import android.widget.SeekBar;

/* JADX INFO: renamed from: X.0suB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644850suB implements InterfaceC1644690stv {
    public final SeekBar LIZ;

    @Override // X.InterfaceC1644690stv
    public final boolean getVisibility() {
        return this.LIZ.getVisibility() == 0;
    }

    @Override // X.InterfaceC1644690stv
    public final SeekBar getSeekBar() {
        return this.LIZ;
    }

    public C1644850suB(SeekBar seekBar) {
        this.LIZ = seekBar;
        C786410Ut5.LLIILZL(seekBar, 0);
    }

    @Override // X.InterfaceC1644690stv
    public final void setVisibility(boolean z) {
        int i;
        SeekBar seekBar = this.LIZ;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLIILZL(seekBar, i);
    }
}
