package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C891590YyL extends C2217421BqW implements Function1<Object, IMContact> {
    public C891590YyL(Object obj) {
        super(1, obj, C891570YyJ.class, "convert", "convert(Ljava/lang/Object;)Lcom/ss/android/ugc/aweme/im/contacts/api/model/IMContact;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IMContact invoke(Object obj) {
        String urlString;
        IMUser imUser;
        long lastMsgCreatedAt;
        this.receiver.getClass();
        UrlModel urlModel = null;
        if (obj instanceof C0Z8N) {
            C0Z8N c0z8n = (C0Z8N) obj;
            C891600YyM.LIZ.getClass();
            long jLJII = C0YNP.LJII(c0z8n.getExtra().getSessionId());
            if (jLJII > 0 && ((imUser = c0z8n.getExtra().getImUser()) != null || (imUser = ((InterfaceC1710106mp) C891600YyM.LIZIZ.getValue()).LJ(String.valueOf(jLJII), null)) != null || (imUser = ((InterfaceC1725106pF) C891600YyM.LIZJ.getValue()).LJIILL(String.valueOf(jLJII), "im_share", true)) != null)) {
                imUser.setStickTop(c0z8n.getExtra().isStickyTop());
                imUser.setType(1);
                if (imUser.isStickTop()) {
                    lastMsgCreatedAt = Math.max(c0z8n.getExtra().getLastMsgCreatedAt(), c0z8n.getExtra().getConversationUpdatedAt());
                } else {
                    lastMsgCreatedAt = c0z8n.getExtra().getLastMsgCreatedAt();
                }
                imUser.setFriendRecTime(lastMsgCreatedAt);
                imUser.setRecentContact(1);
                return imUser;
            }
        } else if (obj instanceof C0Z8O) {
            C0Z8O c0z8o = (C0Z8O) obj;
            C891600YyM.LIZ.getClass();
            IMConversation iMConversation = new IMConversation();
            iMConversation.setConversationId(c0z8o.getExtra().getSessionId());
            iMConversation.setConversationType(AbstractC1711506n3.LIZIZ);
            iMConversation.setConversationMemberCount(c0z8o.getExtra().getMemberCount());
            iMConversation.setStickTop(c0z8o.getExtra().isStickyTop());
            C882240YjG avatar = c0z8o.getAvatar();
            if (avatar != null && (urlString = avatar.getUrlString()) != null && urlString.length() != 0) {
                urlModel = new UrlModel();
                urlModel.setUrlList(Collections.singletonList(urlString));
            }
            iMConversation.setConversationAvatar(urlModel);
            iMConversation.setConversationName(c0z8o.getName());
            iMConversation.setType(1);
            iMConversation.setRecentContact(1);
            iMConversation.setMemberIdList(c0z8o.getExtra().getMemberIdList());
            return iMConversation;
        }
        return null;
    }
}
