package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W8O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8O implements InterfaceC1051760dTa {
    public final WeakReference<Context> LL;

    public C0W8O(WeakReference weakReference) {
        this.LL = weakReference;
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        String strOptString;
        String str;
        JSONObject jSONObject2;
        if (this.LL.get() == null) {
            return;
        }
        if (c1058910df7 != null && (jSONObject2 = c1058910df7.LIZLLL) != null) {
            strOptString = jSONObject2.optString("interstitial_token");
        } else {
            strOptString = null;
        }
        AccountRetrofitInetcept accountRetrofitInetcept = AccountRetrofitInetcept.LL;
        if (strOptString == null) {
            str = "";
        } else {
            str = strOptString;
        }
        accountRetrofitInetcept.getClass();
        AccountRetrofitInetcept.LLILLJJLI = str;
        Intent intent = new Intent(this.LL.get(), (Class<?>) TwoStepVerificationManagementActivity.class);
        intent.putExtra("enter_from", "mandatory_page");
        intent.putExtra("is_from_un_login_user", true);
        intent.putExtra("interstitial_token", strOptString);
        Context context = this.LL.get();
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEvtw5A95wLFugpgzX4iiAXRTLX+pI6VYYTA=", null));
    }
}
