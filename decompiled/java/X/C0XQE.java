package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XQE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQE implements InterfaceC1051760dTa {
    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        Fragment fragment;
        C19EG activity;
        C0XQG c0xqg;
        WeakReference<C0XQG> weakReference = C0XQF.LIZJ;
        if (weakReference != null && (c0xqg = weakReference.get()) != null) {
            c0xqg.LLJLILLLLZIIL();
        }
        AccountRetrofitInetcept.LL.getClass();
        AccountRetrofitInetcept.LLILLJJLI = "";
        WeakReference<Fragment> weakReference2 = C0XQF.LIZ;
        if (weakReference2 != null && (fragment = weakReference2.get()) != null && (activity = fragment.getActivity()) != null) {
            activity.finish();
        }
        C0XQH c0xqh = C0XQF.LIZLLL;
        if (c0xqh != null) {
            c0xqh.LIZJ();
        }
        C0XQF.LIZ = null;
        C0XQF.LIZIZ = null;
        C0XQF.LIZJ = null;
        C0XQF.LIZLLL = null;
    }
}
