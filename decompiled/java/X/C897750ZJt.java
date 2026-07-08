package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.avatarloader.impl.core.DMAvatarResManager$onAvatarIsNull$1", f = "DMAvatarResManager.kt", l = {}, m = "invokeSuspend")
public final class C897750ZJt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C897710ZJp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897750ZJt(C897710ZJp c897710ZJp, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c897710ZJp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C897750ZJt(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMUser iMUserLJ;
        UrlModel avatarThumb;
        C1C7U.LIZ("DMAvatarResManager@fa0.onAvatarIsNull$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        if (contactFeatureLIZ != null && (iMUserLJ = contactFeatureLIZ.LJ(this.LL, "im_local_db")) != null && (avatarThumb = iMUserLJ.getAvatarThumb()) != null && C897770ZJv.LIZLLL(avatarThumb, false)) {
            this.LLILLJJLI.LJ(avatarThumb, this.LL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DMAvatarResManager@fa0.onAvatarIsNull$1");
            return unit;
        }
        this.LLILLJJLI.LJFF(2, this.LL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DMAvatarResManager@fa0.onAvatarIsNull$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
