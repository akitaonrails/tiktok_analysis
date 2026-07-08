package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController$prepareWithLoading$1$2", f = "VideoImageMixedController.kt", l = {}, m = "invokeSuspend")
public final class C504001xm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoImageMixedController LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504001xm(VideoImageMixedController videoImageMixedController, Function0<Unit> function0, InterfaceC1364105Vn<? super C504001xm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoImageMixedController;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C504001xm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        C1C7U.LIZ("VideoImageMixedController@1fe.prepareWithLoading$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C528030KnJ c528030KnJ = this.LL.LLJJJJJIL;
        if (c528030KnJ != null && (context = c528030KnJ.getContext()) != null && C1388190mED.LIZ(context) != null) {
            this.LL.LJJJJI();
        }
        this.LLILLJJLI.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoImageMixedController@1fe.prepareWithLoading$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
