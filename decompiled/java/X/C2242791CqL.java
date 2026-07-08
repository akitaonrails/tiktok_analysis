package X;

import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UrlStructComponent;

/* JADX INFO: renamed from: X.1CqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242791CqL {
    public static final AttachmentComponent LIZ(C2242771CqJ c2242771CqJ) {
        AttachmentTypeComponent attachmentTypeComponentLIZ;
        long jLongValue;
        long jLongValue2;
        UrlStructComponent urlStructComponent;
        int iIntValue;
        boolean zBooleanValue;
        FallbackStatusComponent fallbackStatusComponentLIZ;
        long jLongValue3;
        EnumC2244491Ct5 enumC2244491Ct5 = c2242771CqJ.type;
        if (enumC2244491Ct5 == null) {
            attachmentTypeComponentLIZ = AttachmentTypeComponent.ATTACHMENT_TYPE_DEFAULT;
        } else {
            C462070IAb c462070IAb = AttachmentTypeComponent.Companion;
            int value = enumC2244491Ct5.getValue();
            c462070IAb.getClass();
            attachmentTypeComponentLIZ = C462070IAb.LIZ(value);
        }
        String str = c2242771CqJ.id;
        if (str == null) {
            str = "";
        }
        Long l = c2242771CqJ.uid;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        Long l2 = c2242771CqJ.origin_author_uid;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = -1;
        }
        C1CUV c1cuv = c2242771CqJ.cover;
        if (c1cuv == null) {
            urlStructComponent = new UrlStructComponent(C13BV.INSTANCE);
        } else {
            urlStructComponent = new UrlStructComponent(c1cuv.url_list);
        }
        Integer num = c2242771CqJ.aweme_type;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Boolean bool = c2242771CqJ.is_story;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C0IBA c0iba = c2242771CqJ.status;
        if (c0iba == null || (fallbackStatusComponentLIZ = C0IB8.LIZ(c0iba)) == null) {
            fallbackStatusComponentLIZ = FallbackStatusComponent.UNKNOWN;
        }
        Long l3 = c2242771CqJ.expire_at;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        } else {
            jLongValue3 = 0;
        }
        return new AttachmentComponent(attachmentTypeComponentLIZ, str, jLongValue, jLongValue2, urlStructComponent, iIntValue, zBooleanValue, fallbackStatusComponentLIZ, jLongValue3);
    }
}
