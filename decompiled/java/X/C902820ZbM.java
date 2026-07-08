package X;

import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetUserCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetSystemComponent;

/* JADX INFO: renamed from: X.0ZbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902820ZbM {
    public static final boolean LIZ(VisualPoetUserCardTemplate visualPoetUserCardTemplate) {
        VisualPoetSystemComponent visualPoetSystemComponent;
        String str;
        if (visualPoetUserCardTemplate == null || (visualPoetSystemComponent = visualPoetUserCardTemplate.systemContentComponent) == null || visualPoetUserCardTemplate.systemContentInvisible || ((str = visualPoetSystemComponent.text) != null && str.length() == 0)) {
            return false;
        }
        return true;
    }
}
