package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078390eAX extends GestureDetector {
    public final C1078410eAZ LIZ;

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function1<MotionEvent, Boolean> function1;
        if (motionEvent.getAction() == 1 && (function1 = ((C1078400eAY) this.LIZ).LLJ) != null && function1.invoke(motionEvent).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public C1078390eAX(Context context, C1078400eAY c1078400eAY) {
        super(context, c1078400eAY);
        this.LIZ = c1078400eAY;
    }
}
