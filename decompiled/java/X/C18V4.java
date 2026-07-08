package X;

import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import java.util.List;

/* JADX INFO: renamed from: X.18V4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18V4 {
    public static final C18V5 LIZ(ImageComponent imageComponent) {
        C0L9R c0l9r = null;
        if (imageComponent.urls.isEmpty()) {
            return null;
        }
        List<String> list = imageComponent.urls;
        ResolutionComponent resolutionComponent = imageComponent.resolution;
        if (resolutionComponent != null) {
            c0l9r = new C0L9R(resolutionComponent.width, resolutionComponent.height);
        }
        return new C18V5(list, c0l9r);
    }
}
