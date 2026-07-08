package X;

import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0KtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531700KtE {
    public static final C0LAB LIZ(C0LAB c0lab, ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return c0lab;
        }
        TemplateConsumeData templateConsumeData = shortVideoContext.creativeModel.templateConsumeData;
        if (!templateConsumeData.LIZ()) {
            templateConsumeData = null;
        }
        if (templateConsumeData != null) {
            String str = templateConsumeData.templateType;
            if (str != null && str.length() > 0) {
                c0lab.LJ("tt_template_type", str);
            }
            String str2 = templateConsumeData.templateId;
            if (str2 == null) {
                str2 = "";
            }
            c0lab.LJ("mv_id", str2);
        } else {
            TemplateData templateData = shortVideoContext.creativeModel.templateData;
            String ttTemplateType = templateData.getTtTemplateType();
            if (ttTemplateType != null && ttTemplateType.length() > 0) {
                c0lab.LJ("tt_template_type", ttTemplateType);
            }
            c0lab.LJ("mv_id", templateData.getMvId());
        }
        c0lab.LJ("ai_template_func_list", shortVideoContext.creativeModel.pugcTemplateData.aiTemplateFuncList);
        return c0lab;
    }
}
