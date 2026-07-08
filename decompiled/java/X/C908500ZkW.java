package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataFetchAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataFetchAssem$initDataForLightInteraction$1", f = "SocialActionBarDataFetchAssem.kt", l = {230}, m = "invokeSuspend")
public final class C908500ZkW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialActionBarDataFetchAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C908500ZkW(SocialActionBarDataFetchAssem socialActionBarDataFetchAssem, InterfaceC1364105Vn<? super C908500ZkW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialActionBarDataFetchAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C908500ZkW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialActionBarDataFetchAssem@3806.initDataForLightInteraction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = ((MessageListViewModel) this.LLILLJJLI.lo()).LLIZ;
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 75);
            this.LL = 1;
            if (anonymousClass0951.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("SocialActionBarDataFetchAssem@3806.initDataForLightInteraction$1");
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
