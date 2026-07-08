package X;

import android.view.View;
import com.ss.android.ugc.profile.business.ur.following.ui.FollowingRelationFragment;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0j1T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.FollowingRelationFragment$displayWeakGuidance$2", f = "FollowingRelationFragment.kt", l = {}, m = "invokeSuspend")
public final class C1264970j1T extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowingRelationFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1264970j1T(FollowingRelationFragment followingRelationFragment, InterfaceC1364105Vn<? super C1264970j1T> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = followingRelationFragment;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1264970j1T(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingRelationFragment@e25d.displayWeakGuidance$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = C2187451AjH.LIZ;
        this.LL.getClass();
        FollowingRelationFragment.iS("close");
        C786410Ut5.LL(8, this.LL.hS());
        C1264420j0a.LIZ.getClass();
        C1264420j0a.LIZJ();
        C1264420j0a.LIZIZ();
        this.LL.cS().bH1(EnumC1265000j1W.FOLLOWING);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingRelationFragment@e25d.displayWeakGuidance$2");
        return unit;
    }
}
