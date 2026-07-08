package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0Udp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C776950Udp extends LinearLayout {
    public C777210UeF LL;
    public C776940Udo LLILLJJLI;

    public C776950Udp(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 4) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        C777210UeF c777210UeF = this.LL;
        if (c777210UeF != null) {
            c777210UeF.LIZIZ();
        }
        C776940Udo c776940Udo = this.LLILLJJLI;
        if (c776940Udo != null) {
            AtomicLong atomicLong = c776940Udo.LIZIZ;
            atomicLong.set(atomicLong.get() + 1);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
