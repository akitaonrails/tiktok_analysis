package X;

import android.net.Uri;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfoModel4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget$addShortCutWithLottie$1$1", f = "ActivityTreasureBoxWidget.kt", l = {426, 440}, m = "invokeSuspend")
public final class C1104460eqa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CountDownLatch LLILZIL;
    public final /* synthetic */ C1295960jpS LLILZLL;
    public final /* synthetic */ CountDownLatch LLIZ;
    public final /* synthetic */ ActivityTreasureBoxWidget LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ Uri LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104460eqa(String str, String str2, CountDownLatch countDownLatch, C1295960jpS c1295960jpS, CountDownLatch countDownLatch2, ActivityTreasureBoxWidget activityTreasureBoxWidget, String str3, Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> entry, boolean z, Uri uri, InterfaceC1364105Vn<? super C1104460eqa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = countDownLatch;
        this.LLILZLL = c1295960jpS;
        this.LLIZ = countDownLatch2;
        this.LLIZLLLIL = activityTreasureBoxWidget;
        this.LLJ = str3;
        this.LLJI = entry;
        this.LLJIJIL = z;
        this.LLJILJIL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1104460eqa c1104460eqa = new C1104460eqa(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c1104460eqa.LLILLJJLI = obj;
        return c1104460eqa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        boolean z;
        boolean z2;
        File fileHX;
        File fileHX2;
        C1C7U.LIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1$1");
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
                    String str = this.LLILLL;
                    final CountDownLatch countDownLatch = this.LLILZIL;
                    iHostResource2.nd1(new AbstractC1552040qUU() { // from class: X.0eqe
                        @Override // X.AbstractC1552040qUU
                        public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                            countDownLatch.countDown();
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIL(long j, UpdatePackage updatePackage) {
                            countDownLatch.countDown();
                        }
                    }, str);
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
                String str2 = this.LLILLL;
                String str3 = this.LLILZ;
                final ActivityTreasureBoxWidget activityTreasureBoxWidget = this.LLIZLLLIL;
                final CountDownLatch countDownLatch2 = this.LLIZ;
                C1143680frq.LJIILL(c1295960jpS, str2, str3, false, new InterfaceC1143790fs1() { // from class: X.0eqc
                    @Override // X.InterfaceC1143790fs1
                    public final void onFinish(boolean z3) {
                        C1295960jpS c1295960jpS2 = c1295960jpS;
                        ActivityTreasureBoxWidget activityTreasureBoxWidget2 = activityTreasureBoxWidget;
                        long j = jCurrentTimeMillis;
                        activityTreasureBoxWidget2.LLILZLL.put(Integer.valueOf(c1295960jpS2.hashCode()), Boolean.valueOf(z3));
                        activityTreasureBoxWidget2.LLILZIL.put(Integer.valueOf(c1295960jpS2.hashCode()), Long.valueOf(System.currentTimeMillis() - j));
                        activityTreasureBoxWidget.LLILZ = z3;
                        countDownLatch2.countDown();
                    }
                });
                this.LLIZ.await(3000L, TimeUnit.MILLISECONDS);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1104440eqY c1104440eqY = new C1104440eqY(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLILZLL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c1104440eqY) == objLJFF) {
                    C1C7U.LIZIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1$1");
                    return objLJFF;
                }
            } else {
                C1DFH c1dfh2 = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                C1104470eqb c1104470eqb = new C1104470eqb(this.LLJILJIL, this.LLIZLLLIL, this.LLJI, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq2, c1104470eqb) == objLJFF) {
                    C1C7U.LIZIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
