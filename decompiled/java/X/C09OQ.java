package X;

import android.net.Uri;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addShortCutWithLottie$1$1", f = "RedEnvelopeWidget.kt", l = {390, 407}, m = "invokeSuspend")
public final class C09OQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CountDownLatch LLILZIL;
    public final /* synthetic */ C1295960jpS LLILZLL;
    public final /* synthetic */ C013C LLIZ;
    public final /* synthetic */ CountDownLatch LLIZLLLIL;
    public final /* synthetic */ RedEnvelopeWidget LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ Uri LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OQ(String str, String str2, CountDownLatch countDownLatch, C1295960jpS c1295960jpS, C013C c013c, CountDownLatch countDownLatch2, RedEnvelopeWidget redEnvelopeWidget, String str3, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, Uri uri, InterfaceC1364105Vn<? super C09OQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = countDownLatch;
        this.LLILZLL = c1295960jpS;
        this.LLIZ = c013c;
        this.LLIZLLLIL = countDownLatch2;
        this.LLJ = redEnvelopeWidget;
        this.LLJI = str3;
        this.LLJIJIL = redEnvelopeInfoModel4FE;
        this.LLJILJIL = z;
        this.LLJILJILJ = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09OQ c09oq = new C09OQ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c09oq.LLILLJJLI = obj;
        return c09oq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        File fileHX;
        File fileHX2;
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            if (iHostResource != null && (fileHX2 = iHostResource.HX(this.LLILLL, this.LLILZ)) != null && fileHX2.exists()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                IHostResource iHostResource2 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                if (iHostResource2 != null) {
                    iHostResource2.nd1(new C2499709qt(this.LLILZIL, 0), this.LLILLL);
                }
            } else {
                this.LLILZIL.countDown();
            }
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(this.LLILZIL.await(3000L, TimeUnit.MILLISECONDS)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            IHostResource iHostResource3 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            if (iHostResource3 != null && (fileHX = iHostResource3.HX(this.LLILLL, this.LLILZ)) != null && fileHX.exists()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final C1295960jpS c1295960jpS = this.LLILZLL;
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                final C013C c013c = this.LLIZ;
                final CountDownLatch countDownLatch = this.LLIZLLLIL;
                final RedEnvelopeWidget redEnvelopeWidget = this.LLJ;
                C1143680frq.LJIILL(c1295960jpS, str, str2, false, new InterfaceC1143790fs1() { // from class: X.09OS
                    @Override // X.InterfaceC1143790fs1
                    public final void onFinish(boolean z3) {
                        C1295960jpS c1295960jpS2 = c1295960jpS;
                        RedEnvelopeWidget redEnvelopeWidget2 = redEnvelopeWidget;
                        long j = jCurrentTimeMillis;
                        redEnvelopeWidget2.LLJILJIL.put(Integer.valueOf(c1295960jpS2.hashCode()), Boolean.valueOf(z3));
                        redEnvelopeWidget2.LLJIJIL.put(Integer.valueOf(c1295960jpS2.hashCode()), Long.valueOf(System.currentTimeMillis() - j));
                        c013c.element = z3;
                        countDownLatch.countDown();
                    }
                });
                try {
                    C189200o6.m2constructorimpl(Boolean.valueOf(this.LLIZLLLIL.await(3000L, TimeUnit.MILLISECONDS)));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C09OR c09or = new C09OR(this.LLJ, this.LLIZ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLILZLL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c09or) == objLJFF) {
                    C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1$1");
                    return objLJFF;
                }
            } else {
                C1DFH c1dfh2 = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                C09OO c09oo = new C09OO(this.LLJ, this.LLJILJILJ, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq2, c09oo) == objLJFF) {
                    C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithLottie$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
