package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06Yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1627006Yq extends C2217421BqW implements Function2<View, MotionEvent, Boolean> {
    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(View view, MotionEvent motionEvent) {
        return Boolean.valueOf(((View.OnTouchListener) this.receiver).onTouch(view, motionEvent));
    }
}
