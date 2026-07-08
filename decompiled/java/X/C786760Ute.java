package X;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: X.0Ute, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786760Ute implements CompoundButton.OnCheckedChangeListener {
    public final CompoundButton.OnCheckedChangeListener LL;

    public C786760Ute(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.LL = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C1847860yBc.LJ(compoundButton);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LL;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
        C1847860yBc.LIZLLL(compoundButton);
    }
}
