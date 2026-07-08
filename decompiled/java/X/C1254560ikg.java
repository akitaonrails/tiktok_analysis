package X;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import java.util.Map;

/* JADX INFO: renamed from: X.0ikg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1254560ikg extends AbstractC1254620ikm {
    public String LLILZ;
    public String LLILZIL;
    public final Boolean LLILZLL = Boolean.TRUE;

    public static final int LJIILLIIL() {
        if (TextUtils.equals(null, "music_detail")) {
            return 1;
        }
        if (TextUtils.equals(null, "prop_page")) {
            return 3;
        }
        TextUtils.equals(null, "general_search");
        TextUtils.equals(null, "general_search");
        TextUtils.equals(null, "general_search");
        return 0;
    }

    public final void LJIILL() {
        LJIIJ(new AbstractC666100QAu<UserResponse>() { // from class: X.0ikh
            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                if (objArr != null && objArr.length >= 2) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC666100QAu
            public final boolean sendRequest(Object... objArr) {
                String str;
                if (!super.sendRequest(objArr)) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    this.LL.getClass();
                    c2344009Gk.LJIIIIZZ("enter_from", null);
                    if (objArr != null) {
                        c2344009Gk.LJFF("params", TextUtils.join(",", objArr));
                    }
                    C20684815ws.LJIILLIIL("profile_request_request", c2344009Gk.LIZ);
                    return false;
                }
                C1254560ikg c1254560ikg = this.LL;
                c1254560ikg.LLILZ = (String) objArr[0];
                String str2 = (String) objArr[1];
                c1254560ikg.LLILZIL = str2;
                if (objArr.length > 2) {
                    str = (String) objArr[2];
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    C1254580iki c1254580ikiLIZ = C1254580iki.LIZ();
                    WeakHandler weakHandler = this.mHandler;
                    String str3 = this.LL.LLILZIL;
                    int iLJIILLIIL = C1254560ikg.LJIILLIIL();
                    Boolean bool = this.LL.LLILZLL;
                    c1254580ikiLIZ.getClass();
                    C1254580iki.LIZIZ(C1254710ikv.LIZIZ(str3, null, null, iLJIILLIIL, bool, EnumC1254690ikt.UNKNOWN), weakHandler);
                } else {
                    C1254580iki c1254580ikiLIZ2 = C1254580iki.LIZ();
                    WeakHandler weakHandler2 = this.mHandler;
                    String str4 = this.LL.LLILZ;
                    int iLJIILLIIL2 = C1254560ikg.LJIILLIIL();
                    Boolean bool2 = this.LL.LLILZLL;
                    c1254580ikiLIZ2.getClass();
                    C1254580iki.LIZIZ(C1254710ikv.LIZIZ(null, str4, str, iLJIILLIIL2, bool2, EnumC1254690ikt.UNKNOWN), weakHandler2);
                }
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                this.LL.getClass();
                c2344009Gk2.LJIIIIZZ("enter_from", null);
                c2344009Gk2.LJIIIIZZ("sec_uid", this.LL.LLILZIL);
                c2344009Gk2.LJIIIIZZ("uid", this.LL.LLILZ);
                C20684815ws.LJIILLIIL("profile_request_request", c2344009Gk2.LIZ);
                return true;
            }
        });
    }

    public C1254560ikg() {
        LJIILL();
    }

    @Override // X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        return super.LIZJ(objArr);
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public void onFailed(Exception exc) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("to_user_id", this.LLILZ);
        c2344009Gk.LJIIIIZZ("enter_from", null);
        c2344009Gk.LIZJ(0, "is_success");
        c2344009Gk.LJIIIIZZ("fail_info", exc.getMessage());
        if (exc instanceof C0XIR) {
            c2344009Gk.LJFF("response", ((C0XIR) exc).getResponse());
        }
        Map<String, String> map = c2344009Gk.LIZ;
        C20684815ws.LJIILLIIL("profile_request_response", map);
        C2344809Gs.LIZLLL(4, "aweme/v1/user", map.toString());
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC1254670ikr) k).pg2();
        }
    }
}
