package X;

import android.content.Context;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiPublishUpdateUiStatusAbility;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import com.ss.android.ugc.aweme.services.publish.EditPostMobParam;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1200170hKx implements C03K6, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final C1200260hL6 LLILLL;
    public final AssemVMLazy LLILZ;
    public final InterfaceC665370Q7z LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1200170hKx.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/videopublish/PoiPublishExtensionVM;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract String LIZJ();

    public abstract String LIZLLL();

    public abstract void LJI(String str);

    public abstract boolean LJII();

    public abstract void LJIIIIZZ(String str);

    public abstract boolean LJIIJ();

    public abstract boolean LJIIJJI();

    public abstract String LJIIL();

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final PoiPublishExtensionVM LJ() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (PoiPublishExtensionVM) assemVMLazy.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI.getLifecycle();
    }

    @Override // X.C03K6
    public final Context getContext() {
        return this.LL;
    }

    @Override // X.C03K6
    public final LifecycleOwner getCurrentLifeCycleOwner() {
        return this.LLILLJJLI;
    }

    public final void LIZ(PoiData poiData) {
        AbstractC738140SxQ abstractC738140SxQ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        try {
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            Unit unit = null;
            if ((lifecycleOwner instanceof AbstractC738140SxQ) && (abstractC738140SxQ = (AbstractC738140SxQ) lifecycleOwner) != null && (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(abstractC738140SxQ)) != null) {
                C1554960qZC.LIZ(interfaceC665370Q7zLJIIL, C1200260hL6.LIZ(this.LLILLL, null, poiData, 59), C1200260hL6.class, "source_default_key");
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJIIIZ(int i) {
        String str;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        Map<String, String> map = this.LLILLL.LL;
        boolean zLJFF = Intrinsics.LJFF(LJ().getState().LLILLL, Boolean.TRUE);
        String strLIZJ = LIZJ();
        boolean zLIZ = C289340BVs.LIZ(this.LLILLL.LLILLJJLI.poiPublishModel);
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!zLIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1185430gxB.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strLIZJ == null) {
            strLIZJ = "video_post_page";
        }
        linkedHashMap.put("enter_from", strLIZJ);
        linkedHashMap.put("has_poi", String.valueOf(i));
        linkedHashMap.put("has_location", String.valueOf(zLJFF ? 1 : 0));
        C1189060h32.LJJ("alliance_disable_change_poi", str, linkedHashMap);
        C1189060h32.LJIJJ(linkedHashMap, map);
        if (C297510BlN.LIZIZ()) {
            if (C297500BlM.LIZ()) {
                str2 = "1";
            }
            linkedHashMap.put("ttls_user_status", str2);
        }
        linkedHashMap.putAll(C1200530hLX.LIZIZ(null, "poi_entrance_show"));
        C20684815ws.LJIILLIIL("poi_entrance_show", linkedHashMap);
    }

    public static void LJIILIIL(AbstractC1200170hKx abstractC1200170hKx, EnumC1200180hKy enumC1200180hKy) {
        IPoiPublishUpdateUiStatusAbility iPoiPublishUpdateUiStatusAbility = (IPoiPublishUpdateUiStatusAbility) C1558520qew.LIZ(abstractC1200170hKx.LLILZIL, IPoiPublishUpdateUiStatusAbility.class, null);
        if (iPoiPublishUpdateUiStatusAbility != null) {
            iPoiPublishUpdateUiStatusAbility.qg2(enumC1200180hKy, false, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1200170hKx(Context context, LifecycleOwner lifecycleOwner, C1200260hL6 c1200260hL6) {
        AssemVMLazy assemVMLazy;
        Function0 awS562S0100000_18;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Function0 awS562S0100000_182;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        Function0 awS562S0100000_183;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c1200260hL6;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiPublishExtensionVM.class);
        AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 26);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(10);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c19719912DlLIZ, 37);
            AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(20);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(this, 12);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(this, 14);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS562S0100000_183 = new AwS562S0100000_18(hasDefaultViewModelProviderFactory3, 16);
            } else {
                awS562S0100000_183 = C1143000fqk.LIZ;
            }
            assemVMLazy = new AssemVMLazy(awS562S0100000_185, awS562S0100000_184, aFwS206S0000000_18, awS562S0100000_186, awS562S0100000_187, awS562S0100000_183, aFwS256S0000000_18, new AwS562S0100000_18(this, 18), null, new AwS562S0100000_18(this, 19));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(this, 13);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS562S0100000_182 = new AwS562S0100000_18(hasDefaultViewModelProviderFactory2, 15);
            } else {
                awS562S0100000_182 = C1143000fqk.LIZ;
            }
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c19719912DlLIZ, 17);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_188, 8));
            AwS562S0100000_18 awS562S0100000_1810 = new AwS562S0100000_18(c01gwLIZIZ, 20);
            AwS562S0100000_18 awS562S0100000_1811 = new AwS562S0100000_18(c01gwLIZIZ, 21);
            AwS562S0100000_18 awS562S0100000_1812 = new AwS562S0100000_18(c01gwLIZIZ, 22);
            AwS562S0100000_18 awS562S0100000_1813 = new AwS562S0100000_18(c01gwLIZIZ, 23);
            AwS562S0100000_18 awS562S0100000_1814 = new AwS562S0100000_18(c01gwLIZIZ, 24);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_189, awS562S0100000_184, new C452080Ho6(), awS562S0100000_1810, awS562S0100000_1811, awS562S0100000_182, aFwS256S0000000_18, awS562S0100000_1812, awS562S0100000_1813, awS562S0100000_1814);
        } else if (Intrinsics.LJFF(obj, obj)) {
            AwS562S0100000_18 awS562S0100000_1815 = new AwS562S0100000_18(c19719912DlLIZ, 25);
            AFwS206S0000000_18 aFwS206S0000000_182 = AFwS206S0000000_18.get$arr$(18);
            AwS562S0100000_18 awS562S0100000_1816 = new AwS562S0100000_18(this, 27);
            AwS562S0100000_18 awS562S0100000_1817 = new AwS562S0100000_18(this, 28);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) != null) {
                awS562S0100000_18 = new AwS562S0100000_18(hasDefaultViewModelProviderFactory, 29);
            } else {
                awS562S0100000_18 = C1143000fqk.LIZ;
            }
            assemVMLazy = new AssemVMLazy(awS562S0100000_1815, awS562S0100000_184, aFwS206S0000000_182, awS562S0100000_1816, awS562S0100000_1817, awS562S0100000_18, aFwS256S0000000_18, new AwS562S0100000_18(this, 30), null, new AwS562S0100000_18(this, 31));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 32), awS562S0100000_184, AFwS206S0000000_18.get$arr$(19), new AwS562S0100000_18(this, 33), new AwS562S0100000_18(this, 34), new AwS562S0100000_18(this, 35), aFwS256S0000000_18, null, null, new AwS562S0100000_18(this, 36));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLILZ = assemVMLazy;
        C1199950hKb.LIZ();
        this.LLILZIL = C1558360qeg.LJI(C827203La.LIZ(context), null);
    }

    public void LIZIZ(boolean z, boolean z2, boolean z3) {
        Integer num;
        String str;
        String strLJ;
        String str2;
        String str3;
        Integer num2;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "//poi/search");
        MobParam mobParam = this.LLILLL.LLILLJJLI.mobParam;
        String str4 = mobParam.creationId;
        String str5 = mobParam.contentType;
        String str6 = mobParam.shootWay;
        String strLIZJ = LIZJ();
        ExtensionMisc extensionMisc = this.LLILLL.LLILLJJLI;
        EditPostMobParam editPostMobParam = extensionMisc.editPostMobParam;
        String str7 = null;
        if (editPostMobParam != null) {
            num = editPostMobParam.awemeType;
        } else {
            num = null;
        }
        MobParam mobParam2 = extensionMisc.mobParam;
        smartRouteBuildRoute.withParam("poi_mob_param", new PoiMobParam(str4, str5, str6, "click_add_location", strLIZJ, num, null, mobParam2.contentSource, mobParam2.isMultiContent(), 0, C1200270hL7.LIZ(this.LLILLL).LL, null, LJ().LLJJIJIIJIL, Integer.valueOf(LJ().LLJJIJI)));
        smartRouteBuildRoute.withParam("enable_preload", z);
        EditPostMobParam editPostMobParam2 = this.LLILLL.LLILLJJLI.editPostMobParam;
        if (editPostMobParam2 != null) {
            str = editPostMobParam2.awemeId;
        } else {
            str = null;
        }
        smartRouteBuildRoute.withParam("aid", str);
        List<MediaLocationMetaDataModel> list = this.LLILLL.LLILZ;
        if (list != null) {
            strLJ = C2365509Or.LJ(list);
        } else {
            strLJ = null;
        }
        smartRouteBuildRoute.withParam("media_location_meta_data_list_json", strLJ);
        smartRouteBuildRoute.withParam("page_scene", EnumC1198680hIY.ADD_LOCATION);
        smartRouteBuildRoute.withParam("retag_enter_method", "no_retag");
        smartRouteBuildRoute.withParam("from_find_nearby_place_click", z2);
        smartRouteBuildRoute.withParam("skip_search_gps_show", z3);
        EditPostMobParam editPostMobParam3 = this.LLILLL.LLILLJJLI.editPostMobParam;
        if (editPostMobParam3 != null) {
            str2 = editPostMobParam3.afterPostDays;
        } else {
            str2 = null;
        }
        smartRouteBuildRoute.withParam("after_post_days", str2);
        smartRouteBuildRoute.open(111);
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapperLIZ = LJ().getState().LL.LIZ();
        if (poiSearchResultWrapperLIZ != null && (poiSearchResult = poiSearchResultWrapperLIZ.poiSearchResult) != null) {
            str3 = poiSearchResult.logId;
        } else {
            str3 = null;
        }
        C1198520hII c1198520hII = C1198520hII.LIZ;
        String strLIZJ2 = LIZJ();
        String strLIZLLL = LIZLLL();
        C1200260hL6 c1200260hL6 = this.LLILLL;
        EditPostMobParam editPostMobParam4 = c1200260hL6.LLILLJJLI.editPostMobParam;
        if (editPostMobParam4 != null) {
            num2 = editPostMobParam4.awemeType;
        } else {
            num2 = null;
        }
        Map<String, String> map = C1200270hL7.LIZ(c1200260hL6).LL;
        EditPostMobParam editPostMobParam5 = this.LLILLL.LLILLJJLI.editPostMobParam;
        if (editPostMobParam5 != null) {
            str7 = editPostMobParam5.afterPostDays;
        }
        String str8 = LJ().LLJJIJIIJIL;
        Integer numValueOf = Integer.valueOf(LJ().LLJJIJI);
        PageFinder pageFinderVia = PageFinder.via(LJ().LLJJIJIL);
        c1198520hII.getClass();
        C1198520hII.LIZJ(strLIZJ2, strLIZLLL, str3, num2, map, "no_retag", str7, str8, numValueOf, pageFinderVia);
        C1185430gxB.LIZ.getClass();
        C1185430gxB.LJ();
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
