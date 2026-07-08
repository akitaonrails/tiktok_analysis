package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECPreloadEventConditionHandler$eventListener$1$onEvent$1", f = "ECPreloadEventConditionHandler.kt", l = {}, m = "invokeSuspend")
public final class C2128508Vn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2128608Vo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2128508Vn(C2128608Vo c2128608Vo, String str, JSONObject jSONObject, InterfaceC1364105Vn<? super C2128508Vn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2128608Vo;
        this.LLILLJJLI = str;
        this.LLILLL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2128508Vn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Set<String> setLJJIJIL;
        String string;
        C1C7U.LIZ("ECPreloadEventConditionHandler@8708.eventListener$1$onEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) C2131308Wp.LJ.getValue();
        String str = this.LLILLJJLI;
        JSONObject jSONObject = this.LLILLL;
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            ECPreloadEventData eCPreloadEventData = (ECPreloadEventData) it2.next();
            if (Intrinsics.LJFF(str, eCPreloadEventData.name)) {
                try {
                    n nVar = eCPreloadEventData.param;
                    if (nVar != null && (setLJJIJIL = nVar.LJJIJIL()) != null) {
                        for (String str2 : setLJJIJIL) {
                            String strLJIL = eCPreloadEventData.param.LJJIIZ(str2).LJIL();
                            Object objOpt = jSONObject.opt(str2);
                            String string2 = null;
                            if (objOpt != null) {
                                string = objOpt.toString();
                            } else {
                                string = null;
                            }
                            if (!Intrinsics.LJFF(string, strLJIL)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ECPreloadEventConditionHandler.onEvent(), param not match, key=");
                                sbLIZ.append(str2);
                                sbLIZ.append(", configValue=");
                                sbLIZ.append(strLJIL);
                                sbLIZ.append(", eventValue=");
                                Object objOpt2 = jSONObject.opt(str2);
                                if (objOpt2 != null) {
                                    string2 = objOpt2.toString();
                                }
                                sbLIZ.append(string2);
                                sbLIZ.append(" eventName=");
                                sbLIZ.append(str);
                                C2188811AlT.LIZIZ(sbLIZ);
                                z = false;
                            }
                        }
                        if (z) {
                        }
                    }
                    arrayList.add(eCPreloadEventData);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.LL.LIZ.invoke(arrayList);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECPreloadEventConditionHandler@8708.eventListener$1$onEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
