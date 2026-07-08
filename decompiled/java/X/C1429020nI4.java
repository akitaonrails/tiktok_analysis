package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.template.api.IVideoTemplateAnchorService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nI4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429020nI4 implements InterfaceC1429130nIF {
    public volatile boolean LIZ;

    @Override // X.InterfaceC1429130nIF
    public final void LIZLLL() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(C0CHQ.LIZ)) {
            return;
        }
        C2169008ee.LIZ.LIZ();
        if (!this.LIZ) {
            NLE.loadNLELibrary$default(NLE.INSTANCE, true, C293550Bez.LIZ(), false, 4, null);
            this.LIZ = true;
        }
        C2268941DrQ.LIZ.LIZIZ(AFwS210S0000000_22.get$arr$(363));
    }

    @Override // X.InterfaceC1429130nIF
    public final boolean LJI() {
        C1429050nI7.LIZ.getClass();
        C1432220nNE.LIZ.getClass();
        return C1432220nNE.LIZIZ.getValue() instanceof C382301e9;
    }

    @Override // X.InterfaceC1429130nIF
    public final Intent LJIIIIZZ() {
        return new Intent();
    }

    @Override // X.InterfaceC1429130nIF
    public final void loadNLELib() {
        CreativeToolsPluginService creativeToolsPluginService;
        CreativeToolsPluginService creativeToolsPluginService2 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService2 != null && creativeToolsPluginService2.LJI(C0CHQ.LIZ)) {
            C1429050nI7.LIZ.getClass();
            C1429050nI7.LIZIZ();
        } else {
            if (!((Boolean) C0AYH.LIZ.getValue()).booleanValue() || (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) == null) {
                return;
            }
            creativeToolsPluginService.LIZJ(C0CHQ.LIZ, "template_anchor", true);
        }
    }

    @Override // X.InterfaceC1429130nIF
    public final boolean LIZIZ() {
        return C988990bqL.LIZ() && !C0CHQ.LIZ().getAccountService().LIZ();
    }

    @Override // X.InterfaceC1429130nIF
    public final boolean LJII() {
        return C989140bqa.LIZ() && !C0CHQ.LIZ().getAccountService().LIZ();
    }

    @Override // X.InterfaceC1429130nIF
    public final void preloadTemplateLib(List<? extends Aweme> list) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(C0CHQ.LIZ)) {
            C1429050nI7.LIZ.getClass();
            if (!C1429050nI7.LIZJ) {
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "nle_so_preload", true) > 0) {
                    boolean zBooleanValue = ((Boolean) C04Q2.LIZ.getValue()).booleanValue();
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "nle_so_preload", true) == 2) {
                        C1432220nNE.LIZ.getClass();
                        C1432220nNE.LJ(zBooleanValue);
                        C1429050nI7.LIZJ = true;
                        return;
                    }
                    if (list == null) {
                        return;
                    }
                    try {
                        Iterator<? extends Aweme> it2 = list.iterator();
                        while (it2.hasNext()) {
                            List<AnchorCommonStruct> anchors = it2.next().getAnchors();
                            if (anchors != null) {
                                Iterator<AnchorCommonStruct> it3 = anchors.iterator();
                                while (it3.hasNext()) {
                                    if (C1432940nOO.LJIIIIZZ(it3.next())) {
                                        C1432220nNE.LIZ.getClass();
                                        C1432220nNE.LJ(zBooleanValue);
                                        C1429050nI7.LIZJ = true;
                                        return;
                                    }
                                }
                            }
                        }
                        return;
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                C1429050nI7.LIZJ = true;
            }
        }
    }

    @Override // X.InterfaceC1429130nIF
    public final void LJFF(Activity activity, CutsameDataItem cutsameDataItem, ShortVideoContext shortVideoContext) {
        new C537840L7m(activity, cutsameDataItem, shortVideoContext).LIZ();
    }

    public static boolean LJIIIZ(TemplateScene templateScene, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        IVideoTemplateAnchorService iVideoTemplateAnchorService;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if ((creativeToolsPluginService == null || !creativeToolsPluginService.LJI(C0CHQ.LIZ)) && ((iVideoTemplateAnchorService = C1392430mL3.LIZ) == null || !iVideoTemplateAnchorService.LIZ())) {
            return false;
        }
        C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
        C1429030nI5 c1429030nI5 = new C1429030nI5(Collections.singletonList(new C1429040nI6(z)));
        c1429050nI7.getClass();
        InterfaceC1429080nIA interfaceC1429080nIA = (InterfaceC1429080nIA) ((LinkedHashMap) C1429050nI7.LIZIZ).get(templateScene);
        if (interfaceC1429080nIA == null) {
            return false;
        }
        return interfaceC1429080nIA.LIZIZ(arrayList, arrayList2, c1429030nI5);
    }

    @Override // X.InterfaceC1429130nIF
    public final Pair<Integer, Integer> LIZ(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z) {
        Pair<Integer, Integer> pairLIZ;
        IVideoTemplateAnchorService iVideoTemplateAnchorService;
        boolean z2 = false;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(C0CHQ.LIZ)) {
            z2 = true;
        }
        if (z2 || ((iVideoTemplateAnchorService = C1392430mL3.LIZ) != null && iVideoTemplateAnchorService.LIZ())) {
            C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
            C1429030nI5 c1429030nI5 = new C1429030nI5(Collections.singletonList(new C1429040nI6(z)));
            c1429050nI7.getClass();
            InterfaceC1429080nIA interfaceC1429080nIA = (InterfaceC1429080nIA) ((LinkedHashMap) C1429050nI7.LIZIZ).get(templateScene);
            if (interfaceC1429080nIA == null || (pairLIZ = interfaceC1429080nIA.LIZ(arrayList, arrayList2, c1429030nI5)) == null) {
                return new Pair<>(-1, -1);
            }
            return pairLIZ;
        }
        return new Pair<>(-1, -1);
    }

    @Override // X.InterfaceC1429130nIF
    public final boolean LIZJ(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z) {
        boolean zLJIIIZ;
        if (((Boolean) C0AYH.LIZ.getValue()).booleanValue()) {
            return LJIIIZ(templateScene, arrayList, arrayList2, z);
        }
        synchronized (this) {
            zLJIIIZ = LJIIIZ(templateScene, arrayList, arrayList2, z);
        }
        return zLJIIIZ;
    }

    @Override // X.InterfaceC1429130nIF
    public final List<Integer> LJ(TemplateScene templateScene, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, boolean z) {
        IVideoTemplateAnchorService iVideoTemplateAnchorService;
        List<Integer> listLIZLLL;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if ((creativeToolsPluginService != null && creativeToolsPluginService.LJI(C0CHQ.LIZ)) || ((iVideoTemplateAnchorService = C1392430mL3.LIZ) != null && iVideoTemplateAnchorService.LIZ())) {
            C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
            C1429030nI5 c1429030nI5 = new C1429030nI5(Collections.singletonList(new C1429040nI6(z)));
            c1429050nI7.getClass();
            InterfaceC1429080nIA interfaceC1429080nIA = (InterfaceC1429080nIA) ((LinkedHashMap) C1429050nI7.LIZIZ).get(templateScene);
            if (interfaceC1429080nIA == null || (listLIZLLL = interfaceC1429080nIA.LIZLLL(arrayList, arrayList2, c1429030nI5)) == null) {
                return C13BV.INSTANCE;
            }
            return listLIZLLL;
        }
        return C13BV.INSTANCE;
    }
}
