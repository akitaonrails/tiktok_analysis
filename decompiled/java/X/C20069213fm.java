package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C20069213fm extends C2217421BqW implements Function0<Unit> {
    public C20069213fm(Object obj) {
        super(0, obj, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewGroup viewGroup = (ViewGroup) this.receiver;
        if (viewGroup.isFocused() || viewGroup.hasFocus()) {
            viewGroup.clearFocus();
        } else if (viewGroup.hasFocus()) {
            View viewFindFocus = viewGroup.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            viewGroup.clearFocus();
        }
        return Unit.LIZ;
    }
}
