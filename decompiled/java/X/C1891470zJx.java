package X;

import Y.ARunnableS12S1100000_7;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteTraffic;
import com.ss.android.ugc.aweme.commercialize.promote.model.OptimizationData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.promote.preload.PromoteTimer$show$job$1", f = "PromoteTimer.kt", l = {38}, m = "invokeSuspend")
public final class C1891470zJx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891470zJx(Aweme aweme, String str, Integer num, String str2, InterfaceC1364105Vn<? super C1891470zJx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = num;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891470zJx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, X.0q70] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, X.0q70] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.bytedance.hybrid.spark.SparkContext] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, X.0q70, com.bytedance.hybrid.spark.SparkContext] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PromoteTraffic traffic;
        Long delayTime;
        String itemId;
        C1C7U.LIZ("PromoteTimer@be76.show$job$1");
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
            PromoteModel promoteModel = this.LLILLJJLI.getPromoteModel();
            if (promoteModel != null && (traffic = promoteModel.getTraffic()) != null && (delayTime = traffic.getDelayTime()) != null) {
                long jLongValue = delayTime.longValue();
                String str = C1389805cG.LIZ;
                System.currentTimeMillis();
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("PromoteTimer@be76.show$job$1");
                    return objLJFF;
                }
            }
        }
        if (Intrinsics.LJFF(C1389805cG.LIZ, this.LLILLL)) {
            if (C13LP.LJJJJ(this.LLILZ, C1866620yfs.LIZ)) {
                C1891520zK2.LIZ.getClass();
                C1891520zK2.LIZIZ(false);
                String str2 = this.LLILLL;
                String str3 = this.LLILZIL;
                C259800zU c259800zU = new C259800zU();
                C1529880puk c1529880puk = SparkContext.Companion;
                String str4 = C1891520zK2.LIZIZ;
                c1529880puk.getClass();
                ?? LIZIZ = C1529880puk.LIZIZ(str4);
                c259800zU.element = LIZIZ;
                if (LIZIZ != 0) {
                    OptimizationData optimizationData = (OptimizationData) LIZIZ.LJFF(OptimizationData.class);
                    if (str2 != null) {
                        if (optimizationData != null) {
                            itemId = optimizationData.getItemId();
                        } else {
                            itemId = null;
                        }
                        if (!str2.equals(itemId) || optimizationData == null || !Intrinsics.LJFF(optimizationData.getPreload(), Boolean.TRUE)) {
                        }
                    }
                } else {
                    ?? sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(str3);
                    sparkContext.LJJJJZI(new C1554500qYS(5));
                    c259800zU.element = sparkContext;
                    C1891520zK2.LIZIZ = sparkContext.containerId;
                }
                Boolean bool = Boolean.TRUE;
                ((C1537480q70) c259800zU.element).LJJ(OptimizationData.class, new OptimizationData(str2, bool, bool));
                if (Looper.myLooper() == null) {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS12S1100000_7(c259800zU, str3, 17));
                } else {
                    C1537060q6K.LJIIJJI(C1529590puH.LIZ, str3, "tiktok_promote_spark_biz", (C1537480q70) c259800zU.element, null, true, null, 40);
                }
            } else {
                C1891520zK2.LIZ.getClass();
                C1891520zK2.LIZIZ(true);
                String str5 = this.LLILLL;
                String str6 = this.LLILZIL;
                C259800zU c259800zU2 = new C259800zU();
                C1529880puk c1529880puk2 = SparkContext.Companion;
                String str7 = C1891520zK2.LIZIZ;
                c1529880puk2.getClass();
                ?? LIZIZ2 = C1529880puk.LIZIZ(str7);
                c259800zU2.element = LIZIZ2;
                if (LIZIZ2 != 0) {
                    OptimizationData optimizationData2 = (OptimizationData) LIZIZ2.LJFF(OptimizationData.class);
                    if (optimizationData2 == null || !Intrinsics.LJFF(optimizationData2.getPreCreate(), Boolean.TRUE)) {
                    }
                } else {
                    ?? sparkContext2 = new SparkContext();
                    sparkContext2.LJJLIIJ(str6);
                    sparkContext2.LJJJJZI(new C1151920g58(5));
                    c259800zU2.element = sparkContext2;
                    ((C1537480q70) c259800zU2.element).LJJ(OptimizationData.class, new OptimizationData(str5, Boolean.FALSE, Boolean.TRUE));
                    C1891520zK2.LIZIZ = ((C1537480q70) c259800zU2.element).containerId;
                }
                if (Looper.myLooper() == null) {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS12S1100000_7(c259800zU2, str6, 16));
                } else {
                    C1537060q6K.LJIIJJI(C1529590puH.LIZ, str6, "tiktok_promote_spark_biz", (C1537480q70) c259800zU2.element, null, true, null, 40);
                }
            }
        }
        C1389805cG.LIZIZ.remove(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PromoteTimer@be76.show$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
