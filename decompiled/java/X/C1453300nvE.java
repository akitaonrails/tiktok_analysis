package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453300nvE extends AbstractC1653180t7c implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C1DRG LLJILLL;
    public final boolean LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C1664740tQG LLJJIJIL;
    public boolean LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1453300nvE.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "RecordMVScene";
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final ShortVideoContext LLLLILI() {
        return (ShortVideoContext) this.LLJJIII.getValue();
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        ShortVideoContext shortVideoContextLLLLILI = LLLLILI();
        InterfaceC1422570n7f interfaceC1422570n7f = (InterfaceC1422570n7f) this.LLJJIJIIJIL.getValue();
        TemplateCategoryData templateCategoryDataY8 = interfaceC1422570n7f != null ? interfaceC1422570n7f.Y8() : null;
        c1419580n2q.getClass();
        C1419580n2q.LIZLLL(shortVideoContextLLLLILI, "click_tab", templateCategoryDataY8);
        i iVar = (i) this.LLJJIJI.getValue();
        if (iVar != null) {
            iVar.hide();
        }
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
        Pair<EnumC1423670n9R, EnumC1423670n9R> pairIx2;
        LandingModel landingModel;
        InterfaceC1422570n7f interfaceC1422570n7f = (InterfaceC1422570n7f) this.LLJJIJIIJIL.getValue();
        if (interfaceC1422570n7f != null && (pairIx2 = interfaceC1422570n7f.ix2()) != null) {
            EnumC1423670n9R first = pairIx2.getFirst();
            EnumC1423670n9R second = pairIx2.getSecond();
            C1419580n2q c1419580n2q = C1419580n2q.LIZ;
            ShortVideoContext shortVideoContextLLLLILI = LLLLILI();
            boolean z = this.LLJJJ;
            boolean zLJFF = Intrinsics.LJFF(LLLLILI().creativeModel.templateSchemaData.isFromEoyBanner, "true");
            c1419580n2q.getClass();
            C1419580n2q.LIZIZ = System.currentTimeMillis();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", shortVideoContextLLLLILI.getCreationId());
            c0lab.LJ("shoot_way", shortVideoContextLLLLILI.shootWay);
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LIZ(first.getValue(), "panel_preload_status");
            c0lab.LIZ(second.getValue(), "category_preload_status");
            c0lab.LJFF("is_concurrent", true);
            c0lab.LJ("first_enter", C1402490mbH.LIZ(z));
            c0lab.LJFF("early_panel_cache", C289620BWu.LIZ());
            c0lab.LIZ(zLJFF ? 1 : 0, "is_from_eoy_banner");
            CreativeModel creativeModel = shortVideoContextLLLLILI.creativeModel;
            if (creativeModel != null && (landingModel = creativeModel.landingModel) != null && landingModel.defaultLandingCreateTab) {
                c0lab.LJ("createtab_landing_type", "default");
            }
            Map<String, String> map = c0lab.LIZ;
            C20684815ws.LJIILLIIL("enter_mv_shoot_page", map);
            ITemplateMobService iTemplateMobService = (ITemplateMobService) C523850KgZ.LIZ.getValue();
            if (iTemplateMobService != null) {
                iTemplateMobService.LIZLLL("enter_mv_shoot_page_performance", map);
            }
        }
        this.LLJJJ = false;
        if (Intrinsics.LJFF(LLLLILI().creativeModel.templateSchemaData.schemaTag, "template_schema")) {
            C1419580n2q c1419580n2q2 = C1419580n2q.LIZ;
            ShortVideoContext shortVideoContextLLLLILI2 = LLLLILI();
            c1419580n2q2.getClass();
            C1419580n2q.LJIIL(shortVideoContextLLLLILI2, null);
            LLLLILI().creativeModel.templateSchemaData.throughTemplateSquareH5 = true;
        }
        i iVar = (i) this.LLJJIJI.getValue();
        if (iVar != null) {
            iVar.show();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC1647930sz9 interfaceC1647930sz9 = (InterfaceC1647930sz9) this.LLJJIJIL.getValue(this, LLJJJIL[0]);
        if (Intrinsics.LJFF(interfaceC1647930sz9 != null ? interfaceC1647930sz9.getCurrentBottomTag() : null, "record_mode_editor_tab")) {
            C1419580n2q c1419580n2q = C1419580n2q.LIZ;
            ShortVideoContext shortVideoContextLLLLILI = LLLLILI();
            InterfaceC1422570n7f interfaceC1422570n7f = (InterfaceC1422570n7f) this.LLJJIJIIJIL.getValue();
            TemplateCategoryData templateCategoryDataY8 = interfaceC1422570n7f != null ? interfaceC1422570n7f.Y8() : null;
            c1419580n2q.getClass();
            C1419580n2q.LIZLLL(shortVideoContextLLLLILI, "click_back", templateCategoryDataY8);
        }
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.RECORD_MV_SCENE;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View viewFindViewById;
        super.onActivityCreated(bundle);
        if (C0MQ1.LIZIZ() && (viewFindViewById = findViewById(R.id.tqy)) != null) {
            viewFindViewById.setBackground(null);
        }
    }

    public C1453300nvE(C1DRG c1drg, boolean z) {
        this.LLJILLL = c1drg;
        this.LLJJ = z;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecordMVViewModel.class);
        this.LLJJI = C452501pT.LIZIZ(new AwS252S0300000_8(this, c19719912DlLIZ, c19719912DlLIZ, 29));
        this.LLJJIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 839));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 838));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 840));
        this.LLJJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1648020szI.class, null);
        this.LLJJJ = true;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        super.onViewCreated(view, bundle);
        if (getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED && C545820Lau.LIZIZ(this) != null && !C545820Lau.LJ(this)) {
            C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(268));
            C1664590tQ1.LIZLLL(this, "RecordMVScene", false, new AwS601S0100000_22(this, 645), 2);
            C1664600tQ2.LIZ(this, "RecordMVScene", new AwS601S0100000_22(this, 646));
        }
        if (this.LLJJ && (view2 = this.mView) != null) {
            view2.setBackground(null);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(C1425570nCV.LIZIZ.LIZLLL());
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.i9e, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
