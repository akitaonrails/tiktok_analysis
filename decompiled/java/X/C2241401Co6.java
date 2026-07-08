package X;

import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageTipComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotMentionCoordinateComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotMentionInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotResultComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotTemplateInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotUserInfoComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1Co6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241401Co6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public static final AIGroupShotCardTemplate LIZ(C2241391Co5 c2241391Co5, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        int iIntValue;
        AIGroupShotTemplateInfoComponent aIGroupShotTemplateInfoComponent;
        ?? arrayList;
        ?? arrayList2;
        EnumC2241471CoD enumC2241471CoD;
        boolean zBooleanValue;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        ?? arrayList3;
        AIGroupShotResultComponent aIGroupShotResultComponent;
        AIGroupShotMentionInfoComponent aIGroupShotMentionInfoComponent;
        long jLongValue;
        AIGroupShotMentionCoordinateComponent aIGroupShotMentionCoordinateComponent;
        AIGroupShotUserInfoComponent aIGroupShotUserInfoComponent;
        String str = c2241391Co5.task_id;
        if (str == null) {
            str = "";
        }
        String str2 = c2241391Co5.creator_id;
        if (str2 == null) {
            str2 = "";
        }
        C2241421Co8 c2241421Co8 = c2241391Co5.template_info;
        int i = 0;
        if (c2241421Co8 == null) {
            aIGroupShotTemplateInfoComponent = new AIGroupShotTemplateInfoComponent(0);
        } else {
            String str3 = c2241421Co8.template_id;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c2241421Co8.template_name;
            if (str4 == null) {
                str4 = "";
            }
            Integer num = c2241421Co8.participant_count;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            String str5 = c2241421Co8.template_thumbnail_url;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = c2241421Co8.template_resource_id;
            if (str6 == null) {
                str6 = "";
            }
            aIGroupShotTemplateInfoComponent = new AIGroupShotTemplateInfoComponent(str3, str6, iIntValue, str4, str5);
        }
        List<C1CNE> list = c2241391Co5.user_info;
        int i2 = 10;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1CNE c1cne : list) {
                if (c1cne == null) {
                    aIGroupShotUserInfoComponent = new AIGroupShotUserInfoComponent(0);
                } else {
                    aIGroupShotUserInfoComponent = new AIGroupShotUserInfoComponent(c1cne.user_id.longValue());
                }
                arrayList.add(aIGroupShotUserInfoComponent);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        List<C2241451CoB> list2 = c2241391Co5.results;
        if (list2 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C2241451CoB c2241451CoB : list2) {
                if (c2241451CoB == null) {
                    aIGroupShotResultComponent = new AIGroupShotResultComponent(i);
                } else {
                    ImageComponent imageComponentLIZJ = C2244081CsQ.LIZJ(c2241451CoB.image);
                    List<C2237861CiO> list3 = c2241451CoB.mention_info;
                    if (list3 != null) {
                        arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, i2));
                        for (C2237861CiO c2237861CiO : list3) {
                            if (c2237861CiO == null) {
                                aIGroupShotMentionInfoComponent = new AIGroupShotMentionInfoComponent(i);
                            } else {
                                Long l = c2237861CiO.user_id;
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                String str7 = c2237861CiO.nickname;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                C2237221ChM c2237221ChM = c2237861CiO.coordinate;
                                if (c2237221ChM == null) {
                                    aIGroupShotMentionCoordinateComponent = new AIGroupShotMentionCoordinateComponent(0);
                                } else {
                                    aIGroupShotMentionCoordinateComponent = new AIGroupShotMentionCoordinateComponent(c2237221ChM.x.doubleValue(), c2237221ChM.y.doubleValue());
                                }
                                aIGroupShotMentionInfoComponent = new AIGroupShotMentionInfoComponent(jLongValue, str7, aIGroupShotMentionCoordinateComponent);
                            }
                            arrayList3.add(aIGroupShotMentionInfoComponent);
                            i = 0;
                        }
                    } else {
                        arrayList3 = C13BV.INSTANCE;
                    }
                    aIGroupShotResultComponent = new AIGroupShotResultComponent(imageComponentLIZJ, arrayList3);
                }
                arrayList2.add(aIGroupShotResultComponent);
                i2 = 10;
            }
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        EnumC2241491CoF enumC2241491CoF = c2241391Co5.status;
        if (enumC2241491CoF == null) {
            enumC2241471CoD = EnumC2241471CoD.IN_PROGRESS;
        } else {
            switch (C2241481CoE.LIZIZ[enumC2241491CoF.ordinal()]) {
                case 1:
                    enumC2241471CoD = EnumC2241471CoD.IN_PROGRESS;
                    break;
                case 2:
                    enumC2241471CoD = EnumC2241471CoD.FINISH;
                    break;
                case 3:
                    enumC2241471CoD = EnumC2241471CoD.FAIL;
                    break;
                case 4:
                    enumC2241471CoD = EnumC2241471CoD.RECALL;
                    break;
                case 5:
                    enumC2241471CoD = EnumC2241471CoD.EXPIRED;
                    break;
                case 6:
                    enumC2241471CoD = EnumC2241471CoD.UNSUPPORTED;
                    break;
                default:
                    throw new C1954807lC();
            }
        }
        Boolean bool = c2241391Co5.hide_card;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        InlineMessageTipComponent inlineMessageTipComponentLIZ = C2230181CQm.LIZ(c2241391Co5.tip);
        C2243941CsC c2243941CsC = c2241391Co5.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2241391Co5.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(i);
        }
        C2241571CoN c2241571CoN = c2241391Co5.resp_base;
        if (c2241571CoN != null) {
            baseResponseComponent = C2241581CoO.LIZIZ(c2241571CoN);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        BaseFooterComponent baseFooterComponentLIZ = null;
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
        return new AIGroupShotCardTemplate(1812, str, str2, aIGroupShotTemplateInfoComponent, arrayList, arrayList2, enumC2241471CoD, zBooleanValue, inlineMessageTipComponentLIZ, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
