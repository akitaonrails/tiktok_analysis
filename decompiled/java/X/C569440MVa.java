package X;

import Y.AObjectS241S0100000_8;
import Y.AObserverS212S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.api.tab.IPugcCreatorService;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.editorpro.recordtab.EditorTabViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.story.forward.CelebrationRenderVideoInfo;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS137S0400000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569440MVa extends i<InterfaceC569560MVm, C569640MVu, C569470MVd, C569540MVk> implements InterfaceC569560MVm, InterfaceC379610EuV {
    public static final C569520MVi LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final ShortVideoContext LLJJ;
    public final EditorTabViewModel LLJJI;
    public final MutableLiveData<String> LLJJIII;
    public final Function0<C569470MVd> LLJJIJI;
    public final Function0<C569540MVk> LLJJIJIIJIL;
    public final MutableLiveData<Boolean> LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public Scene LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0MVi] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C569440MVa.class, "editTabStateApi", "getEditTabStateApi()Lcom/ss/android/ugc/aweme/editorpro/EditorTabStateApi;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C569440MVa.class, "templateListApi", "getTemplateListApi()Lcom/ss/android/ugc/aweme/editorpro/TemplateHelpApi;", 0)};
        LLJZIJLIL = new Object() { // from class: X.0MVi
        };
    }

    private final InterfaceC1425510nCP C5() {
        return (InterfaceC1425510nCP) this.LLJJJ.getValue(this, LLL[0]);
    }

    private final void O4() {
        ICelebrationCreateService iCelebrationCreateServiceT5;
        Context contextLIZIZ = C545820Lau.LIZIZ(this.LLJILJILJ);
        if (contextLIZIZ == null || (iCelebrationCreateServiceT5 = t5()) == null) {
            return;
        }
        iCelebrationCreateServiceT5.loadCelebrationMaterial(contextLIZIZ, 7);
    }

    private final C365380EUe S5() {
        return (C365380EUe) this.LLJLLIL.getValue();
    }

    private final InterfaceC566960MLm U5() {
        return (InterfaceC566960MLm) this.LLJJJJJIL.getValue();
    }

    private final void W6() {
        C18YA c18ya = new C18YA();
        c18ya.LIZ(new AwS552S0100000_8(this, 124));
        c18ya.LIZ.LLJJLIIIJLLLLLLLZ = true;
        c18ya.LIZIZ(EnumC214804194o.AUTO_SIZE);
        c18ya.LIZ.LLLII = true;
        CreativeBottomSheetBehavior<?> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
        creativeBottomSheetBehavior.LJJ = false;
        creativeBottomSheetBehavior.LJIIJ = false;
        C214799194j c214799194j = c18ya.LIZ;
        c214799194j.LLJLILLLLZIIL = creativeBottomSheetBehavior;
        c214799194j.LLLLL(this.LLJILJILJ);
    }

    private final AIPortraitEnterParams d5() {
        return (AIPortraitEnterParams) this.LLJZ.getValue();
    }

    private final InterfaceC1424260nAO d6() {
        return (InterfaceC1424260nAO) this.LLJJJIL.getValue(this, LLL[1]);
    }

    private final IAITheaterCreationLauncher.EnterParams k5() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLJLLL.getValue();
    }

    private final ICelebrationCreateService t5() {
        return (ICelebrationCreateService) this.LLJJJJLIIL.getValue();
    }

    private final C560860LzA v5() {
        return (C560860LzA) this.LLJJL.getValue();
    }

    private final IAVDraftService x5() {
        return (IAVDraftService) this.LLJJJJ.getValue();
    }

    @Override // ge.i
    public Function0<C569640MVu> E3() {
        return new AwS552S0100000_8(this, 123);
    }

    public final String E5() {
        C0LBG.LIZ.getClass();
        return C0LBG.LIZIZ();
    }

    public final Scene F4() {
        return new C1851150yGv();
    }

    public final Keva H5() {
        return (Keva) this.LLJLL.getValue();
    }

    public final void J6() {
        Context contextLIZIZ = C545820Lau.LIZIZ(this.LLJILJILJ);
        if (contextLIZIZ == null) {
            return;
        }
        S5().LJIIJJI(contextLIZIZ, "editor_pro_tab_entrance", null, new C0E0V<ResourceItem>() { // from class: X.0EUh
            @Override // X.InterfaceC365520EUs
            public final void LIZIZ(List<? extends ResourceItem> list, boolean z) {
                String string;
                ArrayList arrayList = new ArrayList(list);
                C569440MVa c569440MVa = this.LIZ;
                ResourceItem resourceItem = new ResourceItem();
                Context sceneContext = c569440MVa.LLJILJILJ.getSceneContext();
                if (sceneContext != null) {
                    string = sceneContext.getString(2131829636);
                } else {
                    string = null;
                }
                resourceItem.setName(string);
                resourceItem.setHint(resourceItem.getName());
                resourceItem.extra = "{\"ep_feature_scheme\":\"editor://createPUGCTemplate\"}";
                arrayList.add(resourceItem);
                this.LIZ.m6(arrayList, true);
            }
        });
    }

    private final Uri D5() {
        C0VSJ c0vsjLIZJ;
        if (C0MQ1.LIZIZ() && this.LLJJ.creativeModel.editorProDraftModel.isEoyCreateTabOn) {
            C0LBG.LIZ.getClass();
            C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
            C0VSJ c0vsjLIZJ2 = C0LBG.LIZJ("create_tab_eoy_album_guide.png");
            if (c2137908Zd.LJFF(c0vsjLIZJ2 != null ? c0vsjLIZJ2.getAbsolutePath() : null) && (c0vsjLIZJ = C0LBG.LIZJ("create_tab_eoy_album_guide.png")) != null) {
                return Uri.fromFile(c0vsjLIZJ);
            }
        }
        return null;
    }

    private final int N5() {
        List<Long> list;
        CelebrationRenderVideoInfo celebrationRenderVideoInfoR5 = R5();
        if (celebrationRenderVideoInfoR5 == null || (list = celebrationRenderVideoInfoR5.originalItemIds) == null) {
            return 0;
        }
        return list.size();
    }

    private final void P4() {
        S5().LJII("editor_pro_tab_entrance", false, false, false, new C0E0V<ResourceItem>() { // from class: X.0EUv
            @Override // X.C0E0V, X.InterfaceC365520EUs
            public final void LIZ(C0EDV c0edv) {
                this.LIZ.J6();
            }

            @Override // X.InterfaceC365520EUs
            public final void LIZIZ(List<? extends ResourceItem> list, boolean z) {
                C569440MVa c569440MVa = this.LIZ;
                if (c569440MVa.LLJLIL) {
                    if (!c569440MVa.LLJLILLLLZIIL) {
                        if (list.isEmpty()) {
                            this.LIZ.J6();
                        } else {
                            this.LIZ.m6(list, false);
                        }
                    }
                    this.LIZ.LLJLIL = false;
                }
            }
        });
    }

    private final CelebrationRenderVideoInfo R5() {
        Object objMo315getRenderVideoInfoIoAF18A = ((ICelebrationCreateService) ServiceManager.get().getService(ICelebrationCreateService.class)).mo315getRenderVideoInfoIoAF18A(2);
        if (C189200o6.m7isFailureimpl(objMo315getRenderVideoInfoIoAF18A)) {
            objMo315getRenderVideoInfoIoAF18A = null;
        }
        return (CelebrationRenderVideoInfo) objMo315getRenderVideoInfoIoAF18A;
    }

    private final void u6() {
        C5().zT().observe(this, new AObserverS212S0100000_8(this, 29));
        C5().ey1(new InterfaceC21580219cu() { // from class: X.0MVg
            @Override // X.InterfaceC21580219cu
            public final void LJI() {
            }

            @Override // X.InterfaceC21580219cu
            public final void b3() {
            }

            @Override // X.InterfaceC21580219cu
            public final void c3() {
            }

            @Override // X.InterfaceC21580219cu
            public final void d3(int i) {
            }

            @Override // X.InterfaceC21580219cu
            public final void a3(int i) {
                this.LIZ.H4(i);
            }
        });
        d6().Un().LIZ(this, new AObjectS241S0100000_8(this, 3));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        K4(false);
        O4();
        u6();
    }

    @Override // X.InterfaceC569560MVm
    public /* bridge */ /* synthetic */ LiveData C70() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC569560MVm
    public /* bridge */ /* synthetic */ LiveData JP2() {
        return this.LLJJIII;
    }

    public MutableLiveData<String> M5() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public MutableLiveData<Boolean> n5() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C569470MVd> o2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C569540MVk> w2() {
        return this.LLJJIJIIJIL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void K6(java.util.List<X.C569570MVn> r9) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C569440MVa.K6(java.util.List):void");
    }

    private final String N6(String str) {
        String strOptString = "";
        if (str == null) {
            return "";
        }
        try {
            strOptString = new JSONObject(str).optString("ep_feature_scheme");
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }

    private final List<C569570MVn> T4(List<C569570MVn> list) {
        if (C2536009wk.LIZ() == 1) {
            return list;
        }
        if (C2536009wk.LIZ() == 2) {
            return list.subList(0, 2);
        }
        ArrayList arrayList = new ArrayList();
        C13LP.LLFII(list, arrayList);
        C569480MVe c569480MVe = C569480MVe.LIZ;
        ShortVideoContext shortVideoContext = this.LLJJ;
        c569480MVe.getClass();
        if (C0MGG.LIZIZ.LIZ(shortVideoContext)) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (C569460MVc.LJI((C569570MVn) next)) {
                    if (next != null) {
                        arrayList.remove(next);
                    }
                }
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (C569460MVc.LIZIZ((C569570MVn) next2)) {
                    if (next2 != null) {
                        arrayList.remove(next2);
                    }
                }
            }
        }
        C569480MVe.LIZ.getClass();
        if (!s.LJIIIIZZ(false)) {
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next3 = it4.next();
                if (C569460MVc.LJFF((C569570MVn) next3)) {
                    if (next3 != null) {
                        arrayList.remove(next3);
                    }
                }
            }
        }
        Iterator it5 = arrayList.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next4 = it5.next();
            if (C569460MVc.LJII((C569570MVn) next4)) {
                if (next4 != null) {
                    arrayList.remove(next4);
                }
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.194j] */
    private final void T6(Uri uri) {
        Integer numLIZJ;
        if (uri == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        C18YA c18ya = new C18YA();
        c18ya.LIZ(new AwS137S0400000_8(this, (C569440MVa) uri, (Uri) c259800zU2, (C259800zU<String>) c259800zU, (C259800zU<C214799194j>) 1));
        c18ya.LIZIZ(EnumC214804194o.FREEDOM_HEIGHT);
        Context contextRequireSceneContext = this.LLJILJILJ.requireSceneContext();
        if (contextRequireSceneContext != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1_, contextRequireSceneContext);
        } else {
            numLIZJ = null;
        }
        ?? r1 = c18ya.LIZ;
        r1.LLLIIIIL = numLIZJ;
        r1.LLLII = true;
        r1.LLJLLL = AFwS194S0000000_8.get$arr$(81);
        c259800zU.element = r1;
        r1.LLLLL(this.LLJILJILJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<X.C569570MVn> Z4(java.util.List<X.C569570MVn> r12) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C569440MVa.Z4(java.util.List):java.util.List");
    }

    public final void H4(int i) {
        View view;
        float f;
        Scene scene = this.LLJJLIIIJLLLLLLLZ;
        if (scene != null && (view = scene.mView) != null) {
            Rect rect = new Rect();
            if (!view.getLocalVisibleRect(rect)) {
                if (this.LLJL == 0.0f) {
                    return;
                } else {
                    f = 0.0f;
                }
            } else {
                float fHeight = rect.height();
                int height = view.getHeight();
                if (height < 1) {
                    height = 1;
                }
                f = fHeight / height;
                if (f < 0.0f || f > 1.0f) {
                    return;
                }
            }
            if (f != this.LLJL) {
                C786410Ut5.T4(view, f);
                this.LLJL = f;
            }
        }
    }

    public final void K4(boolean z) {
        if (z) {
            P4();
        } else if (C2536009wk.LIZ() == 3) {
            J6();
        } else {
            S5().LJII("editor_pro_tab_entrance", true, false, false, new InterfaceC365520EUs<ResourceItem>() { // from class: X.0EUw
                @Override // X.InterfaceC365520EUs
                public final void onStart() {
                }

                @Override // X.InterfaceC365520EUs
                public final void LIZ(C0EDV c0edv) {
                    C569440MVa c569440MVa = this.LIZ;
                    c569440MVa.LLJLIL = true;
                    c569440MVa.J6();
                }

                @Override // X.InterfaceC365520EUs
                public final void LIZIZ(List<? extends ResourceItem> list, boolean z2) {
                    if (list.isEmpty()) {
                        this.LIZ.J6();
                    } else {
                        this.LIZ.m6(list, false);
                    }
                }
            });
            P4();
        }
    }

    public final void L6(C569570MVn c569570MVn) {
        String creationId;
        InterfaceC550750Lir interfaceC550750LirG9;
        String strLJI;
        InterfaceC550750Lir interfaceC550750LirG92;
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        AITheaterProfileService aITheaterProfileService;
        InterfaceC528960Koo interfaceC528960KooJ9;
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        LandingModel landingModel;
        this.LLJJIII.setValue(c569570MVn.LIZLLL);
        if (C569460MVc.LJIIIIZZ(c569570MVn)) {
            d6().jd();
            return;
        }
        C569480MVe c569480MVe = C569480MVe.LIZ;
        String str = c569570MVn.LIZLLL;
        c569480MVe.getClass();
        if (TextUtils.equals(C569480MVe.LIZIZ(str).toLowerCase(Locale.getDefault()), "mae_draft_list")) {
            W6();
            return;
        }
        String str2 = "create_tab";
        int i = 1;
        if (C569460MVc.LJ(c569570MVn)) {
            C0MWG c0mwg = C0MWG.LIZ;
            ShortVideoContext shortVideoContext = this.LLJJ;
            c0mwg.getClass();
            C0MWG.LIZ("visual_poet", shortVideoContext, false);
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService != null && (interfaceC21300818XmLIZ = iAiChatFeatureService.LIZ()) != null) {
                Activity activityLJII = C1664590tQ1.LJII(this);
                String creationId2 = this.LLJJ.creativeInfo.getCreationId();
                ShortVideoContext shortVideoContext2 = this.LLJJ;
                String str3 = shortVideoContext2.shootWay;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = shortVideoContext2.enterFrom;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = shortVideoContext2.enterMethod;
                if (str6 != null) {
                    str4 = str6;
                }
                CreativeModel creativeModel = shortVideoContext2.creativeModel;
                if (creativeModel != null && (landingModel = creativeModel.landingModel) != null && landingModel.defaultLandingCreateTab) {
                    str2 = "default_landing_create_tab";
                }
                interfaceC21300818XmLIZ.LJ(activityLJII, creationId2, str3, str5, str4, str2);
                return;
            }
            return;
        }
        if (C569460MVc.LIZJ(c569570MVn)) {
            C0MWG c0mwg2 = C0MWG.LIZ;
            ShortVideoContext shortVideoContext3 = this.LLJJ;
            c0mwg2.getClass();
            C0MWG.LIZ("aitheater", shortVideoContext3, false);
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C1E3C c1e3c = C1E3C.LJIIIIZZ;
            InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(k5());
            AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
            c548880Lfq.getClass();
            C548880Lfq.LIZLLL(c1e3c, interfaceC548750LfdLIZ, aFwS239S0000000_8);
            String strLIZ = C528840Koc.LIZ();
            AIGCEntranceInfo aIGCEntranceInfo = k5().entranceInfo;
            if (aIGCEntranceInfo != null && (aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null)) != null && (interfaceC528960KooJ9 = aITheaterProfileService.j9()) != null) {
                interfaceC528960KooJ9.LIZLLL(strLIZ, aIGCEntranceInfo);
            }
            IAITheaterFeatureService.LIZ.getClass();
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ.LIZ()) != null) {
                iAITheaterCreationLauncherLIZ.LIZ(k5(), C1664590tQ1.LJII(this), strLIZ, true, null);
                return;
            }
            return;
        }
        if (TextUtils.equals(c569570MVn.LIZLLL.toLowerCase(Locale.getDefault()), "add_draft")) {
            v5().LIZ(x5(), this.LLJJ);
            return;
        }
        String str7 = null;
        if (C569460MVc.LIZIZ(c569570MVn)) {
            String str8 = c569570MVn.LIZLLL;
            c569480MVe.getClass();
            if (C569480MVe.LIZ(str8)) {
                C0MWG c0mwg3 = C0MWG.LIZ;
                String strLIZIZ = C569480MVe.LIZIZ(c569570MVn.LIZLLL);
                ShortVideoContext shortVideoContext4 = this.LLJJ;
                c0mwg3.getClass();
                C0MWG.LIZ(strLIZIZ, shortVideoContext4, false);
                C0MGG.LIZIZ.LIZIZ(this.LLJILJILJ, getDiContainer());
                InterfaceC1648020szI interfaceC1648020szI = (InterfaceC1648020szI) getDiContainer().LJIIL(null, InterfaceC1648020szI.class);
                if (interfaceC1648020szI != null) {
                    interfaceC1648020szI.showBottomTab(false);
                }
                C5().AT1(true);
                return;
            }
        }
        if (C569460MVc.LIZ(c569570MVn)) {
            String str9 = c569570MVn.LIZLLL;
            c569480MVe.getClass();
            if (C569480MVe.LIZ(str9)) {
                AIGCEntranceInfo aIGCEntranceInfo2 = d5().entranceInfo;
                if (aIGCEntranceInfo2 != null) {
                    int iLIZIZ = -99;
                    if (aIGCEntranceInfo2.hasCameo == -99) {
                        AITheaterProfileService.LIZ.getClass();
                        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
                        if (aITheaterProfileServiceLIZ != null && (interfaceC550750LirG92 = aITheaterProfileServiceLIZ.g9()) != null) {
                            iLIZIZ = interfaceC550750LirG92.LIZIZ();
                        }
                        aIGCEntranceInfo2.hasCameo = iLIZIZ;
                    }
                    String str10 = aIGCEntranceInfo2.faceIdCreatedWay;
                    String str11 = "unknown";
                    if (str10 == null || Intrinsics.LJFF(str10, "unknown")) {
                        AITheaterProfileService.LIZ.getClass();
                        AITheaterProfileService aITheaterProfileServiceLIZ2 = C563290M7j.LIZ();
                        if (aITheaterProfileServiceLIZ2 != null && (interfaceC550750LirG9 = aITheaterProfileServiceLIZ2.g9()) != null && (strLJI = interfaceC550750LirG9.LJI()) != null) {
                            str11 = strLJI;
                        }
                        aIGCEntranceInfo2.faceIdCreatedWay = str11;
                    }
                }
                C0MWG c0mwg4 = C0MWG.LIZ;
                String strLIZIZ2 = C569480MVe.LIZIZ(c569570MVn.LIZLLL);
                ShortVideoContext shortVideoContext5 = this.LLJJ;
                c0mwg4.getClass();
                C0MWG.LIZ(strLIZIZ2, shortVideoContext5, false);
                C0MGJ.LIZIZ.LIZ(getDiContainer(), this.LLJILJILJ, d5());
                C548880Lfq c548880Lfq2 = C548880Lfq.LIZ;
                C2275121E3i c2275121E3i = C2275121E3i.LJII;
                InterfaceC548750Lfd interfaceC548750LfdLIZ2 = C548910Lft.LIZ(d5());
                AFwS239S0000000_8 aFwS239S0000000_82 = AFwS239S0000000_8.get$arr$(260);
                c548880Lfq2.getClass();
                C548880Lfq.LIZLLL(c2275121E3i, interfaceC548750LfdLIZ2, aFwS239S0000000_82);
                InterfaceC1648020szI interfaceC1648020szI2 = (InterfaceC1648020szI) getDiContainer().LJIIL(null, InterfaceC1648020szI.class);
                if (interfaceC1648020szI2 != null) {
                    interfaceC1648020szI2.showBottomTab(false);
                }
                C5().AT1(true);
                return;
            }
        }
        if (C569460MVc.LIZLLL(c569570MVn)) {
            String str12 = c569570MVn.LIZLLL;
            c569480MVe.getClass();
            if (C569480MVe.LIZ(str12)) {
                C0MWG c0mwg5 = C0MWG.LIZ;
                String strLIZIZ3 = C569480MVe.LIZIZ(c569570MVn.LIZLLL);
                ShortVideoContext shortVideoContext6 = this.LLJJ;
                c0mwg5.getClass();
                C0MWG.LIZ(strLIZIZ3, shortVideoContext6, true);
                C536590L2r.LIZIZ.LIZ(getDiContainer(), this.LLJILJILJ);
                return;
            }
        }
        C569590MVp.LIZIZ.LIZJ(c569570MVn.LIZLLL, this.LLJILJILJ, this.LLJJ);
        if (C569460MVc.LJI(c569570MVn)) {
            try {
                C569610MVr.LIZ(LifecycleOwnerKt.getLifecycleScope(this.LLJILJILJ), this.LLJILJILJ.requireActivity());
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (TextUtils.equals(c569570MVn.LIZLLL.toLowerCase(Locale.getDefault()), "end_of_year")) {
            ICelebrationCreateService iCelebrationCreateServiceT5 = t5();
            if (iCelebrationCreateServiceT5 != null && ICelebrationCreateService.DefaultImpls.checkMaterialReady$default(iCelebrationCreateServiceT5, 2, false, 2, null)) {
                Context contextLIZIZ = C545820Lau.LIZIZ(this.LLJILJILJ);
                if (contextLIZIZ == null) {
                    return;
                }
                ShortVideoContext shortVideoContext7 = this.LLJJ;
                if (shortVideoContext7 != null) {
                    creationId = shortVideoContext7.getCreationId();
                } else {
                    creationId = null;
                }
                ShortVideoContext shortVideoContext8 = this.LLJJ;
                if (shortVideoContext8 != null) {
                    str7 = shortVideoContext8.shootWay;
                }
                InterfaceC566960MLm interfaceC566960MLmU5 = U5();
                if (interfaceC566960MLmU5 != null) {
                    interfaceC566960MLmU5.LIZLLL(contextLIZIZ, String.valueOf(str7), String.valueOf(creationId));
                }
            } else {
                if (!C363750ENx.LIZ.LIZ("has_show_eoy_album_guide", false) && D5() != null) {
                    T6(D5());
                } else {
                    C524290KhH.LIZIZ(this.LLJILJILJ, this.LLJJ, "end_of_year", false);
                }
                i = 0;
            }
            C361680EFy.LJJJJLL(this.LLJJ, "create_tab", Integer.valueOf(i));
        }
    }

    public final void P6(boolean z) {
        this.LLJJIJIL.setValue(Boolean.valueOf(z));
    }

    private final boolean S6(int i, int i2) {
        if (!((Boolean) C257110A5t.LIZ.getValue()).booleanValue() && C0BYR.LIZ() && C0EIT.LIZ() && i > i2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v45, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v63, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v73, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v77, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.13BV] */
    /* JADX WARN: Type inference failed for: r0v81, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, java.util.Collection, java.util.List] */
    public final void m6(List<? extends ResourceItem> list, boolean z) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends ResourceItem> it2 = list.iterator();
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            ResourceItem next = it2.next();
            String name = next.getName();
            String hint = next.getHint();
            String icon = next.getIcon();
            if (icon != null) {
                str = icon;
            }
            arrayList.add(new C569570MVn(name, hint, str, N6(next.extra)));
        }
        C0MWG c0mwg = C0MWG.LIZ;
        int i = this.LLJJI.LLIZ;
        c0mwg.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "shoot_page_edit_tab");
        c0lab.LIZ(i, "draft_cnt");
        c0lab.LJ("is_from_edit_tab", "1");
        C20684815ws.LJIILLIIL("draft_show", c0lab.LIZ);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C13BV.INSTANCE;
        ?? Z4 = Z4(arrayList);
        if ((!Z4.isEmpty()) && Z4.size() <= 3 && C569510MVh.LIZ()) {
            c259800zU.element = C13LP.LJLILLLLZI(new C569570MVn("", "This is Local Add Draft Item", " ", "add_draft"), Z4);
            C5().wE2(false);
        } else {
            C5().wE2(true);
            c259800zU.element = Z4;
        }
        if (((Boolean) C0AAX.LIZ.getValue()).booleanValue()) {
            Iterator it3 = ((Iterable) c259800zU.element).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (C569460MVc.LJ((C569570MVn) next2)) {
                    if (next2 != null) {
                        ?? arrayList2 = new ArrayList((Collection) c259800zU.element);
                        arrayList2.remove(next2);
                        ListProtector.add(arrayList2, 0, next2);
                        c259800zU.element = arrayList2;
                    }
                }
            }
            Iterator it4 = ((Iterable) c259800zU.element).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next3 = it4.next();
                if (C569460MVc.LIZLLL((C569570MVn) next3)) {
                    if (next3 != null) {
                        ?? arrayList3 = new ArrayList((Collection) c259800zU.element);
                        arrayList3.remove(next3);
                        ListProtector.add(arrayList3, 0, next3);
                        c259800zU.element = arrayList3;
                    }
                }
            }
        }
        Iterator it5 = ((Iterable) c259800zU.element).iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next4 = it5.next();
            if (C569460MVc.LIZJ((C569570MVn) next4)) {
                if (next4 != null) {
                    ?? arrayList4 = new ArrayList((Collection) c259800zU.element);
                    arrayList4.remove(next4);
                    ListProtector.add(arrayList4, 0, next4);
                    c259800zU.element = arrayList4;
                }
            }
        }
        Iterator it6 = ((Iterable) c259800zU.element).iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next5 = it6.next();
            if (C569460MVc.LJIIIIZZ((C569570MVn) next5)) {
                if (next5 != null) {
                    ?? arrayList5 = new ArrayList((Collection) c259800zU.element);
                    arrayList5.remove(next5);
                    C569480MVe.LIZ.getClass();
                    IPugcCreatorService iPugcCreatorService = (IPugcCreatorService) PluggableExtentionKt.pluggableSpi$default(IPugcCreatorService.class, false, false, false, 14, null);
                    if (iPugcCreatorService != null && iPugcCreatorService.LIZ()) {
                        ListProtector.add(arrayList5, 0, next5);
                    }
                    c259800zU.element = arrayList5;
                }
            }
        }
        C569480MVe.LIZ.getClass();
        IPugcCreatorService iPugcCreatorService2 = (IPugcCreatorService) PluggableExtentionKt.pluggableSpi$default(IPugcCreatorService.class, false, false, false, 14, null);
        if (iPugcCreatorService2 != null && iPugcCreatorService2.LIZ()) {
            ?? arrayList6 = new ArrayList((Collection) c259800zU.element);
            ListProtector.add(arrayList6, 0, new C569570MVn("", "", "", "editor://createPUGCTemplate"));
            c259800zU.element = arrayList6;
        }
        if (C2536009wk.LIZ() == 5) {
            C569570MVn c569570MVn = new C569570MVn("MAE Debug", "MAE Draft Item ", "https://lf16-effectcdn-sg.tiktokcdn.com/obj/ies.fe.effect.alisg/149b0b24a4467028ba7dd885ab043522", "editor://mae_draft_list");
            int iMin = Math.min(3, ((List) c259800zU.element).size());
            ?? arrayList7 = new ArrayList((Collection) c259800zU.element);
            ListProtector.add(arrayList7, iMin, c569570MVn);
            c259800zU.element = arrayList7;
        }
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && iAIPortraitFeatureServiceLIZ.isFeatureEnabled()) {
            Iterator it7 = ((Iterable) c259800zU.element).iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Object next6 = it7.next();
                if (C569460MVc.LIZ((C569570MVn) next6)) {
                    if (next6 != null) {
                        ?? arrayList8 = new ArrayList((Collection) c259800zU.element);
                        arrayList8.remove(next6);
                        c259800zU.element = arrayList8;
                        int iMin2 = Math.min(2, arrayList8.size());
                        ?? arrayList9 = new ArrayList((Collection) c259800zU.element);
                        ListProtector.add(arrayList9, iMin2, next6);
                        c259800zU.element = arrayList9;
                    }
                }
            }
        }
        i3(new AwS587S0100000_8(c259800zU, (C259800zU<MentionDataItem>) 70));
        this.LLJLILLLLZIIL = z;
        K6((List) c259800zU.element);
    }

    public C569440MVa(C19A3 c19a3, C1DRG c1drg, ShortVideoContext shortVideoContext, EditorTabViewModel editorTabViewModel) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = shortVideoContext;
        this.LLJJI = editorTabViewModel;
        this.LLJJIII = new MutableLiveData<>();
        this.LLJJIJI = new AwS552S0100000_8(this, 120);
        this.LLJJIJIIJIL = new AwS552S0100000_8(this, 122);
        this.LLJJIJIL = new MutableLiveData<>();
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1425510nCP.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1424260nAO.class, null);
        this.LLJJJJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(79));
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(82));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(78));
        this.LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 121));
        this.LLJL = 1.0f;
        this.LLJLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(80));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(33));
        this.LLJLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 119));
        this.LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 118));
    }
}
