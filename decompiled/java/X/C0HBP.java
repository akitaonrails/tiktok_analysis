package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarPageAssem$setImmersiveBackground$3$1", f = "SocialAvatarPageAssem.kt", l = {}, m = "invokeSuspend")
public final class C0HBP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SmartImageView LLILLJJLI;
    public final /* synthetic */ C0HFS LLILLL;
    public final /* synthetic */ SmartImageView LLILZ;
    public final /* synthetic */ SocialAvatarPageAssem LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HBP(String str, SmartImageView smartImageView, C0HFS c0hfs, SmartImageView smartImageView2, SocialAvatarPageAssem socialAvatarPageAssem, InterfaceC1364105Vn<? super C0HBP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = smartImageView;
        this.LLILLL = c0hfs;
        this.LLILZ = smartImageView2;
        this.LLILZIL = socialAvatarPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HBP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarPageAssem@259e.setImmersiveBackground$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LL);
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        final SmartImageView smartImageView = this.LLILLJJLI;
        final C0HFS c0hfs = this.LLILLL;
        final SmartImageView smartImageView2 = this.LLILZ;
        final SocialAvatarPageAssem socialAvatarPageAssem = this.LLILZIL;
        c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0HBQ
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                C786410Ut5.u5(smartImageView, c0hfs.LIZJ.LIZLLL);
                C786410Ut5.LLFF(0, smartImageView);
                C786410Ut5.LLFF(8, smartImageView2);
                ((View) socialAvatarPageAssem.LLJJIJIIJIL.getValue()).animate().alpha(1.0f).setDuration(50L).start();
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarPageAssem@259e.setImmersiveBackground$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
