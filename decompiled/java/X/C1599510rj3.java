package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;

/* JADX INFO: renamed from: X.0rj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599510rj3 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Object LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;

    public C1599510rj3(TemplateData templateData) {
        Object obj;
        Object obj2;
        Object obj3 = null;
        if (templateData != null) {
            obj = templateData.imageUrl;
            if (obj == null) {
                obj = templateData.localImageUrl;
            }
        } else {
            obj = null;
        }
        this.LIZ = obj;
        if (templateData != null) {
            obj2 = templateData.badgeUrl;
            if (obj2 == null) {
                obj2 = templateData.localBadgeUrl;
            }
        } else {
            obj2 = null;
        }
        this.LIZIZ = obj2;
        if (templateData != null && (obj3 = templateData.title) == null) {
            obj3 = templateData.localTitle;
        }
        this.LIZJ = obj3;
    }
}
