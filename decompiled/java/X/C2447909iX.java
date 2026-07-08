package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingSuggestComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09iX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingSuggestComponent$checkAuthor$1", f = "FollowingSuggestComponent.kt", l = {}, m = "invokeSuspend")
public final class C2447909iX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowingSuggestComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2447909iX(FollowingSuggestComponent followingSuggestComponent, InterfaceC1364105Vn<? super C2447909iX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = followingSuggestComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2447909iX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme awemeLJIIIIZZ;
        C1C7U.LIZ("FollowingSuggestComponent@e8ba.checkAuthor$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LL.getValue();
        if (iFeedPanelPlatformAbility != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null) {
            String authorUid = AwemeExtKt.getAuthorUid(awemeLJIIIIZZ);
            String secAuthorUid = AwemeExtKt.getSecAuthorUid(awemeLJIIIIZZ);
            C804900Vho.LIZ.getClass();
            boolean zLJ = C804900Vho.LJ(authorUid, secAuthorUid);
            this.LL.bo().LLILLJJLI = Boolean.valueOf(zLJ);
            if (zLJ) {
                C2446309iH c2446309iHXQ2 = this.LL.bo().xQ2();
                c2446309iHXQ2.LIZ().getClass();
                if (C1ECA.LIZLLL() > 0) {
                    c2446309iHXQ2.LLIZ.removeMessages(100);
                    C786410Ut5.LJLJJI(100, 1000L, c2446309iHXQ2.LLIZ);
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FollowingSuggestComponent@e8ba.checkAuthor$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FollowingSuggestComponent@e8ba.checkAuthor$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
