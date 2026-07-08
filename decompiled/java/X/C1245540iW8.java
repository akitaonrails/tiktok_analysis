package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment;
import com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iW8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment$initObservers$2$1$1$1", f = "ShareVideoPanelFragment.kt", l = {178, 180}, m = "invokeSuspend")
public final class C1245540iW8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C197039127h LLILLL;
    public final /* synthetic */ ShareVideoPanelFragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245540iW8(Aweme aweme, C197039127h c197039127h, ShareVideoPanelFragment shareVideoPanelFragment, InterfaceC1364105Vn<? super C1245540iW8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = c197039127h;
        this.LLILZ = shareVideoPanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1245540iW8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareVideoPanelFragment@457.initObservers$2$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ShareVideoPanelFragment@457.initObservers$2$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IIMBulletinBoardService.LIZ.getClass();
            IIMBulletinBoardService iIMBulletinBoardServiceLIZ = C1245570iWB.LIZ();
            String aid = this.LLILLJJLI.getAid();
            this.LL = 1;
            obj = iIMBulletinBoardServiceLIZ.LLZZJLIL(aid, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShareVideoPanelFragment@457.initObservers$2$1$1$1");
                return objLJFF;
            }
        }
        this.LLILLL.setLoading(false);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1245550iW9 c1245550iW9 = new C1245550iW9((Integer) obj, this.LLILZ, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1245550iW9) == objLJFF) {
            C1C7U.LIZIZ("ShareVideoPanelFragment@457.initObservers$2$1$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShareVideoPanelFragment@457.initObservers$2$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
