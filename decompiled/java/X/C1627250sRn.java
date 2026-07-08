package X;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1627250sRn extends C2217421BqW implements Function1<MotionEvent, Boolean> {
    public C1627250sRn(Object obj) {
        super(1, obj, C1627220sRk.class, "onSingleTapConfirmed", "onSingleTapConfirmed(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(MotionEvent motionEvent) {
        return ((C1627220sRk) this.receiver).w2(motionEvent);
    }
}
