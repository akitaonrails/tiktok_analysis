package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment;
import com.ss.android.ugc.aweme.im.service.service.IIMBulletinBoardService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0iW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment$initObservers$2$1$1$1$1", f = "ShareVideoPanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C1245550iW9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ ShareVideoPanelFragment LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245550iW9(Integer num, ShareVideoPanelFragment shareVideoPanelFragment, Aweme aweme, InterfaceC1364105Vn<? super C1245550iW9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = num;
        this.LLILLJJLI = shareVideoPanelFragment;
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1245550iW9(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareVideoPanelFragment@457.initObservers$2$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num = this.LL;
        if (num != null && num.intValue() == 1) {
            Context context = this.LLILLJJLI.getContext();
            if (context != null) {
                Aweme aweme = this.LLILLL;
                ShareVideoPanelFragment shareVideoPanelFragment = this.LLILLJJLI;
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJIIIZ = new C340190DVh(context, R.raw.icon_exclamation_mark_circle, C2286608xc.LJ(R.attr.a1i), 8);
                c1397580mTM.LJFF(2131828001);
                c1397580mTM.LIZ(2131828000);
                C985403tE.LIZ(c1397580mTM, new AwS385S0200000_19(aweme, shareVideoPanelFragment, 82));
                c1397580mTM.LIZLLL(new AwS598S0100000_19(shareVideoPanelFragment, 524));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        } else {
            IIMBulletinBoardService.LIZ.getClass();
            C1245570iWB.LIZ().d0(this.LLILLL, C2097908Jt.LIZJ(new Pair("unique_key", this.LLILLJJLI.LLJJ)));
            this.LLILLJJLI.SR().LL.setValue(Boolean.TRUE);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareVideoPanelFragment@457.initObservers$2$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
