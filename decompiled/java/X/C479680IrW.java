package X;

import Y.AObjectS382S0100000_7;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0IrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479680IrW extends LiveIconView {
    public LiveWidget LLJJIJIIJIL;
    public AObjectS382S0100000_7 LLJJIJIL;
    public C21546719Ub LLJJJ;
    public C477580Io8 LLJJJIL;
    public EnterRoomConfig LLJJJJ;
    public InterfaceC479770Irf LLJJJJJIL;
    public AObjectS382S0100000_7 LLJJJJLIIL;

    @Override // com.bytedance.android.live.design.view.icon.LiveIconView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
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

    public final void setCloseWidgetDelegate(LiveWidget liveWidget) {
        this.LLJJIJIIJIL = liveWidget;
    }

    public C479680IrW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C479680IrW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C500260Jjc.LJLIIIL(500L, this, new AwS586S0100000_7(this, 320));
    }
}
