package X;

import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19671811xs extends C2217421BqW implements Function1<GestureLayout$OnGestureListener, Unit> {
    public C19671811xs(C19671511xp c19671511xp) {
        super(1, c19671511xp, C19671511xp.class, "registerGesture", "registerGesture(Lcom/bytedance/createx/editor/gesture/GestureLayout$OnGestureListener;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GestureLayout$OnGestureListener gestureLayout$OnGestureListener) {
        ((C19671511xp) this.receiver).E5(gestureLayout$OnGestureListener);
        return Unit.LIZ;
    }
}
