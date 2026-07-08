package X;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10Ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19212010Ec implements INoticeService {
    public static final C19212010Ec LIZJ = new C19212010Ec();
    public final /* synthetic */ INoticeService LIZIZ = (INoticeService) ServiceManager.get().getService(INoticeService.class);

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final NetworkPartner LIZ() {
        return this.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final C0WHU LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final C05RV LIZJ() {
        return this.LIZIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LIZLLL() {
        return this.LIZIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJ() {
        return this.LIZIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Class<?> LJFF(Context context, C1917290zzb c1917290zzb, InterfaceC1917380zzk interfaceC1917380zzk) {
        return this.LIZIZ.LJFF(context, c1917290zzb, interfaceC1917380zzk);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int LJI() {
        return this.LIZIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJII() {
        return this.LIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final List<FilterTabType> LJIIIIZZ() {
        return this.LIZIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIIIZ(MotionEvent motionEvent) {
        this.LIZIZ.LJIIIZ(motionEvent);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIIJ() {
        return this.LIZIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int LJIIJJI() {
        return this.LIZIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIIL(Context context) {
        return this.LIZIZ.LJIIL(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIILIIL() {
        return this.LIZIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIILJJIL(Context context, C1917290zzb c1917290zzb) {
        this.LIZIZ.LJIILJJIL(context, c1917290zzb);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIILL() {
        this.LIZIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1908070zkj LJIILLIIL() {
        return this.LIZIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJIIZILJ() {
        return this.LIZIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Intent LJIJ(Context context) {
        return this.LIZIZ.LJIJ(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIJI(Context context, C1917290zzb c1917290zzb, C19206610Ca c19206610Ca) {
        this.LIZIZ.LJIJI(context, c1917290zzb, c19206610Ca);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int LJIJJ(Context context, User user, String str, String str2, boolean z) {
        return this.LIZIZ.LJIJJ(context, user, str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJIJJLI(String str, String str2) {
        return this.LIZIZ.LJIJJLI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJIL(C889900Yvc c889900Yvc) {
        this.LIZIZ.LJIL(c889900Yvc);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJ() {
        return this.LIZIZ.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJI() {
        this.LIZIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIFFI(InterfaceC889970Yvj interfaceC889970Yvj) {
        this.LIZIZ.LJJIFFI(interfaceC889970Yvj);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends AmeBaseFragment> Class<? extends T> LJJII() {
        return this.LIZIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIII() {
        return this.LIZIZ.LJJIII();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIIJ(String str) {
        this.LIZIZ.LJJIIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIIJZLJL() {
        this.LIZIZ.LJJIIJZLJL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1255480imA LJJIIZ() {
        return this.LIZIZ.LJJIIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1209300hZg LJJIIZI() {
        return this.LIZIZ.LJJIIZI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIJ() {
        return this.LIZIZ.LJJIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJIJIIJI() {
        return this.LIZIZ.LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIJIIJIL() {
        this.LIZIZ.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final FilterTabType LJJIJIL() {
        return this.LIZIZ.LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC889560Yv4 LJJIJL(C878950Ydx c878950Ydx, Function0<? extends List<? extends InterfaceC888500YtM>> function0) {
        return this.LIZIZ.LJJIJL(c878950Ydx, function0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIJLIJ(FilterTabType filterTabType, String str) {
        this.LIZIZ.LJJIJLIJ(filterTabType, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIL(Function0<Unit> function0) {
        this.LIZIZ.LJJIL(function0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJIZ(Context context, String str, boolean z) {
        this.LIZIZ.LJJIZ(context, str, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJJJ() {
        return this.LIZIZ.LJJJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJI() {
        this.LIZIZ.LJJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJIL() {
        return this.LIZIZ.LJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final C05RV LJJJJ() {
        return this.LIZIZ.LJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJJI(Context context) {
        return this.LIZIZ.LJJJJI(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJIZL(C19EG c19eg, int i, List<Integer> list, String str, C635690OwZ c635690OwZ, Map<String, String> map, Function1<? super C1801100wyC, Unit> function1) {
        this.LIZIZ.LJJJJIZL(c19eg, i, list, str, c635690OwZ, map, function1);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1570900qyu LJJJJJ(C19EG c19eg, InterfaceC1617760sCU interfaceC1617760sCU) {
        return this.LIZIZ.LJJJJJ(c19eg, interfaceC1617760sCU);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJJL(Long l) {
        this.LIZIZ.LJJJJJL(l);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJL(String str, WeakHandler weakHandler) {
        this.LIZIZ.LJJJJL(str, weakHandler);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final RecyclerView.ViewHolder LJJJJLI(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        return this.LIZIZ.LJJJJLI(viewGroup, c13iq);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJJLL() {
        this.LIZIZ.LJJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC1349370lDb LJJJJZ() {
        return this.LIZIZ.LJJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJJZI() {
        return this.LIZIZ.LJJJJZI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Intent LJJJLIIL(Context context, String str) {
        return this.LIZIZ.LJJJLIIL(context, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJLL() {
        return this.LIZIZ.LJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJJLZIJ() {
        this.LIZIZ.LJJJLZIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJJZ() {
        return this.LIZIZ.LJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Pair<FilterTabType, Set<EnumC880480YgQ>> LJJL() {
        return this.LIZIZ.LJJL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLI() {
        this.LIZIZ.LJJLI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIIJ(NoticeList noticeList) {
        this.LIZIZ.LJJLIIIIJ(noticeList);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIJ(String str, WeakHandler weakHandler) {
        this.LIZIZ.LJJLIIIJ(str, weakHandler);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIJILLIZJL(Context context, C1917290zzb c1917290zzb) {
        this.LIZIZ.LJJLIIIJILLIZJL(context, c1917290zzb);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Boolean LJJLIIIJJI() {
        return this.LIZIZ.LJJLIIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIJJIZ(C19EG c19eg) {
        this.LIZIZ.LJJLIIIJJIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJLIIIJL() {
        return this.LIZIZ.LJJLIIIJL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJLIIIJLJLI() {
        return this.LIZIZ.LJJLIIIJLJLI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIIIJLLLLLLLZ() {
        this.LIZIZ.LJJLIIIJLLLLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends CommonPageFragment> Class<? extends T> LJJLIIJ() {
        return this.LIZIZ.LJJLIIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLIL(InterfaceC889970Yvj interfaceC889970Yvj) {
        this.LIZIZ.LJJLIL(interfaceC889970Yvj);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLJ() {
        this.LIZIZ.LJJLJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJLJLI(String str, boolean z) {
        this.LIZIZ.LJJLJLI(str, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJLL() {
        return this.LIZIZ.LJJLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJZ(int i) {
        this.LIZIZ.LJJZ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJJZZI() {
        return this.LIZIZ.LJJZZI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJJZZIII() {
        this.LIZIZ.LJJZZIII();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final ViewModelProvider.Factory LJL() {
        return this.LIZIZ.LJL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLI(String str, boolean z) {
        this.LIZIZ.LJLI(str, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final Pair<FilterTabType, Set<EnumC880480YgQ>> LJLIIIL() {
        return this.LIZIZ.LJLIIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final View.OnClickListener LJLIIL(Context context) {
        return this.LIZIZ.LJLIIL(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final SpannableStringBuilder LJLIL(TextView textView, CharSequence charSequence, int i, int i2, int i3, int i4, List<Pair<Integer, Integer>> list, Integer num) {
        return this.LIZIZ.LJLIL(textView, charSequence, i, i2, i3, i4, list, num);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLILLLLZI() {
        this.LIZIZ.LJLILLLLZI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLJI() {
        this.LIZIZ.LJLJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLJJI(BaseResponse baseResponse) {
        return this.LIZIZ.LJLJJI(baseResponse);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLJJL() {
        return this.LIZIZ.LJLJJL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLJJLL(Context context) {
        this.LIZIZ.LJLJJLL(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLJL() {
        this.LIZIZ.LJLJL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLJLLL(long j, String str) {
        this.LIZIZ.LJLJLLL(j, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final AbstractC1906720ziY LJLL(C1242310iQv c1242310iQv) {
        return this.LIZIZ.LJLL(c1242310iQv);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLLI(BaseResponse baseResponse) {
        return this.LIZIZ.LJLLI(baseResponse);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final AbstractC1585770rMt LJLLILLLL() {
        return this.LIZIZ.LJLLILLLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJLLJ(JSONObject jSONObject) {
        this.LIZIZ.LJLLJ(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LJLLL() {
        return this.LIZIZ.LJLLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLLLL() {
        return this.LIZIZ.LJLLLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LJLLLLLL() {
        return this.LIZIZ.LJLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final InterfaceC800130Va7 LJLZ() {
        return this.LIZIZ.LJLZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJZ() {
        this.LIZIZ.LJZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJZI(C05RV c05rv, String str, Function1<? super Boolean, Unit> function1) {
        this.LIZIZ.LJZI(c05rv, str, function1);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LJZL(Context context, C1917290zzb c1917290zzb) {
        this.LIZIZ.LJZL(context, c1917290zzb);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String LL() {
        return this.LIZIZ.LL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LLD(String str, boolean z) {
        this.LIZIZ.LLD(str, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LLF() {
        this.LIZIZ.LLF();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void LLFF(Context context, C1917290zzb c1917290zzb, C10D1 c10d1) {
        this.LIZIZ.LLFF(context, c1917290zzb, c10d1);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LLFFF() {
        return this.LIZIZ.LLFFF();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean LLFII() {
        return this.LIZIZ.LLFII();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void initLegoInflate() {
        this.LIZIZ.initLegoInflate();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void notifyLocaleChange(Locale locale) {
        this.LIZIZ.notifyLocaleChange(locale);
    }
}
