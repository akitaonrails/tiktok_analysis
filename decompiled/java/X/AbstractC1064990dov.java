package X;

import Y.ACallableS246S0200000_16;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.util.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.api.ISandboxService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lemon8.Lemon8AnchorConfig;
import com.ss.android.ugc.aweme.lemon8.Lemon8AnchorHelper;
import com.ss.android.ugc.aweme.lemon8.Lemon8CampaignDeeplink;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0dov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1064990dov extends AbstractC1066890drz {
    public boolean LLJ;
    public C2344009Gk LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> LJJIJIL() {
        /*
            r7 = this;
            r6 = 0
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r7.LLIZ     // Catch: java.lang.Exception -> L9b
            if (r0 == 0) goto La
            java.lang.String r0 = r0.getExtra()     // Catch: java.lang.Exception -> L9b
            goto Lb
        La:
            r0 = r6
        Lb:
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L16
            int r0 = r0.length()     // Catch: java.lang.Exception -> L9b
            if (r0 == 0) goto L16
            goto L18
        L16:
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L1c
            return r6
        L1c:
            com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Exception -> L9b
            r0.<init>()     // Catch: java.lang.Exception -> L9b
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r7.LLIZ     // Catch: java.lang.Exception -> L9b
            if (r0 == 0) goto L32
            java.lang.String r0 = r0.getExtra()     // Catch: java.lang.Exception -> L9b
        L29:
            com.google.gson.k r1 = com.google.gson.p.LIZJ(r0)     // Catch: java.lang.Exception -> L9b
            boolean r0 = r1 instanceof com.google.gson.n     // Catch: java.lang.Exception -> L9b
            if (r0 != 0) goto L35
            goto L34
        L32:
            r0 = r6
            goto L29
        L34:
            return r6
        L35:
            com.google.gson.n r1 = (com.google.gson.n) r1     // Catch: java.lang.Exception -> L9b
            com.google.gson.n r1 = r1.LJIILIIL()     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "gecko_channel"
            com.google.gson.k r4 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L9b
            com.google.gson.Gson r3 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            r0.getClass()     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            if (r0 == 0) goto L55
            boolean r0 = r0.LJII     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            if (r0 != r2) goto L55
            goto L57
        L55:
            r0 = 0
            goto L58
        L57:
            r0 = 1
        L58:
            if (r0 == 0) goto L5b
            goto L65
        L5b:
            X.0dZv r0 = new X.0dZv     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            r0.<init>()     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            goto L7e
        L65:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            r1.getClass()     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            X.13JW r0 = X.C13LE.LJFF(r2, r0)     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
        L7e:
            java.lang.Object r1 = r3.LIZLLL(r4, r0)     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            boolean r0 = r1 instanceof java.util.List     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            if (r0 != 0) goto L87
            r1 = r6
        L87:
            java.util.List r1 = (java.util.List) r1     // Catch: com.google.gson.s -> L8a java.lang.Exception -> L9b
            goto L8f
        L8a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L9b
            r1 = r6
        L8f:
            if (r1 == 0) goto L97
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L9b
            if (r0 == 0) goto L98
        L97:
            r5 = 1
        L98:
            if (r5 != 0) goto L9f
            return r1
        L9b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L9f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1064990dov.LJJIJIL():java.util.List");
    }

    public final boolean LJJLIIIJJIZ() {
        String extra;
        List<String> listLJJIJIL;
        try {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            Boolean bool = null;
            if (anchorCommonStruct == null || (extra = anchorCommonStruct.getExtra()) == null || extra.length() == 0) {
                return false;
            }
            new p();
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            k kVarLIZJ = p.LIZJ(anchorCommonStruct2 != null ? anchorCommonStruct2.getExtra() : null);
            if (!(kVarLIZJ instanceof n)) {
                return false;
            }
            k kVarLJJIIZ = ((n) kVarLIZJ).LJIILIIL().LJJIIZ("is_schema_lynx");
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                Object objLIZLLL = gsonLJFF.LIZLLL(kVarLJJIIZ, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<Boolean>() { // from class: X.0dp1
                }.getType() : C2371409Qy.LIZJ(C13LE.LJ(Boolean.class)));
                if (!(objLIZLLL instanceof Boolean)) {
                    objLIZLLL = null;
                }
                bool = (Boolean) objLIZLLL;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (Intrinsics.LJFF(bool, Boolean.TRUE) && (listLJJIJIL = LJJIJIL()) != null) {
                if (!listLJJIJIL.isEmpty()) {
                    return true;
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return false;
    }

    public final String LJJIJL() {
        String schema;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) {
            schema = "";
        }
        Uri uri = UriProtector.parse(schema);
        if (type() != EnumC1430380nKG.LEMON8_ANCHOR.getTYPE()) {
            if (!C1067090dsJ.LIZ(type())) {
                return "";
            }
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            String strLIZIZ = C1065000dow.LIZIZ(anchorCommonStruct2 != null ? anchorCommonStruct2.subType() : null);
            return strLIZIZ != null ? strLIZIZ : "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "campaign_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() <= 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lemon8 | ");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final InterfaceC1392590mLJ LJJJJJL() {
        final String str = this.LLILLL;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        final String strSubType = anchorCommonStruct != null ? anchorCommonStruct.subType() : null;
        return new C1065100dp6(str, strSubType) { // from class: X.0dp0
            public final String LIZIZ;
            public final String LIZJ;

            @Override // X.C1065100dp6, X.InterfaceC1392590mLJ
            public final String LIZIZ() {
                String strLIZIZ = C1065000dow.LIZIZ(this.LIZJ);
                return !C123100dR.LIZ(strLIZIZ) ? C1065100dp6.LJII(this.LIZIZ, "anchor_name") : strLIZIZ;
            }

            @Override // X.C1065100dp6, X.InterfaceC1392590mLJ
            public final String LJI() {
                String strLIZIZ = C1065000dow.LIZIZ(this.LIZJ);
                return !C123100dR.LIZ(strLIZIZ) ? C1065100dp6.LJII(this.LIZIZ, "anchor_name") : strLIZIZ;
            }

            {
                super(str);
                this.LIZIZ = str;
                this.LIZJ = strSubType;
            }
        };
    }

    public final void LJJLIIIJJI() {
        String schema;
        if (this.LLJILJIL != null) {
            return;
        }
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String str = null;
        if (C1067090dsJ.LIZ(anchorCommonStruct != null ? anchorCommonStruct.getType() : EnumC1430380nKG.NO_TYPE.getTYPE())) {
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (!Intrinsics.LJFF(anchorCommonStruct2 != null ? anchorCommonStruct2.subType() : null, "lemon8_general_create_post")) {
                AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
                if (anchorCommonStruct3 == null || (schema = anchorCommonStruct3.getSchema()) == null) {
                    schema = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(schema), "campaign_id");
                str = (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null ? strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter : "").length() > 0 ? "Lemon8 | general_pick_tool" : "Lemon8 | general_pick_normal";
            }
        }
        this.LLJILJIL = str;
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        LJJLIIIJJI();
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 692);
        return new C1400390mXt(awS560S0100000_16, awS560S0100000_16, awS560S0100000_16, null, null, 24);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            C1065000dow.LIZ(c2344009Gk, this.LLIZ);
            LJJIJIIJI(c2344009Gk);
        }
        LJJIIJ(c2344009Gk);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r1.length() != 0) goto L35;
     */
    @Override // X.AbstractC1066890drz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(X.C1394720mOk r6) {
        /*
            r5 = this;
            r4 = 0
            com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Exception -> L6a
            r0.<init>()     // Catch: java.lang.Exception -> L6a
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r5.LLIZ     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.getExtra()     // Catch: java.lang.Exception -> L6a
        Le:
            com.google.gson.k r0 = com.google.gson.p.LIZJ(r0)     // Catch: java.lang.Exception -> L6a
            com.google.gson.n r1 = r0.LJIILIIL()     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = "keyword"
            com.google.gson.k r3 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L6a
            goto L1f
        L1d:
            r0 = r4
            goto Le
        L1f:
            r2 = 1
            com.google.gson.Gson r1 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            r0.getClass()     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            if (r0 == 0) goto L46
            boolean r0 = r0.LJII     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            if (r0 != r2) goto L46
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.13JW r0 = X.C13LE.LJ(r0)     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
        L3d:
            java.lang.Object r1 = r1.LIZLLL(r3, r0)     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            boolean r0 = r1 instanceof java.lang.String     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            if (r0 != 0) goto L51
            goto L50
        L46:
            X.0doz r0 = new X.0doz     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            r0.<init>()     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            goto L3d
        L50:
            r1 = r4
        L51:
            java.lang.String r1 = (java.lang.String) r1     // Catch: com.google.gson.s -> L56 java.lang.Exception -> L6a
            if (r1 == 0) goto L61
            goto L5b
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L6a
            goto L61
        L5b:
            int r0 = r1.length()     // Catch: java.lang.Exception -> L6a
            if (r0 != 0) goto L7a
        L61:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r5.LLIZ     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L78
            java.lang.String r1 = r0.getKeyword()     // Catch: java.lang.Exception -> L6a
            goto L76
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r5.LLIZ
            if (r0 == 0) goto L78
            java.lang.String r1 = r0.getKeyword()
        L76:
            if (r1 != 0) goto L7a
        L78:
            java.lang.String r1 = ""
        L7a:
            r6.setTitle(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1064990dov.LJJIIZ(X.0mOk):void");
    }

    public final void LJJIJIIJI(C2344009Gk c2344009Gk) {
        String str = this.LLJILJIL;
        if (str != null && str.length() > 0) {
            c2344009Gk.LJFF("lemon8_pick_anchor_type", str);
        }
    }

    public final String LJJIJIIJIL(String str) {
        String dataFromExtra;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            dataFromExtra = anchorCommonStruct.getDataFromExtra("l8_gid", "");
        } else {
            dataFromExtra = null;
        }
        if (dataFromExtra == null) {
            dataFromExtra = "";
        }
        if (dataFromExtra.length() == 0) {
            return null;
        }
        return Uri.encode(UriProtector.parse("snssdk2657://main?").buildUpon().appendQueryParameter("landing_config", C08JS.LIZLLL(C2097608Jq.LJIIJ(new Pair("action_type", 0), new Pair("content_type", 2), new Pair("recommend_user_id", ""), new Pair("pid", str), new Pair("biz_info", C2097608Jq.LJIIJ(new Pair("gids", dataFromExtra)))))).build().toString());
    }

    public final String LJJIL(String str) {
        String str2;
        boolean z;
        String strSubType;
        String str3;
        Lemon8AnchorHelper lemon8AnchorHelper = Lemon8AnchorHelper.LIZ;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        lemon8AnchorHelper.getClass();
        Object obj = Lemon8AnchorHelper.LIZIZ(anchorCommonStruct).get("pid");
        if (!(obj instanceof String) || (str2 = (String) obj) == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            return str2;
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str4 = ((Lemon8AnchorConfig) C1065020doy.LIZIZ.getValue()).campaignPidMap.get(str);
            if (str4 == null) {
                return "tiktok_lemon8";
            }
            return str4;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 == null || (strSubType = anchorCommonStruct2.subType()) == null || strSubType.length() <= 0 || (str3 = ((Lemon8AnchorConfig) C1065020doy.LIZIZ.getValue()).generalPidMap.get(strSubType)) == null) {
            return "tiktok_lemon8";
        }
        return str3;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct2);
        LJIILIIL(anchorCommonStruct2);
        this.LLIZ = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    public final void LJJLIIIJL(C2344009Gk c2344009Gk) {
        String schema;
        Object groupId;
        String logExtra;
        String creativeIdStr;
        int chargeType;
        String id;
        HashMap map;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        final String strLIZ = C1553670qX7.LIZ();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String str = "";
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) {
            schema = "";
        }
        Uri uri = UriProtector.parse(schema);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_lynx_landing_page", true);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putBoolean("hide_status_bar", true);
        int systemOrigin = 0;
        bundle.putBoolean("bundle_nav_bar_status_padding", false);
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        if (interfaceC1392640mLO3 == null) {
            interfaceC1392640mLO3 = null;
        }
        String authorUid = AwemeExtKt.getAuthorUid(interfaceC1392640mLO3.LJJLIIIJJIZ());
        if (authorUid == null) {
            authorUid = "";
        }
        C786410Ut5.LJJJI("author_id", authorUid, bundle);
        InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
        if (interfaceC1392640mLO4 == null) {
            interfaceC1392640mLO4 = null;
        }
        String aid = interfaceC1392640mLO4.LJJLIIIJJIZ().getAid();
        if (aid == null) {
            aid = "";
        }
        C786410Ut5.LJJJI("group_id", aid, bundle);
        AwemeRawAd awemeRawAd = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd == null || (groupId = awemeRawAd.getGroupId()) == null) {
            groupId = "";
        }
        C786410Ut5.LJJJI("aweme_group_id", groupId.toString(), bundle);
        AwemeRawAd awemeRawAd2 = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd2 != null) {
            logExtra = awemeRawAd2.getLogExtra();
        } else {
            logExtra = null;
        }
        C786410Ut5.LJJJI("bundle_download_app_log_extra", logExtra, bundle);
        AwemeRawAd awemeRawAd3 = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd3 != null) {
            creativeIdStr = awemeRawAd3.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        C786410Ut5.LJJJI("aweme_creative_id", creativeIdStr, bundle);
        AwemeRawAd awemeRawAd4 = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd4 != null) {
            chargeType = awemeRawAd4.getChargeType();
        } else {
            chargeType = 0;
        }
        bundle.putInt("charge_type", chargeType);
        AwemeRawAd awemeRawAd5 = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd5 != null) {
            systemOrigin = awemeRawAd5.getSystemOrigin();
        }
        bundle.putInt("ad_system_origin", systemOrigin);
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 == null || (id = anchorCommonStruct2.getId()) == null) {
            id = "";
        }
        C786410Ut5.LJJJI("anchor_id", id, bundle);
        Map<String, String> mapLJIJ = LJIJ(c2344009Gk);
        if (mapLJIJ instanceof HashMap) {
            map = (HashMap) mapLJIJ;
        } else {
            map = null;
        }
        C786410Ut5.LJJIZ(bundle, "anchor_event_map", map);
        C786410Ut5.LJJJI("enter_from", LJIJJLI(), bundle);
        InterfaceC1392640mLO interfaceC1392640mLO5 = this.LL;
        if (interfaceC1392640mLO5 != null) {
            interfaceC1392640mLO2 = interfaceC1392640mLO5;
        }
        String aid2 = interfaceC1392640mLO2.LJJLIIIJJIZ().getAid();
        if (aid2 != null) {
            str = aid2;
        }
        C786410Ut5.LJJJI("from_group_id", str, bundle);
        C786410Ut5.LJJJI("detail_aweme_from", LJIJJLI(), bundle);
        if (uri.isHierarchical()) {
            C786410Ut5.LJJJI("bundle_origin_url", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fallback_url"), bundle);
            if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "async_layout"), "1")) {
                bundle.putBoolean("preset_safe_point", true);
                bundle.putInt("thread_strategy", EnumC665490Q8l.PART_ON_LAYOUT.id());
            }
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        n nVar = new n();
        nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(LJIILJJIL()) ? 1 : 0), "isRTL");
        nVar.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(LJIILJJIL())), "topSafeAreaHeight");
        builderBuildUpon.appendQueryParameter("lynx_landing_page_data", nVar.toString());
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(builderBuildUpon.toString());
        sparkContext.LJJJJL(bundle);
        sparkContext.LJJ(Bundle.class, bundle);
        sparkContext.LJJJZ("access_key", strLIZ);
        sparkContext.LJJ(AbstractC1076640e7i.class, new AbstractC1076640e7i() { // from class: X.0dp2
            @Override // X.AbstractC1076640e7i
            public final C1533560q0g LIZ(C1533560q0g c1533560q0g) {
                String str2 = strLIZ;
                C1533570q0h c1533570q0h = c1533560q0g.LIZIZ;
                if (c1533570q0h != null) {
                    c1533570q0h.LIZ = str2;
                }
                return c1533560q0g;
            }
        });
        C1541950qED.LIZJ.getClass();
        new C1541950qED(activityLIZIZ, sparkContext).LIZIZ();
    }

    @C14EU
    public final void onWebViewFinish(C585740MyC c585740MyC) {
        Map<String, String> mapLJ;
        if (this instanceof C19580511j9) {
            C2344009Gk c2344009GkLJJ = LJJ();
            c2344009GkLJJ.LIZLLL(c585740MyC.LIZ, "duration");
            C20684815ws.LJIILLIIL("anchor_stay_time", c2344009GkLJJ.LIZ);
        }
        C2344009Gk c2344009GkLJJ2 = LJJ();
        C2344009Gk c2344009Gk = this.LLJI;
        if (c2344009Gk == null || (mapLJ = c2344009Gk.LIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c2344009GkLJJ2.LJI(new HashMap(mapLJ));
        c2344009GkLJJ2.LIZLLL(c585740MyC.LIZ, "duration");
        C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009GkLJJ2.LIZ);
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            C1065000dow.LIZ(c2344009Gk, this.LLIZ);
            LJJLIIIJJI();
            LJJIJIIJI(c2344009Gk);
        }
        this.LLJ = true;
        if (LJJLIIIJJIZ()) {
            C15O7.LIZJ(new ACallableS246S0200000_16(this, new C1077200e8c(0), 3));
        }
        if (!this.LLJIJIL) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1431605j0(this, null), 3);
        }
        super.p1(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) throws Throwable {
        String string;
        String strSubType;
        boolean z;
        String schema;
        Object c098200Yq;
        String schema2;
        String strSubType2;
        Object c098200Yq2;
        String schema3;
        boolean z2;
        String strSubType3;
        if (!C04UD.LIZ()) {
            C1065000dow.LIZ(c2344009Gk, this.LLIZ);
            LJJIJIIJI(c2344009Gk);
        }
        if (!this.LLJ && LJJLIIIJJIZ()) {
            C15O7.LIZJ(new ACallableS246S0200000_16(this, new C1077200e8c(0), 3));
        }
        this.LLJI = c2344009Gk;
        LJJII(c2344009Gk, true, true);
        String str = "";
        if (LJJLIIIJJIZ()) {
            if (!((Boolean) C278150AvF.LIZIZ.getValue()).booleanValue()) {
                LJJLIIIJL(c2344009Gk);
                return;
            }
            Lemon8AnchorHelper lemon8AnchorHelper = Lemon8AnchorHelper.LIZ;
            String packageName = LJIILJJIL().getPackageName();
            String str2 = C1065200dpG.LIZ().marketUrl;
            lemon8AnchorHelper.getClass();
            Intent intentPutExtra = new Intent("android.intent.action.VIEW", UriProtector.parse(str2)).setPackage("com.android.vending").putExtra("overlay", true).putExtra("callerId", packageName);
            Activity activityLJIILJJIL = LJIILJJIL();
            if (!C786960Uty.LIZ(activityLJIILJJIL)) {
                Object[] objArr = (Object[]) C306960C1m.LIZIZ.getValue();
                AnchorCommonStruct anchorCommonStruct = this.LLIZ;
                if (anchorCommonStruct != null) {
                    strSubType2 = anchorCommonStruct.subType();
                } else {
                    strSubType2 = null;
                }
                if (C13LQ.LJIILLIIL(strSubType2, objArr)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[AbsLemon8AnchorMaker] canUseMiniCard: sub type: ");
                    AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
                    if (anchorCommonStruct2 != null) {
                        strSubType3 = anchorCommonStruct2.subType();
                    } else {
                        strSubType3 = null;
                    }
                    sbLIZ.append(strSubType3);
                    sbLIZ.append(" direct use landing page");
                    C2188811AlT.LIZIZ(sbLIZ);
                } else if (((Boolean) C0AMK.LIZ.getValue()).booleanValue() || type() != EnumC1430380nKG.LEMON8_ANCHOR.getTYPE()) {
                    try {
                        if (intentPutExtra.resolveActivity(activityLJIILJJIL.getPackageManager()) != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c098200Yq2 = Boolean.valueOf(z2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = bool;
                    }
                    if (!((Boolean) c098200Yq2).booleanValue()) {
                        AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
                        if (anchorCommonStruct3 == null || (schema3 = anchorCommonStruct3.getSchema()) == null) {
                            schema3 = "";
                        }
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(schema3), "vids");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
                        if (interfaceC1392640mLO == null) {
                            interfaceC1392640mLO = null;
                        }
                        String aid = interfaceC1392640mLO.LJJLIIIJJIZ().getAid();
                        if (aid == null) {
                            aid = "";
                        }
                        Lemon8AnchorHelper lemon8AnchorHelper2 = Lemon8AnchorHelper.LIZ;
                        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
                        if (interfaceC1392640mLO2 == null) {
                            interfaceC1392640mLO2 = null;
                        }
                        String aid2 = interfaceC1392640mLO2.LJJLIIIJJIZ().getAid();
                        if (aid2 == null) {
                            aid2 = "";
                        }
                        String strLJJIJL = LJJIJL();
                        String str3 = this.LLJILJIL;
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("tt_ab_version_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), new Pair("tt_group_id", aid));
                        AnchorCommonStruct anchorCommonStruct4 = this.LLIZ;
                        lemon8AnchorHelper2.getClass();
                        for (Map.Entry entry : Lemon8AnchorHelper.LIZIZ(anchorCommonStruct4).entrySet()) {
                            mapLJIIJ.put(entry.getKey(), entry.getValue());
                        }
                        Lemon8AnchorHelper.LIZJ("failure", aid2, strLJJIJL, str3, "no_capability", C08JS.LIZLLL(mapLJIIJ));
                    } else {
                        z = true;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (((Boolean) C279350AxB.LIZ.getValue()).booleanValue() && !C786960Uty.LIZ(LJIILJJIL())) {
                AnchorCommonStruct anchorCommonStruct5 = this.LLIZ;
                if (anchorCommonStruct5 == null || (schema2 = anchorCommonStruct5.getSchema()) == null) {
                    schema2 = "";
                }
                Uri uri = UriProtector.parse(schema2);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "campaign_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                String strLJJIL = LJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "vids");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
                if (interfaceC1392640mLO3 == null) {
                    interfaceC1392640mLO3 = null;
                }
                String aid3 = interfaceC1392640mLO3.LJJLIIIJJIZ().getAid();
                if (aid3 == null) {
                    aid3 = "";
                }
                C1065120dp8 c1065120dp8 = C1065120dp8.LIZ;
                Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("tt_ab_version_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3), new Pair("tt_group_id", aid3));
                Lemon8AnchorHelper lemon8AnchorHelper3 = Lemon8AnchorHelper.LIZ;
                AnchorCommonStruct anchorCommonStruct6 = this.LLIZ;
                lemon8AnchorHelper3.getClass();
                for (Map.Entry entry2 : Lemon8AnchorHelper.LIZIZ(anchorCommonStruct6).entrySet()) {
                    mapLJIIJ2.put(entry2.getKey(), entry2.getValue());
                }
                String strLJJIJIIJIL = LJJIJIIJIL(strLJJIL);
                if (strLJJIJIIJIL != null) {
                    mapLJIIJ2.put("redirect_url", strLJJIJIIJIL);
                }
                String strLIZLLL = C08JS.LIZLLL(mapLJIIJ2);
                c1065120dp8.getClass();
                C1065120dp8.LJ(strLJJIL, strLIZLLL);
            }
            if (z) {
                Activity activityLJIILJJIL2 = LJIILJJIL();
                AnchorCommonStruct anchorCommonStruct7 = this.LLIZ;
                if (anchorCommonStruct7 == null || (schema = anchorCommonStruct7.getSchema()) == null) {
                    schema = "";
                }
                Uri uri2 = UriProtector.parse(schema);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "vids");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "campaign_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
                }
                C1065070dp3 c1065070dp3 = new C1065070dp3(intentPutExtra);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
                if (interfaceC1392640mLO4 == null) {
                    interfaceC1392640mLO4 = null;
                }
                String aid4 = interfaceC1392640mLO4.LJJLIIIJJIZ().getAid();
                if (aid4 == null) {
                    aid4 = "";
                }
                String strLJJIL2 = LJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                linkedHashMap.put("enter_group_id", aid4);
                linkedHashMap.put("anchor_name", LJJIJL());
                String str4 = this.LLJILJIL;
                if (str4 != null) {
                    linkedHashMap.put("lemon8_pick_anchor_type", str4);
                }
                linkedHashMap.put("pid", strLJJIL2);
                Map mapLJIIJ3 = C2097608Jq.LJIIJ(new Pair("tt_ab_version_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4), new Pair("tt_group_id", aid4));
                Lemon8AnchorHelper lemon8AnchorHelper4 = Lemon8AnchorHelper.LIZ;
                AnchorCommonStruct anchorCommonStruct8 = this.LLIZ;
                lemon8AnchorHelper4.getClass();
                for (Map.Entry entry3 : Lemon8AnchorHelper.LIZIZ(anchorCommonStruct8).entrySet()) {
                    mapLJIIJ3.put(entry3.getKey(), entry3.getValue());
                }
                String strLJJIJIIJIL2 = LJJIJIIJIL(strLJJIL2);
                if (strLJJIJIIJIL2 != null) {
                    mapLJIIJ3.put("redirect_url", strLJJIJIIJIL2);
                }
                linkedHashMap.put("amp_extra", C08JS.LIZLLL(mapLJIIJ3));
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5.length() <= 0) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = null;
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                    linkedHashMap.put("deep_link_value", C1741890vQh.LJIIIIZZ(new Lemon8CampaignDeeplink(((Lemon8AnchorConfig) C1065020doy.LIZIZ.getValue()).campaignDeeplink.type, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)));
                }
                AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16(this, c2344009Gk, 66);
                String str5 = (String) linkedHashMap.get("pid");
                if (str5 == null) {
                    str5 = "tiktok_lemon8";
                }
                String str6 = (String) linkedHashMap.get("amp_extra");
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = (String) linkedHashMap.get("deep_link_value");
                if (str7 == null) {
                    str7 = "";
                }
                String strLIZJ = AnonymousClass1440.LIZJ();
                if (strLIZJ.length() <= 0) {
                    strLIZJ = null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (str6.length() > 0) {
                    linkedHashMap2.put("amp_extra", str6);
                }
                if (str7.length() > 0) {
                    linkedHashMap2.put("deep_link_value", str7);
                }
                String strLIZLLL2 = C08JS.LIZLLL(linkedHashMap2);
                Lemon8AnchorHelper.LIZ.getClass();
                ((Lemon8AnchorHelper.Lemon8AnchorImpressionReportApi) Lemon8AnchorHelper.LIZIZ.getValue()).reportAppsflyerClick(2, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), 1, C1065200dpG.LIZ().lemon8AppId, C1065200dpG.LIZ().lemon8AppName, str5, C1603330rpD.LIZIZ.LJI("other"), strLIZJ, strLIZLLL2).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LIZ(new InterfaceC19474811He<Unit>() { // from class: X.0dox
                    @Override // X.InterfaceC19474811He
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.InterfaceC19474811He
                    public final void onError(Throwable th2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[GpMiniCardOpenStrategy] reportS2SClickEvent: api onError ");
                        sbLIZ2.append(th2.getMessage());
                        Logger.e("Lemon8Anchor", C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    @Override // X.InterfaceC19474811He
                    public final /* bridge */ /* synthetic */ void onSuccess(Unit unit) {
                    }
                });
                String str8 = (String) linkedHashMap.get("enter_group_id");
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = (String) linkedHashMap.get("anchor_name");
                if (str9 != null) {
                    str = str9;
                }
                String str10 = (String) linkedHashMap.get("lemon8_pick_anchor_type");
                Intent intent = c1065070dp3.LIZ;
                C1065120dp8.LIZ.getClass();
                intent.setData(UriProtector.parse(C1065120dp8.LIZIZ(str5, str6, null, null)));
                try {
                    ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
                    if (iSandboxServiceLIZ != null) {
                        iSandboxServiceLIZ.appendDataFlowId(c1065070dp3.LIZ, 1207962113);
                    }
                    Intent intent2 = c1065070dp3.LIZ;
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLJIILJJIL2, intent2, "Activity_startActivityForResult_2");
                    C1701330uNH.LIZ(intent2, activityLJIILJJIL2);
                    C2204961BRm.LJIIZILJ(0, activityLJIILJJIL2, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatbpDAhHwJ3KjU3OgcYbswEgoc2yW2s5uZe3xn", null));
                    Lemon8AnchorHelper.LIZJ("success", str8, str, str10, null, str6);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    awS382S0200000_16.invoke(thM5exceptionOrNullimpl);
                    Lemon8AnchorHelper.LIZ.getClass();
                    Lemon8AnchorHelper.LIZJ("failure", str8, str, str10, "open_error", str6);
                    C2344809Gs.LJI(thM5exceptionOrNullimpl);
                    return;
                }
                return;
            }
            LJJLIIIJL(c2344009Gk);
            return;
        }
        InterfaceC1392640mLO interfaceC1392640mLO5 = null;
        AnchorCommonStruct anchorCommonStruct9 = this.LLIZ;
        if (anchorCommonStruct9 != null) {
            EventBus.LIZLLL().LJIJJ(this);
            String schema4 = anchorCommonStruct9.getSchema();
            if (schema4 == null) {
                string = "";
            } else {
                string = UriProtector.parse(schema4).buildUpon().appendQueryParameter("entrance_from", LJIJJLI()).build().toString();
            }
            InterfaceC1392640mLO interfaceC1392640mLO6 = this.LL;
            if (interfaceC1392640mLO6 == null) {
                interfaceC1392640mLO6 = null;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(interfaceC1392640mLO6.LIZIZ(), string);
            smartRouteBuildRoute.withParam("anchor_event_map", (HashMap) LJIJ(c2344009Gk));
            InterfaceC1392640mLO interfaceC1392640mLO7 = this.LL;
            if (interfaceC1392640mLO7 == null) {
                interfaceC1392640mLO7 = null;
            }
            String authorUid = AwemeExtKt.getAuthorUid(interfaceC1392640mLO7.LJJLIIIJJIZ());
            if (authorUid == null) {
                authorUid = "";
            }
            smartRouteBuildRoute.withParam("author_id", authorUid);
            InterfaceC1392640mLO interfaceC1392640mLO8 = this.LL;
            if (interfaceC1392640mLO8 == null) {
                interfaceC1392640mLO8 = null;
            }
            String aid5 = interfaceC1392640mLO8.LJJLIIIJJIZ().getAid();
            if (aid5 == null) {
                aid5 = "";
            }
            smartRouteBuildRoute.withParam("group_id", aid5);
            smartRouteBuildRoute.withParam("anchor_id", anchorCommonStruct9.getId());
            smartRouteBuildRoute.withParam("enter_from", LJIJJLI());
            InterfaceC1392640mLO interfaceC1392640mLO9 = this.LL;
            if (interfaceC1392640mLO9 != null) {
                interfaceC1392640mLO5 = interfaceC1392640mLO9;
            }
            String aid6 = interfaceC1392640mLO5.LJJLIIIJJIZ().getAid();
            if (aid6 == null) {
                aid6 = "";
            }
            smartRouteBuildRoute.withParam("from_group_id", aid6);
            smartRouteBuildRoute.withParam("previous_page", LJIJJLI());
            smartRouteBuildRoute.withParam("detail_aweme_from", LJIJJLI());
            AnchorCommonStruct anchorCommonStruct10 = this.LLIZ;
            if (anchorCommonStruct10 != null && (strSubType = anchorCommonStruct10.subType()) != null) {
                str = strSubType;
            }
            smartRouteBuildRoute.withParam("anchor_subtype", str);
            smartRouteBuildRoute.withParam("anchor_click_time", SystemClock.elapsedRealtime());
            smartRouteBuildRoute.open();
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        C1065000dow.LIZ(c2344009Gk, this.LLIZ);
        LJJIJIIJI(c2344009Gk);
        View viewLJJJJIZL = super.LJJJJIZL(viewGroup, dialog, c2344009Gk, i);
        if (!this.LLJIJIL) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1431605j0(this, null), 3);
        }
        return viewLJJJJIZL;
    }
}
