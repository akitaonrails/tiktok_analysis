package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListViewModel$loadVideos$1$result$1", f = "ProfileBgVideoListViewModel.kt", l = {48}, m = "invokeSuspend")
public final class C455770Hu3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super FeedItemList>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ProfileBgVideoListViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455770Hu3(String str, String str2, ProfileBgVideoListViewModel profileBgVideoListViewModel, InterfaceC1364105Vn<? super C455770Hu3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = profileBgVideoListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455770Hu3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileBgVideoListViewModel@a3c4.loadVideos$1$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1256030in3 c1256030in3 = C1256030in3.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            long j = this.LLILZ.LLIZ;
            this.LL = 1;
            obj = c1256030in3.LIZJ(str, j, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfileBgVideoListViewModel@a3c4.loadVideos$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ProfileBgVideoListViewModel@a3c4.loadVideos$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super FeedItemList> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
