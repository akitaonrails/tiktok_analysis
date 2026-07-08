package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pW0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514540pW0 {
    public static final JSONObject LIZ = new JSONObject("{\n  \"blank_attributes\": {\n    \"extend\": \"default\",\n    \"issues_rules\": {\n      \"blank\": {\n        \"default_level\": 0\n      }\n    }\n  },\n  \"fatal_blank\": {\n    \"default_level\": 0,\n    \"issues_rules\": {\n      \"nativeError\": {\n        \"default_level\": 0,\n        \"rules\": [\n          {\n            \"engine\": \"lynx\",\n            \"level\": 7,\n            \"rule\": {\n              \"arg\": [\n                100,\n                102,\n                103,\n                104,\n                105,\n                106,\n                107\n              ],\n              \"field\": \"error_code\",\n              \"op\": \"in\"\n            }\n          },\n          {\n            \"engine\": \"web\",\n            \"level\": 7,\n            \"rule\": {\n              \"arg\": [\n                \"main_frame\",\n                \"web_process_terminate\"\n              ],\n              \"field\": \"scene\",\n              \"op\": \"in\"\n            }\n          }\n        ]\n      },\n      \"containerError\": {\n        \"default_level\": 0,\n        \"rules\": [\n          {\n            \"engine\": \"all\",\n            \"level\": 7,\n            \"rule\": {\n              \"arg\": [\n                100,\n                101,\n                102,\n                103\n              ],\n              \"field\": \"container_load_error_code\",\n              \"op\": \"in\"\n            }\n          },\n          {\n            \"engine\": \"lynx\",\n            \"level\": 7,\n            \"rule\": {\n              \"arg\": [\n                201,\n                202,\n                203,\n                204,\n                205,\n                210\n              ],\n              \"field\": \"container_load_error_code\",\n              \"op\": \"in\"\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"default\": {\n    \"default_level\": 3,\n    \"issues_rules\": {\n      \"blank\": {\n        \"default_level\": 0,\n        \"rules\": [\n          {\n            \"engine\": \"web\",\n            \"level\": 7,\n            \"rule\": {\n              \"arg\": 1,\n              \"field\": \"is_blank\",\n              \"op\": \"in\"\n            }\n          },\n          {\n            \"engine\": \"lynx\",\n            \"level\": 7,\n            \"rule\": {\n              \"arg\": 0,\n              \"field\": \"effective_percentage\",\n              \"op\": \"in\"\n            }\n          }\n        ]\n      },\n      \"containerError\": {\n        \"default_level\": 7\n      },\n      \"js_exception\": {\n        \"default_level\": 3,\n        \"rules\": [\n          {\n            \"engine\": \"web\",\n            \"level\": 7,\n            \"rule\": {\n              \"arg\": [\n                \"SyntaxError\",\n                \"ReferenceError\",\n                \"RangeError\"\n              ],\n              \"field\": \"name\",\n              \"op\": \"in\"\n            }\n          }\n        ]\n      },\n      \"nativeError\": {\n        \"default_level\": 3,\n        \"rules\": [\n          {\n            \"engine\": \"lynx\",\n            \"level\": 7,\n            \"rule\": {\n              \"arg\": [\n                100,\n                102,\n                103,\n                104,\n                105,\n                106\n              ],\n              \"field\": \"error_code\",\n              \"op\": \"in\"\n            }\n          },\n          {\n            \"engine\": \"lynx\",\n            \"level\": 1,\n            \"rule\": {\n              \"arg\": 200,\n              \"combine_rule\": {\n                \"arg\": 400,\n                \"field\": \"error_code\",\n                \"op\": \"<\"\n              },\n              \"field\": \"error_code\",\n              \"op\": \">=\"\n            }\n          },\n          {\n            \"engine\": \"web\",\n            \"level\": 7,\n            \"rule\": {\n              \"arg\": [\n                \"main_frame\",\n                \"web_process_terminate\"\n              ],\n              \"field\": \"scene\",\n              \"op\": \"in\"\n            }\n          }\n        ]\n      },\n      \"res_loader_error_template\": {\n        \"default_level\": 7\n      }\n    }\n  }\n}");
    public static final Map<String, C1514520pVy> LIZIZ = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer LIZ(java.lang.String r6, org.json.JSONObject r7, X.EnumC1514560pW2 r8, java.lang.String r9) {
        /*
            if (r9 != 0) goto L4
            java.lang.String r9 = "default"
        L4:
            java.util.Map<java.lang.String, X.0pVy> r0 = X.C1514540pW0.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r4 = r0.get(r9)
            X.0pVy r4 = (X.C1514520pVy) r4
            if (r4 == 0) goto L68
            java.util.Map<java.lang.String, X.0pVz> r0 = r4.LIZJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r5 = r0.get(r6)
            X.0pVz r5 = (X.C1514530pVz) r5
            if (r5 == 0) goto L65
            java.util.List<X.0pW1> r0 = r5.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r3.next()
            X.0pW1 r2 = (X.C1514550pW1) r2
            if (r2 == 0) goto L24
            X.0pW2 r1 = r2.LIZIZ
            if (r1 == r8) goto L3c
            X.0pW2 r0 = X.EnumC1514560pW2.All
            if (r8 == r0) goto L3c
            if (r1 != r0) goto L24
        L3c:
            X.0pis r0 = r2.LIZJ
            if (r0 == 0) goto L24
            boolean r1 = r0.LIZ(r7)
            r0 = 1
            if (r1 != r0) goto L24
            java.lang.Integer r0 = r2.LIZ
        L49:
            if (r0 == 0) goto L65
            int r0 = r0.intValue()
        L4f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L69
            if (r4 == 0) goto L69
            java.lang.String r0 = r4.LIZ
            java.lang.Integer r0 = LIZ(r6, r7, r8, r0)
            return r0
        L5e:
            int r0 = r5.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L49
        L65:
            int r0 = r4.LIZIZ
            goto L4f
        L68:
            r0 = 0
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1514540pW0.LIZ(java.lang.String, org.json.JSONObject, X.0pW2, java.lang.String):java.lang.Integer");
    }
}
