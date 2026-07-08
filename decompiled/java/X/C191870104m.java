package X;

import Y.AfS162S0200000_28;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyPrompt;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecordV2;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.NoPAControlSettings;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.unified.UnifiedDataResponse;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.104m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191870104m {
    public static final C191870104m LIZ = new C191870104m();

    public static void LIZ(UnifiedDataResponse unifiedDataResponse) {
        Map<String, PrivacySettingsAgreementRecord> mapLJ;
        Map<String, PrivacySettingsAgreementRecordV2> mapLJ2;
        Map<String, PrivacySettingsAgreementRecord> mapLJ3;
        PrivacySettingsRestriction restriction = unifiedDataResponse.getRestriction();
        if (restriction != null) {
            C191870104m c191870104m = LIZ;
            boolean logReportEnable = unifiedDataResponse.getLogReportEnable();
            c191870104m.getClass();
            RestrictionResponse restrictionResponseLIZ = C191874104q.LIZ();
            if (restrictionResponseLIZ == null || (mapLJ = restrictionResponseLIZ.getPopupAgreement()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            RestrictionResponse restrictionResponseLIZ2 = C191874104q.LIZ();
            if (restrictionResponseLIZ2 == null || (mapLJ2 = restrictionResponseLIZ2.getPopupAgreementV2()) == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            RestrictionResponse restrictionResponseLIZ3 = C191874104q.LIZ();
            if (restrictionResponseLIZ3 == null || (mapLJ3 = restrictionResponseLIZ3.getPostRecord()) == null) {
                mapLJ3 = C2097608Jq.LJ();
            }
            C191874104q.LJ(new RestrictionResponse(restriction, mapLJ, mapLJ2, mapLJ3, logReportEnable));
            C191879104v.LIZ.getClass();
            Iterator it2 = ((CopyOnWriteArrayList) C191879104v.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC989510brB) it2.next()).LLZZLLIL(restriction);
            }
        }
        PrivacyUserSettingsV2 settings = unifiedDataResponse.getSettings();
        if (settings != null) {
            LIZ.getClass();
            C191859104b.LIZ(settings, null);
        }
        NoPAControlSettings noPaControlSettings = unifiedDataResponse.getNoPaControlSettings();
        if (noPaControlSettings != null) {
            LIZ.getClass();
            C1888900zFo.LIZJ(noPaControlSettings);
        }
        Map<String, PrivacyPrompt> prompts = unifiedDataResponse.getPrompts();
        C1888910zFp.LIZ.getClass();
        C1888910zFp.LIZJ(prompts);
    }

    public static void LIZIZ(final EnumC191875104r enumC191875104r, String str, boolean z, final Function0 function0) {
        if (C191868104k.LIZIZ(enumC191875104r, z)) {
            C01GW c01gw = C191877104t.LIZIZ;
            final Function1 function1 = null;
            if (((InterfaceC1518570pcV) c01gw.getValue()).LIZLLL()) {
                C191871104n.LJI.getClass();
                InterfaceC1518570pcV interfaceC1518570pcV = (InterfaceC1518570pcV) c01gw.getValue();
                InterfaceC1518350pc9 interfaceC1518350pc9LIZIZ = new InterfaceC1518350pc9<UnifiedDataResponse>() { // from class: X.104l
                    @Override // X.InterfaceC1518350pc9
                    public final void LIZ(C1518330pc7<UnifiedDataResponse> c1518330pc7) {
                        C191868104k.LIZ(enumC191875104r);
                        C191870104m c191870104m = C191870104m.LIZ;
                        UnifiedDataResponse unifiedDataResponse = c1518330pc7.LIZ;
                        c191870104m.getClass();
                        C191870104m.LIZ(unifiedDataResponse);
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }

                    @Override // X.InterfaceC1518350pc9
                    public final void onError(Throwable th) {
                        Function1<Throwable, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(th);
                        }
                    }
                };
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("scenario", str), new Pair("report_to_tea", "true"));
                InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
                if (interfaceC1888940zFsLIZJ != null) {
                    interfaceC1518350pc9LIZIZ = interfaceC1888940zFsLIZJ.LIZIZ(interfaceC1518350pc9LIZIZ, "/tiktok/privacy/user/data/v1", mapLJIIIIZZ);
                }
                C1518410pcF c1518410pcFLIZIZ = interfaceC1518570pcV.LIZIZ();
                C1518500pcO c1518500pcO = new C1518500pcO("/tiktok/privacy/user/data/v1", null);
                String value = enumC191875104r.getValue();
                if (value != null) {
                    c1518500pcO.LIZLLL.put("scopes", value);
                }
                c1518410pcFLIZIZ.LIZ(c1518500pcO.LIZ(), UnifiedDataResponse.class, false, interfaceC1518350pc9LIZIZ);
                return;
            }
            InterfaceC191876104s interfaceC191876104s = (InterfaceC191876104s) C191877104t.LIZ.getValue();
            String value2 = enumC191875104r.getValue();
            C191871104n.LJI.getClass();
            C11NZ<UnifiedDataResponse> c11nzLIZ = interfaceC191876104s.LIZ("/tiktok/privacy/user/data/v1", value2);
            C191871104n.LJI.getClass();
            C1888930zFr.LIZIZ(c11nzLIZ, "/tiktok/privacy/user/data/v1", C2097608Jq.LJIIIIZZ(new Pair("scenario", str), new Pair("report_to_tea", "true"))).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS162S0200000_28(enumC191875104r, (MutableLiveData<Integer>) function0, (Function0<Unit>) 12), new C516201zk((Object) null, 110));
        }
    }
}
