package X;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13an, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C20038313an extends C2217421BqW implements Function2<C20071313g7, C1683130ttv, Boolean> {
    public C20038313an(Object obj) {
        super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(C20071313g7 c20071313g7, C1683130ttv c1683130ttv) {
        return Boolean.valueOf(AndroidComposeView.LJJIIZ((AndroidComposeView) this.receiver, c20071313g7, c1683130ttv));
    }
}
