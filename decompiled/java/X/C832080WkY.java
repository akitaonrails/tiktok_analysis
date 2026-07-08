package X;

import Y.ACallableS245S0200000_13;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0WkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832080WkY implements InterfaceC832260Wkq, InterfaceC832270Wkr {
    public C831920WkI LL;
    public final Fragment LLILLJJLI;
    public EditText LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public final String LLILZLL;
    public Exception LLIZ;
    public final boolean LLIZLLLIL;

    @Override // X.InterfaceC832280Wks
    public final void Js(int i) {
    }

    @Override // X.InterfaceC832890Wlr
    public final void LJJJZ(ConnectionResult connectionResult) {
    }

    @Override // X.InterfaceC832280Wks
    public final void zk(Bundle bundle) {
    }

    public final void LIZJ() {
        if (this.LLIZLLLIL) {
            try {
                C831930WkJ c831930WkJ = new C831930WkJ(this.LLILLJJLI.getContext());
                c831930WkJ.LJIILIIL.add(this);
                C831570Wjj c831570Wjj = new C831570Wjj(this.LLILLJJLI.getActivity());
                c831930WkJ.LJIIIIZZ = 0;
                c831930WkJ.LJIIIZ = this;
                c831930WkJ.LJII = c831570Wjj;
                C832010WkR<C833910WnV> c832010WkR = C833530Wmt.LIZ;
                C0W3J.LJIIIZ(c832010WkR, "Api must not be null");
                c831930WkJ.LJI.put(c832010WkR, null);
                AbstractC832100Wka abstractC832100Wka = c832010WkR.LIZ;
                C0W3J.LJIIIZ(abstractC832100Wka, "Base client builder must not be null");
                List<Scope> impliedScopes = abstractC832100Wka.getImpliedScopes(null);
                c831930WkJ.LIZIZ.addAll(impliedScopes);
                c831930WkJ.LIZ.addAll(impliedScopes);
                this.LL = c831930WkJ.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLIZ = e;
            }
        }
    }

    public final void LIZLLL() {
        C831920WkI c831920WkI;
        if (this.LLIZLLLIL && (c831920WkI = this.LL) != null && c831920WkI.LJIIJJI()) {
            C831920WkI c831920WkI2 = this.LL;
            C19EG activity = this.LLILLJJLI.getActivity();
            c831920WkI2.getClass();
            C831570Wjj c831570Wjj = new C831570Wjj(activity);
            if (c831920WkI2.LJ < 0) {
                throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
            }
            InterfaceC831130Wj1 interfaceC831130Wj1LIZJ = LifecycleCallback.LIZJ(c831570Wjj);
            C831950WkL c831950WkL = (C831950WkL) interfaceC831130Wj1LIZJ.uu(C831950WkL.class, "AutoManageHelper");
            if (c831950WkL == null) {
                c831950WkL = new C831950WkL(interfaceC831130Wj1LIZJ);
            }
            int i = c831920WkI2.LJ;
            C832070WkX c832070WkX = c831950WkL.LLILZLL.get(i);
            c831950WkL.LLILZLL.remove(i);
            if (c832070WkX != null) {
                c832070WkX.LLILLJJLI.LJIILJJIL(c832070WkX);
                c832070WkX.LLILLJJLI.LJ();
            }
            this.LL.LJ();
        }
    }

    public C832080WkY(BaseI18nLoginFragment baseI18nLoginFragment, String str) {
        boolean z;
        this.LLILLJJLI = baseI18nLoginFragment;
        this.LLILZLL = str;
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        this.LLILZ = C0WWA.LIZ(C0XPY.LIZIZ);
        boolean zLIZ = C0VFU.LIZ(C0XPY.LIZIZ);
        this.LLILZIL = zLIZ;
        if (zLIZ && this.LLILZ == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
    }

    public final void LIZIZ(int i, int i2, Intent intent) {
        EditText editText;
        if (!this.LLIZLLLIL || i != 1000 || (editText = this.LLILLL) == null) {
            return;
        }
        if (i2 == -1) {
            C15O7.LIZJ(new ACallableS245S0200000_13(intent, this, 43)).LIZLLL(new C854740Xg0(this, 6));
            return;
        }
        editText.requestFocus();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onActivityResult result code: ");
        sbLIZ.append(i2);
        LIZ(this.LLILZ, C2188811AlT.LIZIZ(sbLIZ), false, this.LLILZIL);
    }

    public final void LIZ(int i, String str, boolean z, boolean z2) {
        String str2;
        HashMap map = new HashMap();
        map.put("event", "Auto fill user's phone number");
        map.put("success", String.valueOf(z));
        map.put("hasSimCard", String.valueOf(z2));
        map.put("googleAvailability", String.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            map.put("errorMsg", str2);
        }
        C832090WkZ.LIZ.LIZIZ(map.toString());
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", this.LLILZLL);
        c0xgr.LIZ(z ? 1 : 0, "is_successful");
        c0xgr.LIZLLL("error_desc", str);
        c0xgr.LIZ(z2 ? 1 : 0, "has_sim_card");
        c0xgr.LIZ(i, "google_availability");
        C20684815ws.LJIILLIIL("phone_auto_fill", c0xgr.LIZ);
    }
}
