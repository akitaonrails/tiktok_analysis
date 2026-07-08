package X;

import android.app.Activity;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0wgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.iap.service.IapServiceClass$buyIapProductV2$1", f = "IapServiceClass.kt", l = {391}, m = "invokeSuspend")
public final class C1789950wgD extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1157840gEg<InterfaceC1787320wby>>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C1789970wgF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789950wgD(Activity activity, C1789970wgF c1789970wgF, InterfaceC1364105Vn<? super C1789950wgD> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = c1789970wgF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1789950wgD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1157840gEg<InterfaceC1787320wby>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IapServiceClass@66cd.buyIapProductV2$1");
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
            C1789140weu c1789140weuLIZIZ = InterfaceC1789300wfA.LIZ.LIZIZ();
            Activity activity = this.LLILLJJLI;
            if (activity != null) {
                String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                C1789970wgF c1789970wgF = this.LLILLL;
                String str = c1789970wgF.LIZ;
                HashMap<String, Object> map = c1789970wgF.LIZIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                Iterator<T> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                C1788120wdG c1788120wdG = new C1788120wdG(activity, strValueOf, linkedHashMap, str);
                this.LL = 1;
                obj = c1789140weuLIZIZ.LJFF(c1788120wdG, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IapServiceClass@66cd.buyIapProductV2$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C1C7U.LIZIZ("IapServiceClass@66cd.buyIapProductV2$1");
        return obj;
    }
}
