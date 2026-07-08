package X;

import X.C0QCX;
import X.C830490Whz;
import X.InterfaceC420801kM;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QCZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QCZ implements InterfaceC666420QCa {
    public final LifecycleOwner LIZ;
    public Fragment LIZIZ;
    public String LIZJ;
    public C0QCX LIZLLL;
    public AbstractC1542100qES LJ;
    public final C830490Whz<String, JSONObject> LJFF;
    public final C830490Whz<String, JSONObject> LJI;
    public final ArrayList<Object> LJII;
    public final ArrayList<AbstractC666440QCc> LJIIIIZZ;
    public final ArrayList<AbstractC666450QCd> LJIIIZ;
    public final ArrayList<InterfaceC420801kM> LJIIJ;
    public DynamicPatch LJIIJJI;

    public final void LJ() {
        this.LJFF.clear();
        this.LJII.clear();
        this.LJI.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF() {
        C1537480q70 hybridContext;
        C1075770e6J c1075770e6J;
        Map<String, ? extends Object> map;
        Iterator it2 = ((C830490Whz.a) this.LJFF.entrySet()).iterator();
        while (true) {
            C830520Wi2 c830520Wi2 = (C830520Wi2) it2;
            if (!c830520Wi2.hasNext()) {
                break;
            }
            c830520Wi2.next();
            LJIIIIZZ((String) c830520Wi2.getKey(), (JSONObject) c830520Wi2.getValue());
        }
        Iterator it3 = ((C830490Whz.a) this.LJI.entrySet()).iterator();
        while (true) {
            C830520Wi2 c830520Wi22 = (C830520Wi2) it3;
            if (!c830520Wi22.hasNext()) {
                break;
            }
            c830520Wi22.next();
            LJIIIZ((String) c830520Wi22.getKey(), (JSONObject) c830520Wi22.getValue());
        }
        for (Object obj : this.LJII) {
            if (obj instanceof TemplateData) {
                LJIIJ((TemplateData) obj);
            }
            if (obj instanceof String) {
                LJIIJJI((String) obj);
            }
            if ((obj instanceof Map) && (map = (Map) obj) != null) {
                if (LJI()) {
                    C0QCX c0qcx = this.LIZLLL;
                    if (c0qcx != null) {
                        ((C1537710q7N) c0qcx.LIZ).U0(map);
                    }
                } else {
                    this.LJII.add(map);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateGlobalProps:");
                    sbLIZ.append(map);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        if ((!this.LJFF.isEmpty()) || (!this.LJII.isEmpty())) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, this.LJFF.isEmpty() ^ true ? "pending_event" : this.LJII.isEmpty() ^ true ? "pending_data" : "");
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
        }
        LJ();
        for (AbstractC666440QCc abstractC666440QCc : this.LJIIIIZZ) {
            C0QCX c0qcx2 = this.LIZLLL;
            C0QCX c0qcx3 = abstractC666440QCc.LIZ;
            if (c0qcx3 != null) {
                ((View) c0qcx3.LIZ).removeOnAttachStateChangeListener(abstractC666440QCc.LIZIZ);
            }
            ((View) c0qcx2.LIZ).addOnAttachStateChangeListener(abstractC666440QCc.LIZIZ);
            abstractC666440QCc.LIZ = c0qcx2;
        }
        C0QCX c0qcx4 = this.LIZLLL;
        if (c0qcx4 == null || (hybridContext = ((C1537710q7N) c0qcx4.LIZ).getHybridContext()) == null || (c1075770e6J = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class)) == null) {
            return;
        }
        for (final AbstractC666450QCd abstractC666450QCd : this.LJIIIZ) {
            abstractC666450QCd.getClass();
            C650250Pex c650250Pex = new C650250Pex();
            c650250Pex.LIZ = abstractC666450QCd.LIZ();
            c650250Pex.LIZJ = "";
            c650250Pex.LIZIZ = EnumC1062400dkk.PUBLIC;
            c650250Pex.LIZLLL = new C1543340qGS() { // from class: X.0QCb
                @Override // X.C1543340qGS
                public final void LIZLLL() {
                    abstractC666450QCd.getClass();
                }

                @Override // X.C1543340qGS
                public final void LIZIZ(Object obj2, C1543350qGT c1543350qGT) {
                    if (!(obj2 instanceof String)) {
                        return;
                    }
                    AbstractC666450QCd abstractC666450QCd2 = abstractC666450QCd;
                    new JSONObject((String) obj2);
                    abstractC666450QCd2.LIZIZ();
                }
            };
            c1075770e6J.LJIILJJIL(c650250Pex);
        }
    }

    public final boolean LJI() throws JSONException {
        if (this.LIZLLL == null) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "lynx_is_not_ok");
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
        }
        return this.LIZLLL != null;
    }

    public final void LJII() {
        LJ();
        this.LIZLLL = null;
    }

    public C0QCZ(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        this.LIZ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.ui.SearchBaseSparkView$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C0QCX c0qcx = this.LL.LIZLLL;
                        if (c0qcx != null) {
                            c0qcx.LIZ.LLD(true);
                        }
                        for (InterfaceC420801kM interfaceC420801kM : this.LL.LJIIJ) {
                            if (!interfaceC420801kM.isDisposed()) {
                                interfaceC420801kM.dispose();
                            }
                        }
                    }
                }
            });
        }
        this.LJFF = new C830490Whz<>();
        this.LJI = new C830490Whz<>();
        this.LJII = new ArrayList<>();
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIIZ = new ArrayList<>();
        this.LJIIJ = new ArrayList<>();
    }

    public final void LIZLLL(C830490Whz c830490Whz) {
        C664000Q2s c664000Q2s;
        String str;
        String str2 = "";
        if (C293970Bff.LIZ()) {
            String str3 = this.LIZJ;
            if (str3 != null) {
                str2 = str3;
            }
            c830490Whz.put("search_entrance", str2);
            return;
        }
        C646000PVm c646000PVm = C650950Pg5.Companion;
        Fragment fragment = this.LIZIZ;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragment, lifecycleOwner);
        if (c650960Pg6LJII != null && (c664000Q2s = c650960Pg6LJII.searchCommonModel) != null && (str = c664000Q2s.enterFrom) != null) {
            str2 = str;
        }
        c830490Whz.put("search_entrance", str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachCommonParams: ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIJ(TemplateData templateData) {
        if (LJI()) {
            ((LynxView) this.LIZLLL.LIZ).updateData(templateData);
            return;
        }
        this.LJII.add(templateData);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData:");
        sbLIZ.append(templateData);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIJJI(String str) {
        if (LJI()) {
            ((LynxView) this.LIZLLL.LIZ).updateData(str);
            return;
        }
        this.LJII.add(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIIIZZ(String str, JSONObject jSONObject) {
        if (LJI()) {
            C0QCX c0qcx = this.LIZLLL;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                javaOnlyMap2.put(next, jSONObject.opt(next));
            }
            javaOnlyMap.put("data", javaOnlyMap2);
            c0qcx.LIZ.X0(str, Collections.singletonList(javaOnlyMap));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendEventToFe by spark:");
            sbLIZ.append(str);
            sbLIZ.append(" and params");
            sbLIZ.append(jSONObject);
            sbLIZ.append(" and final data： ");
            sbLIZ.append(javaOnlyMap);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SparkInfo", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LJFF.put(str, jSONObject);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sendEvent:");
        sbLIZ2.append(str);
        sbLIZ2.append(' ');
        sbLIZ2.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LJIIIZ(String str, JSONObject jSONObject) {
        if (LJI()) {
            C0QCX c0qcx = this.LIZLLL;
            if (c0qcx != null) {
                c0qcx.LIZ.LIZ(str, jSONObject);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendEventToFe by spark:");
                sbLIZ.append(str);
                sbLIZ.append(" and params");
                sbLIZ.append(jSONObject);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SparkInfo", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        this.LJI.put(str, jSONObject);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sendEventByJson:");
        sbLIZ2.append(str);
        sbLIZ2.append(' ');
        sbLIZ2.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC666420QCa
    public final void LIZ(int i, ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ = LIZIZ();
        ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ.getParent();
        if (!Intrinsics.LJFF(parent, viewGroup)) {
            if (parent != null) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ, (ViewGroup) parent);
            }
            viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZIZ, i, layoutParams);
        }
    }
}
