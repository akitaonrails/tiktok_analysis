package X;

import a6n.a;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.aweme.template.TemplateLottieKey;
import com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0MTC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MTC extends AbstractC1646530swt {
    public final C1DRG LLILLJJLI;
    public RecordMVViewModel LLILZ;
    public final ShortVideoContext LLILZLL;
    public C1295960jpS LLIZLLLIL;
    public final boolean LLILLL = false;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1109));
    public C0MWA LLIZ = C0MWC.LIZ;

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return (AbstractC1653180t7c) this.LLILZIL.getValue();
    }

    public static final C0MWA LIZJ() {
        if (C0CHQ.LIZ().getAccountService().LJIIJJI()) {
            return C0MWC.LIZ;
        }
        TemplateLottieKey templateLottieKey = (TemplateLottieKey) C0LAA.LIZ.getValue();
        if (templateLottieKey == null) {
            return C0MWC.LIZ;
        }
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        C0L62.LIZ.getClass();
        if (!c2137908Zd.LJFF(C0L62.LIZLLL("template_eoy_camera_tab.json"))) {
            return C0MWC.LIZ;
        }
        Keva repo = Keva.getRepo("keva_repo_auto_cut_operational_activity");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C538490L9z.LIZ());
        sbLIZ.append("template_camera_tab_show_time");
        long j = repo.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j == 0 && templateLottieKey.isAutoPlayFirstTime()) {
            return C0MWB.LIZ;
        }
        if (System.currentTimeMillis() - j >= 172800000) {
            List<Long> list = templateLottieKey.timeStamp;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<Long> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (System.currentTimeMillis() - it2.next().longValue() < 172800000) {
                        return C0MWB.LIZ;
                    }
                }
            }
        }
        return templateLottieKey.isShowEndFrame() ? C0MW9.LIZ : C0MWC.LIZ;
    }

    public C0MTC(C1DRG c1drg) {
        this.LLILLJJLI = c1drg;
        this.LLILZLL = (ShortVideoContext) c1drg.LJIIL(null, ShortVideoContext.class);
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(final a aVar) {
        String str;
        boolean z;
        CreativeModel creativeModel;
        LandingModel landingModel;
        String strLIZ = C0MTD.LIZ(EnumC1647570syZ.TEMPLATES.getNameResId());
        ShortVideoContext shortVideoContext = this.LLILZLL;
        RecordMVViewModel recordMVViewModel = null;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (landingModel = creativeModel.landingModel) != null) {
            str = landingModel.landingTab;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "mv")) {
            if (!this.LLILLL) {
                RecordMVViewModel recordMVViewModel2 = this.LLILZ;
                if (recordMVViewModel2 == null) {
                    recordMVViewModel2 = null;
                }
                if (!C123100dR.LIZ(recordMVViewModel2.LLILZLL) || !C0MPK.LJ() || !C0CHQ.LIZ().LJFF().LJII()) {
                    RecordMVViewModel recordMVViewModel3 = this.LLILZ;
                    if (recordMVViewModel3 == null) {
                        recordMVViewModel3 = null;
                    }
                    ShortVideoContext shortVideoContextLR2 = recordMVViewModel3.lR2();
                    if (C0MPK.LJ() && shortVideoContextLR2 != null && (!shortVideoContextLR2.LJJLL())) {
                        RecordMVViewModel recordMVViewModel4 = this.LLILZ;
                        if (recordMVViewModel4 != null) {
                            recordMVViewModel = recordMVViewModel4;
                        }
                        if (recordMVViewModel.LLILZIL == null) {
                        }
                    }
                }
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        return new C1653330t7r(strLIZ, "record_mode_mv", "mv", z, new InterfaceC1653360t7u() { // from class: X.0MkT
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str2) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                TemplateLottieKey templateLottieKey;
                q value;
                InterfaceC21363518j3 interfaceC21363518j3Wt2;
                ShortVideoContext shortVideoContext2 = this.LIZ.LLILZLL;
                if (shortVideoContext2 != null) {
                    shortVideoContext2.shootMode = 0;
                }
                C1638140sjM.LIZ(EnumC1647590syb.MV_TAB);
                RecordMVViewModel recordMVViewModel5 = null;
                com.ss.android.ugc.aweme.shortvideo.component.a aVar2 = (com.ss.android.ugc.aweme.shortvideo.component.a) this.LIZ.LLILLJJLI.LJIIL(null, com.ss.android.ugc.aweme.shortvideo.component.a.class);
                if (aVar2 != null) {
                    aVar2.eP2(false);
                }
                RecordMVViewModel recordMVViewModel6 = this.LIZ.LLILZ;
                if (recordMVViewModel6 == null) {
                    recordMVViewModel6 = null;
                }
                if (recordMVViewModel6.lR2().cameraComponentModel.curBackgroundVideo != null && (value = aVar.LJ().getValue()) != null && (interfaceC21363518j3Wt2 = value.wt2()) != null) {
                    interfaceC21363518j3Wt2.LJ();
                }
                C0MTC c0mtc = this.LIZ;
                a aVar3 = aVar;
                c0mtc.getClass();
                AbstractC1646530swt.LIZIZ(c1646490swp, aVar3);
                if (aVar.LIZ() != null) {
                    ICommerceToolsMissionService iCommerceToolsMissionService = (ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class);
                    C19EG c19egLIZ = aVar.LIZ();
                    RecordMVViewModel recordMVViewModel7 = this.LIZ.LLILZ;
                    if (recordMVViewModel7 != null) {
                        recordMVViewModel5 = recordMVViewModel7;
                    }
                    iCommerceToolsMissionService.LJIIIZ(recordMVViewModel5.lR2(), c19egLIZ);
                }
                if (Intrinsics.LJFF(this.LIZ.LLIZ, C0MWB.LIZ) && (templateLottieKey = (TemplateLottieKey) C0LAA.LIZ.getValue()) != null && templateLottieKey.isQuitAfterClick()) {
                    C538490L9z.LJ(Long.MAX_VALUE);
                }
                C1295960jpS c1295960jpS = this.LIZ.LLIZLLLIL;
                if (c1295960jpS != null) {
                    C786410Ut5.f5(c1295960jpS, 1.0f);
                }
                return false;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                C385670FAf<ln3.a> c385670FAfEx;
                ln3.a aVarLIZJ;
                q value;
                InterfaceC21363518j3 interfaceC21363518j3Wt2;
                RecordMVViewModel recordMVViewModel5 = this.LIZ.LLILZ;
                TemplateCategoryData templateCategoryDataY8 = null;
                if (recordMVViewModel5 == null) {
                    recordMVViewModel5 = null;
                }
                if (recordMVViewModel5.lR2().cameraComponentModel.curBackgroundVideo != null && (value = aVar.LJ().getValue()) != null && (interfaceC21363518j3Wt2 = value.wt2()) != null) {
                    interfaceC21363518j3Wt2.LJIIIIZZ();
                }
                C0MTC c0mtc = this.LIZ;
                a aVar2 = aVar;
                c0mtc.getClass();
                AbstractC1646530swt.LIZ(c1646490swp, aVar2);
                a aVar3 = aVar;
                if (aVar3.LIZ) {
                    InterfaceC1647420syK interfaceC1647420syK = aVar3.LIZJ;
                    if (interfaceC1647420syK != null && (c385670FAfEx = interfaceC1647420syK.ex()) != null && (aVarLIZJ = c385670FAfEx.LIZJ()) != null) {
                        aVarLIZJ.Ec();
                    }
                } else {
                    ln3.a aVar4 = aVar3.LIZLLL;
                    if (aVar4 != null) {
                        aVar4.Ec();
                    }
                }
                RecordMVViewModel recordMVViewModel6 = this.LIZ.LLILZ;
                if (recordMVViewModel6 == null) {
                    recordMVViewModel6 = null;
                }
                recordMVViewModel6.lR2().creativeModel.pugcTemplateData.isFromCreateTemplate = false;
                C0MTC c0mtc2 = this.LIZ;
                ShortVideoContext shortVideoContext2 = c0mtc2.LLILZLL;
                if (shortVideoContext2 != null) {
                    C1419580n2q c1419580n2q = C1419580n2q.LIZ;
                    InterfaceC1422570n7f interfaceC1422570n7f = (InterfaceC1422570n7f) c0mtc2.LLILLJJLI.LJIIL(null, InterfaceC1422570n7f.class);
                    if (interfaceC1422570n7f != null) {
                        templateCategoryDataY8 = interfaceC1422570n7f.Y8();
                    }
                    c1419580n2q.getClass();
                    C1419580n2q.LIZLLL(shortVideoContext2, "click_tab", templateCategoryDataY8);
                }
                C1295960jpS c1295960jpS = this.LIZ.LLIZLLLIL;
                if (c1295960jpS != null) {
                    C786410Ut5.f5(c1295960jpS, 0.8f);
                }
                return false;
            }
        }, null, !Intrinsics.LJFF(LIZJ(), C0MWC.LIZ), new AwS622S0100000_8(this, 56), null, 288);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        RecordMVViewModel recordMVViewModel = null;
        RecordMVViewModel recordMVViewModel2 = (RecordMVViewModel) ((C1659660tI4) this.LLILLJJLI.LJII(C1659660tI4.class, null)).LIZ(RecordMVViewModel.class);
        this.LLILZ = recordMVViewModel2;
        if (recordMVViewModel2 == null) {
            recordMVViewModel2 = null;
        }
        recordMVViewModel2.LLIZ = aVar.LIZLLL();
        RecordMVViewModel recordMVViewModel3 = this.LLILZ;
        if (recordMVViewModel3 == null) {
            recordMVViewModel3 = null;
        }
        recordMVViewModel3.LLILZIL = ((ShortVideoContext) this.LLILLJJLI.LJII(ShortVideoContext.class, null)).enterMvThemeEffect;
        RecordMVViewModel recordMVViewModel4 = this.LLILZ;
        if (recordMVViewModel4 == null) {
            recordMVViewModel4 = null;
        }
        recordMVViewModel4.LLILZLL = ((ShortVideoContext) this.LLILLJJLI.LJII(ShortVideoContext.class, null)).enterCutsameId;
        C19EG c19egLIZ = aVar.LIZ();
        if (c19egLIZ != null && !C20622515mp.LJIILIIL(c19egLIZ)) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    AbstractC1653180t7c abstractC1653180t7c = (AbstractC1653180t7c) this.LLILZIL.getValue();
                    C1DRG c1drg = this.LLILLJJLI;
                    RecordMVViewModel recordMVViewModel5 = this.LLILZ;
                    if (recordMVViewModel5 != null) {
                        recordMVViewModel = recordMVViewModel5;
                    }
                    RecordTaskManager.LIZ(new C1425060nBg(abstractC1653180t7c, c1drg, recordMVViewModel.lR2().creativeModel.templateSchemaData.landingSubTab), false);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
