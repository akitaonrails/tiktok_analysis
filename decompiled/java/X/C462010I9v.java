package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel$getCoverOfPublishModel$1", f = "FriendsV3PublishStatusViewModel.kt", l = {354}, m = "invokeSuspend")
public final class C462010I9v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FriendsV3PublishStatusViewModel LLILLJJLI;
    public final /* synthetic */ PublishModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462010I9v(FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel, PublishModel publishModel, InterfaceC1364105Vn<? super C462010I9v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = friendsV3PublishStatusViewModel;
        this.LLILLL = publishModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C462010I9v(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap cover;
        C1C7U.LIZ("FriendsV3PublishStatusViewModel@24b2.getCoverOfPublishModel$1");
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
            IAVPublishService iAVPublishService = (IAVPublishService) this.LLILLJJLI.LLILLJJLI.getValue();
            if (iAVPublishService != null && (cover = iAVPublishService.getCover(this.LLILLL)) != null && !cover.isRecycled()) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C462020I9w c462020I9w = new C462020I9w(this.LLILLJJLI, this.LLILLL, cover, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c462020I9w) == objLJFF) {
                    C1C7U.LIZIZ("FriendsV3PublishStatusViewModel@24b2.getCoverOfPublishModel$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3PublishStatusViewModel@24b2.getCoverOfPublishModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
