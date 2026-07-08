package com.appsflyer.internal;

import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1pSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class AFd1zSDK implements AFc1iSDK {
    public Map<String, Object> AFInAppEventParameterName;
    public final AFd1lSDK AFKeystoreWrapper;
    public boolean values;

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void AFKeystoreWrapper() {
        Context context;
        if (values() && (context = this.AFKeystoreWrapper.AFKeystoreWrapper) != null) {
            this.AFInAppEventParameterName = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("zm6.b");
                Class<?> cls2 = Class.forName("zm6.b$a");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1pSDK.3
                    public /* synthetic */ AFa1ySDK AFInAppEventParameterName;
                    public /* synthetic */ Class AFInAppEventType;

                    public AnonymousClass3(Class cls3, AFa1ySDK aFa1zSDK2) {
                        cls = cls3;
                        aFa1ySDK = aFa1zSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            Object obj2 = objArr[0];
                            if (obj2 != null) {
                                Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                                if (bundle2 != null) {
                                    string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                    string3 = bundle2.getString("target_url");
                                    Bundle bundle3 = bundle2.getBundle("extras");
                                    if (bundle3 != null && (bundle = bundle3.getBundle("deeplink_context")) != null) {
                                        string = bundle.getString("promo_code");
                                    } else {
                                        string = null;
                                    }
                                } else {
                                    string = null;
                                    string2 = null;
                                    string3 = null;
                                }
                                AFa1ySDK aFa1ySDK = aFa1ySDK;
                                if (aFa1ySDK != null) {
                                    aFa1ySDK.AFInAppEventParameterName(string2, string3, string);
                                }
                            } else {
                                AFa1ySDK aFa1ySDK2 = aFa1ySDK;
                                if (aFa1ySDK2 != null) {
                                    aFa1ySDK2.AFInAppEventParameterName(null, null, null);
                                    return null;
                                }
                            }
                            return null;
                        }
                        AFa1ySDK aFa1ySDK3 = aFa1ySDK;
                        if (aFa1ySDK3 != null) {
                            aFa1ySDK3.AFInAppEventParameterName("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                });
                String string = context.getString(C786410Ut5.n3(context.getResources(), "facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1zSDK2.AFInAppEventParameterName("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
                aFa1zSDK2.AFInAppEventParameterName(e.toString());
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
                aFa1zSDK2.AFInAppEventParameterName(e2.toString());
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
                aFa1zSDK2.AFInAppEventParameterName(e3.toString());
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
                aFa1zSDK2.AFInAppEventParameterName(e4.toString());
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final boolean valueOf() {
        Map<String, Object> map;
        return values() && ((map = this.AFInAppEventParameterName) == null || map.isEmpty());
    }

    private boolean values() {
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final Map<String, Object> AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    public final class AFa1zSDK implements AFa1pSDK.AFa1ySDK {
        public /* synthetic */ long AFInAppEventParameterName;

        @Override // com.appsflyer.internal.AFa1pSDK.AFa1ySDK
        public final void AFInAppEventParameterName(String str) {
            Map<String, Object> map = AFd1zSDK.this.AFInAppEventParameterName;
            if (map != null) {
                map.put("error", str);
            }
        }

        public AFa1zSDK(long j) {
            this.AFInAppEventParameterName = j;
        }

        @Override // com.appsflyer.internal.AFa1pSDK.AFa1ySDK
        public final void AFInAppEventParameterName(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                Map<String, Object> map2 = AFd1zSDK.this.AFInAppEventParameterName;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFd1zSDK.this.AFInAppEventParameterName) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFd1zSDK aFd1zSDK = AFd1zSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFd1zSDK.AFInAppEventParameterName;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFd1zSDK.this.AFInAppEventParameterName;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.AFInAppEventParameterName);
            Map<String, Object> map5 = AFd1zSDK.this.AFInAppEventParameterName;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }
    }

    public AFd1zSDK(AFd1lSDK aFd1lSDK) {
        this.AFKeystoreWrapper = aFd1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void values(boolean z) {
        this.values = z;
    }
}
