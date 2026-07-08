package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.OverScroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ICrashlyticsWrapperService;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0kRU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319540kRU extends C21578619ce {
    @Override // X.C21578619ce, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OverScroller overScroller;
        if (motionEvent.getAction() == 0) {
            computeScroll();
            if (!canScrollVertically(1) || !canScrollVertically(-1)) {
                try {
                    Field declaredField = C21578619ce.class.getDeclaredField("mScroller");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this);
                    if ((obj instanceof OverScroller) && (overScroller = (OverScroller) obj) != null) {
                        overScroller.forceFinished(true);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ICrashlyticsWrapperService iCrashlyticsWrapperServiceLIZLLL = CrashlyticsWrapperService.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error accessing mScroller field ");
                    sbLIZ.append(e);
                    iCrashlyticsWrapperServiceLIZLLL.LIZ(4, "WorkaroundNestedScrollView", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C1319540kRU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
