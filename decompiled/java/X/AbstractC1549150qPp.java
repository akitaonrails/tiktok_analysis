package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.IDLXDynamic;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1549150qPp<INPUT extends XBaseParamModel, OUTPUT extends XBaseResultModel> implements InterfaceC1063710dmr {
    public InterfaceC634840OvC IBridgeSdkContext;
    public C1549170qPr contextProviderFactory;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getIBridgeSdkContext$annotations() {
    }

    public final C1549170qPr getContextProviderFactory() {
        return null;
    }

    public boolean getUseOriginalResult() {
        return false;
    }

    public abstract void handle(INPUT input, CompletionBlock<OUTPUT> completionBlock, EnumC1063300dmC enumC1063300dmC);

    @InterfaceC1294060jmO
    public <T> T provideContext(Class<T> cls) {
        return null;
    }

    @Override // X.InterfaceC1063710dmr
    public Class<? extends XBaseParamModel> provideParamModel() {
        return null;
    }

    @Override // X.InterfaceC1063710dmr
    public Class<? extends XBaseResultModel> provideResultModel() {
        return null;
    }

    @Override // X.InterfaceC1063710dmr
    public void release() {
    }

    public final void setContextProviderFactory(C1549170qPr c1549170qPr) {
    }

    public void setProviderFactory(C1549170qPr c1549170qPr) {
    }

    public boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        return false;
    }

    private final Class<?> getParamsClazz() {
        String containerID;
        C1549460qQK c1549460qQKLIZ;
        ConcurrentHashMap<Class<? extends InterfaceC1063710dmr>, C1549180qPs> concurrentHashMap;
        C1549180qPs c1549180qPs;
        Class<?> cls;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null && (c1549460qQKLIZ = C1543810qHD.LIZ(containerID)) != null && (concurrentHashMap = c1549460qQKLIZ.LIZIZ) != null && (c1549180qPs = concurrentHashMap.get(getClass())) != null && (cls = c1549180qPs.LIZ) != null) {
            return cls;
        }
        System.out.println((Object) "idl Map->Model. no cache");
        Class<?>[] declaredClasses = getClass().getDeclaredClasses();
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : declaredClasses) {
            if (cls2.getAnnotation(C040D.class) != null) {
                arrayList.add(cls2);
            }
        }
        if (arrayList.isEmpty()) {
            Class<?>[] declaredClasses2 = getClass().getSuperclass().getDeclaredClasses();
            arrayList = new ArrayList();
            for (Class<?> cls3 : declaredClasses2) {
                if (cls3.getAnnotation(C040D.class) != null) {
                    arrayList.add(cls3);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Illegal class format, no param model is defined in class");
            }
        }
        return (Class) C13LP.LJJJLL(arrayList);
    }

    @Override // X.InterfaceC1063710dmr
    public EnumC1063530dmZ getAccess() {
        return EnumC1063530dmZ.PRIVATE;
    }

    @Override // X.InterfaceC1063710dmr
    public EnumC1063610dmh getCompatibility() {
        return EnumC1063610dmh.InCompatible;
    }

    public final InterfaceC634840OvC getSDKContext() {
        return this.IBridgeSdkContext;
    }

    private final INPUT createParamModelProxy(final Map<String, ? extends Object> map) {
        Class<?> paramsClazz = getParamsClazz();
        if (paramsClazz != null) {
            return (INPUT) Proxy.newProxyInstance(paramsClazz.getClassLoader(), new Class[]{paramsClazz}, new InvocationHandler() { // from class: X.07dP
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    Object obj2;
                    Object json;
                    if (method.getName().equals("toJSON")) {
                        Map<String, Object> map2 = map;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                            for (Object obj3 : map2.entrySet()) {
                                Object key = ((Map.Entry) obj3).getKey();
                                Map.Entry entry = (Map.Entry) obj3;
                                Object value = entry.getValue();
                                if (value instanceof Long) {
                                    json = entry.getValue();
                                } else if (value instanceof Integer) {
                                    json = entry.getValue();
                                } else if (value instanceof Double) {
                                    json = entry.getValue();
                                } else if (value instanceof String) {
                                    json = entry.getValue();
                                } else if (value instanceof Boolean) {
                                    json = entry.getValue();
                                } else if (value instanceof List) {
                                    json = C1906407dO.LIZ((List) entry.getValue());
                                } else if (value instanceof Map) {
                                    json = C1906407dO.LIZIZ((Map) entry.getValue());
                                } else if (value instanceof IDLXDynamic) {
                                    json = C1974707oP.LIZIZ((IDLXDynamic) entry.getValue());
                                } else if (entry.getValue() instanceof XBaseModel) {
                                    json = ((XBaseModel) entry.getValue()).toJSON();
                                } else {
                                    json = null;
                                }
                                linkedHashMap.put(key, json);
                            }
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                if (entry2.getValue() != null) {
                                    jSONObject.put((String) entry2.getKey(), entry2.getValue());
                                }
                            }
                            C189200o6.m2constructorimpl(jSONObject);
                            obj2 = jSONObject;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C098200Yq c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                            obj2 = c098200Yq;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        if (C189200o6.m7isFailureimpl(obj2)) {
                            return jSONObject2;
                        }
                        return obj2;
                    }
                    if (method.getName().equals("toString")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Just need to check if the relevant fields can be obtained, no need to pay attention to the overall situation of the current model. just like this: params.xxx;dataSource = ");
                        sbLIZ.append(map);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                    return map.get(this.getPropertyName(method));
                }
            });
        }
        throw new IllegalStateException("params class is null");
    }

    public final String getHybridUrl(EnumC1063300dmC enumC1063300dmC) {
        View view;
        WebView webView;
        View view2;
        LynxView lynxView;
        if (enumC1063300dmC == EnumC1063300dmC.LYNX) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                view2 = interfaceC634840OvC.getView();
            } else {
                view2 = null;
            }
            if (!(view2 instanceof LynxView) || (lynxView = (LynxView) view2) == null) {
                return null;
            }
            return lynxView.getTemplateUrl();
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            view = interfaceC634840OvC2.getView();
        } else {
            view = null;
        }
        if (!(view instanceof WebView) || (webView = (WebView) view) == null) {
            return null;
        }
        return webView.getUrl();
    }

    public final String getPropertyName(Method method) {
        String containerID;
        C1549460qQK c1549460qQKLIZ;
        ConcurrentHashMap<Class<? extends InterfaceC1063710dmr>, C1549180qPs> concurrentHashMap;
        C1549180qPs c1549180qPs;
        C1549490qQN c1549490qQN;
        String str;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null && (c1549460qQKLIZ = C1543810qHD.LIZ(containerID)) != null && (concurrentHashMap = c1549460qQKLIZ.LIZIZ) != null && (c1549180qPs = concurrentHashMap.get(getClass())) != null && (c1549490qQN = c1549180qPs.LIZJ.LIZ.get(method)) != null && (str = c1549490qQN.LIZIZ) != null) {
            return str;
        }
        return ((InterfaceC1549470qQL) method.getAnnotation(InterfaceC1549470qQL.class)).keyPath();
    }

    public final Object getXValue(Object obj) {
        if (obj instanceof IDLXDynamic) {
            return C1974707oP.LIZ((IDLXDynamic) obj);
        }
        return obj;
    }

    @Override // X.InterfaceC1063710dmr
    public void setBridgeContext(InterfaceC634840OvC interfaceC634840OvC) {
        this.IBridgeSdkContext = interfaceC634840OvC;
    }

    public final JSONObject toJSON(XBaseModel xBaseModel) {
        if (xBaseModel == null) {
            return new JSONObject();
        }
        return xBaseModel.toJSON();
    }

    public final JSONArray toJSON(List<? extends Object> list) {
        return C2348609Ie.LIZJ(list);
    }

    public final JSONObject toJSON(Map<String, ? extends Object> map) {
        return C2348609Ie.LIZLLL(map);
    }

    public final <OUTPUT extends XBaseResultModel> CompletionBlock<OUTPUT> createCompletionBlockProxy(ClassLoader classLoader, final InterfaceC801410VcB interfaceC801410VcB) {
        return (CompletionBlock<OUTPUT>) new CompletionBlock<OUTPUT>(this) { // from class: X.0qPq
            public final /* synthetic */ AbstractC1549150qPp<INPUT, OUTPUT> LIZ;

            /* JADX WARN: Incorrect types in method signature: (TOUTPUT;)V */
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onRawSuccess(XBaseResultModel xBaseResultModel) {
                Map<String, ? extends Object> linkedHashMap;
                if (xBaseResultModel == null || (linkedHashMap = xBaseResultModel.convert()) == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                interfaceC801410VcB.LIZ(linkedHashMap);
            }

            {
                this.LIZ = this;
            }

            /* JADX WARN: Incorrect types in method signature: (TOUTPUT;Ljava/lang/String;)V */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onSuccess(XBaseResultModel xBaseResultModel, String str) {
                Map<String, Object> mapConvert = xBaseResultModel.convert();
                if (mapConvert == null) {
                    mapConvert = new LinkedHashMap<>();
                }
                this.LIZ.onSuccess(interfaceC801410VcB, (Map<String, ? extends Object>) mapConvert, str);
            }

            /* JADX WARN: Incorrect types in method signature: (ILjava/lang/String;TOUTPUT;)V */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) {
                Map<String, ? extends Object> linkedHashMap;
                if (xBaseResultModel == null || (linkedHashMap = xBaseResultModel.convert()) == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                this.LIZ.onFailure(interfaceC801410VcB, i, str, linkedHashMap);
            }
        };
    }

    public final Object getXValue(Map<String, ? extends Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof IDLXDynamic) {
            return C1974707oP.LIZ((IDLXDynamic) obj);
        }
        return obj;
    }

    public final void onSuccess(InterfaceC801410VcB interfaceC801410VcB, Map<String, ? extends Object> map, String str) {
        if (getUseOriginalResult()) {
            if (map.get("originalResult") != null && (map.get("originalResult") instanceof Map)) {
                interfaceC801410VcB.LIZ((Map) map.get("originalResult"));
                return;
            } else {
                interfaceC801410VcB.LIZ(map);
                return;
            }
        }
        if (shouldUseOriginalData(this.IBridgeSdkContext)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("code", 1);
            linkedHashMap.put("msg", str);
            linkedHashMap.putAll(map);
            interfaceC801410VcB.LIZ(linkedHashMap);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("code", 1);
        linkedHashMap2.put("msg", str);
        linkedHashMap2.put("data", map);
        interfaceC801410VcB.LIZ(linkedHashMap2);
    }

    @Override // X.InterfaceC1063710dmr
    public void realHandle(Map<String, ? extends Object> map, InterfaceC801410VcB interfaceC801410VcB, EnumC1063300dmC enumC1063300dmC) {
        C1543190qGD c1543190qGD;
        C1543190qGD c1543190qGD2;
        XBaseParamModel xBaseParamModelCreateParamModelProxy = createParamModelProxy(map);
        if (xBaseParamModelCreateParamModelProxy == null) {
            onFailure$default(this, interfaceC801410VcB, -3, "", null, 8, null);
            return;
        }
        CompletionBlock<OUTPUT> completionBlockCreateCompletionBlockProxy = createCompletionBlockProxy(getClass().getClassLoader(), interfaceC801410VcB);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (c1543190qGD2 = (C1543190qGD) interfaceC634840OvC.LIZIZ(C1543190qGD.class)) != null) {
            c1543190qGD2.LIZLLL.LJIIIIZZ(c1543190qGD2, null);
        }
        handle(xBaseParamModelCreateParamModelProxy, completionBlockCreateCompletionBlockProxy, enumC1063300dmC);
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null && (c1543190qGD = (C1543190qGD) interfaceC634840OvC2.LIZIZ(C1543190qGD.class)) != null) {
            c1543190qGD.LIZLLL.LJII(c1543190qGD, null);
        }
    }

    public final void onFailure(InterfaceC801410VcB interfaceC801410VcB, int i, String str, Map<String, ? extends Object> map) {
        if (getUseOriginalResult()) {
            if (map.get("originalResult") != null && (map.get("originalResult") instanceof Map)) {
                interfaceC801410VcB.LIZ((Map) map.get("originalResult"));
                return;
            } else {
                interfaceC801410VcB.LIZ(map);
                return;
            }
        }
        if (shouldUseOriginalData(this.IBridgeSdkContext)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("code", Integer.valueOf(i));
            linkedHashMap.put("msg", str);
            linkedHashMap.putAll(map);
            interfaceC801410VcB.LIZ(linkedHashMap);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("code", Integer.valueOf(i));
        linkedHashMap2.put("msg", str);
        linkedHashMap2.put("data", map);
        interfaceC801410VcB.LIZ(linkedHashMap2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onFailure$default(AbstractC1549150qPp abstractC1549150qPp, InterfaceC801410VcB interfaceC801410VcB, int i, String str, Map map, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                str = "";
            }
            if ((i2 & 8) != 0) {
                map = new LinkedHashMap();
            }
            abstractC1549150qPp.onFailure(interfaceC801410VcB, i, str, map);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFailure");
    }
}
