package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler$handleGifClick$3$1", f = "GifCardProtocol.kt", l = {711}, m = "invokeSuspend")
public final class C05QY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GifContent LLILLJJLI;
    public final /* synthetic */ DefaultGifClickHandler LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05QY(View view, C869590Y9l c869590Y9l, GifContent gifContent, DefaultGifClickHandler defaultGifClickHandler, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = gifContent;
        this.LLILLL = defaultGifClickHandler;
        this.LLILZ = view;
        this.LLILZIL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QY(this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GifContent gifContent;
        C1C7U.LIZ("DefaultGifClickHandler@f6b6.handleGifClick$3$1");
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
            try {
                gifContent = (GifContent) C051M.LIZIZ(GifContent.class, C051M.LJ(this.LLILLJJLI, false));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                gifContent = null;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C15593068p c15593068p = new C15593068p(this.LLILZ, this.LLILZIL, gifContent, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c15593068p) == objLJFF) {
                C1C7U.LIZIZ("DefaultGifClickHandler@f6b6.handleGifClick$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultGifClickHandler@f6b6.handleGifClick$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
