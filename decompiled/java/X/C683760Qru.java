package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.ecommerce.search.components.personalizedtoast.EcomPersonalizedToastAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683760Qru {
    public static final int LIZIZ(Integer num, EnumC683800Qry enumC683800Qry) {
        EnumC1876780ywG enumC1876780ywGLIZ;
        if (num != null && num.intValue() != -1) {
            return num.intValue();
        }
        if (((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ() == null || (enumC1876780ywGLIZ = C1915720zx4.LIZ(enumC683800Qry.getKey(), null)) == null) {
            enumC1876780ywGLIZ = EnumC1876780ywG.CONSENT_NOT_PRESENT_IN_CACHE;
        }
        if (enumC683800Qry != EnumC683800Qry.TT_DSA_SEARCH_CONSENT) {
            return enumC1876780ywGLIZ.getI();
        }
        if (C682810QqN.LIZ[enumC1876780ywGLIZ.ordinal()] == 1) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [T, X.0mGz] */
    public static final C1389910mGz LIZ(final Fragment fragment, final EnumC683800Qry enumC683800Qry, String str, final Map<String, String> map, final Function0<Unit> function0, final Function0<Unit> function02) {
        final C259800zU c259800zU = new C259800zU();
        ?? c1389910mGz = new C1389910mGz(fragment);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_personalization;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1389910mGz.LJIIL(c419910GdJ);
        c1389910mGz.LJI(R.style.y0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(42, false), length, spannableStringBuilder.length(), 17);
        c1389910mGz.LJIIJ(spannableStringBuilder);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 4;
        c1360890lWB.LIZLLL = 0;
        c1360890lWB.LJIIIIZZ = new View.OnClickListener() { // from class: X.0Qrt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1389910mGz c1389910mGz2 = c259800zU.element;
                if (c1389910mGz2 != null) {
                    c1389910mGz2.LIZJ();
                }
                C683760Qru.LIZJ(fragment, enumC683800Qry, map, function0, function02, true);
            }
        };
        c1389910mGz.LJ(3000L);
        c259800zU.element = c1389910mGz;
        return c1389910mGz;
    }

    public static final void LIZJ(final Fragment fragment, final EnumC683800Qry enumC683800Qry, final Map map, final Function0 function0, final Function0 function02, final boolean z) {
        Activity activityLIZIZ;
        IPNSConsentCollectorService iPNSConsentCollectorServiceLIZIZ;
        IPNSConsentCollectorService iPNSConsentCollectorServiceLIZIZ2;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        Context contextLIZ = C06MM.LIZ(activityLIZIZ);
        if (contextLIZ == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        CollectConsentParam collectConsentParam = new CollectConsentParam(enumC683800Qry.getKey(), "PersonalizedHelper", "PersonalizedHelper", null, false);
        collectConsentParam.LIZ = map;
        InterfaceC1915190zwD interfaceC1915190zwD = new InterfaceC1915190zwD() { // from class: X.0QqM
            @Override // X.InterfaceC1915190zwD
            public final void LIZ() {
            }

            @Override // X.InterfaceC1915190zwD
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1915190zwD
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1915190zwD
            public final void LJ() {
            }

            @Override // X.InterfaceC1915190zwD
            public final void onError(String str) {
            }

            @Override // X.InterfaceC1915190zwD
            public final void LIZLLL(EnumC1876780ywG enumC1876780ywG, EnumC1876780ywG enumC1876780ywG2) {
                Fragment fragment2;
                EnumC1876780ywG enumC1876780ywG3 = EnumC1876780ywG.APPROVE;
                if (enumC1876780ywG != enumC1876780ywG3 && enumC1876780ywG2 == enumC1876780ywG3) {
                    function0.invoke();
                    if (z && (fragment2 = fragment) != null) {
                        Map<String, String> map2 = map;
                        EnumC683800Qry enumC683800Qry2 = enumC683800Qry;
                        Function0<Unit> function03 = function0;
                        Function0<Unit> function04 = function02;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put("enter_method", "click_toast");
                        int i = EcomPersonalizedToastAssem.LLILLL;
                        C683760Qru.LIZ(fragment2, enumC683800Qry2, C20642515q3.LJI(2131839223), linkedHashMap, function03, function04).LJIIJJI();
                        return;
                    }
                    return;
                }
                EnumC1876780ywG enumC1876780ywG4 = EnumC1876780ywG.REJECT;
                if (enumC1876780ywG == enumC1876780ywG4 || enumC1876780ywG2 != enumC1876780ywG4) {
                    return;
                }
                function02.invoke();
                if (!z) {
                    return;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                linkedHashMap2.put("enter_method", "click_toast");
                Fragment fragment3 = fragment;
                if (fragment3 == null) {
                    return;
                }
                EnumC683800Qry enumC683800Qry3 = enumC683800Qry;
                Function0<Unit> function05 = function0;
                Function0<Unit> function06 = function02;
                int i2 = EcomPersonalizedToastAssem.LLILLL;
                C683760Qru.LIZ(fragment3, enumC683800Qry3, C20642515q3.LJI(2131839222), linkedHashMap2, function05, function06).LJIIJJI();
            }
        };
        if (C294520BgY.LIZ()) {
            IPNSConsentSDKConfigService iPNSConsentSDKConfigService = (IPNSConsentSDKConfigService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentSDKConfigService.class, false, false, false, 14, null);
            if (iPNSConsentSDKConfigService != null && (iPNSConsentCollectorServiceLIZIZ2 = iPNSConsentSDKConfigService.LIZIZ()) != null) {
                C844470XAv.LIZ.getClass();
                iPNSConsentCollectorServiceLIZIZ2.LIZIZ(C844470XAv.LIZ(), new C683770Qrv(collectConsentParam), interfaceC1915190zwD);
                return;
            }
            return;
        }
        IPNSConsentSDKConfigService iPNSConsentSDKConfigService2 = (IPNSConsentSDKConfigService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentSDKConfigService.class, false, false, false, 14, null);
        if (iPNSConsentSDKConfigService2 == null || (iPNSConsentCollectorServiceLIZIZ = iPNSConsentSDKConfigService2.LIZIZ()) == null) {
            return;
        }
        iPNSConsentCollectorServiceLIZIZ.LJFF(contextLIZ, collectConsentParam, null, interfaceC1915190zwD);
    }
}
