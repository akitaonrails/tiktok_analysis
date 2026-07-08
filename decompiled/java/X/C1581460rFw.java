package X;

import android.view.View;
import android.view.animation.Animation;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581460rFw implements InterfaceC1575770r6l {
    public final int[] LIZ;
    public final View LIZIZ;
    public Function0<Unit> LIZJ;
    public boolean LIZLLL;

    public final Pair<Float, Float> LIZ() {
        this.LIZIZ.getLocationOnScreen(new int[2]);
        int[] iArr = this.LIZ;
        return new Pair<>(Float.valueOf(iArr[0] - r4[0]), Float.valueOf(iArr[1] - r4[1]));
    }

    @Override // X.InterfaceC1575770r6l
    public final void cancel() {
        this.LIZLLL = true;
        Animation animation = this.LIZIZ.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
    }

    public C1581460rFw(View view, int[] iArr) {
        this.LIZ = iArr;
        this.LIZIZ = view;
    }
}
