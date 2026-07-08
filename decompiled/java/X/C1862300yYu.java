package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor;
import defpackage.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862300yYu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ TakoDisclaimerDialogProcessor LLILLJJLI;
    public final /* synthetic */ TakoEnterParams LLILLL;
    public final /* synthetic */ C1862660yZU LLILZ;
    public final /* synthetic */ IMessageAbility LLILZIL;
    public final /* synthetic */ C14FD LLILZLL;
    public final /* synthetic */ u2 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1862300yYu(boolean z, TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd, C1863850ybP c1863850ybP, u2 u2Var) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = takoDisclaimerDialogProcessor;
        this.LLILLL = takoEnterParams;
        this.LLILZ = c1862660yZU;
        this.LLILZIL = iMessageAbility;
        this.LLILZLL = c14fd;
        this.LLIZ = u2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            this.LLILLJJLI.LIZLLL(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        } else {
            this.LLILZIL.Nh1(this.LLIZ.LJII == 2);
            C1860520yW2.LJJI(C1860520yW2.LIZ, true);
            C1860520yW2.LJJIFFI(false);
            this.LLILZ.LIZ = false;
            this.LLILZLL.LIZ(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
