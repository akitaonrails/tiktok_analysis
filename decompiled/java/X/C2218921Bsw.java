package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: renamed from: X.1Bsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218921Bsw extends OrientationEventListener {
    public final InterfaceC2218931Bsx LIZ;

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i > 45 && i <= 315) {
            if (46 <= i) {
                if (i < 136) {
                    i = 90;
                } else if (i < 226) {
                    i = 180;
                } else {
                    i = 270;
                }
            }
        } else {
            i = 0;
        }
        this.LIZ.LIZ(i);
    }

    public C2218921Bsw(Context context, InterfaceC2218931Bsx interfaceC2218931Bsx) {
        super(context);
        this.LIZ = interfaceC2218931Bsx;
    }
}
