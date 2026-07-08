package X;

import a6n.a;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.editorpro.recordtab.EditorTabModule$preFetchTabBanner$2;
import com.ss.android.ugc.aweme.editorpro.recordtab.EditorTabViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.ss.android.ugc.gamora.celebration.PreloadConfig;
import com.ss.android.ugc.gamora.celebration.TabStyleConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t8B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653530t8B extends AbstractC1646530swt {
    public static volatile List<PreloadConfig> LLJJI;
    public static volatile boolean LLJJIII;
    public final C1DRG LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public EditorTabViewModel LLILZIL;
    public final ShortVideoContext LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1161));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1162));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(632));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1163));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1164));
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final boolean LLJILLL;
    public static final C1655280tB0 LLJJ = new C1655280tB0(new float[]{0.0f, 0.36f, 0.75f, 1.0f}, new float[]{-1.0f, 1.0f}, new int[]{-6357048, -16715320, -16716310, -16716310});
    public static final CountDownLatch LLJJIJI = new CountDownLatch(1);

    public static boolean LJII() {
        int iIntValue = ((Number) C0AGB.LIZ.getValue()).intValue();
        if (iIntValue <= 0) {
            return false;
        }
        return !(C0MW6.LIZ() >= iIntValue);
    }

    public final InterfaceC1648020szI LIZJ() {
        return (InterfaceC1648020szI) this.LLIZ.getValue();
    }

    public final List<PreloadConfig> LIZLLL() {
        List list = (List) this.LLJILJILJ.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((PreloadConfig) obj).LIZ;
            if (str != null) {
                C1420280n3y.LIZ.getClass();
                Keva kevaLIZIZ = C1420250n3v.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tab_style_dismissed_");
                sbLIZ.append("create_tab");
                sbLIZ.append('_');
                sbLIZ.append(str);
                if (!kevaLIZIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final AbstractC1653180t7c LJ() {
        return (AbstractC1653180t7c) this.LLIZLLLIL.getValue();
    }

    public final boolean LJI() {
        return this.LLJILJIL && LJII();
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return LJ();
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        return new C1653330t7r(C0MTD.LIZ(EnumC1647570syZ.EDITOR_TAB_TEXT_CREATE.getNameResId()), "record_mode_editor_tab", "editor", this.LLILLL, new InterfaceC1653360t7u() { // from class: X.0t8A
            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
            @Override // X.InterfaceC1653360t7u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onCelebrationStyleApplied(java.lang.String r12) {
                /*
                    Method dump skipped, instruction units count: 233
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1653520t8A.onCelebrationStyleApplied(java.lang.String):void");
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                TabStyleConfig tabStyleConfig;
                Integer num;
                CreativeModel creativeModel;
                C1638140sjM.LIZ(EnumC1647590syb.EDIT_TAB);
                aVar.LIZLLL().shootMode = 28;
                C1653530t8B c1653530t8B = this;
                a aVar2 = aVar;
                c1653530t8B.getClass();
                AbstractC1646530swt.LIZIZ(c1646490swp, aVar2);
                com.ss.android.ugc.aweme.shortvideo.component.a aVar3 = (com.ss.android.ugc.aweme.shortvideo.component.a) this.LLILLJJLI.LJIIL(null, com.ss.android.ugc.aweme.shortvideo.component.a.class);
                if (aVar3 != null) {
                    aVar3.eP2(false);
                }
                C0MWG c0mwg = C0MWG.LIZ;
                ShortVideoContext shortVideoContext = this.LLILZLL;
                c0mwg.getClass();
                if (shortVideoContext != null) {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("creation_id", shortVideoContext.getCreationId());
                    c0lab.LJ("shoot_way", shortVideoContext.shootWay);
                    c0lab.LJ("enter_from", "video_shoot_page");
                    C0MJO.LIZIZ(shortVideoContext.creativeModel, c0lab);
                    C20684815ws.LJIILLIIL("edit_tab_click", c0lab.LIZ);
                }
                C1653530t8B c1653530t8B2 = this;
                ShortVideoContext shortVideoContext2 = c1653530t8B2.LLILZLL;
                if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null) {
                    creativeModel.isFromEditTab = true;
                }
                for (PreloadConfig preloadConfig : (ArrayList) c1653530t8B2.LIZLLL()) {
                    String str = preloadConfig.LIZ;
                    if (str != null && (tabStyleConfig = preloadConfig.tab_style) != null && (num = tabStyleConfig.exit_strategy) != null && num.intValue() == 1) {
                        C1420280n3y.LIZ.getClass();
                        Keva kevaLIZIZ = C1420250n3v.LIZIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("tab_style_dismissed_");
                        sbLIZ.append("create_tab");
                        sbLIZ.append('_');
                        sbLIZ.append(str);
                        kevaLIZIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                    }
                }
                if (this.LJI() && !this.LLJILLL) {
                    C01TT.LIZJ(AFwS194S0000000_8.get$arr$(77));
                    InterfaceC1648020szI interfaceC1648020szILIZJ = this.LIZJ();
                    if (interfaceC1648020szILIZJ != null) {
                        interfaceC1648020szILIZJ.clearAIBrandTextByTag("record_mode_editor_tab");
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                InterfaceC1648020szI interfaceC1648020szILIZJ;
                CreativeModel creativeModel;
                PUgcTemplateData pUgcTemplateData;
                CreativeModel creativeModel2;
                C1653530t8B c1653530t8B = this;
                ShortVideoContext shortVideoContext = c1653530t8B.LLILZLL;
                if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null) {
                    creativeModel2.isFromEditTab = false;
                }
                ShortVideoContext shortVideoContext2 = c1653530t8B.LLILZIL.LLILZIL;
                if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null) {
                    pUgcTemplateData.isFromCreateTemplate = false;
                }
                if (c1653530t8B.LJI()) {
                    C1653530t8B c1653530t8B2 = this;
                    if (!c1653530t8B2.LLJILLL && (interfaceC1648020szILIZJ = c1653530t8B2.LIZJ()) != null) {
                        interfaceC1648020szILIZJ.showAIBrandTextByTag("record_mode_editor_tab", C1653530t8B.LLJJ);
                    }
                }
                return false;
            }
        }, new AwS569S0100000_25(this, 152), false, null, LIZLLL(), 192);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        String str;
        CreativeModel creativeModel;
        LandingModel landingModel;
        LandingModel landingModel2;
        LandingModel landingModel3;
        EditorTabViewModel editorTabViewModel = (EditorTabViewModel) ((C1659660tI4) this.LLILLJJLI.LJII(C1659660tI4.class, null)).LIZ(EditorTabViewModel.class);
        this.LLILZIL = editorTabViewModel;
        ShortVideoContext shortVideoContext = this.LLILZLL;
        if (shortVideoContext != null) {
            editorTabViewModel.LLILZIL = shortVideoContext;
            CreativeModel creativeModel2 = shortVideoContext.creativeModel;
            if (creativeModel2 != null && (landingModel3 = creativeModel2.landingModel) != null) {
                str = landingModel3.landingTab;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "editor_tab")) {
                C569600MVq.LIZ = true;
            }
            if (this.LLILLL && (creativeModel = this.LLILZLL.creativeModel) != null && (((landingModel = creativeModel.landingModel) == null || (landingModel.landingTab == null && creativeModel != null)) && (landingModel2 = creativeModel.landingModel) != null)) {
                landingModel2.defaultLandingCreateTab = true;
            }
            RecordMVViewModel recordMVViewModel = (RecordMVViewModel) ((C1659660tI4) this.LLILLJJLI.LJII(C1659660tI4.class, null)).LIZ(RecordMVViewModel.class);
            ShortVideoContext shortVideoContext2 = this.LLILZLL;
            if (shortVideoContext2 != null) {
                recordMVViewModel.LLIZ = shortVideoContext2;
            }
            recordMVViewModel.LLILZIL = ((ShortVideoContext) this.LLILLJJLI.LJII(ShortVideoContext.class, null)).enterMvThemeEffect;
            recordMVViewModel.LLILZLL = ((ShortVideoContext) this.LLILLJJLI.LJII(ShortVideoContext.class, null)).enterCutsameId;
            if (!aVar.LIZ().isFinishing()) {
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        if (C539900LFk.LJII(this.LLILZLL)) {
                            InterfaceC524270KhF interfaceC524270KhF = (InterfaceC524270KhF) this.LLJIJIL.getValue();
                            if (interfaceC524270KhF != null) {
                                interfaceC524270KhF.UM2(new C1425060nBg(LJ(), this.LLILLJJLI, recordMVViewModel.lR2().creativeModel.templateSchemaData.landingSubTab));
                            }
                        } else {
                            RecordTaskManager.LIZ(new C1425060nBg(LJ(), this.LLILLJJLI, recordMVViewModel.lR2().creativeModel.templateSchemaData.landingSubTab), false);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (LJII()) {
                ((C569450MVb) this.LLJ.getValue()).LLJ = new AwS604S0100000_25(this, 943);
                LJ().getLifecycle().addObserver(new EditorTabModule$preFetchTabBanner$2(this));
                if (C539900LFk.LJII(this.LLILZLL)) {
                    InterfaceC524270KhF interfaceC524270KhF2 = (InterfaceC524270KhF) this.LLJIJIL.getValue();
                    if (interfaceC524270KhF2 != null) {
                        interfaceC524270KhF2.UM2((AbstractRunnableC21377818lM) this.LLJ.getValue());
                    }
                } else {
                    RecordTaskManager.LIZ((C569450MVb) this.LLJ.getValue(), false);
                }
            }
            if (C1647240sy2.LIZ().preloadDraftOpt) {
                if (C539900LFk.LJII(this.LLILZLL)) {
                    InterfaceC524270KhF interfaceC524270KhF3 = (InterfaceC524270KhF) this.LLJIJIL.getValue();
                    if (interfaceC524270KhF3 != null) {
                        interfaceC524270KhF3.UM2((AbstractRunnableC21377818lM) this.LLJI.getValue());
                        return;
                    }
                    return;
                }
                RecordTaskManager.LIZ((C1661760tLS) this.LLJI.getValue(), false);
            }
        }
    }

    public final void LJIIIIZZ(String str, boolean z) {
        String str2;
        Object next;
        if (str == null && !z) {
            return;
        }
        int i = 1;
        if (str == null) {
            Iterator it2 = ((List) this.LLJILJILJ.getValue()).iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            } while (((PreloadConfig) next).LIZ == null);
            PreloadConfig preloadConfig = (PreloadConfig) next;
            if (preloadConfig == null || (str2 = preloadConfig.LIZ) == null) {
                return;
            }
        } else {
            str2 = str;
        }
        C0MWG c0mwg = C0MWG.LIZ;
        if (str == null) {
            i = 0;
        }
        c0mwg.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("activity_id", str2);
        c0lab.LIZ(i, "variation_status");
        c0lab.LIZ(z ? 1 : 0, "tooltip_status");
        C20684815ws.LJIILLIIL("createtab_activity_guide_show", c0lab.LIZ);
    }

    public C1653530t8B(C1DRG c1drg, String str, boolean z) {
        boolean zBooleanValue;
        this.LLILLJJLI = c1drg;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = (EditorTabViewModel) ((C1659660tI4) c1drg.LJII(C1659660tI4.class, null)).LIZ(EditorTabViewModel.class);
        this.LLILZLL = (ShortVideoContext) c1drg.LJIIL(null, ShortVideoContext.class);
        Boolean bool = C1653590t8H.LIZ;
        boolean z2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = C0MWD.LIZ().getBoolean("has_ai_tools", false);
        }
        this.LLJILJIL = zBooleanValue;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 153));
        ArrayList arrayList = (ArrayList) LIZLLL();
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((PreloadConfig) it2.next()).tab_style != null) {
                    z2 = true;
                    break;
                }
            }
        }
        this.LLJILLL = z2;
    }
}
