package X;

import android.content.MutableContextWrapper;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dGJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.lynx.spark.SparkPreload$deferred$1", f = "SparkPreload.kt", l = {57}, m = "invokeSuspend")
public final class C1043530dGJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB>, Object> {
    public int LL;
    public final /* synthetic */ SparkContext LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043530dGJ(SparkContext sparkContext, InterfaceC1364105Vn<? super C1043530dGJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sparkContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1043530dGJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SparkPreload@8808.deferred$1");
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
            this.LL = 1;
            if (C1056170dah.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("SparkPreload@8808.deferred$1");
                return objLJFF;
            }
        }
        SparkContext sparkContext = this.LLILLJJLI;
        sparkContext.usePreload = true;
        sparkContext.LJJJZ("enable_pending_js_task", "1");
        sparkContext.LJJLIIIJ("1", "usePreload");
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(C1161970gLL.LIZIZ().LIZJ());
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext2 = this.LLILLJJLI;
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(mutableContextWrapper, sparkContext2).LIZ(false);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        C1C7U.LIZIZ("SparkPreload@8808.deferred$1");
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
