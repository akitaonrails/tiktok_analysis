package X;

import android.view.View;
import com.ss.android.ugc.profile.business.ur.following.ui.FollowerRelationFragment;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0j1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.FollowerRelationFragment$initFollowingAndFollowerGuideTopBanner$2", f = "FollowerRelationFragment.kt", l = {}, m = "invokeSuspend")
public final class C1264990j1V extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowerRelationFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1264990j1V(FollowerRelationFragment followerRelationFragment, InterfaceC1364105Vn<? super C1264990j1V> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = followerRelationFragment;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1264990j1V(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowerRelationFragment@8dd.initFollowingAndFollowerGuideTopBanner$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        FollowerRelationFragment.gS(1, "close");
        C786410Ut5.LL(8, this.LL.dS());
        C1264420j0a.LIZ.getClass();
        C1264420j0a.LIZJ();
        C1264420j0a.LIZIZ();
        this.LL.aS().bH1(EnumC1265000j1W.FOLLOWER);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowerRelationFragment@8dd.initFollowingAndFollowerGuideTopBanner$2");
        return unit;
    }
}
