package X;

import Y.AgS295S0100000_14;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.ChatLongPressVM;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2$observeUIState$3", f = "UnreadIndicatorAssemV2.kt", l = {161}, m = "invokeSuspend")
public final class C910540Zno extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UnreadIndicatorAssemV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910540Zno(UnreadIndicatorAssemV2 unreadIndicatorAssemV2, InterfaceC1364105Vn<? super C910540Zno> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = unreadIndicatorAssemV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910540Zno(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnreadIndicatorAssemV2@be68.observeUIState$3");
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
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJJJLIIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UnreadIndicatorAssemV2.LLJL;
            C914080ZtW c914080ZtW = new C914080ZtW(((ChatLongPressVM) assemVMLazy.getValue()).LLILLJJLI, 3);
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 50);
            this.LL = 1;
            if (c914080ZtW.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("UnreadIndicatorAssemV2@be68.observeUIState$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnreadIndicatorAssemV2@be68.observeUIState$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
