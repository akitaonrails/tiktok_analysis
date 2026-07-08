package Y;

import X.AbstractC1552040qUU;
import X.C1029740cu4;
import X.C1043570dGN;
import X.C1043590dGP;
import X.C1056730dbb;
import X.C1247510iZJ;
import X.C1378370lyN;
import X.C1389700mGe;
import X.C1390850mIV;
import X.C15438062q;
import X.C1551950qUL;
import X.C1552050qUV;
import X.C1697810uHb;
import X.C19EG;
import X.C1C7U;
import X.C2188811AlT;
import X.C811103Ev;
import X.C844470XAv;
import X.DialogInterfaceOnCancelListenerC1077270e8j;
import X.InterfaceC1551300qTI;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS101S0201000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS6S1400000_16 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        final OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setChannelUpdatePriority(3);
        optionCheckUpdateParams.skipGeckoThreadPool(true);
        optionCheckUpdateParams.setFrom("commerce_ad_format");
        optionCheckUpdateParams.setListener((AbstractC1552040qUU) this.l1);
        if (C1043570dGN.LIZ().enable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getThrottleInterval(),interval = ");
            sbLIZ.append(C1043570dGN.LIZ().throttleInterval);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            C811103Ev.LIZ("AdHybridGeckoPreloadExt");
            long j = C1043570dGN.LIZ().throttleInterval;
            if (j > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("gecko_preload_status, params.throttleInterval = ");
                sbLIZ2.append(j);
                C2188811AlT.LIZIZ(sbLIZ2);
                C811103Ev.LIZ("AdHybridGeckoPreloadExt");
                optionCheckUpdateParams.setThrottleInterval(j);
            }
        } else {
            C811103Ev.LIZ("AdHybridGeckoPreloadExt");
        }
        C811103Ev.LIZ("AdHybridGeckoPreloadExt");
        String str = this.s0;
        final C1029740cu4 c1029740cu4 = (C1029740cu4) this.l3;
        final Map map = (Map) this.l4;
        C1551950qUL c1551950qULLJIILJJIL = C1552050qUV.LJIILJJIL(str, new InterfaceC1551300qTI() { // from class: X.0dGL
            @Override // X.InterfaceC1551300qTI
            public final void LIZ(String str2) {
                C1043590dGP c1043590dGP = C1043590dGP.LIZ;
                Integer numValueOf = Integer.valueOf(optionCheckUpdateParams.getChannelUpdatePriority());
                c1043590dGP.getClass();
                C1043590dGP.LIZJ(str2, C1043590dGP.LIZ(numValueOf), c1029740cu4, map);
            }
        });
        if (c1551950qULLJIILJJIL != null) {
            c1551950qULLJIILJJIL.LIZ(null, (Map) this.l2, optionCheckUpdateParams);
        }
        C1043590dGP c1043590dGP = C1043590dGP.LIZ;
        Integer numValueOf = Integer.valueOf(optionCheckUpdateParams.getChannelUpdatePriority());
        c1043590dGP.getClass();
        C1043590dGP.LIZLLL(C1043590dGP.LIZ(numValueOf), (C1029740cu4) this.l3, (Map) this.l4);
        C844470XAv.LIZ.getClass();
        C811103Ev.LIZIZ(C844470XAv.LIZ(), "gecko preload new");
    }

    public final void LIZ$1() throws JSONException {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        try {
            if (Intrinsics.LJFF(this.s0, "toast") || Intrinsics.LJFF(this.s0, "loading")) {
                try {
                    C1378370lyN.LIZ.getClass();
                    C1378370lyN.LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1056730dbb.LIZ();
            }
            List list = (List) this.l1;
            C1389700mGe c1389700mGe = (C1389700mGe) this.l3;
            Number number = (Number) this.l4;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZ = (String) obj;
                c1247510iZJ.LIZ(new AwS101S0201000_16(c1389700mGe, number, i, 4));
                arrayList.add(c1247510iZJ);
                i = i2;
            }
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJI(arrayList);
            c1390850mIV.LIZ.LL = new DialogInterfaceOnCancelListenerC1077270e8j((C1389700mGe) this.l3, (Number) this.l4, 1);
            TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
            Activity activity = (Activity) this.l2;
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
                tuxActionSheetLIZJ.show(supportFragmentManager, "minis_action_sheet");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", 2);
            jSONObject.put("error_msg", "cannot get FragmentManager");
            ((C1389700mGe) this.l3).LJ((Number) this.l4, jSONObject);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_code", 2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show action sheet failed: ");
            sbLIZ.append(e2.getMessage());
            jSONObject2.put("error_msg", C2188811AlT.LIZIZ(sbLIZ));
            ((C1389700mGe) this.l3).LJ((Number) this.l4, jSONObject2);
        }
    }

    public static final void run$0(ARunnableS6S1400000_16 aRunnableS6S1400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AdHybridGeckoPreloadUtil@80db.preloadInteraction$1");
        try {
            aRunnableS6S1400000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdHybridGeckoPreloadUtil@80db.preloadInteraction$1");
    }

    public static final void run$1(ARunnableS6S1400000_16 aRunnableS6S1400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ShowActionSheetMethodNative@779a.handle$4");
        try {
            aRunnableS6S1400000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShowActionSheetMethodNative@779a.handle$4");
    }

    public ARunnableS6S1400000_16(Object obj, Object obj2, String str, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj3;
        this.l3 = obj2;
        this.l4 = obj4;
    }
}
