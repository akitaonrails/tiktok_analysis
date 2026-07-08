package X;

import com.ss.android.ugc.aweme.im.message.template.card.BubbleCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import defpackage.BulletinExtraComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241921Cow {
    public static final BubbleCardTemplate LIZ(C2241911Cov c2241911Cov, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        TextComponent textComponentLIZ;
        FallbackInfoComponent fallbackInfoComponentLIZ;
        ArrayList arrayList;
        BulletinExtraComponent bulletinExtraComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        PreviewHintComponent previewHintComponentLIZ;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C2237891CiR c2237891CiRDecode;
        C2243521CrW c2243521CrW = c2241911Cov.text;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (c2243521CrW != null) {
            textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW);
        } else {
            textComponentLIZ = null;
        }
        C2242211CpP c2242211CpP = c2241911Cov.fallback_info;
        if (c2242211CpP != null) {
            fallbackInfoComponentLIZ = C2242131CpH.LIZ(c2242211CpP);
        } else {
            fallbackInfoComponentLIZ = null;
        }
        List<C2244321Cso> list = c2241911Cov.link_infos;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C2244321Cso> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C2244351Csr.LIZ(it2.next()));
            }
        } else {
            arrayList = null;
        }
        ByteString byteString = c2241911Cov.extra_content;
        if (byteString != null && (c2237891CiRDecode = C2237891CiR.ADAPTER.decode(byteString)) != null) {
            bulletinExtraComponentLIZ = new BulletinExtraComponent(c2237891CiRDecode.expose_cnt.longValue());
        } else {
            BulletinExtraComponent.Companion.getClass();
            bulletinExtraComponentLIZ = BulletinExtraComponent.b.LIZ();
        }
        C1CH0 c1ch0 = c2241911Cov.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2243941CsC c2243941CsC = c2241911Cov.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C2241571CoN c2241571CoN = c2241911Cov.resp_base;
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
        return new BubbleCardTemplate(textComponentLIZ, fallbackInfoComponentLIZ, arrayList, bulletinExtraComponentLIZ, attachmentComponentLIZ, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
