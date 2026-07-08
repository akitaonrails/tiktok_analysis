package Y;

import X.C118300cf;
import X.C1770180wAK;
import X.C1770220wAO;
import X.C1770320wAY;
import X.C1770430wAj;
import X.C2097608Jq;
import X.C673020Qaa;
import X.C680790Qn7;
import X.C724240Sb0;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequencyParams;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssemV2;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public class ACListenerS1S3400000_26 implements View.OnClickListener {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS1S3400000_26 aCListenerS1S3400000_26, View view) {
        boolean zLIZLLL;
        String str;
        C1770320wAY c1770320wAY = C1770320wAY.LIZ;
        Map<String, Object> mapLJ = ((C1770220wAO) aCListenerS1S3400000_26.l3).LIZIZ.daParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Integer numValueOf = Integer.valueOf(((C118300cf) aCListenerS1S3400000_26.l4).element);
        TuxTextView tuxTextView = ((EcSearchNoCartFypBottomButtonAssemV2) aCListenerS1S3400000_26.l5).LLLF;
        if (tuxTextView != null) {
            C680790Qn7.LIZ.getClass();
            zLIZLLL = C680790Qn7.LIZLLL(tuxTextView);
        } else {
            zLIZLLL = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zLIZLLL);
        EcSearchNoCartFypBottomButtonAssemV2 ecSearchNoCartFypBottomButtonAssemV2 = (EcSearchNoCartFypBottomButtonAssemV2) aCListenerS1S3400000_26.l5;
        if (ecSearchNoCartFypBottomButtonAssemV2.LLJZ) {
            str = "promotion_image";
        } else {
            str = "normal";
        }
        String strBp = ecSearchNoCartFypBottomButtonAssemV2.Bp();
        c1770320wAY.getClass();
        C1770320wAY.LJIIJ(mapLJ, numValueOf, boolValueOf, str, strBp);
        ((EcSearchNoCartFypBottomButtonAssemV2) aCListenerS1S3400000_26.l5).LLLII = true;
        C1770430wAj.LL.getClass();
        C1770430wAj.LIZLLL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EcSearchNoCartFypBottomButtonAssemV2 ecSearchNoCartFypBottomButtonAssemV22 = (EcSearchNoCartFypBottomButtonAssemV2) aCListenerS1S3400000_26.l5;
        C1770180wAK c1770180wAK = C1770180wAK.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssemV22);
        c1770180wAK.getClass();
        String strLIZ = C1770180wAK.LIZ(fragmentLJI);
        if (strLIZ != null) {
            linkedHashMap.put("source_btm_token", strLIZ);
        }
        if (C1770180wAK.LJIIJJI((C1770220wAO) aCListenerS1S3400000_26.l3)) {
            EcSearchNoCartFypBottomButtonAssemV2 ecSearchNoCartFypBottomButtonAssemV23 = (EcSearchNoCartFypBottomButtonAssemV2) aCListenerS1S3400000_26.l5;
            C1770220wAO c1770220wAO = (C1770220wAO) aCListenerS1S3400000_26.l3;
            ecSearchNoCartFypBottomButtonAssemV23.getClass();
            C673020Qaa c673020Qaa = C673020Qaa.LIZ;
            Context context = ecSearchNoCartFypBottomButtonAssemV23.getContext();
            c673020Qaa.getClass();
            C673020Qaa.LIZ(context, c1770220wAO, linkedHashMap);
            return;
        }
        EcSearchNoCartFypBottomButtonAssemV2 ecSearchNoCartFypBottomButtonAssemV24 = (EcSearchNoCartFypBottomButtonAssemV2) aCListenerS1S3400000_26.l5;
        C1770220wAO c1770220wAO2 = (C1770220wAO) aCListenerS1S3400000_26.l3;
        String str2 = aCListenerS1S3400000_26.s0;
        String str3 = aCListenerS1S3400000_26.s1;
        String str4 = aCListenerS1S3400000_26.s2;
        Map map = (Map) aCListenerS1S3400000_26.l6;
        ecSearchNoCartFypBottomButtonAssemV24.getClass();
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.onClickMallEntry("homepage_hot", null);
        }
        String str5 = c1770220wAO2.LIZIZ.guideText;
        if (str5 == null) {
            str5 = "";
        }
        C1770320wAY.LJ(str5, str2, str3, ecSearchNoCartFypBottomButtonAssemV24.Bp(), map);
        C673020Qaa c673020Qaa2 = C673020Qaa.LIZ;
        Context context2 = ecSearchNoCartFypBottomButtonAssemV24.getContext();
        c673020Qaa2.getClass();
        C673020Qaa.LIZIZ(context2, c1770220wAO2, str2, str3, str4, linkedHashMap);
    }

    public static final void onClick$1(ACListenerS1S3400000_26 aCListenerS1S3400000_26, View view) {
        boolean zLIZLLL;
        String str;
        C1770320wAY c1770320wAY = C1770320wAY.LIZ;
        Map<String, Object> mapLJ = ((C1770220wAO) aCListenerS1S3400000_26.l3).LIZIZ.daParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Integer numValueOf = Integer.valueOf(((C118300cf) aCListenerS1S3400000_26.l4).element);
        TuxTextView tuxTextView = ((EcSearchNoCartFypBottomButtonAssem) aCListenerS1S3400000_26.l5).LLLLIL;
        if (tuxTextView != null) {
            C680790Qn7.LIZ.getClass();
            zLIZLLL = C680790Qn7.LIZLLL(tuxTextView);
        } else {
            zLIZLLL = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zLIZLLL);
        EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem = (EcSearchNoCartFypBottomButtonAssem) aCListenerS1S3400000_26.l5;
        if (ecSearchNoCartFypBottomButtonAssem.LLLILZJ) {
            str = "promotion_image";
        } else {
            str = "normal";
        }
        String strBp = ecSearchNoCartFypBottomButtonAssem.Bp();
        c1770320wAY.getClass();
        C1770320wAY.LJIIJ(mapLJ, numValueOf, boolValueOf, str, strBp);
        ((EcSearchNoCartFypBottomButtonAssem) aCListenerS1S3400000_26.l5).Ip().wQ2(new EcSearchFeedVideoGuideFrequencyParams(1, 2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem2 = (EcSearchNoCartFypBottomButtonAssem) aCListenerS1S3400000_26.l5;
        C1770180wAK c1770180wAK = C1770180wAK.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssem2);
        c1770180wAK.getClass();
        String strLIZ = C1770180wAK.LIZ(fragmentLJI);
        if (strLIZ != null) {
            linkedHashMap.put("source_btm_token", strLIZ);
        }
        if (C1770180wAK.LJIIJJI((C1770220wAO) aCListenerS1S3400000_26.l3)) {
            EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem3 = (EcSearchNoCartFypBottomButtonAssem) aCListenerS1S3400000_26.l5;
            C1770220wAO c1770220wAO = (C1770220wAO) aCListenerS1S3400000_26.l3;
            ecSearchNoCartFypBottomButtonAssem3.getClass();
            C673020Qaa c673020Qaa = C673020Qaa.LIZ;
            Context context = ecSearchNoCartFypBottomButtonAssem3.getContext();
            c673020Qaa.getClass();
            C673020Qaa.LIZ(context, c1770220wAO, linkedHashMap);
            return;
        }
        EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem4 = (EcSearchNoCartFypBottomButtonAssem) aCListenerS1S3400000_26.l5;
        C1770220wAO c1770220wAO2 = (C1770220wAO) aCListenerS1S3400000_26.l3;
        String str2 = aCListenerS1S3400000_26.s0;
        String str3 = aCListenerS1S3400000_26.s1;
        String str4 = aCListenerS1S3400000_26.s2;
        Map map = (Map) aCListenerS1S3400000_26.l6;
        ecSearchNoCartFypBottomButtonAssem4.getClass();
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.onClickMallEntry("homepage_hot", null);
        }
        String str5 = c1770220wAO2.LIZIZ.guideText;
        if (str5 == null) {
            str5 = "";
        }
        C1770320wAY.LJ(str5, str2, str3, ecSearchNoCartFypBottomButtonAssem4.Bp(), map);
        C673020Qaa c673020Qaa2 = C673020Qaa.LIZ;
        Context context2 = ecSearchNoCartFypBottomButtonAssem4.getContext();
        c673020Qaa2.getClass();
        C673020Qaa.LIZIZ(context2, c1770220wAO2, str2, str3, str4, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS1S3400000_26(Object obj, C1770220wAO c1770220wAO, C118300cf c118300cf, EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem, String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.$t = map;
        this.l3 = obj;
        this.l4 = c1770220wAO;
        this.l5 = c118300cf;
        this.s0 = ecSearchNoCartFypBottomButtonAssem;
        this.s1 = str;
        this.s2 = str2;
        this.l6 = str3;
    }
}
