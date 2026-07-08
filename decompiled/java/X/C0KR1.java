package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.FlashDataProvider;
import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.NoFlashDataSignalInit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KR1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0KR1 extends View {
    public FlashDataProvider LL;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public final C0KR5 getViewBinder() {
        return null;
    }

    public void setNativeViewBinder(C0KR5 c0kr5) {
    }

    public final void setViewBinder(C0KR5 c0kr5) {
    }

    public final FlashDataProvider getDataProvider() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        try {
            super.onRestoreInstanceState(parcelable);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void setDataProvider(FlashDataProvider flashDataProvider) {
        this.LL = flashDataProvider;
    }

    public final void setFlashDataProvider(FlashDataProvider flashDataProvider) {
        this.LL = flashDataProvider;
    }

    public C0KR1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public C0KR1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(true);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        int i2 = NoFlashDataSignalInit.LLILZIL;
    }
}
