package X;

import android.graphics.drawable.GradientDrawable;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$bindBackgroundImage$1$1", f = "SocialAvatarServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0HBE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0HFS LL;
    public final /* synthetic */ SmartImageView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HBE(C0HFS c0hfs, SmartImageView smartImageView, InterfaceC1364105Vn<? super C0HBE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0hfs;
        this.LLILLJJLI = smartImageView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HBE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.bindBackgroundImage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZLLL.LIZIZ.size() >= 2) {
            SmartImageView smartImageView = this.LLILLJJLI;
            GradientDrawable gradientDrawable = new GradientDrawable();
            C0HFS c0hfs = this.LL;
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setShape(1);
            gradientDrawable.setColors(C13LP.LLII(c0hfs.LIZLLL.LIZIZ));
            smartImageView.setBackground(gradientDrawable);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.bindBackgroundImage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
