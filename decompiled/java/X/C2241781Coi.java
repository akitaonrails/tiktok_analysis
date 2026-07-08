package X;

import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetUserCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetPictureStructComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetSystemComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetUserComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Coi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241781Coi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static final VisualPoetUserCardTemplate LIZ(C2241771Coh c2241771Coh, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        VisualPoetUserComponent visualPoetUserComponent;
        VisualPoetSystemComponent visualPoetSystemComponent;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        FallbackInfoComponent fallbackInfoComponentLIZ;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        VisualPoetPictureStructComponent visualPoetPictureStructComponentLIZ;
        ?? arrayList;
        C2241801Cok c2241801Cok = c2241771Coh.user_content;
        String str = "";
        if (c2241801Cok != null) {
            String str2 = c2241801Cok.text;
            if (str2 == null) {
                str2 = "";
            }
            List<C2241841Coo> list = c2241801Cok.images;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C2241841Coo> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C2241871Cor.LIZ(it2.next()));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            String str3 = c2241801Cok.prompt_uri;
            if (str3 == null) {
                str3 = "";
            }
            visualPoetUserComponent = new VisualPoetUserComponent(str2, arrayList, str3);
        } else {
            VisualPoetUserComponent.Companion.getClass();
            visualPoetUserComponent = VisualPoetUserComponent.EMPTY_VISUAL_POET_USER;
        }
        C2241761Cog c2241761Cog = c2241771Coh.system_content;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (c2241761Cog != null) {
            String str4 = c2241761Cog.text;
            if (str4 != null) {
                str = str4;
            }
            C2241841Coo c2241841Coo = c2241761Cog.image;
            if (c2241841Coo != null) {
                visualPoetPictureStructComponentLIZ = C2241871Cor.LIZ(c2241841Coo);
            } else {
                VisualPoetPictureStructComponent.Companion.getClass();
                visualPoetPictureStructComponentLIZ = VisualPoetPictureStructComponent.EMPTY_VISUAL_POET_PICTURE_STRUCT;
            }
            visualPoetSystemComponent = new VisualPoetSystemComponent(str, visualPoetPictureStructComponentLIZ);
        } else {
            visualPoetSystemComponent = null;
        }
        Boolean bool = c2241771Coh.user_invisible;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = c2241771Coh.system_invisible;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        Map<String, String> map = c2241771Coh.extra;
        C2242211CpP c2242211CpP = c2241771Coh.fallback_info;
        if (c2242211CpP != null) {
            fallbackInfoComponentLIZ = C2242131CpH.LIZ(c2242211CpP);
        } else {
            fallbackInfoComponentLIZ = null;
        }
        C2243941CsC c2243941CsC = c2241771Coh.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2241771Coh.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2241771Coh.resp_base;
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
        return new VisualPoetUserCardTemplate(visualPoetUserComponent, visualPoetSystemComponent, zBooleanValue, zBooleanValue2, map, fallbackInfoComponentLIZ, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
