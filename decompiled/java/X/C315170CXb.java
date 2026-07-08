package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.entrances.SocialAvatarAISelfCompatibilityPopTask$buildDeleteActionSheet$1$1$1", f = "SocialAvatarAISelfCompatibilityPopTask.kt", l = {}, m = "invokeSuspend")
public final class C315170CXb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C342720Dc6 LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315170CXb(C342720Dc6 c342720Dc6, boolean z, InterfaceC1364105Vn<? super C315170CXb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c342720Dc6;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315170CXb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarAISelfCompatibilityPopTask@5454.buildDeleteActionSheet$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.LJIIJ((DialogC1389620mGW) this.LL.LLIZLLLIL.getValue());
        if (this.LLILLJJLI) {
            this.LL.LLILZIL.invoke();
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LL.LL);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarAISelfCompatibilityPopTask@5454.buildDeleteActionSheet$1$1$1");
        return unit;
    }
}
