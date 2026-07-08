package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.BaseMovementMethod;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.FeedIconBubbleInfo;
import com.ss.android.ugc.aweme.tako.model.FeedbarDrawCreateInfo;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.model.TakoActionItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS265S0300000_21;
import org.json.JSONObject;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: renamed from: X.14TF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14TF implements ITakoService {
    public static final C14TF LIZIZ = new C14TF();
    public final /* synthetic */ ITakoService LIZ = (ITakoService) ServiceManager.get().getService(ITakoService.class);

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LIZIZ(String str, JSONObject jSONObject) {
        this.LIZ.LIZIZ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LIZJ(String str, Map<String, String> map) {
        this.LIZ.LIZJ(str, map);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final InterfaceC446860Hfg LIZLLL(RecyclerView recyclerView) {
        return this.LIZ.LIZLLL(recyclerView);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJFF(boolean z) {
        this.LIZ.LJFF(z);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final InterfaceC684380Qsu LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final Object LJII(InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return this.LIZ.LJII(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJIIIIZZ(Context context, C2189821An6 c2189821An6, String str, String str2) {
        return this.LIZ.LJIIIIZZ(context, c2189821An6, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final int LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final int LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C0Q7N LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final int LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final Integer LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final InterfaceC1350790lFt LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJIIZILJ(SharePackage sharePackage) {
        return this.LIZ.LJIIZILJ(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final String LJIJ(C19EG c19eg) {
        return this.LIZ.LJIJ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C1363660lae LJIJI() {
        return this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJIJJ(Aweme aweme) {
        return this.LIZ.LJIJJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final String LJIJJLI(String str) {
        return this.LIZ.LJIJJLI(str);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final Map<String, String> LJIL(Aweme aweme, C2189821An6 c2189821An6) {
        return this.LIZ.LJIL(aweme, c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final String LJJ(Context context, Bitmap bitmap, String str) {
        return this.LIZ.LJJ(context, bitmap, str);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final InterfaceC815880VzW LJJI() {
        return this.LIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    @InterfaceC1294060jmO
    public final TakoEnterParams LJJIFFI(String str, long j, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, Long l, String str9, List list2, List list3, List list4, List list5, List list6, Map map, TakoEventTracker takoEventTracker, TakoActionItem takoActionItem, boolean z, Aweme aweme, FeedbarDrawCreateInfo feedbarDrawCreateInfo, String str10, String str11, AIBotInfo aIBotInfo, String str12, String str13, Integer num, boolean z2, String str14, String str15, String str16, boolean z3, FeedIconBubbleInfo feedIconBubbleInfo, SuggestionWordInfo suggestionWordInfo, TakoEntranceRequestInfo takoEntranceRequestInfo, String str17, String str18, String str19, String str20, String str21, SmartSearchItem smartSearchItem, boolean z4, boolean z5, boolean z6, String str22, String str23, Integer num2, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str24) {
        return this.LIZ.LJJIFFI(str, j, str2, str3, str4, list, str5, str6, str7, str8, l, str9, list2, list3, list4, list5, list6, map, takoEventTracker, takoActionItem, z, aweme, feedbarDrawCreateInfo, str10, str11, aIBotInfo, str12, str13, num, z2, str14, str15, str16, z3, feedIconBubbleInfo, suggestionWordInfo, takoEntranceRequestInfo, str17, str18, str19, str20, str21, smartSearchItem, z4, z5, z6, str22, str23, num2, nimbleParams, c665120Q7a, str24);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJII(Context context) {
        this.LIZ.LJJII(context);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C1367050lg7 LJJIII() {
        return this.LIZ.LJJIII();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJIIJ(String str, Fragment fragment, C14FB c14fb) {
        this.LIZ.LJJIIJ(str, fragment, c14fb);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJIIJZLJL(Map<String, String> map) {
        this.LIZ.LJJIIJZLJL(map);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final String LJJIIZ() {
        return this.LIZ.LJJIIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJIIZI(String str) {
        this.LIZ.LJJIIZI(str);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJJIJ(Context context) {
        return this.LIZ.LJJIJ(context);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJJIJIIJI(Context context) {
        return this.LIZ.LJJIJIIJI(context);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJJIJIIJIL() {
        return this.LIZ.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJIJIL() {
        this.LIZ.LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJIJL(int i, String str) {
        this.LIZ.LJJIJL(i, str);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final Object LJJIJLIJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LIZ.LJJIJLIJ(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C1DD4 LJJIL() {
        return this.LIZ.LJJIL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final Object LJJIZ(int i, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        return this.LIZ.LJJIZ(i, j, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJJ() {
        this.LIZ.LJJJ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final String LJJJI(long j, Boolean bool, String str, String str2, String str3, boolean z) {
        return this.LIZ.LJJJI(j, bool, str, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJJIL(Context context, boolean z, String str, boolean z2) {
        this.LIZ.LJJJIL(context, z, str, z2);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final int LJJJJ() {
        return this.LIZ.LJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final InterfaceC1606670rub LJJJJI() {
        return this.LIZ.LJJJJI();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJJJJIZL(String str) {
        return this.LIZ.LJJJJIZL(str);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJJJJ(Context context, String str, EnumC1373490lqV enumC1373490lqV) {
        this.LIZ.LJJJJJ(context, str, enumC1373490lqV);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C14FC LJJJJJL() {
        return this.LIZ.LJJJJJL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJJJL(Fragment fragment, List<TakoImageItem> list, int i, String str, List<String> list2, Map<String, String> map, boolean z) {
        this.LIZ.LJJJJL(fragment, list, i, str, list2, map, z);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJJJLI(boolean z) {
        this.LIZ.LJJJJLI(z);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJJJJLL(SharePackage sharePackage, String str) {
        return this.LIZ.LJJJJLL(sharePackage, str);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJJJZ(SharePackage sharePackage, String str, String str2, Function1<? super Boolean, Unit> function1) {
        this.LIZ.LJJJJZ(sharePackage, str, str2, function1);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJJJZI(boolean z) {
        this.LIZ.LJJJJZI(z);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final String LJJJLIIL() {
        return this.LIZ.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final ITakoMob LJJJLL() {
        return this.LIZ.LJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJJLZIJ(int i, Activity activity, String str, Map map, Function1 function1, boolean z, boolean z2) {
        this.LIZ.LJJJLZIJ(i, activity, str, map, function1, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final BaseMovementMethod LJJJZ() {
        return this.LIZ.LJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final int LJJL() {
        return this.LIZ.LJJL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJLI(int i, Activity activity, Function1 function1) {
        this.LIZ.LJJLI(i, activity, function1);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJJLIIIIJ() {
        return this.LIZ.LJJLIIIIJ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final InterfaceC685580Quq LJJLIIIJ() {
        return this.LIZ.LJJLIIIJ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJJLIIIJILLIZJL() {
        return this.LIZ.LJJLIIIJILLIZJL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJLIIIJJI(long j, String str) {
        this.LIZ.LJJLIIIJJI(j, str);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJLIIIJJIZ(Context context, String str, String str2) {
        this.LIZ.LJJLIIIJJIZ(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJLIIIJL(C2189821An6 c2189821An6, LifecycleOwner lifecycleOwner, View view, Aweme aweme, Function0<Boolean> function0, Function1<? super Boolean, Unit> function1, Function1<? super String, Unit> function12) {
        this.LIZ.LJJLIIIJL(c2189821An6, lifecycleOwner, view, aweme, function0, function1, function12);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJLIIIJLJLI(int i) {
        this.LIZ.LJJLIIIJLJLI(i);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final String LJJLIIIJLLLLLLLZ() {
        return this.LIZ.LJJLIIIJLLLLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJLIIJ(int i) {
        this.LIZ.LJJLIIJ(i);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final InterfaceC430910Gv3 LJJLIL(Drawable drawable, int i, int i2, boolean z, boolean z2) {
        return this.LIZ.LJJLIL(drawable, i, i2, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final InterfaceC1864030ybh LJJLJ() {
        return this.LIZ.LJJLJ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJLJLI(C1388100mE4 c1388100mE4) {
        this.LIZ.LJJLJLI(c1388100mE4);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final View LJJLL(Context context, Aweme aweme, String str, String str2, String str3, AwS265S0300000_21 awS265S0300000_21) {
        return this.LIZ.LJJLL(context, aweme, str, str2, str3, awS265S0300000_21);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    @InterfaceC1294060jmO
    public final void LJJZ(Context context, TakoEnterParams takoEnterParams, View view, List<? extends Aweme> list, boolean z, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT) {
        this.LIZ.LJJZ(context, takoEnterParams, view, list, z, interfaceC19396010uU, interfaceC19395910uT);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C14EH LJJZZI() {
        return this.LIZ.LJJZZI();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJJZZIII(View view, Integer num) {
        this.LIZ.LJJZZIII(view, num);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJL(Context context) {
        return this.LIZ.LJL(context);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final Object LJLI(InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return this.LIZ.LJLI(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJLIIIL() {
        return this.LIZ.LJLIIIL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJLIIL(Aweme aweme) {
        return this.LIZ.LJLIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJLIL(C14F9 c14f9) {
        this.LIZ.LJLIL(c14f9);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final InterfaceC666720QDe LJLILLLLZI() {
        return this.LIZ.LJLILLLLZI();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C13IQ<? extends UiComposableAssem<C1214550hi9>> LJLJI() {
        return this.LIZ.LJLJI();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final boolean LJLJJI() {
        return this.LIZ.LJLJJI();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C06KX LJLJJL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return this.LIZ.LJLJJL(interfaceC665370Q7z);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final ReusedUIAssem<? extends C03H5> LJLJJLL(C2189821An6 c2189821An6) {
        return this.LIZ.LJLJJLL(c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJLJL(String str, String str2, Bundle bundle) {
        this.LIZ.LJLJL(str, str2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJLJLJ(LifecycleOwner lifecycleOwner, C19EG c19eg, C2189821An6 c2189821An6) {
        this.LIZ.LJLJLJ(lifecycleOwner, c19eg, c2189821An6);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJLJLLL(C14F8 c14f8) {
        this.LIZ.LJLJLLL(c14f8);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final C1166904hP LJLL() {
        return this.LIZ.LJLL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJLLI(Aweme aweme, String str, String str2) {
        this.LIZ.LJLLI(aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJLLILLLL(View view, Integer num) {
        this.LIZ.LJLLILLLL(view, num);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJLLJ(long j, String str) {
        this.LIZ.LJLLJ(j, str);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJLLL(Bundle bundle, String str) {
        this.LIZ.LJLLL(bundle, str);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    @InterfaceC1294060jmO
    public final void LJLLLL(Context context, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, String str10, List<? extends Aweme> list, List<String> list2, List<SearchBingItem> list3, List<TakoImageItem> list4, List<ReferenceItemBridge> list5, Map<String, String> map, List<? extends Aweme> list6, TakoEventTracker takoEventTracker, TakoActionItem takoActionItem, boolean z, Aweme aweme, String str11, String str12, AIBotInfo aIBotInfo, String str13, String str14, SuggestionWordInfo suggestionWordInfo, String str15, TakoEntranceRequestInfo takoEntranceRequestInfo, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str23) {
        this.LIZ.LJLLLL(context, str, str2, j, str3, str4, str5, str6, str7, str8, str9, l, str10, list, list2, list3, list4, list5, map, list6, takoEventTracker, takoActionItem, z, aweme, str11, str12, aIBotInfo, str13, str14, suggestionWordInfo, str15, takoEntranceRequestInfo, str16, str17, str18, str19, str20, str21, str22, num, nimbleParams, c665120Q7a, str23);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJLLLLLL() {
        this.LIZ.LJLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final List<InterfaceC1859860yUy> LJLZ() {
        return this.LIZ.LJLZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final Map<String, List<TakoKeyFramePoint>> LJZ(C19EG c19eg) {
        return this.LIZ.LJZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoService
    public final void LJZI(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.LIZ.LJZI(context, str, str2, str3, z, str4, str5, str6);
    }
}
