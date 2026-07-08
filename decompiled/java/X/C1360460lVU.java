package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.service.IUpvoteService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS60S2100000_21;

/* JADX INFO: renamed from: X.0lVU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360460lVU implements IUpvoteService {
    public static final C1360460lVU LIZIZ = new C1360460lVU();
    public final /* synthetic */ IUpvoteService LIZ = (IUpvoteService) ServiceManager.get().getService(IUpvoteService.class);

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final String LIZIZ(String str, String str2) {
        return this.LIZ.LIZIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LIZJ(int i) {
        return this.LIZ.LIZJ(i);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C1357900lRM> LIZLLL(C19EG c19eg) {
        return this.LIZ.LIZLLL(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJ(String str, UpvotePublishMobParam upvotePublishMobParam, boolean z, Function0 function0, Function0 function02, CarrierType carrierType, String str2, String str3, boolean z2) {
        this.LIZ.LJ(str, upvotePublishMobParam, z, function0, function02, carrierType, str2, str3, z2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final ProfileListFragment LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C11NZ LJI(String str, long j, int i, Integer num) {
        return this.LIZ.LJI(str, j, i, num);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJII(String str, String str2) {
        this.LIZ.LJII(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final UpvoteList LJIIIIZZ(String str) {
        return this.LIZ.LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C896990ZGv> LJIIIZ(C19EG c19eg) {
        return this.LIZ.LJIIIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIIJ() {
        this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIIJJI(List<? extends Aweme> list, boolean z, Map<String, Long> map, Map<String, String> map2, EnumC1359020lTA enumC1359020lTA, InterfaceC1359090lTH interfaceC1359090lTH) {
        this.LIZ.LJIIJJI(list, z, map, map2, enumC1359020lTA, interfaceC1359090lTH);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC1359280lTa LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJIILIIL(String str) {
        return this.LIZ.LJIILIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILJJIL() {
        this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final View LJIILL(Context context, Aweme aweme, String str, String str2, RepostReplyStruct repostReplyStruct, int i, C1907210zjL c1907210zjL) {
        return this.LIZ.LJIILL(context, aweme, str, str2, repostReplyStruct, i, c1907210zjL);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIIZILJ(C19EG c19eg, Object obj, Aweme aweme, String str) {
        this.LIZ.LJIIZILJ(c19eg, obj, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIJ(String str, String str2) {
        this.LIZ.LJIJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C1358700lSe> LJIJI(Fragment fragment) {
        return this.LIZ.LJIJI(fragment);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIJJ(Aweme aweme, String str, String str2, boolean z) {
        this.LIZ.LJIJJ(aweme, str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJIJJLI(Aweme aweme) {
        return this.LIZ.LJIJJLI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C0HD9 LJIL(String str, String str2) {
        return this.LIZ.LJIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJ(C19EG c19eg, Object obj, C1356730lPT c1356730lPT) {
        this.LIZ.LJJ(c19eg, obj, c1356730lPT);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJI(List<? extends Aweme> list, EnumC1359020lTA enumC1359020lTA, InterfaceC1359090lTH interfaceC1359090lTH) {
        this.LIZ.LJJI(list, enumC1359020lTA, interfaceC1359090lTH);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int LJJIFFI() {
        return this.LIZ.LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC1361560lXG LJJII() {
        return this.LIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIII(EnumC1359020lTA enumC1359020lTA, List list, Map map) {
        this.LIZ.LJJIII(enumC1359020lTA, list, map);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIIJ(String str, UpvotePublishExtraData upvotePublishExtraData, UpvotePublishMobParam upvotePublishMobParam, C1359270lTZ c1359270lTZ, Function1<? super Boolean, Unit> function1) {
        this.LIZ.LJJIIJ(str, upvotePublishExtraData, upvotePublishMobParam, c1359270lTZ, function1);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJIIJZLJL(Aweme aweme) {
        return this.LIZ.LJJIIJZLJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJIIZ(String str) {
        return this.LIZ.LJJIIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIIZI(InterfaceC1359090lTH interfaceC1359090lTH, EnumC1359020lTA enumC1359020lTA, List list, Map map, Map map2, Map map3) {
        this.LIZ.LJJIIZI(interfaceC1359090lTH, enumC1359020lTA, list, map, map2, map3);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C1358700lSe> LJJIJ(C19EG c19eg) {
        return this.LIZ.LJJIJ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIJIIJI(Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        this.LIZ.LJJIJIIJI(aweme, str, str2, str3, str4, str5);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC733830SqT LJJIJIIJIL() {
        return this.LIZ.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC1360060lUq LJJIJIL(String str) {
        return this.LIZ.LJJIJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIJL() {
        this.LIZ.LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int LJJIJLIJ(int i, int i2) {
        return this.LIZ.LJJIJLIJ(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIL(C19EG c19eg, Aweme aweme, String str, String str2, String str3, String str4, AwS60S2100000_21 awS60S2100000_21, String str5, String str6) {
        this.LIZ.LJJIL(c19eg, aweme, str, str2, str3, str4, awS60S2100000_21, str5, str6);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJIZ() {
        return this.LIZ.LJJIZ();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJ(Comment comment, CarrierType carrierType, C453740Hqm c453740Hqm, UpvotePublishExtraData upvotePublishExtraData, UpvotePublishMobParam upvotePublishMobParam, Integer num, String str, String str2, String str3, String str4, List list, Function0 function0, Function1 function1, boolean z) {
        this.LIZ.LJJJ(comment, carrierType, c453740Hqm, upvotePublishExtraData, upvotePublishMobParam, num, str, str2, str3, str4, list, function0, function1, z);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJI(String str, String str2) {
        this.LIZ.LJJJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJJIL() {
        return this.LIZ.LJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJJ(C19EG c19eg, Aweme aweme, String str, String str2, boolean z, int i, C1359540lU0 c1359540lU0) {
        this.LIZ.LJJJJ(c19eg, aweme, str, str2, z, i, c1359540lU0);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC1360230lV7 LJJJJI() {
        return this.LIZ.LJJJJI();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJJJIZL() {
        return this.LIZ.LJJJJIZL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJJJ(String str) {
        this.LIZ.LJJJJJ(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJJJJL() {
        return this.LIZ.LJJJJJL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final Long LJJJJL(String str) {
        return this.LIZ.LJJJJL(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C0ZP4 LJJJJLI(C19EG c19eg, AFwS252S0000000_16 aFwS252S0000000_16) {
        return this.LIZ.LJJJJLI(c19eg, aFwS252S0000000_16);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJJLL(int i) {
        this.LIZ.LJJJJLL(i);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJJZ(String str, String str2, String str3) {
        this.LIZ.LJJJJZ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void clearCache() {
        this.LIZ.clearCache();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return this.LIZ.provideXBridgetIDLMethodList();
    }
}
