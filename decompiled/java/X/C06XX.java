package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.model.ProfileIdentifierAvatar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06XX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildHeader$1$1$1$1$invokeSuspend$$inlined$parseBizData$2", f = "ProfileIdentifierFragment.kt", l = {}, m = "invokeSuspend")
public final class C06XX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileIdentifierFragment LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ C427660Gpo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06XX(ProfileIdentifierFragment profileIdentifierFragment, Object obj, InterfaceC1364105Vn interfaceC1364105Vn, View view, C427660Gpo c427660Gpo) {
        super(2, interfaceC1364105Vn);
        this.LL = profileIdentifierFragment;
        this.LLILLJJLI = obj;
        this.LLILLL = view;
        this.LLILZ = c427660Gpo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06XX(this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildHeader$1$1$1$1$invokeSuspend$$inlined$parseBizData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isAdded() && this.LL.getView() != null) {
            UrlModel avatarModel = ((ProfileIdentifierAvatar) this.LLILLJJLI).getAvatarModel();
            if (avatarModel != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarModel));
                c1331670kl3LJIIIIZZ.LJJIIZI(C1308910kAL.LJ(R.attr.a02, this.LLILLL.getContext()));
                c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
                c1331670kl3LJIIIIZZ.LJJ(this.LLILZ);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        } else {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileIdentifierPage", "Fragment not attached, skip onResult");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildHeader$1$1$1$1$invokeSuspend$$inlined$parseBizData$2");
        return unit;
    }
}
