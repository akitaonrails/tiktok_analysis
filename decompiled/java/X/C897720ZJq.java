package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.avatarloader.impl.core.DMAvatarResManager$checkOuterAvatar$1", f = "DMAvatarResManager.kt", l = {}, m = "invokeSuspend")
public final class C897720ZJq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ UrlModel LLILLJJLI;
    public final /* synthetic */ C897710ZJp LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897720ZJq(String str, UrlModel urlModel, C897710ZJp c897710ZJp, InterfaceC1364105Vn<? super C897720ZJq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = urlModel;
        this.LLILLL = c897710ZJp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C897720ZJq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UrlModel avatarThumb;
        IMUser iMUserLJ;
        C1C7U.LIZ("DMAvatarResManager@fa0.checkOuterAvatar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        if (contactFeatureLIZ == null || (iMUserLJ = contactFeatureLIZ.LJ(this.LL, "im_local_db")) == null || (avatarThumb = iMUserLJ.getAvatarThumb()) == null || !C897770ZJv.LIZLLL(avatarThumb, false)) {
            avatarThumb = null;
        }
        if (C897780ZJw.LIZ(this.LLILLJJLI, avatarThumb)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkOuterAvatar: outer avatar is same as db avatar, uid=");
            sbLIZ.append(this.LL);
            sbLIZ.append(", uri=");
            sbLIZ.append(C897780ZJw.LIZIZ(this.LLILLJJLI, true));
            C2188811AlT.LIZIZ(sbLIZ);
            C897770ZJv.LIZIZ();
            this.LLILLL.LIZIZ.remove(this.LL);
        } else if (avatarThumb != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkOuterAvatar: outer avatar is not same as db avatar, uid=");
            sbLIZ2.append(this.LL);
            sbLIZ2.append(", uri=");
            sbLIZ2.append(C897780ZJw.LIZIZ(this.LLILLJJLI, true));
            C2188811AlT.LIZIZ(sbLIZ2);
            C897770ZJv.LIZIZ();
            this.LLILLL.LIZIZ.remove(this.LL);
            this.LLILLL.LIZLLL(true, this.LL, avatarThumb);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("checkOuterAvatar: db avatar is null, refresh, uid=");
            sbLIZ3.append(this.LL);
            sbLIZ3.append(", uri=");
            sbLIZ3.append(C897780ZJw.LIZIZ(this.LLILLJJLI, true));
            C2188811AlT.LIZIZ(sbLIZ3);
            C897770ZJv.LIZIZ();
            this.LLILLL.LJFF(2, this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMAvatarResManager@fa0.checkOuterAvatar$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
