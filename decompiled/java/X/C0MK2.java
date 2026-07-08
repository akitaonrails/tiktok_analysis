package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MK2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$createVideoCanvasPrepareTaskFlow$1", f = "Forward2StoryEnvironment.kt", l = {}, m = "invokeSuspend")
public final class C0MK2 extends C09AX implements Function2<C0MMG, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends C0MMG>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ForwardMedia LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MK2(ForwardMedia forwardMedia, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C0MK2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = forwardMedia;
        this.LLILLL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MK2 c0mk2 = new C0MK2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0mk2.LL = obj;
        return c0mk2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Forward2StoryEnvironment@d506.createVideoCanvasPrepareTaskFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MMG c0mmg = (C0MMG) this.LL;
        C0MM5 c0mm5 = C0MM5.LIZ;
        ForwardMedia forwardMedia = this.LLILLJJLI;
        CreativeInfo creativeInfo = this.LLILLL;
        c0mm5.getClass();
        C0MM5.LJ("calculateBackgroundColor start");
        C138P c138p = C0MM5.LIZIZ.LIZJ;
        if (!c138p.LIZIZ) {
            C0MMB.LIZ(c138p);
        }
        C095D c095d = new C095D(new C567070MLx(forwardMedia, c0mmg, creativeInfo, null));
        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.createVideoCanvasPrepareTaskFlow$1");
        return c095d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0MMG c0mmg, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends C0MMG>> interfaceC1364105Vn) {
        return ((a) create(c0mmg, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
