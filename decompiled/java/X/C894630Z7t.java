package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.DmRiskyKeywordsSettingViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.RiskyKeywordsSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.RiskyKeywordsSettingFragment$onStart$2", f = "RiskyKeywordsSettingFragment.kt", l = {173}, m = "invokeSuspend")
public final class C894630Z7t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RiskyKeywordsSettingFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C894630Z7t(RiskyKeywordsSettingFragment riskyKeywordsSettingFragment, InterfaceC1364105Vn<? super C894630Z7t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = riskyKeywordsSettingFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C894630Z7t(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RiskyKeywordsSettingFragment@1f08.onStart$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            RiskyKeywordsSettingFragment riskyKeywordsSettingFragment = this.LLILLJJLI;
            DmRiskyKeywordsSettingViewModel dmRiskyKeywordsSettingViewModel = riskyKeywordsSettingFragment.LLIZ;
            if (dmRiskyKeywordsSettingViewModel == null) {
                dmRiskyKeywordsSettingViewModel = null;
            }
            C2252321DDq c2252321DDq = dmRiskyKeywordsSettingViewModel.LLJI;
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(riskyKeywordsSettingFragment, 7);
            this.LL = 1;
            if (c2252321DDq.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("RiskyKeywordsSettingFragment@1f08.onStart$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
