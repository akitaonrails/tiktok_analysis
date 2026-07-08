package X;

import Y.AfS7S0600000_8;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$calculateSingleImageBackgroundColor$1", f = "Forward2StoryEnvironment.kt", l = {963}, m = "invokeSuspend")
public final class C566840MLa extends C09AX implements Function2<C094D<? super C0MKE>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ C0MMG LLILZ;
    public final /* synthetic */ ForwardMedia LLILZIL;
    public final /* synthetic */ C0MMK LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566840MLa(Context context, CreativeInfo creativeInfo, C0MMK c0mmk, ForwardMedia forwardMedia, C0MMG c0mmg, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creativeInfo;
        this.LLILZ = c0mmg;
        this.LLILZIL = forwardMedia;
        this.LLILZLL = c0mmk;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        CreativeInfo creativeInfo = this.LLILLL;
        C0MMG c0mmg = this.LLILZ;
        ForwardMedia forwardMedia = this.LLILZIL;
        C566840MLa c566840MLa = new C566840MLa(this.LLIZ, creativeInfo, this.LLILZLL, forwardMedia, c0mmg, interfaceC1364105Vn);
        c566840MLa.LLILLJJLI = obj;
        return c566840MLa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C11O8 c11o8LIZJ;
        C1C7U.LIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColor$1");
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
            CreativeInfo creativeInfo = this.LLILLL;
            ForwardMedia forwardMedia = this.LLILZIL;
            c11o8LJJJLZIJ.LJJLL(new AfS7S0600000_8(this.LLIZ, creativeInfo, this.LLILZLL, forwardMedia, this.LLILZ, c094d, 0), new C09JN() { // from class: X.0MLb
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColor$1$2");
                    C0MM5.LIZIZ.LJ();
                    C1C7U.LIZIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColor$1$2");
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(12);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColor$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.calculateSingleImageBackgroundColor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C0MKE> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
