package X;

import Y.ALAdapterS11S0200000_16;
import Y.ARunnableS27S0101000_16;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AnoleAutomationParamModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import defpackage.b;
import defpackage.c;
import defpackage.d;
import defpackage.h0;
import defpackage.i0;
import defpackage.j0;
import defpackage.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS12S2300000_35;
import kotlin.jvm.internal.AwS145S0400000_16;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.AwS29S2200000_35;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS5S0200200_16;
import kotlin.jvm.internal.AwS68S0210000_16;
import kotlin.jvm.internal.AwS6S3400000_35;
import kotlin.jvm.internal.AwS7S3300000_35;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014730cVr extends AbstractC1014240cV4 implements InterfaceC1051190dSf {
    public static final Map<String, Integer> LLLLII = new LinkedHashMap();
    public static final Map<Integer, C1015050cWN> LLLLIIIILLL = new LinkedHashMap();
    public static long LLLLIIL;
    public static long LLLLIILL;
    public static long LLLLIILLL;
    public AbstractC1014890cW7 LLJLIL;
    public String LLJLILLLLZIIL;
    public AbstractC1014880cW6 LLJLL;
    public long LLJLLIL;
    public long LLJLLL;
    public final String LLJZ;
    public AbstractC1028360crq LLJZIJLIL;
    public final ConcurrentLinkedQueue<C1014710cVp> LLL;
    public volatile boolean LLLF;
    public final C01GW LLLFF;
    public boolean LLLFFI;
    public volatile boolean LLLFZ;
    public String LLLI;
    public String LLLII;
    public boolean LLLIIII;
    public List<? extends Number> LLLIIIIL;
    public Function1<? super Boolean, Unit> LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public final C01GW LLLIL;
    public boolean LLLILZ;
    public final C01GW LLLILZJ;
    public boolean LLLILZLLLI;
    public EnumC1539690qAZ LLLIZZ;
    public boolean LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIILL() {
    }

    public final void LJJIIJ() {
        C1008080cL8 c1008080cL8C3;
        Activity activity;
        String string;
        String str;
        if (this.LLJJIJIL != null) {
            return;
        }
        if (((Boolean) C04RW.LIZ.getValue()).booleanValue() && this.LLLFZ) {
            return;
        }
        InterfaceC1014900cW8 interfaceC1014900cW8LJJII = LJJII();
        if (interfaceC1014900cW8LJJII != null) {
            interfaceC1014900cW8LJJII.o3();
        }
        String lynxSchema = this.LL.getLynxSchema();
        if (lynxSchema == null || (c1008080cL8C3 = this.LLILLL.c3()) == null || (activity = getActivity()) == null) {
            return;
        }
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        Long creativeId = this.LLILLJJLI.LIZLLL.getCreativeId();
        if (creativeId == null || (string = creativeId.toString()) == null) {
            string = "";
        }
        String str2 = this.LL.type;
        c1015400cWw.getClass();
        C1015400cWw.LIZ(string, str2).isFallBackRendering = !Intrinsics.LJFF(this.LLJLL, C1014990cWH.LIZ) ? "1" : CardStruct.IStatusCode.DEFAULT;
        C1009340cNA c1009340cNA = this.LLILLJJLI;
        C1051290dSp c1051290dSpLIZLLL = C1009360cNC.LIZLLL(this, c1009340cNA.LIZ, c1009340cNA.LIZLLL.getRit(), lynxSchema, c1008080cL8C3, !C1017180cZo.LJJI(this.LLILLJJLI.LIZLLL));
        AbstractC1028360crq abstractC1028360crqLIZLLL = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(C1009360cNC.LIZJ(this, (C19EG) activity), c1051290dSpLIZLLL);
        this.LLJZIJLIL = abstractC1028360crqLIZLLL;
        C1014740cVs.LIZJ(this, false, this.LL, this.LLILLJJLI, Boolean.valueOf(abstractC1028360crqLIZLLL == null));
        AbstractC1028360crq abstractC1028360crq = this.LLJZIJLIL;
        String str3 = null;
        if (abstractC1028360crq != null) {
            this.LLLFZ = true;
            abstractC1028360crq.LJJ(c1051290dSpLIZLLL, this, null);
        }
        C1015310cWn c1015310cWnLJIIIZ = LJIIIZ();
        AnoleComponentModel anoleComponentModel = this.LL;
        c1015310cWnLJIIIZ.getClass();
        if (C298290Bmd.LIZ()) {
            C1014250cV5.LIZ.getClass();
            C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
            if (c1014490cVTLIZ != null) {
                str = c1014490cVTLIZ.LIZ;
                str3 = c1014490cVTLIZ.LIZIZ;
            } else {
                str = null;
            }
            C2275901E6i.LIZ.getClass();
            c1015310cWnLJIIIZ.logAd(C2275901E6i.LIZJ, new AwS29S2200000_35(anoleComponentModel, c1015310cWnLJIIIZ, str, str3, 3));
        }
        C1014720cVq c1014720cVq = C1014720cVq.LIZ;
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 756);
        c1014720cVq.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("anole_send_event_after_render", true)) {
            awS560S0100000_16.invoke();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("render， getFeStatus: ");
        sbLIZ.append(LJJIFFI());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Jk() {
        /*
            r3 = this;
            java.util.Map<java.lang.Integer, X.0cWN> r1 = X.C1014730cVr.LLLLIIIILLL
            int r0 = r3.LJJI()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r2 = r1.get(r0)
            X.0cWN r2 = (X.C1015050cWN) r2
            if (r2 == 0) goto L37
            java.lang.String r1 = r2.LIZ
        L16:
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = r3.LL
            java.lang.String r0 = r0.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L35
            int r0 = r2.LIZIZ
            r2 = 1
            if (r0 != r2) goto L35
        L25:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isPrerenderReady: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            return r2
        L35:
            r2 = 0
            goto L25
        L37:
            r1 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1014730cVr.Jk():boolean");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJFF() {
        C1022620cia.LJ(this.LLJZ, "releasePanel");
        C622680Oba.LIZLLL(this);
        clear();
    }

    public final C1015290cWl LJJ() {
        return (C1015290cWl) this.LLLFF.getValue();
    }

    public final int LJJIFFI() {
        Integer num;
        String str = this.LLLII;
        if (str == null || (num = (Integer) ((LinkedHashMap) LLLLII).get(str)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public final InterfaceC1014900cW8 LJJII() {
        return (InterfaceC1014900cW8) this.LLLJL.getValue();
    }

    public final void LJJIII() {
        List<? extends Number> list;
        try {
            if (this.LLLIIII && (list = this.LLLIIIIL) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<? extends Number> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(it2.next().intValue()));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RegisterPlayback JSB timeList:");
                sbLIZ.append(arrayList);
                C2188811AlT.LIZIZ(sbLIZ);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    int iIntValue = ((Number) it3.next()).intValue();
                    this.LLILLL.a3("JSB_" + this.LL.getID() + '_' + iIntValue, new ARunnableS27S0101000_16(iIntValue, this, 16), iIntValue);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (((Boolean) C0AR2.LIZ.getValue()).booleanValue()) {
                String tag = this.LL.getTag();
                if (tag == null) {
                    tag = "anole_ad";
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(tag, "anole_playback_exception", this.LLILLJJLI.LIZLLL);
                c1022820ciuLIZLLL.LIZJ(this.LL.getRefer(), "refer");
                c1022820ciuLIZLLL.LIZIZ(e.getMessage(), "exception_message");
                c1022820ciuLIZLLL.LIZIZ(Long.valueOf(this.LL.getID()), "component_id");
                AnoleModel anoleModel = this.LLILLJJLI.LIZLLL.getAnoleModel();
                c1022820ciuLIZLLL.LIZIZ(anoleModel != null ? Long.valueOf(anoleModel.templateID) : null, "template_id");
                c1022820ciuLIZLLL.LIZIZ(this.LL.type, "component_type");
                c1022820ciuLIZLLL.LJII();
            }
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void clear() {
        String str = this.LLLII;
        if (str != null) {
            LLLLII.remove(str);
        }
        LLLLIIIILLL.remove(Integer.valueOf(LJJI()));
        this.LLLFFI = false;
        LJIJJLI();
        this.LLLFZ = false;
        this.LLLJ = false;
        this.LLJJIJIL = null;
        this.LLLII = null;
        this.LLJLL = C1014970cWF.LIZ;
        this.LLJLLIL = 0L;
        this.LLJLLL = 0L;
        AbstractC1028360crq abstractC1028360crq = this.LLJZIJLIL;
        if (abstractC1028360crq != null) {
            int rit = this.LLILLJJLI.LIZLLL.getRit();
            String str2 = this.LLILLJJLI.LIZ;
            String str3 = this.LL.type;
            C1008080cL8 c1008080cL8C3 = this.LLILLL.c3();
            abstractC1028360crq.LJIL(C1009370cND.LIZ(rit, str2, str3, c1008080cL8C3 != null ? c1008080cL8C3.LJ : null));
        }
        this.LLLILZ = false;
        if (((Boolean) C288730BTj.LIZIZ.getValue()).booleanValue()) {
            this.LLJZIJLIL = null;
            this.LLLF = true;
            this.LLL.clear();
        }
        String str4 = this.LLJZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseCache ");
        sbLIZ.append(hashCode());
        C1022620cia.LJ(str4, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return (this.LLLFFI || !((Boolean) this.LLLIL.getValue()).booleanValue() || this.LLLIIL) ? !this.LLLFFI ? new C1014500cVU(false, "data_load_fail") : (((Boolean) C283960BBa.LIZ.getValue()).booleanValue() && this.LL.useLynxSSR && this.LLLJ) ? new C1014500cVU(true, null) : LJJIFFI() != 1 ? new C1014500cVU(false, "load_timeout") : new C1014500cVU(true, null) : new C1014500cVU(false, "initial_fail");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        C1014700cVo.LIZ(this, "disappear", new JSONObject());
        InterfaceC1014900cW8 interfaceC1014900cW8LJJII = LJJII();
        if (interfaceC1014900cW8LJJII != null) {
            interfaceC1014900cW8LJJII.n3();
        }
        C622680Oba.LIZLLL(this);
        String str = this.LLJZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hostDidDisappear ");
        sbLIZ.append(hashCode());
        C1022620cia.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
        this.LLLF = false;
        C622680Oba.LIZJ(this);
        C1014700cVo.LIZ(this, "appear", new JSONObject());
        String str = this.LLJZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hostWillAppear ");
        sbLIZ.append(hashCode());
        C1022620cia.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        C622680Oba.LIZLLL(this);
        super.LJ();
        if (Intrinsics.LJFF(this.LL.getRenderStrategy(), "now_render") || Intrinsics.LJFF(this.LL.getRenderStrategy(), "prerender_play_progress")) {
            clear();
        }
        InterfaceC1014900cW8 interfaceC1014900cW8LJJII = LJJII();
        if (interfaceC1014900cW8LJJII != null) {
            interfaceC1014900cW8LJJII.LIZ();
        }
        String str = this.LLJZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unmount ");
        sbLIZ.append(hashCode());
        C1022620cia.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIJI() {
        super.LJIJI();
        this.LLLIIII = false;
        this.LLLIIIIL = null;
    }

    public final int LJJI() {
        int iHashCode = hashCode();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getComponentHashcode() = ");
        sbLIZ.append(iHashCode);
        C2188811AlT.LIZIZ(sbLIZ);
        return iHashCode;
    }

    @Override // X.InterfaceC1051190dSf
    public final void A9(C1014910cW9 c1014910cW9) {
        boolean z;
        this.LLLFZ = false;
        if (c1014910cW9.LIZIZ == EnumC2008907tv.STATUS_LOAD_SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        this.LLLFFI = z;
        LJIJJLI();
        this.LLJJIJIL = c1014910cW9.LIZ;
        this.LLLII = c1014910cW9.LIZJ;
        this.LLLILZLLLI = c1014910cW9.LIZLLL;
        Function1<? super Boolean, Unit> function1 = this.LLLIIIL;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        View view = this.LLJJIJIL;
        if (view != null && this.LL.isInteractionDisabled()) {
            view.setClickable(false);
            view.setLongClickable(false);
            view.setEnabled(false);
            view.setFocusable(false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onLoadSuccess]，contentView hashCode: ");
        sbLIZ.append(c1014910cW9.LIZ.hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C301090Br9.LIZIZ(new AwS417S0200000_16(this, c1014910cW9, 70));
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
        C1008080cL8 c1008080cL8C3;
        this.LLLF = false;
        C622680Oba.LIZJ(this);
        this.LLLIIIL = function1;
        this.LLLIIL = true;
        C1014740cVs.LIZJ(this, true, this.LL, this.LLILLJJLI, null);
        InterfaceC1014900cW8 interfaceC1014900cW8LJJII = LJJII();
        if (interfaceC1014900cW8LJJII != null) {
            interfaceC1014900cW8LJJII.p3();
        }
        Activity activity = getActivity();
        InterfaceC1028390crt interfaceC1028390crt = new InterfaceC1028390crt() { // from class: X.0cVt
            @Override // X.InterfaceC1028390crt
            public final void LIZLLL(C1014910cW9 c1014910cW9) {
                boolean z;
                C1014730cVr c1014730cVr = this.LIZ;
                if (c1014910cW9.LIZIZ == EnumC2008907tv.STATUS_LOAD_SUCCESS) {
                    z = true;
                } else {
                    z = false;
                }
                c1014730cVr.LLLILZ = z;
            }

            @Override // X.InterfaceC1028390crt
            public final void LJ(String str, String str2) {
                C1014730cVr c1014730cVr = this.LIZ;
                c1014730cVr.LLLILZ = false;
                c1014730cVr.LLJLL = C1014960cWE.LIZ;
                InterfaceC1014900cW8 interfaceC1014900cW8LJJII2 = c1014730cVr.LJJII();
                if (interfaceC1014900cW8LJJII2 != null) {
                    interfaceC1014900cW8LJJII2.k3(this.LIZ.isReady().LIZIZ, EnumC1014820cW0.HYBRID.getValue());
                }
                C1014730cVr c1014730cVr2 = this.LIZ;
                C1014740cVs.LIZIZ(c1014730cVr2, false, "hybrid_", str, c1014730cVr2.LL, c1014730cVr2.LLILLJJLI, null);
            }
        };
        String lynxSchema = this.LL.getLynxSchema();
        if (lynxSchema != null && (c1008080cL8C3 = this.LLILLL.c3()) != null && activity != null) {
            IAdHybridContainerManager iAdHybridContainerManager = (IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class);
            C1028380crs c1028380crsLIZJ = C1009360cNC.LIZJ(this, (C19EG) activity);
            C1009340cNA c1009340cNA = this.LLILLJJLI;
            iAdHybridContainerManager.LIZIZ(c1028380crsLIZJ, C1009360cNC.LIZLLL(this, c1009340cNA.LIZ, c1009340cNA.LIZLLL.getRit(), lynxSchema, c1008080cL8C3, !C1017180cZo.LJJI(this.LLILLJJLI.LIZLLL)), interfaceC1028390crt);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prerender， feStatusMap = ");
        sbLIZ.append(LLLLII);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LLJZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("prerender ");
        sbLIZ2.append(hashCode());
        C1022620cia.LJ(str, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) throws JSONException {
        String str;
        C1015060cWO c1015060cWOLJIIJ;
        super.LJII(anoleComponentAppearModel);
        AbstractC1028360crq abstractC1028360crq = this.LLJZIJLIL;
        if (abstractC1028360crq != null) {
            abstractC1028360crq.LJIILJJIL();
        }
        InterfaceC1014900cW8 interfaceC1014900cW8LJJII = LJJII();
        if (interfaceC1014900cW8LJJII != null) {
            interfaceC1014900cW8LJJII.m3();
        }
        JSONObject jSONObject = new JSONObject();
        String str2 = anoleComponentAppearModel.type;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.putOpt("showtype", str2);
        jSONObject.putOpt("playOrder", Long.valueOf(this.LLILLL.LJJLIL()));
        C1014700cVo.LIZ(this, "show", jSONObject);
        if (C1014860cW4.LIZJ) {
            if (!Intrinsics.LJFF(this.LL.getRenderStrategy(), "now_render")) {
                AbstractC1023360cjm abstractC1023360cjm = (AbstractC1023360cjm) this.LLLJIL.getValue();
                AnoleComponentModel anoleComponentModel = this.LL;
                boolean z = this.LLLILZLLLI;
                C0WOV c0wov = (C0WOV) this.LLLILZJ.getValue();
                abstractC1023360cjm.getClass();
                C1015020cWK.LIZ.getClass();
                abstractC1023360cjm.logAd(C1015020cWK.LIZIZ, new AwS68S0210000_16(anoleComponentModel, z, c0wov, 1));
            }
            AbstractC1028360crq abstractC1028360crq2 = this.LLJZIJLIL;
            if (abstractC1028360crq2 != null && (c1015060cWOLJIIJ = abstractC1028360crq2.LJIIJ()) != null) {
                AbstractC1023360cjm abstractC1023360cjm2 = (AbstractC1023360cjm) this.LLLJIL.getValue();
                AnoleComponentModel anoleComponentModel2 = this.LL;
                C0WOV c0wov2 = (C0WOV) this.LLLILZJ.getValue();
                long j = c1015060cWOLJIIJ.LIZ;
                long j2 = c1015060cWOLJIIJ.LIZIZ;
                abstractC1023360cjm2.getClass();
                C1015020cWK.LIZ.getClass();
                abstractC1023360cjm2.logAd(C1015020cWK.LIZJ, new AwS5S0200200_16(anoleComponentModel2, c0wov2, j, j2, 1));
            }
        }
        C1015310cWn c1015310cWnLJIIIZ = LJIIIZ();
        AnoleComponentModel anoleComponentModel3 = this.LL;
        boolean z2 = this.LLLIILIL;
        String str3 = this.LLJILLL;
        c1015310cWnLJIIIZ.getClass();
        try {
            if (((Boolean) C0B02.LIZ.getValue()).booleanValue()) {
                C1014250cV5.LIZ.getClass();
                C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel3);
                String str4 = null;
                if (c1014490cVTLIZ != null) {
                    str4 = c1014490cVTLIZ.LIZ;
                    str = c1014490cVTLIZ.LIZIZ;
                } else {
                    str = null;
                }
                C2275901E6i.LIZ.getClass();
                c1015310cWnLJIIIZ.logAd(C2275901E6i.LJFF, new C2275961E6o(anoleComponentModel3, c1015310cWnLJIIIZ, z2, str3, str4, str));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        if (r12.equals("content_view_empty") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        if (r12.equals("data_load_fail") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r1 = r11.LLJZIJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r1.LJIILIIL("data_load_fail", r11.LLLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        r2 = new kotlin.Pair[3];
        r2[0] = new kotlin.Pair("failed_detail_reason", r11.LLLI);
        r2[1] = new kotlin.Pair("prerender_failed_strategy", r11.LL.prerenderFailedStrategy);
        r0 = r11.LLLIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        r5 = java.lang.Integer.valueOf(r0.getRenderState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        r2[2] = new kotlin.Pair("lynx_ssr_status", r5);
        LJJIIJZLJL(r12, X.C2097608Jq.LJIIIIZZ(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        if (r11.LLJZIJLIL == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (getActivity() == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010b, code lost:
    
        if (r11.LLJJIJIL == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010d, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        if (r11.LL.getLynxSchema() == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0116, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011d, code lost:
    
        if (r11.LLILLL.c3() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011f, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0121, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0123, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0125, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0136, code lost:
    
        if (X.C0C64.LJIILLIIL().LJIIIZ(31744, "debug_event_log_enable", true, false) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
    
        r2 = X.C2184171Adz.LIZLLL("anole_ad", "format_show_failed_cause_gecko_empty", r11.LLILLJJLI.LIZLLL);
        r2.LIZIZ(java.lang.Integer.valueOf(r9), "container_status");
        r2.LIZIZ(java.lang.Integer.valueOf(r6), "activity_status");
        r2.LIZIZ(java.lang.Integer.valueOf(r5), "content_status");
        r2.LIZIZ(java.lang.Integer.valueOf(r4), "lynx_schema_status");
        r2.LIZIZ(java.lang.Integer.valueOf(r3), "hybrid_config_status");
        r2.LIZIZ(r11.LL.type, "component_type");
        r2.LJII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0198, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0199, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // X.AbstractC1014240cV4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1014730cVr.LJIIIIZZ(java.lang.String):void");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) throws JSONException {
        Object obj;
        C0TPB c0tpbLJJJJJ;
        Object objOpt;
        JSONObject jSONObject;
        Object objOpt2;
        Object objOpt3;
        Map<String, ? extends Object> map;
        String str;
        if (abstractC1003980cEW instanceof C1003190cDF) {
            C1014700cVo.LIZ(this, "start", new JSONObject());
            return;
        }
        if (abstractC1003980cEW instanceof C1003180cDE) {
            C1014700cVo.LIZ(this, "resume", new JSONObject());
            return;
        }
        if (abstractC1003980cEW instanceof C1003170cDD) {
            C1014700cVo.LIZ(this, "pause", new JSONObject());
            return;
        }
        if (abstractC1003980cEW instanceof C1003230cDJ) {
            C1014700cVo.LIZ(this, "restart", new JSONObject());
            return;
        }
        if (abstractC1003980cEW instanceof C1005130cGN) {
            this.LLLIIII = true;
            LJJIII();
            return;
        }
        if (abstractC1003980cEW instanceof C1004030cEb) {
            C691740RBk.LIZ();
            LJJIIJ();
            return;
        }
        String str2 = null;
        if (abstractC1003980cEW instanceof C1004000cEY) {
            C691740RBk.LIZ();
            C1015310cWn c1015310cWnLJIIIZ = LJIIIZ();
            AnoleComponentModel anoleComponentModel = this.LL;
            c1015310cWnLJIIIZ.getClass();
            if (!C298290Bmd.LIZ()) {
                return;
            }
            C1014250cV5.LIZ.getClass();
            C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
            if (c1014490cVTLIZ != null) {
                str = c1014490cVTLIZ.LIZ;
                str2 = c1014490cVTLIZ.LIZIZ;
            } else {
                str = null;
            }
            C2275901E6i.LIZ.getClass();
            c1015310cWnLJIIIZ.logAd(C2275901E6i.LJ, new AwS29S2200000_35(anoleComponentModel, c1015310cWnLJIIIZ, str, str2, 5));
            return;
        }
        if (abstractC1003980cEW instanceof C991290bu3) {
            InterfaceC1014340cVE interfaceC1014340cVE = this.LLJJJJ;
            if (interfaceC1014340cVE == null) {
                return;
            }
            interfaceC1014340cVE.LJFF(((C991290bu3) abstractC1003980cEW).LIZ);
            return;
        }
        if (abstractC1003980cEW instanceof C1004040cEc) {
            C1014700cVo.LIZ(this, "shake", new JSONObject());
            return;
        }
        if (abstractC1003980cEW instanceof C991240bty) {
            C991240bty c991240bty = (C991240bty) abstractC1003980cEW;
            JSONObject jSONObject2 = c991240bty.LIZ;
            if (jSONObject2 == null || !jSONObject2.has("update_lynx_global_props") || (objOpt = jSONObject2.opt("update_lynx_global_props_data")) == null || (((objOpt2 = (jSONObject = (JSONObject) objOpt).opt("component_type")) != null && !Intrinsics.LJFF(objOpt2, this.LL.type)) || (objOpt3 = jSONObject.opt("updated_data")) == null || !(objOpt3 instanceof Map) || (map = (Map) objOpt3) == null)) {
                C1014700cVo.LIZ(this, "businessCustomized", c991240bty.LIZ);
                return;
            }
            AbstractC1028360crq abstractC1028360crq = this.LLJZIJLIL;
            if (abstractC1028360crq != null) {
                abstractC1028360crq.LJJIIJ(map);
                return;
            }
            return;
        }
        if (abstractC1003980cEW instanceof C991320bu6) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("userInteractType", ((C991320bu6) abstractC1003980cEW).LIZ);
            C1014700cVo.LIZ(this, "userInteract", jSONObject3);
            return;
        }
        if (abstractC1003980cEW instanceof C991730bul) {
            JSONObject jSONObject4 = new JSONObject();
            C991730bul c991730bul = (C991730bul) abstractC1003980cEW;
            jSONObject4.putOpt("visible", Boolean.valueOf(c991730bul.LIZ));
            C1014700cVo.LIZ(this, "hostVisibilityChanged", jSONObject4);
            this.LLLIILIL = c991730bul.LIZ;
            return;
        }
        if (!(abstractC1003980cEW instanceof C991260bu0)) {
            return;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("prerender_failed_strategy", this.LL.prerenderFailedStrategy));
        String str3 = "data_load_fail";
        if (!this.LLLILZ) {
            obj = "data_load_fail";
        } else {
            obj = "load_timeout";
        }
        mapLJIIJ.put("failed_detail_reason", obj);
        mapLJIIJ.putAll(((C991260bu0) abstractC1003980cEW).LIZ);
        C1014650cVj.LIZ(this, "be_removed", mapLJIIJ);
        if (!Intrinsics.LJFF(this.LL.type, "ttplus_card") || (c0tpbLJJJJJ = ComplianceServiceProvider.LJIILIIL().LJJJJJ()) == null) {
            return;
        }
        if (this.LLLILZ) {
            str3 = "load_timeout";
        }
        c0tpbLJJJJJ.LIZIZ(str3);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Nk(AnoleComponentAppearModel anoleComponentAppearModel) {
        if (((Boolean) C0BBT.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(this.LL.getRenderStrategy(), "now_render_when_show")) {
            LJJIIJ();
        }
        super.Nk(anoleComponentAppearModel);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void anoleJSBEvent(C1641406bk c1641406bk) {
        Object c098200Yq;
        ViewGroup viewGroup;
        View view;
        AnimatorSet animatorSetLIZJ;
        String string;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        String str7;
        Integer num2;
        AwemeRawAd awemeRawAd;
        String str8;
        String str9;
        String str10;
        Integer num3;
        AwemeRawAd awemeRawAd2;
        String str11;
        String str12;
        String str13;
        AwemeRawAd awemeRawAd3;
        String str14;
        String str15;
        AwemeRawAd awemeRawAd4;
        String str16;
        String str17;
        AwemeRawAd awemeRawAd5;
        String str18;
        String str19;
        String str20;
        AwemeRawAd awemeRawAd6;
        String str21;
        String str22;
        AwemeRawAd awemeRawAd7;
        String str23;
        String str24;
        String str25;
        Boolean bool;
        String str26;
        Map<String, Object> mapLIZ;
        String str27;
        if (c1641406bk.LIZJ instanceof c.a) {
            C1015050cWN c1015050cWN = (C1015050cWN) ((LinkedHashMap) LLLLIIIILLL).get(Integer.valueOf(LJJI()));
            if (c1015050cWN != null) {
                str26 = c1015050cWN.LIZ;
            } else {
                str26 = null;
            }
            if (!Intrinsics.LJFF(str26, this.LL.type)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recordLynxComponentRenderStamp() error cause componentType mismatch, return ,jsb type = ");
                if (c1015050cWN != null) {
                    str27 = c1015050cWN.LIZ;
                } else {
                    str27 = null;
                }
                sbLIZ.append(str27);
                sbLIZ.append(",current type = ");
                sbLIZ.append(this.LL.type);
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                int i = c1015050cWN.LIZIZ;
                boolean z = true;
                if (i == 1) {
                    this.LLJLL = C1014990cWH.LIZ;
                    InterfaceC1014900cW8 interfaceC1014900cW8LJJII = LJJII();
                    if (interfaceC1014900cW8LJJII != null) {
                        interfaceC1014900cW8LJJII.onLoadSuccess(EnumC1014820cW0.JSB.getValue());
                    }
                } else {
                    z = false;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("recordLynxComponentRenderStamp() failed,renderDetailFailedReason = ");
                    sbLIZ2.append(LJJIFFI());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    this.LLJLL = C1014960cWE.LIZ;
                    InterfaceC1014900cW8 interfaceC1014900cW8LJJII2 = LJJII();
                    if (interfaceC1014900cW8LJJII2 != null) {
                        interfaceC1014900cW8LJJII2.k3(isReady().LIZIZ, EnumC1014820cW0.JSB.getValue());
                    }
                }
                String strValueOf = String.valueOf(i);
                AnoleComponentModel anoleComponentModel = this.LL;
                C1009340cNA c1009340cNA = this.LLILLJJLI;
                InterfaceC1014900cW8 interfaceC1014900cW8LJJII3 = LJJII();
                if (interfaceC1014900cW8LJJII3 != null) {
                    mapLIZ = C1014770cVv.LIZ(interfaceC1014900cW8LJJII3);
                } else {
                    mapLIZ = null;
                }
                C1014740cVs.LIZIZ(this, z, "JSB_", strValueOf, anoleComponentModel, c1009340cNA, mapLIZ);
            }
        }
        XBaseParamModel xBaseParamModel = c1641406bk.LIZJ;
        if (xBaseParamModel instanceof InterfaceC1641206bi) {
            ((InterfaceC1641206bi) xBaseParamModel).getBusiness();
            ((InterfaceC1641206bi) c1641406bk.LIZJ).getScene();
            String scenario = ((InterfaceC1641206bi) c1641406bk.LIZJ).getScenario();
            String params = ((InterfaceC1641206bi) c1641406bk.LIZJ).getParams();
            if (Intrinsics.LJFF(scenario, "waitClientBusinessDataState")) {
                if (params != null) {
                    JSONObject jSONObject = new JSONObject(params);
                    Object objOpt = jSONObject.opt("wait_state");
                    if ((objOpt instanceof Boolean) && (bool = (Boolean) objOpt) != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        this.LLJLIL = C1014950cWD.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("CommerceLiveShoppingManager updateCommonJSBParamContainsPrerender() feWaitDataStatus = ");
                        sbLIZ3.append(zBooleanValue);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    Object objOpt2 = jSONObject.opt("business_data_key");
                    if (objOpt2 instanceof String) {
                        str25 = (String) objOpt2;
                    } else {
                        str25 = null;
                    }
                    this.LLJLILLLLZIIL = str25;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("CommerceLiveShoppingManager updateCommonJSBParamContainsPrerender() businessDataKey = ");
                    sbLIZ4.append(this.LLJLILLLLZIIL);
                    C2188811AlT.LIZIZ(sbLIZ4);
                }
            } else if (Intrinsics.LJFF(scenario, "fe_render_event")) {
                C1015400cWw c1015400cWw = C1015400cWw.LIZ;
                Long creativeId = this.LLILLJJLI.LIZLLL.getCreativeId();
                String str28 = "";
                if (creativeId == null || (string = creativeId.toString()) == null) {
                    string = "";
                }
                String str29 = this.LL.type;
                c1015400cWw.getClass();
                AnoleAutomationParamModel anoleAutomationParamModelLIZ = C1015400cWw.LIZ(string, str29);
                if (params != null) {
                    JSONObject jSONObject2 = new JSONObject(params);
                    Object objOpt3 = jSONObject2.opt("event_name");
                    String str30 = anoleAutomationParamModelLIZ.renderStage;
                    if (objOpt3 instanceof String) {
                        str = (String) objOpt3;
                    } else {
                        str = null;
                    }
                    if (!Intrinsics.LJFF("render_result", str30)) {
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -673509659:
                                    if (str.equals("anole_fe_page_json_load_end")) {
                                        str28 = "fe_page_json_load_end";
                                    }
                                    break;
                                case -434972428:
                                    if (str.equals("anole_fe_page_json_exist")) {
                                        str28 = "fe_page_json_exist";
                                    }
                                    break;
                                case 1087407735:
                                    if (str.equals("anole_fe_resource_load_end")) {
                                        str28 = "fe_resource_load_end";
                                    }
                                    break;
                                case 1310388204:
                                    if (str.equals("anole_fe_page_json_load_start")) {
                                        str28 = "fe_page_json_load_start";
                                    }
                                    break;
                                case 1334889214:
                                    if (str.equals("anole_fe_resource_load_start")) {
                                        str28 = "fe_resource_load_start";
                                    }
                                    break;
                                case 1528580655:
                                    if (str.equals("anole_fe_start_render")) {
                                        str28 = "fe_start_render";
                                    }
                                    break;
                                case 1669097676:
                                    if (str.equals("anole_fe_page_json_parse_end")) {
                                        str28 = "fe_page_json_parse_end";
                                    }
                                    break;
                            }
                        }
                        str30 = str28;
                    }
                    anoleAutomationParamModelLIZ.renderStage = str30;
                    if (Intrinsics.LJFF(objOpt3, "anole_fe_start_render")) {
                        C1015290cWl c1015290cWlLJJ = LJJ();
                        AnoleComponentModel anoleComponentModel2 = this.LL;
                        c1015290cWlLJJ.getClass();
                        if (C298290Bmd.LIZ()) {
                            Object obj = c1015290cWlLJJ.getProvidedContexts().get(AwemeRawAd.class);
                            if (obj instanceof AwemeRawAd) {
                                awemeRawAd7 = (AwemeRawAd) obj;
                            } else {
                                awemeRawAd7 = null;
                            }
                            C1014250cV5.LIZ.getClass();
                            C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel2);
                            if (c1014490cVTLIZ != null) {
                                str23 = c1014490cVTLIZ.LIZ;
                                str24 = c1014490cVTLIZ.LIZIZ;
                            } else {
                                str23 = null;
                                str24 = null;
                            }
                            C2275921E6k.LIZ.getClass();
                            c1015290cWlLJJ.logAd(C2275921E6k.LIZLLL, new AwS12S2300000_35(anoleComponentModel2, c1015290cWlLJJ, str23, str24, awemeRawAd7, 1));
                        }
                    } else if (Intrinsics.LJFF(objOpt3, "anole_fe_page_json_exist")) {
                        LLLLIILL = System.currentTimeMillis();
                        Object objOpt4 = jSONObject2.opt("origin");
                        if (objOpt4 instanceof String) {
                            str20 = (String) objOpt4;
                        } else {
                            str20 = null;
                        }
                        C1015290cWl c1015290cWlLJJ2 = LJJ();
                        AnoleComponentModel anoleComponentModel3 = this.LL;
                        c1015290cWlLJJ2.getClass();
                        if (C298290Bmd.LIZ()) {
                            Object obj2 = c1015290cWlLJJ2.getProvidedContexts().get(AwemeRawAd.class);
                            if (obj2 instanceof AwemeRawAd) {
                                awemeRawAd6 = (AwemeRawAd) obj2;
                            } else {
                                awemeRawAd6 = null;
                            }
                            C1014250cV5.LIZ.getClass();
                            C1014490cVT c1014490cVTLIZ2 = C1014250cV5.LIZ(anoleComponentModel3);
                            if (c1014490cVTLIZ2 != null) {
                                str21 = c1014490cVTLIZ2.LIZ;
                                str22 = c1014490cVTLIZ2.LIZIZ;
                            } else {
                                str21 = null;
                                str22 = null;
                            }
                            C2275921E6k.LIZ.getClass();
                            c1015290cWlLJJ2.logAd(C2275921E6k.LJ, new AwS7S3300000_35(anoleComponentModel3, c1015290cWlLJJ2, str20, str21, str22, awemeRawAd6, 0));
                        }
                    } else if (Intrinsics.LJFF(objOpt3, "anole_fe_page_json_load_start")) {
                        LLLLIIL = System.currentTimeMillis();
                        C1015290cWl c1015290cWlLJJ3 = LJJ();
                        AnoleComponentModel anoleComponentModel4 = this.LL;
                        c1015290cWlLJJ3.getClass();
                        if (C298290Bmd.LIZ()) {
                            Object obj3 = c1015290cWlLJJ3.getProvidedContexts().get(AwemeRawAd.class);
                            if (obj3 instanceof AwemeRawAd) {
                                awemeRawAd5 = (AwemeRawAd) obj3;
                            } else {
                                awemeRawAd5 = null;
                            }
                            C1014250cV5.LIZ.getClass();
                            C1014490cVT c1014490cVTLIZ3 = C1014250cV5.LIZ(anoleComponentModel4);
                            if (c1014490cVTLIZ3 != null) {
                                str18 = c1014490cVTLIZ3.LIZ;
                                str19 = c1014490cVTLIZ3.LIZIZ;
                            } else {
                                str18 = null;
                                str19 = null;
                            }
                            C2275921E6k.LIZ.getClass();
                            c1015290cWlLJJ3.logAd(C2275921E6k.LJFF, new AwS12S2300000_35(anoleComponentModel4, c1015290cWlLJJ3, str18, str19, awemeRawAd5, 0));
                        }
                    } else if (Intrinsics.LJFF(objOpt3, "anole_fe_page_json_load_end")) {
                        LLLLIILL = System.currentTimeMillis();
                        C1015290cWl c1015290cWlLJJ4 = LJJ();
                        AnoleComponentModel anoleComponentModel5 = this.LL;
                        int i2 = (int) (LLLLIILL - LLLLIIL);
                        c1015290cWlLJJ4.getClass();
                        if (C298290Bmd.LIZ()) {
                            Object obj4 = c1015290cWlLJJ4.getProvidedContexts().get(AwemeRawAd.class);
                            if (obj4 instanceof AwemeRawAd) {
                                awemeRawAd4 = (AwemeRawAd) obj4;
                            } else {
                                awemeRawAd4 = null;
                            }
                            C1014250cV5.LIZ.getClass();
                            C1014490cVT c1014490cVTLIZ4 = C1014250cV5.LIZ(anoleComponentModel5);
                            if (c1014490cVTLIZ4 != null) {
                                str16 = c1014490cVTLIZ4.LIZ;
                                str17 = c1014490cVTLIZ4.LIZIZ;
                            } else {
                                str16 = null;
                                str17 = null;
                            }
                            C2275921E6k.LIZ.getClass();
                            c1015290cWlLJJ4.logAd(C2275921E6k.LJI, new C2275981E6q(anoleComponentModel5, c1015290cWlLJJ4, i2, str16, str17, awemeRawAd4));
                        }
                        LLLLIIL = 0L;
                    } else if (Intrinsics.LJFF(objOpt3, "anole_fe_page_json_parse_end")) {
                        Object objOpt5 = jSONObject2.opt("show_with_resource_ready");
                        if (objOpt5 instanceof String) {
                            str13 = (String) objOpt5;
                        } else {
                            str13 = null;
                        }
                        anoleAutomationParamModelLIZ.showWithResourceReady = str13;
                        C1015290cWl c1015290cWlLJJ5 = LJJ();
                        AnoleComponentModel anoleComponentModel6 = this.LL;
                        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - LLLLIILL);
                        c1015290cWlLJJ5.getClass();
                        if (C298290Bmd.LIZ()) {
                            Object obj5 = c1015290cWlLJJ5.getProvidedContexts().get(AwemeRawAd.class);
                            if (obj5 instanceof AwemeRawAd) {
                                awemeRawAd3 = (AwemeRawAd) obj5;
                            } else {
                                awemeRawAd3 = null;
                            }
                            C1014250cV5.LIZ.getClass();
                            C1014490cVT c1014490cVTLIZ5 = C1014250cV5.LIZ(anoleComponentModel6);
                            if (c1014490cVTLIZ5 != null) {
                                str14 = c1014490cVTLIZ5.LIZ;
                                str15 = c1014490cVTLIZ5.LIZIZ;
                            } else {
                                str14 = null;
                                str15 = null;
                            }
                            C2275921E6k.LIZ.getClass();
                            c1015290cWlLJJ5.logAd(C2275921E6k.LJII, new C2275971E6p(anoleComponentModel6, c1015290cWlLJJ5, iCurrentTimeMillis, str13, str14, str15, awemeRawAd3));
                        }
                        LLLLIILL = 0L;
                    } else if (Intrinsics.LJFF(objOpt3, "anole_fe_resource_load_start")) {
                        LLLLIILLL = System.currentTimeMillis();
                        Object objOpt6 = jSONObject2.opt("url");
                        if (objOpt6 instanceof String) {
                            str10 = (String) objOpt6;
                        } else {
                            str10 = null;
                        }
                        Object objOpt7 = jSONObject2.opt("count");
                        if (objOpt7 instanceof Integer) {
                            num3 = (Integer) objOpt7;
                        } else {
                            num3 = null;
                        }
                        C1015290cWl c1015290cWlLJJ6 = LJJ();
                        AnoleComponentModel anoleComponentModel7 = this.LL;
                        c1015290cWlLJJ6.getClass();
                        if (C298290Bmd.LIZ()) {
                            Object obj6 = c1015290cWlLJJ6.getProvidedContexts().get(AwemeRawAd.class);
                            if (obj6 instanceof AwemeRawAd) {
                                awemeRawAd2 = (AwemeRawAd) obj6;
                            } else {
                                awemeRawAd2 = null;
                            }
                            C1014250cV5.LIZ.getClass();
                            C1014490cVT c1014490cVTLIZ6 = C1014250cV5.LIZ(anoleComponentModel7);
                            if (c1014490cVTLIZ6 != null) {
                                str11 = c1014490cVTLIZ6.LIZ;
                                str12 = c1014490cVTLIZ6.LIZIZ;
                            } else {
                                str11 = null;
                                str12 = null;
                            }
                            C2275921E6k.LIZ.getClass();
                            c1015290cWlLJJ6.logAd(C2275921E6k.LJIIIIZZ, new AwS6S3400000_35(anoleComponentModel7, c1015290cWlLJJ6, str10, num3, str11, str12, awemeRawAd2, 1));
                        }
                    } else if (Intrinsics.LJFF(objOpt3, "anole_fe_resource_load_end")) {
                        Object objOpt8 = jSONObject2.opt("is_success");
                        if (objOpt8 instanceof String) {
                            str2 = (String) objOpt8;
                        } else {
                            str2 = null;
                        }
                        Object objOpt9 = jSONObject2.opt("url");
                        if (objOpt9 instanceof String) {
                            str3 = (String) objOpt9;
                        } else {
                            str3 = null;
                        }
                        Object objOpt10 = jSONObject2.opt("resource_type");
                        if (objOpt10 instanceof String) {
                            str4 = (String) objOpt10;
                        } else {
                            str4 = null;
                        }
                        Object objOpt11 = jSONObject2.opt("resource_size");
                        if (objOpt11 instanceof Integer) {
                            num = (Integer) objOpt11;
                        } else {
                            num = null;
                        }
                        Object objOpt12 = jSONObject2.opt("resource_origin");
                        if (objOpt12 instanceof String) {
                            str5 = (String) objOpt12;
                        } else {
                            str5 = null;
                        }
                        Object objOpt13 = jSONObject2.opt("error_code");
                        if (objOpt13 instanceof String) {
                            str6 = (String) objOpt13;
                        } else {
                            str6 = null;
                        }
                        Object objOpt14 = jSONObject2.opt("error_msg");
                        if (objOpt14 instanceof String) {
                            str7 = (String) objOpt14;
                        } else {
                            str7 = null;
                        }
                        Object objOpt15 = jSONObject2.opt("count");
                        if (objOpt15 instanceof Integer) {
                            num2 = (Integer) objOpt15;
                        } else {
                            num2 = null;
                        }
                        C1015290cWl c1015290cWlLJJ7 = LJJ();
                        AnoleComponentModel anoleComponentModel8 = this.LL;
                        Integer numValueOf = Integer.valueOf((int) (System.currentTimeMillis() - LLLLIILLL));
                        c1015290cWlLJJ7.getClass();
                        if (C298290Bmd.LIZ()) {
                            Object obj7 = c1015290cWlLJJ7.getProvidedContexts().get(AwemeRawAd.class);
                            if (obj7 instanceof AwemeRawAd) {
                                awemeRawAd = (AwemeRawAd) obj7;
                            } else {
                                awemeRawAd = null;
                            }
                            C1014250cV5.LIZ.getClass();
                            C1014490cVT c1014490cVTLIZ7 = C1014250cV5.LIZ(anoleComponentModel8);
                            if (c1014490cVTLIZ7 != null) {
                                str8 = c1014490cVTLIZ7.LIZ;
                                str9 = c1014490cVTLIZ7.LIZIZ;
                            } else {
                                str8 = null;
                                str9 = null;
                            }
                            C2275921E6k.LIZ.getClass();
                            c1015290cWlLJJ7.logAd(C2275921E6k.LJIIIZ, new C2275931E6l(anoleComponentModel8, c1015290cWlLJJ7, str2, str3, str4, numValueOf, num, str5, str6, str7, num2, str8, str9, awemeRawAd));
                        }
                        LLLLIILLL = 0L;
                    }
                }
            }
        }
        if (!Intrinsics.LJFF(c1641406bk.LIZIZ, this.LLLII)) {
            return;
        }
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ().isEnabled();
        XBaseParamModel xBaseParamModel2 = c1641406bk.LIZJ;
        if (xBaseParamModel2 instanceof h0.b) {
            try {
                c098200Yq = (AnoleComponentAnimationModel) C09C2.LIZ().LJII(((h0.b) xBaseParamModel2).getAnimation().toString(), AnoleComponentAnimationModel.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null && (viewGroup = this.LLJJIII) != null && (view = this.LLJJIJIL) != null && (animatorSetLIZJ = C1014530cVX.LIZJ(this, viewGroup, view, Collections.singletonList(c098200Yq), false)) != null) {
                animatorSetLIZJ.addListener(new ALAdapterS11S0200000_16(view, this, 6));
                animatorSetLIZJ.start();
                return;
            }
            return;
        }
        if (xBaseParamModel2 instanceof r.b) {
            this.LLLIIIIL = ((r.b) xBaseParamModel2).getTimeList();
            LJJIII();
            return;
        }
        if (xBaseParamModel2 instanceof b.a) {
            this.LLJJI = new C1009390cNF(((b.a) c1641406bk.LIZJ).getSize().getWidth().doubleValue(), ((b.a) c1641406bk.LIZJ).getSize().getHeight().doubleValue());
            return;
        }
        if (xBaseParamModel2 instanceof j0.b) {
            j0.b bVar = (j0.b) xBaseParamModel2;
            if (Intrinsics.LJFF(bVar.getType(), "byBusiness")) {
                this.LLILLL.LJIJ(new C989780brc(bVar.getComponentToShow()), this);
                return;
            }
            return;
        }
        if (xBaseParamModel2 instanceof i0.b) {
            i0.b bVar2 = (i0.b) xBaseParamModel2;
            if (Intrinsics.LJFF(bVar2.getType(), "byBusiness")) {
                this.LLILLL.LJIJ(new C991660bue(bVar2.getComponentToHide()), this);
                return;
            }
            return;
        }
        if (xBaseParamModel2 instanceof c.a) {
            LJIJJLI();
            this.LLILLL.LJII(((c.a) c1641406bk.LIZJ).getStatus().intValue(), ((c.a) c1641406bk.LIZJ).getScene());
            return;
        }
        if (xBaseParamModel2 instanceof d.a) {
            C1014260cV6.LIZJ(this, this.LLILLL.b3(), Long.valueOf(((d.a) c1641406bk.LIZJ).getBackOldTime().longValue()));
            return;
        }
        if (xBaseParamModel2 instanceof InterfaceC1015080cWQ) {
            InterfaceC1015080cWQ interfaceC1015080cWQ = (InterfaceC1015080cWQ) xBaseParamModel2;
            this.LLILLL.LJIJ(new C989550brF(new C1017230cZt(interfaceC1015080cWQ.getWebUrl(), interfaceC1015080cWQ.getOpenUrl(), interfaceC1015080cWQ.getLynxSchema(), interfaceC1015080cWQ.getLogExtra())), this);
        } else if (xBaseParamModel2 instanceof InterfaceC1641206bi) {
            InterfaceC1641206bi interfaceC1641206bi = (InterfaceC1641206bi) xBaseParamModel2;
            this.LLILLL.LJIJ(new C989550brF(new C1009000cMc(interfaceC1641206bi.getBusiness(), interfaceC1641206bi.getScene(), interfaceC1641206bi.getScenario(), interfaceC1641206bi.getParams())), this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fk(android.view.ViewGroup r8, X.InterfaceC1014340cVE r9) {
        /*
            r7 = this;
            super.Fk(r8, r9)
            r0 = 0
            r7.LLLF = r0
            X.C622680Oba.LIZJ(r7)
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = r7.LL
            java.lang.String r1 = r0.getRenderStrategy()
            java.lang.String r0 = "now_render_when_show"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L4c
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = r7.LL
            java.lang.String r1 = r0.getRenderStrategy()
            java.lang.String r0 = "prerender_play_progress"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7a
            X.0cV7 r0 = r7.LLILLL
            long r5 = r0.r1()
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = r7.LL
            java.lang.Integer r0 = r0.getRenderPlayProgressThresholdValue()
            if (r0 == 0) goto L78
            int r1 = r0.intValue()
        L37:
            X.0cV7 r0 = r7.LLILLL
            java.lang.Integer r0 = r0.getVideoDuration()
            int r0 = X.C0GTM.LIZIZ(r1, r0)
            long r3 = (long) r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L7a
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L7a
        L4c:
            r2 = 0
        L4d:
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = r7.LL
            java.lang.String r1 = r0.prerenderFailedStrategy
            java.lang.String r0 = "pre_video_render"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L5b
            if (r2 == 0) goto L5e
        L5b:
            r7.LJJIIJ()
        L5e:
            java.lang.String r2 = r7.LLJZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "mount "
            r1.append(r0)
            int r0 = r7.hashCode()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1022620cia.LJ(r2, r0)
            return
        L78:
            r1 = 0
            goto L37
        L7a:
            r2 = 1
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1014730cVr.Fk(android.view.ViewGroup, X.0cVE):void");
    }

    public final void LJJIIJZLJL(String str, Map<String, ? extends Object> map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        HashMap<String, Object> mapZ2 = this.LLILLL.Z2();
        if (mapZ2 != null) {
            map2.putAll(mapZ2);
        }
        C1014650cVj.LIZ(this, str, map2);
    }

    @Override // X.InterfaceC1051190dSf
    public final void k3(String str, String str2) {
        Map<String, Object> mapLIZ;
        this.LLLFZ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onLoadFailed],code = ");
        sbLIZ.append(str);
        sbLIZ.append(", msg=");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLFFI = false;
        LJIJJLI();
        this.LLLI = str;
        Function1<? super Boolean, Unit> function1 = this.LLLIIIL;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        this.LLJLL = C1014960cWE.LIZ;
        InterfaceC1014900cW8 interfaceC1014900cW8LJJII = LJJII();
        if (interfaceC1014900cW8LJJII != null) {
            interfaceC1014900cW8LJJII.k3(isReady().LIZIZ, EnumC1014820cW0.HYBRID.getValue());
        }
        AnoleComponentModel anoleComponentModel = this.LL;
        C1009340cNA c1009340cNA = this.LLILLJJLI;
        InterfaceC1014900cW8 interfaceC1014900cW8LJJII2 = LJJII();
        if (interfaceC1014900cW8LJJII2 != null) {
            mapLIZ = C1014770cVv.LIZ(interfaceC1014900cW8LJJII2);
        } else {
            mapLIZ = null;
        }
        C1014740cVs.LIZIZ(this, false, "hybrid_", str, anoleComponentModel, c1009340cNA, mapLIZ);
        C301090Br9.LIZIZ(new AwS165S1100000_16(this, str, 26));
    }

    public C1014730cVr(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = new AbstractC1014890cW7() { // from class: X.0cWC
        };
        this.LLJLL = C1014970cWF.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleHybridComponent,type:");
        sbLIZ.append(anoleComponentModel.type);
        this.LLJZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLL = new ConcurrentLinkedQueue<>();
        this.LLLFF = C452501pT.LIZIZ(new AwS560S0100000_16(c1009340cNA, 753));
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        Long creativeId = c1009340cNA.LIZLLL.getCreativeId();
        String string = (creativeId == null || (string = creativeId.toString()) == null) ? "" : string;
        String str = anoleComponentModel.type;
        c1015400cWw.getClass();
        C1015400cWw.LIZ(string, str);
        this.LLLI = "-1";
        this.LLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(anoleComponentModel, 754));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS417S0200000_16(this, c1009340cNA, 68));
        this.LLLJIL = C452501pT.LIZIZ(new AwS560S0100000_16(c1009340cNA, 755));
        this.LLLJL = C452501pT.LIZIZ(new AwS145S0400000_16(c1009340cNA, interfaceC1014270cV7, anoleComponentModel, this, 7));
        this.LLLL = C452501pT.LIZIZ(new AwS417S0200000_16(this, interfaceC1014270cV7, 69));
    }
}
