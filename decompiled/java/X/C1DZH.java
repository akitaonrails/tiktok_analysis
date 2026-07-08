package X;

import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1DZH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DZH implements SeekBar.OnSeekBarChangeListener {
    public final C0S3W LL;
    public final List<C1DZP> LLILLJJLI = new ArrayList();

    public C1DZH(C0S3W c0s3w) {
        this.LL = c0s3w;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DZP) it2.next()).LIZ();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DZP) it2.next()).LIZIZ();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C1DZP) it2.next()).onProgressChanged(i);
        }
    }
}
