package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CXY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.entrances.SocialAvatarDMStickersPopTask$deleteAvatar$1$1", f = "SocialAvatarDMStickersPopTask.kt", l = {}, m = "invokeSuspend")
public final class C0CXY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0HXY LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CXY(C0HXY c0hxy, boolean z, InterfaceC1364105Vn<? super C0CXY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0hxy;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CXY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarDMStickersPopTask@fba8.deleteAvatar$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.LJIIJ((DialogC1389620mGW) this.LL.LLIZ.getValue());
        if (!this.LLILLJJLI) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LL.LL);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarDMStickersPopTask@fba8.deleteAvatar$1$1");
        return unit;
    }
}
