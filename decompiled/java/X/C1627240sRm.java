package X;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1627240sRm extends C2217421BqW implements Function2<MotionEvent, MotionEvent, Boolean> {
    public C1627240sRm(Object obj) {
        super(2, obj, C1627220sRk.class, "dealGesture", "dealGesture(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return Boolean.valueOf(((C1627220sRk) this.receiver).Z1(motionEvent, motionEvent2));
    }
}
