package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.05pV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1471905pV extends AbstractC1472005pW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        List<Long> memberIds;
        String containerID;
        String containerID2;
        String str;
        String displayName;
        UrlModel displayAvatar;
        List<String> urlList;
        String str2 = "";
        try {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(((InterfaceC1472305pZ) xBaseParamModel).getConversationId());
            if (c0y8tLIZ != null && (memberIds = c0y8tLIZ.getMemberIds()) != null) {
                ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(memberIds, 10));
                Iterator<Long> it2 = memberIds.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().toString());
                }
                IMContactApi.LIZ.getClass();
                C1BGS c1bgsLJ = C069P.LIZ().LJ();
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1472105pX.class);
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
                InterfaceC1472105pX interfaceC1472105pX = (InterfaceC1472105pX) xBaseModelLIZJ;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (String str3 : arrayList) {
                    IMUser iMUserLIZLLL = c1bgsLJ.LIZLLL(str3, null, "im_chat");
                    C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InterfaceC1472205pY.class);
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID2 = interfaceC634840OvC2.getContainerID();
                    } else {
                        containerID2 = null;
                    }
                    XBaseModel xBaseModelLIZJ2 = C1549500qQO.LIZJ(containerID2, c19719912DlLIZ2);
                    InterfaceC1472205pY interfaceC1472205pY = (InterfaceC1472205pY) xBaseModelLIZJ2;
                    interfaceC1472205pY.setUid(str3);
                    if (iMUserLIZLLL == null || (displayAvatar = iMUserLIZLLL.getDisplayAvatar()) == null || (urlList = displayAvatar.getUrlList()) == null) {
                        str = null;
                    } else {
                        str = (String) C13LP.LJJJLZIJ(0, urlList);
                    }
                    interfaceC1472205pY.setAvatarUrl(str);
                    if (iMUserLIZLLL == null) {
                        displayName = null;
                    } else {
                        displayName = iMUserLIZLLL.getDisplayName();
                    }
                    interfaceC1472205pY.setUserName(displayName);
                    arrayList2.add((InterfaceC1472205pY) xBaseModelLIZJ2);
                }
                interfaceC1472105pX.setPeerUsers(arrayList2);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            throw new Exception("conversation empty");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            String message = e.getMessage();
            if (message != null) {
                str2 = message;
            }
            C2382909Vj.LIZ(completionBlock, 0, str2, null, 4);
        }
    }
}
