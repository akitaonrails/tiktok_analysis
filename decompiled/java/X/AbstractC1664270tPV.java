package X;

import android.view.View;

/* JADX INFO: renamed from: X.0tPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1664270tPV implements InterfaceC1664320tPa {
    public final View LIZIZ;
    public final C19470511Fn LIZ = null;
    public int LIZJ = -1;

    public AbstractC1664270tPV(View view) {
        this.LIZIZ = view;
    }

    public final void LJFF(int i) {
        C19470711Fp avTextView;
        C19470511Fn c19470511Fn = this.LIZ;
        if (c19470511Fn != null && (avTextView = c19470511Fn.getAvTextView()) != null) {
            avTextView.setTextColor(i);
        }
    }

    public final void LJI(int i) {
        C19470711Fp avTextView;
        C19470511Fn c19470511Fn = this.LIZ;
        if (c19470511Fn != null && (avTextView = c19470511Fn.getAvTextView()) != null) {
            avTextView.setTuxFont(i);
        }
    }
}
