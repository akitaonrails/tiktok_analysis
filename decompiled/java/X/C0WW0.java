package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginServer;
import com.ss.android.ugc.aweme.account.otl.WebAuthTokenResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0WW0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginServer$openWithCustomTab$1", f = "WebAuthSyncLoginServer.kt", l = {122}, m = "invokeSuspend")
public final class C0WW0 extends C09AX implements Function2<WebAuthTokenResponse, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, String, EnumC604020Nma, Unit> LLILLL;
    public final /* synthetic */ WebAuthSyncLoginServer LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0WW0(InterfaceC1631620sYq<? super Boolean, ? super String, ? super EnumC604020Nma, Unit> interfaceC1631620sYq, WebAuthSyncLoginServer webAuthSyncLoginServer, Activity activity, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C0WW0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = webAuthSyncLoginServer;
        this.LLILZIL = activity;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0WW0 c0ww0 = new C0WW0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0ww0.LLILLJJLI = obj;
        return c0ww0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        String str;
        Integer num;
        C1C7U.LIZ("WebAuthSyncLoginServer@eb94.openWithCustomTab$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            WebAuthTokenResponse webAuthTokenResponse = (WebAuthTokenResponse) this.LLILLJJLI;
            String str2 = webAuthTokenResponse.message;
            WebAuthTokenResponse.Data data = webAuthTokenResponse.data;
            String str3 = "";
            if (u.LJIJI("success", str2, true) && data != null) {
                C0WW5 c0ww5 = (C0WW5) this.LLILZ.LIZ.getValue();
                Activity activity = this.LLILZIL;
                String str4 = this.LLILZLL;
                String str5 = this.LLIZ;
                String str6 = data.redirectUrl;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = data.idToken;
                if (str7 != null) {
                    str3 = str7;
                }
                String str8 = this.LLIZLLLIL;
                this.LL = 1;
                obj = c0ww5.LJII(activity, str4, str5, str6, str3, str8, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("WebAuthSyncLoginServer@eb94.openWithCustomTab$1");
                    return objLJFF;
                }
            } else {
                InterfaceC1631620sYq<Boolean, String, EnumC604020Nma, Unit> interfaceC1631620sYq = this.LLILLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fail to get token with error code ");
                if (data != null && (num = data.errorCode) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                sbLIZ.append(iIntValue);
                sbLIZ.append(" and error msg ");
                if (data != null && (str = data.errorDescription) != null) {
                    str3 = str;
                }
                sbLIZ.append(str3);
                interfaceC1631620sYq.invoke(false, C2188811AlT.LIZIZ(sbLIZ), null);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("WebAuthSyncLoginServer@eb94.openWithCustomTab$1");
                return unit;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILLL.invoke(true, null, EnumC604020Nma.CUSTOM_TAB);
        } else {
            WebAuthSyncLoginServer webAuthSyncLoginServer = this.LLILZ;
            String str9 = this.LLILZLL;
            String str10 = this.LLIZ;
            String str11 = this.LLJ;
            InterfaceC1631620sYq<Boolean, String, EnumC604020Nma, Unit> interfaceC1631620sYq2 = this.LLILLL;
            webAuthSyncLoginServer.getClass();
            WebAuthSyncLoginServer.LIZLLL(str9, str10, str11, interfaceC1631620sYq2);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("WebAuthSyncLoginServer@eb94.openWithCustomTab$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WebAuthTokenResponse webAuthTokenResponse, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(webAuthTokenResponse, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
