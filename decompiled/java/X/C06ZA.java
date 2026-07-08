package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.adcardcomponent.AnoleAdCardView$configView$1", f = "AnoleAdCardView.kt", l = {}, m = "invokeSuspend")
public final class C06ZA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C1007570cKJ LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZA(Aweme aweme, C1007570cKJ c1007570cKJ, String str, InterfaceC1364105Vn<? super C06ZA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = c1007570cKJ;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ZA(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User author;
        UrlModel avatarThumb;
        C1C7U.LIZ("AnoleAdCardView@15ab.configView$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme aweme = this.LL;
        if (aweme != null && (author = aweme.getAuthor()) != null && (avatarThumb = author.getAvatarThumb()) != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(20)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(20)));
            c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
            c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI.getAdvertiserHeaderIvFromXml());
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LJIIIIZZ.LIZLLL(this.LLILLL);
            c1331670kl3LJIIIIZZ.LJJIJL(this.LLILLJJLI.getContext());
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AnoleAdCardView@15ab.configView$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AnoleAdCardView@15ab.configView$1");
        return unit2;
    }
}
