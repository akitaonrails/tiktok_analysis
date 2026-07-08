package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS110S0101000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06kD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel$updateSuggestedReplySetting$2", f = "BotDetailViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1693906kD extends C09AX implements Function2<InterfaceC1256904vv, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ BotDetailViewModel LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1693906kD(Boolean bool, BotDetailViewModel botDetailViewModel, Activity activity, InterfaceC1364105Vn<? super C1693906kD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bool;
        this.LLILLL = botDetailViewModel;
        this.LLILZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1693906kD c1693906kD = new C1693906kD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1693906kD.LL = obj;
        return c1693906kD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("BotDetailViewModel@6175.updateSuggestedReplySetting$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL instanceof C1257004vw) {
            if (this.LLILLJJLI.booleanValue()) {
                i = 2131848514;
            } else {
                i = 2131848513;
            }
            this.LLILLL.runOnUIThread(new AwS110S0101000_2(this.LLILZ, i, 6));
            this.LLILLL.setState(new AwS581S0100000_2(this.LLILLJJLI, 396));
        } else {
            this.LLILLL.runOnUIThread(new AwS581S0100000_2(this.LLILZ, 397));
            this.LLILLL.setState(new AwS581S0100000_2(this.LLILLJJLI, 398));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BotDetailViewModel@6175.updateSuggestedReplySetting$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1256904vv interfaceC1256904vv, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1256904vv, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
