package Y;

import X.AbstractC848400XPy;
import X.C013C;
import X.C0P0T;
import X.C0XQ7;
import X.C0XZ4;
import X.C1239250iLz;
import X.C1243400iSg;
import X.C1243410iSh;
import X.C19EG;
import X.C20515215Pi;
import X.C259800zU;
import X.EnumC1254850il9;
import X.InterfaceC1243310iSX;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.popup.SyncNicknameAndUsernamePopTask;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.ProfileNavbarOtherNicknameProtocol;
import com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoOtherNicknameProtocol;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarOtherNicknameAbility;
import com.ss.android.ugc.ur.alias.IAliasService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS25S0500000_19 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS25S0500000_19 aCListenerS25S0500000_19, View view) {
        if (((C013C) aCListenerS25S0500000_19.l0).element) {
            T t = ((C259800zU) aCListenerS25S0500000_19.l1).element;
            if (t != 0) {
                C0XZ4.LIZ.getClass();
                HashMap map = new HashMap();
                map.put("login_name", t);
                map.put("is_from_nickname", String.valueOf(true));
                C1239250iLz.LIZ("/passport/login_name/update/", map).LJIIIIZZ(new AfS155S0200000_19((SyncNicknameAndUsernamePopTask) aCListenerS25S0500000_19.l2, (C19EG) aCListenerS25S0500000_19.l4, 2)).LJII(new AfS155S0200000_19((SyncNicknameAndUsernamePopTask) aCListenerS25S0500000_19.l2, (C19EG) aCListenerS25S0500000_19.l4, 3)).LJIILL();
            }
        } else {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) iAccountUserServiceLJFF;
            abstractC848400XPy.LJJLIIIJILLIZJL(EnumC1254850il9.DEFAULT.getValue(), ((SyncNicknameAndUsernamePopTask) aCListenerS25S0500000_19.l2).handler, (String) ((C259800zU) aCListenerS25S0500000_19.l1).element, null);
        }
        ((C20515215Pi) aCListenerS25S0500000_19.l3).LIZIZ();
    }

    public static final void onClick$1(ACListenerS25S0500000_19 aCListenerS25S0500000_19, View view) {
        C0P0T c0p0t = (C0P0T) ((C259800zU) aCListenerS25S0500000_19.l0).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        C1243400iSg c1243400iSg = C1243400iSg.LIZ;
        C1243410iSh c1243410iSh = (C1243410iSh) aCListenerS25S0500000_19.l1;
        c1243400iSg.getClass();
        C1243400iSg.LIZIZ(c1243410iSh);
        IAliasService iAliasService = (IAliasService) ServiceManager.get().getService(IAliasService.class);
        User user = (User) aCListenerS25S0500000_19.l2;
        Context context = (Context) aCListenerS25S0500000_19.l3;
        C1243410iSh c1243410iSh2 = (C1243410iSh) aCListenerS25S0500000_19.l1;
        final ProfileNavbarOtherNicknameProtocol profileNavbarOtherNicknameProtocol = (ProfileNavbarOtherNicknameProtocol) aCListenerS25S0500000_19.l4;
        iAliasService.LJII(user, context, c1243410iSh2, new InterfaceC1243310iSX() { // from class: X.0iYO
            @Override // X.InterfaceC1243310iSX
            public final void onFailed() {
            }

            @Override // X.InterfaceC1243310iSX
            public final void LIZJ(String str, boolean z) {
                INavBarOtherNicknameAbility iNavBarOtherNicknameAbility = (INavBarOtherNicknameAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(profileNavbarOtherNicknameProtocol), INavBarOtherNicknameAbility.class, null);
                if (iNavBarOtherNicknameAbility != null) {
                    iNavBarOtherNicknameAbility.ef1(str, !z);
                }
            }
        });
    }

    public static final void onClick$2(ACListenerS25S0500000_19 aCListenerS25S0500000_19, View view) {
        C0P0T c0p0t = (C0P0T) ((C259800zU) aCListenerS25S0500000_19.l0).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        C1243400iSg c1243400iSg = C1243400iSg.LIZ;
        C1243410iSh c1243410iSh = (C1243410iSh) aCListenerS25S0500000_19.l1;
        c1243400iSg.getClass();
        C1243400iSg.LIZIZ(c1243410iSh);
        IAliasService iAliasService = (IAliasService) ServiceManager.get().getService(IAliasService.class);
        User user = (User) aCListenerS25S0500000_19.l2;
        Context context = (Context) aCListenerS25S0500000_19.l3;
        C1243410iSh c1243410iSh2 = (C1243410iSh) aCListenerS25S0500000_19.l1;
        final ProfileInfoOtherNicknameProtocol profileInfoOtherNicknameProtocol = (ProfileInfoOtherNicknameProtocol) aCListenerS25S0500000_19.l4;
        iAliasService.LJII(user, context, c1243410iSh2, new InterfaceC1243310iSX() { // from class: X.0iYN
            @Override // X.InterfaceC1243310iSX
            public final void onFailed() {
            }

            @Override // X.InterfaceC1243310iSX
            public final void LIZJ(String str, boolean z) {
                INavBarOtherNicknameAbility iNavBarOtherNicknameAbility = (INavBarOtherNicknameAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(profileInfoOtherNicknameProtocol), INavBarOtherNicknameAbility.class, null);
                if (iNavBarOtherNicknameAbility != null) {
                    iNavBarOtherNicknameAbility.ef1(str, !z);
                }
                profileInfoOtherNicknameProtocol.CP0(null, str);
                profileInfoOtherNicknameProtocol.LJJLIIIJILLIZJL();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS25S0500000_19(Object obj, C013C c013c, C259800zU<String> c259800zU, SyncNicknameAndUsernamePopTask syncNicknameAndUsernamePopTask, C20515215Pi c20515215Pi, C19EG c19eg) {
        this.$t = c19eg;
        this.l0 = obj;
        this.l1 = c013c;
        this.l2 = c259800zU;
        this.l3 = syncNicknameAndUsernamePopTask;
        this.l4 = c20515215Pi;
    }
}
