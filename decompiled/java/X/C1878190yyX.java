package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0yyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878190yyX implements IHostUserDepend {
    public InterfaceC1874730ysx LIZ;

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getAvatarURL() {
        User curUser;
        UrlModel avatarMedium;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUser = iAccountUserServiceLJFF.getCurUser()) == null || (avatarMedium = curUser.getAvatarMedium()) == null || avatarMedium.getUrlList() == null || !(!avatarMedium.getUrlList().isEmpty())) {
            return null;
        }
        return (String) ListProtector.get(avatarMedium.getUrlList(), 0);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getBoundEmail() {
        User curUser;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUser = iAccountUserServiceLJFF.getCurUser()) == null) {
            return null;
        }
        return curUser.getEmail();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getBoundPhone() {
        User curUser;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUser = iAccountUserServiceLJFF.getCurUser()) == null) {
            return null;
        }
        return curUser.getBindPhone();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final List<String> getBoundThirdPartyPlatforms() {
        IBindService iBindServiceLIZ = C0XQ7.LIZ();
        List<String> socialPlatformNames = iBindServiceLIZ.getSocialPlatformNames();
        if (socialPlatformNames == null || socialPlatformNames.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : socialPlatformNames) {
            if (iBindServiceLIZ.isPlatformBound(str)) {
                arrayList.add(str.toLowerCase(Locale.ROOT));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getNickname() {
        User curUser;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUser = iAccountUserServiceLJFF.getCurUser()) == null) {
            return null;
        }
        return curUser.getNickname();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getSecUid() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            return iAccountUserServiceLJFF.getCurSecUserId();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getUniqueID() {
        User curUser;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        return (iAccountUserServiceLJFF == null || (curUser = iAccountUserServiceLJFF.getCurUser()) == null) ? "" : TextUtils.isEmpty(curUser.getUniqueId()) ? curUser.getShortId() : curUser.getUniqueId();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getUserId() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            return iAccountUserServiceLJFF.getCurUserId();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final IHostUserDepend.UserModelExt getUserModelExt() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        String uniqueId = null;
        User curUser = iAccountUserServiceLJFF != null ? iAccountUserServiceLJFF.getCurUser() : null;
        IHostUserDepend.UserModelExt userModelExt = new IHostUserDepend.UserModelExt();
        if (curUser != null) {
            try {
                uniqueId = TextUtils.isEmpty(curUser.getShortId()) ? curUser.getUniqueId() : curUser.getShortId();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                uniqueId = "";
            }
        }
        userModelExt.setShortID(uniqueId);
        return userModelExt;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final boolean hasLogin() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            return iAccountUserServiceLJFF.isLogin();
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final boolean isCurUserOrgAccount() {
        Boolean boolIsCurUserOrgAccount;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (boolIsCurUserOrgAccount = iAccountUserServiceLJFF.isCurUserOrgAccount()) == null) {
            return false;
        }
        return boolIsCurUserOrgAccount.booleanValue();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final boolean isOrgAccConvInterPeriod() {
        Boolean boolIsOrgAccConvInterPeriod;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (boolIsOrgAccConvInterPeriod = iAccountUserServiceLJFF.isOrgAccConvInterPeriod()) == null) {
            return false;
        }
        return boolIsOrgAccConvInterPeriod.booleanValue();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void login(Activity activity, InterfaceC1874730ysx interfaceC1874730ysx, Map<String, String> map) {
        Set<Map.Entry<String, String>> setEntrySet;
        this.LIZ = interfaceC1874730ysx;
        Bundle bundle = new Bundle();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                C786410Ut5.LJJJI((String) entry.getKey(), (String) entry.getValue(), bundle);
            }
        }
        ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
        C0XQS c0xqs = new C0XQS();
        c0xqs.LIZLLL = bundle;
        c0xqs.LIZ = activity;
        c0xqs.LJ = new C19334810kc(this, 5);
        iLoginServiceLIZJ.showLoginAndRegisterView(c0xqs.LIZ());
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void logout(Activity activity, final InterfaceC1871530ynn interfaceC1871530ynn, Map<String, String> map) {
        C0XQ7.LIZJ().logout("", "user_logout", new C0XU7() { // from class: X.0ytN
            @Override // X.C0XU7
            public final void LIZIZ() {
                interfaceC1871530ynn.onSuccess();
            }
        });
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void login(Activity activity, InterfaceC1874730ysx interfaceC1874730ysx, Map<String, String> map, IHostUserDepend.LoginParamsExt loginParamsExt) {
        login(activity, interfaceC1874730ysx, map);
    }
}
