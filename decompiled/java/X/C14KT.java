package X;

import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14KT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14KT {
    public static int LIZ(int i) {
        int iStatusBars;
        int i2 = 0;
        int i3 = 1;
        do {
            if ((i & i3) != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 4) {
                            if (i3 != 8) {
                                if (i3 != 16) {
                                    if (i3 != 32) {
                                        if (i3 != 64) {
                                            if (i3 == 128) {
                                                iStatusBars = WindowInsets.Type.displayCutout();
                                            }
                                        } else {
                                            iStatusBars = WindowInsets.Type.tappableElement();
                                        }
                                    } else {
                                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                                    }
                                } else {
                                    iStatusBars = WindowInsets.Type.systemGestures();
                                }
                            } else {
                                iStatusBars = WindowInsets.Type.ime();
                            }
                        } else {
                            iStatusBars = WindowInsets.Type.captionBar();
                        }
                    } else {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    }
                } else {
                    iStatusBars = WindowInsets.Type.statusBars();
                }
                i2 |= iStatusBars;
            }
            i3 <<= 1;
        } while (i3 <= 256);
        return i2;
    }
}
