package X;

import android.net.Uri;
import android.util.LruCache;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.GeckoSource;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateBundle;
import com.tiktok.forestx.RequestParamsX;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0q5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536840q5y {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final SparkContext sparkContext, final AbstractC1536860q60 abstractC1536860q60, Forest forest, int i) {
        Forest forest2 = forest;
        if ((i & 4) != 0) {
            forest2 = null;
        }
        LIZIZ(sparkContext, new AbstractC1536860q60() { // from class: X.0q5z
            @Override // X.AbstractC1536860q60
            public final void LIZJ(String str) {
                AbstractC1536860q60 abstractC1536860q602 = abstractC1536860q60;
                if (abstractC1536860q602 != null) {
                    abstractC1536860q602.LIZ(str);
                }
            }

            @Override // X.AbstractC1536860q60
            public final void LIZLLL(TemplateBundle templateBundle) {
                Uri uri;
                AbstractC1536860q60 abstractC1536860q602 = abstractC1536860q60;
                if (abstractC1536860q602 != null) {
                    abstractC1536860q602.LIZLLL(templateBundle);
                }
                HybridSchemaParam hybridSchemaParamLIZ = C1545460qJs.LIZ(sparkContext.LJIJI());
                String url = hybridSchemaParamLIZ.getUrl();
                if (url != null && url.length() != 0) {
                    uri = UriProtector.parse(hybridSchemaParamLIZ.getUrl());
                } else {
                    uri = UriProtector.parse(hybridSchemaParamLIZ.getSurl());
                }
                if (templateBundle != null) {
                    C1537480q70 c1537480q70 = sparkContext;
                    AbstractC1536860q60 abstractC1536860q603 = abstractC1536860q60;
                    try {
                        C1532310pyf c1532310pyf = (C1532310pyf) c1537480q70.LJFF(C1532310pyf.class);
                        if (C1535630q41.LJIL) {
                            if (c1532310pyf != null) {
                                C1535980q4a c1535980q4a = C1535980q4a.LIZ;
                                C1532710pzJ c1532710pzJ = c1532310pyf.LIZ;
                                InterfaceC1532190pyT interfaceC1532190pyT = c1532310pyf.LJII;
                                c1535980q4a.getClass();
                                C1535980q4a.LIZLLL("LynxTemplateTool", c1532710pzJ, interfaceC1532190pyT, templateBundle);
                            }
                        } else {
                            C1537890q7f c1537890q7f = C1537890q7f.LIZ;
                            String string = uri.toString();
                            c1537890q7f.getClass();
                            templateBundle.LJI(C1537890q7f.LIZIZ(c1537480q70, string), null);
                        }
                        if (abstractC1536860q603 != null) {
                            abstractC1536860q603.LIZIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (abstractC1536860q603 != null) {
                            abstractC1536860q603.LIZ(String.valueOf(th.getMessage()));
                        }
                    }
                }
            }

            @Override // X.AbstractC1536860q60
            public final void LJ(String str) {
                AbstractC1536860q60 abstractC1536860q602 = abstractC1536860q60;
                if (abstractC1536860q602 != null) {
                    abstractC1536860q602.LJ(str);
                }
            }

            @Override // X.AbstractC1536860q60
            public final void LJI(byte[] bArr, C1533790q13 c1533790q13, C1532310pyf c1532310pyf) {
                AbstractC1536860q60 abstractC1536860q602 = abstractC1536860q60;
                if (abstractC1536860q602 != null) {
                    abstractC1536860q602.LJI(bArr, c1533790q13, c1532310pyf);
                }
            }
        }, forest2, false, null, 48);
    }

    public static /* synthetic */ void LIZLLL(C1537480q70 c1537480q70, AbstractC1536860q60 abstractC1536860q60, Forest forest, boolean z, int i) {
        boolean z2 = z;
        Forest forest2 = forest;
        if ((i & 4) != 0) {
            forest2 = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        LIZJ(c1537480q70, abstractC1536860q60, forest2, z2, false, false);
    }

    public static void LIZIZ(final C1537480q70 c1537480q70, final AbstractC1536860q60 abstractC1536860q60, Forest forest, boolean z, final Boolean bool, int i) {
        boolean z2 = z;
        Forest forest2 = forest;
        if ((i & 4) != 0) {
            forest2 = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            bool = Boolean.TRUE;
        }
        LruCache<String, C1536930q67> lruCache = C1536910q65.LIZ;
        String strLIZ = C01CL.LIZ(c1537480q70.LJIJI());
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C1536910q65.LIZLLL;
        if (!copyOnWriteArrayList.contains(strLIZ)) {
            copyOnWriteArrayList.add(strLIZ);
        }
        C1536930q67 c1536930q67LIZ = C1536910q65.LIZ(c1537480q70.LJIJI());
        if (c1536930q67LIZ != null) {
            c1537480q70.LJJ(TemplateBundle.class, c1536930q67LIZ.LIZ);
            C1533790q13 c1533790q13 = c1536930q67LIZ.LIZIZ;
            if (c1533790q13 != null) {
                c1537480q70.LJJ(C1533790q13.class, c1533790q13);
            }
            C1532310pyf c1532310pyf = c1536930q67LIZ.LIZJ;
            if (c1532310pyf != null) {
                c1537480q70.LJJ(C1532310pyf.class, c1532310pyf);
            }
            if (abstractC1536860q60 != null) {
                abstractC1536860q60.LIZLLL(c1536930q67LIZ.LIZ);
                return;
            }
            return;
        }
        LIZJ(c1537480q70, new AbstractC1536860q60() { // from class: X.0q61
            @Override // X.AbstractC1536860q60
            public final void LJ(String str) {
                AbstractC1536860q60 abstractC1536860q602 = abstractC1536860q60;
                if (abstractC1536860q602 != null) {
                    abstractC1536860q602.LJ(str);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[Catch: all -> 0x01d5, PHI: r6
              0x0045: PHI (r6v20 java.lang.String) = (r6v14 java.lang.String), (r6v21 java.lang.String) binds: [B:23:0x0043, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01d5, blocks: (B:5:0x000f, B:8:0x0022, B:10:0x0029, B:12:0x002d, B:14:0x0031, B:24:0x0045, B:26:0x0049, B:28:0x004d, B:38:0x0061, B:40:0x0065, B:48:0x0075, B:43:0x006b, B:45:0x006f, B:47:0x0073, B:31:0x0053, B:33:0x0057, B:35:0x005b, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:50:0x0085, B:52:0x0091, B:55:0x009b, B:57:0x009f, B:59:0x00a3, B:69:0x00b7, B:71:0x00bb, B:73:0x00bf, B:83:0x00d3, B:85:0x00d7, B:95:0x00ea, B:90:0x00e0, B:92:0x00e4, B:94:0x00e8, B:76:0x00c5, B:78:0x00c9, B:80:0x00cd, B:62:0x00a9, B:64:0x00ad, B:66:0x00b1, B:98:0x00fb, B:100:0x010b, B:102:0x010f, B:104:0x0121, B:106:0x012b, B:107:0x012f, B:112:0x013e, B:115:0x0147, B:116:0x015b, B:118:0x0181, B:120:0x018a, B:121:0x0191, B:123:0x0199, B:125:0x019d, B:127:0x01a1, B:128:0x01a8, B:130:0x01ac, B:131:0x01af, B:133:0x01bf, B:135:0x01c5, B:136:0x01c9), top: B:143:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[PHI: r6
              0x0051: PHI (r6v16 java.lang.String) = (r6v14 java.lang.String), (r6v20 java.lang.String), (r6v20 java.lang.String), (r6v20 java.lang.String) binds: [B:23:0x0043, B:25:0x0047, B:27:0x004b, B:29:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0061 A[Catch: all -> 0x01d5, PHI: r2 r6
              0x0061: PHI (r2v27 java.lang.String) = (r2v23 java.lang.String), (r2v28 java.lang.String) binds: [B:37:0x005f, B:29:0x004f] A[DONT_GENERATE, DONT_INLINE]
              0x0061: PHI (r6v19 java.lang.String) = (r6v16 java.lang.String), (r6v20 java.lang.String) binds: [B:37:0x005f, B:29:0x004f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01d5, blocks: (B:5:0x000f, B:8:0x0022, B:10:0x0029, B:12:0x002d, B:14:0x0031, B:24:0x0045, B:26:0x0049, B:28:0x004d, B:38:0x0061, B:40:0x0065, B:48:0x0075, B:43:0x006b, B:45:0x006f, B:47:0x0073, B:31:0x0053, B:33:0x0057, B:35:0x005b, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:50:0x0085, B:52:0x0091, B:55:0x009b, B:57:0x009f, B:59:0x00a3, B:69:0x00b7, B:71:0x00bb, B:73:0x00bf, B:83:0x00d3, B:85:0x00d7, B:95:0x00ea, B:90:0x00e0, B:92:0x00e4, B:94:0x00e8, B:76:0x00c5, B:78:0x00c9, B:80:0x00cd, B:62:0x00a9, B:64:0x00ad, B:66:0x00b1, B:98:0x00fb, B:100:0x010b, B:102:0x010f, B:104:0x0121, B:106:0x012b, B:107:0x012f, B:112:0x013e, B:115:0x0147, B:116:0x015b, B:118:0x0181, B:120:0x018a, B:121:0x0191, B:123:0x0199, B:125:0x019d, B:127:0x01a1, B:128:0x01a8, B:130:0x01ac, B:131:0x01af, B:133:0x01bf, B:135:0x01c5, B:136:0x01c9), top: B:143:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0069 A[PHI: r2 r6
              0x0069: PHI (r2v25 java.lang.String) = (r2v23 java.lang.String), (r2v27 java.lang.String), (r2v27 java.lang.String) binds: [B:37:0x005f, B:39:0x0063, B:41:0x0067] A[DONT_GENERATE, DONT_INLINE]
              0x0069: PHI (r6v17 java.lang.String) = (r6v16 java.lang.String), (r6v19 java.lang.String), (r6v19 java.lang.String) binds: [B:37:0x005f, B:39:0x0063, B:41:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0085 A[Catch: all -> 0x01d5, TryCatch #0 {all -> 0x01d5, blocks: (B:5:0x000f, B:8:0x0022, B:10:0x0029, B:12:0x002d, B:14:0x0031, B:24:0x0045, B:26:0x0049, B:28:0x004d, B:38:0x0061, B:40:0x0065, B:48:0x0075, B:43:0x006b, B:45:0x006f, B:47:0x0073, B:31:0x0053, B:33:0x0057, B:35:0x005b, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:50:0x0085, B:52:0x0091, B:55:0x009b, B:57:0x009f, B:59:0x00a3, B:69:0x00b7, B:71:0x00bb, B:73:0x00bf, B:83:0x00d3, B:85:0x00d7, B:95:0x00ea, B:90:0x00e0, B:92:0x00e4, B:94:0x00e8, B:76:0x00c5, B:78:0x00c9, B:80:0x00cd, B:62:0x00a9, B:64:0x00ad, B:66:0x00b1, B:98:0x00fb, B:100:0x010b, B:102:0x010f, B:104:0x0121, B:106:0x012b, B:107:0x012f, B:112:0x013e, B:115:0x0147, B:116:0x015b, B:118:0x0181, B:120:0x018a, B:121:0x0191, B:123:0x0199, B:125:0x019d, B:127:0x01a1, B:128:0x01a8, B:130:0x01ac, B:131:0x01af, B:133:0x01bf, B:135:0x01c5, B:136:0x01c9), top: B:143:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x00b7 A[Catch: all -> 0x01d5, PHI: r6
              0x00b7: PHI (r6v11 java.lang.String) = (r6v5 java.lang.String), (r6v12 java.lang.String) binds: [B:68:0x00b5, B:60:0x00a5] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01d5, blocks: (B:5:0x000f, B:8:0x0022, B:10:0x0029, B:12:0x002d, B:14:0x0031, B:24:0x0045, B:26:0x0049, B:28:0x004d, B:38:0x0061, B:40:0x0065, B:48:0x0075, B:43:0x006b, B:45:0x006f, B:47:0x0073, B:31:0x0053, B:33:0x0057, B:35:0x005b, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:50:0x0085, B:52:0x0091, B:55:0x009b, B:57:0x009f, B:59:0x00a3, B:69:0x00b7, B:71:0x00bb, B:73:0x00bf, B:83:0x00d3, B:85:0x00d7, B:95:0x00ea, B:90:0x00e0, B:92:0x00e4, B:94:0x00e8, B:76:0x00c5, B:78:0x00c9, B:80:0x00cd, B:62:0x00a9, B:64:0x00ad, B:66:0x00b1, B:98:0x00fb, B:100:0x010b, B:102:0x010f, B:104:0x0121, B:106:0x012b, B:107:0x012f, B:112:0x013e, B:115:0x0147, B:116:0x015b, B:118:0x0181, B:120:0x018a, B:121:0x0191, B:123:0x0199, B:125:0x019d, B:127:0x01a1, B:128:0x01a8, B:130:0x01ac, B:131:0x01af, B:133:0x01bf, B:135:0x01c5, B:136:0x01c9), top: B:143:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:75:0x00c3 A[PHI: r6
              0x00c3: PHI (r6v7 java.lang.String) = (r6v5 java.lang.String), (r6v11 java.lang.String), (r6v11 java.lang.String), (r6v11 java.lang.String) binds: [B:68:0x00b5, B:70:0x00b9, B:72:0x00bd, B:74:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:83:0x00d3 A[Catch: all -> 0x01d5, PHI: r2 r6
              0x00d3: PHI (r2v20 java.lang.String) = (r2v16 java.lang.String), (r2v21 java.lang.String) binds: [B:82:0x00d1, B:74:0x00c1] A[DONT_GENERATE, DONT_INLINE]
              0x00d3: PHI (r6v10 java.lang.String) = (r6v7 java.lang.String), (r6v11 java.lang.String) binds: [B:82:0x00d1, B:74:0x00c1] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01d5, blocks: (B:5:0x000f, B:8:0x0022, B:10:0x0029, B:12:0x002d, B:14:0x0031, B:24:0x0045, B:26:0x0049, B:28:0x004d, B:38:0x0061, B:40:0x0065, B:48:0x0075, B:43:0x006b, B:45:0x006f, B:47:0x0073, B:31:0x0053, B:33:0x0057, B:35:0x005b, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:50:0x0085, B:52:0x0091, B:55:0x009b, B:57:0x009f, B:59:0x00a3, B:69:0x00b7, B:71:0x00bb, B:73:0x00bf, B:83:0x00d3, B:85:0x00d7, B:95:0x00ea, B:90:0x00e0, B:92:0x00e4, B:94:0x00e8, B:76:0x00c5, B:78:0x00c9, B:80:0x00cd, B:62:0x00a9, B:64:0x00ad, B:66:0x00b1, B:98:0x00fb, B:100:0x010b, B:102:0x010f, B:104:0x0121, B:106:0x012b, B:107:0x012f, B:112:0x013e, B:115:0x0147, B:116:0x015b, B:118:0x0181, B:120:0x018a, B:121:0x0191, B:123:0x0199, B:125:0x019d, B:127:0x01a1, B:128:0x01a8, B:130:0x01ac, B:131:0x01af, B:133:0x01bf, B:135:0x01c5, B:136:0x01c9), top: B:143:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:87:0x00db A[PHI: r2 r6
              0x00db: PHI (r2v18 java.lang.String) = (r2v16 java.lang.String), (r2v20 java.lang.String), (r2v20 java.lang.String) binds: [B:82:0x00d1, B:84:0x00d5, B:86:0x00d9] A[DONT_GENERATE, DONT_INLINE]
              0x00db: PHI (r6v8 java.lang.String) = (r6v7 java.lang.String), (r6v10 java.lang.String), (r6v10 java.lang.String) binds: [B:82:0x00d1, B:84:0x00d5, B:86:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC1536860q60
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJI(byte[] r21, X.C1533790q13 r22, X.C1532310pyf r23) {
                /*
                    Method dump skipped, instruction units count: 489
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1536870q61.LJI(byte[], X.0q13, X.0pyf):void");
            }
        }, forest2, z2, true, false);
    }

    public static void LIZJ(final C1537480q70 c1537480q70, final AbstractC1536860q60 abstractC1536860q60, final Forest forest, boolean z, final boolean z2, final boolean z3) {
        C1529870puj.LIZ.getClass();
        C1529870puj.LIZ(c1537480q70);
        Runnable runnable = new Runnable() { // from class: X.0q5i
            public final void LIZ() {
                C1536660q5g.LIZ.LIZ();
                Uri uri = UriProtector.parse(c1537480q70.LJIJI());
                Uri.Builder builderBuildUpon = uri.buildUpon();
                if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enable_memory_cache"), "1")) {
                    builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
                }
                String string = builderBuildUpon.build().toString();
                c1537480q70.LJJIIZ(string);
                HybridSchemaParam hybridSchemaParamLIZ = C1545460qJs.LIZ(string);
                c1537480q70.resourcePreloadTriggered = true;
                try {
                    C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, forest, 1);
                    if (c1533020pzoLJIILJJIL != null) {
                        C1537480q70 c1537480q702 = c1537480q70;
                        boolean z4 = z2;
                        boolean z5 = z3;
                        AbstractC1536860q60 abstractC1536860q602 = abstractC1536860q60;
                        RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_TEMPLATE, byte[].class);
                        if (C1535630q41.LJIJ) {
                            requestParamsX.allowRedirectInternally = false;
                        }
                        requestParamsX.source = "LynxTemplateTool";
                        requestParamsX.enableMemoryCache = true;
                        requestParamsX.groupId = c1537480q702.containerId;
                        if (z4 && C1535630q41.LJIJI) {
                            requestParamsX.consumeType = TemplateBundle.class;
                        }
                        if (z5) {
                            requestParamsX.onlyLocal = true;
                        }
                        C1533760q10 c1533760q10 = c1537480q702.mainDocumentGeckoInfo;
                        if (c1533760q10 != null) {
                            requestParamsX.accessKey = c1533760q10.LIZ;
                            requestParamsX.channel = c1533760q10.LIZIZ;
                            requestParamsX.bundle = c1533760q10.LIZJ;
                            requestParamsX.setGeckoSource(EnumC1507260pKG.SPARK_MANIFEST);
                        }
                        JSONArray jSONArray = C1533710q0v.LIZ;
                        C1533710q0v.LJIIIZ(requestParamsX, hybridSchemaParamLIZ);
                        String strLIZJ = C1533710q0v.LIZJ(hybridSchemaParamLIZ, string, true);
                        C1533510q0b c1533510q0bLJ = C1533720q0w.LJ(C1533720q0w.LIZ, string, null);
                        if (c1533510q0bLJ != null) {
                            requestParamsX.channel = c1533510q0bLJ.LIZIZ;
                            requestParamsX.bundle = c1533510q0bLJ.LIZJ;
                            requestParamsX.accessKey = c1533510q0bLJ.LIZ;
                            requestParamsX.setGeckoSource(EnumC1507260pKG.SPARK_MANIFEST);
                        }
                        c1533020pzoLJIILJJIL.LIZ(strLIZJ, requestParamsX, new C1536730q5n(abstractC1536860q602, c1537480q702));
                        return;
                    }
                    JSONArray jSONArray2 = C1533710q0v.LIZ;
                    IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1537480q70, false);
                    if (iResourceServiceXLIZIZ != null) {
                        Forest forest2 = forest;
                        if ((iResourceServiceXLIZIZ instanceof C1533850q19) && forest2 != null && ((C1533850q19) iResourceServiceXLIZIZ).LIZ != forest2) {
                            iResourceServiceXLIZIZ = new C1533850q19(forest2);
                        } else if ((iResourceServiceXLIZIZ instanceof C1533840q18) && forest2 != null) {
                            ((C1533840q18) iResourceServiceXLIZIZ).LIZ.LIZ = forest2;
                        }
                    } else {
                        Forest forest3 = forest;
                        if (forest3 == null) {
                            AbstractC1536860q60 abstractC1536860q603 = abstractC1536860q60;
                            if (abstractC1536860q603 != null) {
                                abstractC1536860q603.LJ("ResourceLoader Not Found!");
                                return;
                            }
                            return;
                        }
                        iResourceServiceXLIZIZ = new C1533850q19(forest3);
                    }
                    RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_TEMPLATE);
                    boolean z6 = z2;
                    C1537480q70 c1537480q703 = c1537480q70;
                    requestParams.loadToMemory = true;
                    requestParams.enableMemoryCache = Boolean.valueOf(!z6);
                    requestParams.needLocalFile = Boolean.FALSE;
                    if (C1535630q41.LJIJ) {
                        requestParams.allowRedirectInternally = false;
                    }
                    if (z6 && C1535630q41.LJIJI && (iResourceServiceXLIZIZ instanceof C1533840q18)) {
                        requestParams.consumeType = TemplateBundle.class;
                        requestParams.dataSupplier = C1535630q41.LJJIFFI;
                        requestParams.lightSupplier = C1535630q41.LJJII;
                    }
                    requestParams.source = "Lynx_Template_Preload";
                    requestParams.customParams.put("rl_container_uuid", c1537480q703.containerId);
                    requestParams.customParams.put("hybrid_channel", "Lynx_Template_Preload");
                    requestParams.allowIOOnMainThread = true;
                    C1533710q0v.LJIIIIZZ(requestParams, hybridSchemaParamLIZ);
                    String strLIZJ2 = C1533710q0v.LIZJ(hybridSchemaParamLIZ, string, true);
                    C1533510q0b c1533510q0bLJ2 = C1533720q0w.LJ(C1533720q0w.LIZ, string, null);
                    if (c1533510q0bLJ2 != null) {
                        requestParams.channel = c1533510q0bLJ2.LIZIZ;
                        requestParams.bundle = c1533510q0bLJ2.LIZJ;
                        requestParams.accessKey = c1533510q0bLJ2.LIZ;
                        requestParams.geckoSource = GeckoSource.SPARK_MANIFEST;
                    }
                    if (!Intrinsics.LJFF(strLIZJ2, string)) {
                        requestParams.customParams.put("resource_url", string);
                    }
                    iResourceServiceXLIZIZ.fetchResourceAsyncIfNeed(strLIZJ2, requestParams, new C1536720q5m(iResourceServiceXLIZIZ, abstractC1536860q60, c1537480q70));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AbstractC1536860q60 abstractC1536860q604 = abstractC1536860q60;
                    if (abstractC1536860q604 != null) {
                        abstractC1536860q604.LJ(th.toString());
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LynxTemplateTool@e279.preloadTemplate$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LynxTemplateTool@e279.preloadTemplate$runnable$1");
            }
        };
        if (z) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C474190Iif(runnable, null), 2);
        } else {
            runnable.run();
        }
    }
}
