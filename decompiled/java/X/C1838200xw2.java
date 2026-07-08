package X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0xw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838200xw2 implements InterfaceC19716212Ca {
    public final ValueAnimator LIZ;

    @Override // X.InterfaceC19716212Ca
    public final void cancel() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // X.InterfaceC19716212Ca
    public final boolean isPaused() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            return valueAnimator.isPaused();
        }
        return false;
    }

    @Override // X.InterfaceC19716212Ca
    public final boolean isRunning() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            return valueAnimator.isRunning();
        }
        return false;
    }

    @Override // X.InterfaceC19716212Ca
    public final void pause() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    @Override // X.InterfaceC19716212Ca
    public final void start() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // X.InterfaceC19716212Ca
    public final void stop() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    public C1838200xw2(ValueAnimator valueAnimator) {
        this.LIZ = valueAnimator;
    }
}
