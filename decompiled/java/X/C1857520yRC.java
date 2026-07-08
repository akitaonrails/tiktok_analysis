package X;

import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.otherpage.share.api.ShareMessageResponse;
import kotlin.Unit;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM$shareMessage$2$1", f = "TakoMultipleSelectVM.kt", l = {}, m = "invokeSuspend")
public final class C1857520yRC extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super ShareMessageResponse>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoMultipleSelectVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857520yRC(TakoMultipleSelectVM takoMultipleSelectVM, InterfaceC1364105Vn<? super C1857520yRC> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = takoMultipleSelectVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoMultipleSelectVM@4cd6.shareMessage$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setState(new AwS606S0100000_27((Throwable) this.LL, 587));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoMultipleSelectVM@4cd6.shareMessage$2$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super ShareMessageResponse> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1857520yRC c1857520yRC = new C1857520yRC(this.LLILLJJLI, interfaceC1364105Vn);
        c1857520yRC.LL = th;
        return c1857520yRC.invokeSuspend(Unit.LIZ);
    }
}
