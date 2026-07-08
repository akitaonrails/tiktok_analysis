package X;

import android.view.View;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: renamed from: X.0DPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338700DPo implements InterfaceC338730DPr {
    public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(540));
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640));

    @Override // X.InterfaceC338730DPr
    public final void LIZIZ(int i, int i2, C338760DPu c338760DPu, AwS618S0100000_4 awS618S0100000_4) {
        awS618S0100000_4.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        View childAt = c338760DPu.getChildAt(0);
        childAt.measure(View.MeasureSpec.makeMeasureSpec(LIZ, 1073741824), View.MeasureSpec.makeMeasureSpec(C13LZ.LJ(childAt.getMeasuredHeight(), LIZIZ, LIZJ), 1073741824));
    }

    @Override // X.InterfaceC338730DPr
    public final void LIZ(boolean z, int i, int i2, int i3, int i4, C338760DPu c338760DPu, C346580DiK c346580DiK) {
        C338720DPq.LIZ(c338760DPu.getChildAt(0), i, i2, i3, i4);
    }
}
