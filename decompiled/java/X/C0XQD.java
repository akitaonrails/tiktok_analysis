package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS200S0000000_13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XQD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQD implements InterfaceC1051760dTa {
    public final WeakReference<Context> LL;
    public final IESJsBridge LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(372));

    public static Bundle LIZ(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C0XQD(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        this.LL = weakReference;
        this.LLILLJJLI = iESJsBridge;
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        Fragment fragment;
        C0XYD c0xyd;
        boolean zOptBoolean;
        Activity activityLIZ;
        String string;
        String string2;
        String string3;
        String string4;
        Bundle bundleLIZ;
        Bundle bundleLIZ2;
        String string5;
        Bundle bundleLIZ3;
        Bundle bundleLIZ4;
        Bundle bundleLIZ5;
        Bundle bundleLIZ6;
        C0XQG c0xqg;
        if (c1058910df7.LIZLLL == null) {
            return;
        }
        AccountRetrofitInetcept.LL.getClass();
        String str = "";
        AccountRetrofitInetcept.LLILLJJLI = "";
        C0XO3 c0xo3 = new C0XO3(c1058910df7.LIZLLL);
        c0xo3.LIZ();
        String strOptString = c1058910df7.LIZLLL.optString("after_login_schema", "");
        WeakReference<Fragment> weakReference = C0XQF.LIZ;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        WeakReference<C0XYD> weakReference2 = C0XQF.LIZIZ;
        if (weakReference2 != null) {
            c0xyd = weakReference2.get();
        } else {
            c0xyd = null;
        }
        C0XO0 c0xo0LIZLLL = C0XO0.LIZLLL(this.LL.get());
        c0xo0LIZLLL.LLLIIIL = c0xo3;
        int i = 0;
        c0xo0LIZLLL.LJIIIIZZ(c0xo3, false);
        c0xo0LIZLLL.LLJZIJLIL = true;
        SharedPreferences.Editor editorEdit = c0xo0LIZLLL.LLLJL.edit();
        editorEdit.putBoolean("is_login", c0xo0LIZLLL.LLJZIJLIL);
        editorEdit.apply();
        if (c0xo0LIZLLL.LL != null) {
            boolean z = C847400XMc.LIZ;
            final String strLIZLLL = C0XMV.LLJJJIL.LIZLLL(null, false, true);
            if (!TextUtils.isEmpty(strLIZLLL)) {
                AbstractC847610XMx abstractC847610XMx = new AbstractC847610XMx() { // from class: X.0XMg
                    @Override // X.C0XH7
                    public final /* bridge */ /* synthetic */ void LJI(C0XGA c0xga) {
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i2) {
                        C0XN3 c0xn3 = (C0XN3) c0xga;
                        if (c0xn3 != null && "session_expired".equalsIgnoreCase(c0xn3.LJIIIZ)) {
                            String str2 = strLIZLLL;
                            if (C847400XMc.LIZ) {
                                C0XMV c0xmv = C0XMV.LLJJJIL;
                                c0xmv.getClass();
                                C0XMZ.LJII(str2, true, null);
                                if (C0XMV.LLJJJJJIL && C847400XMc.LJII()) {
                                    c0xmv.LIZIZ();
                                    C0XNG c0xng = C847400XMc.LJI;
                                    if (c0xng != null) {
                                        C0XO0.LIZLLL(C848000XOk.LIZ()).LJ(true);
                                    }
                                    C0XMV.LJII("sdk_expired_logout", null);
                                }
                            }
                        }
                    }
                };
                Context context = c0xo0LIZLLL.LLLJ;
                C846070XGz c846070XGz = new C846070XGz();
                c846070XGz.LIZ = strLIZLLL;
                new C847620XMy(context, c846070XGz.LIZIZ(), abstractC847610XMx).LJIIIZ();
            }
        }
        C0XIH.LIZIZ().LIZ("wap_login", null);
        if (fragment != null && c0xyd != null) {
            C0XYO c0xyo = C0XYO.LIZ;
            EnumC852660Xce enumC852660XceScene = c0xyd.scene();
            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
            JSONObject jSONObject2 = c1058910df7.LIZLLL;
            c0xyo.getClass();
            C0XYO.LIZJ(fragment, c0xyd, enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ, jSONObject2, c0xo3);
        } else {
            C0XQH c0xqh = C0XQF.LIZLLL;
            if (c0xqh != null) {
                c0xqh.LIZ(c0xo3);
            } else {
                try {
                    JSONObject jSONObject3 = c1058910df7.LIZLLL;
                    if (jSONObject3 != null) {
                        zOptBoolean = jSONObject3.optBoolean("keep_activity");
                    } else {
                        zOptBoolean = false;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    zOptBoolean = false;
                }
                Bundle bundle = new Bundle();
                if (((IAccountUserService) this.LLILLL.getValue()).isLogin()) {
                    C786410Ut5.LJJJI("previous_uid", ((IAccountUserService) this.LLILLL.getValue()).getCurUserId(), bundle);
                }
                if (strOptString.length() > 0) {
                    C786410Ut5.LJJJI("after_login_schema", strOptString, bundle);
                }
                Context context2 = this.LL.get();
                if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
                    C0XYO.LIZLLL(C0XYO.LIZ, activityLIZ, c1058910df7.LIZLLL, c0xo3, zOptBoolean, bundle, false, 80);
                    Intent intent = activityLIZ.getIntent();
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_method", "find_account");
                    c0xgr.LIZLLL("enter_from", "find_account");
                    if (intent == null || (bundleLIZ6 = LIZ(intent)) == null || (string = bundleLIZ6.getString("login_panel_type")) == null) {
                        string = "";
                    }
                    c0xgr.LIZLLL("login_panel_type", string);
                    c0xgr.LIZ(0, "is_register");
                    c0xgr.LIZ(0, "error_code");
                    c0xgr.LIZIZ(c0xo3.LIZ, "user_id");
                    c0xgr.LIZ(0, "gms_auto_fill");
                    c0xgr.LIZLLL("enter_type", "find_account");
                    c0xgr.LIZLLL("platform", "verified_env");
                    if (intent == null || (bundleLIZ5 = LIZ(intent)) == null || (string2 = bundleLIZ5.getString("group_id")) == null) {
                        string2 = "";
                    }
                    c0xgr.LIZLLL("group_id", string2);
                    if (intent == null || (bundleLIZ4 = LIZ(intent)) == null || (string3 = bundleLIZ4.getString("author_id")) == null) {
                        string3 = "";
                    }
                    c0xgr.LIZLLL("author_id", string3);
                    if (intent == null || (bundleLIZ3 = LIZ(intent)) == null || (string4 = bundleLIZ3.getString("previous_login_method")) == null) {
                        string4 = "";
                    }
                    c0xgr.LIZLLL("previous_login_method", string4);
                    if (intent != null && (bundleLIZ2 = LIZ(intent)) != null && (string5 = bundleLIZ2.getString("prev_login_platform")) != null) {
                        str = string5;
                    }
                    c0xgr.LIZLLL("prev_login_platform", str);
                    if (intent != null && (bundleLIZ = LIZ(intent)) != null) {
                        i = bundleLIZ.getInt("encouraged_platform");
                    }
                    c0xgr.LIZ(i, "encouraged_platform");
                    C852170Xbr.LIZ(c0xgr);
                    C20684815ws.LJIILLIIL("login_success", c0xgr.LIZ);
                    C2211631BhB.LJIILL("b9242", null);
                    C852210Xbv.LIZ();
                }
            }
        }
        WeakReference<C0XQG> weakReference3 = C0XQF.LIZJ;
        if (weakReference3 != null && (c0xqg = weakReference3.get()) != null) {
            c0xqg.LJJLIIIJ(c0xo3, c1058910df7.LIZLLL);
        }
        C0XQF.LIZJ = null;
        C0XQF.LIZIZ = null;
        C0XQF.LIZ = null;
        C0XQF.LIZLLL = null;
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("code", 1);
            jSONObject4.put("msg", "JSB_SUCCESS");
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LLILLJJLI.LIZ(c1058910df7.LIZIZ, jSONObject4);
    }
}
