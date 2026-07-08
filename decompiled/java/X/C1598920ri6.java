package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0ri6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598920ri6 {
    public static final C1598920ri6 LIZ = new C1598920ri6();

    public static UrlModel LIZ(InterfaceC1891350zJl interfaceC1891350zJl, InterfaceC1595240rcA interfaceC1595240rcA) {
        User user;
        UrlModel urlModel;
        if (interfaceC1891350zJl instanceof C1598140rgq) {
            SkylightData skylightData = ((C1598140rgq) interfaceC1891350zJl).LLILLJJLI;
            TemplateData templateData = skylightData.templateData;
            if (templateData != null && (urlModel = templateData.imageUrl) != null) {
                return urlModel;
            }
            CustomBizData customBizData = skylightData.customBizData;
            if (customBizData == null || (user = customBizData.user) == null) {
                return null;
            }
            return user.getAvatarThumb();
        }
        User user2 = interfaceC1595240rcA.getUser();
        if (user2 == null) {
            return null;
        }
        return user2.getAvatarThumb();
    }
}
