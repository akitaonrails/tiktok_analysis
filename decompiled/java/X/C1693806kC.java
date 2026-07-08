package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS110S0101000_2;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06kC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel$updateAutoReplySetting$2", f = "BotDetailViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1693806kC extends C09AX implements Function2<InterfaceC1256904vv, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ BotDetailViewModel LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1693806kC(Boolean bool, BotDetailViewModel botDetailViewModel, Activity activity, InterfaceC1364105Vn<? super C1693806kC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bool;
        this.LLILLL = botDetailViewModel;
        this.LLILZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1693806kC c1693806kC = new C1693806kC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1693806kC.LL = obj;
        return c1693806kC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("BotDetailViewModel@6175.updateAutoReplySetting$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1256904vv interfaceC1256904vv = (InterfaceC1256904vv) this.LL;
        if (interfaceC1256904vv instanceof C1257004vw) {
            if (this.LLILLJJLI.booleanValue()) {
                i = 2131848501;
            } else {
                i = 2131848500;
            }
            this.LLILLL.runOnUIThread(new AwS110S0101000_2(this.LLILZ, i, 5));
            this.LLILLL.setState(new AwS581S0100000_2(this.LLILLJJLI, 393));
        } else {
            BotDetailViewModel botDetailViewModel = this.LLILLL;
            botDetailViewModel.runOnUIThread(new AwS211S0300000_2(this.LLILZ, interfaceC1256904vv, botDetailViewModel, 13));
            this.LLILLL.setState(new AwS581S0100000_2(this.LLILLJJLI, 394));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BotDetailViewModel@6175.updateAutoReplySetting$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1256904vv interfaceC1256904vv, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1256904vv, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
