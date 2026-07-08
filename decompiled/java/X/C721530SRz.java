package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C721530SRz extends C2217421BqW implements Function1<MotionEvent, Unit> {
    public C721530SRz(Object obj) {
        super(1, obj, PostModeNestHeaderComponent.class, "onUserTouchList", "onUserTouchList(Landroid/view/MotionEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        PostModeNestHeaderComponent postModeNestHeaderComponent = (PostModeNestHeaderComponent) this.receiver;
        if (postModeNestHeaderComponent.LJJJLZIJ()) {
            postModeNestHeaderComponent.LJJJ(motionEvent2);
        } else {
            postModeNestHeaderComponent.LLJLILLLLZIIL = false;
        }
        if (motionEvent2 != null && (motionEvent2.getAction() == 1 || motionEvent2.getAction() == 3)) {
            postModeNestHeaderComponent.LJJLIIIJILLIZJL();
        }
        return Unit.LIZ;
    }
}
