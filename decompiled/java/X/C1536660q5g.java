package X;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.base.TraceEvent;
import com.tiktok.forestx.RequestParamsX;
import j27.s;
import java.io.File;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0q5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536660q5g {
    public static final C1536660q5g LIZ = new C1536660q5g();
    public static final C1537740q7Q LIZIZ = new InterfaceC1538750q93<C1537710q7N>() { // from class: X.0q7Q
        public final EnumC1067640dtC LIZ = EnumC1067640dtC.LYNX;

        @Override // X.InterfaceC1538750q93
        public final EnumC1067640dtC getViewType() {
            return this.LIZ;
        }

        /* JADX WARN: Type inference failed for: r2v35, types: [X.09AY, kotlin.jvm.functions.Function1] */
        @Override // X.InterfaceC1538750q93
        public final InterfaceC1541990qEH LIZ(HybridSchemaParam hybridSchemaParam, C1537480q70 c1537480q70, Context context, AbstractC1537870q7d abstractC1537870q7d) throws JSONException {
            Uri uri;
            EnumC1067640dtC type;
            String preloadStorageKeys;
            int i;
            Uri uriLIZ;
            Object objLJIIIZ;
            InterfaceC1538960q9O nativeStorageVisitor;
            InterfaceC1870830ymf interfaceC1870830ymfLIZ;
            HybridSchemaParam hybridSchemaParamLIZJ;
            EnumC1067640dtC type2;
            EnumC1067640dtC type3;
            C1536660q5g.LIZ.LIZ();
            String url = hybridSchemaParam.getUrl();
            if (url != null && url.length() != 0) {
                uri = UriProtector.parse(hybridSchemaParam.getUrl());
            } else {
                uri = UriProtector.parse(hybridSchemaParam.getSurl());
            }
            if (uri.isOpaque()) {
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uri);
                sbLIZ.append(" isn't a hierarchical URI.");
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "LynxKitViewProvider");
                return null;
            }
            EnumC1067640dtC enumC1067640dtC = this.LIZ;
            InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
            if (interfaceC1531560pxS != null) {
                type = interfaceC1531560pxS.getType();
            } else {
                type = null;
            }
            String str = "";
            if (enumC1067640dtC != type) {
                String str2 = c1537480q70.containerId;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Type ");
                InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
                if (interfaceC1531560pxS2 != null) {
                    type2 = interfaceC1531560pxS2.getType();
                } else {
                    type2 = null;
                }
                sbLIZ2.append(type2);
                sbLIZ2.append(" not support");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                String str3 = c1537480q70.vaid;
                if (str3 != null) {
                    str = str3;
                }
                C1520080pew.LJ(null, str2, new C1520180pf6(103, strLIZIZ, str));
                C1490740otc c1490740otc2 = C1490740otc.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Type ");
                InterfaceC1531560pxS interfaceC1531560pxS3 = c1537480q70.hybridParams;
                if (interfaceC1531560pxS3 != null) {
                    type3 = interfaceC1531560pxS3.getType();
                } else {
                    type3 = null;
                }
                sbLIZ3.append(type3);
                sbLIZ3.append(" not support");
                C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ3), null, null, 6);
                return null;
            }
            long jLIZJ = C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_COMPONENT_START}, null);
            C1537540q76.LIZ(c1537480q70, hybridSchemaParam);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1537790q7V c1537790q7V = new C1537790q7V(c1537480q70, abstractC1537870q7d);
            c1537790q7V.LJLJJI();
            c1537480q70.LJJIJ(jCurrentTimeMillis);
            InterfaceC1531560pxS interfaceC1531560pxS4 = c1537480q70.hybridParams;
            if (interfaceC1531560pxS4 != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS4.LIZJ()) != null) {
                preloadStorageKeys = hybridSchemaParamLIZJ.getPreloadStorageKeys();
            } else {
                preloadStorageKeys = null;
            }
            List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(URLDecoder.decode(preloadStorageKeys, "UTF-8"), e3.e, "", false), e3.f, "", false), " ", "", false), new String[]{","}, 0, 6);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!listLJJLIIIJILLIZJL.isEmpty()) {
                for (String str4 : listLJJLIIIJILLIZJL) {
                    C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                    C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
                    if (c1538050q7v != null && (nativeStorageVisitor = c1538050q7v.getNativeStorageVisitor()) != null && (interfaceC1870830ymfLIZ = nativeStorageVisitor.LIZ(context)) != null) {
                        objLJIIIZ = interfaceC1870830ymfLIZ.LJIIIZ("", str4);
                    } else {
                        objLJIIIZ = null;
                    }
                    linkedHashMap.put(str4, objLJIIIZ);
                }
            }
            InterfaceC1531560pxS interfaceC1531560pxS5 = c1537480q70.hybridParams;
            if (interfaceC1531560pxS5 != null) {
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("containerID", c1537480q70.containerId);
                InterfaceC1531560pxS interfaceC1531560pxS6 = c1537480q70.hybridParams;
                if (interfaceC1531560pxS6 != null) {
                    uriLIZ = interfaceC1531560pxS6.LIZ();
                } else {
                    uriLIZ = null;
                }
                pairArr[1] = new Pair("originUrl", String.valueOf(uriLIZ));
                pairArr[2] = new Pair("templateResData", c1537480q70.templateResData);
                pairArr[3] = new Pair("preloadStorageValues", linkedHashMap);
                interfaceC1531560pxS5.LIZLLL(C2097608Jq.LJIIIIZZ(pairArr));
            }
            if (!c1537480q70.usePreload) {
                i = 0;
            } else {
                InterfaceC1531560pxS interfaceC1531560pxS7 = c1537480q70.hybridParams;
                if (interfaceC1531560pxS7 != null) {
                    interfaceC1531560pxS7.LIZLLL(C2097908Jt.LIZJ(new Pair("usePreload", "1")));
                }
                i = 2;
            }
            C1536660q5g.LIZ.getClass();
            C1536670q5h.LIZ.getClass();
            if (C1536670q5h.LIZJ) {
                C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PARSE_SCHEMA_START}, null);
                C1537910q7h c1537910q7h = (C1537910q7h) c1537480q70.hybridParams;
                C1538000q7q.LIZ(c1537910q7h, hybridSchemaParam);
                C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PARSE_SCHEMA_END}, null);
                c1537910q7h.LJJIFFI((byte[]) c1537480q70.LJFF(byte[].class));
                c1537910q7h.LJJII((ByteBuffer) c1537480q70.LJFF(ByteBuffer.class));
                c1537910q7h.LJJIII((TemplateBundle) c1537480q70.LJFF(TemplateBundle.class));
                TraceEvent.LIZLLL("CreateLynxView");
                c1537910q7h.LJJJ = (LynxBackgroundRuntime) c1537480q70.LJFF(LynxBackgroundRuntime.class);
                c1537480q70.LJJIII(LynxBackgroundRuntime.class);
                c1537480q70.LJJIII(C1538540q8i.class);
                C1538200q8A c1538200q8A = (C1538200q8A) c1537480q70.LJFF(C1538200q8A.class);
                if (c1538200q8A != null) {
                    c1538200q8A.LJ = Long.valueOf(System.currentTimeMillis());
                }
                C1537890q7f c1537890q7f = C1537890q7f.LIZ;
                String string = uri.toString();
                c1537890q7f.getClass();
                C1309760kBi c1309760kBiLIZJ = C1537890q7f.LIZJ(c1537910q7h, c1537480q70, context, string);
                ?? r2 = c1537910q7h.LJJII;
                if (r2 != 0) {
                    r2.invoke(c1309760kBiLIZJ);
                }
                C1294080jmQ.LIZ.LIZ(c1309760kBiLIZJ);
                C1537710q7N c1537710q7N = new C1537710q7N(context, c1537480q70, c1309760kBiLIZJ, c1537910q7h, c1537790q7V);
                TraceEvent.LJII("CreateLynxView");
                c1537790q7V.LJLILLLLZI();
                c1537790q7V.LJLJI(c1537710q7N);
                C1490740otc c1490740otc3 = C1490740otc.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("createLynxView cost: ");
                sbLIZ4.append(System.currentTimeMillis() - jCurrentTimeMillis);
                c1490740otc3.LIZ(C2188811AlT.LIZIZ(sbLIZ4), EnumC1490770otf.I, "LynxKitViewProvider");
                C1529360ptu c1529360ptu = C1529360ptu.LIZ;
                C1521530phH c1521530phH = new C1521530phH(c1537480q70.bid, new C1520400pfS());
                c1521530phH.LIZIZ = true;
                c1521530phH.LIZLLL = c1537480q70.vaid;
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor.INSTANCE.registerLynxViewMonitor(c1537710q7N, c1521530phH);
                C1537540q76.LIZIZ(c1537710q7N, c1537910q7h, c1537480q70, i, jLIZJ, hybridSchemaParam);
                return c1537710q7N;
            }
            String str5 = c1537480q70.containerId;
            String str6 = c1537480q70.vaid;
            if (str6 != null) {
                str = str6;
            }
            C1520080pew.LJ(null, str5, new C1520180pf6(101, "lynxKit not inited, please trigger HybridKit.initLynxKit() at first", str));
            C1490740otc.LIZ.LIZ("lynxKit not inited, please trigger HybridKit.initLynxKit() at first", EnumC1490770otf.E, "LynxKitViewProvider");
            return null;
        }
    };
    public static final C1537730q7P LIZJ = new C1537730q7P();

    public static void LIZJ() {
        synchronized (C1537410q6t.LJIIJJI) {
            try {
                LIZ.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZ()) {
            LIZJ();
        } else {
            synchronized (this) {
                LIZIZ();
            }
        }
    }

    public final void LIZIZ() {
        C1536670q5h.LIZ.getClass();
        if (C1536670q5h.LIZJ) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZLLL(null);
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HybridKit Init Lynx Finish, cost: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ.append("ms");
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
    }

    public static void LJ(C1537480q70 c1537480q70) {
        InterfaceC1311300kEC interfaceC1311300kEC;
        C1529360ptu c1529360ptu = C1529360ptu.LIZ;
        if (!c1529360ptu.LIZLLL(c1537480q70)) {
            return;
        }
        C1529370ptv c1529370ptv = C1529360ptu.LIZIZ;
        if (c1529370ptv != null) {
            interfaceC1311300kEC = c1529370ptv.LIZJ;
        } else {
            interfaceC1311300kEC = null;
        }
        if (interfaceC1311300kEC == null) {
            C1490740otc.LIZ.LIZ("LynxConfig cannot be null, Please set value by HybridKit.setLynxConfig", EnumC1490770otf.E, "HybridLynxKit");
            return;
        }
        if (c1529370ptv != null && c1529370ptv.LIZLLL != null) {
            C1520080pew.LIZIZ.add(new InterfaceC1520110pez() { // from class: X.0piF
                @Override // X.InterfaceC1520110pez
                public final boolean LIZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                    return interfaceC1541990qEH instanceof LynxView;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1520110pez
                public final void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH, C1520350pfN c1520350pfN) {
                    if (!(interfaceC1541990qEH instanceof LynxView)) {
                        return;
                    }
                    LynxViewMonitor.Companion.getClass();
                    LynxViewMonitor.INSTANCE.reportCustom((LynxView) interfaceC1541990qEH, c1520350pfN);
                }
            });
            c1529360ptu.LIZ();
            if (interfaceC1311300kEC instanceof C1311190kE1) {
                C1311190kE1 c1311190kE1 = (C1311190kE1) interfaceC1311300kEC;
                C1536670q5h.LIZ.getClass();
                if (c1311190kE1.LJIIIIZZ) {
                    C1536670q5h.LIZJ = true;
                    C1536670q5h.LIZIZ.compareAndSet(false, true);
                    C1490740otc.LIZIZ(C1490740otc.LIZ, "Lynx has been initialized at other place", null, null, 6);
                } else if (C1536670q5h.LIZJ || C1536670q5h.LIZIZ.compareAndSet(false, true)) {
                    try {
                        C1301200jxu.LIZ = new AbstractC1301120jxm() { // from class: X.0puU
                            public static Typeface LIZIZ(s sVar, EnumC1301150jxp enumC1301150jxp, String str) {
                                if (!TextUtils.isEmpty(str) && enumC1301150jxp != EnumC1301150jxp.LOCAL) {
                                    int iLJJJ = a0.LJJJ(str, "base64,", 0, false, 6);
                                    if (u.LJJIIJZLJL(str, "data:", false) && iLJJJ != -1) {
                                        try {
                                            return C08JN.LIZIZ(sVar, Base64.decode(str.substring(iLJJJ + 7), 0));
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            String message = e.getMessage();
                                            C1309780kBk c1309780kBk = sVar.LLJJIJI;
                                            if (c1309780kBk != null) {
                                                c1309780kBk.LJFF(new LynxError(message, 39800));
                                                return null;
                                            }
                                            return null;
                                        }
                                    }
                                    return null;
                                }
                                return null;
                            }

                            @Override // X.AbstractC1301120jxm
                            public final Typeface LIZ(s sVar, EnumC1301150jxp enumC1301150jxp, String str) throws JSONException {
                                boolean z;
                                boolean z2;
                                LynxView lynxViewLJIILJJIL;
                                C1537710q7N c1537710q7N;
                                C1533790q13 c1533790q13LIZIZ;
                                C1537480q70 hybridContext;
                                C1537710q7N c1537710q7N2;
                                LynxView lynxViewLJIILJJIL2;
                                C1537710q7N c1537710q7N3;
                                InterfaceC1532260pya interfaceC1532260pyaLJIILJJIL;
                                C1532310pyf c1532310pyfLIZ;
                                Typeface typefaceW4;
                                C1537480q70 hybridContext2;
                                C1537480q70 hybridContext3;
                                if (str != null && str.length() != 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                LynxView lynxViewLJIILJJIL3 = null;
                                if (z) {
                                    return null;
                                }
                                List<Pattern> list = C1533710q0v.LIZIZ;
                                if (list != null && !list.isEmpty()) {
                                    Iterator<Pattern> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (it2.next().matcher(str).find()) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                JSONArray jSONArray = C1533710q0v.LIZ;
                                C1533710q0v.LJIILJJIL(str, null, null, null, z2);
                                if (z2) {
                                    return null;
                                }
                                if (C1535630q41.LJJIII) {
                                    RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_FONT, null, 2, null);
                                    requestParamsX.source = "LynxKit";
                                    if (sVar != null) {
                                        lynxViewLJIILJJIL3 = sVar.LJIILJJIL();
                                    }
                                    if (lynxViewLJIILJJIL3 instanceof C1537710q7N) {
                                        c1537710q7N2 = (C1537710q7N) lynxViewLJIILJJIL3;
                                    } else {
                                        c1537710q7N2 = null;
                                    }
                                    if (c1537710q7N2 != null && (hybridContext3 = c1537710q7N2.getHybridContext()) != null) {
                                        String str2 = hybridContext3.containerId;
                                        requestParamsX.groupId = str2;
                                        requestParamsX.customParams = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", str2), new Pair("hybrid_channel", "Lynx_Font_Forest"), new Pair("source_location", "com.lynx.tasm.loader.LynxFontFaceLoader.Loader.onLoadFontFace"));
                                        C1533710q0v.LJFF(requestParamsX, hybridContext3);
                                    }
                                    String strLIZLLL = C1533710q0v.LIZLLL(null, requestParamsX, str);
                                    if (sVar != null) {
                                        lynxViewLJIILJJIL2 = sVar.LJIILJJIL();
                                    } else {
                                        lynxViewLJIILJJIL2 = null;
                                    }
                                    if (lynxViewLJIILJJIL2 instanceof C1537710q7N) {
                                        c1537710q7N3 = (C1537710q7N) lynxViewLJIILJJIL2;
                                    } else {
                                        c1537710q7N3 = null;
                                    }
                                    if (c1537710q7N3 == null || (hybridContext2 = c1537710q7N3.getHybridContext()) == null || (interfaceC1532260pyaLJIILJJIL = C1537480q70.LJIILJJIL(hybridContext2, false, null, 3)) == null) {
                                        C1532680pzG.LIZ.getClass();
                                        interfaceC1532260pyaLJIILJJIL = C1532680pzG.LJJ;
                                    }
                                    C1532970pzj c1532970pzjLIZIZ = interfaceC1532260pyaLJIILJJIL.LIZIZ(strLIZLLL, requestParamsX);
                                    if (c1532970pzjLIZIZ != null && (c1532310pyfLIZ = c1532970pzjLIZIZ.LIZ()) != null) {
                                        try {
                                            File fileLJIIJJI = c1532310pyfLIZ.LJIIJJI();
                                            if (fileLJIIJJI != null && (typefaceW4 = C786410Ut5.w4(fileLJIIJJI)) != null) {
                                                C1536670q5h.LIZLLL.put(str, typefaceW4);
                                                C1490740otc c1490740otc = C1490740otc.LIZ;
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("cache font for ");
                                                sbLIZ.append(str);
                                                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "Lynx");
                                            }
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            C1490740otc c1490740otc2 = C1490740otc.LIZ;
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("get font:{ ");
                                            sbLIZ2.append(str);
                                            sbLIZ2.append(" } error, msg = {");
                                            sbLIZ2.append(e.getMessage());
                                            sbLIZ2.append('}');
                                            c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.I, "Lynx");
                                        }
                                    }
                                    Typeface typeface = C1536670q5h.LIZLLL.get(str);
                                    if (typeface == null) {
                                        return LIZIZ(sVar, enumC1301150jxp, str);
                                    }
                                    return typeface;
                                }
                                boolean z3 = true;
                                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
                                if (iResourceServiceXLIZIZ != null) {
                                    RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_FONT);
                                    if (sVar != null) {
                                        lynxViewLJIILJJIL = sVar.LJIILJJIL();
                                    } else {
                                        lynxViewLJIILJJIL = null;
                                    }
                                    if (lynxViewLJIILJJIL instanceof C1537710q7N) {
                                        c1537710q7N = (C1537710q7N) lynxViewLJIILJJIL;
                                    } else {
                                        c1537710q7N = null;
                                    }
                                    if (c1537710q7N != null && (hybridContext = c1537710q7N.getHybridContext()) != null) {
                                        requestParams.customParams.put("rl_container_uuid", hybridContext.containerId);
                                        requestParams.customParams.put("hybrid_channel", "Lynx_Font_Forest");
                                        requestParams.customParams.put("source_location", "com.lynx.tasm.loader.LynxFontFaceLoader.Loader.onLoadFontFace");
                                        C1533710q0v.LJ(requestParams, hybridContext);
                                    }
                                    String strLIZLLL2 = C1533710q0v.LIZLLL(null, requestParams, str);
                                    if (!Intrinsics.LJFF(strLIZLLL2, str)) {
                                        requestParams.customParams.put("resource_url", str);
                                    }
                                    C1533910q1F c1533910q1FCreateSyncRequest = iResourceServiceXLIZIZ.createSyncRequest(strLIZLLL2, requestParams);
                                    if (c1533910q1FCreateSyncRequest != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null) {
                                        String strLIZLLL3 = c1533790q13LIZIZ.LIZLLL();
                                        if (strLIZLLL3 != null && strLIZLLL3.length() != 0) {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            return null;
                                        }
                                        try {
                                            Typeface typefaceW42 = C786410Ut5.w4(new C0VSJ(c1533790q13LIZIZ.LIZLLL()));
                                            if (typefaceW42 != null) {
                                                C1536670q5h.LIZLLL.put(str, typefaceW42);
                                                C1490740otc c1490740otc3 = C1490740otc.LIZ;
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("cache font for ");
                                                sbLIZ3.append(str);
                                                c1490740otc3.LIZ(C2188811AlT.LIZIZ(sbLIZ3), EnumC1490770otf.I, "Lynx");
                                            }
                                        } catch (Exception e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                            C1490740otc c1490740otc4 = C1490740otc.LIZ;
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("get font:{ ");
                                            sbLIZ4.append(str);
                                            sbLIZ4.append(" } error, msg = {");
                                            sbLIZ4.append(e2.getMessage());
                                            sbLIZ4.append('}');
                                            c1490740otc4.LIZ(C2188811AlT.LIZIZ(sbLIZ4), EnumC1490770otf.I, "Lynx");
                                        }
                                    }
                                }
                                Typeface typeface2 = C1536670q5h.LIZLLL.get(str);
                                if (typeface2 == null) {
                                    return LIZIZ(sVar, enumC1301150jxp, str);
                                }
                                return typeface2;
                            }
                        };
                        C1300980jxY.LIZ(new InterfaceC1300810jxH() { // from class: X.0kED
                            @Override // X.InterfaceC1300810jxH
                            public final Typeface LIZ(int i, String str) {
                                return C1300980jxY.LJFF(C1202420hOa.LIZ().getAssets(), str, i);
                            }
                        });
                        C1298840ju6 c1298840ju6 = C1298840ju6.LIZ;
                        boolean z = C1202420hOa.LIZ;
                        c1298840ju6.getClass();
                        C1311170kDz.LIZ.getClass();
                        C1311170kDz.LIZ(c1311190kE1);
                        C1536590q5Z.LLJ = c1311190kE1.LJIIIZ;
                        if (LynxEnv.inst().isNativeLibraryLoaded()) {
                            C1536670q5h.LIZJ = true;
                        } else {
                            C1536670q5h.LIZIZ.set(false);
                            throw new RuntimeException("Lynx so Init Failed");
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1536670q5h.LIZIZ.set(false);
                        C1490740otc.LIZJ(C1490740otc.LIZ, th, "LynxKit Init Failed");
                    }
                }
            }
            C1529360ptu.LIZ.LIZJ();
            return;
        }
        C1490740otc.LIZ.LIZ("ResourceConfig cannot be null, Please set value by HybridKit.setResourceConfig", EnumC1490770otf.E, "HybridLynxKit");
    }

    public static void LJFF(C1537480q70 c1537480q70) {
        synchronized (C1537410q6t.LJIIJJI) {
            try {
                LIZ.getClass();
                LJ(c1537480q70);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(C1537480q70 c1537480q70) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZ()) {
            LJFF(c1537480q70);
        } else {
            synchronized (this) {
                LJ(c1537480q70);
            }
        }
    }
}
