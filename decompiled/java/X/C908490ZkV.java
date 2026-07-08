package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoTaskStatusComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataFetchAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataFetchAssem$subscribeToAvatarDuoState$2", f = "SocialActionBarDataFetchAssem.kt", l = {286}, m = "invokeSuspend")
public final class C908490ZkV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC456940Hvw LLILLJJLI;
    public final /* synthetic */ SocialActionBarDataFetchAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C908490ZkV(InterfaceC456940Hvw interfaceC456940Hvw, SocialActionBarDataFetchAssem socialActionBarDataFetchAssem, InterfaceC1364105Vn<? super C908490ZkV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC456940Hvw;
        this.LLILLL = socialActionBarDataFetchAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C908490ZkV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialActionBarDataFetchAssem@3806.subscribeToAvatarDuoState$2");
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
            C05YD<AvatarDuoTaskStatusComponent> c05ydLJIIJ = this.LLILLJJLI.LJIIJ(this.LLILLL.mo().getConversationId());
            if (c05ydLJIIJ != null) {
                C1629806Zs c1629806Zs = new C1629806Zs(c05ydLJIIJ);
                AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLL, 78);
                this.LL = 1;
                if (c1629806Zs.collect(agS295S0100000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("SocialActionBarDataFetchAssem@3806.subscribeToAvatarDuoState$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialActionBarDataFetchAssem@3806.subscribeToAvatarDuoState$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
