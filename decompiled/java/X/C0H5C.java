package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarSocialAvatarHelper$generateButtonByGeckoResources$1", f = "EnlargeAvatarSocialAvatarHelper.kt", l = {489}, m = "invokeSuspend")
public final class C0H5C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C442840HYc LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ RemoteImageView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H5C(C442840HYc c442840HYc, String str, RemoteImageView remoteImageView, InterfaceC1364105Vn<? super C0H5C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c442840HYc;
        this.LLILLL = str;
        this.LLILZ = remoteImageView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H5C(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnlargeAvatarSocialAvatarHelper@38b.generateButtonByGeckoResources$1");
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
            ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) this.LLILLJJLI.LJIIJ.getValue();
            String str = this.LLILLL;
            this.LL = 1;
            obj = iSocialAvatarService.LIZJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.generateButtonByGeckoResources$1");
                return objLJFF;
            }
        }
        C442840HYc c442840HYc = this.LLILLJJLI;
        Uri uri = UriProtector.parse((String) obj);
        RemoteImageView remoteImageView = this.LLILZ;
        c442840HYc.getClass();
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uri);
        c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJI.LJJI(remoteImageView);
        c1331670kl3LJI.LJIIJ(new C463030IDt(3));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.generateButtonByGeckoResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
