package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.desc.ui.SearchMediaUserDescAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.desc.ui.SearchMediaUserDescAssem$bindAuthorAvatar$1", f = "SearchMediaUserDescAssem.kt", l = {}, m = "invokeSuspend")
public final class C434460H1w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC657240PqE LL;
    public final /* synthetic */ SearchMediaUserDescAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434460H1w(InterfaceC657240PqE interfaceC657240PqE, SearchMediaUserDescAssem searchMediaUserDescAssem, InterfaceC1364105Vn<? super C434460H1w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC657240PqE;
        this.LLILLJJLI = searchMediaUserDescAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434460H1w(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UrlModel avatarThumb;
        C1C7U.LIZ("SearchMediaUserDescAssem@6e36.bindAuthorAvatar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        User author = this.LL.getAweme().getAuthor();
        if (author != null) {
            avatarThumb = author.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
        c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
        c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI.LLJL);
        c1331670kl3LJIIIIZZ.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMediaUserDescAssem@6e36.bindAuthorAvatar$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
