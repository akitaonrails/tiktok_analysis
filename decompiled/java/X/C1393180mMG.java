package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.mob.FriendsTabMob$mobMuteFirstPopup$1", f = "FriendsTabMob.kt", l = {}, m = "invokeSuspend")
public final class C1393180mMG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1393190mMH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1393180mMG(String str, C1393190mMH c1393190mMH, InterfaceC1364105Vn<? super C1393180mMG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1393190mMH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1393180mMG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsTabMob@f43e.mobMuteFirstPopup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIJI("mute_first_pop_up", new Pair(this.LL, "action_type"), new Pair(this.LLILLJJLI.LIZ, "enter_from"), new Pair(this.LLILLJJLI.LIZIZ, "enter_method"), new Pair(this.LLILLJJLI.LIZJ, "video_type"), new Pair(C2286608xc.LJ(this.LLILLJJLI.LIZLLL), "follow_status"), new Pair(this.LLILLJJLI.LJ, "head_type"), new Pair(this.LLILLJJLI.LJFF, "is_split"), new Pair(this.LLILLJJLI.LJI, "last_step_mute_UI"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTabMob@f43e.mobMuteFirstPopup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
