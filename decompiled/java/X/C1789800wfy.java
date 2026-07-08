package X;

import android.app.Activity;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0wfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.jsb.impl.IapPurchaseMethod$handle$1$1", f = "IapPurchaseMethod.kt", l = {29}, m = "invokeSuspend")
public final class C1789800wfy extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1157840gEg<InterfaceC1787320wby>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1791430wib LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789800wfy(InterfaceC1791430wib interfaceC1791430wib, Activity activity, InterfaceC1364105Vn<? super C1789800wfy> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1791430wib;
        this.LLILLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1789800wfy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1157840gEg<InterfaceC1787320wby>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? LJ;
        C1C7U.LIZ("IapPurchaseMethod@81f1.handle$1$1");
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
            String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            String encodedPayload = this.LLILLJJLI.getEncodedPayload();
            Map<String, Object> trackingMap = this.LLILLJJLI.getTrackingMap();
            if (trackingMap != null) {
                LJ = new LinkedHashMap(C2097908Jt.LIZIZ(trackingMap.size()));
                Iterator it2 = trackingMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    LJ.put(entry.getKey(), entry.toString());
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            C1788120wdG c1788120wdG = new C1788120wdG(this.LLILLL, strValueOf, LJ, encodedPayload);
            this.LL = 1;
            obj = c1789140weuLIZIZ.LJFF(c1788120wdG, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IapPurchaseMethod@81f1.handle$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IapPurchaseMethod@81f1.handle$1$1");
        return obj;
    }
}
