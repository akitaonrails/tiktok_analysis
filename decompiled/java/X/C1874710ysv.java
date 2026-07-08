package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostUserDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ysv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874710ysv extends AbstractC1874660ysq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IHostUserDepend iHostUserDepend;
        String shortID;
        boolean z;
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null) {
            iHostUserDepend = c1874950ytJ.LJIIIZ;
        } else {
            iHostUserDepend = null;
        }
        boolean z2 = false;
        if (iHostUserDepend != null) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1874670ysr.class, null);
            InterfaceC1874670ysr interfaceC1874670ysr = (InterfaceC1874670ysr) xBaseModelLIZJ;
            interfaceC1874670ysr.setHasLoggedIn(Boolean.valueOf(iHostUserDepend.hasLogin()));
            interfaceC1874670ysr.setLogin(Boolean.valueOf(iHostUserDepend.hasLogin()));
            InterfaceC1874700ysu interfaceC1874700ysu = (InterfaceC1874700ysu) C1909107dp.LIZJ(InterfaceC1874700ysu.class, null);
            String userId = iHostUserDepend.getUserId();
            if (userId == null) {
                userId = "";
            }
            interfaceC1874700ysu.setUserID(userId);
            String secUid = iHostUserDepend.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            interfaceC1874700ysu.setSecUserID(secUid);
            String uniqueID = iHostUserDepend.getUniqueID();
            if (uniqueID == null) {
                uniqueID = "";
            }
            interfaceC1874700ysu.setUniqueID(uniqueID);
            String nickname = iHostUserDepend.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            interfaceC1874700ysu.setNickname(nickname);
            String avatarURL = iHostUserDepend.getAvatarURL();
            if (avatarURL == null) {
                avatarURL = "";
            }
            interfaceC1874700ysu.setAvatarURL(avatarURL);
            IHostUserDepend.UserModelExt userModelExt = iHostUserDepend.getUserModelExt();
            if (userModelExt == null || (shortID = userModelExt.getShortID()) == null) {
                shortID = "";
            }
            interfaceC1874700ysu.setShortID(shortID);
            String boundPhone = iHostUserDepend.getBoundPhone();
            if (boundPhone == null) {
                boundPhone = "";
            }
            if (boundPhone.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1874700ysu.setHasBoundPhone(Boolean.valueOf(z));
            interfaceC1874700ysu.setBoundPhone(interfaceC1874700ysu.getHasBoundPhone());
            String boundEmail = iHostUserDepend.getBoundEmail();
            if (boundEmail == null) {
                boundEmail = "";
            }
            if (boundEmail.length() > 0) {
                z2 = true;
            }
            interfaceC1874700ysu.setBoundEmail(Boolean.valueOf(z2));
            interfaceC1874700ysu.setOrgAccount(Boolean.valueOf(iHostUserDepend.isCurUserOrgAccount()));
            interfaceC1874700ysu.setOrgAccountConvInterPeriod(Boolean.valueOf(iHostUserDepend.isOrgAccConvInterPeriod()));
            List<String> boundThirdPartyPlatforms = iHostUserDepend.getBoundThirdPartyPlatforms();
            if (boundThirdPartyPlatforms != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = boundThirdPartyPlatforms.iterator();
                while (it2.hasNext()) {
                    try {
                        arrayList.add(it2.next());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                interfaceC1874700ysu.setBoundThirdPartyPlatforms(arrayList);
            }
            interfaceC1874670ysr.setUserInfo(interfaceC1874700ysu);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "hostUserDepend is null", null, 4);
    }
}
