package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C891540YyG extends C2217421BqW implements Function1<C0Y8T, IMContact> {
    public C891540YyG(Object obj) {
        super(1, obj, C891550YyH.class, "convert", "convert(Lcom/bytedance/im/core/conversation/core/model/Conversation;)Lcom/ss/android/ugc/aweme/im/contacts/api/model/IMContact;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IMContact invoke(C0Y8T c0y8t) {
        IMContact iMContact;
        IMUser iMUserLJIIJJI;
        C0Y8T c0y8t2 = c0y8t;
        C891550YyH c891550YyH = (C891550YyH) this.receiver;
        c891550YyH.getClass();
        UrlModel urlModelLJIILL = null;
        if (c0y8t2.isSingleChat()) {
            long jMax = 0;
            if (C0YNP.LJII(c0y8t2.getConversationId()) > 0) {
                IIMContactUtilService.LIZ.getClass();
                IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                if (iIMContactUtilServiceLIZ != null && (iMUserLJIIJJI = iIMContactUtilServiceLIZ.LJIIJJI(c0y8t2)) != null) {
                    iMUserLJIIJJI.setStickTop(c0y8t2.isStickTop());
                    iMUserLJIIJJI.setType(1);
                    C869590Y9l lastShowMessage = c0y8t2.getLastShowMessage();
                    if (lastShowMessage != null) {
                        jMax = lastShowMessage.getCreatedAt();
                    }
                    if (c0y8t2.isStickTop()) {
                        jMax = Math.max(jMax, c0y8t2.getUpdatedTime());
                    }
                    iMUserLJIIJJI.setFriendRecTime(jMax);
                    iMUserLJIIJJI.setRecentContact(1);
                    iMContact = iMUserLJIIJJI;
                }
            }
            return null;
        }
        IMConversation iMConversation = new IMConversation();
        iMConversation.setConversationId(c0y8t2.getConversationId());
        iMConversation.setConversationType(c0y8t2.getConversationType());
        iMConversation.setConversationMemberCount(c0y8t2.getMemberCount());
        iMConversation.setStickTop(c0y8t2.isStickTop());
        C0Z6T c0z6t = (C0Z6T) c891550YyH.LJI.getValue();
        if (c0z6t != null) {
            urlModelLJIILL = c0z6t.LJIILL(c0y8t2);
        }
        iMConversation.setConversationAvatar(urlModelLJIILL);
        C0Y8Y coreInfo = c0y8t2.getCoreInfo();
        if (coreInfo != null) {
            iMConversation.setConversationName(coreInfo.getName());
        }
        iMConversation.setType(1);
        List<Long> memberIds = c0y8t2.getMemberIds();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(memberIds, 10));
        Iterator<Long> it2 = memberIds.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!C10EU.LJIIZILJ((String) obj)) {
                arrayList2.add(obj);
            }
        }
        iMConversation.setMemberIdList(arrayList2);
        iMContact = iMConversation;
        iMContact.setRecentContact(1);
        return iMContact;
    }
}
