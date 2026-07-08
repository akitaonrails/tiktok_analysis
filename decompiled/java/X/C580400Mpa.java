package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.HandleShareProcessModel$showGreenScreenEffectFailDialog$1", f = "HandleShareProcessModel.kt", l = {}, m = "invokeSuspend")
public final class C580400Mpa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1402840mbq LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C580380MpY LLILLL;
    public final /* synthetic */ ShareKitPanel LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C580400Mpa(C1402840mbq c1402840mbq, Activity activity, C580380MpY c580380MpY, ShareKitPanel shareKitPanel, Function0<Unit> function0, InterfaceC1364105Vn<? super C580400Mpa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1402840mbq;
        this.LLILLJJLI = activity;
        this.LLILLL = c580380MpY;
        this.LLILZ = shareKitPanel;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C580400Mpa(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HandleShareProcessModel@e131.showGreenScreenEffectFailDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZJ = C580640Mpy.LIZJ(this.LL);
        Activity topActivity = ActivityStack.getTopActivity();
        C1397580mTM c1397580mTM = new C1397580mTM(topActivity);
        c1397580mTM.LJI(this.LLILLJJLI.getString(2131835180));
        c1397580mTM.LIZIZ(this.LLILLJJLI.getString(2131835177));
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new C580410Mpb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, strLIZJ, this.LL, topActivity));
        new C1397510mTF(c1397580mTM).LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HandleShareProcessModel@e131.showGreenScreenEffectFailDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
