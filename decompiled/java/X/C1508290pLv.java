package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS87S1000000_2;
import njp.a;

/* JADX INFO: renamed from: X.0pLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloader$preloadInner$job$1", f = "ECSparkPreloader.kt", l = {313}, m = "invokeSuspend")
public final class C1508290pLv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ECSparkPreloadInfo LLILLJJLI;
    public final /* synthetic */ C1523780pku LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ ECSparkPreloadConfigItem LLILZIL;
    public final /* synthetic */ C238400w2 LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ SparkContext LLJ;
    public final /* synthetic */ C1523810pkx LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508290pLv(ECSparkPreloadInfo eCSparkPreloadInfo, C1523780pku c1523780pku, String str, ECSparkPreloadConfigItem eCSparkPreloadConfigItem, C238400w2 c238400w2, String str2, String str3, SparkContext sparkContext, C1523810pkx c1523810pkx, InterfaceC1364105Vn<? super C1508290pLv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = eCSparkPreloadInfo;
        this.LLILLL = c1523780pku;
        this.LLILZ = str;
        this.LLILZIL = eCSparkPreloadConfigItem;
        this.LLILZLL = c238400w2;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = sparkContext;
        this.LLJI = c1523810pkx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1508290pLv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECSparkPreloader@6865.preloadInner$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.delayMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ECSparkPreloader@6865.preloadInner$job$1");
                return objLJFF;
            }
        }
        C1523770pkt c1523770pkt = C1523770pkt.LIZ;
        C1523780pku c1523780pku = this.LLILLL;
        String str = this.LLILZ;
        int i3 = this.LLILZIL.preloadType;
        c1523770pkt.getClass();
        c1523770pkt.getClass();
        C1523770pkt.LIZJ(c1523780pku, str, i3, "start", 0L);
        String str2 = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("_preload");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        final C1508970pN1 c1508970pN1 = new C1508970pN1(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLILZ);
        new AwS87S1000000_2(strLIZIZ, 11);
        ((Boolean) C1523770pkt.LJI.getValue()).booleanValue();
        InterfaceC1508110pLd interfaceC1508110pLd = new InterfaceC1508110pLd() { // from class: X.0pLu
            @Override // X.InterfaceC1508110pLd
            public final InterfaceC1508150pLh LIZ(C1508120pLe c1508120pLe) {
                try {
                    C1523770pkt c1523770pkt2 = C1523770pkt.LIZ;
                    new AwS87S1000000_2(strLIZIZ, 12);
                    c1523770pkt2.getClass();
                    ((Boolean) C1523770pkt.LJI.getValue()).booleanValue();
                    c1508970pN1.invoke();
                    c1508120pLe.onSuccess();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c1508120pLe.LIZ(message);
                }
                return C1508270pLt.LIZ;
            }
        };
        if (!C08L8.LIZ()) {
            i2 = 2;
        }
        C1507990pLR c1507990pLR = new C1507990pLR("spark_preload_task", strLIZIZ, "view", 2, 0, interfaceC1508110pLd, null, Integer.valueOf(i2), null, null, null, null, null, 7184);
        C1507890pLH c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ();
        if (c1507890pLHLIZ != null) {
            c1507890pLHLIZ.LIZIZ(c1507990pLR);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECSparkPreloader@6865.preloadInner$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
