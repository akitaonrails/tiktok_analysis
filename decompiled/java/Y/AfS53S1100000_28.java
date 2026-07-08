package Y;

import X.AbstractC1387200mCc;
import X.C09JN;
import X.C103D;
import X.C103F;
import X.C10HZ;
import X.C1203130hPj;
import X.C1203140hPk;
import X.C1203200hPq;
import X.C13LP;
import X.C15438062q;
import X.C1879350z0P;
import X.C19244810Qs;
import X.C19249910Sr;
import X.C1C7U;
import X.C20476915Ap;
import X.C20684815ws;
import X.C211000rc;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C259800zU;
import X.C470510Icj;
import X.C786410Ut5;
import X.EnumC1873990yrl;
import X.InterfaceC420801kM;
import X.InterfaceC989510brB;
import android.app.Activity;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.geofencing.data.HistoryEntry;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionFragment;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupActionsConfig;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.impl.AgeGradServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.privacy.unifiedconfig.PrivacyUnifiedConfigResponse;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class AfS53S1100000_28 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("PrivacyUnifiedConfigDataManager@d221.fetchUnifiedConfigs$3");
        String configs = ((PrivacyUnifiedConfigResponse) obj).getConfigs();
        if (configs == null) {
            configs = "";
        }
        if (configs.length() == 0) {
            throw new IllegalStateException("unified config is empty");
        }
        if (afS53S1100000_28.s0 == null && !Intrinsics.LJFF(configs, C103D.LIZIZ)) {
            C103D.LIZIZ = configs;
            C103D.LIZ.putString("unified_page_config", configs);
        }
        Function1 function1 = (Function1) afS53S1100000_28.l1;
        if (function1 != null) {
            function1.invoke(configs);
        }
        C103F.LIZ.getClass();
        Iterator<InterfaceC989510brB<Unit>> it2 = C103F.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LLZZLLIL(Unit.LIZ);
        }
        C1C7U.LIZIZ("PrivacyUnifiedConfigDataManager@d221.fetchUnifiedConfigs$3");
    }

    public static final void accept$1(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("AnimationExecutor@6000.startAnimationGroup$3$1$4");
        C20476915Ap c20476915Ap = (C20476915Ap) afS53S1100000_28.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animations onError geniusId:");
        sbLIZ.append(afS53S1100000_28.s0);
        sbLIZ.append(" message:");
        sbLIZ.append(((Throwable) obj).getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C20476915Ap.LJIIJJI;
        c20476915Ap.LJIIJ(strLIZIZ, true);
        C1C7U.LIZIZ("AnimationExecutor@6000.startAnimationGroup$3$1$4");
    }

    public static final void accept$10(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("SleepHourAction@3981.tryShowPush$1");
        Activity activityLIZIZ = ((AbstractC1387200mCc) obj).LIZIZ();
        if (activityLIZIZ != null) {
            C1879350z0P c1879350z0P = (C1879350z0P) afS53S1100000_28.l1;
            String str = afS53S1100000_28.s0;
            if (c1879350z0P.LIZIZ()) {
                c1879350z0P.LIZJ(activityLIZIZ, str);
            }
        }
        C1C7U.LIZIZ("SleepHourAction@3981.tryShowPush$1");
    }

    public static final void accept$11(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("ISCompensateHelper@12dd.tryReUpload$1");
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS53S1100000_28.l1).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C19244810Qs.LIZ.getClass();
        C19244810Qs.LIZ().storeBoolean("upload_failed", false);
        C19244810Qs.LIZ().storeBoolean("upload_success", true);
        C19244810Qs.LIZJ = true;
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "request_status");
        c2344009Gk.LJIIIIZZ("source_method", afS53S1100000_28.s0);
        c19249910Sr.LIZIZ(c2344009Gk, "interest_post_backup");
        C1C7U.LIZIZ("ISCompensateHelper@12dd.tryReUpload$1");
    }

    public static final void accept$2(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("PushNewToastTask@aef9.applyConfirmActions$2$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyConfirmActions#setSubSwitches(");
        sbLIZ.append(afS53S1100000_28.s0);
        sbLIZ.append(", closeOthers: ");
        sbLIZ.append(((PopupActionsConfig) afS53S1100000_28.l1).closeOthers);
        sbLIZ.append(") success!");
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-New]");
        C1C7U.LIZIZ("PushNewToastTask@aef9.applyConfirmActions$2$2");
    }

    public static final void accept$3(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("PushNewToastTask@aef9.applyConfirmActions$2$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyConfirmActions#setSubSwitches(");
        sbLIZ.append(afS53S1100000_28.s0);
        sbLIZ.append(", closeOthers: ");
        sbLIZ.append(((PopupActionsConfig) afS53S1100000_28.l1).closeOthers);
        sbLIZ.append(") error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        sbLIZ.append('!');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-New]");
        C1C7U.LIZIZ("PushNewToastTask@aef9.applyConfirmActions$2$3");
    }

    public static final void accept$4(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("PushUserGuidePopupView@f425.applyConfirmActions$2$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyConfirmActions#setSubSwitches(");
        sbLIZ.append(afS53S1100000_28.s0);
        sbLIZ.append(", closeOthers: ");
        sbLIZ.append(((PopupActionsConfig) afS53S1100000_28.l1).closeOthers);
        sbLIZ.append(") success!");
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        C1C7U.LIZIZ("PushUserGuidePopupView@f425.applyConfirmActions$2$2");
    }

    public static final void accept$5(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("PushUserGuidePopupView@f425.applyConfirmActions$2$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyConfirmActions#setSubSwitches(");
        sbLIZ.append(afS53S1100000_28.s0);
        sbLIZ.append(", closeOthers: ");
        sbLIZ.append(((PopupActionsConfig) afS53S1100000_28.l1).closeOthers);
        sbLIZ.append(") error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        sbLIZ.append('!');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        C1C7U.LIZIZ("PushUserGuidePopupView@f425.applyConfirmActions$2$3");
    }

    public static final void accept$6(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("PushNewPopupTask@7564.applyConfirmActions$2$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyConfirmActions#setSubSwitches(");
        sbLIZ.append(afS53S1100000_28.s0);
        sbLIZ.append(", closeOthers: ");
        sbLIZ.append(((PopupActionsConfig) afS53S1100000_28.l1).closeOthers);
        sbLIZ.append(") success!");
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-New]");
        C1C7U.LIZIZ("PushNewPopupTask@7564.applyConfirmActions$2$2");
    }

    public static final void accept$7(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("PushNewPopupTask@7564.applyConfirmActions$2$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyConfirmActions#setSubSwitches(");
        sbLIZ.append(afS53S1100000_28.s0);
        sbLIZ.append(", closeOthers: ");
        sbLIZ.append(((PopupActionsConfig) afS53S1100000_28.l1).closeOthers);
        sbLIZ.append(") error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        sbLIZ.append('!');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-New]");
        C1C7U.LIZIZ("PushNewPopupTask@7564.applyConfirmActions$2$3");
    }

    public static final void accept$8(AfS53S1100000_28 afS53S1100000_28, Object obj) {
        C1C7U.LIZ("AgeGradServiceImpl@110c.updateAgeGradStatus$3");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.getStatusCode() == 0) {
            IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
            if (iPrivacySettingsDepService != null) {
                iPrivacySettingsDepService.LJIILIIL(afS53S1100000_28.s0);
            }
            ((AgeGradServiceImpl) afS53S1100000_28.l1).LIZ.put(afS53S1100000_28.s0, EnumC1873990yrl.SHOULD_NOT_SHOW);
        }
        C1C7U.LIZIZ("AgeGradServiceImpl@110c.updateAgeGradStatus$3");
    }

    public static final void accept$9(AfS53S1100000_28 afS53S1100000_28, Object obj) throws JSONException {
        C470510Icj c470510Icj;
        String strLIZIZ;
        C1C7U.LIZ("GeoFencingSelectionFragment@c4a.setupHistoryBlock$2");
        List<HistoryEntry> list = (List) obj;
        GeoFencingSelectionFragment geoFencingSelectionFragment = (GeoFencingSelectionFragment) afS53S1100000_28.l1;
        String str = afS53S1100000_28.s0;
        geoFencingSelectionFragment.LLJJIII = list;
        C1203130hPj c1203130hPjNR = geoFencingSelectionFragment.NR();
        if (!list.isEmpty() && c1203130hPjNR != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<HistoryEntry> it2 = list.iterator();
            while (true) {
                c470510Icj = null;
                if (!it2.hasNext()) {
                    break;
                }
                List<String> list2 = it2.next().regionCodes;
                if (list2.isEmpty()) {
                    strLIZIZ = "";
                } else if (list2.size() <= 3) {
                    strLIZIZ = C13LP.LJJLIIIJ(list2, "/", null, null, 0, null, null, 62);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C13LP.LJJLIIIJ(C13LP.LL(C13LP.LJLLJ(list2), 3), "/", null, null, 0, null, null, 62));
                    sbLIZ.append(" (");
                    sbLIZ.append(list2.size());
                    sbLIZ.append(')');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                arrayList.add(new C1203140hPk(strLIZIZ, null, 14));
            }
            c1203130hPjNR.setChips(arrayList);
            LinearLayout linearLayoutOR = geoFencingSelectionFragment.OR();
            if (linearLayoutOR != null) {
                C786410Ut5.LJZL(0, linearLayoutOR);
            }
            C10HZ c10hz = C10HZ.LIZ;
            int size = list.size();
            c10hz.getClass();
            if (!C10HZ.LIZJ) {
                C10HZ.LIZJ = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enter_from", str);
                jSONObject.put("history_cnt", size);
                C20684815ws.LJIJ("geofencing_history_show", jSONObject);
            }
            int i = geoFencingSelectionFragment.LLJJIJI;
            if (i >= 0 && i < list.size()) {
                c1203130hPjNR.LIZ(i, true, C1203200hPq.LIZ);
                C470510Icj c470510Icj2 = geoFencingSelectionFragment.LLIZLLLIL;
                if (c470510Icj2 != null) {
                    c470510Icj = c470510Icj2;
                }
                c470510Icj.LLLIIIIL(((HistoryEntry) ListProtector.get(list, i)).regionCodes);
            } else {
                geoFencingSelectionFragment.LLJJIJI = -1;
            }
        } else {
            LinearLayout linearLayoutOR2 = geoFencingSelectionFragment.OR();
            if (linearLayoutOR2 != null) {
                C786410Ut5.LJZL(8, linearLayoutOR2);
            }
        }
        C1C7U.LIZIZ("GeoFencingSelectionFragment@c4a.setupHistoryBlock$2");
    }

    public AfS53S1100000_28(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
