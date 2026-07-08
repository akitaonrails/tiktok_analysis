package X;

import com.bytedance.ies.nle.editor_jni.FeatureUtil;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.PairStrInt;
import com.bytedance.ies.nle.editor_jni.VecUInt32;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432220nNE implements InterfaceC1432240nNG {
    public static final C1432220nNE LIZ = new C1432220nNE();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1432230nNF());

    public static void LIZLLL(C1432220nNE c1432220nNE) {
        c1432220nNE.getClass();
        if (!(LIZIZ.getValue() instanceof C382301e9)) {
            NLE nle = NLE.INSTANCE;
            if (!nle.hasTemplateLibLoaded()) {
                nle.loadNLELibrary(true, C293550Bez.LIZ(), !C0C64.LJIILLIIL().LJIIIZ(31744, "nle_so_ignore_load_nle_media_so", true, false));
            }
            C382301e9 c382301e9 = C382301e9.LIZ;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "nle_so_avoid_load", true, false)) {
                Keva keva = C382301e9.LIZIZ;
                if (!Intrinsics.LJFF(keva.getString("ve_version", ""), "21.8.0.128")) {
                    VecUInt32 allSupportFeatureBits = NLETemplateModel.getAllSupportFeatureBits();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(allSupportFeatureBits, 10));
                    Iterator<Long> it2 = allSupportFeatureBits.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().toString());
                    }
                    keva.storeStringArray("all_support_feature_bits", (String[]) arrayList.toArray(new String[0]));
                    Keva keva2 = C382301e9.LIZIZ;
                    VecUInt32 supportUGCFeatureExcludeFeatures = NLETemplateModel.getSupportUGCFeatureExcludeFeatures();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(supportUGCFeatureExcludeFeatures, 10));
                    Iterator<Long> it3 = supportUGCFeatureExcludeFeatures.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(it3.next().toString());
                    }
                    keva2.storeStringArray("ugc_all_support_feature_bits", (String[]) arrayList2.toArray(new String[0]));
                    for (PairStrInt pairStrInt : FeatureUtil.getAllFeatureAndIndexList()) {
                        C382301e9.LIZIZ.storeInt(pairStrInt.getFirst(), pairStrInt.getSecond());
                    }
                    C382301e9.LIZIZ.storeString("ve_version", "21.8.0.128");
                }
            }
        }
    }

    public static void LJ(boolean z) {
        CreativeToolsPluginService creativeToolsPluginService;
        if (!z && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                C1BCC c1bcc = new C1BCC(new Runnable() { // from class: X.0nI9
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FeatureBitsUtil@d3c0.preload$task$1");
                        try {
                            C1432220nNE.LIZLLL(C1432220nNE.LIZ);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FeatureBitsUtil@d3c0.preload$task$1");
                    }
                });
                c1bcc.LLJIJIL = "PreloadTemplateLib";
                c1bcc.LLJI = 86400000L;
                C1BCA.LJJIIZ(c1bcc);
            }
        }
    }

    @Override // X.InterfaceC1432240nNG
    public final List<Long> LIZIZ(List<String> list, boolean z) {
        if (z) {
            return C182000mw.LIZ.LIZIZ(list, true);
        }
        LIZLLL(this);
        return ((InterfaceC1432240nNG) LIZIZ.getValue()).LIZIZ(list, false);
    }

    @Override // X.InterfaceC1432240nNG
    public final List<Long> LIZJ(List<String> list, boolean z) {
        if (z) {
            return C182000mw.LIZ.LIZJ(list, true);
        }
        LIZLLL(this);
        return ((InterfaceC1432240nNG) LIZIZ.getValue()).LIZJ(list, false);
    }

    @Override // X.InterfaceC1432240nNG
    public final boolean LIZ(List<Long> list, List<Long> list2, boolean z) {
        if (z) {
            return C182000mw.LIZ.LIZ(list, list2, true);
        }
        LIZLLL(this);
        return ((InterfaceC1432240nNG) LIZIZ.getValue()).LIZ(list, list2, false);
    }
}
