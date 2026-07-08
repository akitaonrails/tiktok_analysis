package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;

/* JADX INFO: renamed from: X.0yM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854330yM3 {
    public static final String LIZ(CreativeTemplate creativeTemplate) {
        Integer num = creativeTemplate.templateType;
        if (num != null) {
            if (num.intValue() == 1) {
                return "image_generation";
            }
            if (num.intValue() == 2) {
                return "video_generation";
            }
            return null;
        }
        return null;
    }
}
