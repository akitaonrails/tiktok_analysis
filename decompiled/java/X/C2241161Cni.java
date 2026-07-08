package X;

import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetActionTemplateComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetErrorInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetQuotaComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetTnsComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241161Cni {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public static final VisualPoetErrorCardTemplate LIZ(C2241171Cnj c2241171Cnj, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        VisualPoetErrorInfoComponent visualPoetErrorInfoComponent;
        VisualPoetTnsComponent visualPoetTnsComponent;
        VisualPoetQuotaComponent visualPoetQuotaComponent;
        FallbackInfoComponent fallbackInfoComponentLIZ;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        ?? arrayList;
        C2241211Cnn c2241211Cnn = c2241171Cnj.error_info;
        String str = "";
        if (c2241211Cnn != null) {
            String str2 = c2241211Cnn.code;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = c2241211Cnn.message;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c2241211Cnn.detail;
            if (str4 == null) {
                str4 = "";
            }
            visualPoetErrorInfoComponent = new VisualPoetErrorInfoComponent(str2, str3, str4);
        } else {
            VisualPoetErrorInfoComponent.Companion.getClass();
            visualPoetErrorInfoComponent = VisualPoetErrorInfoComponent.EMPTY_VISUAL_POET_ERROR_INFO;
        }
        C2238691Cjj c2238691Cjj = c2241171Cnj.tns;
        if (c2238691Cjj != null) {
            String str5 = c2238691Cjj.text;
            if (str5 == null) {
                str5 = "";
            }
            List<C2238721Cjm> list = c2238691Cjj.action_template;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C2238721Cjm c2238721Cjm : list) {
                    String str6 = c2238721Cjm.key;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = c2238721Cjm.name;
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = c2238721Cjm.schema;
                    if (str8 == null) {
                        str8 = "";
                    }
                    arrayList.add(new VisualPoetActionTemplateComponent(str6, str7, str8));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            visualPoetTnsComponent = new VisualPoetTnsComponent(str5, arrayList);
        } else {
            VisualPoetTnsComponent.Companion.getClass();
            visualPoetTnsComponent = VisualPoetTnsComponent.EMPTY_VISUAL_POET_TNS_COMPONENT;
        }
        C2241191Cnl c2241191Cnl = c2241171Cnj.quota;
        if (c2241191Cnl != null) {
            String str9 = c2241191Cnl.title;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = c2241191Cnl.subtitle;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = c2241191Cnl.button_title;
            if (str11 == null) {
                str11 = "";
            }
            String str12 = c2241191Cnl.schema;
            if (str12 != null) {
                str = str12;
            }
            visualPoetQuotaComponent = new VisualPoetQuotaComponent(str9, str10, str11, str, Intrinsics.LJFF(c2241191Cnl.button_invisible, Boolean.TRUE));
        } else {
            VisualPoetQuotaComponent.Companion.getClass();
            visualPoetQuotaComponent = VisualPoetQuotaComponent.EMPTY_VISUAL_POET_QUOTA;
        }
        C2242211CpP c2242211CpP = c2241171Cnj.fallback_info;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (c2242211CpP != null) {
            fallbackInfoComponentLIZ = C2242131CpH.LIZ(c2242211CpP);
        } else {
            fallbackInfoComponentLIZ = null;
        }
        Boolean bool = c2241171Cnj.retried;
        Long l = c2241171Cnj.update_time;
        String str13 = c2241171Cnj.task_id;
        Map<String, String> map = c2241171Cnj.extra;
        C2243941CsC c2243941CsC = c2241171Cnj.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2241171Cnj.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2241171Cnj.resp_base;
        if (c2241571CoN != null) {
            baseResponseComponent = C2241581CoO.LIZIZ(c2241571CoN);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        if (c2242771CqJ != null) {
            attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
        } else {
            attachmentComponentLIZ = null;
        }
        if (c2242321Cpa != null) {
            baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
        } else {
            baseHeaderComponentLIZIZ = null;
        }
        if (c2242801CqM != null) {
            baseFooterComponentLIZ = C2242841CqQ.LIZ(c2242801CqM);
        }
        return new VisualPoetErrorCardTemplate(visualPoetErrorInfoComponent, visualPoetTnsComponent, visualPoetQuotaComponent, fallbackInfoComponentLIZ, bool, l, str13, map, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ, c2241171Cnj.reply_message_id.longValue());
    }
}
