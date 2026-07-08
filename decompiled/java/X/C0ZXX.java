package X;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;

/* JADX INFO: renamed from: X.0ZXX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXX implements C0ZY6 {
    public static final C0ZXX LIZ = new C0ZXX();

    @Override // X.C0ZY6
    public final View LIZ(View view, boolean z) {
        View viewLJFF;
        IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (iIMMessageBubbleService != null && (viewLJFF = iIMMessageBubbleService.LJFF(view, z)) != null) {
            return viewLJFF;
        }
        return null;
    }
}
