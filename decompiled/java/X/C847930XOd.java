package X;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.IRegionApi;
import com.bytedance.sdk.account.api.IgnoredResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.sdk.account.region.TTPManager$tryAlert$1", f = "TTPManager.kt", l = {452}, m = "invokeSuspend")
public final class C847930XOd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C847930XOd(int i, int i2, String str, String str2, String str3, String str4, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = i2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        return new C847930XOd(this.LLILLL, this.LLILZIL, str, this.LLILZ, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        C1C7U.LIZ("TTPManager@c6fa.tryAlert$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Regex regex = C0XOW.LIZ;
            String str = this.LLILLJJLI;
            if (this.LLILLL != 0) {
                i = 1;
            } else {
                i = 0;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("request_domain", str);
                jSONObject.put("is_retry", i);
                C0XG9.LJ("ttp_region_alert_submit", jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C847960XOg c847960XOg = IRegionApi.LIZ;
            String str2 = this.LLILLJJLI;
            String str3 = this.LLILZ;
            int i4 = this.LLILZIL;
            String str4 = this.LLILZLL;
            String str5 = this.LLIZ;
            this.LL = 1;
            obj = c847960XOg.LIZLLL(i4, str2, str3, str4, str5, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TTPManager@c6fa.tryAlert$1");
                return objLJFF;
            }
        }
        if (!TextUtils.equals(((IgnoredResponse) obj).message, "success") && (i2 = this.LLILLL) < 3) {
            C847910XOb c847910XOb = C847910XOb.LIZ;
            String str6 = this.LLILLJJLI;
            String str7 = this.LLILZ;
            int i5 = this.LLILZIL;
            String str8 = this.LLILZLL;
            String str9 = this.LLIZ;
            c847910XOb.getClass();
            C847910XOb.LJIIL(i5, i2 + 1, str6, str7, str8, str9);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTPManager@c6fa.tryAlert$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
