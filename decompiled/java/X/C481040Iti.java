package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0Iti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C481040Iti extends C16FB {
    @Override // X.C16FB, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C481040Iti(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewConfiguration.get(context).getScaledTouchSlop();
        new Rect();
        setScrollMode(EnumC481060Itk.REFRESH);
        setNestedHeader(new C446160HeY(context));
    }
}
