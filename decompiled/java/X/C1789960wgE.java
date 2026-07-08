package X;

import android.app.Activity;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0wgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.iap.service.IapServiceClass$buyIapProduct$1", f = "IapServiceClass.kt", l = {333}, m = "invokeSuspend")
public final class C1789960wgE extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1157840gEg<InterfaceC1787320wby>>, Object> {
    public int LL;
    public final /* synthetic */ C0KMX LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ HashMap<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789960wgE(C0KMX c0kmx, Activity activity, HashMap<String, Object> map, InterfaceC1364105Vn<? super C1789960wgE> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0kmx;
        this.LLILLL = activity;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1789960wgE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1157840gEg<InterfaceC1787320wby>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1788090wdD c1788110wdF;
        String str;
        Object objLJFF = obj;
        C1C7U.LIZ("IapServiceClass@66cd.buyIapProduct$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJFF);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJFF);
            C1789140weu c1789140weuLIZIZ = InterfaceC1789300wfA.LIZ.LIZIZ();
            C0KMX c0kmx = this.LLILLJJLI;
            if (c0kmx instanceof C1791720wj4) {
                Activity activity = this.LLILLL;
                if (activity != null) {
                    String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                    C519990KaL c519990KaL = ((C1791720wj4) this.LLILLJJLI).LIZLLL;
                    if (c519990KaL != null && (str = c519990KaL.LIZ) != null) {
                        Map mapLJ = this.LLILZ;
                        if (mapLJ == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJ.size()));
                        for (Map.Entry entry : mapLJ.entrySet()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                        }
                        c1788110wdF = new C1788120wdG(activity, strValueOf, linkedHashMap, str);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (c0kmx instanceof C1790090wgR) {
                Activity activity2 = this.LLILLL;
                if (activity2 != null) {
                    String strValueOf2 = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                    C1790090wgR c1790090wgR = (C1790090wgR) this.LLILLJJLI;
                    String str2 = c1790090wgR.LIZ;
                    String str3 = c1790090wgR.LIZIZ;
                    Map mapLJ2 = this.LLILZ;
                    if (mapLJ2 == null) {
                        mapLJ2 = C2097608Jq.LJ();
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJ2.size()));
                    for (Map.Entry entry2 : mapLJ2.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
                    }
                    c1788110wdF = new C1788110wdF(activity2, strValueOf2, linkedHashMap2, null, str2, str3);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new RuntimeException("unsupported type");
            }
            this.LL = 1;
            objLJFF = c1789140weuLIZIZ.LJFF(c1788110wdF, this);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("IapServiceClass@66cd.buyIapProduct$1");
                return objLJFF2;
            }
        }
        C1C7U.LIZIZ("IapServiceClass@66cd.buyIapProduct$1");
        return objLJFF;
    }
}
