package X;

import android.app.Activity;
import com.bytedance.poplayer.core.PopupManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HZG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.entrances.SocialAvatarProfileFloatingNoticeUtil$showFloatingNotice$1$1$1", f = "SocialAvatarProfileFloatingNoticeUtil.kt", l = {}, m = "invokeSuspend")
public final class C0HZG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC20660715sz LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C1257230ioz LLILLL;
    public final /* synthetic */ C364901bL LLILZ;
    public final /* synthetic */ C0HZD LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HZG(InterfaceC20660715sz interfaceC20660715sz, Activity activity, C1257230ioz c1257230ioz, C364901bL c364901bL, C0HZD c0hzd, InterfaceC1364105Vn<? super C0HZG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC20660715sz;
        this.LLILLJJLI = activity;
        this.LLILLL = c1257230ioz;
        this.LLILZ = c364901bL;
        this.LLILZIL = c0hzd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HZG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarProfileFloatingNoticeUtil@ac82.showFloatingNotice$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PopupManager.LJIJI(new C1245250iVf(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL), true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarProfileFloatingNoticeUtil@ac82.showFloatingNotice$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
