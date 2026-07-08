package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01OS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.mob.FriendsTabMob$mobShootEntryByLongClick$1", f = "FriendsTabMob.kt", l = {}, m = "invokeSuspend")
public final class C01OS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01OS(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C01OS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01OS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsTabMob@f43e.mobShootEntryByLongClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIJI("long_press_personal_skylight_avatar", new Pair(this.LL, "enter_from"), new Pair(this.LLILLJJLI, "enter_method"), new Pair(this.LLILLL, "action_type"), new Pair(this.LLILZ, "add_story_UI_type"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTabMob@f43e.mobShootEntryByLongClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
