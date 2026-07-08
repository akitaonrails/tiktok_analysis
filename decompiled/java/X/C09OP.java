package X;

import android.net.Uri;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addShortCutWithLottie$1", f = "RedEnvelopeWidget.kt", l = {344}, m = "invokeSuspend")
public final class C09OP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ CountDownLatch LLILZ;
    public final /* synthetic */ C1295960jpS LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ CountDownLatch LLIZ;
    public final /* synthetic */ RedEnvelopeWidget LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ Uri LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OP(String str, String str2, CountDownLatch countDownLatch, C1295960jpS c1295960jpS, C013C c013c, CountDownLatch countDownLatch2, RedEnvelopeWidget redEnvelopeWidget, String str3, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, Uri uri, InterfaceC1364105Vn<? super C09OP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = countDownLatch;
        this.LLILZIL = c1295960jpS;
        this.LLILZLL = c013c;
        this.LLIZ = countDownLatch2;
        this.LLIZLLLIL = redEnvelopeWidget;
        this.LLJ = str3;
        this.LLJI = redEnvelopeInfoModel4FE;
        this.LLJIJIL = z;
        this.LLJILJIL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C09OQ c09oq = new C09OQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c09oq) == objLJFF) {
                C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
