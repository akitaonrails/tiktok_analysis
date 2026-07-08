package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS215S0300000_6;
import njp.a;

/* JADX INFO: renamed from: X.0I9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel$getCoverOfPublishModel$1$1", f = "FriendsV3PublishStatusViewModel.kt", l = {}, m = "invokeSuspend")
public final class C462020I9w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FriendsV3PublishStatusViewModel LL;
    public final /* synthetic */ PublishModel LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462020I9w(FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel, PublishModel publishModel, Bitmap bitmap, InterfaceC1364105Vn<? super C462020I9w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = friendsV3PublishStatusViewModel;
        this.LLILLJJLI = publishModel;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C462020I9w(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3PublishStatusViewModel@24b2.getCoverOfPublishModel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel = this.LL;
        PublishModel publishModel = this.LLILLJJLI;
        Bitmap bitmap = this.LLILLL;
        friendsV3PublishStatusViewModel.getClass();
        friendsV3PublishStatusViewModel.withState(new AwS215S0300000_6(bitmap, friendsV3PublishStatusViewModel, publishModel, 18));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3PublishStatusViewModel@24b2.getCoverOfPublishModel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
