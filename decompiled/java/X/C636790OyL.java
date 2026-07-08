package X;

import android.view.ViewGroup;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.inbox.ab.BulletinBoardEasterEggSetting;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEasterEggAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEasterEggAssem$tryShowEasterEgg$1$1$1$1", f = "BulletinEasterEggAssem.kt", l = {}, m = "invokeSuspend")
public final class C636790OyL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinEasterEggAssem LL;
    public final /* synthetic */ BulletinBoardEasterEggSetting.BulletinBoardEasterEggInfo LLILLJJLI;
    public final /* synthetic */ C636810OyN LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636790OyL(BulletinEasterEggAssem bulletinEasterEggAssem, BulletinBoardEasterEggSetting.BulletinBoardEasterEggInfo bulletinBoardEasterEggInfo, C636810OyN c636810OyN, InterfaceC1364105Vn<? super C636790OyL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinEasterEggAssem;
        this.LLILLJJLI = bulletinBoardEasterEggInfo;
        this.LLILLL = c636810OyN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C636790OyL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEasterEggAssem@494c.tryShowEasterEgg$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BulletinEasterEggAssem bulletinEasterEggAssem = this.LL;
        bulletinEasterEggAssem.LLJILLL = this.LLILLJJLI.campaignId;
        bulletinEasterEggAssem.release();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEasterEggAssem");
        sbLIZ.append(this.LLILLJJLI);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C0OPQ c0opq = C0OPQ.LIZ;
        String str = this.LLILLJJLI.campaignId;
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board");
        c2344009Gk.LJIIIIZZ("activity_page", "animation");
        c2344009Gk.LJIIIIZZ("activity_id", str);
        C20684815ws.LJIILLIIL("music_easter_egg_pre_show", c2344009Gk.LIZ);
        C679540Ql6 c679540Ql6 = new C679540Ql6(null, TemplateData.LJIIIIZZ(this.LLILLJJLI.easterEggInfo), true, null, null, null, null, null, this.LLILLJJLI.jumpUrl, new AwS588S0100000_9(this.LL, 112), 27637);
        BulletinEasterEggAssem bulletinEasterEggAssem2 = this.LL;
        C1537720q7O c1537720q7OYs1 = null;
        BulletinHybridAbility bulletinHybridAbility = (BulletinHybridAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), BulletinHybridAbility.class, null);
        if (bulletinHybridAbility != null) {
            c1537720q7OYs1 = bulletinHybridAbility.ys1(c679540Ql6, null);
        }
        bulletinEasterEggAssem2.LLJIJIL = c1537720q7OYs1;
        this.LLILLL.addView(this.LL.LLJIJIL, new ViewGroup.LayoutParams(-1, -1));
        this.LL.LLJJ = true;
        C0OPX.LJIIIZ("BulletinEasterEggAssemonReadyToShow");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEasterEggAssem@494c.tryShowEasterEgg$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
