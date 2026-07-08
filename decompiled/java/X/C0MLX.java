package X;

import Y.AfS7S0600000_8;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MLX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$calculateSingleImageBackgroundColorV2$1", f = "Forward2StoryEnvironment.kt", l = {407}, m = "invokeSuspend")
public final class C0MLX extends C09AX implements Function2<C094D<? super C0MKH>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ C0MMG LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ ForwardMedia LLILZLL;
    public final /* synthetic */ C0MMK LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MLX(Context context, CreativeInfo creativeInfo, C0MMK c0mmk, ForwardMedia forwardMedia, C0MMG c0mmg, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creativeInfo;
        this.LLILZ = c0mmg;
        this.LLILZIL = context;
        this.LLILZLL = forwardMedia;
        this.LLIZ = c0mmk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        CreativeInfo creativeInfo = this.LLILLL;
        C0MMG c0mmg = this.LLILZ;
        C0MLX c0mlx = new C0MLX(this.LLILZIL, creativeInfo, this.LLIZ, this.LLILZLL, c0mmg, interfaceC1364105Vn);
        c0mlx.LLILLJJLI = obj;
        return c0mlx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C11O8 c11o8LIZJ;
        C1C7U.LIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColorV2$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            if (C433810Gzj.LIZ()) {
                c11o8LIZJ = C11NZ.LJJJJI(new CallableC567830MOv(new C567820MOu(this.LLILLL, true), this.LLILZ.LIZ, null, null)).LJJJLZIJ(C11S5.LIZ());
            } else {
                c11o8LIZJ = C0MP1.LIZJ(new C0MP1(this.LLILLL, new C0MOJ(false, false, 3)), this.LLILZ.LIZ);
            }
            C11O8 c11o8LJJJLZIJ = c11o8LIZJ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
            Context context = this.LLILZIL;
            C0MMG c0mmg = this.LLILZ;
            c11o8LJJJLZIJ.LJJLL(new AfS7S0600000_8(context, this.LLILLL, this.LLIZ, this.LLILZLL, c0mmg, c094d, 1), new C09JN() { // from class: X.0MLZ
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColorV2$1$2");
                    C0MM5.LIZIZ.LJ();
                    C1C7U.LIZIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColorV2$1$2");
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(13);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColorV2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColorV2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C0MKH> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
