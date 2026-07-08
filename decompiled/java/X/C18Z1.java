package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.18Z1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Z1 extends C16GX {
    public C18Z1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnTouchListener(new View.OnTouchListener() { // from class: X.18Z2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }
}
