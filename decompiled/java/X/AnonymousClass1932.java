package X;

import Y.ARunnableS114S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.poi.PoiPublishInfoModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1932, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1932 extends AbstractC2255721DQs<InterfaceC855570XhL> implements InterfaceC855570XhL, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC855570XhL LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), List.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), Fragment.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), Bundle.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), ExtensionDataRepo.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19511611Vi.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), C856850XjP.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), C193M.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855210Xgl.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(83));
    public final Unit LLJJIII = Unit.LIZ;
    public boolean LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1932.class, "publishExtensions", "getPublishExtensions()Ljava/util/List;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1932.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AnonymousClass1932.class, "fragment", "getFragment()Landroidx/fragment/app/Fragment;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AnonymousClass1932.class, "context", "getContext()Landroid/content/Context;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(AnonymousClass1932.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(AnonymousClass1932.class, "savedStateBundle", "getSavedStateBundle()Landroid/os/Bundle;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(AnonymousClass1932.class, "extensionDataRepo", "getExtensionDataRepo()Lcom/ss/android/ugc/aweme/services/publish/ExtensionDataRepo;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(AnonymousClass1932.class, "extensionDataContainer", "getExtensionDataContainer()Lcom/ss/android/ugc/aweme/port/in/IPublishService$PublishExtensionDataContainer;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(AnonymousClass1932.class, "titleModule", "getTitleModule()Lcom/ss/android/ugc/aweme/shortvideo/TitleModule;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(AnonymousClass1932.class, "optionsManagerApiComponent", "getOptionsManagerApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/option/manager/PublishOptionsManagerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(AnonymousClass1932.class, "commercePublishPageApiComponent", "getCommercePublishPageApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/commerce/CommercePublishPageApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(AnonymousClass1932.class, "permissionOptionApiComponent", "getPermissionOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12};
        LLJJIJIL = 8;
    }

    private final C19EG G2() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJJIJIIJIL[4]);
    }

    private final C1664690tQB<Unit> H2() {
        return (C1664690tQB) this.LLJJI.getValue();
    }

    private final C193M W2() {
        return (C193M) this.LLJILJILJ.getValue(this, LLJJIJIIJIL[9]);
    }

    private final void Xi() {
        LiveState<Integer> liveStateJN2;
        C259800zU c259800zU = new C259800zU();
        InterfaceC855150Xgf interfaceC855150XgfC3 = c3();
        if (interfaceC855150XgfC3 == null || (liveStateJN2 = interfaceC855150XgfC3.JN2()) == null) {
            return;
        }
        liveStateJN2.LJIIIZ(this, Lifecycle.State.STARTED, new AwS380S0200000_14(c259800zU, (C259800zU<Integer>) this, (AnonymousClass1932) 67));
    }

    private final InterfaceC855150Xgf c3() {
        return (InterfaceC855150Xgf) this.LLJJ.getValue(this, LLJJIJIIJIL[11]);
    }

    private final Context getContext() {
        return (Context) this.LLIZ.getValue(this, LLJJIJIIJIL[3]);
    }

    private final Fragment getFragment() {
        return (Fragment) this.LLILZLL.getValue(this, LLJJIJIIJIL[2]);
    }

    private final Bundle m3() {
        return (Bundle) this.LLJ.getValue(this, LLJJIJIIJIL[5]);
    }

    private final InterfaceC19511611Vi o2() {
        return (InterfaceC19511611Vi) this.LLJIJIL.getValue(this, LLJJIJIIJIL[7]);
    }

    private final void v3() {
        if (this.LLJJIJI) {
            return;
        }
        ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(G2(), new AwS576S0100000_32(this, 268));
        B3();
        SY1();
        this.LLJJIJI = true;
    }

    private final ExtensionDataRepo w2() {
        return (ExtensionDataRepo) this.LLJI.getValue(this, LLJJIJIIJIL[6]);
    }

    @Override // X.InterfaceC855570XhL
    public void SY1() {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "TAG";
        C823050WQl.LIZ(c2123408ToLIZ.LIZ()).submit(new ARunnableS114S0100000_14(this, 24));
    }

    public final VideoPublishEditModel T2() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJJIJIIJIL[1]);
    }

    public final void W1() {
        boolean z;
        TextStruct textStruct;
        List<CreateAnchorInfo> anchors;
        MicroAppModel microAppModel = T2().getMicroAppModel();
        InterfaceC19511611Vi interfaceC19511611ViO2 = o2();
        ExtensionDataRepo extensionDataRepoW2 = w2();
        MobParam mobParamLJII = C1428470nHB.LJII(T2(), "video_post_page", "", "");
        boolean z2 = false;
        List<InteractStickerStruct> listLJ = C1429860nJQ.LJ(T2().getMainBusinessContext(), EnumC1428480nHC.TRACK_PAGE_EDIT);
        if (listLJ == null) {
            z = false;
        } else {
            ArrayList arrayList = new ArrayList();
            for (InteractStickerStruct interactStickerStruct : listLJ) {
                if (interactStickerStruct.getType() == 5) {
                    arrayList.add(interactStickerStruct);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                try {
                    textStruct = (TextStruct) C0CHQ.LIZ().getGson().LJII(((InteractStickerStruct) next).getTextStruct(), TextStruct.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (textStruct != null && (anchors = textStruct.getAnchors()) != null && (!anchors.isEmpty())) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
        }
        boolean zLJJZZI = C1428470nHB.LJJZZI(T2());
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(T2().creativeModel.musicBuzModel);
        Context sceneContext = this.LL.getSceneContext();
        try {
            String lsAllianceInfo = T2().creativeModel.poiLynxInfoModel.getLsAllianceInfo();
            if (lsAllianceInfo != null) {
                z2 = new JSONObject(lsAllianceInfo).optBoolean("disable_change_poi", false);
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        ExtensionMisc extensionMisc = new ExtensionMisc(null, null, microAppModel, interfaceC19511611ViO2, extensionDataRepoW2, mobParamLJII, z, zLJJZZI, aVMusicExtractAVMusic, false, null, null, null, sceneContext, null, new PoiPublishInfoModel(Boolean.valueOf(z2)), T2().creativeModel.gpsConsumingOptModel);
        PublishOutput publishOutputLJJLIIIJL = C1416310mxZ.LJJLIIIJL(T2());
        AnonymousClass1933 anonymousClass1933 = new AnonymousClass1933(this);
        List<C0WIY<Class<?>, IAVPublishExtension<?>>> listI3 = i3();
        if (listI3 != null) {
            for (C0WIY<Class<?>, IAVPublishExtension<?>> c0wiy : listI3) {
                if (C345050Dfr.LIZ) {
                    c0wiy.LIZIZ.onCreateMultiViewPublish(getFragment(), this.LL.mView, this, m3(), AVPublishContentType.Video, publishOutputLJJLIIIJL, new ArrayList(C1637680sic.LIZ(T2().creativeModel.mobileEffectsModel2.exportedEffects)), new ArrayList(C1637680sic.LIZIZ(T2().creativeModel.mobileEffectsModel2.exportedEffects)), extensionMisc, anonymousClass1933, null);
                } else {
                    c0wiy.LIZIZ.onCreate(getFragment(), this.LL.mView, this, m3(), AVPublishContentType.Video, publishOutputLJJLIIIJL, extensionMisc, anonymousClass1933, null);
                }
            }
        }
    }

    public final InterfaceC855210Xgl Z1() {
        return (InterfaceC855210Xgl) this.LLJILLL.getValue(this, LLJJIJIIJIL[10]);
    }

    public final List<C0WIY<Class<?>, IAVPublishExtension<?>>> i3() {
        return (List) this.LLILZ.getValue(this, LLJJIJIIJIL[0]);
    }

    public final C856850XjP q3() {
        return (C856850XjP) this.LLJILJIL.getValue(this, LLJJIJIIJIL[8]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.07UP, X.10Il] */
    private final void B3() {
        List<Integer> listLJJLJ;
        W2().LW(Unit.class, Unit.class, new AnonymousClass1931<C193E, Unit, Unit>() { // from class: X.1934
            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                final View view = new View(context);
                return new AbstractC1738640vLS(view) { // from class: X.193E
                };
            }

            @Override // X.AnonymousClass1931
            public final /* bridge */ /* synthetic */ void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
            }
        }, C19223210Ik.LIZ);
        FrameLayout frameLayout = new FrameLayout(getContext());
        List<C0WIY<Class<?>, IAVPublishExtension<?>>> listI3 = i3();
        if (listI3 != null) {
            Iterator<C0WIY<Class<?>, IAVPublishExtension<?>>> it2 = listI3.iterator();
            while (it2.hasNext()) {
                IAVPublishExtension<?> iAVPublishExtension = it2.next().LIZIZ;
                final String name = iAVPublishExtension.getName();
                final ?? r7 = new InterfaceC19223310Il(name) { // from class: X.07UP
                    public final String LIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C07UP) && Intrinsics.LJFF(this.LIZ, ((C07UP) obj).LIZ);
                    }

                    public final int hashCode() {
                        return this.LIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PublishExtensionOptionViewFactoryScenario(name=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = name;
                    }
                };
                C193W c193w = new C193W(getFragment(), iAVPublishExtension);
                W2().LW(Unit.class, Unit.class, c193w, r7);
                String name2 = iAVPublishExtension.getName();
                C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                boolean z = false;
                if (currentUser != null && Intrinsics.LJFF(name2, "MultiAnchorPublishExtension") && !((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIZ() && 3 != currentUser.LIZLLL()) {
                    C193K.LIZ.getClass();
                    Set<Integer> setLIZLLL = ((IAnchorListService) ServiceManager.get().getService(IAnchorListService.class)).LIZLLL();
                    if ((setLIZLLL instanceof Collection) && setLIZLLL.isEmpty()) {
                        z = true;
                    } else {
                        Iterator<T> it3 = setLIZLLL.iterator();
                        while (it3.hasNext()) {
                            int iIntValue = ((Number) it3.next()).intValue();
                            C193K.LIZ.getClass();
                            int[] iArr = (int[]) C0C64.LJIILLIIL().LJJII(int[].class, C193K.LIZIZ, "enable_hide_anchor_type_list", true);
                            if (iArr == null || (listLJJLJ = C13LQ.LJJLJ(iArr)) == null || !listLJJLJ.contains(Integer.valueOf(iIntValue))) {
                                break;
                            }
                        }
                        z = true;
                    }
                }
                final boolean z2 = !z;
                final String name3 = iAVPublishExtension.getName();
                InterfaceC1738600vLO interfaceC1738600vLO = new InterfaceC1738600vLO(name3) { // from class: X.07UQ
                    public final String LL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C07UQ) && Intrinsics.LJFF(this.LL, ((C07UQ) obj).LL);
                    }

                    public final int hashCode() {
                        return this.LL.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ExtendedPublishOptionItemType(key=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1738600vLO
                    public final String getKey() {
                        return this.LL;
                    }

                    {
                        this.LL = name3;
                    }
                };
                C10J3 c10j3 = new C10J3() { // from class: X.1935
                    @Override // X.C10J3
                    public final void LIZJ() {
                    }

                    @Override // X.C10J3
                    public final InterfaceC214777193n LIZ() {
                        return z2 ? C193H.LIZ : C193F.LIZ;
                    }

                    @Override // X.C10J3
                    public final InterfaceC19223310Il LIZIZ() {
                        return r7;
                    }
                };
                W2().KL1(interfaceC1738600vLO, Unit.class, Unit.class, H2(), this.LLJJIII, c10j3);
                C193Y c193yLJ = c193w.LJ(getContext(), frameLayout);
                C193X c193x = new C193X(interfaceC1738600vLO, T2(), c10j3.LIZ());
                C1664690tQB<Unit> c1664690tQBH2 = H2();
                Unit unit = this.LLJJIII;
                c193w.LIZ = this;
                c193w.LIZLLL(c193yLJ, c193x, c1664690tQBH2, unit);
            }
        }
    }

    @Override // X.InterfaceC855570XhL
    public void ZT0() {
        List<C0WIY<Class<?>, IAVPublishExtension<?>>> listI3 = i3();
        if (listI3 != null) {
            Iterator<C0WIY<Class<?>, IAVPublishExtension<?>>> it2 = listI3.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ.onAccountUpdate();
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        v3();
        Xi();
    }

    public InterfaceC855570XhL X1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public AnonymousClass1932(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
