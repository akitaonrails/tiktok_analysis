package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.account.otl.LoginSyncService;
import com.ss.android.ugc.aweme.account.otl.WebAuthTokenResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0WVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginServer$openWithExternalBrowser$1", f = "WebAuthSyncLoginServer.kt", l = {}, m = "invokeSuspend")
public final class C824490WVz extends C09AX implements Function2<WebAuthTokenResponse, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, String, EnumC604020Nma, Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C824490WVz(InterfaceC1631620sYq<? super Boolean, ? super String, ? super EnumC604020Nma, Unit> interfaceC1631620sYq, String str, String str2, String str3, InterfaceC1364105Vn<? super C824490WVz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C824490WVz c824490WVz = new C824490WVz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c824490WVz.LL = obj;
        return c824490WVz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        String str;
        Integer num;
        C1C7U.LIZ("WebAuthSyncLoginServer@eb94.openWithExternalBrowser$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        WebAuthTokenResponse webAuthTokenResponse = (WebAuthTokenResponse) this.LL;
        String str2 = webAuthTokenResponse.message;
        WebAuthTokenResponse.Data data = webAuthTokenResponse.data;
        if (u.LJIJI("success", str2, true) && data != null) {
            Intent intent = new Intent(C1BWL.LIZ(), (Class<?>) LoginSyncService.class);
            intent.putExtra("token", data.idToken);
            intent.putExtra("ttl", data.ttl);
            intent.putExtra("redirect_url", data.redirectUrl);
            intent.putExtra("start_url", this.LLILLL);
            intent.putExtra("target_url", this.LLILZ);
            intent.putExtra("nonce", this.LLILZIL);
            C2204961BRm.LJJ(C1BWL.LIZ(), intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECup+5DJvwIJykpcFCKmxyfZrepHSUZvcXEk=", null));
            this.LLILLJJLI.invoke(true, null, EnumC604020Nma.BROWSER);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("WebAuthSyncLoginServer@eb94.openWithExternalBrowser$1");
            return unit;
        }
        InterfaceC1631620sYq<Boolean, String, EnumC604020Nma, Unit> interfaceC1631620sYq = this.LLILLJJLI;
        StringBuilder sb = new StringBuilder("fail to get token with error code ");
        if (data != null && (num = data.errorCode) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        sb.append(iIntValue);
        sb.append(" and error msg ");
        if (data == null || (str = data.errorDescription) == null) {
            str = "";
        }
        sb.append(str);
        interfaceC1631620sYq.invoke(false, sb.toString(), null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("WebAuthSyncLoginServer@eb94.openWithExternalBrowser$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WebAuthTokenResponse webAuthTokenResponse, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(webAuthTokenResponse, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
