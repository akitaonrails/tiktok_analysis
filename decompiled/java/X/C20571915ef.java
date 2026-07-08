package X;

import android.view.View;
import com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent$doAdaption$1", f = "LiveSfvPostContentComponent.kt", l = {}, m = "invokeSuspend")
public final class C20571915ef extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveSfvPostContentComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20571915ef(LiveSfvPostContentComponent liveSfvPostContentComponent, InterfaceC1364105Vn<? super C20571915ef> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveSfvPostContentComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20571915ef(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSfvPostContentComponent@a825.doAdaption$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LL.LLLFF.getValue();
        if (iScreenComponentAbility != null) {
            LiveSfvPostContentComponent liveSfvPostContentComponent = this.LL;
            C1056680dbW c1056680dbW = C1056680dbW.LIZ;
            View view = (View) liveSfvPostContentComponent.LLJL.getValue();
            C421460Gfo c421460GfoOp = liveSfvPostContentComponent.op();
            C421460Gfo c421460GfoMp = liveSfvPostContentComponent.mp();
            View view2 = (View) liveSfvPostContentComponent.LLJJLIIIJLLLLLLLZ.getValue();
            View view3 = (View) liveSfvPostContentComponent.LLJLL.getValue();
            C197039127h c197039127hHp = liveSfvPostContentComponent.hp();
            c1056680dbW.getClass();
            C1056680dbW.LIZ(iScreenComponentAbility, view, c421460GfoOp, c421460GfoMp, view2, view3, c197039127hHp);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSfvPostContentComponent@a825.doAdaption$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
