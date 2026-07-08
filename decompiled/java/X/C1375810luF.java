package X;

import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS456S0200000_21;
import njp.a;

/* JADX INFO: renamed from: X.0luF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.GuideSharePopWindow$setChannels$1$onChannelClicked$1", f = "GuideSharePopWindow.kt", l = {128}, m = "invokeSuspend")
public final class C1375810luF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1375790luD LLILLL;
    public final /* synthetic */ InterfaceC1369790lkX LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375810luF(C1375790luD c1375790luD, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super C1375810luF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1375790luD;
        this.LLILZ = interfaceC1369790lkX;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1375810luF c1375810luF = new C1375810luF(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1375810luF.LLILLJJLI = obj;
        return c1375810luF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GuideSharePopWindow@f932.setChannels$1$onChannelClicked$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C1375820luG(this.LLILLL, this.LLILZ, null), 3);
            this.LL = 1;
            if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("GuideSharePopWindow@f932.setChannels$1$onChannelClicked$1");
                return objLJFF;
            }
        }
        C1375790luD c1375790luD = this.LLILLL;
        BaseSharePackage baseSharePackage = c1375790luD.LLILLJJLI.LJIJJ;
        InterfaceC1369790lkX interfaceC1369790lkX = this.LLILZ;
        if (!baseSharePackage.LJII(interfaceC1369790lkX, c1375790luD.LL, this.LLILZIL, null, new AwS387S0200000_21(c1375790luD, interfaceC1369790lkX, 2))) {
            if (C1366550lfJ.LIZ(this.LLILZ.key())) {
                C0FNV.LIZJ(this.LLILLL.LLJI);
            }
            C1375790luD c1375790luD2 = this.LLILLL;
            BaseSharePackage baseSharePackage2 = c1375790luD2.LLILLJJLI.LJIJJ;
            InterfaceC1369790lkX interfaceC1369790lkX2 = this.LLILZ;
            baseSharePackage2.LJIJ(interfaceC1369790lkX2, new AwS456S0200000_21(c1375790luD2, interfaceC1369790lkX2, 1));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GuideSharePopWindow@f932.setChannels$1$onChannelClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
