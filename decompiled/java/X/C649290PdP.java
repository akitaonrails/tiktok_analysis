package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.search.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0PdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C649290PdP extends SearchBaseSparkView {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public TemplateData LJIIZILJ;
    public final C01GW LJIJ;
    public final C649250PdL LJIJI;
    public C0R4T LJIJJ;
    public final C689760R3u LJIJJLI;

    public final Map<String, Long> LJIIJ() {
        return C2097608Jq.LJIIJ(new Pair("loadStartTimestamp", Long.valueOf(this.LJIJI.LIZ)), new Pair("loadEndTimestamp", Long.valueOf(this.LJIJI.LIZIZ)));
    }

    @Override // X.C0PZI
    public View LIZIZ() {
        return this.LJIILIIL;
    }

    @Override // X.C0PZI
    public final void LJ(List<DynamicData> list) {
        if (!list.isEmpty()) {
            LJFF(((DynamicData) ListProtector.get(list, 0)).dynamicPatch, null, false, false, false, null);
        }
    }

    public final void LJIIIZ(ISearchContextAbility iSearchContextAbility) {
        SparkContext sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIILIIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
            sparkContext.LJJ(ISearchContextAbility.class, iSearchContextAbility);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C649290PdP(androidx.fragment.app.Fragment r7, android.content.Context r8, androidx.lifecycle.LifecycleOwner r9, X.EnumC648990Pcv r10, com.bytedance.hybrid.spark.SparkContext r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            X.1ECQ r0 = X.C1ECQ.LIZ
            r0.getClass()
            boolean r0 = X.C1ECQ.LIZIZ()
            r4 = 0
            if (r0 == 0) goto L13
            X.0Pcv r0 = X.EnumC648990Pcv.SEARCH_MIDDLE
            if (r10 == r0) goto L8a
        L13:
            X.0PdW r0 = X.C649360PdW.LIZ
            r0.getClass()
            java.lang.System.currentTimeMillis()
            boolean r0 = X.C07FA.LIZ()
            if (r0 == 0) goto L49
            X.0Pcv r0 = X.EnumC648990Pcv.SEARCH_MIDDLE
            if (r10 != r0) goto L49
            X.01GW r1 = X.C649360PdW.LIZJ
            java.lang.Object r0 = r1.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L49
            java.lang.Object r0 = r1.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.remove(r10)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L49
            java.lang.Object r4 = r0.get()
            X.0qEB r4 = (X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) r4
            if (r4 != 0) goto L75
        L49:
            if (r11 != 0) goto L50
            com.bytedance.hybrid.spark.SparkContext r11 = new com.bytedance.hybrid.spark.SparkContext
            r11.<init>()
        L50:
            X.0q7g r0 = X.C1541950qED.LIZJ
            r0.getClass()
            X.0qED r5 = new X.0qED
            r5.<init>(r8, r11)
            X.0C64 r4 = X.C0C64.LJIILLIIL()
            java.lang.String r3 = "preload_without_prepare"
            r2 = 31744(0x7c00, float:4.4483E-41)
            r1 = 1
            r0 = 0
            boolean r0 = r4.LJIIIZ(r2, r3, r1, r0)
            if (r0 == 0) goto Lb1
            X.0Pcv r0 = X.EnumC648990Pcv.SEARCH_HUB
            if (r10 != r0) goto Lb1
        L6e:
            X.0qEB r4 = r5.LIZ(r1)
            r4.setSparkContext(r11)
        L75:
            com.ss.android.ugc.aweme.absetting.CTLeakConfig r0 = X.C1201120hMU.LIZ()
            boolean r3 = r0.leakOptSearch
            com.ss.android.ugc.aweme.search.lynx.core.viewmodel.DynamicViewFactory$createSparkView$1$1 r2 = new com.ss.android.ugc.aweme.search.lynx.core.viewmodel.DynamicViewFactory$createSparkView$1$1
            r2.<init>(r4)
            kotlin.jvm.internal.AwS376S0200000_10 r1 = new kotlin.jvm.internal.AwS376S0200000_10
            r0 = 82
            r1.<init>(r7, r9, r0)
            X.C1205850hU7.LIZ(r8, r3, r2, r1)
        L8a:
            r6.LJIILIIL = r4
            r0 = 676(0x2a4, float:9.47E-43)
            kotlin.jvm.internal.AFwS196S0000000_10 r0 = kotlin.jvm.internal.AFwS196S0000000_10.get$arr$(r0)
            X.01GW r0 = X.C1935507i5.LIZ(r0)
            r6.LJIJ = r0
            X.0PdL r0 = new X.0PdL
            r0.<init>()
            r6.LJIJI = r0
            X.0R4T r1 = new X.0R4T
            r0 = 11
            r1.<init>(r6, r0)
            r6.LJIJJ = r1
            X.0R3u r1 = new X.0R3u
            r0 = 1
            r1.<init>(r6, r0)
            r6.LJIJJLI = r1
            return
        Lb1:
            r1 = 0
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C649290PdP.<init>(androidx.fragment.app.Fragment, android.content.Context, androidx.lifecycle.LifecycleOwner, X.0Pcv, com.bytedance.hybrid.spark.SparkContext):void");
    }

    public /* synthetic */ C649290PdP(Fragment fragment, Context context, LifecycleOwner lifecycleOwner, EnumC648990Pcv enumC648990Pcv, int i) {
        this(fragment, context, (i & 4) != 0 ? null : lifecycleOwner, (i & 8) != 0 ? EnumC648990Pcv.DEFAULT : enumC648990Pcv, (SparkContext) null);
    }

    @Override // X.C0PZI
    public void LJFF(final DynamicPatch dynamicPatch, Map<String, ? extends Object> map, final boolean z, final boolean z2, boolean z3, final LynxViewClient lynxViewClient) {
        InterfaceC1541990qEH kitView;
        AbstractC1542100qES abstractC1542100qES;
        LynxView lynxView;
        Map map2;
        Map<String, Object> mapLIZ = C649800PeE.LIZ();
        Object kitView2 = null;
        if (!mapLIZ.isEmpty()) {
            Uri uri = UriProtector.parse(dynamicPatch.schema);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            if (new Regex("^fe_search_vertical_lynx.*").matches(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "disable_default_params");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) != 1) {
                    Object obj = mapLIZ.get("search_vertical");
                    if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            String strValueOf = String.valueOf(key);
                            String strValueOf2 = String.valueOf(value);
                            if (TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, strValueOf))) {
                                strValueOf2.toString();
                                builderBuildUpon.appendQueryParameter(strValueOf, strValueOf2);
                            }
                        }
                    }
                }
                dynamicPatch.schema = builderBuildUpon.toString();
            }
        }
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        DynamicPatch dynamicPatch2 = this.LJIIJJI;
        c649470Pdh.getClass();
        if (C649470Pdh.LJIIJJI(dynamicPatch, dynamicPatch2, z3)) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIILIIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            }
            if ((kitView2 instanceof LynxView) && (lynxView = (LynxView) kitView2) != null) {
                lynxView.onEnterForeground();
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LJIILIIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) != null && (abstractC1542100qES = this.LJ) != null) {
                abstractC1542100qES.LJLIIIL(kitView);
                return;
            }
            return;
        }
        LJIIIIZZ();
        this.LIZLLL = null;
        final C830490Whz c830490Whz = new C830490Whz();
        if (map != null) {
            c830490Whz.putAll(map);
        }
        LJII(c830490Whz);
        this.LJIIJ.add(C11NN.LJIIIIZZ(c830490Whz).LJIIIZ(new InterfaceC1487280oo2() { // from class: X.0PdK
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                SparkContext sparkContext;
                C830490Whz c830490Whz2 = (C830490Whz) obj2;
                if (z2 && C703302op.LIZ(dynamicPatch.getRawData())) {
                    C649100Pd6 c649100Pd6 = C649100Pd6.LIZ;
                    DynamicPatch dynamicPatch3 = dynamicPatch;
                    C830490Whz<String, Object> c830490Whz3 = c830490Whz;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LJIILIIL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                        sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getSparkContext();
                    } else {
                        sparkContext = null;
                    }
                    c649100Pd6.getClass();
                    C647380PaK.LJIIIIZZ.getClass();
                    return C647380PaK.LIZIZ(dynamicPatch3, c830490Whz3, sparkContext);
                }
                return TemplateData.LJII(c830490Whz2);
            }
        }).LIZ(new InterfaceC751490Tdr() { // from class: X.0QD5
            @Override // X.InterfaceC751490Tdr
            public final C11LE<TemplateData> LIZJ(C11NN<TemplateData> c11nn) {
                C649470Pdh c649470Pdh2 = C649470Pdh.LIZ;
                String str = dynamicPatch.schema;
                c649470Pdh2.getClass();
                String strLIZ = C647540Paa.LIZ(str);
                for (String str2 : new String[]{"entity"}) {
                    if (Intrinsics.LJFF(str2, strLIZ)) {
                        return c11nn;
                    }
                }
                this.getClass();
                return C0QD6.LIZ.LIZJ(c11nn);
            }
        }).LJIIL(new C09JN() { // from class: X.0PdI
            /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
            /* JADX WARN: Type inference failed for: r0v9, types: [T, X.0Pd7] */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 209
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C649220PdI.accept(java.lang.Object):void");
            }
        }));
    }
}
