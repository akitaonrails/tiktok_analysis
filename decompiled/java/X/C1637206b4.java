package X;

import Y.AObserverS206S0100000_2;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.music.ui.artistprofile.ArtistProfileTuxSheetViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.artistprofile.ArtistProfileTuxSheetViewModel$onPrepared$1", f = "ArtistProfileTuxSheetViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1637206b4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ArtistProfileTuxSheetViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637206b4(ArtistProfileTuxSheetViewModel artistProfileTuxSheetViewModel, InterfaceC1364105Vn<? super C1637206b4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = artistProfileTuxSheetViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1637206b4(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArtistProfileTuxSheetViewModel@bcf9.onPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
        ArtistProfileTuxSheetViewModel artistProfileTuxSheetViewModel = this.LL;
        relationObservable.observe(artistProfileTuxSheetViewModel, new AObserverS206S0100000_2(artistProfileTuxSheetViewModel, 5));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ArtistProfileTuxSheetViewModel@bcf9.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
