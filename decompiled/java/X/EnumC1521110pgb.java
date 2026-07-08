package X;

import com.bytedance.scene.Scene;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1521110pgb {
    public static final EnumC1521110pgb APP_RUNTIME;
    public static final EnumC1521110pgb CONTAINER_ID;
    public static final EnumC1521110pgb CONTAINER_IDS;
    public static final EnumC1521110pgb CONTAINER_INIT_END;
    public static final EnumC1521110pgb CONTAINER_INIT_START;
    public static final EnumC1521110pgb CONTAINER_LOAD_ERROR_CODE;
    public static final EnumC1521110pgb CONTAINER_LOAD_ERROR_MSG;
    public static final EnumC1521110pgb CONTAINER_NAME;
    public static final EnumC1521110pgb CONTAINER_TRACE_ID;
    public static final EnumC1521110pgb CONTAINER_TYPE;
    public static final EnumC1521110pgb CONTAINER_VERSION;
    public static final EnumC1521110pgb CONTEXT;
    public static final EnumC1521110pgb CONTEXT_APP_RUNTIME;
    public static final EnumC1521110pgb CONTEXT_IS_REINSTALL;
    public static final EnumC1521110pgb CONTEXT_PAGE_KEY;
    public static final EnumC1521110pgb CONTEXT_PAGE_KEY_HASH;
    public static final C1491790ovJ Companion;
    public static final EnumC1521110pgb ENGINE_TYPE;
    public static final EnumC1521110pgb FALLBACK_ERROR_CODE;
    public static final EnumC1521110pgb FALLBACK_ERROR_MSG;
    public static final EnumC1521110pgb FALLBACK_URL;
    public static final EnumC1521110pgb INVOKE_FALLBACK;
    public static final EnumC1521110pgb IS_FALLBACK;
    public static final EnumC1521110pgb IS_REINSTALL;
    public static final /* synthetic */ EnumC1521110pgb[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1521110pgb NATIVE_PAGE;
    public static final EnumC1521110pgb OPEN_TIME;
    public static final EnumC1521110pgb PAGE_BID_FROM_APP;
    public static final EnumC1521110pgb PAGE_BID_FROM_NATIVE;
    public static final EnumC1521110pgb PAGE_BID_FROM_URL;
    public static final EnumC1521110pgb PAGE_OID;
    public static final EnumC1521110pgb PAGE_PID_FROM_APP;
    public static final EnumC1521110pgb PAGE_PID_FROM_URL;
    public static final EnumC1521110pgb PAGE_SESSION_ID;
    public static final EnumC1521110pgb PAGE_URL;
    public static final EnumC1521110pgb PAGE_VERSION;
    public static final EnumC1521110pgb PREPARE_COMPONENT_END;
    public static final EnumC1521110pgb PREPARE_COMPONENT_START;
    public static final EnumC1521110pgb PREPARE_ENGINE_LOAD_END;
    public static final EnumC1521110pgb PREPARE_ENGINE_LOAD_START;
    public static final EnumC1521110pgb PREPARE_GLOBALPROPS_END;
    public static final EnumC1521110pgb PREPARE_GLOBALPROPS_START;
    public static final EnumC1521110pgb PREPARE_INIT_DATA_END;
    public static final EnumC1521110pgb PREPARE_INIT_DATA_START;
    public static final EnumC1521110pgb PREPARE_JSB_END;
    public static final EnumC1521110pgb PREPARE_JSB_START;
    public static final EnumC1521110pgb PREPARE_OUTSIDE_CONTAINER_END;
    public static final EnumC1521110pgb PREPARE_OUTSIDE_CONTAINER_START;
    public static final EnumC1521110pgb PREPARE_PREPARE_SPARK_PLUGIN_END;
    public static final EnumC1521110pgb PREPARE_PREPARE_SPARK_PLUGIN_START;
    public static final EnumC1521110pgb PREPARE_SPARK_PLUGIN_END;
    public static final EnumC1521110pgb PREPARE_SPARK_PLUGIN_START;
    public static final EnumC1521110pgb PREPARE_TEMPLATE_END;
    public static final EnumC1521110pgb PREPARE_TEMPLATE_START;
    public static final EnumC1521110pgb SCENE;
    public static final EnumC1521110pgb SCHEMA;
    public static final EnumC1521110pgb TEMPLATE_RES_TYPE;
    public static final EnumC1521110pgb TEMPLATE_STATE;
    public static final EnumC1521110pgb URL;
    public static final EnumC1521110pgb WEBVIEW_TYPE;
    public static final Map<String, Map<String, Object>> cachedEntries;
    public static final int capacity;
    public static final C01GW<HashSet<String>> keys$delegate;
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1521110pgb> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1521110pgb enumC1521110pgb = new EnumC1521110pgb("CONTAINER_NAME", 0, "spark_container_name", "container_name", 1);
        CONTAINER_NAME = enumC1521110pgb;
        EnumC1521110pgb enumC1521110pgb2 = new EnumC1521110pgb("CONTAINER_VERSION", 1, "spark_container_version", "container_version", 1);
        CONTAINER_VERSION = enumC1521110pgb2;
        EnumC1521110pgb enumC1521110pgb3 = new EnumC1521110pgb("SCHEMA", 2, "spark_schema", "schema", 1);
        SCHEMA = enumC1521110pgb3;
        EnumC1521110pgb enumC1521110pgb4 = new EnumC1521110pgb("TEMPLATE_RES_TYPE", 3, "spark_template_res_type", "template_res_type", 1);
        TEMPLATE_RES_TYPE = enumC1521110pgb4;
        int i = 4;
        EnumC1521110pgb enumC1521110pgb5 = new EnumC1521110pgb("CONTEXT", i, "spark_context", "context", i, 0);
        CONTEXT = enumC1521110pgb5;
        EnumC1521110pgb enumC1521110pgb6 = new EnumC1521110pgb("CONTEXT_APP_RUNTIME", 5, "spark_context_app_runtime", "app_runtime", 3);
        CONTEXT_APP_RUNTIME = enumC1521110pgb6;
        EnumC1521110pgb enumC1521110pgb7 = new EnumC1521110pgb("CONTEXT_IS_REINSTALL", 6, "spark_context_is_reinstall", "is_reinstall", 3);
        CONTEXT_IS_REINSTALL = enumC1521110pgb7;
        EnumC1521110pgb enumC1521110pgb8 = new EnumC1521110pgb("CONTEXT_PAGE_KEY", 7, "spark_page_identifier", "_page_key", 3);
        CONTEXT_PAGE_KEY = enumC1521110pgb8;
        EnumC1521110pgb enumC1521110pgb9 = new EnumC1521110pgb("CONTEXT_PAGE_KEY_HASH", 8, "spark_page_identifier_hash", "_page_key_hash", 3);
        CONTEXT_PAGE_KEY_HASH = enumC1521110pgb9;
        EnumC1521110pgb enumC1521110pgb10 = new EnumC1521110pgb("CONTAINER_ID", 9, "spark_container_id", "container_id", 1);
        CONTAINER_ID = enumC1521110pgb10;
        EnumC1521110pgb enumC1521110pgb11 = new EnumC1521110pgb("CONTAINER_TYPE", 10, "spark_container_type", "container_type", 1);
        CONTAINER_TYPE = enumC1521110pgb11;
        int i2 = 4;
        int i3 = 0;
        EnumC1521110pgb enumC1521110pgb12 = new EnumC1521110pgb("CONTAINER_TRACE_ID", 11, "spark_container_trace_id", "container_trace_id", i2, i3);
        CONTAINER_TRACE_ID = enumC1521110pgb12;
        EnumC1521110pgb enumC1521110pgb13 = new EnumC1521110pgb("CONTAINER_IDS", 12, "spark_container_ids", "container_ids", i2, i3);
        CONTAINER_IDS = enumC1521110pgb13;
        EnumC1521110pgb enumC1521110pgb14 = new EnumC1521110pgb("OPEN_TIME", 13, "spark_open_time", "open_time", 2);
        OPEN_TIME = enumC1521110pgb14;
        EnumC1521110pgb enumC1521110pgb15 = new EnumC1521110pgb("CONTAINER_INIT_END", 14, "spark_container_init_end", "container_init_end", 2);
        CONTAINER_INIT_END = enumC1521110pgb15;
        EnumC1521110pgb enumC1521110pgb16 = new EnumC1521110pgb("CONTAINER_INIT_START", 15, "spark_container_init_start", "container_init_start", 2);
        CONTAINER_INIT_START = enumC1521110pgb16;
        EnumC1521110pgb enumC1521110pgb17 = new EnumC1521110pgb("PREPARE_COMPONENT_END", 16, "spark_prepare_component_end", "prepare_component_end", 2);
        PREPARE_COMPONENT_END = enumC1521110pgb17;
        EnumC1521110pgb enumC1521110pgb18 = new EnumC1521110pgb("PREPARE_COMPONENT_START", 17, "spark_prepare_component_start", "prepare_component_start", 2);
        PREPARE_COMPONENT_START = enumC1521110pgb18;
        EnumC1521110pgb enumC1521110pgb19 = new EnumC1521110pgb("PREPARE_ENGINE_LOAD_END", 18, "spark_prepare_engine_load_end", "prepare_engine_load_end", 2);
        PREPARE_ENGINE_LOAD_END = enumC1521110pgb19;
        EnumC1521110pgb enumC1521110pgb20 = new EnumC1521110pgb("PREPARE_ENGINE_LOAD_START", 19, "spark_prepare_engine_load_start", "prepare_engine_load_start", 2);
        PREPARE_ENGINE_LOAD_START = enumC1521110pgb20;
        EnumC1521110pgb enumC1521110pgb21 = new EnumC1521110pgb("PREPARE_GLOBALPROPS_END", 20, "spark_prepare_globalprops_end", "prepare_globalprops_end", 2);
        PREPARE_GLOBALPROPS_END = enumC1521110pgb21;
        EnumC1521110pgb enumC1521110pgb22 = new EnumC1521110pgb("PREPARE_GLOBALPROPS_START", 21, "spark_prepare_globalprops_start", "prepare_globalprops_start", 2);
        PREPARE_GLOBALPROPS_START = enumC1521110pgb22;
        EnumC1521110pgb enumC1521110pgb23 = new EnumC1521110pgb("PREPARE_INIT_DATA_END", 22, "spark_prepare_init_data_end", "prepare_init_data_end", 2);
        PREPARE_INIT_DATA_END = enumC1521110pgb23;
        EnumC1521110pgb enumC1521110pgb24 = new EnumC1521110pgb("PREPARE_INIT_DATA_START", 23, "spark_prepare_init_data_start", "prepare_init_data_start", 2);
        PREPARE_INIT_DATA_START = enumC1521110pgb24;
        EnumC1521110pgb enumC1521110pgb25 = new EnumC1521110pgb("PREPARE_JSB_END", 24, "spark_prepare_jsb_end", "prepare_jsb_end", 2);
        PREPARE_JSB_END = enumC1521110pgb25;
        EnumC1521110pgb enumC1521110pgb26 = new EnumC1521110pgb("PREPARE_JSB_START", 25, "spark_prepare_jsb_start", "prepare_jsb_start", 2);
        PREPARE_JSB_START = enumC1521110pgb26;
        EnumC1521110pgb enumC1521110pgb27 = new EnumC1521110pgb("PREPARE_PREPARE_SPARK_PLUGIN_START", 26, "spark_prepare_spark_plugin_start", "prepare_spark_plugin_start", 2);
        PREPARE_PREPARE_SPARK_PLUGIN_START = enumC1521110pgb27;
        EnumC1521110pgb enumC1521110pgb28 = new EnumC1521110pgb("PREPARE_PREPARE_SPARK_PLUGIN_END", 27, "spark_prepare_spark_plugin_end", "prepare_spark_plugin_end", 2);
        PREPARE_PREPARE_SPARK_PLUGIN_END = enumC1521110pgb28;
        EnumC1521110pgb enumC1521110pgb29 = new EnumC1521110pgb("PREPARE_OUTSIDE_CONTAINER_END", 28, "spark_prepare_outside_container_end", "prepare_outside_container_end", 2);
        PREPARE_OUTSIDE_CONTAINER_END = enumC1521110pgb29;
        EnumC1521110pgb enumC1521110pgb30 = new EnumC1521110pgb("PREPARE_OUTSIDE_CONTAINER_START", 29, "spark_prepare_outside_container_start", "prepare_outside_container_start", 2);
        PREPARE_OUTSIDE_CONTAINER_START = enumC1521110pgb30;
        EnumC1521110pgb enumC1521110pgb31 = new EnumC1521110pgb("PREPARE_SPARK_PLUGIN_END", 30, "spark_prepare_spark_plugin_end", "prepare_spark_plugin_end", 2);
        PREPARE_SPARK_PLUGIN_END = enumC1521110pgb31;
        EnumC1521110pgb enumC1521110pgb32 = new EnumC1521110pgb("PREPARE_SPARK_PLUGIN_START", 31, "spark_prepare_spark_plugin_start", "prepare_spark_plugin_start", 2);
        PREPARE_SPARK_PLUGIN_START = enumC1521110pgb32;
        EnumC1521110pgb enumC1521110pgb33 = new EnumC1521110pgb("PREPARE_TEMPLATE_END", 32, "spark_prepare_template_end", "prepare_template_end", 2);
        PREPARE_TEMPLATE_END = enumC1521110pgb33;
        EnumC1521110pgb enumC1521110pgb34 = new EnumC1521110pgb("PREPARE_TEMPLATE_START", 33, "spark_prepare_template_start", "prepare_template_start", 2);
        PREPARE_TEMPLATE_START = enumC1521110pgb34;
        EnumC1521110pgb enumC1521110pgb35 = new EnumC1521110pgb("SCENE", 34, "spark_scene", Scene.SCENE_SERVICE, 2);
        SCENE = enumC1521110pgb35;
        EnumC1521110pgb enumC1521110pgb36 = new EnumC1521110pgb("IS_FALLBACK", 35, "spark_is_fallback", "is_fallback", 2);
        IS_FALLBACK = enumC1521110pgb36;
        EnumC1521110pgb enumC1521110pgb37 = new EnumC1521110pgb("INVOKE_FALLBACK", 36, "spark_invoke_fallback", "invoke_fallback", 2);
        INVOKE_FALLBACK = enumC1521110pgb37;
        EnumC1521110pgb enumC1521110pgb38 = new EnumC1521110pgb("FALLBACK_URL", 37, "spark_fallback_url", "fallback_url", 2);
        FALLBACK_URL = enumC1521110pgb38;
        EnumC1521110pgb enumC1521110pgb39 = new EnumC1521110pgb("FALLBACK_ERROR_CODE", 38, "spark_fallback_error_code", "fallback_error_code", 2);
        FALLBACK_ERROR_CODE = enumC1521110pgb39;
        EnumC1521110pgb enumC1521110pgb40 = new EnumC1521110pgb("FALLBACK_ERROR_MSG", 39, "spark_fallback_error_msg", "fallback_error_msg", 2);
        FALLBACK_ERROR_MSG = enumC1521110pgb40;
        EnumC1521110pgb enumC1521110pgb41 = new EnumC1521110pgb("CONTAINER_LOAD_ERROR_CODE", 40, "spark_container_load_error_code", "container_load_error_code", 2);
        CONTAINER_LOAD_ERROR_CODE = enumC1521110pgb41;
        EnumC1521110pgb enumC1521110pgb42 = new EnumC1521110pgb("CONTAINER_LOAD_ERROR_MSG", 41, "spark_container_load_error_msg", "container_load_error_msg", 2);
        CONTAINER_LOAD_ERROR_MSG = enumC1521110pgb42;
        EnumC1521110pgb enumC1521110pgb43 = new EnumC1521110pgb("URL", 42, "spark_url", "url", 2);
        URL = enumC1521110pgb43;
        EnumC1521110pgb enumC1521110pgb44 = new EnumC1521110pgb("NATIVE_PAGE", 43, "spark_native_page", "native_page", 2);
        NATIVE_PAGE = enumC1521110pgb44;
        EnumC1521110pgb enumC1521110pgb45 = new EnumC1521110pgb("ENGINE_TYPE", 44, "spark_engine_type", "engine_type", 2);
        ENGINE_TYPE = enumC1521110pgb45;
        EnumC1521110pgb enumC1521110pgb46 = new EnumC1521110pgb("PAGE_VERSION", 45, "spark_page_version", "page_version", 2);
        PAGE_VERSION = enumC1521110pgb46;
        EnumC1521110pgb enumC1521110pgb47 = new EnumC1521110pgb("TEMPLATE_STATE", 46, "spark_template_state", "template_state", 2);
        TEMPLATE_STATE = enumC1521110pgb47;
        EnumC1521110pgb enumC1521110pgb48 = new EnumC1521110pgb("IS_REINSTALL", 47, "spark_is_reinstall", "is_reinstall", 2);
        IS_REINSTALL = enumC1521110pgb48;
        EnumC1521110pgb enumC1521110pgb49 = new EnumC1521110pgb("APP_RUNTIME", 48, "spark_app_runtime", "app_runtime", 2);
        APP_RUNTIME = enumC1521110pgb49;
        EnumC1521110pgb enumC1521110pgb50 = new EnumC1521110pgb("WEBVIEW_TYPE", 49, "spark_web_type", "webview_type", 2);
        WEBVIEW_TYPE = enumC1521110pgb50;
        String str = null;
        int i4 = 6;
        int i5 = 0;
        EnumC1521110pgb enumC1521110pgb51 = new EnumC1521110pgb("PAGE_BID_FROM_APP", 50, "page_bid_from_app", str, i4, i5);
        PAGE_BID_FROM_APP = enumC1521110pgb51;
        String str2 = null;
        int i6 = 6;
        int i7 = 0;
        EnumC1521110pgb enumC1521110pgb52 = new EnumC1521110pgb("PAGE_BID_FROM_URL", 51, "page_bid_from_url", str, i4, i5);
        PAGE_BID_FROM_URL = enumC1521110pgb52;
        EnumC1521110pgb enumC1521110pgb53 = new EnumC1521110pgb("PAGE_BID_FROM_NATIVE", 52, "page_bid_from_native", str2, i6, i5);
        PAGE_BID_FROM_NATIVE = enumC1521110pgb53;
        EnumC1521110pgb enumC1521110pgb54 = new EnumC1521110pgb("PAGE_PID_FROM_URL", 53, "page_pid_from_url", str2, i6, i7);
        PAGE_PID_FROM_URL = enumC1521110pgb54;
        EnumC1521110pgb enumC1521110pgb55 = new EnumC1521110pgb("PAGE_PID_FROM_APP", 54, "page_pid_from_app", str2, i6, i7);
        PAGE_PID_FROM_APP = enumC1521110pgb55;
        EnumC1521110pgb enumC1521110pgb56 = new EnumC1521110pgb("PAGE_URL", 55, "page_url", str2, i6, i7);
        PAGE_URL = enumC1521110pgb56;
        EnumC1521110pgb enumC1521110pgb57 = new EnumC1521110pgb("PAGE_OID", 56, "page_oid", str2, i6, i7);
        PAGE_OID = enumC1521110pgb57;
        EnumC1521110pgb enumC1521110pgb58 = new EnumC1521110pgb("PAGE_SESSION_ID", 57, "page_session_id", str2, i6, 0);
        PAGE_SESSION_ID = enumC1521110pgb58;
        EnumC1521110pgb[] enumC1521110pgbArr = {enumC1521110pgb, enumC1521110pgb2, enumC1521110pgb3, enumC1521110pgb4, enumC1521110pgb5, enumC1521110pgb6, enumC1521110pgb7, enumC1521110pgb8, enumC1521110pgb9, enumC1521110pgb10, enumC1521110pgb11, enumC1521110pgb12, enumC1521110pgb13, enumC1521110pgb14, enumC1521110pgb15, enumC1521110pgb16, enumC1521110pgb17, enumC1521110pgb18, enumC1521110pgb19, enumC1521110pgb20, enumC1521110pgb21, enumC1521110pgb22, enumC1521110pgb23, enumC1521110pgb24, enumC1521110pgb25, enumC1521110pgb26, enumC1521110pgb27, enumC1521110pgb28, enumC1521110pgb29, enumC1521110pgb30, enumC1521110pgb31, enumC1521110pgb32, enumC1521110pgb33, enumC1521110pgb34, enumC1521110pgb35, enumC1521110pgb36, enumC1521110pgb37, enumC1521110pgb38, enumC1521110pgb39, enumC1521110pgb40, enumC1521110pgb41, enumC1521110pgb42, enumC1521110pgb43, enumC1521110pgb44, enumC1521110pgb45, enumC1521110pgb46, enumC1521110pgb47, enumC1521110pgb48, enumC1521110pgb49, enumC1521110pgb50, enumC1521110pgb51, enumC1521110pgb52, enumC1521110pgb53, enumC1521110pgb54, enumC1521110pgb55, enumC1521110pgb56, enumC1521110pgb57, enumC1521110pgb58};
        LLILZ = enumC1521110pgbArr;
        LLILZIL = new C2254308sP(enumC1521110pgbArr);
        Companion = new C1491790ovJ();
        capacity = 64;
        cachedEntries = Collections.synchronizedMap(new LinkedHashMap<String, Map<String, Object>>() { // from class: X.083v
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, Map<String, Object>>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, Map<String, Object>>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Map<String, Object>> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<Map<String, Object>> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!C19719512Dh.LJII(obj)) {
                    return false;
                }
                return containsValue((Map<String, Object>) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Map<String, Object>> entry) {
                if (size() > EnumC1521110pgb.capacity) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str3) {
                return super.containsKey((Object) str3);
            }

            public /* bridge */ boolean containsValue(Map<String, Object> map) {
                return super.containsValue((Object) map);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Map<String, Object> get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Map<String, Object> remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ Map<String, Object> get(String str3) {
                return (Map) super.get((Object) str3);
            }

            public /* bridge */ Map<String, Object> remove(String str3) {
                return (Map) super.remove((Object) str3);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (Map<String, Object>) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !C19719512Dh.LJII(obj2)) {
                    return false;
                }
                return remove((String) obj, (Map<String, Object>) obj2);
            }

            public final /* bridge */ Map<String, Object> getOrDefault(Object obj, Map<String, Object> map) {
                if (!(obj instanceof String)) {
                    return map;
                }
                return getOrDefault((String) obj, map);
            }

            public /* bridge */ boolean remove(String str3, Map<String, Object> map) {
                return super.remove((Object) str3, (Object) map);
            }

            public /* bridge */ Map<String, Object> getOrDefault(String str3, Map<String, Object> map) {
                return (Map) super.getOrDefault((Object) str3, map);
            }
        });
        keys$delegate = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(151));
    }

    public static EnumC1521110pgb[] values() {
        return (EnumC1521110pgb[]) LLILZ.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getSlardarKey() {
        return this.LLILLJJLI;
    }

    public final int getType() {
        return this.LLILLL;
    }

    public static EnumC1521110pgb valueOf(String str) {
        return (EnumC1521110pgb) C08FF.LIZ(EnumC1521110pgb.class, str);
    }

    public EnumC1521110pgb(String str, int i, String str2, String str3, int i2) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = i2;
    }

    public /* synthetic */ EnumC1521110pgb(String str, int i, String str2, String str3, int i2, int i3) {
        this(str, i, str2, (i2 & 2) != 0 ? "" : str3, 0);
    }
}
