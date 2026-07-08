package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480080IsA extends LiveIconView implements InterfaceC480120IsE {
    public Function1<? super View, Unit> LLJJIJIIJIL;

    @Override // com.bytedance.android.live.design.view.icon.LiveIconView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final boolean performClick() {
        Function1<View, Unit> eventClickListener;
        if (C500260Jjc.LJJJJIZL(this) && (eventClickListener = getEventClickListener()) != null) {
            eventClickListener.invoke(this);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performClick: eventClickListener: ");
        sbLIZ.append(getEventClickListener());
        sbLIZ.append(", visible: ");
        sbLIZ.append(C500260Jjc.LJJJJIZL(this));
        C20441214yg.LIZIZ("LiveHostSettingEventMonitorLiveIconView", C2188811AlT.LIZIZ(sbLIZ));
        return super.performClick();
    }

    public Function1<View, Unit> getEventClickListener() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.bytedance.android.live.design.view.icon.LiveIconView, X.C16FY, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.InterfaceC480120IsE
    public void setEventClickListener(Function1<? super View, Unit> function1) {
        this.LLJJIJIIJIL = function1;
    }

    public C480080IsA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C480080IsA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClickable(true);
    }
}
