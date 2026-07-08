package X;

import android.net.Uri;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800370VaV implements C0WOF {
    public static JSONObject LIZIZ;
    public static String LIZJ;
    public static ExecutorService LIZLLL;
    public static final ConcurrentHashMap<String, List<C0VZL>> LJ = new ConcurrentHashMap<>();
    public static volatile List<? extends C0VYZ> LJFF = C13BV.INSTANCE;
    public C800390VaX LIZ;

    @Override // X.C0WOF
    public final WebResourceResponse LIZIZ(View view, WebResourceRequest webResourceRequest) {
        return null;
    }

    public C800370VaV(C800390VaX c800390VaX) {
        this.LIZ = c800390VaX;
    }

    public static void LJ(List list, JSONObject jSONObject) throws JSONException {
        String str;
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (C0VZI c0vzi : C13LP.LJLJJLL(list)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("caller", c0vzi.LIZ);
                jSONObject2.put("callee", c0vzi.LIZIZ);
                jSONObject2.put("callerComponent", c0vzi.LIZJ);
                C805400Vic c805400Vic = c0vzi.LJ;
                if (c805400Vic != null) {
                    jSONObject2.put("url", c805400Vic.LIZIZ);
                    C805400Vic c805400Vic2 = c0vzi.LJ;
                    if (c805400Vic2 != null && (str = c805400Vic2.LJFF) != null && str.length() > 0) {
                        jSONObject2.put("path", c805400Vic.LJFF);
                    }
                    LJI(c805400Vic, jSONObject2);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("pageStack", jSONArray);
        }
    }

    public static void LJI(C805400Vic c805400Vic, JSONObject jSONObject) throws JSONException {
        Map<String, String> map;
        if (c805400Vic != null && (map = c805400Vic.LJI) != null && (!map.isEmpty())) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            jSONObject.put("query", jSONArray);
        }
    }

    public static void LJII(List list, JSONObject jSONObject) throws JSONException {
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (C0VZL c0vzl : C13LP.LJLJJLL(list)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("jumpTimes", c0vzl.LIZ);
                jSONObject2.put("url", c0vzl.LIZIZ.LIZIZ);
                jSONObject2.put("path", c0vzl.LIZIZ.LJFF);
                LJI(c0vzl.LIZIZ, jSONObject2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("preUrlInfo", jSONArray);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0088 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:7:0x000f, B:9:0x0015, B:11:0x0019, B:19:0x0027, B:21:0x002d, B:23:0x0039, B:24:0x003f, B:26:0x0054, B:33:0x0060, B:35:0x0066, B:38:0x0078, B:40:0x0088, B:43:0x008f, B:45:0x00a5, B:46:0x00b9, B:47:0x00bc, B:48:0x00bf, B:50:0x00ca, B:52:0x00ce, B:53:0x00d1, B:55:0x00dd, B:57:0x00e1, B:60:0x00e7, B:62:0x00eb, B:64:0x00f3, B:66:0x00fb, B:65:0x00f7, B:37:0x0071, B:27:0x0057, B:28:0x0059, B:30:0x005c, B:69:0x0105, B:70:0x0106, B:14:0x001e, B:16:0x0022, B:29:0x005a), top: B:82:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:7:0x000f, B:9:0x0015, B:11:0x0019, B:19:0x0027, B:21:0x002d, B:23:0x0039, B:24:0x003f, B:26:0x0054, B:33:0x0060, B:35:0x0066, B:38:0x0078, B:40:0x0088, B:43:0x008f, B:45:0x00a5, B:46:0x00b9, B:47:0x00bc, B:48:0x00bf, B:50:0x00ca, B:52:0x00ce, B:53:0x00d1, B:55:0x00dd, B:57:0x00e1, B:60:0x00e7, B:62:0x00eb, B:64:0x00f3, B:66:0x00fb, B:65:0x00f7, B:37:0x0071, B:27:0x0057, B:28:0x0059, B:30:0x005c, B:69:0x0105, B:70:0x0106, B:14:0x001e, B:16:0x0022, B:29:0x005a), top: B:82:0x000f, inners: #0 }] */
    @Override // X.C0WOF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C800370VaV.LIZ(android.view.View, java.lang.String):void");
    }

    @Override // X.C0WOF
    public final void LIZJ(Uri uri, View view) {
        if (view != null) {
            view.setTag(R.id.web_client_pre_jump_uri, uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.view.View r6, org.json.JSONObject r7) throws org.json.JSONException {
        /*
            r5 = this;
            boolean r4 = r6 instanceof android.webkit.WebView
            r3 = 0
            if (r4 == 0) goto La9
            if (r6 == 0) goto La6
            r0 = 2131400634(0x7f0a97ba, float:1.8422127E38)
            java.lang.Object r1 = r6.getTag(r0)
            boolean r0 = r1 instanceof X.C800470Vaf
            if (r0 == 0) goto La6
            X.0Vaf r1 = (X.C800470Vaf) r1
            if (r1 == 0) goto La6
            java.lang.String r2 = r1.LIZ
        L18:
            if (r4 == 0) goto L2d
            if (r6 == 0) goto L2d
            r0 = 2131400635(0x7f0a97bb, float:1.842213E38)
            java.lang.Object r1 = r6.getTag(r0)
            boolean r0 = r1 instanceof X.C800470Vaf
            if (r0 == 0) goto L2d
            X.0Vaf r1 = (X.C800470Vaf) r1
            if (r1 == 0) goto L2d
            java.lang.String r3 = r1.LIZ
        L2d:
            if (r2 != 0) goto L32
            if (r3 == 0) goto La9
            r2 = r3
        L32:
            java.lang.String r0 = "dataflowId"
            r7.put(r0, r2)
            boolean r0 = X.C800430Vab.LIZ(r6)
            r3 = 2131400645(0x7f0a97c5, float:1.842215E38)
            if (r0 == 0) goto L4f
            if (r4 == 0) goto L63
            if (r6 == 0) goto L4f
            X.0Vac r2 = new X.0Vac
            X.0Vad r1 = X.EnumC800450Vad.THIRD
            r0 = 2
            r2.<init>(r1, r0)
            r6.setTag(r3, r2)
        L4f:
            if (r4 == 0) goto L63
            if (r6 == 0) goto L63
            java.lang.Object r1 = r6.getTag(r3)
            boolean r0 = r1 instanceof X.C800440Vac
            if (r0 == 0) goto L63
            X.0Vac r1 = (X.C800440Vac) r1
            if (r1 == 0) goto L63
            X.0Vad r0 = r1.LIZ
            if (r0 != 0) goto L65
        L63:
            X.0Vad r0 = X.EnumC800450Vad.INTERIOR
        L65:
            java.lang.String r1 = "is_interior"
            java.lang.String r0 = r0.name()
            r7.put(r1, r0)
            if (r6 == 0) goto Laf
            boolean r0 = r6 instanceof android.webkit.WebView
            if (r0 == 0) goto Laf
            X.0VaX r0 = r5.LIZ
            if (r0 == 0) goto Laf
            X.0VaZ r0 = r0.LJ
            if (r0 == 0) goto Laf
            android.webkit.WebView r6 = (android.webkit.WebView) r6
            java.util.Map r0 = r0.LIZIZ(r6)
            if (r0 == 0) goto Laf
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L8c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r7.put(r1, r0)
            goto L8c
        La6:
            r2 = r3
            goto L18
        La9:
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L32
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C800370VaV.LIZLLL(android.view.View, org.json.JSONObject):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[LOOP:0: B:39:0x0081->B:41:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(android.view.View r5, org.json.JSONObject r6, java.lang.String r7, X.C0VZL r8, boolean r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C800370VaV.LJFF(android.view.View, org.json.JSONObject, java.lang.String, X.0VZL, boolean):void");
    }
}
