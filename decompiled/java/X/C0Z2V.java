package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi;

/* JADX INFO: renamed from: X.0Z2V, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z2V implements C0ZCZ {
    public static final C0Z2V LIZ = new C0Z2V();

    public static String LJ(C869590Y9l c869590Y9l) {
        IMContactApi.LIZ.getClass();
        return LJFF(C069P.LIZ().LJ().LIZLLL(String.valueOf(c869590Y9l.getSender()), c869590Y9l.getSecSender(), "session_convert"), c869590Y9l.getConversationId());
    }

    public static boolean LJI(C0Y8T c0y8t) {
        if (c0y8t == null) {
            return false;
        }
        C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
        if (!((C876310YZh) c0yi5LIZ).LIZ.LJJ().LLJZIJLIL(c0y8t.isGroupChat(), c0y8t.getConversationId(), c0y8t.getLastShowMessage(), c0y8t.getMinIndex())) {
            return false;
        }
        if (C882340YjQ.LIZLLL(c0y8t) && !C880510YgT.LIZIZ(c0y8t)) {
            return false;
        }
        return true;
    }

    @Override // X.C0ZCZ
    public final boolean LIZJ(C869590Y9l c869590Y9l) {
        C050R c050rLIZ = LIZ(c869590Y9l, null);
        if (c050rLIZ != null && c050rLIZ.LIZIZ) {
            return true;
        }
        return false;
    }

    public static C050R LIZ(C869590Y9l c869590Y9l, String str) {
        PreviewHintComponent previewHintComponentYo;
        TextComponent textComponent;
        String str2;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "share_im_inapp_share_inbox_preview_inapp_push", true, false) || c869590Y9l.getMsgType() != 1809) {
            return null;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && (previewHintComponentYo = baseTemplateLIZ.yo()) != null && (textComponent = previewHintComponentYo.inAppPushPreviewText) != null && (str2 = textComponent.text) != null && str2.length() != 0) {
            return null;
        }
        if (str == null) {
            str = LJ(c869590Y9l);
        }
        return C898730ZNn.LIZ(c869590Y9l, str);
    }

    public static String LJFF(IMUser iMUser, String str) {
        if (iMUser == null) {
            return C2213981Bky.LIZIZ.getApplicationContext().getString(2131831188);
        }
        return C892130YzD.LIZ(iMUser, str);
    }

    @Override // X.C0ZCZ
    public final CharSequence LIZIZ(C869590Y9l c869590Y9l, String str) {
        String strLJJLJ;
        if (C0ZDX.LJJJJZ(c869590Y9l)) {
            return C2213981Bky.LIZIZ.getApplicationContext().getString(2131835494);
        }
        IMMessageListApi.LIZ.getClass();
        if (C896000ZDa.LIZ().LIZIZ().LIZJ(c869590Y9l)) {
            return C896000ZDa.LIZ().LIZIZ().LIZIZ();
        }
        if (c869590Y9l.getMessageStatus() == C0YUT.RECALLED) {
            return C462310IAz.LIZ(c869590Y9l, new C0Z2X(this));
        }
        String strLJ = LJ(c869590Y9l);
        ILightInteractionPlatformService iLightInteractionPlatformService = (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
        String strLJI = iLightInteractionPlatformService.LJI(c869590Y9l);
        if (strLJI != null && strLJI.length() != 0 && (strLJJLJ = iLightInteractionPlatformService.LJJJJIZL().LJJLJ(strLJI, strLJ, false)) != null && strLJJLJ.length() > 0) {
            return strLJJLJ;
        }
        if (C0ZDX.LJJJJLI(c869590Y9l)) {
            C050R c050rLIZ = LIZ(c869590Y9l, strLJ);
            if (c050rLIZ != null) {
                return c050rLIZ.LIZ;
            }
            return C896000ZDa.LIZ().LIZIZ().LJ(true, C2213981Bky.LIZIZ.getApplicationContext().getResources(), c869590Y9l);
        }
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent == null) {
            return "";
        }
        if (!C0ZDX.LJJJJIZL(c869590Y9l) && c869590Y9l.getHasMention() && c869590Y9l.getConversationType() == AbstractC1711506n3.LIZIZ) {
            String strLJI2 = C896000ZDa.LIZ().LIZIZ().LJI(C2213981Bky.LIZIZ.getApplicationContext(), c869590Y9l, strLJ, orParseJsonContent);
            if (strLJI2 == null) {
                return "";
            }
            return strLJI2;
        }
        return C896000ZDa.LIZ().LIZIZ().LIZLLL(C2213981Bky.LIZIZ.getApplicationContext().getResources(), orParseJsonContent, !C0ZDX.LJJJJIZL(c869590Y9l), true, strLJ, c869590Y9l, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe A[PHI: r3
      0x00fe: PHI (r3v50 com.ss.android.ugc.aweme.im.message.content.SystemContent$Key[]) = 
      (r3v46 com.ss.android.ugc.aweme.im.message.content.SystemContent$Key[])
      (r3v45 com.ss.android.ugc.aweme.im.message.content.SystemContent$Key[])
     binds: [B:77:0x0164, B:46:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LIZLLL(X.C0Z2V r23, X.C869590Y9l r24, com.ss.android.ugc.aweme.im.chatlist.api.adapter.ISessionConverterDeps r25) {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z2V.LIZLLL(X.0Z2V, X.0Y9l, com.ss.android.ugc.aweme.im.chatlist.api.adapter.ISessionConverterDeps):java.lang.CharSequence");
    }
}
