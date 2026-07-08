package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.hybridcomponent.jsb.AnoleCommonJSBMethod$handleSpecialScene$1", f = "AnoleCommonJSBMethod.kt", l = {}, m = "invokeSuspend")
public final class C1640906bf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1641106bh LL;
    public final /* synthetic */ InterfaceC1641206bi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640906bf(C1641106bh c1641106bh, InterfaceC1641206bi interfaceC1641206bi, InterfaceC1364105Vn<? super C1640906bf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1641106bh;
        this.LLILLJJLI = interfaceC1641206bi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1640906bf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FollowStatus followStatusLJIIIIZZ;
        C1C7U.LIZ("AnoleCommonJSBMethod@fe29.handleSpecialScene$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1641106bh c1641106bh = this.LL;
        String params = this.LLILLJJLI.getParams();
        c1641106bh.getClass();
        try {
            JSONObject jSONObject = new JSONObject(params);
            String strOptString = jSONObject.optString("uid");
            String strOptString2 = jSONObject.optString("sec_uid");
            int iOptInt = jSONObject.optInt("type");
            String strOptString3 = jSONObject.optString("enter_from");
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (strOptString.length() > 0 && iUserService != null) {
                Iterator it2 = a0.LJJLIIIJILLIZJL(strOptString, new String[]{","}, 0, 6).iterator();
                while (it2.hasNext()) {
                    String string = a0.LJLIIIL((String) it2.next()).toString();
                    if (string.length() > 0 && (followStatusLJIIIIZZ = iUserService.LJIIIIZZ(iOptInt, -1, -1, -1, string, strOptString2, "", "", null, new HashMap())) != null) {
                        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().postValue(followStatusLJIIIIZZ);
                        if (strOptString3.length() > 0 && (followStatusLJIIIIZZ.getFollowStatus() == 1 || followStatusLJIIIIZZ.getFollowStatus() == 2)) {
                            LogHelper logHelper = (LogHelper) PluggableExtentionKt.pluggableSpi$default(LogHelper.class, false, false, false, 14, null);
                            if (logHelper != null) {
                                logHelper.LIZJ(strOptString3, string);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnoleCommonJSBMethod@fe29.handleSpecialScene$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
