package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.preregister.GamePreRegisterCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880370z23 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ GamePreRegisterCard LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880370z23(C013C c013c, GamePreRegisterCard gamePreRegisterCard, Fragment fragment) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = gamePreRegisterCard;
        this.LLILLL = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        C197039127h c197039127hLJIIIZ;
        bool.booleanValue();
        C1880770z2h c1880770z2h = new C1880770z2h(this.LLILLL, this.LLILLJJLI);
        if (this.LL.element) {
            this.LLILLJJLI.LLJJJ = c1880770z2h;
        } else {
            this.LLILLJJLI.LLJJJ = null;
            c1880770z2h.invoke();
        }
        InterfaceC1880290z1v interfaceC1880290z1v = (InterfaceC1880290z1v) this.LLILLJJLI.LLILLL.LJIILJJIL().LIZ(InterfaceC1880290z1v.class);
        if (interfaceC1880290z1v != null && (c197039127hLJIIIZ = interfaceC1880290z1v.LJIIIZ()) != null) {
            c197039127hLJIIIZ.setLoading(false);
        }
        C197039127h c197039127h = this.LLILLJJLI.LLJJIJI;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        return Unit.LIZ;
    }
}
