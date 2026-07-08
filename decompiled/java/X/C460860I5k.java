package X;

import Y.AgS287S0100000_6;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$awemeStatusConfig$1$1", f = "CommonMessageListConfig.kt", l = {527}, m = "invokeSuspend")
public final class C460860I5k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AssemVMLazy<InterfaceC0148002o, IAwemeStatusViewModel> LLILLJJLI;
    public final /* synthetic */ C01GW<ChatroomEventAbility> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C460860I5k(AssemVMLazy<InterfaceC0148002o, IAwemeStatusViewModel> assemVMLazy, C01GW<? extends ChatroomEventAbility> c01gw, InterfaceC1364105Vn<? super C460860I5k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = c01gw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C460860I5k(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonMessageListConfigKt@2fb4.awemeStatusConfig$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy<InterfaceC0148002o, IAwemeStatusViewModel> assemVMLazy = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C460870I5l.LL;
            AnonymousClass0950 anonymousClass0950WQ2 = ((IAwemeStatusViewModel) assemVMLazy.getValue()).wQ2();
            if (anonymousClass0950WQ2 != null) {
                AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 51);
                this.LL = 1;
                if (anonymousClass0950WQ2.collect(agS287S0100000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.awemeStatusConfig$1$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.awemeStatusConfig$1$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
