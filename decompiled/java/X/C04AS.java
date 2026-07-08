package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04AS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1294060jmO
public final class C04AS {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final TryOnData LIZ;
    public final JSONObject LIZIZ;
    public final PdpViewModel LIZJ;
    public final C1053804Ae LIZLLL;
    public final C1019703yl LJ;
    public final String LJFF;
    public final Context LJI;
    public final View LJII;
    public final InterfaceC1748810vbr LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final SkuPanelStarter.SkuEnterParams LJIIJJI;
    public final SkuPanelAssemVM LJIIL;

    static {
        new C10529049v();
    }

    public final String LIZIZ() {
        String str = this.LJFF;
        TryOnData tryOnData = this.LIZ;
        Object obj = null;
        String strLIZ = C04AT.LIZ(tryOnData != null ? C04AT.LIZIZ(tryOnData) : null);
        Iterator it2 = a0.LJJLIIIJ(str, new char[]{'.'}, false, 0, 6).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String str2 = (String) next;
            if (a0.LJJLIIIJJIZ(str2, 'c') && str2.length() > 1) {
                obj = next;
                break;
            }
        }
        String str3 = (String) obj;
        if (str3 == null) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str3);
        sbLIZ.append('.');
        if (strLIZ == null) {
            strLIZ = "d49471";
        }
        sbLIZ.append(strLIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, Object> LIZ() {
        String strLIZIZ = LIZIZ();
        if (Intrinsics.LJFF(this.LJIIIZ, "first_image_dark_button")) {
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("btm", "a2270.b15912.c64701.d49471"));
            TryOnData tryOnData = this.LIZ;
            return C04AT.LIZJ(C04AT.LIZ(tryOnData != null ? C04AT.LIZIZ(tryOnData) : null), mapLIZJ);
        }
        C1053804Ae c1053804Ae = this.LIZLLL;
        if (c1053804Ae != null) {
            return c1053804Ae.LJ(strLIZIZ);
        }
        C1019703yl c1019703yl = this.LJ;
        if (c1019703yl != null) {
            return c1019703yl.LJ(strLIZIZ);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.045d] */
    public final void LIZLLL(String str) {
        String strLIZIZ;
        IPdpCardBridgeService iPdpCardBridgeService;
        HashMap<String, Object> mapLIZLLL;
        int i;
        TryOnData tryOnData = this.LIZ;
        if (tryOnData != null && (strLIZIZ = tryOnData.schema) != null) {
            Integer numValueOf = null;
            if (this.LIZIZ == null) {
                C1019103yf.LIZ(EnumC1014603xw.ERR10016, new Throwable("byPass data is null"), null);
            }
            C996703v3.LIZIZ(strLIZIZ, this.LIZJ, this.LJIIL);
            Map<String, String> mapLIZJ = C2097908Jt.LIZJ(new Pair("traffic_from", "ai_try_on"));
            String strLIZIZ2 = LIZIZ();
            C1053804Ae c1053804Ae = this.LIZLLL;
            if (c1053804Ae != null) {
                c1053804Ae.LIZLLL(mapLIZJ, false);
                strLIZIZ = this.LIZLLL.LIZIZ(strLIZIZ, this.LIZLLL.LJI(strLIZIZ2, null));
            } else {
                C1019703yl c1019703yl = this.LJ;
                if (c1019703yl != null) {
                    c1019703yl.LIZLLL(mapLIZJ, false);
                    strLIZIZ = this.LJ.LIZIZ(strLIZIZ, this.LJ.LJI(strLIZIZ2, null));
                }
            }
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = this.LJI;
            SparkContext sparkContext = new SparkContext();
            Uri.Builder builderBuildUpon = UriProtector.parse(strLIZIZ).buildUpon();
            builderBuildUpon.appendQueryParameter("_ec_start_time", String.valueOf(System.currentTimeMillis()));
            builderBuildUpon.appendQueryParameter("entrance_form", this.LJIIIZ);
            builderBuildUpon.appendQueryParameter("ec_native_prefetch_skip_network_init", "1");
            String str2 = this.LJIIJ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            builderBuildUpon.appendQueryParameter("source_page_type", str2);
            if (str != null) {
                builderBuildUpon.appendQueryParameter("init_try_on_tab", str);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            final PdpViewModel pdpViewModel = this.LIZJ;
            if (pdpViewModel != null) {
                ?? r10 = new Object(pdpViewModel) { // from class: X.045d
                    public final PdpViewModel LIZ;

                    {
                        this.LIZ = pdpViewModel;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public static java.lang.String LIZ(X.C10407045d r67, int r68) {
                        /*
                            Method dump skipped, instruction units count: 379
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C10407045d.LIZ(X.045d, int):java.lang.String");
                    }
                };
                if (!Intrinsics.LJFF(this.LJIIIZ, "try_on_clolors_pdp")) {
                    numValueOf = Integer.valueOf(this.LIZJ.LLLZI);
                    String string = numValueOf.toString();
                    if (string != null) {
                        str3 = string;
                    }
                    builderBuildUpon.appendQueryParameter("product_pic_index", str3);
                }
                if (pdpViewModel.LLZLLIL) {
                    i = 11;
                } else {
                    i = 1;
                }
                linkedHashMap.put("buyNowSchema", C10407045d.LIZ(r10, i));
                linkedHashMap.put("gotoCartSchema", C10407045d.LIZ(r10, 2));
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJIIJJI;
            if (skuEnterParams != null) {
                builderBuildUpon.appendQueryParameter("jump_params", C1741890vQh.LJIIIIZZ(skuEnterParams));
            }
            String string2 = builderBuildUpon.build().toString();
            sparkContext.LJJLIIJ(string2);
            JSONObject jSONObject = this.LIZIZ;
            if (jSONObject != null) {
                linkedHashMap.put("data", jSONObject);
            }
            InterfaceC1748810vbr interfaceC1748810vbr = this.LJIIIIZZ;
            if ((interfaceC1748810vbr instanceof InterfaceC1748810vbr) && interfaceC1748810vbr != null && (iPdpCardBridgeService = (IPdpCardBridgeService) PluggableExtentionKt.pluggableSpi$default(IPdpCardBridgeService.class, false, false, false, 14, null)) != null && (mapLIZLLL = iPdpCardBridgeService.LIZLLL(interfaceC1748810vbr)) != null) {
                if (numValueOf != null) {
                    mapLIZLLL.put("product_pic_index", numValueOf);
                }
                linkedHashMap.put("params", mapLIZLLL);
            }
            C1326490kch c1326490kch = C1326490kch.LIZ;
            AwS86S1000000_1 awS86S1000000_1 = new AwS86S1000000_1(string2, 10);
            c1326490kch.getClass();
            C1326490kch.LIZIZ(awS86S1000000_1);
            C1547280qMo.LJ(sparkContext, TemplateData.LJII(linkedHashMap));
            C1538590q8n c1538590q8n = new C1538590q8n();
            c1538590q8n.LJI = true;
            sparkContext.liteLynxConfig = c1538590q8n;
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    public final View LIZJ(SaleProp saleProp, boolean z) {
        String str;
        TryOnData tryOnData = this.LIZ;
        if (tryOnData == null || !Intrinsics.LJFF(tryOnData.skuEntryPropId, saleProp.propId) || !z || (str = this.LIZ.skuPropertyEntryText) == null || str.length() == 0) {
            return null;
        }
        Context context = this.LJI;
        String str2 = this.LIZ.skuPropertyEntryText;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setGravity(17);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(str2);
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxWidth(C679280Qkg.LIZ(200));
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_chevron_right_ltr);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        tuxIconView.setTintColorRes(R.attr.a1k);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(tuxIconView);
        return linearLayout;
    }

    public final void LJFF(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        C10529049v.LIZIZ(map, this.LJIIIZ, null, map2, LIZ(), 8);
    }

    public static void LJ(C04AS c04as, Map map, String str) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        C1054004Ag c1054004Ag;
        PdpViewModel pdpViewModel = c04as.LIZJ;
        if (pdpViewModel != null && (c1054004Ag = pdpViewModel.LLJLILLLLZIIL) != null) {
            concurrentHashMap = c1054004Ag.LIZIZ;
        } else {
            concurrentHashMap = null;
        }
        c04as.getClass();
        C1018703yb.LIZLLL("tiktokec_button_click", new AwS43S1300000_1((Map) concurrentHashMap, (Map<String, ? extends Object>) c04as, (C04AS) map, (Map<String, ? extends Object>) str, (String) 6));
    }

    public C04AS(TryOnData tryOnData, JSONObject jSONObject, PdpViewModel pdpViewModel, C1053804Ae c1053804Ae, C1019703yl c1019703yl, String str, Context context, C1763840w06 c1763840w06, InterfaceC1748810vbr interfaceC1748810vbr, String str2, String str3, SkuPanelStarter.SkuEnterParams skuEnterParams, SkuPanelAssemVM skuPanelAssemVM, int i) {
        Object obj;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        Map<String, Object> map;
        String str4 = str3;
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = skuEnterParams;
        jSONObject = (i & 2) != 0 ? null : jSONObject;
        pdpViewModel = (i & 4) != 0 ? null : pdpViewModel;
        c1053804Ae = (i & 8) != 0 ? null : c1053804Ae;
        c1019703yl = (i & 16) != 0 ? null : c1019703yl;
        c1763840w06 = (i & 128) != 0 ? null : c1763840w06;
        if ((i & 1024) != 0) {
            if (pdpViewModel != null && (pdpEnterParam = pdpViewModel.LLJI) != null && (map = pdpEnterParam.trackParams) != null) {
                obj = map.get("source_page_type");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str4 = (String) obj;
            } else {
                str4 = null;
            }
        }
        skuEnterParams2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : skuEnterParams2;
        SkuPanelAssemVM skuPanelAssemVM2 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? skuPanelAssemVM : null;
        this.LIZ = tryOnData;
        this.LIZIZ = jSONObject;
        this.LIZJ = pdpViewModel;
        this.LIZLLL = c1053804Ae;
        this.LJ = c1019703yl;
        this.LJFF = str;
        this.LJI = context;
        this.LJII = c1763840w06;
        this.LJIIIIZZ = interfaceC1748810vbr;
        this.LJIIIZ = str2;
        this.LJIIJ = str4;
        this.LJIIJJI = skuEnterParams2;
        this.LJIIL = skuPanelAssemVM2;
    }
}
