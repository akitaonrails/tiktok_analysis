package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS614S0100000_35;
import njp.a;

/* JADX INFO: renamed from: X.0Crs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$onPrepared$1", f = "VideoEventDispatchViewModel.kt", l = {}, m = "invokeSuspend")
public final class C327020Crs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoEventDispatchViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327020Crs(VideoEventDispatchViewModel videoEventDispatchViewModel, InterfaceC1364105Vn<? super C327020Crs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoEventDispatchViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327020Crs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoEventDispatchViewModel@a3d.onPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
        final VideoEventDispatchViewModel videoEventDispatchViewModel = this.LL;
        relationObservable.observe(videoEventDispatchViewModel, new Observer() { // from class: X.0Crt
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                VideoEventDispatchViewModel videoEventDispatchViewModel2 = videoEventDispatchViewModel;
                videoEventDispatchViewModel2.getClass();
                videoEventDispatchViewModel2.setState(new AwS614S0100000_35((FollowStatus) obj2, 202));
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoEventDispatchViewModel@a3d.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
