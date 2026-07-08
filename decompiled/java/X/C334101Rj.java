package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarGeckoResourceUtil$preloadGeckoResource$1$1$1", f = "SocialAvatarGeckoResourceUtil.kt", l = {}, m = "invokeSuspend")
public final class C334101Rj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, File, String, Unit> LL;
    public final /* synthetic */ C259800zU<File> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C334101Rj(InterfaceC1631620sYq<? super Boolean, ? super File, ? super String, Unit> interfaceC1631620sYq, C259800zU<File> c259800zU, InterfaceC1364105Vn<? super C334101Rj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C334101Rj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarGeckoResourceUtil@a43d.preloadGeckoResource$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1631620sYq<Boolean, File, String, Unit> interfaceC1631620sYq = this.LL;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(true, this.LLILLJJLI.element, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarGeckoResourceUtil@a43d.preloadGeckoResource$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
