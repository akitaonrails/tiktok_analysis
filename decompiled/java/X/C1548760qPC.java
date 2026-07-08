package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AFwS308S0000000_23;
import kotlin.jvm.internal.AFwS344S0000000_23;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.AwS637S0100000_23;
import kotlin.jvm.internal.AwS672S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548760qPC implements InterfaceC1164530gPT {
    public boolean LL;
    public String LLILLJJLI;
    public int LLJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJI;
    public boolean LLJILJILJ;
    public final List<String> LLILLL = new ArrayList();
    public final ConcurrentHashMap<String, Long> LLILZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Long> LLILZIL = new ConcurrentHashMap<>();
    public final List<Integer> LLILZLL = new ArrayList();
    public final ConcurrentHashMap<String, Boolean> LLIZ = new ConcurrentHashMap<>();
    public String LLIZLLLIL = "";
    public final C1535030q33 LLJIJIL = new C1535030q33(AFwS263S0000000_23.get$arr$(41), new AwS602S0100000_23(this, 44), null);
    public final C1533060pzs LLJILJIL = new C1533060pzs(AFwS263S0000000_23.get$arr$(42), new AwS602S0100000_23(this, 45), null);

    public final void LIZLLL() {
        C1548750qPB c1548750qPB = C1548750qPB.LIZ;
        String str = this.LLIZLLLIL;
        c1548750qPB.getClass();
        ConcurrentSkipListSet<String> concurrentSkipListSet = C1548750qPB.LIZIZ.get(str);
        if (concurrentSkipListSet != null) {
            for (String str2 : concurrentSkipListSet) {
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1537060q6K.LIZIZ(str2, str, null);
            }
        }
        C1548750qPB.LIZIZ.remove(str);
        C1548750qPB.LIZJ.remove(str);
        C1537060q6K c1537060q6K2 = C1529590puH.LIZ;
        C1537060q6K.LJIILL(str);
        C1533030pzp.LIZ.LIZIZ(this.LLJILJIL);
        C1534490q2B.LIZ.remove(this.LLJIJIL);
        C1535030q33 c1535030q33 = this.LLJIJIL;
        if ((c1535030q33 instanceof InterfaceC1535230q3N) && c1535030q33 != null) {
            C1534490q2B.LIZIZ.remove(c1535030q33);
        }
        ((ArrayList) this.LLILLL).clear();
        this.LLIZ.clear();
        this.LLILZ.clear();
        ((ArrayList) this.LLILZLL).clear();
        this.LLILZIL.clear();
        AnonymousClass0378.LIZ().LIZJ("ec_page_lynx_show", this);
        this.LLJ = 0;
    }

    public static int LIZ(String str) {
        Integer num;
        int iIntValue = -1;
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "scene_data");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "{}";
            }
            Object obj = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).get("brick_name");
            if (!(obj instanceof Integer) || (num = (Integer) obj) == null) {
                return -1;
            }
            iIntValue = num.intValue();
            return iIntValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return iIntValue;
        }
    }

    public final void LIZIZ(int i) {
        if (!this.LLILZIL.contains(Integer.valueOf(i))) {
            this.LLILZIL.put(Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        long jLongValue;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int iIntValue = ((Integer) jSONObject.get("brick_name")).intValue();
            if (Intrinsics.LJFF((String) jSONObject.get("product_id"), this.LLILLJJLI) && Intrinsics.LJFF(str, "ec_page_lynx_show")) {
                if (!((ArrayList) this.LLILZLL).contains(Integer.valueOf(iIntValue))) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Long l = this.LLILZIL.get(Integer.valueOf(iIntValue));
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = -1;
                    }
                    ((ArrayList) this.LLILZLL).add(Integer.valueOf(iIntValue));
                    C1018703yb.LIZLLL("rd_tiktokec_pdp_lynx_interaction_dur", new C1548780qPE(jElapsedRealtime, jLongValue, iIntValue));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(InterfaceC1748810vbr interfaceC1748810vbr, InterfaceC1743450vTD interfaceC1743450vTD, String str) {
        if (this.LLJILJILJ) {
            return;
        }
        boolean z = true;
        this.LLJILJILJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ec_pdp");
        sbLIZ.append(interfaceC1748810vbr.hashCode());
        this.LLIZLLLIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI = str;
        new WeakReference(interfaceC1748810vbr);
        new WeakReference(interfaceC1743450vTD);
        C1548770qPD c1548770qPD = new C1548770qPD();
        if (C1279904zd.LIZ() == null || !(!r2.isEmpty())) {
            z = false;
        }
        c1548770qPD.LJIIL = z;
        c1548770qPD.LJIILIIL = this.LLIZLLLIL;
        c1548770qPD.LJIILJJIL = Integer.MAX_VALUE;
        c1548770qPD.LJ = "ec_pdp_lynx";
        Boolean bool = Boolean.TRUE;
        if ((bool instanceof String) || (bool instanceof Integer) || (bool instanceof Double) || (bool instanceof Boolean)) {
            c1548770qPD.LIZLLL.put("hide_loading", bool);
        }
        c1548770qPD.LJFF = new AwS602S0100000_23(this, 46);
        c1548770qPD.LJI = new AwS672S0100000_23(this, 2);
        c1548770qPD.LJII = new AwS637S0100000_23(this, 4);
        c1548770qPD.LJIIIIZZ = new C623120OcI(AFwS212S0000000_23.get$arr$(67), new AwS389S0200000_23(interfaceC1748810vbr, interfaceC1743450vTD, 17), AFwS263S0000000_23.get$arr$(24), AFwS308S0000000_23.get$arr$(2), AFwS344S0000000_23.get$arr$(1));
        C1548750qPB.LIZ.getClass();
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = c1548770qPD.LJIIL;
        c1097680efe.LIZ = c1548770qPD.LJIILIIL;
        c1097680efe.LJIJJLI = null;
        c1097680efe.LJIL = null;
        c1097680efe.LJIIIIZZ = c1548770qPD.LJIILL;
        c1097680efe.LJIJ = c1548770qPD.LJIILJJIL;
        String str2 = c1548770qPD.LJ;
        TemplateData templateData = c1548770qPD.LIZ;
        AnonymousClass0957<TemplateData> anonymousClass0957 = c1548770qPD.LIZIZ;
        C1538010q7r c1538010q7rLIZ = C1539460qAC.LIZ(templateData, null, null, str2, new LinkedHashMap(), c1548770qPD.LJFF, c1548770qPD.LJII, c1548770qPD.LJI, anonymousClass0957);
        c1097680efe.LJ = false;
        c1097680efe.LJIJJ = new C1548740qPA(c1548770qPD, c1097680efe, c1538010q7rLIZ);
        C1548750qPB.LIZJ.put(c1097680efe.LIZ, c1548770qPD);
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        C1533030pzp.LIZ.LIZ(this.LLJILJIL);
        C1534490q2B.LIZ.add(this.LLJIJIL);
        C1535030q33 c1535030q33 = this.LLJIJIL;
        if ((c1535030q33 instanceof InterfaceC1535230q3N) && c1535030q33 != null) {
            C1534490q2B.LIZIZ.add(c1535030q33);
        }
        AnonymousClass0378.LIZ().LIZLLL("ec_page_lynx_show", this);
    }
}
