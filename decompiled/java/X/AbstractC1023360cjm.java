package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1023360cjm extends AbstractC1023720ckM implements InterfaceC1009950cO9 {
    public final AbstractC1023090cjL adBizScene;
    public final C1023030cjF dynamicParamsEventProcessor;
    public final C01GW dynamicParamsLogTag$delegate;

    public abstract InterfaceC1126004ao getAdLogics(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, C1023640ckE c1023640ckE);

    public abstract CommonAdData getCommonAdData(C1196804mE c1196804mE);

    public abstract void sendAdInternal(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, CommonAdData commonAdData, Map<String, ? extends Object> map);

    public abstract void sendAdInternal(String str, String str2, CommonAdData commonAdData, Map<String, ? extends Object> map);

    public abstract void sendAdInternal(String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map);

    public final String getDynamicParamsLogTag() {
        return (String) this.dynamicParamsLogTag$delegate.getValue();
    }

    @Override // X.AbstractC1023380cjo
    public InterfaceC1007800cKg getProcessor() {
        C1035030d2b c1035030d2b = C1035030d2b.LIZ;
        InterfaceC1007800cKg[] interfaceC1007800cKgArr = {super.getProcessor(), this.dynamicParamsEventProcessor};
        c1035030d2b.getClass();
        return C1035030d2b.LIZ(interfaceC1007800cKgArr);
    }

    public AbstractC1023090cjL getAdBizScene() {
        return this.adBizScene;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0cjF] */
    public AbstractC1023360cjm(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.adBizScene = C1023040cjG.LIZIZ;
        this.dynamicParamsLogTag$delegate = C452501pT.LIZIZ(new C1023130cjP(this));
        this.dynamicParamsEventProcessor = new InterfaceC1007800cKg() { // from class: X.0cjF
            @Override // X.InterfaceC1007800cKg
            public final Map<String, Object> LIZ(C1196804mE c1196804mE, Map<String, Object> map, String str) {
                JSONObject jSONObject;
                String strLIZIZ;
                Object objInvoke;
                Function1<AbstractC1023200cjW, Object> function1;
                if (this.LIZ.getAdBizScene() instanceof C1023040cjG) {
                    return map;
                }
                Object obj = ((LinkedHashMap) map).get("ad_extra_data");
                if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null || (strLIZIZ = this.LIZ.getAdBizScene().LIZIZ(map)) == null) {
                    return map;
                }
                Iterator<String> itKeys = jSONObject.keys();
                AbstractC1023360cjm abstractC1023360cjm = this.LIZ;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (jSONObject.isNull(next)) {
                        C1023070cjJ c1023070cjJ = C1023060cjI.LJ(abstractC1023360cjm.getAdBizScene()).LIZIZ.get(strLIZIZ);
                        if (c1023070cjJ != null && (function1 = c1023070cjJ.LIZLLL.get(next)) != null) {
                            objInvoke = function1.invoke(c1023070cjJ.LIZIZ);
                        } else {
                            objInvoke = null;
                        }
                        C12865051r.LIZIZ(jSONObject, next, objInvoke);
                    }
                }
                return map;
            }
        };
    }

    @Override // X.InterfaceC1009950cO9
    public final void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq) {
        proceedAdLogUsingRawAdByInjection$default(this, interfaceC1023400cjq, null, 2, null);
    }

    private final void proceedAdLogUsingRawAdByInjection(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, Function1<? super C1023640ckE, Unit> function1) {
        C1023640ckE c1023640ckELIZ = C1023370cjn.LIZ(function1);
        proceedAdLogUsingRawAdDirectly(interfaceC1023400cjq, getCommonAdData(new C1196804mE(this, c1023640ckELIZ)), c1023640ckELIZ);
    }

    @Override // X.AbstractC1023380cjo
    public Map<String, Object> flatParams(InterfaceC1023400cjq<?> interfaceC1023400cjq, C1023640ckE c1023640ckE) {
        JSONObject jSONObject;
        Map<String, Object> mapFlatParams = super.flatParams(interfaceC1023400cjq, c1023640ckE);
        if (mapFlatParams == null) {
            return null;
        }
        Object obj = mapFlatParams.get("ad_extra_data");
        if ((obj instanceof JSONObject) && (jSONObject = (JSONObject) obj) != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                if (jSONObject.isNull(itKeys.next())) {
                    itKeys.remove();
                }
            }
        }
        return mapFlatParams;
    }

    @Override // X.InterfaceC1009950cO9
    public final void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, CommonAdData commonAdData) {
        proceedAdLogUsingRawAdDirectly$default(this, interfaceC1023400cjq, commonAdData, null, 4, null);
    }

    @Override // X.InterfaceC1009950cO9
    public final void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, Function1<? super C1023640ckE, Unit> function1) {
        proceedAdLogUsingRawAdByInjection(interfaceC1023400cjq, function1);
    }

    private final void proceedAdLogUsingRawAdDirectly(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, CommonAdData commonAdData, C1023640ckE c1023640ckE) {
        withEssentialAdParamContext(this, interfaceC1023400cjq, commonAdData);
        withEssentialAdParamLogic(this, interfaceC1023400cjq, c1023640ckE);
        sendAdInternal(interfaceC1023400cjq, commonAdData, flatParams(interfaceC1023400cjq, c1023640ckE));
    }

    private final void withEssentialAdParamContext(C1023640ckE c1023640ckE, InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, CommonAdData commonAdData) {
        c1023640ckE.withContextByType(InterfaceC1023400cjq.class, interfaceC1023400cjq);
        c1023640ckE.withContextByType(CommonAdData.class, commonAdData);
        c1023640ckE.withContext(commonAdData);
    }

    private final void withEssentialAdParamLogic(C1023640ckE c1023640ckE, InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, C1023640ckE c1023640ckE2) {
        if (c1023640ckE2 == null) {
            c1023640ckE2 = new C1023640ckE(new Object[0]);
        }
        c1023640ckE.withLogicProvider(getAdLogics(interfaceC1023400cjq, c1023640ckE2));
    }

    @Override // X.InterfaceC1009950cO9
    public final void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, CommonAdData commonAdData, Function1<? super C1023640ckE, Unit> function1) {
        proceedAdLogUsingRawAdDirectly(interfaceC1023400cjq, commonAdData, C1023370cjn.LIZ(function1));
    }

    public final void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, String str, String str2, String str3) {
        proceedAdLogNotUsingRawAd$default(this, interfaceC1023400cjq, str, str2, str3, null, 16, null);
    }

    private final void proceedAdLogNotUsingRawAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, String str, String str2, String str3, C1023640ckE c1023640ckE) {
        String str4;
        withEssentialAdParamContext$default(this, this, interfaceC1023400cjq, null, 2, null);
        withEssentialAdParamLogic(this, interfaceC1023400cjq, c1023640ckE);
        C1023480cjy.LIZ.getClass();
        withParam(C1023480cjy.LJFF, str);
        withParam(C1023480cjy.LJI, str2);
        C1002190cBd c1002190cBd = C1023480cjy.LJIIIZ;
        if (str3 == null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str4 = str3;
        }
        withParam(c1002190cBd, str4);
        sendAdInternal(interfaceC1023400cjq.getEventId().getFirst(), interfaceC1023400cjq.getEventId().getSecond(), str, str2, str3, flatParams(interfaceC1023400cjq, c1023640ckE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void proceedAdLogUsingRawAdByInjection$default(AbstractC1023360cjm abstractC1023360cjm, InterfaceC1023400cjq interfaceC1023400cjq, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            abstractC1023360cjm.proceedAdLogUsingRawAdByInjection(interfaceC1023400cjq, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: proceedAdLogUsingRawAdByInjection");
    }

    @Override // X.InterfaceC1009950cO9
    public final void logAd(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, String str, String str2, String str3, Function1<? super C1023640ckE, Unit> function1) {
        proceedAdLogNotUsingRawAd(interfaceC1023400cjq, str, str2, str3, C1023370cjn.LIZ(function1));
    }

    public static /* synthetic */ void proceedAdLogUsingRawAdDirectly$default(AbstractC1023360cjm abstractC1023360cjm, InterfaceC1023400cjq interfaceC1023400cjq, CommonAdData commonAdData, C1023640ckE c1023640ckE, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                c1023640ckE = null;
            }
            abstractC1023360cjm.proceedAdLogUsingRawAdDirectly(interfaceC1023400cjq, commonAdData, c1023640ckE);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: proceedAdLogUsingRawAdDirectly");
    }

    public static /* synthetic */ void withEssentialAdParamContext$default(AbstractC1023360cjm abstractC1023360cjm, C1023640ckE c1023640ckE, InterfaceC1023400cjq interfaceC1023400cjq, CommonAdData commonAdData, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                commonAdData = null;
            }
            abstractC1023360cjm.withEssentialAdParamContext(c1023640ckE, interfaceC1023400cjq, commonAdData);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withEssentialAdParamContext");
    }

    public static /* synthetic */ void proceedAdLogNotUsingRawAd$default(AbstractC1023360cjm abstractC1023360cjm, InterfaceC1023400cjq interfaceC1023400cjq, String str, String str2, String str3, C1023640ckE c1023640ckE, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                c1023640ckE = null;
            }
            abstractC1023360cjm.proceedAdLogNotUsingRawAd(interfaceC1023400cjq, str, str2, str3, c1023640ckE);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: proceedAdLogNotUsingRawAd");
    }
}
