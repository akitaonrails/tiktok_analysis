package X;

import Y.AObjectS101S0101000_19;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.google.gson.e;
import com.google.gson.n;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.abtest.SearchSecurityControlValue;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.SmartSearchInfoStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.NimbleMobAbility;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.entry.visualsearch.ability.VisualSearchTagAbility;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ER1, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ER1 implements ISearchService {
    public static final C1ER1 LIZIZ = new C1ER1();
    public final /* synthetic */ ISearchService LIZ = (ISearchService) ServiceManager.get().getService(ISearchService.class);

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility A() {
        return this.LIZ.A();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility A0(LifecycleOwner lifecycleOwner) {
        return this.LIZ.A0(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    @InterfaceC1294060jmO
    public final void B(C0QDS c0qds) {
        this.LIZ.B(c0qds);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void B0(Aweme aweme, String str) {
        this.LIZ.B0(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C0QF6 C(ECSearchEntranceData eCSearchEntranceData) {
        return this.LIZ.C(eCSearchEntranceData);
    }

    @Override // X.InterfaceC634440OuY
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> C0() {
        return this.LIZ.C0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility D(Aweme aweme) {
        return this.LIZ.D(aweme);
    }

    @Override // X.InterfaceC1604910rrl
    public final String D0() {
        return this.LIZ.D0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean E(C2189821An6 c2189821An6, Fragment fragment, C0SZ8 c0sz8, Aweme aweme) {
        return this.LIZ.E(c2189821An6, fragment, c0sz8, aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void E0(String str, List list) {
        this.LIZ.E0(str, list);
    }

    @Override // X.InterfaceC1386380mBI
    public final boolean F() {
        return this.LIZ.F();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean F0() {
        return this.LIZ.F0();
    }

    @Override // X.InterfaceC1355760lNu
    public final void G(String str, boolean z) {
        this.LIZ.G(str, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, InterfaceC1051760dTa> G0(C2203531BLz c2203531BLz, WeakReference<Context> weakReference) {
        return this.LIZ.G0(c2203531BLz, weakReference);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean H(C19EG c19eg, AbstractC1387200mCc abstractC1387200mCc, C1445970njP c1445970njP) {
        return this.LIZ.H(c19eg, abstractC1387200mCc, c1445970njP);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void H0(C2189821An6 c2189821An6, Aweme aweme, ViewGroup viewGroup, int i) {
        this.LIZ.H0(c2189821An6, aweme, viewGroup, i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> I(Aweme aweme, String str) {
        return this.LIZ.I(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void I0(View view, C683220Qr2 c683220Qr2) {
        this.LIZ.I0(view, c683220Qr2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void J(Fragment fragment, boolean z) {
        this.LIZ.J(fragment, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean J0() {
        return this.LIZ.J0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final int K() {
        return this.LIZ.K();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void K0(Map<String, String> map) {
        this.LIZ.K0(map);
    }

    @Override // X.InterfaceC1604910rrl
    public final Long L() {
        return this.LIZ.L();
    }

    @Override // X.InterfaceC1611110s1l
    public final String L0() {
        return this.LIZ.L0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C0WHU LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LIZJ(int i) {
        this.LIZ.LIZJ(i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LJFF(s sVar) {
        return this.LIZ.LJFF(sVar);
    }

    @Override // X.InterfaceC634440OuY
    public final void LJI(String str, String str2, String str3, String str4, boolean z) {
        this.LIZ.LJI(str, str2, str3, str4, z);
    }

    @Override // X.InterfaceC1570140qxg
    public final void LJII() {
        this.LIZ.LJII();
    }

    @Override // X.InterfaceC20290714aP
    public final boolean LJIIIIZZ(Context context) {
        return this.LIZ.LJIIIIZZ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIIIZ(String str, String str2, String str3, String str4) {
        this.LIZ.LJIIIZ(str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIIJ(Map<String, String> map) {
        this.LIZ.LJIIJ(map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Intent LJIIJJI(Activity activity, Uri uri) {
        return this.LIZ.LJIIJJI(activity, uri);
    }

    @Override // X.InterfaceC1571010qz5
    public final void LJIIL(boolean z) {
        this.LIZ.LJIIL(z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIILIIL(String str, boolean z) {
        this.LIZ.LJIILIIL(str, z);
    }

    @Override // X.C0O85
    public final String LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC1600790rl7
    public final boolean LJIILL(Aweme aweme) {
        return this.LIZ.LJIILL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final Boolean LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // X.InterfaceC634440OuY
    public final boolean LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LJIJ(s sVar) {
        return this.LIZ.LJIJ(sVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LJIJI(s sVar) {
        return this.LIZ.LJIJI(sVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIJJ(Function0<Unit> function0) {
        this.LIZ.LJIJJ(function0);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIJJLI(LastSearch lastSearch) {
        this.LIZ.LJIJJLI(lastSearch);
    }

    @Override // X.InterfaceC1611110s1l
    public final boolean LJIL() {
        return this.LIZ.LJIL();
    }

    @Override // X.InterfaceC1586210rNb
    public final boolean LJJ() {
        return this.LIZ.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility LJJI() {
        return this.LIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final List<C1311670kEn> LJJIFFI() {
        return this.LIZ.LJJIFFI();
    }

    @Override // X.InterfaceC1600790rl7
    public final C0PI6 LJJII() {
        return this.LIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LJJIII(s sVar) {
        return this.LIZ.LJJIII(sVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJIIJ(Context context, Uri uri, Bundle bundle, Object obj) {
        this.LIZ.LJJIIJ(context, uri, bundle, obj);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC1448230nn3 LJJIIJZLJL() {
        return this.LIZ.LJJIIJZLJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, Class<?>> LJJIIZ() {
        return this.LIZ.LJJIIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Integer LJJIIZI() {
        return this.LIZ.LJJIIZI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Integer LJJIJ(User user) {
        return this.LIZ.LJJIJ(user);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJIJIIJI(EnumC584570MwJ enumC584570MwJ) {
        this.LIZ.LJJIJIIJI(enumC584570MwJ);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> LJJIJIIJIL(Integer num) {
        return this.LIZ.LJJIJIIJIL(num);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIJIL() {
        return this.LIZ.LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJIJL(Context context, String str, TextExtraStruct textExtraStruct, Map<String, String> map, Aweme aweme, boolean z) {
        this.LIZ.LJJIJL(context, str, textExtraStruct, map, aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJIJLIJ(IMUser iMUser, SharePackage sharePackage, String str) {
        this.LIZ.LJJIJLIJ(iMUser, sharePackage, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJIL(Context context, String str, TextExtraStruct textExtraStruct, Map<String, String> map) {
        this.LIZ.LJJIL(context, str, textExtraStruct, map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIZ(String str) {
        return this.LIZ.LJJIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final HashMap<String, String> LJJJ(String str, String str2, String str3) {
        return this.LIZ.LJJJ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C0QMP LJJJI(Context context, Bitmap bitmap) {
        return this.LIZ.LJJJI(context, bitmap);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC725760SdS LJJJIL() {
        return this.LIZ.LJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC587940N4e LJJJJ() {
        return this.LIZ.LJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJJJI(FragmentManager fragmentManager, Map<String, ? extends Object> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4) {
        this.LIZ.LJJJJI(fragmentManager, map, map2, map3, map4);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C10GR LJJJJIZL(C19EG c19eg, View view, String str, InterfaceC1685420txc<? super View, ? super String, ? super String, ? super String, ? super String, Unit> interfaceC1685420txc) {
        return this.LIZ.LJJJJIZL(c19eg, view, str, interfaceC1685420txc);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJJJJ() {
        return this.LIZ.LJJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C13IQ<? extends AbstractC738140SxQ> LJJJJJL() {
        return this.LIZ.LJJJJJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> LJJJJL() {
        return this.LIZ.LJJJJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJJJJLI() {
        return this.LIZ.LJJJJLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJJJLL() {
        return this.LIZ.LJJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC690490R6p LJJJJZ() {
        return this.LIZ.LJJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJJJZI() {
        this.LIZ.LJJJJZI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJJLIIL(List<? extends Map<String, ? extends Object>> list, boolean z) {
        return this.LIZ.LJJJLIIL(list, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJJLL(String str) {
        return this.LIZ.LJJJLL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJJLZIJ(String str, String str2) {
        return this.LIZ.LJJJLZIJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJJJZ() {
        return this.LIZ.LJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJL(Object obj) {
        this.LIZ.LJJL(obj);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final View LJJLI(int i, ViewGroup viewGroup) {
        return this.LIZ.LJJLI(i, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIIJ(int i) {
        this.LIZ.LJJLIIIIJ(i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJ(Aweme aweme, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.LIZ.LJJLIIIJ(aweme, num, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJILLIZJL(Aweme aweme, C19EG c19eg, Fragment fragment, Bundle bundle, EnumC667230QFd enumC667230QFd) {
        this.LIZ.LJJLIIIJILLIZJL(aweme, c19eg, fragment, bundle, enumC667230QFd);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJJI() {
        this.LIZ.LJJLIIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJJLIIIJJIZ(String str, C0PSX c0psx) {
        return this.LIZ.LJJLIIIJJIZ(str, c0psx);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJLIIIJL(Aweme aweme, String str) {
        return this.LIZ.LJJLIIIJL(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJLJLI(Aweme aweme, boolean z) {
        this.LIZ.LJJLIIIJLJLI(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJLLLLLLLZ(Context context, String str, Aweme aweme, String str2, String str3) {
        this.LIZ.LJJLIIIJLLLLLLLZ(context, str, aweme, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchResultStatistics LJJLIIJ() {
        return this.LIZ.LJJLIIJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C0J3R LJJLIL() {
        return this.LIZ.LJJLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C0QER LJJLJ() {
        return this.LIZ.LJJLJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJJLJLI() {
        return this.LIZ.LJJLJLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLL(Aweme aweme, Integer num, String str, String str2, boolean z) {
        this.LIZ.LJJLL(aweme, num, str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJJZ() {
        return this.LIZ.LJJZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> LJJZZI(Map<String, String> map) {
        return this.LIZ.LJJZZI(map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJZZIII(Uri uri) {
        this.LIZ.LJJZZIII(uri);
    }

    @Override // X.InterfaceC1584170rKJ
    public final boolean LJL() {
        return this.LIZ.LJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLI(int i, String str, boolean z, String str2, long j, long j2) {
        this.LIZ.LJLI(i, str, z, str2, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLIIIL() {
        this.LIZ.LJLIIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLIIL(String str, String str2) {
        return this.LIZ.LJLIIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLIL() {
        return this.LIZ.LJLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final HashMap LJLILLLLZI(String str, String str2) {
        return this.LIZ.LJLILLLLZI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC21663319qJ LJLJI(String str) {
        return this.LIZ.LJLJI(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLJJI(Aweme aweme) {
        return this.LIZ.LJLJJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLJJL() {
        return this.LIZ.LJLJJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLJJLL(C0QDS c0qds) {
        this.LIZ.LJLJJLL(c0qds);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC581770Mrn LJLJL() {
        return this.LIZ.LJLJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLJLJ() {
        return this.LIZ.LJLJLJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC665680Q9e LJLJLLL(SearchResultParam searchResultParam, SearchKeywordPresenter searchKeywordPresenter, C1242650iRT c1242650iRT) {
        return this.LIZ.LJLJLLL(searchResultParam, searchKeywordPresenter, c1242650iRT);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLL(View view, String str, String str2, int i, Aweme aweme, boolean z) {
        this.LIZ.LJLL(view, str, str2, i, aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLLI() {
        return this.LIZ.LJLLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLLILLLL(int i, View view) {
        this.LIZ.LJLLILLLL(i, view);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLLJ() {
        return this.LIZ.LJLLJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLLL(Activity activity, Fragment fragment) {
        return this.LIZ.LJLLL(activity, fragment);
    }

    @Override // X.InterfaceC1611110s1l
    public final void LJLLLL() {
        this.LIZ.LJLLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLLLLLL(String str) {
        this.LIZ.LJLLLLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLZ(Aweme aweme) {
        return this.LIZ.LJLZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJZ(Context context) {
        return this.LIZ.LJZ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJZI() {
        return this.LIZ.LJZI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJZL(String str) {
        this.LIZ.LJZL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC1370310llN LL(String str, String str2, String str3, Aweme aweme) {
        return this.LIZ.LL(str, str2, str3, aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLD(String str) {
        this.LIZ.LLD(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLF(EnumC1594380ram enumC1594380ram, boolean z) {
        this.LIZ.LLF(enumC1594380ram, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLFF(Aweme aweme, String str) {
        return this.LIZ.LLFF(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLFFF(Function1<? super Boolean, Unit> function1) {
        this.LIZ.LLFFF(function1);
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LLFII() {
        return this.LIZ.LLFII();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLFZ(String str) {
        return this.LIZ.LLFZ(str);
    }

    @Override // X.InterfaceC634440OuY
    public final boolean LLI() {
        return this.LIZ.LLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLIFFJFJJ(Aweme aweme) {
        return this.LIZ.LLIFFJFJJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLII(String str, String str2) {
        this.LIZ.LLII(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIIII(Aweme aweme) {
        this.LIZ.LLIIII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLIIIILZ(String str) {
        return this.LIZ.LLIIIILZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIIIJ(Context context) {
        this.LIZ.LLIIIJ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLIIIL() {
        return this.LIZ.LLIIIL();
    }

    @Override // X.InterfaceC1611110s1l
    public final boolean LLIIIZ() {
        return this.LIZ.LLIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIIJI(Context context, Bundle bundle) {
        this.LIZ.LLIIJI(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIIJLIL(Context context, String str, String str2, Map map, Map map2, Aweme aweme, Fragment fragment) {
        this.LIZ.LLIIJLIL(context, str, str2, map, map2, aweme, fragment);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Pair LLIIL(Activity activity, int i, Intent intent) {
        return this.LIZ.LLIIL(activity, i, intent);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final int LLIILII(C0PHW c0phw) {
        return this.LIZ.LLIILII(c0phw);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC682070QpB LLIILZL() {
        return this.LIZ.LLIILZL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIIZ(Comment comment, Aweme aweme, String str) {
        this.LIZ.LLIIZ(comment, aweme, str);
    }

    @Override // X.InterfaceC634440OuY
    public final VisualSearchTagAbility LLIL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return this.LIZ.LLIL(interfaceC665370Q7z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final float LLILII() {
        return this.LIZ.LLILII();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILIL() {
        this.LIZ.LLILIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLILL() {
        return this.LIZ.LLILL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILLIZIL(int i) {
        this.LIZ.LLILLIZIL(i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final EnumC584570MwJ LLILLJJLI() {
        return this.LIZ.LLILLJJLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILLL(Activity activity, String str, String str2, long j, long j2, long j3, Integer num) {
        this.LIZ.LLILLL(activity, str, str2, j, j2, j3, num);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILZ(Aweme aweme, String str, Object obj) {
        this.LIZ.LLILZ(aweme, str, obj);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC1051760dTa LLILZIL(C2203531BLz c2203531BLz, WeakReference<Context> weakReference, String str) {
        return this.LIZ.LLILZIL(c2203531BLz, weakReference, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILZLL(Object obj) {
        this.LIZ.LLILZLL(obj);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map LLIZ(String str, String str2, String str3, String str4, Map map) {
        return this.LIZ.LLIZ(str, str2, str3, str4, map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLIZLLLIL() {
        return this.LIZ.LLIZLLLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJ(Integer num, String str) {
        this.LIZ.LLJ(num, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJI(ViewGroup viewGroup, Context context, Aweme aweme, String str, String str2, boolean z, long j, boolean z2, Integer num) {
        this.LIZ.LLJI(viewGroup, context, aweme, str, str2, z, j, z2, num);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C0SMG LLJIJIL(String str) {
        return this.LIZ.LLJIJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJILJIL() {
        this.LIZ.LLJILJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJILJILJ(Fragment fragment, boolean z) {
        this.LIZ.LLJILJILJ(fragment, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJILLL() {
        this.LIZ.LLJILLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJ(Activity activity, String str, long j, String str2) {
        this.LIZ.LLJJ(activity, str, j, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility LLJJI(Object obj) {
        return this.LIZ.LLJJI(obj);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Function2<Uri.Builder, n, Unit> LLJJIII(InterfaceC665370Q7z interfaceC665370Q7z) {
        return this.LIZ.LLJJIII(interfaceC665370Q7z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJIJI() {
        this.LIZ.LLJJIJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJIJIIJIL(Context context, TextExtraStruct textExtraStruct, Aweme aweme, String str, String str2, String str3, Integer num, int i) {
        this.LIZ.LLJJIJIIJIL(context, textExtraStruct, aweme, str, str2, str3, num, i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLJJIJIL() {
        return this.LIZ.LLJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Class<? extends InterfaceC1063710dmr>[] LLJJJ() {
        return this.LIZ.LLJJJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C10GR LLJJJIL(View view, C19EG c19eg) {
        return this.LIZ.LLJJJIL(view, c19eg);
    }

    @Override // X.InterfaceC688200Qz4
    public final boolean LLJJJJ() {
        return this.LIZ.LLJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJJJJIL(long j, String str, boolean z) {
        this.LIZ.LLJJJJJIL(j, str, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJJJLIIL(C19EG c19eg, BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew, SearchResultParam searchResultParam) {
        this.LIZ.LLJJJJLIIL(c19eg, baseDiscoverAndSearchFragmentNew, searchResultParam);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLJJL(String str) {
        return this.LIZ.LLJJL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJLIIIJLLLLLLLZ(Context context, Fragment fragment, SearchResultParam searchResultParam) {
        this.LIZ.LLJJLIIIJLLLLLLLZ(context, fragment, searchResultParam);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJL(Fragment fragment, List<String> list, boolean z, Activity activity, String str) {
        this.LIZ.LLJL(fragment, list, z, activity, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLJLIL() {
        return this.LIZ.LLJLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLJLILLLLZIIL() {
        return this.LIZ.LLJLILLLLZIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJLL() {
        this.LIZ.LLJLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC1051730dTX LLJLLIL(C1051660dTQ c1051660dTQ, String str) {
        return this.LIZ.LLJLLIL(c1051660dTQ, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLJLLL(String str) {
        return this.LIZ.LLJLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJZ() {
        this.LIZ.LLJZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLJZIJLIL(Aweme aweme, String str) {
        return this.LIZ.LLJZIJLIL(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLL() {
        this.LIZ.LLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLF(Aweme aweme, String str, Object obj) {
        this.LIZ.LLLF(aweme, str, obj);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLFF(String str, Fragment fragment, InterfaceC666730QDf interfaceC666730QDf) {
        this.LIZ.LLLFF(str, fragment, interfaceC666730QDf);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLLFFI(boolean z, boolean z2) {
        return this.LIZ.LLLFFI(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final View LLLFZ(Context context, Aweme aweme, String str, String str2, boolean z, long j, boolean z2, boolean z3, Function0<Unit> function0, Integer num) {
        return this.LIZ.LLLFZ(context, aweme, str, str2, z, j, z2, z3, function0, num);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLI(EnumC673010QaZ enumC673010QaZ) {
        this.LIZ.LLLI(enumC673010QaZ);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Aweme LLLII(Aweme aweme, Function1<? super String, ? extends Aweme> function1) {
        return this.LIZ.LLLII(aweme, function1);
    }

    @Override // X.InterfaceC1601620rmS
    public final void LLLIIII(List<? extends Aweme> list, boolean z) {
        this.LIZ.LLLIIII(list, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLIIIIL(Context context, Bundle bundle) {
        this.LIZ.LLLIIIIL(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC665700Q9g LLLIIIL() {
        return this.LIZ.LLLIIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> LLLIIL(Aweme aweme) {
        return this.LIZ.LLLIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLIILIL() {
        return this.LIZ.LLLIILIL();
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends AbstractC738140SxQ> LLLIL() {
        return this.LIZ.LLLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C13IQ<? extends UIContentAssem> LLLILZ() {
        return this.LIZ.LLLILZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLILZJ(Context context) {
        return this.LIZ.LLLILZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLILZLLLI() {
        return this.LIZ.LLLILZLLLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLIZZ() {
        this.LIZ.LLLIZZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLJ(String str, String str2, String str3) {
        this.LIZ.LLLJ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC1606680ruc LLLJIL() {
        return this.LIZ.LLLJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C1390920mIc LLLJL(View view, C434640H2o c434640H2o, Function2<? super Integer, ? super InterfaceC434580H2i, Unit> function2, Function2<? super Integer, ? super InterfaceC434580H2i, Unit> function22, AbstractC329610Cw3<?> abstractC329610Cw3, Function1<? super Function0<? extends ViewOnAttachStateChangeListenerC20604515jv>, Unit> function1) {
        return this.LIZ.LLLJL(view, c434640H2o, function2, function22, abstractC329610Cw3, function1);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Integer LLLL(String str) {
        return this.LIZ.LLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final IMusicSearchContextAbility LLLLII(LifecycleOwner lifecycleOwner) {
        return this.LIZ.LLLLII(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLIIIILLL() {
        this.LIZ.LLLLIIIILLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLIIL(SearchResultParam searchResultParam) {
        this.LIZ.LLLLIIL(searchResultParam);
    }

    @Override // X.InterfaceC1355760lNu
    public final void LLLLIILL(String str, String str2, String str3, String str4, boolean z) {
        this.LIZ.LLLLIILL(str, str2, str3, str4, z);
    }

    @Override // X.InterfaceC1386220mB2
    public final boolean LLLLIILLL(Aweme aweme) {
        return this.LIZ.LLLLIILLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLIL(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, PromotionInfo promotionInfo, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, Integer num2, Integer num3, Boolean bool, Boolean bool2, Map<String, String> map, String str16, String str17, String str18, Boolean bool3, String str19, C0QFY c0qfy, String str20, String str21) {
        this.LIZ.LLLLIL(aweme, str, str2, str3, str4, str5, str6, str7, str8, promotionInfo, str9, str10, str11, str12, str13, num, str14, str15, num2, num3, bool, bool2, map, str16, str17, str18, bool3, str19, c0qfy, str20, str21);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLILI(String str, String str2) {
        this.LIZ.LLLLILI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final EnterRoomConfig LLLLJ(Aweme aweme, C654590Plx c654590Plx, EnterRoomConfig enterRoomConfig, String str, View view, Context context) {
        return this.LIZ.LLLLJ(aweme, c654590Plx, enterRoomConfig, str, view, context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLJI() {
        return this.LIZ.LLLLJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final int LLLLL(int i) {
        return this.LIZ.LLLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLLIL(String str, String str2) {
        this.LIZ.LLLLLIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final int LLLLLILLIL(Aweme aweme) {
        return this.LIZ.LLLLLILLIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLLLLJIL(int i) {
        return this.LIZ.LLLLLJIL(i);
    }

    @Override // X.InterfaceC1586210rNb
    public final boolean LLLLLJLJLL() {
        return this.LIZ.LLLLLJLJLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> LLLLLL() {
        return this.LIZ.LLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLLIL(Context context) {
        return this.LIZ.LLLLLLIL(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final View LLLLLLJ(View view) {
        return this.LIZ.LLLLLLJ(view);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLLLL() {
        this.LIZ.LLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLLLLL() {
        return this.LIZ.LLLLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLLLLLL(Aweme aweme) {
        return this.LIZ.LLLLLLLLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final List<String> LLLLLLLZIL(int i) {
        return this.LIZ.LLLLLLLZIL(i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLLLZ(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, PromotionInfo promotionInfo, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str16, String str17, String str18, Boolean bool4, String str19, C0QFY c0qfy, String str20, String str21) {
        this.LIZ.LLLLLLZ(aweme, str, str2, str3, str4, str5, str6, str7, str8, promotionInfo, str9, str10, str11, str12, str13, num, str14, str15, num2, bool, bool2, bool3, str16, str17, str18, bool4, str19, c0qfy, str20, str21);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC1911280zpu LLLLLLZZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return this.LIZ.LLLLLLZZ(interfaceC665370Q7z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> LLLLLZ(String str) {
        return this.LIZ.LLLLLZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLLZIL(SharePackage sharePackage, List list) {
        this.LIZ.LLLLLZIL(sharePackage, list);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLZL() {
        return this.LIZ.LLLLLZL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLLLZ() {
        return this.LIZ.LLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLZI() {
        return this.LIZ.LLLLZI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLZIL() {
        return this.LIZ.LLLLZIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLLLZLL(Aweme aweme) {
        return this.LIZ.LLLLZLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLZLLIL(Uri uri) {
        this.LIZ.LLLLZLLIL(uri);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLZLLLI(String str, Fragment fragment, InterfaceC666850QDr interfaceC666850QDr) {
        this.LIZ.LLLLZLLLI(str, fragment, interfaceC666850QDr);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLLZ() {
        return this.LIZ.LLLZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLZI() {
        return this.LIZ.LLLZI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLZIIL() {
        return this.LIZ.LLLZIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Object LLLZIL(Aweme aweme, C2189821An6 c2189821An6) {
        return this.LIZ.LLLZIL(aweme, c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLZL() {
        this.LIZ.LLLZL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> LLLZLL() {
        return this.LIZ.LLLZLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C0Q3P LLLZLZ() {
        return this.LIZ.LLLZLZ();
    }

    @Override // X.C14SH
    public final void LLLZZ(e eVar) {
        this.LIZ.LLLZZ(eVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> LLZ() {
        return this.LIZ.LLZ();
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends AbstractC738140SxQ> LLZIL() {
        return this.LIZ.LLZIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLZILL(View view, Aweme aweme, Map<String, String> map) {
        this.LIZ.LLZILL(view, aweme, map);
    }

    @Override // X.InterfaceC1386220mB2
    public final boolean LLZL(Aweme aweme) {
        return this.LIZ.LLZL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final SearchSecurityControlValue LLZLI() {
        return this.LIZ.LLZLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLZLL(View view, LifecycleOwner lifecycleOwner) {
        this.LIZ.LLZLL(view, lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLZLLIL(Aweme aweme, C19EG c19eg, Fragment fragment, String str, SmartSearchInfoStruct smartSearchInfoStruct) {
        return this.LIZ.LLZLLIL(aweme, c19eg, fragment, str, smartSearchInfoStruct);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLZLLLL(String str) {
        return this.LIZ.LLZLLLL(str);
    }

    @Override // X.InterfaceC1601620rmS
    public final void LLZZ(boolean z) {
        this.LIZ.LLZZ(z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C0SAD LLZZJLIL(String str) {
        return this.LIZ.LLZZJLIL(str);
    }

    @Override // X.InterfaceC302520BtS
    public final void LLZZLLIL() {
        this.LIZ.LLZZLLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLZZZIL() {
        return this.LIZ.LLZZZIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLZZZZ(Aweme aweme, int i, String str, int i2, int i3) {
        this.LIZ.LLZZZZ(aweme, i, str, i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC676520QgE M() {
        return this.LIZ.M();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void M0(Aweme aweme, C0N0Y c0n0y, int i) {
        this.LIZ.M0(aweme, c0n0y, i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final List<FeedbackMultipleChoice> N(String str) {
        return this.LIZ.N(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean N0() {
        return this.LIZ.N0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String O() {
        return this.LIZ.O();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void O0(Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ.O0(function0, function02);
    }

    @Override // X.InterfaceC1611110s1l
    public final void P() {
        this.LIZ.P();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility P0() {
        return this.LIZ.P0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void Q(InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment, Aweme aweme, AObjectS101S0101000_19 aObjectS101S0101000_19) {
        this.LIZ.Q(interfaceC665370Q7z, fragment, aweme, aObjectS101S0101000_19);
    }

    @Override // X.InterfaceC1586210rNb
    public final boolean Q0() {
        return this.LIZ.Q0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void R() {
        this.LIZ.R();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void R0(LifecycleOwner lifecycleOwner, Aweme aweme, Map<String, String> map, C2189821An6 c2189821An6) {
        this.LIZ.R0(lifecycleOwner, aweme, map, c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> S() {
        return this.LIZ.S();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void T(String str) {
        this.LIZ.T(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean U(C2189821An6 c2189821An6, Fragment fragment, Aweme aweme) {
        return this.LIZ.U(c2189821An6, fragment, aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean V(String str) {
        return this.LIZ.V(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String W(Context context, User user) {
        return this.LIZ.W(context, user);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void X(String str, int i, String str2, String str3, String str4, String str5) {
        this.LIZ.X(str, i, str2, str3, str4, str5);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void Y() {
        this.LIZ.Y();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void Z(Fragment fragment, List<ImageData> list, int i, HashMap<String, String> map) {
        this.LIZ.Z(fragment, list, i, map);
    }

    @Override // X.InterfaceC1569760qx4
    public final C13IQ<? extends AbstractC738140SxQ> a() {
        return this.LIZ.a();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a0(C1331670kl3 c1331670kl3, Map<String, ? extends Object> map, Object obj, View view, InterfaceC1911280zpu interfaceC1911280zpu, NimbleMobAbility nimbleMobAbility) {
        this.LIZ.a0(c1331670kl3, map, obj, view, interfaceC1911280zpu, nimbleMobAbility);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final List<C0TRR> b() {
        return this.LIZ.b();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void b0() {
        this.LIZ.b0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void c(Fragment fragment, String str) {
        this.LIZ.c(fragment, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> c0(Map<String, String> map) {
        return this.LIZ.c0(map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> d(String str) {
        return this.LIZ.d(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility d0(View view) {
        return this.LIZ.d0(view);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean e() {
        return this.LIZ.e();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean e0() {
        return this.LIZ.e0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String f(n nVar, String str) {
        return this.LIZ.f(nVar, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String f0() {
        return this.LIZ.f0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> fetchSearchParams(String str, String str2) {
        return this.LIZ.fetchSearchParams(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void g(C19EG c19eg) {
        this.LIZ.g(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void g0() {
        this.LIZ.g0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final JSONObject getEcommerceSearchInfo() {
        return this.LIZ.getEcommerceSearchInfo();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String getLatestSearchId() {
        return this.LIZ.getLatestSearchId();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> getLogParamsFromSearch(String str, String str2, String... strArr) {
        return this.LIZ.getLogParamsFromSearch(str, str2, strArr);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean h() {
        return this.LIZ.h();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> h0(Aweme aweme) {
        return this.LIZ.h0(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean i(Aweme aweme, C2189821An6 c2189821An6) {
        return this.LIZ.i(aweme, c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean i0(Aweme aweme, String str, String str2) {
        return this.LIZ.i0(aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void j(Aweme aweme, Object obj) {
        this.LIZ.j(aweme, obj);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean j0(Context context, Aweme aweme, String str, EnumC667230QFd enumC667230QFd, boolean z, boolean z2) {
        return this.LIZ.j0(context, aweme, str, enumC667230QFd, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final int k(Aweme aweme) {
        return this.LIZ.k(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void k0(String str, String str2) {
        this.LIZ.k0(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility l(InterfaceC2753014t interfaceC2753014t) {
        return this.LIZ.l(interfaceC2753014t);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean l0() {
        return this.LIZ.l0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean m() {
        return this.LIZ.m();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean m0() {
        return this.LIZ.m0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> n() {
        return this.LIZ.n();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void n0(String str, String str2, boolean z) {
        this.LIZ.n0(str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void notifyFromRnAndH5(JSONObject jSONObject) {
        this.LIZ.notifyFromRnAndH5(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void o(Fragment fragment, View view, Aweme aweme, String str, String str2, int i) {
        this.LIZ.o(fragment, view, aweme, str, str2, i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void o0(String str, String str2) {
        this.LIZ.o0(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Fragment p(Fragment fragment, InterfaceC668720QKw interfaceC668720QKw) {
        return this.LIZ.p(fragment, interfaceC668720QKw);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility p0(SearchResultParam searchResultParam) {
        return this.LIZ.p0(searchResultParam);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Aweme q(Aweme aweme) {
        return this.LIZ.q(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String q0() {
        return this.LIZ.q0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final IMusicSearchContextAbility r() {
        return this.LIZ.r();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String r0(String str) {
        return this.LIZ.r0(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean s(PublishModel publishModel, InterfaceC214902198i interfaceC214902198i, C19EG c19eg) {
        return this.LIZ.s(publishModel, interfaceC214902198i, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean s0(Context context, Aweme aweme, Fragment fragment) {
        return this.LIZ.s0(context, aweme, fragment);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String t(Aweme aweme, Integer num) {
        return this.LIZ.t(aweme, num);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> t0() {
        return this.LIZ.t0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void u(Context context, Fragment fragment, SearchResultParam searchResultParam) {
        this.LIZ.u(context, fragment, searchResultParam);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void u0(String str, String str2, String str3, String str4) {
        this.LIZ.u0(str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void v(Context context, String str, Bundle bundle) {
        this.LIZ.v(context, str, bundle);
    }

    @Override // X.InterfaceC1611110s1l
    public final void v0(Function0<Unit> function0) {
        this.LIZ.v0(function0);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean w(Aweme aweme, String str) {
        return this.LIZ.w(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void w0(Context context, String str, TextExtraStruct textExtraStruct, Map<String, String> map, String str2) {
        this.LIZ.w0(context, str, textExtraStruct, map, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C13IQ<? extends UIContentAssem> x() {
        return this.LIZ.x();
    }

    @Override // X.InterfaceC20267614Sc
    public final void x0(int i, String str, C0QHX c0qhx, long j) {
        this.LIZ.x0(i, str, c0qhx, j);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void y(BasePanelUIComponent basePanelUIComponent) {
        this.LIZ.y(basePanelUIComponent);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC676470Qg9 y0() {
        return this.LIZ.y0();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void z(String str) {
        this.LIZ.z(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean z0(Fragment fragment) {
        return this.LIZ.z0(fragment);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C1163440gNi LLLZZIL() {
        return this.LIZ.LLLZZIL();
    }
}
