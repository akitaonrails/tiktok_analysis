package X;

import Y.ARunnableS5S0001000_18;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0J34, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J34 extends C16FB {
    public float LLLFZ;
    public float LLLI;
    public float LLLII;
    public float LLLIIII;

    @Override // X.C16FB, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NearbyRefreshLayout: ACTION_CANCEL action=");
                        sbLIZ.append(motionEvent.getAction());
                        sbLIZ.append(", lastY:");
                        sbLIZ.append(this.LLLI);
                        sbLIZ.append(", y:");
                        sbLIZ.append(motionEvent.getY());
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (((int) Math.abs(this.LLLIIII - this.LLLI)) > ((int) Math.abs(this.LLLII - this.LLLFZ))) {
                            C1205260hTA c1205260hTA = C1205260hTA.LIZ;
                            int iLIZIZ = C814420VxA.LIZIZ(this.LLLIIII - this.LLLI);
                            c1205260hTA.getClass();
                            C823050WQl.LIZIZ().execute(new ARunnableS5S0001000_18(iLIZIZ, 0));
                        }
                    }
                } else {
                    this.LLLII = motionEvent.getX();
                    this.LLLIIII = motionEvent.getY();
                }
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("NearbyRefreshLayout: ACTION_UP action=");
                sbLIZ2.append(motionEvent.getAction());
                sbLIZ2.append(", lastY:");
                sbLIZ2.append(this.LLLI);
                sbLIZ2.append(", y:");
                sbLIZ2.append(motionEvent.getY());
                C2188811AlT.LIZIZ(sbLIZ2);
                if (((int) Math.abs(y - this.LLLI)) > ((int) Math.abs(x - this.LLLFZ))) {
                    C1205260hTA c1205260hTA2 = C1205260hTA.LIZ;
                    int iLIZIZ2 = C814420VxA.LIZIZ(y - this.LLLI);
                    c1205260hTA2.getClass();
                    C823050WQl.LIZIZ().execute(new ARunnableS5S0001000_18(iLIZIZ2, 0));
                }
            }
        } else {
            this.LLLFZ = motionEvent.getX();
            this.LLLI = motionEvent.getY();
            this.LLLII = 0.0f;
            this.LLLIIII = 0.0f;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0J34(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setScrollMode(EnumC481060Itk.REFRESH);
        setNestedHeader(new C446160HeY(context));
    }
}
