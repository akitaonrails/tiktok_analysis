package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lZU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362940lZU {
    public final SharePanelViewModel LIZ;
    public final InterfaceC1362600lYw LIZIZ;
    public IMContact LIZLLL;
    public final boolean LIZJ = true;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(676));

    public C1362940lZU(SharePanelViewModel sharePanelViewModel, InterfaceC1362600lYw interfaceC1362600lYw) {
        this.LIZ = sharePanelViewModel;
        this.LIZIZ = interfaceC1362600lYw;
    }

    public final void LIZ(View view, IMContact iMContact) {
        InterfaceC1356390lOv interfaceC1356390lOv;
        IMUser iMUser;
        BaseTemplate baseTemplate;
        SharePackage sharePackage = this.LIZ.LL;
        Integer numValueOf = null;
        if (sharePackage != null) {
            InterfaceC1362600lYw interfaceC1362600lYw = this.LIZIZ;
            if (interfaceC1362600lYw != null && !interfaceC1362600lYw.LJIIIIZZ(sharePackage)) {
                C2344809Gs.LJ("LongPressShare cancel share by callback");
                return;
            }
            SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
            if (sendMessageTemplateTask != null) {
                baseTemplate = sendMessageTemplateTask.template;
            } else {
                baseTemplate = null;
            }
            if ((baseTemplate instanceof AwemeCardTemplate) && !((InterfaceC1365380ldQ) this.LJ.getValue()).LJJJJL(view, (AwemeCardTemplate) baseTemplate)) {
                return;
            }
        }
        SharePackage sharePackage2 = this.LIZ.LL;
        if (sharePackage2 != null) {
            List<? extends IMContact> listLJIILJJIL = C1697810uHb.LJIILJJIL(iMContact);
            Bundle bundle = sharePackage2.extras;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if ((iMContact instanceof IMUser) && (iMUser = (IMUser) iMContact) != null) {
                numValueOf = Integer.valueOf(iMUser.getFollowStatus());
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append("");
            C786410Ut5.LJJJI("relation_tag", C2188811AlT.LIZIZ(sbLIZ), bundle);
            bundle.putInt("rank_num", this.LIZ.LJIIJJI().indexOf(iMContact));
            C1367430lgj c1367430lgj = C1367430lgj.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0I0B c0i0b = C0I0B.LJFF;
            InterfaceC1493505sz interfaceC1493505szLIZIZ = c0i0b.LIZIZ();
            InterfaceC1493505sz interfaceC1493505szLIZIZ2 = c0i0b.LIZIZ();
            c1367430lgj.getClass();
            C1367430lgj.LIZLLL(sharePackage2, iMContact, false, "", jCurrentTimeMillis, interfaceC1493505szLIZIZ, interfaceC1493505szLIZIZ2);
            sharePackage2.extras.remove("rank_num");
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact2 : listLJIILJJIL) {
                if (iMContact2 instanceof IMUser) {
                    arrayList.add(iMContact2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((BaseContact) it2.next()).getUid());
            }
            String string = arrayList2.toString();
            String strSubstring = string.substring(1, string.length() - 1);
            ArrayList arrayList3 = new ArrayList();
            for (IMContact iMContact3 : listLJIILJJIL) {
                if (iMContact3 instanceof IMConversation) {
                    arrayList3.add(iMContact3);
                }
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((IMConversation) it3.next()).getConversationId());
            }
            String string2 = arrayList3.toString();
            String strSubstring2 = string2.substring(1, string2.length() - 1);
            int size = arrayList.size();
            int size2 = listLJIILJJIL.size() - size;
            Bundle bundle2 = sharePackage2.extras;
            C786410Ut5.LJJJI("shareIdList", strSubstring, bundle2);
            bundle2.putStringArray("shared_users_id_list", (String[]) arrayList2.toArray(new String[0]));
            C786410Ut5.LJJJI("conversationIdList", strSubstring2, bundle2);
            bundle2.putStringArray("shared_conversation_id_list", (String[]) arrayList4.toArray(new String[0]));
            bundle2.putInt("contact_count", listLJIILJJIL.size());
            bundle2.putInt("chat_cnt", size);
            bundle2.putInt("group_chat_cnt", size2);
            sharePackage2.extras.putInt("is_create_group_chat", 0);
            IMContact iMContact4 = this.LIZLLL;
            if (iMContact4 instanceof IMUser) {
                sharePackage2.extras.putInt("friends_shared_cnt", 1);
            } else if (iMContact4 instanceof IMConversation) {
                sharePackage2.extras.putInt("friends_shared_cnt", ((IMConversation) iMContact4).getConversationMemberCount());
            }
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJJJ(sharePackage2, "", listLJIILJJIL, this.LIZIZ, 2, null, null, null, true, null, C2097608Jq.LJ());
            if (this.LIZJ && (interfaceC1356390lOv = this.LIZ.LLILLJJLI) != null) {
                interfaceC1356390lOv.GW(iMContact);
            }
        }
    }
}
