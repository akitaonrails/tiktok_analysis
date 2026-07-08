package X;

import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Q73, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q73 {
    public static final C0Q73 LIZ = new C0Q73();

    public static void LIZ(final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, final String str, final TemplateData templateData, boolean z, AbstractC1542100qES abstractC1542100qES, final LynxViewClient lynxViewClient, Map map, AbstractC1542200qEc abstractC1542200qEc) {
        boolean z2;
        SparkContext sparkContext;
        String strLJIJI;
        C2089008Gi c2089008Gi = new C2089008Gi(str);
        c2089008Gi.LIZIZ(1, "use_forest");
        String strLJ = c2089008Gi.LJ();
        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        if (sparkContext2 != null && (strLJIJI = sparkContext2.LJIJI()) != null && !a0.LJJJIL(strLJIJI)) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str2 = "normal_load_spark";
        if (z2) {
            C0Q76 c0q76 = new C0Q76();
            if (z) {
                str2 = "preload";
            }
            c0q76.LJIILLIIL("type", str2);
            c0q76.LJIJ(1);
            c0q76.LJIILLIIL("error", "load");
            c0q76.LJIILLIIL("schema", strLJ);
            c0q76.LJIILJJIL();
            SparkContext sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
            if (sparkContext3 == null) {
                sparkContext3 = new SparkContext();
            }
            sparkContext3.LJJLIIJ(strLJ);
            if (map == null) {
                map = C2097608Jq.LJ();
            }
            sparkContext3.LJJLIIIJILLIZJL(map);
            sparkContext3.LJJ(InterfaceC1057870ddR.class, new InterfaceC1057870ddR() { // from class: X.0Q1j
                @Override // X.InterfaceC1163130gND
                public final void release() {
                }

                @Override // X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    if (interfaceC1531560pxS instanceof C1537910q7h) {
                        C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                        c1537910q7h.LJIJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(C12ES.LJIIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext()), 1073741824));
                        c1537910q7h.LJIIZILJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
                        C649560Pdq c649560Pdq = new C649560Pdq();
                        c649560Pdq.LIZIZ = Integer.valueOf(EnumC665490Q8l.PART_ON_LAYOUT.id());
                        c649560Pdq.LIZ = Boolean.TRUE;
                        c1537910q7h.LJIJJ(c649560Pdq);
                        C0Q73 c0q73 = C0Q73.LIZ;
                        String str3 = str;
                        c0q73.getClass();
                        try {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str3), "async_create_view");
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                                CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            }
                        } catch (NullPointerException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        c1537910q7h.LJIJJ = templateData;
                        LynxViewClient lynxViewClient2 = lynxViewClient;
                        if (lynxViewClient2 != null) {
                            c1537910q7h.LJIIIIZZ(lynxViewClient2);
                        }
                    }
                }
            });
            sparkContext3.LJJJJLL(abstractC1542100qES);
            if (abstractC1542200qEc == null) {
                abstractC1542200qEc = new AbstractC1542200qEc() { // from class: X.0Q74
                };
            }
            sparkContext3.LJJJJZI(abstractC1542200qEc);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJ(sparkContext3);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
            return;
        }
        C0Q76 c0q762 = new C0Q76();
        c0q762.LJIILLIIL("type", "normal_load_spark");
        c0q762.LJIJ(1);
        c0q762.LJIILLIIL("error", "reload");
        c0q762.LJIILLIIL("schema", strLJ);
        c0q762.LJIILJJIL();
        SparkContext sparkContext4 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        if (sparkContext4 != null) {
            sparkContext4.LJJJJLL(abstractC1542100qES);
        }
        if (lynxViewClient != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
            sparkContext.LJJJJZ(new C0R4S(lynxViewClient, 0));
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJLIJ(templateData, strLJ, false);
    }
}
